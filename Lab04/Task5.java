class Task5
{
	public static void main(String args[])
	{
		int a[]={1,4,3,2,6,5,8,7,9,0,2,4};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		System.out.print("Largest value is: "+a[a.length-1]);
	}
}