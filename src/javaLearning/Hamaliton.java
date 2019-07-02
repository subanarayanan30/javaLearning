package javaLearning;
//import for Scanner and other utility classes
import java.util.*;
public class Hamaliton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Scanner
	      Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      int arr[] = new int[n];
	      for(int i=0;i<n;i++){
	          arr[i] = s.nextInt();
	      }
	      int max = Integer.MIN_VALUE;
	      List<Integer> aList = new ArrayList<>();
	      for(int i=arr.length -1; i >=0; i--){
	          int ss = arr[i];
	          if(ss >= max){
	              max = ss;
	              aList.add(ss);
	          }
	      }
	      for(int j = aList.size() -1; j >=0;j--){
	          System.out.print(aList.get(j)+" ");
	      }
	}

}

