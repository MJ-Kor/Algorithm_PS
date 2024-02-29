import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static int min = Integer.MAX_VALUE;
	private static int N; 
	private static int[][] adjMatrix;
	private static int[] numbers;
	private static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		adjMatrix = new int[N][N];
		visited = new boolean[N];
		numbers= new int[N + 1];
		for (int r = 0; r < N; r++) {
			adjMatrix[r] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		perm(0);
		System.out.println(min);
	}

	private static void perm(int cnt) {
		if(cnt == N) {
			numbers[N] = numbers[0];
			int value = getValue();
			if(value != -1) {
				min = Math.min(min, value);
			}
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			numbers[cnt] = i;
			perm(cnt + 1);
			visited[i] = false;
		}
	}

	private static int getValue() {
		int value = 0;
		
		for (int i = 0; i < N; i++) {
			int weight = adjMatrix[numbers[i]][numbers[i + 1]];
			if(weight == 0) {
				return -1;
			}
			value += weight;
		}
		return value;
	}
}