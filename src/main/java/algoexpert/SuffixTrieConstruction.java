package algoexpert;

import java.util.HashMap;
import java.util.Map;

public class SuffixTrieConstruction {
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            // Write your code here.
            for ( int i = 0 ; i < str.length() ; i++){
                Character c = str.charAt(i);
                TrieNode tempNode = root;
                Map<Character, TrieNode> children = root.children;
                if ( !children.containsKey(c)){
                    children.put(c,new TrieNode());
                }
                for (int j = i+1 ; j < str.length() ; j++){
                    TrieNode ch = new TrieNode();
                    if( !tempNode.children.get(str.charAt(j-1)).children.containsKey(str.charAt(j)))
                        tempNode.children.get(str.charAt(j-1)).children.put(str.charAt(j),ch);
                    tempNode = tempNode.children.get(str.charAt(j-1));
                }
                tempNode.children.get(str.charAt(str.length()-1)).children.put(endSymbol,null);
            }
            //System.out.println();
        }

        public boolean contains(String str) {
            // Write your code here.
            TrieNode temp = root;
            for ( int i = 0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                if( !temp.children.containsKey(ch)){
                        return false;
                }else{
                    temp = temp.children.get(ch);
                }
            }
            return temp!= null && temp.children.containsKey('*');
        }
    }
}
