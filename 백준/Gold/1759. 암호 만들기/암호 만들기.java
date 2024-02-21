
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// 최소 1개의 모음, 최소 2개의 자음
public class Main {

	// 암호의 길이, 사용 문자 후보
	private static int L, C;
	private static String[] ch;
	private static String[] numbers;
	private static String consonant = "aeiou";
	private static boolean[] visited;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		visited = new boolean[C];
		ch = new String[C];
		numbers = new String[L];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			ch[i] = st.nextToken();
		}
		Arrays.sort(ch);
		
		perm(0, 0, 0, 0);
	}
	
	public static void perm(int start, int cnt, int consonantNum, int vowelNum) {
		if(cnt == L) {
			//System.out.println(consonantNum + " " + vowelNum);
			if(consonantNum >= 1 && vowelNum >= 2) {
				for (int i = 0; i < L; i++) {
					System.out.print(numbers[i]);
				}
				System.out.println();
			}
			return;
		}
		for (int i = start; i < ch.length; i++) {
//			if(visited[i]) continue;
//			visited[i] = true;
			numbers[cnt] = ch[i];
//			System.out.println(ch[i]);
//			System.out.println(consonant.contains(ch[i]));
			if(consonant.contains(ch[i])) perm(i + 1, cnt + 1, consonantNum + 1, vowelNum);
			else perm(i + 1, cnt + 1, consonantNum, vowelNum + 1);
//			visited[i] = false;
		}
	}
	
}
