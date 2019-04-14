class Task5
{
public static void main(String args[])
{
int a=9;
int b=a|2;
int c=a&2;
int d=~a;
int e=a^6;
int f=a<<8;
int g=a>>8;
int h=a>>>1;
	System.out.println("BITWISE OPERATOR");
	System.out.println("OR OPERATOR: "+b);
	System.out.println("AND OPERATOR: "+c);
	System.out.println("NOT OPERATOR: "+d);
	System.out.println("XOR OPERATOR: "+e);
	System.out.println("LEFT SHIFT: "+f);
	System.out.println("RIGHT SHIFT: "+g);
	System.out.println("UNSIGNED RIGHT SHIFT OPERATOR: "+h);
}
}