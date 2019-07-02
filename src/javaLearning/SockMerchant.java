package javaLearning;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> exMap = new HashMap<>();
		Map<Integer,Integer> exMap1 = new HashMap<>();
		exMap.put(1,1);
		exMap.put(2,1);
		exMap.put(3,1);
		exMap.put(4,1);
		
		exMap1.put(1,1);
		exMap1.put(2,2);
		exMap1.put(3,1);
		exMap1.put(4,1);
		
		System.out.println(exMap.equals(exMap1));
	}

}
