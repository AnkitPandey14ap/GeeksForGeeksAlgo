
/*Given 3 numbers {1, 3, 5}, we need to tell
the total number of ways we can form a number 'N'
using the sum of the given three numbers.*/


public class NumberOfWaysToFormNumberN {
    private static int n = 6;
    private static int a[] = new int[n + 1];

    public static void main(String[] args) {
//        System.out.println(state(n));
        System.out.println(stateUsingMemoization(n));

    }

    //Using Tabulation Method
    private static int state(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 1;

        int[] a = new int[n + 1];
        a[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i >= 5) {
                a[i] = a[i - 1] + a[i - 3] + a[i - 5];
            } else if (i < 5 && i >= 3) {
                a[i] = a[i - 1] + a[i - 3];
            } else
                a[i] = a[i - 1];
        }
        return a[n];
    }

    //Using Memoization Method
    private static int stateUsingMemoization(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 1;
        if (a[n] != 0) {
            return a[n];
        } else if (n >= 5) {
            a[n] = stateUsingMemoization(n - 1) + stateUsingMemoization(n - 3) + stateUsingMemoization(n - 5);
        } else if (n < 5 && n >= 3) {
            a[n] = stateUsingMemoization(n - 1) + stateUsingMemoization(n - 3);
        } else
            a[n] = stateUsingMemoization(n - 1);
        return a[n];
    }
}

