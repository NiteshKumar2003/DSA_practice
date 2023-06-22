class Node{
    int min;
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class MinStack {
    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(head==null){
            head=new Node(val);
            head.min=val;
        } else{
            Node newNode = new Node(val);
            newNode.min = Math.min(head.min,val);
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */