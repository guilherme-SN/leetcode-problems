import java.util.*;

public class Problem238 {

    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        int totalProduct = 1;

        for (int num : nums) {

            totalProduct *= num;
        }

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == 0) {

                int tempProduct = 1;

                for (int j = 0; j < nums.length; j++) {

                    if (i == j) continue;

                    tempProduct *= nums[j];
                }

                result[i] = tempProduct;
            } else {

                result[i] = totalProduct / nums[i];
            }
        }

        return result;
    }
}
