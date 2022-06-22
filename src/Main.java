import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        for (;;) {
            gcdAndLcm();
        }
    }

    private static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int gcd(int a, int b) {
        int min = Math.min(a, b);
        int remainder = Math.max(a, b) % min;

        if (remainder == 0) {
            return min;
        } else {
            return gcd(min, remainder);
        }
    }

    private static void gcdAndLcm() {
        System.out.println("Enter 2 positive integer numbers...");

        int num1 = scanInt();
        int num2 = scanInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error - enter only positive integer numbers!\n");
        } else {
            int gcd = gcd(num1, num2);
            System.out.println("GCD(" + num1 + ";" + num2 + ") = " + gcd);

            int lcm = num1 * num2 / gcd;
            System.out.println("LCM(" + num1 + ";" + num2 + ") = " + lcm + "\n");
        }
    }
}