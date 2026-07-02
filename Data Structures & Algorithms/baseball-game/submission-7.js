class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations) {
        let record = [];

        operations.forEach((operation) => {
            switch(operation) {
                case "+": {
                    const a = record[record.length - 1];
                    const b = record[record.length - 2];
                    record.push(a + b);
                    break;
                }

                case "D": {
                    const a = record[record.length - 1];
                    record.push(2 * a);
                    break;
                }

                case "C": {
                    record.pop();
                    break;
                }

                default: {
                    record.push(parseInt(operation, 10));
                }
            }
        });

        return record.reduce((a, b) => a + b, 0);
    }
}
