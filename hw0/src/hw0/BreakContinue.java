package hw0;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, -3, 4, 5, 4 };
		int n = 3;
		windowPosSum(a, n);

		System.out.print(java.util.Arrays.toString(a));
	}

	public static void windowPosSum(int[] a, int n) {
		// go through each element of the array, to replace a[i] with the sum of a[i] to
		// a[i+n]
		// calculate the sum a[i] through a[i+n]
		// if a[i] is negative or zero, remain the same, continue
		// else ( a[i] is positive), go through a[i] to a[i+n], make the sum
		// if i+n > a.length-1, break out of the sum calculation

		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				continue;
			}

			int sum = 0;
			for (int j = i; j <= i + n; j++) {
				sum = sum + a[j];

				if (j >= a.length - 1) {
					break;
				}
			}

			a[i] = sum;

		}

	}
}
