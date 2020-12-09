public class test2
{
	public static void main(String args[])
	{
		int x=5;
		int y=6;
		test2.printtable(x,y);


		test2.printtable(3,2);


		test2.printtable(2,2);
	}
	public static void printtable(int x, int y)
	{
		int mul=0;
		if(x>y)
		{
			for(int i=1;i<=x;i++)
			{
				mul=y*i;
				System.out.println(y+"*"+i+"="+mul);
			}
		}
		else if(x<y)
		{
			for(int i=1;i<=y;i++)
			{
				mul=x*i;
				System.out.println(x+"*"+i+"="+mul);
			}
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
