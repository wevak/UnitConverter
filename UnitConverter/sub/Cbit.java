package sub;
import java.math.BigInteger;
import java.util.*;
public class Cbit
{	static BigInteger f =new BigInteger("1");
	static BigInteger f1 ;
	static BigInteger ff =new BigInteger("1024");
	static double m,n,o; 
	static long x,y,z,p,q,r,i;
	static long a;
	static double u;
	public static Scanner s=new Scanner(System.in);
	static void BiToBy(long a)
	{	x=a/8;	 y=a%4;	z=(a%8)/4;
	System.out.println("Byte="+x+"\tnibble="+z+"\t bits="+y);
	}
	static void BiToKb(long a)
	{	x=a/8192;	y=(a%8192)/8; z=(a%8192)%8;
		System.out.println("Kilobyte="+x+"\t byte="+y+"\t bits="+z);
	}
	static void BiToMb(long a)
	{	x=a/8388608;	y=(a%8388608)/8192;		z=((a%8388608)%8192)/8;		p=(((a%8388608)%8192)%8);
		System.out.println("Megabyte="+x+"\t Kilobytes="+y+"\t Bytes="+z+"\t Bits="+p);
	}
	static void BiToGb(long a)
	{	x=a/8589934592l;	y=(a%8589934592l)/8388608;		z=((a%8589934592l)%8388608)/8192;	q=(((a%8589934592l)%8388608)%8192)/8;	p=(((a%8589934592l)%8388608)%8192)%8;
		System.out.println("Gigabyte="+x+"\t Megabytes="+y+"\t KiloBytes="+z+"\t Bytes"+q+"\t Bits="+p);
	} 
	static void BiToTb(double u)
	{
		m=u/8796093022208.0;
		System.out.println("Terabyte"+m);
	}
	static void BiToPb(double u)
	{
		m=u/900719925474015.0;
		System.out.println("Petabyte"+m);
	}
	static void BiToEb(double u)
	{
		m=u/9223372036854718.0;
		System.out.println("Exabyte"+m);
	}
	static void BiToZb(double u)
	{
		m=u/9444732965739221.0;
		System.out.println("Zettabyte"+m);
	}
	static void BiToYb(double u)
	{
		m=u/9671406556917024.0;
		System.out.println("Yottabyte"+m);
	}
	// 	Byte Conversion------------------------------------
	static void ByToKb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("kilobyte="+x+"\t byte="+y);
	}
	static void ByToMb(long a)
	{	x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("Megabyte="+x+"\tKilobytes="+z+"\t byte="+y);
	}
	static void ByToGb(long a)
	{	x=a/1073741824;		z=(a%1073741824)/1048576;	p=((a%1073741824)%1048576)/1024;	y=((a%1073741824)%1048576)%1024;
		System.out.println("Gigabyte="+x+"\tMegabytes="+z+"\tKilobytes"+p+"\t byte="+y);
	}
	static void ByToTb(long a)
	{	x=a/1099511627776l;	y=a%1099511627776l;
		System.out.println("Terabyte="+x+"\t byte="+y);
		x=a/1099511627776l;		z=(a%1099511627776l)/1073741824;	p=((a%1099511627776l)%1073741824)/1048576;	q=(((a%1099511627776l)%1073741824)%1048576)/1024;		y=(((a%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Terabyte="+x+"\t Gigabytes="+z+"\t Megabytes="+p+"\t Kilobytes"+q+"\t Byte="+y);
	}
	static void ByToPb(long a)
		{	x=a/1125899906842624l;	
		z=(a%1125899906842624l)/1099511627776l;
		p=((a%1125899906842624l)%1099511627776l)/1073741824;
		q=(((a%1125899906842624l)%1099511627776l)%1073741824)/1048576;
		r=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;	
		y=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
			System.out.println("Petabyte="+x+"\t Terabyte="+z+"\t Gigabyte="+p+"\t Megabyte="+q+"\t Kilobyte="+r+"\t Byte="+y);
		}
	static void ByToEb(long a)
		{	x=a/1152921504606846976l;			
			z=(a%1152921504606846976l)/1125899906842624l;
			p=((a%1152921504606846976l)%1125899906842624l)/1099511627776l;
			q=(((a%1152921504606846976l)%1125899906842624l)%1099511627776l)/1073741824;
			r=((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)/1048576;
			y=(((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;
			i=(((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
			System.out.println("Exabyte="+x+"\t Petabyte"+z+"\t Terabyte"+p+"\t Gigabyte"+q+"\t Megabyte"+r+"\t Kilobyte="+y+"\t Byte"+i);
		}
	static void ByToZb(double u)
	{
		m=u/118059162071741211.0;
		System.out.println("Zettabyte"+m);
	}
	static void ByToYb(double u)
	{
		m=u/120892581961461324.0;
		System.out.println("Yottabyte"+m);
	}
	// 	Kilobyte Conversion-----------------------------------
	static void KbToMb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("Megabyte="+x+"\t Kilobyte="+y);
	}
	static void KbToGb(long a)
	{
		x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("Gigabyte="+x+"\tMegabytes="+z+"\t Kilobyte="+y);
	}
	static void KbToTb(long a)
	{	
		x=a/1073741824;		z=(a%1073741824)/1048576;	p=((a%1073741824)%1048576)/1024;	y=((a%1073741824)%1048576)%1024;
		System.out.println("Terabyte="+x+"\tGigabytes="+z+"\tMegabytes="+p+"\t Kilobyte="+y);
	}
	static void KbToPb(long a)
	{
		x=a/1099511627776l;		z=(a%1099511627776l)/1073741824;	p=((a%1099511627776l)%1073741824)/1048576;	q=(((a%1099511627776l)%1073741824)%1048576)/1024;		y=(((a%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Petabyte="+x+"\t Terabytes="+z+"\t Gigabytes="+p+"\t Megabytes="+q+"\t Kilobyte="+y);
	}
	static void KbToEb(long a)
	{	x=a/1125899906842624l;	
	z=(a%1125899906842624l)/1099511627776l;
	p=((a%1125899906842624l)%1099511627776l)/1073741824;
	q=(((a%1125899906842624l)%1099511627776l)%1073741824)/1048576;
	r=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;	
	y=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Exabyte="+x+"\t Petabyte="+z+"\t Terabyte="+p+"\t Gigabyte="+q+"\t Megabyte="+r+"\t Kilobyte="+y);
	}
	static void KbToZb(long a)
	{	x=a/1152921504606846976l;			
		z=(a%1152921504606846976l)/1125899906842624l;
		p=((a%1152921504606846976l)%1125899906842624l)/1099511627776l;
		q=(((a%1152921504606846976l)%1125899906842624l)%1099511627776l)/1073741824;
		r=((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)/1048576;
		y=(((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;
		i=(((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Zettabyte="+x+"\t Exabyte"+z+"\t Petabyte"+p+"\t Terabyte"+q+"\t Gigabyte"+r+"\t Megabyte="+y+"\t Kilobyte"+i);
	}
	static void KbToYb(double u)
	{
		m=u/1208925819614624.0;
		System.out.println("Yottabyte"+m);
	}
	// 	Megabyte Conversion------------------------------------
	static void MbToGb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("Gigabyte="+x+"\tremaning Megabyte="+y);
	}
	static void MbToTb(long a)
	{
		x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("Terabyte="+x+"\tGigabytes="+z+"\t Megabyte="+y);
	}
	static void MbToPb(long a)
	{
		x=a/1073741824;		z=(a%1073741824)/1048576;	p=((a%1073741824)%1048576)/1024;	y=((a%1073741824)%1048576)%1024;
		System.out.println("Petabyte="+x+"\tTeraabytes="+z+"\tGigabytes"+p+"\t Megabyte="+y);
	}
	static void MbToEb(long a)
	{
		x=a/1099511627776l;		z=(a%1099511627776l)/1073741824;	p=((a%1099511627776l)%1073741824)/1048576;	q=(((a%1099511627776l)%1073741824)%1048576)/1024;		y=(((a%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Exabyte="+x+"\t Petabytes="+z+"\t Terabytes="+p+"\t Gigabytes"+q+"\t Megabyte="+y);
	}
	static void MbToZb(long a)
	{	x=a/1125899906842624l;			
		z=(a%1125899906842624l)/1099511627776l;
		p=((a%1125899906842624l)%1099511627776l)/1073741824;
		q=(((a%1125899906842624l)%1099511627776l)%1073741824)/1048576;
		r=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;
		y=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Zettabyte="+x+"\t Exaabyte"+z+"\t Petabyte"+p+"\t Terabyte"+q+"\t Gigabyte"+r+"\t Megabyte="+y);
	}
	static void MbToYb(long a)
	{	x=a/1152921504606846976l;			
		z=(a%1152921504606846976l)/1125899906842624l;
		p=((a%1152921504606846976l)%1125899906842624l)/1099511627776l;
		q=(((a%1152921504606846976l)%1125899906842624l)%1099511627776l)/1073741824;
		r=((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)/1048576;
		y=(((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;
		i=(((((a%1152921504606846976l)%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Yottabyte="+x+"\t Zettabyte"+z+"\t Exabyte"+p+"\t Petabyte"+q+"\t Terabyte"+r+"\t Gigabyte="+y+"\t Megabyte"+i);
	}
	// 	Gigabyte Conversion------------------------------------
	static void GbToTb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("Terabyte="+x+"\tremaning Gigabyte="+y);
	}
	static void GbToPb(long a)
	{
		x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("Petabyte="+x+"\tTerabytes="+z+"\t Gigabyte="+y);
	}
	static void GbToEb(long a)
	{
		x=a/1073741824;		z=(a%1073741824)/1048576;	p=((a%1073741824)%1048576)/1024;	y=((a%1073741824)%1048576)%1024;
		System.out.println("Exabyte="+x+"\tPetaabytes="+z+"\tTerabytes"+p+"\t Gigabyte="+y);
	}
	static void GbToZb(long a)
	{
		x=a/1099511627776l;		z=(a%1099511627776l)/1073741824;	p=((a%1099511627776l)%1073741824)/1048576;	q=(((a%1099511627776l)%1073741824)%1048576)/1024;		y=(((a%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Zettabyte="+x+"\tExabytes="+z+"\tPetabytes="+p+"\tTeraabytes"+q+"\t Gigabyte="+y);
	}
	static void GbToYb(long a)
	{	x=a/1125899906842624l;			
		z=(a%1125899906842624l)/1099511627776l;
		p=((a%1125899906842624l)%1099511627776l)/1073741824;
		q=(((a%1125899906842624l)%1099511627776l)%1073741824)/1048576;
		r=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)/1024;
		y=((((a%1125899906842624l)%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("yottabyte="+x+"\t Zettaabyte"+z+"\t Exabyte"+p+"\t Petabyte"+q+"\t Terabyte"+r+"\t Gigabyte="+y);
	}
	// 	Terabyte Conversion------------------------------------
	static void TbToPb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("Petabyte="+x+"\tremaning Terabyte="+y);
	}
	static void TbToEb(long a)
	{	x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("Exabyte="+x+"\tPetabytes="+z+"\t Terabyte="+y);
	}
	static void TbToZb(long a)
	{
		x=a/1073741824;		z=(a%1073741824)/1048576;	p=((a%1073741824)%1048576)/1024;	y=((a%1073741824)%1048576)%1024;
		System.out.println("Zetabyte="+x+"\tExabytes="+z+"\tPetabytes"+p+"\t Terabyte="+y);
	}
	static void TbToYb(long a)
	{	x=a/1099511627776l;		z=(a%1099511627776l)/1073741824;	p=((a%1099511627776l)%1073741824)/1048576;	q=(((a%1099511627776l)%1073741824)%1048576)/1024;		y=(((a%1099511627776l)%1073741824)%1048576)%1024;
		System.out.println("Yottabyte="+x+"\tZettabytes="+z+"\tExabytes="+p+"\tPetabytes"+q+"\t Terabyte="+y);
	}
// 	Petabyte Conversion--------------------------------------------------
	static void PbToEb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("Exabyte="+x+"\tremaning Petabyte="+y);
	}
	static void PbToZb(long a)
	{	x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("Zettabyte="+x+"\tExabytes="+z+"\t Petabyte="+y);
	}
	static void PbToYb(long a)
	{
		x=a/1073741824;		z=(a%1073741824)/1048576;	p=((a%1073741824)%1048576)/1024;	y=((a%1073741824)%1048576)%1024;
		System.out.println("Yottabyte="+x+"\tZettabytes="+z+"\tExabytes"+p+"\t Petabyte="+y);
		
	}
	// 	Exabyte Conversion------------------------------------
	static void EbToZb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("Zettabyte="+x+"\tremaning Petabyte="+y);
	}
	static void EbToYb(long a)
	{	x=a/1048576;	z=(a%1048576)/1024;		y=(a%1048576)%1024;	 
		System.out.println("yottabyte="+x+"\tZettabytes="+z+"\t Exabyte="+y);
	}
	// 	Zettabyte Conversion------------------------------------	
	static void ZbToYb(long a)
	{	x=a/1024;	y=a%1024;
		System.out.println("byte="+x+"\tremaning Petabyte="+y);
	}
	
	///------------------------------Bottom to up--------------------------------
	//	Yottabyte----------------------------------------------	
	static void YbToZb(long a)
	{
		x=a*1024;
		System.out.println("Zettabyte="+x);
	}
	static void YbToEb(long a)
	{
		x=a*1024*1024;
		System.out.println("Exabyte="+x);
	}
	static void YbToPb(long a)
	{
		x=a*1024*1024*1024;
		System.out.println("Petabyte="+x);
	}
	static void YbToTb(long a)
	{
		x=a*1024*1024*1024*1024;
		System.out.println("Terabyte="+x);
	}
	static void YbToGb(long a)
	{
		x=a*1024*1024*1024*1024*1024;
		System.out.println("Gigabyte="+x);
	}
	static void YbToMb(BigInteger f1)
	{
		for(int j=0;j<7;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void YbToKb(BigInteger f1)
	{
		for(int j=0;j<7;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void YbToBy(BigInteger f1)
	{
		for(int j=0;j<8;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void YbToNi(BigInteger f1)
	{
		for(int j=0;j<9;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void YbToBi(BigInteger f1)
	{
		for(int j=0;j<10;j++)
		{
			f1=f1.multiply(ff);
		}
		System.out.println("value is :"+f1);
	}
	//		Zettzbyte----------------------------------------------
	static void ZbToEb(long a)
	{
		x=a*1024;
		System.out.println("Exabyte="+x);
	}
	static void ZbToPb(long a)
	{
		x=a*1024*1024;
		System.out.println("Petabyte="+x);
	}
	static void ZbToTb(long a)
	{
		x=a*1024*1024*1024;
		System.out.println("Terabyte="+x);
	}
	static void ZbToGb(long a)
	{
		x=a*1024*1024*1024*1024;
		System.out.println("Gigabyte="+x);
	}
	static void ZbToMb(long a)
	{
		x=a*1024*1024*1024*1024*1024;
		System.out.println("Megabyte="+x);
	}
	static void ZbToKb(BigInteger f1)
	{
		for(int j=0;j<6;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void ZbToBy(BigInteger f1)
	{
		for(int j=0;j<7;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void ZbToBi(BigInteger f1)
	{
		for(int j=0;j<8;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	//		Exabyte----------------------------------------------
	static void EbToPb(long a)
	{
		x=a*1024;
		System.out.println("Petabyte="+x);
	}
	static void EbToTb(long a)
	{
		x=a*1024*1024;
		System.out.println("Terabyte="+x);
	}
	static void EbToGb(long a)
	{
		x=a*1024*1024*1024;
		System.out.println("Petabyte="+x);
	}
	static void EbToMb(long a)
	{
		x=a*1024*1024*1024*1024;
		System.out.println("Megabyte="+x);
	}
	static void EbToKb(long a)
	{
		x=a*1024*1024*1024*1024*1024;
		System.out.println("Kilobyte="+x);
	}
	static void EbToBy(BigInteger f1)
	{
		for(int j=0;j<6;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void EbToBi(BigInteger f1)
	{
		for(int j=0;j<7;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	//		Petabyte----------------------------------------------
	static void PbToTb(long a)
	{
		x=a*1024;
		System.out.println("Terabyte="+x);
	}
	static void PbToGb(long a)
	{
		x=a*1024*1024;
		System.out.println("Gigabyte="+x);
	}
	static void PbToMb(long a)
	{
		x=a*1024*1024*1024;
		System.out.println("Megabyte="+x);
	}
	static void PbToKb(long a)
	{
		x=a*1024*1024*1024*1024;
		System.out.println("Kilobyte="+x);
	}
	static void PbToBy(BigInteger f1)
	{
		for(int j=0;j<6;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	static void PbToBi(BigInteger f1)
	{
		for(int j=0;j<6;j++)
		{
			f1=f1.multiply(ff);
		}
			System.out.println("value is :"+f1);
	}
	//		Terabyte----------------------------------------------
	static void TbToGb(long a)
	{
		x=a*1024;
		System.out.println("Gigabyte="+x);
	}
	static void TbToMb(long a)
	{
		x=a*1024*1024;
		System.out.println("Megabyte="+x);
	}
	static void TbToKb(long a)
	{
		x=a*1024*1024*1024;
		System.out.println("Kilobyte="+x);
	}
	static void TbToBy(long a)
	{
		x=a*1024*1024*1024*1024;
		System.out.println("Bytes="+x);
	}
	static void TbToBi(long a)
	{
		x=a*1024*1024*1024*1024*1024*8;
		System.out.println("Bit="+x);
	}
	//		Gigabyte----------------------------------------------
	static void GbToMb(long a)
	{
		x=a*1024;
		System.out.println("Megabyte="+x);
	}
	static void GbToKb(long a)
	{
		x=a*1024*1024;
		System.out.println("KiloByte="+x);
	}
	static void GbToBy(long a)
	{
		x=a*1024*1024*1024;
		System.out.println("Byte="+x);
	}

	static void GbToBi(long a)
	{
		x=a*1024*1024*1024*1024*8;
		System.out.println("Bit="+x);
	}
	//		Megabyte----------------------------------------------
	static void MbToKb(long a)
	{
		x=a*1024;
		System.out.println("kiloByte="+x);
	}
	static void MbToBy(long a)
	{
		x=a*1024*1024;
		System.out.println("Byte="+x);
	}
	static void MbToBi(long a)
	{
		x=a*1024*1024*1024*8;
		System.out.println("Bite="+x);
	}
	//		Kilobyte----------------------------------------------
	static void KbToBy(long a)
	{
		x=a*1024;
		System.out.println("Byte="+x);
	}
	static void KbToBi(long a)
	{
		x=a*1024*1024*8;
		System.out.println("Bit="+x);
	}
	//		Byte----------------------------------------------
	static void ByToBi(long a)
	{
		x=a*1024*8;
		System.out.println("Bit="+x);
	}
	public static void input()
	{
		System.out.println("Enter value to convert");
		a=s.nextLong();
	}
	public static void inputBig()
	{
		System.out.println("Enter value to convert");
		f1=s.nextBigInteger();
	}
	public static void inputDouble()
	{
		System.out.println("Enter value to convert");
		u=s.nextDouble();
	}

	public static void main(String args[])
	{
		while(true)
		{
			int c1,c2;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOMPUTER STORAGE CONVERTOR");
			System.out.println("\n1.bit\n2.Byte\n3.Kilobyte\n4.Megabyte\n5.Gigabyte\n6.Terabyte\n7.Petabyte\n8.Exabyte\n9.Zettabyte\n10.Yottabyte\n11.Exit");
			System.out.print("Convert From:");
			c1=s.nextInt();
			if(c1==11)
			{
				System.exit(0);
			}
			System.out.print("Convert To:");
			c2=s.nextInt();
			//		Bit------------------
			if (c1==1 && c2==2)
			{
				input();
				BiToBy(a);
			}
			if(c1==1 && c2==3)
			{
				input();
				BiToKb(a);
			}
			if(c1==1 && c2==4)
			{
				input();
				BiToMb(a);
			}
			if(c1==1 && c2==5)
			{
				input();
				BiToGb(a);
			}
			if(c1==1 && c2==6)
			{
				inputDouble();
				BiToTb(u);
			}
			if(c1==1 && c2==7)
			{
				inputDouble();
				BiToPb(u);
			}
			if(c1==1 && c2==8)
			{
				inputDouble();
				BiToEb(u);
			}
			if(c1==1 && c2==9)
			{
				inputDouble();
				BiToZb(u);
			}
			if(c1==1 && c2==10)
			{
				inputDouble();
				BiToYb(u);
			}
//		Byte---------------------------------------------
			if(c1==2 && c2==3)
			{
				input();
				ByToKb(a);
			}
			if(c1==2 && c2==4)
			{
				input();
				ByToMb(a);
			}
			if(c1==2 && c2==5)
			{
				input();
				ByToGb(a);
			}
			if(c1==2 && c2==6)
			{
				input();
				ByToTb(a);
			}
			if(c1==2 && c2==7)
			{
				input();
				ByToPb(a);
			}
			if(c1==2 && c2==8)
			{
				input();
				ByToEb(a);
			}
			if(c1==2 && c2==9)
			{
				input();
				ByToZb(a);
			}
			if(c1==2 && c2==10)
			{
				inputDouble();
				ByToYb(a);
			}
//			Kilobyte---------------------------------------------
			if (c1==3 && c2==4)
			{
				inputDouble();
				KbToMb(a);
			}
			if (c1==3 && c2==5)
			{
				input();
				KbToGb(a);
			}
			if (c1==3 && c2==6)
			{
				input();
				KbToTb(a);
			}
			if (c1==3 && c2==7)
			{
				input();
				KbToPb(a);
			}
			if (c1==3 && c2==8)
			{
				input();
				KbToPb(a);
			}
			if (c1==3 && c2==9)
			{
				input();
				KbToPb(a);
			}
			if (c1==3 && c2==10)
			{
				inputDouble();
				KbToPb(a);
			}
// 		Mega------------------------------------------------
			if (c1==4 && c2==5)
			{
				input();
				MbToGb(a);
			}
			if (c1==4 && c2==6)
			{
				input();
				MbToTb(a);
			}
			if (c1==4 && c2==7)
			{
				input();
				MbToPb(a);
			}
			if (c1==4 && c2==8)
			{
				input();
				MbToEb(a);
			}
			if (c1==4 && c2==9)
			{
				input();
				MbToZb(a);
			}
			if (c1==4 && c2==10)
			{
				input();
				MbToYb(a);
			}
//		GigaByte-------------------------------------------
			if (c1==5 && c2==6)
			{
				input();
				GbToTb(a);
			}
			if (c1==5 && c2==7)
			{
				input();
				GbToPb(a);
			}
			if (c1==5 && c2==8)
			{
				input();
				GbToEb(a);
			}
			if (c1==5 && c2==9)
			{
				input();
				GbToZb(a);
			}
			if (c1==5 && c2==10)
			{
				input();
				GbToYb(a);
			}
//		Tera---------------------------------------------------------
			if (c1==6 && c2==7)
			{
				input();
				TbToPb(a);
			}
			if (c1==6 && c2==8)
			{
				input();
				TbToEb(a);
			}
			if (c1==6 && c2==9)
			{
				input();
				TbToZb(a);
			}
			if (c1==6 && c2==10)
			{
				input();
				TbToYb(a);
			}
			
			//		Peta--------------------------
			
			if (c1==7 && c2==8)
			{
				input();
				PbToEb(a);
			}
			if (c1==7 && c2==9)
			{
				input();
				PbToZb(a);
			}
			if (c1==7 && c2==10)
			{
				input();
				PbToYb(a);
			}
//		Exa---------------------------------------------------
			if (c1==8 && c2==9)
			{
				input();
				EbToZb(a);
			}
			if (c1==8 && c2==10)
			{
				input();
				EbToYb(a);
			}
//		Zettabyte---------------------------------------------
			if (c1==9 && c2==10)
			{
				input();
				ZbToYb(a);
			}
			
			//	--------------------------------Bottom to up----------------//
			
			
			//		Yottabyte--------------------------
			
			if(c1==10 && c2==9)
			{
				input();
				YbToZb(a);
			}
			if(c1==10 && c2==8)
			{
				input();
				YbToEb(a);
			}
			if(c1==10 && c2==7)
			{
				input();
				YbToPb(a);
			}
			if(c1==10 && c2==6)
			{
				input();
				YbToTb(a);
			}
			if(c1==10 && c2==5)
			{
				input();
				YbToGb(a);
			}
			if(c1==10 && c2==4)
			{
				inputBig();
				YbToMb(f1);
			}
			if(c1==10 && c2==3)
			{
				inputBig();
				YbToKb(f1);
			}
			if(c1==10 && c2==2)
			{
				inputBig();
				YbToBy(f1);
			}
			if(c1==10 && c2==1)
			{
				inputBig();
				YbToBi(f1);
			}
			//		Zettaabyte--------------------------
			if(c1==9 && c2==8)
			{
				input();
				ZbToEb(a);
			}
			if(c1==9 && c2==7)
			{
				input();
				ZbToPb(a);
			}
			if(c1==9 && c2==6)
			{
				input();
				ZbToTb(a);
			}
			if(c1==9 && c2==5)
			{
				input();
				ZbToGb(a);
			}
			if(c1==9 && c2==4)
			{
				input();
				ZbToMb(a);
			}
			if(c1==9 && c2==3)
			{
				inputBig();
				ZbToKb(f1);
			}
			if(c1==9 && c2==2)
			{
				inputBig();
				ZbToBy(f1);
			}
			if(c1==9 && c2==1)
			{
				inputBig();
				ZbToBi(f1);
			}
			//		Exabyte---------------------------------------------------------
			if(c1==8 && c2==7)
			{
				input();
				EbToPb(a);
			}
			if(c1==8 && c2==6)
			{
				input();
				EbToTb(a);
			}
			if(c1==8 && c2==5)
			{
				input();
				EbToGb(a);
			}
			if(c1==8 && c2==4)
			{
				input();
				EbToMb(a);
			}
			if(c1==8 && c2==3)
			{
				input();
				EbToKb(a);
			}
			if(c1==8 && c2==2)
			{
				inputBig();
				EbToBy(f1);
			}
			if(c1==8 && c2==1)
			{
				inputBig();
				EbToBi(f1);
			}
//		Petabyte----------------------------------------------
			if(c1==7 && c2==6)
			{
				input();
				PbToTb(a);
			}
			if(c1==7 && c2==5)
			{
				input();
				PbToGb(a);
			}
			if(c1==7 && c2==4)
			{
				input();
				PbToMb(a);
			}
			if(c1==7 && c2==3)
			{
				input();
				PbToKb(a);
			}
			if(c1==7 && c2==2)
			{
				inputBig();
				PbToBy(f1);
			}
			if(c1==7 && c2==1)
			{
				inputBig();
				PbToBi(f1);
			}
//		Terabyte--------------------------------------------------
			if(c1==6 && c2==5)
			{
				input();
				TbToGb(a);
			}
			if(c1==6 && c2==4)
			{
				input();
				TbToMb(a);
			}
			if(c1==6 && c2==3)
			{
				input();
				TbToKb(a);
			}
			if(c1==6 && c2==2)
			{
				input();
				TbToBy(a);
			}
			if(c1==6 && c2==1)
			{
				input();
				TbToBi(a);
			}
//		Gigabyte--------------------------------------------------------------
			if(c1==5 && c2==4)
			{
				input();
				GbToMb(a);
			}
			if(c1==5 && c2==3)
			{
				input();
				GbToKb(a);
			}
			if(c1==5 && c2==2)
			{
				input();
				GbToBy(a);
			}
			if(c1==5 && c2==1)
			{
				input();
				GbToBi(a);
			}
//		Megabyte---------------------------------------------------------
			if(c1==4 && c2==3)
			{
				input();
				MbToKb(a);
			}
			if(c1==4 && c2==2)
			{
				input();
				MbToBy(a);
			}
			if(c1==4 && c2==1)
			{
				input();
				MbToBi(a);
			}
//		kilobyte------------------------------------------------------------
			if(c1==3 && c2==2)
			{
				input();
				KbToBy(a);
			}
			if(c1==3 && c2==1)
			{
				input();
				KbToBi(a);
			}
			
//		byte-----------------------------------------------------------
			if(c1==2 && c2==1)
			{
				input();
				ByToBi(a);
			}
		}
	}
}