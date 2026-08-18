class Solution {
    public int calPoints(String[] operations) {
        Deque<String> scores = new ArrayDeque<String>();

        for(String entry : operations) {
            if(entry.equals("+")) {
                String a = scores.removeFirst();
                String b = scores.peekFirst();
                int c = Integer.parseInt(a) + Integer.parseInt(b);
                scores.addFirst(a);
                scores.addFirst(Integer.toString(c));
                continue;
            }
            else if(entry.equals("D")) {
                int a = Integer.parseInt(scores.peekFirst()) * 2;
                scores.addFirst(Integer.toString(a));
                continue;
            }
            else if(entry.equals("C")) {
                int a = Integer.parseInt(scores.removeFirst());
                continue;
            } else {
                scores.addFirst(entry);
            }
        }

        int score = 0;
        for(String s : scores) {
            score += Integer.parseInt(s);
        }

        return score;
    }
}