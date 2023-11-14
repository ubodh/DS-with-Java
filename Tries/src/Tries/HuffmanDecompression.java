package Tries;
import java.util.*;

class Node{
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    boolean isLeaf() {
        return left == null && right == null;
    }
}

public class HuffmanDecompression {
    public static void main(String[] args) {
        String encoded = "010101110100011100100101011111110001";
        Node root = buildHuffmanTree();
        String decoded = decode(encoded, root);
        System.out.println("Encoded text: " + encoded);
        System.out.println("Decoded text: " + decoded);
    }

    static Node buildHuffmanTree() {
        Node root = new Node('\0', 0, null, null);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of characters:");
        int n = sc.nextInt();
        PriorityQueue<Node> pq = new PriorityQueue<>(n, Comparator.comparingInt(node -> node.freq));
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the character and its frequency:");
            char ch = sc.next().charAt(0);
            int freq = sc.nextInt();
            pq.offer(new Node(ch, freq, null, null));
        }
        sc.close();
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node('\0', left.freq + right.freq, left, right);
            pq.offer(parent);
        }
        root = pq.poll();
        return root;
    }

    static String decode(String code, Node root) {
        StringBuilder sb = new StringBuilder();
        Node node = root;
        for (char c : code.toCharArray()) {
            node = (c == '0') ? node.left : node.right;
            if (node.isLeaf()) {
                sb.append(node.ch);
                node = root;
            }
        }
        return sb.toString();
    }
}
