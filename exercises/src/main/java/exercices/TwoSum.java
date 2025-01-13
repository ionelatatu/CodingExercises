package exercices;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //create a map with number - position
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {

            //calculate the difference between the target and current number
            int diff = target-nums[i];

            //if map contains the difference return an array with the positions
            if(numsMap.get(diff) != null) {
                return new int[]{numsMap.get(diff), i};
            }

            //add the current element and its position to the map
            numsMap.put(nums[i], i);
        }
        return null;
    }
}
