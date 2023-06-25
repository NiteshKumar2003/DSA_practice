class Solution{
    public int arithmeticTriplets(int[] nums, int diff){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i-diff) && set.contains(i-2*diff)) count++;
            set.add(i);
        }
        return count;
    }
}