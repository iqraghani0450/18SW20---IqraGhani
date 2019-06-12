class Main
{
	public static void main(String args[])
	{
		int n=20;
		char c='I';
		Print a=new Print(n,c);
		System.out.println("Using \"int , char\" method");
		a.method(n,c);
		System.out.println("Using \"char , int\" method");
		a.method(c,n);
	}
}