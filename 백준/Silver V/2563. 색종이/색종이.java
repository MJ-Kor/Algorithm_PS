import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[][] paper = new boolean[101][101];
		int N = Integer.parseInt(st.nextToken());
		int sum = 0;
		for (int c_paper = 0; c_paper < N; c_paper++) {
			st = new StringTokenizer(br.readLine());
			int s_row = Integer.parseInt(st.nextToken());
			int s_col = Integer.parseInt(st.nextToken());
			for (int row = s_row; row < s_row + 10; row++) {
				for (int col = s_col; col < s_col + 10; col++) {
					if (!paper[row][col]) {
						paper[row][col] = true;
						sum += 1;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
