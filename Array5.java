package arrays;

import java.util.Arrays;

public class Array5 {

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
		
		System.out.println("Program for Finding Second largest Number in Given Array List\n");
		
		int [] arr = {10,4,5,18,1,54,0};
		
		System.out.println("The Largest Number is :" + SecondLargest(arr) );
		
	}

}
