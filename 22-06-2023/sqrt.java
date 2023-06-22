class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int sqrt = x;
        while(true){
            int nextrt = (sqrt + x/sqrt) >>>1;
            if(nextrt<sqrt) sqrt = nextrt;
            else break;
        }
        return sqrt;
    }
}