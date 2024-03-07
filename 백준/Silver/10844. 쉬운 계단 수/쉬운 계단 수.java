import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static long mod = 1000000000;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N + 1][10];
		for (int i = 0; i <= 9; i++) {
			dp[1][i] = 1L;
		}
		for (int i = 2; i <= N; i++) {
			dp[i][0] = dp[i - 1][1] % mod;
			for (int j = 1; j <= 8; j++) {
				dp[i][j] = ((dp[i - 1][j - 1] % mod) + (dp[i - 1][j + 1] % mod)) % mod;
			}
			dp[i][9] = dp[i - 1][8] % mod;
		}
		
		long answer = 0;
		for (int i = 1; i <= 9; i++) {
			answer += dp[N][i] % mod;
		}
		
		System.out.println(answer % mod);
		
	}

}