package my.ch03.array;

import java.util.Arrays;

/**
 * 移动0 ，难度：简单
 * 2020-08-01
 */
public class LeetCode283_move_zeros {
    public static void main(String[] args) {
//        int[] nums = {8,0, 1, 2, 0, 5};
        int[] nums ={6,0,1,0,3,12};
//        moveZeros2(nums);
//        moveZeros_1(nums);
// 复习第3遍 2020.08.12
moveZeros3(nums);


    }

    //第3遍 复习2020.08.12
    private static void moveZeros3(int[] nums) {
    // 一层循环
        int j = 0 ; // 记录非0的下标
        for(int i = 0 ; i <nums.length;i++){
            if(nums[i]!=0){
                if(i!=j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }

        }
        System.out.println(Arrays.toString(nums));

    }


    ////////////////////
    /**
     * 两个循环，有点小搓
     *
     * @param nums
     */
    public static void moveZeros2(int[] nums) {
        int j = 0; //记录非0的index位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int k = j ; k < nums.length; k++) {
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));

    }

    /**
     * 一个循环
     *
     * @param nums
     */
    public static void moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                if(i!=j){
                    nums[j]=nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    ////////2020-8-8 复习1 ///////////
    public static void moveZeros_1(int[] nums) {
        int j = 0; // 记录非0的元素下标
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                // 当i和j不相等的时候
               if(i!=j){
                   // 设置nums[j] 为 非0的数
                   nums[j] = nums[i];
                   //
                   nums[i] = 0;
               }
               j++;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

}
