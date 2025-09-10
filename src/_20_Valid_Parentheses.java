import java.util.ArrayDeque;
import java.util.Deque;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}["));
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (stack.isEmpty() || !isMatchingPair(stack.pop(), currentChar)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char openingBracket, char closingBracket) {
        return (openingBracket == '(' && closingBracket == ')') || (openingBracket == '[' && closingBracket == ']') || (openingBracket == '{' && closingBracket == '}');
    }
}
