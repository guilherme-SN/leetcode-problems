
public class Problem424 {

    public int characterReplacement(String s, int k) {

        int[] charCount = new int[26];

        int answer = 0;
        int maxFrequency = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {

            charCount[s.charAt(end) - 'A']++;
            maxFrequency = Math.max(maxFrequency, charCount[s.charAt(end) - 'A']);

            if (end - start + 1 - maxFrequency > k) {

                charCount[s.charAt(start) - 'A']--;
                start++;
            }

            answer = Math.max(answer, end - start + 1);
        }

        return answer;
    }
}

