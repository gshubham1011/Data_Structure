package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MatchTarget {

	public static void main(String[] args) {
		int[]  a = {2,7,6,8 }; // target = 9 (2+7)
	    int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++) {
        	map.put(a[i],i);			
		}
       
        for(int i=0;i<map.size();i++) {
        	int p = target - a[i];
        	System.out.println(" P "+p);
        	if(map.containsValue(p) && p!=a[i]) {
        		 System.out.println(" indexs are :"+i +" & "+map.get(p));
        		 break;
        	}
        }
	}

}
