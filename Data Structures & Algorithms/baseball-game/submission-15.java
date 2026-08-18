class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> scores = new ArrayDeque<Integer>();
        for(String op : operations) {
            if(op.equals("+")) {
                int a = scores.removeFirst();
                int b = a + scores.peekFirst();
                scores.addFirst(a);
                scores.addFirst(b);
            } else if (op.equals("D")) {
                scores.addFirst(scores.peekFirst() * 2);
            } else if(op.equals("C")) {
                scores.removeFirst();
            } else {
                scores.addFirst(Integer.parseInt(op));
            }
        }

        int score = 0;
        for(int s : scores) {
            score += s;
        }

        return score;
    }
}