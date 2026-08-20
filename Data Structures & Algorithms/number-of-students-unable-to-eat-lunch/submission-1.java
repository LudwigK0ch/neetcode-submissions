class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> stud = new ArrayDeque<Integer>();
        Deque<Integer> sand = new ArrayDeque<Integer>();

        for(int s : students) {
            stud.addLast(s);
        }

        for(int s : sandwiches) {
            sand.addLast(s);
        }

        int size = stud.size();
        while(size > 0) {
            int st = stud.removeFirst();
            if(st == sand.peek()) {
                sand.removeFirst();
                size = stud.size();
            } else {
                stud.addLast(st);
                size--;
            }
        }

        return sand.size();
    }
}