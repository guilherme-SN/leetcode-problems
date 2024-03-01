import java.util.*;

public class Problem20 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {

                stack.add(currentChar); 
            } else {

                if (stack.size() == 0) return false;

                Character removedChar = stack.pop();
                if (currentChar != map.get(removedChar)) return false;
            }

        }

        if (stack.size() != 0) return false;

        return true;
    }
}
