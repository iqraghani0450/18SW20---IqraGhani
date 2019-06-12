class Task7
{
	public static void main(String agrs[])
	{
		int arr[]={1,4,3,2,6,5,8,7,9,0,2,4};
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr.length-1)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
				j++;
			}
			 i++;
		}
		for(int k=0; k<arr.length; k++)
		System.out.print(arr[k]+" ");
	}
}