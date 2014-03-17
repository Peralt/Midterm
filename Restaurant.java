import java.util.*;

public class Restaurant{

public static void main( String[] args ){

double B1, F2, SD3, AP4, MS5, MN6, H7;
float bigmacm=0, friesm=0, drinkm=0, applepiem=0, milkshakem=0, mcnuggetsm=0, hamburgerm=0, price=0, taxed=0;

 
 B1=5.90;
 F2=2.00;
 SD3=1.79;
 AP4=1.00;
 MS5=2.67;
 MN6=4.50; 
 H7=.89;


Scanner scan;

scan=new Scanner(System.in);

System.out.println( " BigMacs are $5.90" );
System.out.println( " Fries are $2.00" );
System.out.println( " Soft drinks are $1.79" );
System.out.println( " Apple pies are $1.00" );
System.out.println( " Milk Shakes are $2.67" );
System.out.println( " Mcnuggets are $4.50" );
System.out.println( " Hamburgers are $.89" );

System.out.println( " B1=BigMac" );
System.out.println( " F2=Fries" );
System.out.println( " SD3=Soft Drink" );
System.out.println( " AP4=ApplePie" );
System.out.println( " MS5=MilkShake" );
System.out.println( " MN6=McNuggets" );
System.out.println( " H7=Hamburger" );

System.out.println( " Enter your order" );
String order1=scan.nextLine();

if ( order1.equals("B1") ){
System.out.println("Insert Quantity of Bigmacs");
			float bigmacq=scan.nextInt();
			bigmacm=(float)(5.90*bigmacq);
			
}

if ( order1.equals("F2") ){
System.out.println("Insert Quantity of Fries");
			float friesq=scan.nextInt();
			bigmacm=(float)(2.00*friesq);
			
}

if ( order1.equals("SD3") ){
System.out.println("Insert Quantity of Drinks");
			float drinkq=scan.nextInt();
			drinkm=(float)(1.79*drinkq);
			
}

if ( order1.equals("AP4") ){
System.out.println("Insert Quantity of Apples Pies");
			float applepieq=scan.nextInt();
			applepiem=(float)(1.00*applepieq);
			
}

if ( order1.equals("MS5") ){
System.out.println("Insert Quantity of Milkshakes");
			float milkshakeq=scan.nextInt();
			milkshakem=(float)(2.67*milkshakeq);
			
}

if ( order1.equals("MN6") ){
System.out.println("Insert Quantity of McNuggetst");
			float mcnuggetsq=scan.nextInt();
			mcnuggetsm=(float)(4.50*mcnuggetsq);
			
}

if ( order1.equals("H7") ){
System.out.println("Insert Quantity of Hamburgers");
			float hamburgerq=scan.nextInt();
			hamburgerm=(float)(.89*hamburgerq);
		
}

price=bigmacm+friesm+drinkm+applepiem+milkshakem+mcnuggetsm+hamburgerm;
	taxed=(float)(price*0.06)+price;
	System.out.println("The total of your order is: $" +taxed);


}
}



