package Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }
}

public class PrefixTrie {
    TrieNode root;

    public PrefixTrie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            TrieNode child = node.children.get(c);
            if (child == null) {
                child = new TrieNode();
                node.children.put(c, child);
            }
            node = child;
        }
        node.isWord = true;
    }

    public boolean contains(String word) {
        TrieNode node = getNode(word);
        return node != null && node.isWord;
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

    public List<String> search(String prefix) {
        TrieNode node = getNode(prefix);
        List<String> words = new ArrayList<>();
        if (node == null) {
            return words;
        }
        collectWords(node, prefix, words);
        return words;
    }

    private void collectWords(TrieNode node, String prefix, List<String> words) {
    	
        if (node.isWord) {
            words.add(prefix);
        }
        for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
            char c = entry.getKey();
            TrieNode child = entry.getValue();
            collectWords(child, prefix + c, words);
        }
    }
    public static void main(String args[]) {
    	
    }
}
