import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());

        if(n1 == n2 && n1 == n3 && n2 == n3 && n1 == 60)
            System.out.println("Equilateral");
        else if(n1+n2+n3 == 180 && (n1==n2 || n1==n3 || n2==n3) )
            System.out.println("Isosceles");
        else if(n1+n2+n3 == 180 && (n1!=n2 || n1!=n3 || n2!=n3) )
            System.out.println("Scalene");
        else System.out.println("Error");

        br.close();
    }
}