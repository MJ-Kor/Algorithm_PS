import java.util.Scanner;

class Calculator {

	public void Calculate(long a, long b) {
		long result = ((long)(a + b)) *((long)(a - b));
		System.out.println(result);
	}
}

public class Main {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] dataArr = str.split(" ");
		long a = Long.parseLong(dataArr[0]);
		long b = Long.parseLong(dataArr[1]);
		
		c1.Calculate(a, b);
	}

}