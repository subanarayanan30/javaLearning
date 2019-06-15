package javaLearning;

import java.util.Scanner;
//Given a range of numbers, we need to find number of beautiful days in the range.
//Beautful Day => |i - reverse(i)| % k == 0
public class BeautifulDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		int beautifulDayCount = 0;
        for(int eachDay = i; eachDay <= j; eachDay++){
            String str = String.valueOf(eachDay);
            StringBuilder s = new StringBuilder();
            s.append(str);
            String revStr = s.reverse().toString();
            int difference = Math.abs(Integer.parseInt(str) - Integer.parseInt(revStr));
            if(difference % k ==0){
                beautifulDayCount++;
            }
        }
        System.out.println(beautifulDayCount);
	}

}
