package org.com.ds.trie;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    private class TrieNode{

        private TrieNode[] children;
        private Boolean isWord;

        public TrieNode(){
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    public void insert(String word){

        word = word.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if(null == current.children[index]){
                TrieNode temp = new TrieNode();
                current.children[index] = temp;
                current = temp;
            }
            else{
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public static void main(String[] args) {

    }
}