import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 입력 format
 * 1. 상어의 마릿수 N, 샼이 먹을 수 있는 상어의 최대 마릿수 K, 샼의 최초 크기를 나타내는 정수 T
 * 2. N마리의 상어 크기를 나타내는 정수 A_i가 공백으로 구분
 * 
 * 구하고자 하는 것: 샼이 최선의 선택으로 최대 K마리의 상어를 적절한 순서로 잡아먹었을 떄, 몸집이 최대 얼마까지 커질 수 있는지 출력
 * @author SSAFY
 *
 */
public class Main{

	private static int N, K; 
	private static long T;
	private static int[] arr;
	private static Stack<Integer> stack = new Stack<Integer>();
	private static Stack<Integer> tmp_stack = new Stack<Integer>();
	private static void findShark(long T) {
		while(!stack.isEmpty()) {
			if(stack.peek() < T) {
				tmp_stack.push(stack.pop());
			}
			else {
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		arr = Arrays.stream(arr).sorted().toArray();
				
		for (int i = N - 1; i >= 0; i--) {
			stack.push(arr[i]);
		}
		
		while(true) {
			findShark(T);
			if(tmp_stack.isEmpty() | cnt == K) {
				break;
			}
			T += (long)tmp_stack.pop();
			cnt++;
		}
		
		System.out.println(T);
	}		
}
