class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=st.peek()) st.push(arr[i]);
            else{
                int lastpop=st.pop();
                while(!st.empty() && arr[i]<st.peek()){
                    st.pop();
                }
                st.push(lastpop);
            }
            
        }
        return st.size();
    }
}

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int rightMin[]=new int[arr.length+1];
        rightMin[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            rightMin[i]=Math.min(rightMin[i+1], arr[i]);
        }
        int count=0;
        int leftMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            leftMax=Math.max(leftMax, arr[i]);
            if(leftMax <= rightMin[i+1]){
                count++;
            }
        }
        return count;
    }
}
