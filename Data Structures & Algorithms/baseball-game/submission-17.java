class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> scores = new ArrayDeque<Integer>();
        int score = 0;

        for(String op : operations) {
            if(op.equals("+")) {
                int head = scores.removeFirst();
                int s = head + scores.peekFirst();
                scores.addFirst(head);
                scores.addFirst(s);
                score += s;
            } else if(op.equals("D")) {
                scores.addFirst(scores.peekFirst() * 2);
                score += scores.peekFirst();
            } else if(op.equals("C")) {
                score -= scores.removeFirst();
            } else {
                int i = Integer.parseInt(op);
                scores.addFirst(i);
                score += i;
            }
        }

        return score;
    }
}