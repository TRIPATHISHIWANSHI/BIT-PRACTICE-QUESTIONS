package Strings;
/*
Question: Given a non-negative integer n, find the number of integers x such that 0 <= x <= n and n & x == x
Input: n = 5
Output: 4
Explanation: The integers x that satisfy the condition are 0, 1, 4, and 5.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfIntegers 
{
	static ArrayList<Integer> numberOfintegers(int n) {
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			if((n&i)==i) {
				a.add(i);
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// to check =>System.out.println((5&0)+" "+(5&1)+" "+(5&2)+" "+(5&3)+" "+(5&4)+" "+(5&5));
		System.out.println("ENTER AN INTEGER:");
		int n=sc.nextInt();
		System.out.println("OUTPUT:");
		 System.out.println(numberOfintegers(n));
	}

}
