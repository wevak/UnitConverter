package sub;
import java.util.Scanner;
public class Mass
{
	static double a,b;
	//static BigDecimal unit;
	static Scanner s=new Scanner(System.in);
		//	Milligram convertion--------------------------------------- 
	static double mtog(double x)	// to gram
	{
		a=x/1000;
		return a;
	}
	static double mtokg(double x)	// to Kilogram
	{
		a=x/1000000;
		return a;
	}
	static double mtot(double x)	// to Ton
	{
		a=x/1000000000;
		return a;
	}
	static double  mtoq(double x)	// ton to Quntial
	{
		a=x/10000000;
		return a;
	}
	static double mtop(double x)	// to Pound
	{
		a=x/453592.37;
		return a;
	}
	static double mtoo(double x)	// to Ounce
	{
		a=x/28349.523;
		return a;
	}
	static double mtolt(double x)	// to UK Ton
	{
		a=x/1016046908.8;
		return a;
	}
	static double mtost(double x)	// to US Ton
	{
		a=x/907184740;
		return a;
	}
		//		Gram convertion------------------------------------
	static double gtom(double x)	// to Milligram
	{
		a=x*1000;
		return a;
	}
	static void gtokg(double x)	// to Kilogram
	{
		b=gtom(x);
		mtokg(b);
	}
	static void gtot(double x)	// to Ton
	{
		b=gtom(x);
		mtot(b);
	}
	static void gtoq(double x)	// to Quintal
	{
		b=gtom(x);
		mtoq(b);
	}
	static void  gtop(double x)	// to Pound
	{
		b=gtom(x);
		mtop(b);
	}
	static void  gtoo(double x)	// to Ounce
	{
		b=gtom(x);
		mtoo(b);
	}
	static void  gtolt(double x)	// to Long Ton
	{
		b=gtom(x);
		mtolt(b);
	}
	static void  gtost(double x)	// to Short Ton
	{
		b=gtom(x);
		mtost(b);
	}
	//		Kilogram convertion--------------------------------------------------
	static double kgtom(double x)	// to Milligram
	{
		a=x*1000000;
		return a;
	}
	static void kgtog(double x)	// to gram
	{
		b=kgtom(x);
		mtokg(b);
	}
	static void kgtot(double x)	// to Ton
	{
		b=kgtom(x);
		mtot(b);
	}
	static void kgtoq(double x)	// to Quintal
	{
		b=kgtom(x);
		mtoq(b);
	}
	static void kgtop(double x)	// to Pound
	{
		b=kgtom(x);
		mtop(b);
	}
	static void kgtoo(double x)	// to Ounce
	{
		b=kgtom(x);
		mtoo(b);
	}
	static void kgtolt(double x)	// to Long Ton
	{
		b=kgtom(x);
		mtolt(b);
	}
	static void kgtost(double x)	// to Long Ton
	{
		b=kgtom(x);
		mtost(b);
	}
	//		Ton convertion--------------------------------------------------
	static double ttom(double x)	// to Milligram
	{
		a=x*1000000000;
		return a;
	}
	static void ttog(double x)	// to gram
	{
		b=ttom(x);
		mtokg(b);
	}
	static void ttokg(double x)	// to Kilogram
	{
		b=ttom(x);
		mtot(b);
	}
	static void ttoq(double x)	// to Quintal
	{
		b=ttom(x);
		mtoq(b);
	}
	static void ttop(double x)	// to Pound
	{
		b=ttom(x);
		mtop(b);
	}
	static void ttoo(double x)	// to Ounce
	{
		b=ttom(x);
		mtoo(b);
	}
	static void ttolt(double x)	// to Long Ton
	{
		b=ttom(x);
		mtolt(b);
	}
	static void ttost(double x)	// to Short Ton
	{
		b=ttom(x);
		mtost(b);
	}
	//		Quintal convertion--------------------------------------------------
	static double qtom(double x)	// to Milligram
	{
		a=x*100000000;
		return a;
	}
	static void qtog(double x)	// to gram
	{
		b=qtom(x);
		mtog(b);
	}
	static void qtokg(double x)	// to Kilogram
	{
		b=qtom(x);
		mtokg(b);
	}
	static void qtot(double x)	// to Ton
	{
		b=qtom(x);
		mtot(b);
	}
	static void qtop(double x)	// to Pound
	{
		b=qtom(x);
		mtop(b);
	}
	static void qtoo(double x)	// to Ounce
	{
		b=qtom(x);
		mtoo(b);
	}
	static void qtolt(double x)	// to Long Ton
	{
		b=qtom(x);
		mtolt(b);
	}
	static void qtost(double x)	// to Shot Ton
	{
		b=qtom(x);
		mtost(b);
	}
	//		Pound convertion--------------------------------------------------
	static double ptom(double x)	// to Milligram
	{
		a=x*453592.37;
		return a;
	}
	static void ptog(double x)	// to gram
	{
		b=ptom(x);
		mtog(b);
	}
	static void ptokg(double x)	// to Kilogram
	{
		b=ptom(x);
		mtokg(b);
	}
	static void ptot(double x)	// to Ton
	{
		b=ptom(x);
		mtot(b);
	}
	static void ptoq(double x)	// to Quntial
	{
		b=ptom(x);
		mtop(b);
	}
	static void ptoo(double x)	// to Ounce
	{
		b=ptom(x);
		mtoo(b);
	}
	static void ptolt(double x)	// to Long Ton
	{
		b=ptom(x);
		mtolt(b);
	}
	static void ptost(double x)	// to Shot Ton
	{
		b=ptom(x);
		mtost(b);
	}
	//		Ounce convertion--------------------------------------------------
	static double otom(double x)	// to Milligram
	{
		a=x*28349.523;
		return a;
	}
	static void otog(double x)	// to gram
	{
		b=otom(x);
		mtog(b);
	}
	static void otokg(double x)	// to Kilogram
	{
		b=otom(x);
		mtokg(b);
	}
	static void otot(double x)	// to Ton
	{
		b=otom(x);
		mtot(b);
	}
	static void otoq(double x)	// to Quntial
	{
		b=otom(x);
		mtoq(b);
	}
	static void otop(double x)	// to Pound
	{
		b=otom(x);
		mtop(b);
	}
	static void otolt(double x)	// to Long Ton
	{
		b=otom(x);
		mtolt(b);
	}
	static void otost(double x)	// to Shot Ton
	{
		b=otom(x);
		mtost(b);
	}

