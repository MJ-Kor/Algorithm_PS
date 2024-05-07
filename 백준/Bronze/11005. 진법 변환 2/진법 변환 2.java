import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //10진수 숫자
        int B = Integer.parseInt(st.nextToken()); //몇진법?

        br.close();

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) { //몫이 0보다 클 경우(더이상 B진법으로 바꿀 수가 없을 경우)
            if (N % B < 10) { //만약 나누었을때 나머지가 10보다 작을 경우
                list.add((char) (N % B + '0')); //그냥 숫자출력
            }
            else{ //10보다 크거나 같을 경우
                /*예를 들어 16진수는 10부터 A이다. 즉 -10을 한담에 그 남은 횟수만큼 헤서 +'A'하면 구해야하는 B진법의 
                 숫자가 나옴*/
                list.add((char) (N % B - 10 + 'A')); 
            }
            N /= B; //B으로 나눔 => B진법의 한자리를 구했기 때문(여기서 한자리는 첫번째 자리가 아니라, 그냥 한칸을 의미)
        }

        for (int i = list.size() - 1; i >= 0; i--) { // 맨처음부터 출력해야하므로
            System.out.print(list.get(i));
        }
    }
}