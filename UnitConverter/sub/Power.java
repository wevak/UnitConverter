package sub;
import java.util.Scanner;
public class Power
{
	static double a,b;
	static Scanner s=new Scanner(System.in);
	static double wtokw(double x)		// Watt to KiloWatt
	{
		b=x/1000;
		return b;
	}
	static double wtohp(double x)		//Watt to Hp
	{
		b=x/745.7;
		return b;
	}
	static double kwtohp(double x)	//kilowatt to Hp
	{
		b=kwtow(x);
		wtohp(b);
		return b;
	}
	static double hptow(double x)	// Hp to Watt
	{
		b=x*745.7;
		System.out.println("Watt="+b);
		return b;
	}
	static double hptokw(double x)	// Hp to KiloWatt
	{
		b=hptow(x);
		wtokw(b);
		return b;
	}
	
	static double kwtow(double x)	// KiloWatt to Watt
	{
		b=x*1000;
		System.out.println("Watt="+b);
		return b;
	}
	
	static void output(double x)
	{
		System.out.println("Unit="+x);
	}
	
	static void input() 	// 	input function
	{
		System.out.println("Enter value to convert");
		a=s.nextDouble();
	}
	public static void main(String args[])
	{ int c1,c2;
		for(;;)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPOWER CONVERTOR");
			System.out.println("1.Watt\n2.KiloWatt\n3.Horsepower\n4.Exit");
			System.out.print("Convert From:");
			c1=s.nextInt();
			if(c1==4)
			{
				System.exit(0);
			}
			System.out.print("Convert To:");
			c2=s.nextInt();
			//		watt convertion-------------------------------------
			if(c1==1 && c2==2)
			{
				input();
				wtokw(a);
			}
			if(c1==1 && c2==3)
			{
				input();
				wtohp(a);
			}
			//		KiloWatt convertion-------------------------------------
			if(c1==2 && c2==3)
			{
				input();
				kwtohp(a);
			}
			if(c1==2 && c2==1)
			{
				input();
				kwtow(a);
			}
			//		Horsepower convertion-------------------------------------
			if(c1==3 && c2==2)
			{
				input();
				hptokw(a);
			}
			if(c1==3 && c2==1)
			{
				input();
				hptow(a);
			}
			output(b);
		}
		
	}
}