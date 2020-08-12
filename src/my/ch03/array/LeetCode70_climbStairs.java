package my.ch03.array;

/**
 * 2020-08-05
 * 爬楼梯 ，难度：简单
 */
public class LeetCode70_climbStairs {
    public static void main(String[] args) {
        int n = 45;
//        int res1 = climbStairs(n);
//        System.out.println(res1);
        int res1 = climbStairs1(n);
        System.out.println(res1);

        // 第2遍 2020.08.12
        int res2 = climbStairs2(n);
        System.out.println(res2);
    }

    // 第2遍 2020.08.12
    public static int climbStairs2(int n ){
        // 开一个数组，保存所有的结果
        int[] nums = new int[n+1];

            nums[0] = 0;
            nums[1] = 1;
            nums[2] = 2;
            for(int i=3;i<nums.length;i++){
                nums[i] = nums[i-1] + nums[i-2];
            }
            return nums[n];
    }






    /**
     * 数据量大了会超时
     * @param n
     * @return
     */
    public static int climbStairs(int n ) {
        if(n<=0){
            return 0;
        }
        if(n==1||n ==2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);

    }

    /**
     * 动态规划的解法
     * @param n
     * @return
     */
    public static int climbStairs1(int n){
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i= 3;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return  arr[n];
    }
}
