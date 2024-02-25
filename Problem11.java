public class Problem11 {

    public int maxArea(int[] height) {

        int maximumArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int tempMaxArea = Math.min(height[left], height[right]) * (right - left);

            if (tempMaxArea > maximumArea) maximumArea = tempMaxArea;

            if (height[left] < height[right]) left++;
            else right--;
        }
        
        return maximumArea;
    }
}
