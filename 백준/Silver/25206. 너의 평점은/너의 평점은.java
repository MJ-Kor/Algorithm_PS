import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double creSum=0;
		double creGp=0;	
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String gp = st.nextToken();
			
			double gpNum=0.0;
			switch(gp) {
			case "A+": gpNum = 4.5;
				break;
			case "A0": gpNum = 4.0;
				break;
			case "B+": gpNum = 3.5;
				break;
			case "B0": gpNum = 3.0;
				break;
			case "C+": gpNum = 2.5;
				break;
			case "C0": gpNum = 2.0;
				break;
			case "D+": gpNum = 1.5;
				break;
			case "D0": gpNum = 1.0;
				break;
			case "F": gpNum = 0.0;
				break;
			case "P": gpNum = 0.0;
					credit=0;
				break;
			}
            
			creGp += credit * gpNum;
			creSum += credit;
            
		}
		System.out.println(creGp/creSum);
	}
}