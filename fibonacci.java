public class fibonacci {
    public static void main(String[] args) {
        int sum, n = 100, t1 = 0, t2 = 1;
        while (t1 <= n) {
            System.out.print(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
