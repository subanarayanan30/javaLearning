package javaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaRegex {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		boolean flag = MyRegex.isValipdIpAddr(str);
//		System.out.println(flag);
//	}
//	private static class MyRegex{
//		public MyRegex() {}
//		public static boolean isValipdIpAddr(String str) {
//			String[] subs = str.split("\\.");
//			if(subs.length > 4 || subs.length < 4) {
//				return false;
//			}else {
//				int count =0;
//				for(int i=0;i<subs.length;i++) {
//					List<Character> charList = subs[i].chars().mapToObj(c -> (char)c).collect(Collectors.toList());
//					int charSize = charList.stream().filter(c -> c.isDigit(c)).collect(Collectors.toList()).size();
//					if(charSize == charList.size()) {
//						if(Integer.parseInt(subs[i]) >=0 && Integer.parseInt(subs[i]) <= 255) {
//							count++;
//						}	
//					}else {
//						return false;
//					}
//				}
//				if(count == 4) {
//					return true;
//				}else {
//					return false;
//				}
//			}
//		}
//	}
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
}
 class MyRegex{
	String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	MyRegex(){}
	
}