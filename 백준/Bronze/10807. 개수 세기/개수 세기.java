import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++){
            int s = Integer.parseInt(st.nextToken());
            if (s == k){
                count += 1;
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}