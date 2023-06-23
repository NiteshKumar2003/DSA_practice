import java.util.*;
class GFG{
    static void FrontToLast(Queue<Integer> q,int qsize){
        if (qsize <= 0)	return;
        q.add(q.remove());
        FrontToLast(q, qsize - 1);
    }
    static void pushInQueue(Queue<Integer> q,int temp, int qsize){
        if (q.isEmpty() || qsize == 0){
            q.add(temp);
            return;
        }
        else if (temp <= q.peek()){
            q.add(temp);
            FrontToLast(q, qsize);
        }
        else{
            q.add(q.remove());
            pushInQueue(q, temp, qsize - 1);
        }
    }
    static void sortQueue(Queue<Integer> q){
        if (q.isEmpty()) return;
        int temp = q.remove();
        sortQueue(q);
        pushInQueue(q, temp, q.size());
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(7);
        q.add(16);
        q.add(9);
        q.add(20);
        q.add(5);
        sortQueue(q);
        while (!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}