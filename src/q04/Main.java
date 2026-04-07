import java.util.*;

public class Main {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPerfect(int n) {
        if (n < 2) return false;

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            boolean prime = isPrime(x);
            boolean perfect = isPerfect(x);

            if (prime && perfect) {
                System.out.println("Both");
            } else if (prime) {
                System.out.println("Prime");
            } else if (perfect) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }
    }
}
