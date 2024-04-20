import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken()); 
		
		int temp = 0;
		
		int basket[] = new int[n];
		for(int i=0;i<basket.length;i++) {
			basket[i] = i+1;
		}
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			while(a<b) {
				temp = basket[a];
				basket[a] = basket[b];
				basket[b] = temp;
				a++;
				b--;
			}
		}
		
		br.close();
		
		for(int i=0;i<basket.length;i++) {
			System.out.print(basket[i]+" ");
		}
		
	}
}