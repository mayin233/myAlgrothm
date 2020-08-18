package my.ch03.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 */
public class LeetCode1_2sum {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
        int[] nums = {3,2,4};

        int target = 9;
        int[] ints = twoSum1(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    // 2020.08.14 第1遍
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }

}
