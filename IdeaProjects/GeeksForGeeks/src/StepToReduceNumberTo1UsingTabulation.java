public class StepToReduceNumberTo1UsingTabulation {

    public static void main(String args[]) {

        System.out.println(countStep(-10));
    }

    public static int min(int x, int y){
        return (x<y) ? x:y;
    }

    private static int countStep(int n) {
        if(n<1)
            return -1;
        int[] ans = new int[n + 1];
        int x=-1 , y=-1, z;
        ans[0] = 0;
        ans[1] = 0;
        ans[2] = 1;
        ans[3] = 1;

        for (int i = 4; i <= n; i++) {

            if (i % 3 == 0) {
                y = ans[i / 3];
            }else
                y=n;
            if (n % 2 == 0) {
                x = ans[i / 2];
            }else
                x=n;
            int t = i - 1;
            z = ans[t];

            ans[i] = 1+min(min(x, y), z);

        }
        return ans[n];

    }
}
