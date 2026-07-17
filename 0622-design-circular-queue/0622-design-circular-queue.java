class MyCircularQueue {
int[] q;
int f,s,c,r;
    public MyCircularQueue(int k) {
    q=new int[k];
    f=0;
    r=0;
    c=0;
    s=k;
    }
    
    public boolean enQueue(int value) {
        if(c==s)
        {
            return false;
        }
        q[r]=value;
        r=(r+1)%s;
        c++;
        return true;
    }
    
    public boolean deQueue() {
        if(c==0)
        {
            return false;
        }
        f=(f+1)%s;
        c--;
        return true;
    }
    
    public int Front() {
        if(c==0)
        return -1;

        return q[f];
    }
    
    public int Rear() {
        if(c==0)
        return -1;

        return q[(r-1+s)%s];
    }
    
    public boolean isEmpty() {
        return c==0;
    }
    
    public boolean isFull() {
        return c==s;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */