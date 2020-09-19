package algoexpert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiStringSearch {
    static TrieNode root = new TrieNode();
    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
        // Write your code here.
        TrieNode root = constructStringTrie(bigString);
        List<Boolean> result = new ArrayList<>();
        for ( int i = 0 ; i < smallStrings.length ; i++){
            result.add(search(root,smallStrings[i]));
        }

        return result;
    }

    private static Boolean search(TrieNode root, String smallString) {
        TrieNode temp = root;
        for( int i = 0 ; i < smallString.length() ; i++){
            if( !temp.children.containsKey(smallString.charAt(i))){
                return false;
            }
            temp = temp.children.get(smallString.charAt(i));
        }
        return true;
    }

    private static TrieNode constructStringTrie(String bigString) {
        TrieNode root = new TrieNode();
        for ( int i = 0 ; i < bigString.length() ; i++){
            Map<Character,TrieNode> children = root.children;
            if(!children.containsKey(bigString.charAt(i))){
                children.put(bigString.charAt(i),new TrieNode());
            }
            TrieNode temp = children.get(bigString.charAt(i));
            for(int j = i+1 ; j < bigString.length() ; j++){
                if (!temp.children.containsKey(bigString.charAt(j))){
                    temp.children.put(bigString.charAt(j),new TrieNode());
                }
                temp = temp.children.get(bigString.charAt(j));

            }
        }
        return root;
    }

    static class TrieNode{
        Map<Character,TrieNode> children = new HashMap<>();
    }
}
