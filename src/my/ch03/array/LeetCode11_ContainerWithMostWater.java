package my.ch03.array;

public class LeetCode11_ContainerWithMostWater {
    // 2020.08.18 #1
    public int maxArea1(int[] height) {
        int left = 0;
        int rigth = height.length - 1;
        int maxArea = 0;
        while (left < rigth) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[rigth]) * (rigth - left));
            if (height[left] < height[rigth]) {
                left++;
            } else {
                rigth--;
            }
        }
        return maxArea;
    }
}
