import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
		int x = Integer.parseInt(br.readLine());
		int[] arr = {64, 32, 16, 8, 4, 2, 1};
		int sum = 0;
		
		for(int i = 0; i < 7; i++) {
			if(arr[i] <= x) {
				sum += arr[i];
				cnt++;
			}
			if(sum > x) {
				sum -= arr[i];
				cnt--;
			}
			if(sum == x) break;
		}
		System.out.println(cnt);
	}

}