package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array5a {
	
	public static int SecondLargest(int[] arr)
	{
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>0; i--)
		{
			if(arr[i]!= arr[i-1])
			{
				return arr[i-1];
			}
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Array Size:");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Your " + arr.length +" " + " Elements");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter Your" +" " + (i+1) + " " + "Number:");
			
			arr[i] = sc.nextInt();
		}
		
		
		
		System.out.println("The Second Largest Number from user given  Array List is :" + SecondLargest(arr));
	}

}
