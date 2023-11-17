package code_Practice;

import java.util.ArrayList;
import java.util.List;

public class Removing_Element_From_List {
	
	//We have one list and there is one loop which is removing element..
	// what will be the output

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(10);
		System.out.println(" Before list :"+list);
		
		for(int i=0;i<list.size();i++) {
			list.remove(i);
		}

		System.out.println(" After delete :"+list);
	}

}
