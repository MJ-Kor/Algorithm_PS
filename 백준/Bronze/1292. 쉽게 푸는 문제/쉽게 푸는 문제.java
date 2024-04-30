import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int count = 0;
		int result = 0; 

		for(int i=1;i<=b;i++) { 
			for(int j=1;j<=i;j++) { 
				count++;
				if(a<=count && count<=b) {
					result += i; 
				}
			}
		}
		System.out.println(result);
	}
}