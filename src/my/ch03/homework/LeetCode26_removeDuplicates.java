package my.ch03.homework;

import java.util.Arrays;

public class LeetCode26_removeDuplicates {

    public static void main(String[] args) {
        //[0,0,1,1,1,2,2,3,3,4]
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//                     [0, 1, 2, 3, 4, 1, 2, 1, 3, 0]
//        int [] nums = {1,2};
//        int [] nums = {0,0,1,2,3};
//        removeDuplicates1(nums);
        removeDuplicates2(nums);
    }

    //    2020.8.18 #2 还需要多思考，这题不是很熟
    public static int removeDuplicates2(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }
        int res = k + 1;
//       System.out.println(Arrays.toString(nums)+" , "+res);
        return res;
    }


    // 2020.8.16 #1
    public static int removeDuplicates1(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k + 1);
        return k + 1;

    }
}
