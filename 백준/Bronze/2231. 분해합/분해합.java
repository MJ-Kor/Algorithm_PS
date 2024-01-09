import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int min = N;
		int check;
		int sum = 0;
		String check_str;
		for (int i = 1; i <= N-1; i++) {
			check = N-i;
			//System.out.println(check);
			check_str = String.valueOf(check);
			for (int j = 0; j < check_str.length(); j++) {
				sum += (int)(check_str.charAt(j)-'0');
			}
			if (sum == i) {
				min = check;
			}
			sum = 0;
			
		}
		if (min == N) {
			System.out.println(0);
		}
		else {
			System.out.println(min);
		}
		in.close();
	}
}
