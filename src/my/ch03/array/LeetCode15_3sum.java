package my.ch03.array;

import java.util.*;

/**
 * 三数之和
 */
public class LeetCode15_3sum {

    public static void main(String[] args) {
        int [] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum1(nums);
        Object[] array = lists.toArray();
        System.out.println(Arrays.toString(array));

    }
    // 第1遍 2020.08.12
    public static List<List<Integer>> threeSum1(int[] nums) {
        // 要求不重复，应该用set保存结果
        Set<List<Integer>> set = new HashSet<>();
        // 先对数组进行排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int t = i + 1;
            int k = nums.length - 1;
            while (t < k) {
                if (nums[i] + nums[t] + nums[k] == 0) {
                    set.add(Arrays.asList(nums[i], nums[t], nums[k]));
                    t++;
                    k--;
                } else if (nums[i] + nums[t] + nums[k] < 0) { // 小于0，说明值小了，j向右移动
                    t++;
                } else { // 值大了，k向左移动
                    k--;
                }
            }

        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);

        return ans;
    }
}
