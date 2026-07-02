class Page {
    constructor(url = "", prev = null, next = null) {
        this.url = url;
        this.prev = prev;
        this.next = next;
    }
}
class BrowserHistory {
    /**
     * @constructor
     * @param {string} homepage
     */
    constructor(homepage) {
        this.curr = new Page(homepage);
    }

    /**
     * @param {string} url
     * @return {void}
     */
    visit(url) {
        let page = new Page(url);
        page.prev = this.curr;
        this.curr.next = page;
        this.curr = this.curr.next;
    }

    /**
     * @param {number} steps
     * @return {string}
     */
    back(steps) {
        while(this.curr.prev != null && steps > 0) {
            this.curr = this.curr.prev;
            steps--;
        }
        return this.curr.url;
    }

    /**
     * @param {number} steps
     * @return {string}
     */
    forward(steps) {
        while(this.curr.next != null && steps > 0) {
            this.curr = this.curr.next;
            steps--;
        }

        return this.curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = new BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */
