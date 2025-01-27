package exercices;

import java.util.HashSet;
import java.util.Set;

/*
    Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.
    A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.
    The elements do not have to be consecutive in the original array.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int maxLength = 1;
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        for(Integer val: numbers) {
            int previous = val - 1;
            if(!numbers.contains(previous)) {
                int length = 1;
                int next = val + 1;
                while (numbers.contains(next)) {
                    length++;
                    next++;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }
}
