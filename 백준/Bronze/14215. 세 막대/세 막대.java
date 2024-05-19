import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = 0;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            tmp = a;
            a = c;
            c = tmp;
        }

        while (true) {
            int sum = a + b + c;
            if (b + c > a) {
                System.out.println(sum);
                break;
            } else {
                a--;
            }
        }
        sc.close();
    }
}