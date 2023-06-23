/* Implement Stack using Queues By making push() operation costly: */
import java.util.*;
class stackUsingQueue{
	static class Stack {
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();

		void push(int x){
			q2.add(x);
			while (!q1.isEmpty()) {
				q2.add(q1.remove());
			}
			Queue<Integer> q = q1;
			q1 = q2;
			q2 = q;
		}

		void pop(){
			if (q1.isEmpty()) return;
			q1.remove();
		}

		int top() {
			if (q1.isEmpty()) return -1;
			return q1.peek();
		}

		int size() { return q1.size(); }
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);

		System.out.println("current size: " + s.size());
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());

		System.out.println("current size: " + s.size());
	}
}



/* Implement Stack using Queues by making pop() operation costly: */
class Stack_ {
	Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

	void pop(){
		if (q1.isEmpty()) return;
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		q1.remove();
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	void add(int x) { q1.add(x); }
	
    int top(){
		if (q1.isEmpty())
			return -1;
		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}
		int temp = q1.peek();
		q1.remove();
		q2.add(temp);
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return temp;
	}

	int size() { return q1.size(); }
	public static void main(String[] args){
		Stack_ s = new Stack_();
		s.add(1);
		s.add(2);
		s.add(3);

		System.out.println("current size: " + s.size());
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		System.out.println("current size: " + s.size());
	}
}



/* Implement Stack using 1 queue: push costly*/
class Stack2 {
	Queue<Integer> q1 = new LinkedList<Integer>();

	void push(int x){
		int s = q1.size();
		q1.add(x);
		for (int i = 0; i < s; i++) {
			q1.add(q1.remove());
		}
	}

	void pop(){
		if (q1.isEmpty())
			return;
		q1.remove();
	}

	int top(){
		if (q1.isEmpty())
			return -1;
		return q1.peek();
	}

	int size() { return q1.size(); }

	public static void main(String[] args){
		Stack2 s = new Stack2();
		s.push(1);
		s.push(2);
		s.push(3);

		System.out.println("current size: " + s.size());
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());

		System.out.println("current size: " + s.size());
	}
}