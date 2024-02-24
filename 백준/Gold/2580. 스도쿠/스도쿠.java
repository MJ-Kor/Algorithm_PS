import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static int[][] map = new int[9][9];
	private static List<int[]> points = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  null;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 0) {
					points.add(new int[] {i, j});
				}
			}
		}
		
		//System.out.println(points.size());
//		for (int i = 0; i < 9; i++) {
//			map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		}
		
		perm(0);
		
	}

	private static void perm(int cnt) {
//		System.out.println(cnt);
		if(cnt == points.size()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		int row = points.get(cnt)[0];
		int col = points.get(cnt)[1];
//		System.out.println(row + " " + col);
		for (int i = 1; i <= 9; i++) {
//			System.out.println("i: " + i);
			if(promising(row, col, i)) {
				map[row][col] = i;
				perm(cnt + 1);
			}
			
		}
		map[row][col] = 0;
		return;
	}

	private static boolean promising(int row, int col, int i) {
		for (int j = 0; j < 9; j++) {
			if(map[j][col] == i) {
				return false;
			}
		}
		
		for (int j = 0; j < 9; j++) {
			if(map[row][j] == i) {
				return false;
			}
		}
		
		int pointRow = (row/3) * 3;
		int pointCol = (col/3) * 3;
//		System.out.println("pointRow: " + pointRow + "pointCol: " + pointCol );
		
		for (int j = pointRow; j < pointRow + 3; j++) {
			for (int k = pointCol; k < pointCol + 3; k++) {
//				System.out.println("map[j][k]: " + map[j][k] + "넣으려는 것: " + i );
				if(map[j][k] == i) {
					return false;
				}
			}
		}
		
		return true;
	}
		
}
