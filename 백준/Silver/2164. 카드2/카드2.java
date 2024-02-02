import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	private static Queue<Integer> queue = new ArrayDeque<Integer>();
	private static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int status = 0;
		
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		while(queue.size() != 1) {
			if (status == 0) {
				queue.poll();
				status = 1;
			}
			else {
				queue.offer(queue.poll());
				status = 0;
			}
		}
		System.out.println(queue.peek());
	}
}
