import java.util.*;

public class Problem3 {

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0 || s.length() == 1) return s.length();
        
        HashSet<Character> substringChars = new HashSet<>();

        int firstSubstringIndex = 0;
        int lastSubstringIndex = 0;
        int size = 0;

        while (lastSubstringIndex < s.length()) {

            Character currentChar = s.charAt(lastSubstringIndex);
            while (substringChars.contains(currentChar)) {

                substringChars.remove(s.charAt(firstSubstringIndex));
                firstSubstringIndex++;
            }                 

            substringChars.add(s.charAt(lastSubstringIndex));
            lastSubstringIndex++;

            size = Math.max(size, substringChars.size());
        }

        return size;
    }
}
