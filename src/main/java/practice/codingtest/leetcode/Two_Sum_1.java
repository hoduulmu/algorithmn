package practice.codingtest.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {


    public static void main(String[] args) {
        int[] ans = new Two_Sum_1().twoSum(new int[]{3, 3}, 6);
        System.out.println("ans = " + Arrays.toString(ans));
    }
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])) {
                return new int[]{i, numsMap.get(target - nums[i])};
            }
        }

        return null;
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])) {
                return new int[]{i, numsMap.get(target - nums[i])};
            }
            numsMap.put(nums[i], i);
        }

        return null;
    }
}
