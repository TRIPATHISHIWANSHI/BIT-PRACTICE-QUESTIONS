package bits;
/*
Question: Given an array of integers, find the maximum bitwise AND value of any two integers in the array.
Input: [3, 5, 8, 10, 12]
Output: 8
Explanation: The maximum bitwise AND value of any two integers in the array is 8, which is the result of the bitwise AND operation between 10 (1010 in binary) and 12 (1100 in binary).*/
import java.util.*;
public class maximumBitwiseAndInArray {

	static int MaxValue(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i] & arr[j];
				if(max<temp) {
					max=temp;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SIZE OF ARRAY:");
		int n=sc.nextInt();
		int a[]=new int[100];
		System.out.println("ENTER ELEMENTS OF ARRAY:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("MAXIMUM :"+MaxValue(a));

	}

}
