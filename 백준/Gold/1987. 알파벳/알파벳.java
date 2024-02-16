import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int max = Integer.MIN_VALUE;
	private static int R, C;
	private static boolean[] alphabet = new boolean[26]; 
	private static int[] dr = {-1, 0, 1, 0};
	private static int[] dc = {0, 1, 0, -1};
	private static boolean[][] visited;
	private static char[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str;
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		visited = new boolean[R][C];
		
		for (int r = 0; r < R; r++) {
			str = br.readLine();
			for (int c = 0; c < C; c++) {
				map[r][c] = str.charAt(c);
			}
		}
		
		alphabet[(int)(map[0][0] - 'A')] = true;
		visited[0][0] = true;
		dfs(0, 0, 1);
		System.out.println(max);
	}

	public static void dfs(int r, int c, int cnt) {
		int nr, nc;
		
		for (int i = 0; i < 4; i++) {
			nr = r + dr[i];
			nc = c + dc[i];
			if(nr >= 0 && nr < R && nc >= 0 && nc < C && !visited[nr][nc] && !alphabet[(int)(map[nr][nc] - 'A')]) {
				alphabet[(int)(map[nr][nc] - 'A')] = true;
				visited[nr][nc] = true;
				dfs(nr, nc, cnt + 1);
				alphabet[(int)(map[nr][nc] - 'A')] = false;
				visited[nr][nc] = false;
			}
		}
		
		if(max < cnt) max = cnt;
	}
	
}
