import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Введите два положительных натуральных числа");

        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        if(num1 <= 0 || num2 <= 0) {
            System.out.println("Ошибка! Можно ввести только положительные натуральные числа!");
        }
        else {
            int d = nod(num1, num2);
            System.out.println("НОД(" + num1 + ";" + num2 + ") = " + d);

            int nok = num1 * num2 / d;
            System.out.println("НОК(" + num1 + ";" + num2 + ") = " + nok);
        }
    }


    private static int nod(int a, int b) {
        int r = Math.max(a, b) % Math.min(a, b);

        if(r == 0) {
            return Math.min(a, b);
        }
        else {
            return nod(Math.min(a, b), r);
        }
    }
}