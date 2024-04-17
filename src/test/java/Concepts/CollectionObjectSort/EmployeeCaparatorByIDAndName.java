package Concepts.CollectionObjectSort;

import java.util.Comparator;

public class EmployeeCaparatorByIDAndName implements Comparator<employee> {

	@Override
	public int compare(employee e1, employee e2) {
		int flag = e1.id - e2.id;
		if(flag==0)
			flag =e1.name.compareTo(e2.name);
					
		return flag;
	}
   
}
