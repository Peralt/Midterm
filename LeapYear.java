import java.util.*;

public class LeapYear{
	public static void main(String args[]){
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		int year;
		
		System.out.println("Enter a year post 1582 to figure out if it's a leap year or not (1582 to quit): ");
		year=scan.nextInt();
		
		if(year>1582)
		{
			if(year%4==0)
			{
				if(year%100!=0)
				{
					System.out.println("The year "+year+" is a leap year.");
				}
				else
				if(year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("The year "+year+" is a leap year.");
					}
					else
					if(year%400!=0)
					{
						System.out.println("The year "+year+" is not a leap year.");
					}
				}
			}
			else
			if(year%4!=0)
			{
				System.out.println("The year "+year+" is not a leap year.");
			}
		}
		else
		{
			System.out.println("Year has to be higher than 1582.");
		}
		
		while(year>1582)
		{
		
		System.out.println("Enter a year post 1582 to figure out if it's a leap year or not (1582 to quit): ");
		year=scan.nextInt();
		
		if(year>1582)
		{
			if(year%4==0)
			{
				if(year%100!=0)
				{
					System.out.println("The year "+year+" is a leap year.");
				}
				else
				if(year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("The year "+year+" is a leap year.");
					}
					else
					if(year%400!=0)
					{
						System.out.println("The year "+year+" is not a leap year.");
					}
				}
			}
			else
			if(year%4!=0)
			{
				System.out.println("The year "+year+" is not a leap year.");
			}
		}
		else
		{
			System.out.println("Year has to be higher than 1582.");
		}
		}
	}
}




