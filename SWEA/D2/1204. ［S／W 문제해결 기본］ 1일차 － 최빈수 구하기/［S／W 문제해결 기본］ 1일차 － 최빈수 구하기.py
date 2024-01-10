import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= T; i++) {
			int[] scores = new int[101];
			int max = 0;
			int	idx = 0;
			st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int score = Integer.parseInt(st.nextToken());
				//System.out.print(score+" ");
				scores[score]+=1;
			}
			for (int k = 100; k > 0; k--) {
				if(scores[k] > max) {
					max = scores[k];
					idx = k;
				}
			}
			System.out.println("#"+j+" "+idx);
			// int[] gradeArr = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();

		}
	}
}
