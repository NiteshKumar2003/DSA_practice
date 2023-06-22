class Solution {
    public int sumOfMultiples(int n) {
        int sum =0;

        for(int i=1;i*3<=n;i++)
            sum+=i*3;
        for(int i=1;i*5<=n;i++)
            sum+=i*5;
        for(int i=1;i*7<=n;i++)
            sum+=i*7;
        
        for(int i=1;i*21<=n;i++)
            sum-=i*21;
        for(int i=1;i*15<=n;i++)
            sum-=i*15;
        for(int i=1;i*35<=n;i++)
            sum-=i*35;

        for(int i=1;i*105<=n;i++)
            sum+=i*105;
        
        return sum;
    }
}