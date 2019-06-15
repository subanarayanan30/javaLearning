package javaLearning;
import java.util.*;

public class JavaDequeue {

	        public static void main(String[] args) {
	            Scanner in = new Scanner(System.in);
	            Deque deque = new ArrayDeque<>();
	            int n = in.nextInt();
	            int m = in.nextInt();
	            HashSet<Integer> uniqueSet = new HashSet<>();
	            int max = Integer.MIN_VALUE;
	            for (int i = 0; i < n; i++) {
	                int num = in.nextInt();
	                deque.add(num);
	                uniqueSet.add(num);
	                if(deque.size() == m) {
	                	if(uniqueSet.size() > max) {
	                		max = uniqueSet.size();
	                	}
	                	int first = (int)deque.removeFirst();
	                	if(!deque.contains(first)) {
	                		uniqueSet.remove(first);
	                	}
	                }
	            }
	           
	            System.out.println(max);
	        }
}
