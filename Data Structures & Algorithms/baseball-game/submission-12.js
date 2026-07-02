class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations) {
        let record = [];

        operations.forEach((operation) => {
            console.log("Before:" + record);
            switch(operation) {
                case "+": {
                    const a = record.pop();
                    const b = record.pop();
                    record.push(b);
                    record.push(a);
                    record.push(a + b);
                    break;
                }

                case "D": {
                    const a = record.pop();
                    record.push(a);
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
            console.log("After: "+ record);
        });

        return record.reduce((a, b) => a + b, 0);
    }
}
