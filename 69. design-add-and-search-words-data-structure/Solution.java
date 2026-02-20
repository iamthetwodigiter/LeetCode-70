class WordDictionary {
    private class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    private TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();    
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()) {
            int index = c-'a';
            if(curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchInNode(word, 0, root);
    }

    private boolean searchInNode(String word, int index, TrieNode node) {
        if(index == word.length()) return node.isEndOfWord;

        char c = word.charAt(index);
        if(c == '.') {
            for(int i=0; i<26; i++) {
                if(node.children[i] != null) {
                    if(searchInNode(word, index+1, node.children[i])) return true;
                }
            }
            return false;
        } else {
            int childIndex = c-'a';
            TrieNode child = node.children[childIndex];
            if(child == null) return false;
            return searchInNode(word, index+1, child);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */