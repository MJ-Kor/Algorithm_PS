import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            if(s.equals(".")) break;				
            Stack<Character> stack = new Stack<>();		
            String result = "yes";

            for(int i = 0; i<s.length(); i++){
                char c = s.charAt(i);				
                if(c == '(' || c == ')' || c == '[' || c == ']'){
                    if(stack.isEmpty()){
                        if(c == ')' || c==']') {
                            result = "no";
                            break;
                        }
                        stack.push(c);
                    }
                    else{
                        if(c == '(' || c == '[') stack.push(c);		
                        if(c == ')'){					
                            char before = stack.pop();			
                            if(before != '(') result = "no";		
                        }
                        else if(c == ']'){				
                            char before = stack.pop();		
                            if(before != '[') result = "no";		
                        }
                    }
                } 
                else continue;
            }
            if(!stack.isEmpty()) result = "no";
            System.out.println(result);
        }
        br.close();
    }
}