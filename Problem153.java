
public class Problem153 {

    public int findMin(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            if (nums[left] <= nums[right]) return nums[left];

            int middle = (right + left) / 2;

            if (nums[middle] >= nums[left]) left = middle + 1;
            else right = middle;
        }

        return 0;
    }
}
