
public class Problem33 {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (nums[middle] == target) return middle;

            // check if we are in the left sorted portion
            if (nums[left] <= nums[middle]) {

                if (target > nums[middle] || target < nums[left]) {

                    left = middle + 1;
                } else {

                    right = middle;
                }
            } else { // check if we are in the right sorted portion

                if (target < nums[middle] || target > nums[right]) {
                    
                    right = middle;
                } else {

                    left = middle + 1;
                }
            } 
        }

        return -1;
    }
}
