package Tries;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman1 {

    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left, right;

        public Node(char ch, int freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        public boolean isLeaf() {
            return left == null && right == null;
        }

        @Override
        public int compareTo(Node other) {
            return freq - other.freq;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = sc.nextLine();

        int[] freq = new int[256];
        for (char c : input.toCharArray()) {
            freq[c]++;
        }

        Node root = buildHuffmanTree(freq);

        String[] codes = new String[256];
        buildCode(root, "", codes);

        System.out.println("Huffman codes:");
        for (int i = 0; i < codes.length; i++) {
            if (codes[i] != null) {
                System.out.println((char) i + ": " + codes[i]);
            }
        }

        String encoded = encode(input, codes);
        System.out.println("Encoded string: " + encoded);

        String decoded = decode(encoded, root);
        System.out.println("Decoded string: " + decoded);
    }

    private static Node buildHuffmanTree(int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                pq.offer(new Node((char) i, freq[i], null, null));
            }
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.offer(new Node('\0', left.freq + right.freq, left, right));
        }

        return pq.poll();
    }

    private static void buildCode(Node node, String code, String[] codes) {
        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            codes[node.ch] = code;
        }

        buildCode(node.left, code + "0", codes);
        buildCode(node.right, code + "1", codes);
    }

    private static String encode(String input, String[] codes) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(codes[c]);
        }
        return sb.toString();
    }

    private static String decode(String input, Node root) {
        StringBuilder sb = new StringBuilder();
        Node node = root;
        for (char c : input.toCharArray()) {
            if (c == '0') {
                node = node.left;
            } else {
                node = node.right;
            }

            if (node.isLeaf()) {
                sb.append(node.ch);
                node = root;
            }
        }
        return sb.toString();
    }
}
