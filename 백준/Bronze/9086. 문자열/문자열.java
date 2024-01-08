import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			String str = sc.nextLine();
			int leng = str.length();
			char first = str.charAt(0);
			char last = str.charAt(leng-1);
			System.out.print(first);
			System.out.print(last);
			System.out.println();
		}
		sc.close();
	}

}