import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");  //n번 만큼 *출력
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}