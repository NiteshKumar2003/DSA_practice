import java.util.Scanner;
import java.util.Arrays;
class GFG {
	public static int solve(String s, int n){
		int left = 0, right = 0;
		int maxlength = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') left++;
			else right++;
			if (left == right)
				maxlength = Math.max(maxlength, 2 * right);
			else if (right > left)
				left = right = 0;
		}

		left = right = 0;
		for (int i=n-1; i>= 0;i--) {
			if (s.charAt(i) == '(')
				left++;
			else right++;
			if (left == right)
				maxlength = Math.max(maxlength, 2 * left);
			else if (left > right)
				left = right = 0;
		}
		return maxlength;
	}

	public static void main(String args[]){
		System.out.print(solve("((()()()()(((())", 16));
	}
}