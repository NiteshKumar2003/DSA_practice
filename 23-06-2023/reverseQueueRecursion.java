import java.util.*;
public class reverseQueueRecursion {
	static Queue<Integer> queue;
    static Queue<Integer> reverseQueue(Queue<Integer> q){
        if(q.isEmpty()) return q;
        int x = q.remove();
        q = reverseQueue(q);
        q.add(x);
        return q;
    }

    public static void main(String args[]){
        queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(8);
        queue.add(10);
        queue.add(12);
        queue = reverseQueue(queue);
        while (!queue.isEmpty()){
			System.out.print(queue.peek() + " ");
			queue.remove();
		}
    }
}
