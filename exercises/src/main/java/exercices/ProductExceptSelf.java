package exercices;

/*
    Given an integer array nums, return an array output
    where output[i] is the product of all the elements of nums except nums[i].
    Each product is guaranteed to fit in a 32-bit integer.
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        output[0] = 1;
        for(int i = 1 ; i < nums.length; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * postfix;
            postfix = postfix * nums[i];
        }

        return output;
    }
}
