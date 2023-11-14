package Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;
    String word;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
        word = null;
    }
}

public class CompressedTrie {
	
	 TrieNode root;

	    public CompressedTrie() {
	        root = new TrieNode();
	    }

	    public void insert(String word) {
	        insertHelper(root, word);
	    }

	    private void insertHelper(TrieNode node, String word) {
	        if (word.isEmpty()) {
	            node.isWord = true;
	            node.word = word;
	            return;
	        }
	        char firstChar = word.charAt(0);
	        TrieNode child = node.children.get(firstChar);
	        if (child == null) {
	            child = new TrieNode();
	            node.children.put(firstChar, child);
	        }
	        insertHelper(child, word.substring(1));
	    }

	    public boolean contains(String word) {
	        TrieNode node = getNode(word);
	        return node != null && node.isWord;
	    }

	    public List<String> search(String prefix) {
	        TrieNode node = getNode(prefix);
	        List<String> words = new ArrayList<>();
	        if (node == null) {
	            return words;
	        }
	        if (node.isWord) {
	            words.add(node.word);
	        }
	        collectWords(node.children, words);
	        return words;
	    }

	    private TrieNode getNode(String word) {
	        TrieNode node = root;
	        for (char c : word.toCharArray()) {
	            node = node.children.get(c);
	            if (node == null) {
	                return null;
	            }
	        }
	        return node;
	    }

	    private void collectWords(Map<Character, TrieNode> children, List<String> words) {
	        for (Map.Entry<Character, TrieNode> entry : children.entrySet()) {
	            TrieNode child = entry.getValue();
	            if (child.isWord) {
	                words.add(child.word);
	            }
	            collectWords(child.children, words);
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
