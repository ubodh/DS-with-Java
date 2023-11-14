package Tries;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }
}

public class SuffixTrie {
	
	 TrieNode root;

	    public SuffixTrie() {
	        root = new TrieNode();
	    }

	    public void insert(String word) {
	        for (int i = 0; i < word.length(); i++) {
	            insertHelper(word.substring(i));
	        }
	    }

	    private void insertHelper(String word) {
	        TrieNode current = root;
	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            TrieNode node = current.children.get(c);
	            if (node == null) {
	                node = new TrieNode();
	                current.children.put(c, node);
	            }
	            current = node;
	        }
	        current.isWord = true;
	    }

	    public boolean contains(String word) {
	        TrieNode current = root;
	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            TrieNode node = current.children.get(c);
	            if (node == null) {
	                return false;
	            }
	            current = node;
	        }
	        return current.isWord;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
