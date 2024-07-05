import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        calculate(N, 0);
        System.out.println(min + " " + max);
    }

    static void calculate(String N, int oddNum) {
//        System.out.println("oddNum = " + oddNum);
        if(N.length() == 1) {
//            System.out.println("N = " + N);
            min = Math.min(min, oddNum + checkOddNum(N));
//            System.out.println("min");
            max = Math.max(max, oddNum + checkOddNum(N));
//            System.out.println("N = " + N);
            return;
        }

        if(N.length() == 2) {
//            System.out.println("first = " + Integer.parseInt(N.substring(0, 1)) + " second = " + Integer.parseInt(N.substring(1)));
            String newNum = Integer.toString(N.charAt(0) - '0' + N.charAt(1) - '0');
            calculate(newNum, oddNum + checkOddNum(N.substring(0, 1)) + checkOddNum(N.substring(1)));
        }
        else {
            for (int firstIdx = 0; firstIdx < N.length() - 2; firstIdx++) {
                for (int secondIdx = firstIdx + 1; secondIdx < N.length() - 1; secondIdx++) {
                    String first = N.substring(0, firstIdx + 1);
                    String second = N.substring(firstIdx + 1, secondIdx + 1);
                    String third = N.substring(secondIdx + 1);
//                    System.out.println("first = " + first + " second = " + second + " third = " + third);
//                    oddNum += checkOddNum(first);
//                    oddNum += checkOddNum(second);
//                    oddNum += checkOddNum(third);
                    calculate(Integer.toString(Integer.parseInt(first) + Integer.parseInt(second) + Integer.parseInt(third)), oddNum + checkOddNum(first) + checkOddNum(second) + checkOddNum(third));
                }
            }
        }
    }

    static int checkOddNum(String num) {
        int oddNum = 0;
//        System.out.println("num = " + num);
        for (int i = 0; i < num.length(); i++) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                oddNum += 1;
            }
        }
        return oddNum;
    }

}