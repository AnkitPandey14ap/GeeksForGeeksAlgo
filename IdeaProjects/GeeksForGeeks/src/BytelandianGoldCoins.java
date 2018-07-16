import java.util.Scanner;

/*In Byteland they have a very strange monetary system.

Each Bytelandian gold coin has an integer number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers are all rounded down (the banks have to make a profit).

You can also sell Bytelandian coins for American dollars. The exchange rate is 1:1. But you can not buy Bytelandian coins.

You have one gold coin. What is the maximum amount of American dollars you can get for it?

*/
public class BytelandianGoldCoins {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        while (s.hasNext()){
            n=s.nextInt();
            System.out.println(maxAmericanDollars(n));
        }


    }

    private static int maxAmericanDollars(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int arr[] = new int[n + 1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i / 2] + arr[i / 3] + arr[i / 4];
            if(arr[i]<i)
                arr[i]=i;
        }
        return arr[n];
    }
}
