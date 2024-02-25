import java.util.ArrayList;
import java.util.HashMap;

public class Problem347 {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (!map.containsKey(num)) {

                map.put(num, 1);
            } else {

                int count = map.get(num);
                map.put(num, ++count);
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int number = 0;

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {

                if (e.getValue() > maxFreq) {

                    maxFreq = e.getValue();
                    number = e.getKey();
                }
            }

            map.put(number, -1);
            result[i] = number;
        }

        return result;
    }
}
