class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            }
            else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
            else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            }
            else {
                st.push(ch);
            }

            i++;
        }

        return st.isEmpty();
    }
}