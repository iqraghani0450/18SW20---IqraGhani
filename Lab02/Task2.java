class Task2
{
public static void main(String args[])
{
int a,b;
a=7;
b=17;
	System.out.println("RELATIONAL OPERATORS");
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);

boolean c,d,e;
c=true;
d=false;

	System.out.println("BOOLEAN OPERATORS");
	System.out.println(e=c|d);
	System.out.println(e=c&d);
	if(a==0 || a/7>3)
	{
		System.out.println("SHORT CIRCUIT OR");
	}
	if(a==0 || a/7<3)
	{
		System.out.println("SHORT CIRCUIT AND");
	}
}
}
	
