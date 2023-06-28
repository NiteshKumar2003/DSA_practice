class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        int idx=-1;
        while (lo <= hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] > A[mi + 1]){
                idx = mi;
                hi = mi - 1;}
            else
                lo = mi + 1;
        }
        return idx;
    }
}