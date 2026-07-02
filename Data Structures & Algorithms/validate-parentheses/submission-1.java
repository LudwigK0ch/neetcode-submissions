class Solution {
    public boolean isValid(String s) {
        Stack<Character> par = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case ')': {
                    if(par.isEmpty() || par.pop() != '(') return false;
                    break;
                }
                case ']': {
                    if(par.isEmpty() || par.pop() != '[') return false;
                    break;
                }
                case '}': {
                    if(par.isEmpty() || par.pop() != '{') return false;
                    break;
                }
                default: {
                    par.push(c);
                }
            }
        }

        return par.isEmpty();
    }
}
