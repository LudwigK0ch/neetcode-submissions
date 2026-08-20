class BrowserHistory {
    Page homepage;
    Page curr;
    public BrowserHistory(String homepage) {
        this.homepage = new Page(homepage, null, null);
        this.curr = this.homepage;
    }
    
    public void visit(String url) {
        this.curr.next = new Page(url, this.curr, null);
        this.curr = this.curr.next;
    }
    
    public String back(int steps) {
        while(steps > 0 && this.curr != this.homepage) {
            this.curr = this.curr.prev;
            steps--;
        }

        return this.curr.url;
    }
    
    public String forward(int steps) {
        while(steps > 0 && this.curr.next != null) {
            this.curr = this.curr.next;
            steps--;
        }

        return this.curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

 class Page {
    String url;
    Page prev;
    Page next;
    public Page() {
        this.url = "";
        this.prev = null;
        this.next = null;
    }

    public Page(String url, Page prev, Page next) {
        this.url = url;
        this.prev = prev;
        this.next = next;
    }
 }