/*A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a
method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W*/

public class Staircase {

    public static void main(String args[]) {
        System.out.println(staircase(5));
    }

    public static int staircase(int n) {

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;

        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }

}
