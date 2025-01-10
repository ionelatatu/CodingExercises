package exercices;

import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int elem: nums) {
            if(numbers.contains(elem)) {
                return true;
            }
            numbers.add(elem);
        }
        return false;
    }
}
