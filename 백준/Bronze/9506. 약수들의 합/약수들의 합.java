import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }


            List<Integer> divisorList = new ArrayList<>();

            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisorList.add(i);
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n);

            if (sum == n) {
                sb.append(" = ");

                for (int i : divisorList) {
                    sb.append(i).append(" + ");
                }

                sb.delete(sb.length() - 3, sb.length());

            } else {
                sb.append(" is NOT perfect.");
            }

            System.out.println(sb);
        }
    }
}