import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String output = "";
		int tmp;
		for (int i = 0; i < str.length(); i++) {
			tmp = (int)str.charAt(i);
			if ((tmp >= 65) && (tmp <= 90)) {
				output += (char)(tmp + 32);
			}
			else if ((tmp >= 97) && (tmp <= 122)) {
				output += (char)(tmp - 32);
			}
			else {
				output += (char)tmp;
			}
		}
		System.out.println(output);
		sc.close();

	}

}