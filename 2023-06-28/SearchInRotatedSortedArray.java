class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);    
    }

    int bs(int[] nums, int t, int s, int e){
        if(s>e) return -1;
        
        int mid = s + (e-s)/2;
        if(nums[mid]==t) return mid;
        if(nums[mid]>=nums[s]){
            if(t>=nums[s] && t<=nums[mid]){
                return bs(nums, t, s, mid-1);
            }
            return bs(nums, t, mid+1, e);
        }
        else{
            if(t>=nums[mid] && t<=nums[e]){
                return bs(nums, t, mid+1, e);
            }
            return bs(nums, t, s, mid-1);
        }
    }
}