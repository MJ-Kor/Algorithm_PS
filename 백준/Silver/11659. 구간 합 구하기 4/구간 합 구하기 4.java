import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static int N;
	public static int M;
	public static int[] arr;
	public static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int i, j;
		dp = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		arr = new int[N + 1];
		for (int k = 1; k <= N; k++) {
			arr[k] = Integer.parseInt(st.nextToken());
			dp[k] = dp[k-1] + arr[k];
		}
		
		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			System.out.println(dp[j] - dp[i-1]);
		}
	}
}
