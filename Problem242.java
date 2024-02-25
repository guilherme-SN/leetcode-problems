import java.util.HashMap;

public class Problem242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] letters = new int[26];

        for (int charPos = 0; charPos < s.length(); charPos++) {

            int charAsciiInS = s.charAt(charPos);
            letters[charAsciiInS - 97]++;

            int charAsciiInT = t.charAt(charPos);
            letters[charAsciiInT - 97]--;
        }

        for (int num : letters) {
            if (num != 0) return false;
        }

        return true;
    }
}
