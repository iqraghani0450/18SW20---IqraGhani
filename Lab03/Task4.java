import java.util.*;
class Task4
{
	public static void main(String args[])
	{
		int no1,no2,total=0;
		char chr;
		no1=Integer.parseInt(args[0]);
		chr=args[1].charAt(0);
		no2=Integer.parseInt(args[2]);

		switch(chr)
		{
			case '+':
			total=no1+no2;
			break;
	
			case '*':
			total=no1*no2;
			break;
	
			case '-':
			total=no1-no2;
			break;
	
			case '/':
			total=no1/no2;
			break;

		}
		System.out.print(total);
	}
}