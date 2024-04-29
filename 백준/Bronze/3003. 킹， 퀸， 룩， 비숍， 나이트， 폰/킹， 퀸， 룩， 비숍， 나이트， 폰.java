import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder();
        int[] chessArr = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int chess : chessArr) {
            int value = Integer.parseInt(st.nextToken());
            if (chess == value) {
                sb.append(0).append(" ");
            } else {
                sb.append(chess - value).append(" ");
            }
        }
        System.out.println(sb);
    }
}