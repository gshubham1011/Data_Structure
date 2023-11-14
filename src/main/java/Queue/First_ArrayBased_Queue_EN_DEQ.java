package Queue;

import java.util.Arrays;

public class First_ArrayBased_Queue_EN_DEQ {
	int rear;
	static int[] a;
			
	public First_ArrayBased_Queue_EN_DEQ(int size){
		rear =-1;
		this.a= new int[size];
	}
	
	public void Enqueue(int value) {
		rear++;
		a[rear] = value;		
	}
	
	public int Dqueue() {
		int ele =a[0];
		for(int i=0;i<rear;i++) {
			a[i]=a[i+1];
		}
		rear--;
		return ele;
	}
	
	public void printQueue() {
		for(int i=0;i<=rear;i++) {
			System.out.println(a[i]);
		}
	}
	

	public static void main(String[] args) {

		First_ArrayBased_Queue_EN_DEQ f =new First_ArrayBased_Queue_EN_DEQ(10);
        f.Enqueue(5);
        f.Enqueue(15);
        f.Enqueue(10);
        f.Enqueue(20);
        f.Enqueue(30);

        //f.printQueue();
        f.Dqueue();
       // f.printQueue();
        f.Dqueue();
        f.Dqueue();
        f.printQueue();

	}

}
