class Task6
{
	public static void main(String args[])
	{
		int a[]={5,3,6,7,9,1,0,4,5};
		int c=0;
		int find=Integer.parseInt(args[0]);
		for(int x=0; x<=a.length-1; x++)
		{
			if(a[x]==find)
			{
				System.out.println(find+" found at Array["+x+"]");
				c++;
			}
		}
		if(c==0)
		System.out.print(find+" Not found in array");
	}
}
		
		