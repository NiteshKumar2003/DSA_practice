class GFG{
static long findMax(int n, int m, int a[], int b[], int k[]){
	int []arr = new int[n + 1];
	for (int i = 0; i < m; i++){
		int lowerbound = a[i];
		int upperbound = b[i];
		arr[lowerbound] += k[i];
		arr[upperbound + 1] -= k[i];
	}

	long sum = 0, res = Integer.MIN_VALUE;
	for (int i = 0; i < n; ++i){
		sum += arr[i];
		res = Math.max(res, sum);
	}
	return res;
}

public static void main (String[] args){
	int n = 5;
	int a[] = {0, 1, 2};
	int b[] = {1, 4, 3};
	int k[] = {100, 100, 100};
	int m = a.length;
	System.out.println("Maximum value after m operations is " + findMax(n,m,a,b,k));
	}
}