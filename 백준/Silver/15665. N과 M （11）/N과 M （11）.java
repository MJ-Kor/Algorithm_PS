
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// N과 M (11)
public class Main {

	private static BufferedReader br;
	private static StringTokenizer st;
	private static StringBuilder sb;
	private static int N;
	private static int M;
	private static int[] numbers;
	private static int[] outputs;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		numbers = new int[N];
		outputs = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		comb(0);
		
		System.out.println(sb);
	}
	
	public static void comb(int cnt) {
		if(cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(outputs[i]).append(" ");
			}
			sb.append('\n');
			return;
		}

		boolean[] isSelected = new boolean[10001];
		for (int i = 0; i < N; i++) {
			if(isSelected[numbers[i]]== true) continue;
			
			isSelected[numbers[i]] = true;
			outputs[cnt] = numbers[i];
			comb(cnt + 1);
		}
	}

}
