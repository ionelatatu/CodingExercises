package exercices;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        //if strings have different lengths, than for sure they are not anagrams
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            //for each character in s we increase the counter of the letters
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            //if a value gets to zero we remove it from the map
            if(count.get(s.charAt(i)) == 0) {
                count.remove(s.charAt(i));
            }

            //for earch character in t we decrease the counter of the characters
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
            }
            //if the charachter is different and the value left is zero, we remove the key from the map
            if(s.charAt(i) != t.charAt(i) && count.get(t.charAt(i)) == 0) {
                count.remove(t.charAt(i));
            }
        }

        return count.values().isEmpty();
    }
}
