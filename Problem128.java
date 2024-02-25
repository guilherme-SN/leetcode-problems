import java.util.*;

public class Problem128 {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0 || nums.length == 1) return nums.length;
        
        SortedSet<Integer> set = new TreeSet<>();

        for (int num : nums) set.add(num);

        int[] sortedNums = new int[set.size()];

        int i = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            sortedNums[i++] = it.next();
        }

        int longestSequence = 0;
        int temp = 1;

        for (i = 1; i < sortedNums.length; i++) {

            if (sortedNums[i] == sortedNums[i - 1] + 1) {
                temp++;
            } else {
                if (temp > longestSequence) {
                    longestSequence = temp;
                }

                temp = 1;
            }
        }

        return temp > longestSequence ? temp : longestSequence;
    }

}
