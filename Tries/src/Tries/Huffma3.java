package Tries;

import java.util.*;

class Node implements Comparable<Node> {
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

    public int compareTo(Node other) {
        return freq - other.freq;
    }
}

public class Huffma3 {
    public static void main(String[] args) {
        String text = "hello world";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        Node root = buildHuffmanTree(freq);
        Map<Character, String> codes = getHuffmanCodes(root);
        String encoded = encode(text, codes);
        String decoded = decode(encoded, root);
        System.out.println("Original text: " + text);
        System.out.println("Encoded text: " + encoded);
        System.out.println("Decoded text: " + decoded);
    }

    static Node buildHuffmanTree(Map<Character, Integer> freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (char c : freq.keySet()) {
            pq.offer(new Node(c, freq.get(c), null, null));
        }
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node('\0', left.freq + right.freq, left, right);
            pq.offer(parent);
        }
        return pq.poll();
    }

    static Map<Character, String> getHuffmanCodes(Node root) {
        Map<Character, String> codes = new HashMap<>();
        getCode(root, "", codes);
        return codes;
    }

    static void getCode(Node node, String code, Map<Character, String> codes) {
        if (node.isLeaf()) {
            codes.put(node.ch, code);
        } else {
            getCode(node.left, code + "0", codes);
            getCode(node.right, code + "1", codes);
        }
    }

    static String encode(String text, Map<Character, String> codes) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append(codes.get(c));
        }
        return sb.toString();
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
