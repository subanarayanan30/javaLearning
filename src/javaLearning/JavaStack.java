package javaLearning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStack {
	
		public static void main(String []argh)
		{
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNext()) {
				String input=sc.next();
	            //Complete the code
				ArrayDeque<Character> stackDeque = new ArrayDeque<>();
				for(int i=0;i<input.length();i++) {
					if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
						stackDeque.push(input.charAt(i));
					}else {
						if(!stackDeque.isEmpty()) {
							switch(input.charAt(i)) {
								case '}': if(stackDeque.peek() == '{') {
									stackDeque.pop();
								}break;
								case ')': if(stackDeque.peek() == '(') {
									stackDeque.pop();
								}break;
								case ']': if(stackDeque.peek() == '[') {
									stackDeque.pop();
								}break;
							}
						}else {
							stackDeque.push(input.charAt(i));
						}
					}
				}
				System.out.println(stackDeque.isEmpty());
					
			}
		}
}

