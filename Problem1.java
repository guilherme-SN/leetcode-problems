import java.util.HashMap;

/*
public class Problem1 {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int target2 = target - nums[i];
                
                if (nums[j] == target2) return new int[]{i, j};
            }
        }

        return null;
    }
}
*/


// Solução mais eficiente
public class Problem1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int currentNum = nums[i];
            int difference = target - currentNum;

            if (map.containsKey(difference)) {

                int position = map.get(difference);

                return new int[]{position, i};
            }

            map.put(currentNum, i);
        }

        return null;
    }
}
