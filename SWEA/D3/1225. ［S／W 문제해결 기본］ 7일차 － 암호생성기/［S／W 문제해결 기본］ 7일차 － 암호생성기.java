
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	private static int T = 10;
	private static int numCode = 8;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer> queue;
		int num;
		int cnt = 1;
		int check;
		for (int i = 1; i <= T; i++) {
			cnt = 1;
			num = Integer.parseInt(br.readLine());
			queue = new ArrayDeque<Integer>();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < numCode; j++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}
			while(true) {
				check = queue.poll()-cnt;
				if(check <= 0) {
					check = 0;
					queue.offer(check);
					break;
				}
				
				queue.offer(check);
				
				if(cnt == 5) {
					cnt = 1;
				}
				else {
					cnt++;
				}
			}
			
			System.out.print("#" + num + " ");
			for (int j = 0; j < numCode; j++) {
				System.out.print(queue.poll() + " ");
			}
			System.out.println();
		}
	}

}
