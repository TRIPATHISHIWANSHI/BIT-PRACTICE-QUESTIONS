package bits;
import java.util.*;
public class menu_driven_bit_manipulation {

	static Scanner sc=new Scanner(System.in);

	static void check_odd_or_even() {
		System.out.println("ENTER A NUMBER:");
		int num=sc.nextInt();
		if((num&1)==0) {
			System.out.println(num+" IS AN EVEN NUMBER");
		}
		else if((num&1)==1) {
			System.out.println(num+" IS AN ODD NUMBER");
		}
		
	}
	private static void find_ith_bit() {
		System.out.println("ENTER A NUMBER:");
		int num=sc.nextInt();
		System.out.println("WHICH ITH BIT YOU WANT?");
		int k=sc.nextInt();
		int res=(1<<k)&num;
		if(res==0) {
			System.out.println(k+"th bit is 0");
		}
		else {
			System.out.println(k+"th bit iis 1");
		}
		
	}
	private static void set_the_bit() {
	    System.out.println("ENTER A NUMBER:");
	    int num = sc.nextInt();
	    System.out.println("ENTER THE POSITION:");
	    int position = sc.nextInt();
	    System.out.println("ENTER THE BIT (0 or 1):");
	    int bit = sc.nextInt();

	    int mask = 1 << position;
	    System.out.println("Modified number: " + (num|mask));
	}

	
	private static void clear_the_bit() {
		System.out.println("ENTER A NUMBER:");
		int num=sc.nextInt();
		System.out.println("WHICH ITH BIT YOU WANT TO CLEAR?");
		int k=sc.nextInt();
		int temp=~(1<<k);
		int res=num&temp;
		//System.out.println(res);
		String bitString = Integer.toBinaryString(res);
        System.out.println("Binary representation: " + bitString);
	}
	private static void power_of_2() {
		System.out.println("ENTER A NUMBER:");
		int num=sc.nextInt();
		int num2=num-1;
		int res=num&num2;
		if(res==0) {
			System.out.println(num+" IS POWER OF 2");
		}
		else {
			System.out.println(num+" IS NOT POWER OF 2");
		}	
	}
	private static void clear_last_bit() 
	{
		System.out.println("ENTER A NUMBER:");
		int num=sc.nextInt();
		 num = num & ~(1 << 0);
		 System.out.println("Modified number: " + num);
		
	}
	private static void compare_the_signBit() {
		System.out.println("ENTER FIRST NUMBER:");
		int x=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER:");
		int y=sc.nextInt();
		int sign_bit_x=(x&(1<<31));
		int sign_bit_y=(y&(1<<31));
		int sign_x=sign_bit_x==0?0:1;
		int sign_y=sign_bit_y==0?0:1;
		if((sign_x ^sign_y)==0) {
			System.out.println("SAME");
		}
		else if((sign_x^ sign_y)==1) {
			System.out.println("DIFFERENT");
		}
		
	}
	private static void clear_LSB() {
		System.out.println("ENTER FIRST NUMBER:");
		int num=sc.nextInt();
		num = num & (num - 1);                 
	    System.out.println("Modified number: " + num);
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("MENU");
		System.out.println("1.O CHECK GIVEN NUMBER IS ODD OR EVEN\n2.FIND THE ITH BIT\n3. SET THE BIT\n4.CLEAR THE BIT\n5.POWER OF 2\n6.CLEAR LAST BIT\n7.CHECK THE SIGN BIT IS SAME OR DIFFERENT\n8.CLEAR THE LEAST SIGNIFICANT BIT\n");
		System.out.println("ENTER THE CHOICE:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			check_odd_or_even();
			break;
		case 2:
			find_ith_bit();
			break;
		case 3:
			set_the_bit();
			break;
		case 4:
			clear_the_bit();
			break;
		case 5:
			power_of_2();
			break;
		case 6:
			clear_last_bit();
			break;
		case 7:
			compare_the_signBit();
			break;
		case 8:
			clear_LSB();
			break;	
		}	
	}
	}
}
