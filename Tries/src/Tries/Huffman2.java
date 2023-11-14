package Tries;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

class HuffmanNode {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

public class Huffman2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = scan.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<HuffmanNode>(new MyComparator());
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                HuffmanNode node = new HuffmanNode();
                node.c = (char) i;
                node.data = freq[i];
                node.left = null;
                node.right = null;
                pq.add(node);
            }
        }

        while (pq.size() > 1) {
            HuffmanNode x = pq.peek();
            pq.poll();

            HuffmanNode y = pq.peek();
            pq.poll();

            HuffmanNode z = new HuffmanNode();
            z.data = x.data + y.data;
            z.c = '-';
            z.left = x;
            z.right = y;
            pq.add(z);
        }

        HuffmanNode root = pq.peek();

        System.out.println("Huffman Codes are : ");
        printCodes(root, "");
    }

    public static void printCodes(HuffmanNode root, String code) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + code);
            return;
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }
}
