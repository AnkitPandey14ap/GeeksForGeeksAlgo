import java.util.HashMap;
import java.util.Scanner;

/*In Byteland they have a very strange monetary system.

Each Bytelandian gold coin has an integer number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers are all rounded down (the banks have to make a profit).

You can also sell Bytelandian coins for American dollars. The exchange rate is 1:1. But you can not buy Bytelandian coins.

You have one gold coin. What is the maximum amount of American dollars you can get for it?

*/
public class BytelandianGoldCoins {

    public static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(0, 0);
        map.put(1, 1);
        Scanner s = new Scanner(System.in);
        int n;
        while (s.hasNext()) {
            n = s.nextInt();
            System.out.println(maxAmericanDollars1(n));
        }
    }

/*
    private static int maxAmericanDollars(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        for (int i = 2; i <= n; i++) {
            int t = map.get(i / 2) + map.get(i / 3) + map.get(i / 4);
            if (t < i)
                t = i;
            map.put(i, t);
        }
        return map.get(n);
    }
*/

    private static int maxAmericanDollars1(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            int t = maxAmericanDollars1(n / 2) + maxAmericanDollars1(n / 3) + maxAmericanDollars1(n / 4);
            if (t < n)
                t = n;
            map.put(n, t);
        }
        return map.get(n);
    }

}
