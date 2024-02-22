
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	static class Node{
		int to;
		Node next;

		public Node(int to, Node next) {
			super();
			this.to = to;
			this.next = next;
		}
		
	}
	
	private static int T = 10;
	private static int N, start;
	
	private static Node[] nodeList;
	private static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int test_case = 1; test_case <= 10; test_case++) {
			nodeList = new Node[101];
			visited = new boolean[101];
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			start = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N/2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				// System.out.println(from + " " + to);
				nodeList[from] = new Node(to, nodeList[from]);
				// 중복 처리?
			}
			
//			for (int i = 0; i <= 100; i++) {
//				if(nodeList[i] == null) continue;
//				System.out.print(i + ": ");
//				for (Node temp = nodeList[i]; temp != null; temp = temp.next) {
//					System.out.print(temp.to + " ");
//				}
//				System.out.println();
//			}
			
			System.out.println("#" + test_case + " " + bfs());
		}
		
		
	}
	
	public static int bfs() {
		Queue<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[] {start, 0});
		visited[start] = true;
		List<Integer> list = new ArrayList<>();
		int currBreath = 0;
		//System.out.println(currBreath + " " + list.toString());
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			if(curr[1] != currBreath) {
				currBreath = curr[1];
				list.clear();
			}
			list.add(curr[0]);
			//System.out.println(currBreath + " " + list.toString());
			for(Node temp = nodeList[curr[0]]; temp != null; temp = temp.next) {
				if(!visited[temp.to]) {
					queue.offer(new int[] {temp.to, curr[1] + 1});
					visited[temp.to] = true; 
				}
			}
		}
		return Collections.max(list);
	}

}
