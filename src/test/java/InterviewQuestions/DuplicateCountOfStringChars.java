package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DuplicateCountOfStringChars {

	public static void main(String[] args) {

		 String s = "shubhamSshaaauma";
		 int count ;
		 HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		 for(int i=0;i<s.length();i++) {
			 if(map.containsKey(s.charAt(i))) {
				count= map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			 }else {
				 map.put(s.charAt(i),1);
			 }
		 }

		 System.out.println(map);
		 for (Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue()>1) {
				System.out.println(" key : "+c.getKey() + " Value :"+c.getValue());
			}
			
		}
	}
	

}
