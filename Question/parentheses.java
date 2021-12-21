import java.util.*;

public class parentheses {

    List<String> storage = new LinkedList<String>(); // tabulation

    void RemoveParenthesis(String str, int min) // 1 parenthesis is removed
    {
        if (min == 0) {
            if (minRemoval(str) == 0) // is balanced
            {
                System.out.println(str);
                return;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            // exclude char at index i
            String shorty = left + right;
            if (!storage.contains(shorty)) {
                storage.add(shorty);
                RemoveParenthesis(shorty, min - 1);
            }
        }
    }

    static int minRemoval(String str) {
        char currChar;
        Stack<Character> stackk = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            currChar = str.charAt(i);
            if (currChar == '(') {
                stackk.push('(');
            }
            if (currChar == ')') {
                if (!stackk.isEmpty() && stackk.peek() == '(') {
                    stackk.pop();
                } else {
                    stackk.push(')');
                }
            }
        }
        return stackk.size();
    }

    // for a balanced expression the min number of par to be removed is 0
    public static void main(String[] args) {
        parentheses obj = new parentheses();
        String input = "(x+y)(2))(Z)";
        System.out.println("Original : " + input);
        // System.out.println(minRemoval(input));
        obj.RemoveParenthesis(input, minRemoval(input));
    }
}