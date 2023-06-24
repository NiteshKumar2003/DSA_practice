class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int [] ans = new int [n];
        st.push(0);
        for(int i = 0; i <n; i++){
            while(!st.empty() && temperatures[i]>temperatures[st.peek()]){
                int index = st.pop();
                ans[index] = i-index;
            }
            st.push(i);
        }
        return ans;
    }
}