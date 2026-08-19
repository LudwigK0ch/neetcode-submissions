class Solution {
    public boolean isValid(String s) {
        Deque<Character> brackets = new ArrayDeque<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                brackets.addFirst(c);
            } else {
                if(brackets.size() == 0) {
                    return false;
                }
                char bracket = brackets.removeFirst();
                if((c == ')' && bracket != '(') || (c == '}' && bracket != '{') || (c == ']' && bracket != '[')) {
                        return false;
                    }
            }
        }

        return brackets.size() == 0;
    }
}
