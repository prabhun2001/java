public class armstrong {
    public static void main(String[] args) {
        int n = 153, rem, temp, sum = 0;
        temp = n;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an armstrong number");
        } else {
            System.out.println(n + " is not an armstrong number");
        }
    }

}
