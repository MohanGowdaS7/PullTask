public class test3
{
public static void main(String args[])
{
	int m1=5;
	int y1=1995;
	test3.countDays(m1,y1);

	int m2=2;
	int y2=2000;
	test3.countDays(m2,y2);
}
public static void countDays(int x, int y)
{
	int days;
		if(x==2 && y%400==0)
		{
			days=29;
			System.out.println(x+"month"+y+"year="+days+"days");
		}
		else if(x==2 && y%100==0)
		{
			 days=29;
			System.out.println(x+"month"+y+"year="+days+"days");
		}
		else if(x==2 && y%100==0)
		{
			 days=29;
			 System.out.println(x+"month"+y+"year="+days+"days");
		}
		else
		{
		switch(x)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				 days=31;
				System.out.println(x+"month"+y+"year="+days+"days");
				 break;
			case 4:
			case 6:
			case 9:
			case 11:
				 days=30;
				 System.out.println(x+"month"+y+"year="+days+"days");
				 break;
			}
		}
	}
}