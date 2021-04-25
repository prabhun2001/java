public class altprime {
    public static int check(int n) {
        int flag = 0;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 1;
        else
            return 0;

    }

    static void printaltprime(int n) {
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            if (check(i) == 1) {
                if (temp == 0) {
                    System.out.print(i + " ");
                    temp = 1;
                } else {
                    temp = 0;
                }

            }

        }
    }

    public static void main(String[] args) {
        int n = 20;
        printaltprime(n);
    }

}
