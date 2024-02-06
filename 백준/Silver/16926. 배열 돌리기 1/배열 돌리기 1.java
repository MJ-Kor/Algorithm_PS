import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	private static Deque<Integer> deque = new ArrayDeque<Integer>();
	
	public static void inputQueue() {
		
	}
	
	public static void main(String[] args) throws IOException {
		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int startNum = (N > M) ? M/2 : N/2;
		int d = 0;
		
		for (int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < M; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < startNum; i++) {
			for(int k = 1 + i; k <= N - 1 - i; k++) {
				deque.addFirst(arr[k][i]);
			}
			for(int k = 1 + i; k <= M - 1 - i; k++) {
				deque.addFirst(arr[N - 1 - i][k]);
			}
			for(int k = N - 2 - i; k >= i; k--) {
				deque.addFirst(arr[k][M - 1 - i]);
			}
			for(int k = M - 2 - i; k >= i; k--) {
				deque.addFirst(arr[i][k]);
			}
			
			for (int j = 0; j < R; j++) {
				deque.addLast(deque.pollFirst());
			}
			
			for(int k = 1 + i; k <= N - 1 - i; k++) {
				arr[k][i] = deque.pollLast();
			}
			for(int k = 1 + i; k <= M - 1 - i; k++) {
				arr[N - 1 - i][k] = deque.pollLast();
			}
			for(int k = N - 2 - i; k >= i; k--) {
				arr[k][M - 1 - i] = deque.pollLast();
			}
			for(int k = M - 2 - i; k >= i; k--) {
				arr[i][k] = deque.pollLast();
			}
			
		}

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		} 
		
	}

}
