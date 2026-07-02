class MinStack {
    constructor() {
        this.stack = [];
        this.min = [];
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
        this.stack[this.stack.length] = val;
        this.min[this.min.length] = this.min.length === 0 ? val : Math.min(this.getMin(), val);
    }

    /**
     * @return {void}
     */
    pop() {
        const a = this.stack[this.stack.length - 1];
        this.stack.splice(-1);
        this.min.splice(-1);
        return a;
    }

    /**
     * @return {number}
     */
    top() {
        return this.stack[this.stack.length - 1];
    }

    /**
     * @return {number}
     */
    getMin() {
        return this.min[this.min.length - 1];
    }
}
