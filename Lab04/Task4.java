class Task4
{
	public static void main(String args[])
	{
		int [][] a1={{8,4,2},{9,1,4},{7,2,9}};
		int [][] a2={{9,8,7},{6,5,4},{3,2,1}};
		int [][] a3=new int[3][3];                                                                                                                                                                                                                                                                                                                                                                                                                           
		for(int i=0; i<a1.length; i++)
		{
			for(int j=0; j<a1.length ; j++)
			{
				a3[i][j]=a1[i][j]+a2[i][j];
				System.out.print(a3[i][j]+"  ");
			}
			System.out.println();
		}
								 	
	}
}	