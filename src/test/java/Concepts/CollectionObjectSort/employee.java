package Concepts.CollectionObjectSort;

import java.util.Comparator;
import java.util.Objects;

public class employee implements Comparable<employee>{
    String name;   
	int id;
	
	public employee(){
		
	}
	public employee(int id,String name){
			this.name= name;
			this.id=id;
		}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ",name=" + name + "]";
	}
	
	 @Override
		public int hashCode() {
			return Objects.hash(id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			employee other = (employee) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
		@Override
		public int compareTo(employee emp) {
			
			return (this.id-emp.id);
		}
		
		public static Comparator<employee> nameCamparator = new Comparator<employee>() {

			@Override
			public int compare(employee e1, employee e2) {
				
				return e1.name.compareTo(e2.name);
			}
			
			
		};

}
