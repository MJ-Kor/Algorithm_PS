import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 입력 format
 * 1. 다리를 건너는 트럭의 수 n, 다리의 길이 w, 다리의 최대 하중 L
 * 2. 트럭의 무게를 나타내는 n개의 정수 a_i
 * 
 * 조건
 * 1. w대의 트럭만 동시에 올라갈 수 있다.
 * 2. 각 트럭들은 하나의 단위시간에 하나의 단위 길이만큼만 이동할 수 있다.
 * 3. 다리 위에 올라가 있는 트럭들의 무게 합은 L보다 작거나 같아야 한다.
 * 
 * 구하고자 하는 것: 트럭이 다리를 건너는 최단 시간
 * @author SSAFY
 *
 */
public class Main {

	private static int n;
	private static int w;
	private static int L;
	private static Queue<Integer> bridgeQueue = new ArrayDeque<Integer>();
	private static Queue<Integer> inputQueue = new ArrayDeque<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		int cnt = 0;
		
		n = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < w; i++) {
			bridgeQueue.offer(0);
		}
		
		for (int i = 0; i < n; i++) {
			inputQueue.offer(Integer.parseInt(st.nextToken()));
			
		}
		
		while(!bridgeQueue.isEmpty()) {
			if(!inputQueue.isEmpty()) {
				sum-=bridgeQueue.poll();
				if((sum + inputQueue.peek()) <= L) {
					sum += inputQueue.peek();
					bridgeQueue.offer(inputQueue.poll());
					cnt++;
				}
				else {
					bridgeQueue.offer(0);
					cnt++;
				}
			}
			else {
				sum-=bridgeQueue.poll();
				cnt++;
			}

		}
		
		System.out.println(cnt);
		
	}

}
