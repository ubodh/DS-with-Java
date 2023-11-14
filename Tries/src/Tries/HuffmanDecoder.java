package Tries;
import java.util.*;

class Node {
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

public class HuffmanDecoder {
    public static void main(String[] args) {
        String encoded = "010101000111010001110100011100110111001001101011011100110111100100000011011000111010101110011011101000110111101110000011010010111001100100000011000100110100101101110011001110010000001100110011011110111001001110011011000010111010000100000011101000110111100100000011101000110100001100101001000000110111101100110001000000111100101101111011101010111001001110011001000000110001001110010011001010010000001110100011011110010000001110011011000010111001100101110001000000110000101110100011001010111001001110010011011110110111000100000011100100111001001110011011101000110010101110010011100110111001100101110";
        Node root = new Node('\0', 0, null, null);
        int i = 0;
        while (i < encoded.length()) {
            Node node = root;
            while (!node.isLeaf()) {
                char bit = encoded.charAt(i++);
                node = (bit == '0') ? node.left : node.right;
            }
            System.out.print(node.ch);
        }
        System.out.println();
    }
}
