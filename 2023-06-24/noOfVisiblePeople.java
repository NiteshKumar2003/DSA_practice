class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            int h = heights[i];
            int count = 0;
            while(!st.empty() && st.peek()<h){
                st.pop(); count++;
            }
            if(!st.empty()) count++;
            st.push(h);
            ans[i] = count;
        }
        return ans;
    }
}