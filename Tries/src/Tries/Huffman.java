package Tries;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Huffman {
    private static class Node {
        char ch;
        int freq;
        Node left;
        Node right;
        
        public Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
            left = null;
            right = null;
        }
    }
    
    private static class FrequencyComparator implements Comparator<Node> {
        @Override
        public int compare(Node node1, Node node2) {
            return node1.freq - node2.freq;
        }
    }
    
    public static Map<Character, String> encode(String input) {
        // Calculate frequency of each character in the input string
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Create a priority queue of nodes with each character and its frequency
        PriorityQueue<Node> pq = new PriorityQueue<>(new FrequencyComparator());
        for (char ch : freqMap.keySet()) {
            pq.add(new Node(ch, freqMap.get(ch)));
        }
        
        // Merge nodes with minimum frequency to build Huffman tree
        while (pq.size() > 1) {
            Node node1 = pq.poll();
            Node node2 = pq.poll();
            Node mergedNode = new Node('\0', node1.freq + node2.freq);
            mergedNode.left = node1;
            mergedNode.right = node2;
            pq.add(mergedNode);
        }
        
        // Build code table by traversing Huffman tree
        Node rootNode = pq.poll();
        Map<Character, String> codeTable = new HashMap<>();
        buildCodeTable(rootNode, "", codeTable);
        
        // Encode the input string using the code table
        Map<Character, String> encodedMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            encodedMap.put(ch, encodedMap.getOrDefault(ch, "") + codeTable.get(ch));
        }
        
        return encodedMap;
    }
    
    private static void buildCodeTable(Node node, String code, Map<Character, String> codeTable) {
        if (node == null) {
            return;
        }
        
        if (node.ch != '\0') {
            codeTable.put(node.ch, code);
            return;
        }
        
        buildCodeTable(node.left, code + "0", codeTable);
        buildCodeTable(node.right, code + "1", codeTable);
    }
    
    public static void main(String[] args) {
    	
    }
}
       
