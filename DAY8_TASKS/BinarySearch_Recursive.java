package day01;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch_Recursive {
	public static void main(String[] args)
	{
		int[] arr= {34,45,2,1,4,5,90,67,48};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to be found:");
		int n=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		int mid;
		boolean flag=true;
		while(left<=right)
		{
			//0+9=9/2=5
			//At index 5 , the value is 5
			mid=(left+right)/2;
			if(arr[mid]==n)
			{
				System.out.println("Value found"+arr[mid]+"at index"+mid);
				flag=true;
				break;
			}
			else if(n>arr[mid])
			{
				left=mid+1;
			}
			else if(n<arr[mid])
			{
				right=mid-1;
			}
			
			
		}
		if(flag==false) {
		System.out.println("Value not found");
	}
		sc.close();}

}