	//		Long Ton convertion--------------------------------------------------
	static double lttom(double x)	// to Milligram
	{
		a=x*1016046908.8;
		return a;
	}
	static void lttog(double x)	// to gram
	{
		b=lttom(x);
		mtog(b);
	}
	static void lttokg(double x)	// to Kilogram
	{
		b=lttom(x);
		mtokg(b);
	}
	static void lttot(double x)	// to Ton
	{
		b=lttom(x);
		mtot(b);
	}
	static void lttoq(double x)	// to Quntial
	{
		b=lttom(x);
		mtoq(b);
	}
	static void lttop(double x)	// to Pound
	{
		b=lttom(x);
		mtop(b);
	}
	static void lttoo(double x)	// to Ounce
	{
		b=lttom(x);
		mtoo(b);
	}
	static void lttost(double x)	// to Shot Ton
	{
		b=lttom(x);
		mtost(b);
	}
	//		Short Ton convertion--------------------------------------------------
	static double sttom(double x)	// to Milligram
	{
		a=x*907184740;
		return a;
	}
	static void sttog(double x)	// to gram
	{
		b=sttom(x);
		mtog(b);
	}
	static void sttokg(double x)	// to Kilogram
	{
		b=sttom(x);
		mtokg(b);
	}
	static void sttot(double x)	// to Ton
	{
		b=sttom(x);
		mtot(b);
	}
	static void sttoq(double x)	// to Quntial
	{
		b=sttom(x);
		mtoq(b);
	}
	static void sttop(double x)	// to Pound
	{
		b=sttom(x);
		mtop(b);
	}
	static void sttoo(double x)	// to Ounce
	{
		b=sttom(x);
		mtoo(b);
	}
	static void sttolt(double x)	// to Long Ton
	{
		b=sttom(x);
		mtolt(b);
	}
	public static void input()
	{
		System.out.println("Enter value to convert");
		a=s.nextDouble();
	}

