import java.util.*;

public class CoinCalculator
{

	public static void main( String[] args )
{

int money, Quarters, Dimes, Nickels, Pennies;

Scanner scan;

scan=new Scanner(System.in);

System.out.println( "Enter amount of change." );
money=scan.nextInt();

 Quarters=money/25;
 money=money-(Quarters*25);

 Dimes=money/10;
 money=money-(Dimes*10);

 Nickels=money/05;
 money=money-(Nickels*05);

 Pennies=money/01;
 money=money-(Pennies*01);


System.out.println( "The amount of quarters is " +Quarters );

System.out.println( "The amount of dimes is " +Dimes );

System.out.println( "The amount of nickels is " +Nickels );

System.out.println( "The amount of pennies is " +Pennies );


	}
}
