public class TowersOfHanoi {
    public static void main(String[] args) {
        String A = "A";
        String B = "B";
        String C = "C";

        int n = 4;
        towerOfHanoi(n,A,C,B);
    }


    static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

}
