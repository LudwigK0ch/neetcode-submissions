class DynamicArray {
  int[] arr;
  int size;

    public DynamicArray(int capacity) {
      this.arr = new int[capacity];
      this.size = 0;
    }

    public int get(int i) {
      return this.arr[i];
    }

    public void set(int i, int n) {
      this.arr[i] = n;
    }

    public void pushback(int n) {
      if(this.size == this.arr.length){
        resize();
      }

      this.arr[this.size] = n;
      this.size++;
    }

    public int popback() {
      this.size--;
      int num = this.arr[this.size];

      return num;
    }

    private void resize() {
      int[] resizedArr = new int[2 * this.arr.length];

      for(int i = 0; i < this.arr.length; i++){
        resizedArr[i] = arr[i];
      }

      arr = resizedArr;
    }

    public int getSize() {
      return this.size;
    }

    public int getCapacity() {
      return this.arr.length;
    }
}
