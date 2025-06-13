package day01;

public class Execute_Queue {
	public static void main(String[] args)
	{
		Queue q1=new Queue();
		q1.enqueue(23);
		q1.enqueue(30);
		q1.enqueue(56);
		q1.enqueue(40);
		q1.display();
		q1.dequeue();
		q1.display();
	}

}