	static void output(double x)
	{
		System.out.println("unit="+x);
	}
	public static void main(String args[])
	{
		while(true)
		{
			int c1,c2;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nMASS CONVERTOR");
			System.out.println("1.Milligram\n2.Gram\n3.Kilogarm\n4.Ton\n5.Quintal\n6.Pound\n7.Ounce\n8.Long ton\n9.Short ton\n10.Exit");
			System.out.print("Convert From:");
			c1=s.nextInt();
			if(c1==10)
			{
				System.exit(0);
			}
			
			System.out.print("Convert To:");
			c2=s.nextInt();
			
			if(c1==10)
			{
				System.exit(0);
			}

			//		Milligram--------------------------------
			if (c1==1 && c2==2)
			{
				input();
				mtog(a);
			}
			if(c1==1 && c2==3)
			{
				input();
				mtokg(a);
			}
			if(c1==1 && c2==4)
			{
				input();
				mtot(a);
			}
			if(c1==1 && c2==5)
			{
				input();
				mtoq(a);
			}
			if(c1==1 && c2==6)
			{
				input();
				mtop(a);
			}
			if(c1==1 && c2==7)
			{
				input();
				mtoo(a);
			}
			if(c1==1 && c2==8)
			{
				input();
				mtolt(a);
			}
			if(c1==1 && c2==9)
			{
				input();
				mtost(a);
			}
			//	Gram Convertion----------------------------
			if(c1==2 && c2==1)
			{
				input();
				gtom(a);
			}
			if(c1==2 && c2==3)
			{
				input();
				gtokg(a);
			}
			if(c1==2 && c2==4)
			{
				input();
				gtot(a);
			}
			if(c1==2 && c2==5)
			{
				input();
				gtoq(a);
			}
			if(c1==2 && c2==6)
			{
				input();
				gtop(a);
			}
			if(c1==2 && c2==7)
			{
				input();
				gtoo(a);
			}
			if(c1==2 && c2==8)
			{
				input();
				gtolt(a);
			}
			if(c1==2 && c2==9)
			{
				input();
				gtost(a);
			}
			//	Kilogram Convertion----------------------------
			if(c1==3 && c2==1)
			{
				input();
				kgtom(a);
			}
			if(c1==3 && c2==2)
			{
				input();
				kgtog(a);
			}
			if(c1==3 && c2==4)
			{
				input();
				kgtot(a);
			}
			if(c1==3 && c2==5)
			{
				input();
				kgtoq(a);
			}
			if(c1==3 && c2==6)
			{
				input();
				kgtop(a);
			}
			if(c1==3 && c2==7)
			{
				input();
				kgtoo(a);
			}
			if(c1==3 && c2==8)
			{
				input();
				kgtolt(a);
			}
			if(c1==3 && c2==9)
			{
				input();
				kgtost(a);
			}
		//	Ton Convertion----------------------------
			if(c1==4 && c2==1)
			{
				input();
				ttom(a);
			}
			if(c1==4 && c2==2)
			{
				input();
				ttog(a);
			}
			if(c1==4 && c2==3)
			{
				input();
				ttokg(a);
			}
			if(c1==4 && c2==5)
			{
				input();
				ttoq(a);
			}
			if(c1==4 && c2==6)
			{
				input();
				ttop(a);
			}
			if(c1==4 && c2==7)
			{
				input();
				ttoo(a);
			}
			if(c1==4 && c2==8)
			{
				input();
				ttolt(a);
			}
			if(c1==4 && c2==9)
			{
				input();
				ttost(a);
			}
			//	Quntial Convertion----------------------------
			if(c1==5 && c2==1)
			{
				input();
				qtom(a);
			}
			if(c1==5 && c2==2)
			{
				input();
				qtog(a);
			}
			if(c1==5 && c2==3)
			{
				input();
				qtokg(a);
			}
			if(c1==5 && c2==4)
			{
				input();
				qtot(a);
			}
			if(c1==5 && c2==6)
			{
				input();
				qtop(a);
			}
			if(c1==5 && c2==7)
			{
				input();
				qtoo(a);
			}
			if(c1==5 && c2==8)
			{
				input();
				qtolt(a);
			}
			if(c1==5 && c2==9)
			{
				input();
				qtost(a);
			}
			//		Pound Convertion--------------------------------
			if (c1==6 && c2==1)
			{
				input();
				ptom(a);
			}
			if (c1==6 && c2==2)
			{
				input();
				ptog(a);
			}
			if(c1==6 && c2==3)
			{
				input();
				ptokg(a);
			}
			if(c1==6 && c2==4)
			{
				input();
				ptot(a);
			}
			if(c1==6 && c2==5)
			{
				input();
				ptoq(a);
			}
			if(c1==6 && c2==7)
			{
				input();
				ptoo(a);
			}
			if(c1==6 && c2==8)
			{
				input();
				ptolt(a);
			}
			if(c1==6 && c2==9)
			{
				input();
				ptost(a);
			}
			//		Ounce Convertion--------------------------------
			if (c1==7 && c2==1)
			{
				input();
				otom(a);
			}
			if (c1==7 && c2==2)
			{
				input();
				otog(a);
			}
			if(c1==7 && c2==3)
			{
				input();
				otokg(a);
			}
			if(c1==7 && c2==4)
			{
				input();
				otot(a);
			}
			if(c1==7 && c2==5)
			{
				input();
				otoq(a);
			}
			if(c1==7 && c2==6)
			{
				input();
				otop(a);
			}
			if(c1==7 && c2==8)
			{
				input();
				otolt(a);
			}
			if(c1==7 && c2==9)
			{
				input();
				otost(a);
			}
			//		Long Ton--------------------------------
			if (c1==8 && c2==1)
			{
				input();
				lttom(a);
			}
			if (c1==8 && c2==2)
			{
				input();
				lttog(a);
			}
			if(c1==8 && c2==3)
			{
				input();
				lttokg(a);
			}
			if(c1==8 && c2==4)
			{
				input();
				lttot(a);
			}
			if(c1==8 && c2==5)
			{
				input();
				lttoq(a);
			}
			if(c1==8 && c2==6)
			{
				input();
				lttop(a);
			}
			if(c1==8 && c2==7)
			{
				input();
				lttoo(a);
			}
			if(c1==8 && c2==9)
			{
				input();
				lttost(a);
			}
			//		Short Ton--------------------------------
			if (c1==9 && c2==1)
			{
				input();
				sttom(a);
			}
			if (c1==9 && c2==2)
			{
				input();
				sttog(a);
			}
			if(c1==9 && c2==3)
			{
				input();
				sttokg(a);
			}
			if(c1==9 && c2==4)
			{
				input();
				sttot(a);
			}
			if(c1==9 && c2==5)
			{
				input();
				sttoq(a);
			}
			if(c1==9 && c2==6)
			{
				input();
				sttop(a);
			}
			if(c1==9 && c2==7)
			{
				input();
				sttoo(a);
			}
			if(c1==9 && c2==8)
			{
				input();
				sttolt(a);
			}
			output(a);
			
		}
	}
}