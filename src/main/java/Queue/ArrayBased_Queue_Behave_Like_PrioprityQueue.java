package Queue;


public class ArrayBased_Queue_Behave_Like_PrioprityQueue {
	int rear;
	int[] a;
			
	public ArrayBased_Queue_Behave_Like_PrioprityQueue(int size){
		rear =-1;
		this.a= new int[size];
	}
	
	public void Enqueue(int value) {
		if(rear == -1)
		{
			rear++;
			a[rear]=value;
		}else {
			for(int i=rear;i>=0;i--) {
				if(a[i]>value) {
					a[i+1]=a[i];
					if(i==0) {
						a[i]=value;
					}
				}else {
					a[i+1]=value;
					break;
				}
			}
			rear++;
		}
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

		ArrayBased_Queue_Behave_Like_PrioprityQueue f =new ArrayBased_Queue_Behave_Like_PrioprityQueue(10);
        f.Enqueue(5);
        f.Enqueue(30);
        f.Enqueue(20);
        f.Enqueue(10);
        f.Enqueue(15);

        //f.printQueue();
       // f.Dqueue();
       // f.printQueue();
       // f.Dqueue();
       // f.Dqueue();
        f.printQueue();

	}

}
