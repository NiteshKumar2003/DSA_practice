import java.util.Stack;
class reverseStackRecursion {
	static Stack<Integer> st = new Stack<>();
	static void insert_at_bottom(int x){
		if(st.isEmpty()) st.push(x);
        else{
            int temp = st.pop();
            insert_at_bottom(x);
            st.push(temp);
        }
	}

	static void reverse(){
		if(!st.empty()){
            int x = st.pop();
            reverse();
            insert_at_bottom(x);
        }
	}
	public static void main(String[] args){
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println("Original Stack");
		System.out.println(st);
		reverse();
		System.out.println("Reversed Stack");
		System.out.println(st);
	}
}
