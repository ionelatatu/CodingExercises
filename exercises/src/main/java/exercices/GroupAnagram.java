package exercices;

import java.util.*;

/*
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
Example: Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

 */

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        //define a map, the keys value will contain the frequency array of the characters in a word
        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            //calculate the frequency
            int[] freq = new int[26];
            for (char c: str.toCharArray()) {
                freq[c - 'a']++;
            }

            //add the value to the map on the right position
            String key = Arrays.toString(freq);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
