import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int F = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken()); 
            int ball = Integer.parseInt(st.nextToken()); 

            for(int j = F-1; j<E; j++)
            {
                arr[j] = ball;
            }
        }
        for (int baguni : arr)
            System.out.print(baguni + " ");
    }
}