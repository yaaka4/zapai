package Leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var firstIndex = 0;
        var secondIndex = 0;
        var isDiscover = false;
        for (var n : nums) {
            for (secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
                if (n + nums[secondIndex] == target) {
                    isDiscover = true;
                    break;
                }
            }
            if (isDiscover) {
                break;
            }
            firstIndex++;
        }
        return new int[] {firstIndex, secondIndex};
    }
}
