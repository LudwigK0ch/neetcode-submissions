class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> scores = new ArrayDeque<Integer>();
        int score = 0;

        for(String op : operations) {
            if(op.equals("+")) {
                int a = scores.removeFirst();
                int b = a + scores.peekFirst();
                scores.addFirst(a);
                scores.addFirst(b);
                score += b;
            } else if (op.equals("D")) {
                scores.addFirst(scores.peekFirst() * 2);
                score += scores.peekFirst();
            } else if(op.equals("C")) {
                score -= scores.removeFirst();
            } else {
                scores.addFirst(Integer.parseInt(op));
                score += scores.peekFirst();
            }
        }

        return score;
    }
}