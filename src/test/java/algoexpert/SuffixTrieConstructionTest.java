package algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuffixTrieConstructionTest {
    @Test
    public void TestCase1() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("babc");
        Assertions.assertTrue(trie.contains("abc"));
    }

    @Test
    public void TestCase2() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("acdefgapbcxabcde");
        Assertions.assertTrue(trie.contains("abc"));
    }

    @Test
    public void TestCase3() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("acdefgapbcxabcde");
        Assertions.assertTrue(trie.contains("acdefga"));
    }

    @Test
    public void TestCase4() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("acdefgap bcxabcde");
        Assertions.assertTrue(trie.contains(" "));
    }

    @Test
    public void TestCase5() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("test");
        Assertions.assertFalse(trie.contains("tes"));
    }

    @Test
    public void TestCase6() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("1234556789");
        Assertions.assertFalse(trie.contains("456789"));
    }

    @Test
    public void TestCase7() {
        SuffixTrieConstruction.SuffixTrie trie = new SuffixTrieConstruction.SuffixTrie("testtest");
        Assertions.assertFalse(trie.contains("sttest"));
    }
}
