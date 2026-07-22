class Solution {
    /**
     * @param {number[]} students
     * @param {number[]} sandwiches
     * @return {number}
     */
    countStudents(students, sandwiches) {
        let n = students.length;
        let q = new Queue();
        for (let student of students) {
            q.push(student);
        }

        let res = n;
        for (let sandwich of sandwiches) {
            let cnt = 0;
            while (cnt < n && q.front() !== sandwich) {
                q.push(q.pop());
                cnt++;
            }

            if (q.front() === sandwich) {
                q.pop();
                res--;
            } else {
                break;
            }
        }
        return res;
    }
}
