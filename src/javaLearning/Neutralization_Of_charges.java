package javaLearning;
import java.util.*;
public class Neutralization_Of_charges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String str;
        int n = sc.nextInt();
        str = sc.next();
        char[] realChar = str.toCharArray();
        char[] finalChar = new char[str.length()];
        int top = -1;
        top = push(finalChar, top, realChar[0]);
        for(int i=1;i<str.length();i++){
                if((top >=0) && (finalChar[top] == realChar[i])){
                    top = pop(top);
                }else{
                    top = push(finalChar, top, realChar[i]);
                }
        }
        StringBuilder st = new StringBuilder();
        for(int i=0;i<=top;i++){
            st.append(String.valueOf(finalChar[i]));    
        }
        System.out.println(st.length());
        System.out.println(st.toString());
    
	}
	 private static int push(char[] finalChar, int top, char realChar){
	        top++;
	        finalChar[top] = realChar;
	        return top;
	    }
	    private static int pop(int top){
	        top--;
	        return top;
	    }
}

/*
 * I/P: 12
 *      aaacccbbcccd
 * O/P: 2
 *      ad
 * */
