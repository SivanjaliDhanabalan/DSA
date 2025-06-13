package day01;

import java.util.Arrays;

public class Queue {
	int []arr=new int[5];
	int rear;
	int front;
	
	public Queue() {
		rear=-1;
		front=-1;
	}
	public void enqueue(int num) {
		if(rear==4)
		{
			System.out.println("Queue Spreadout");		}
		else {
		arr[++rear]=num;
		}
	}
	
	public void dequeue()
	{
		if(front==4)
		{
			System.out.println("Empty queue");
		}
		else {
		arr[++front]=0;
		}
	}
	public void display()
	{
		System.out.println("The queue operations is:" + Arrays.toString(arr));
	}

}
