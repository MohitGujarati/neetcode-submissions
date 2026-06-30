class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // we first push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // then we check closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')
                    || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid only if stack becomes empty
        return stack.isEmpty();
    }
}
