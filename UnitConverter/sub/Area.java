package sub;
import java.util.Scanner;
import java.math.BigDecimal;

public class Area{
	static BigDecimal sqrKM, hectare, are ,sqrM, sqrDM, sqrCM, sqrMM, sqrMicron, acre, sqrMile,
						sqrYard, sqrFoot, sqrInch, sqrRod, qing, mu, sqrChi, sqrCun, sqrKMgongli;

	static String[] units = new String[]{"Square kilometre", "Hectare", "Are" ,"Square Metre",
									"Square Decimetre","Square Centimetre", "Square Millimetre",
									"Square Micron", "Acre", "Square Mile", "Square Yard", "Square Foot",
									"Square Inch", "Square Rod", "Exit"};
	static BigDecimal unit;
	static int choice1,choice2;
	static Scanner scn = new Scanner(System.in);

	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAREA CONVERTER");
		for(String each:units){
			System.out.println(i + "." + each);
			i++;
		}
	}

	public static void choiceFilling(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();

		if(choice1 == 15){
			System.exit(0);
		}	

		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();


		if(choice2 == 15){
			System.exit(0);
		}	
		
		System.out.print("\nEnter " + units[choice1-1] + ":");
		unit = scn.nextBigDecimal();

		//The if-else ladder
		//-------sqrKM Conversion Choices-------\\
		if(choice1 == 1 && choice2 == 1){
			sqrKM2sqrKM();
		}
		else if(choice1 == 1 && choice2 == 2){
			sqrKM2hectare();
		}
		else if(choice1 == 1 && choice2 == 3){
			sqrKM2are();
		}
		else if(choice1 == 1 && choice2 == 4){
			sqrKM2sqrM();
		}
		else if(choice1 == 1 && choice2 == 5){
			sqrKM2sqrDM();
		}
		else if(choice1 == 1 && choice2 == 6){
			sqrKM2sqrCM();
		}
		else if(choice1 == 1 && choice2 == 7){
			sqrKM2sqrMM();
		}
		else if(choice1 == 1 && choice2 == 8){
			sqrKM2sqrMicron();
		}
		else if(choice1 == 1 && choice2 == 9){
			sqrKM2acre();
		}
		else if(choice1 == 1 && choice2 == 10){
			sqrKM2sqrMile();
		}
		else if(choice1 == 1 && choice2 == 11){
			sqrKM2sqrYard();
		}
		else if(choice1 == 1 && choice2 == 12){
			sqrKM2sqrFoot();
		}
		else if(choice1 == 1 && choice2 == 13){
			sqrKM2sqrInch();
		}
		else if(choice1 == 1 && choice2 == 14){
			sqrKM2rod();
		}
		//------------------------------------------------\\
		//------------Hectare Conversion Choices----------\\
		if(choice1 == 2 && choice2 == 1){
			hectare2sqrKM();
		}
		else if(choice1 == 2 && choice2 == 2){
			hectare2hectare();
		}
		else if(choice1 == 2 && choice2 == 3){
			hectare2are();
		}
		else if(choice1 == 2 && choice2 == 4){
			hectare2sqrM();
		}
		else if(choice1 == 2 && choice2 == 5){
			hectare2sqrDM();
		}
		else if(choice1 == 2 && choice2 == 6){
			hectare2sqrCM();
		}
		else if(choice1 == 2 && choice2 == 7){
			hectare2sqrMM();
		}
		else if(choice1 == 2 && choice2 == 8){
			hectare2sqrMicron();
		}
		else if(choice1 == 2 && choice2 == 9){
			hectare2acre();
		}
		else if(choice1 == 2 && choice2 == 10){
			hectare2sqrMile();
		}
		else if(choice1 == 2 && choice2 == 11){
			hectare2sqrYard();
		}
		else if(choice1 == 2 && choice2 == 12){
			hectare2sqrFoot();
		}
		else if(choice1 == 2 && choice2 == 13){
			hectare2sqrInch();
		}
		else if(choice1 == 2 && choice2 == 14){
			hectare2rod();
		}
		//--------------------------------------------\\		

		//------------Are Conversion Choices----------\\
		if(choice1 == 3 && choice2 == 1){
			are2sqrKM();
		}
		else if(choice1 == 3 && choice2 == 2){
			are2hectare();
		}
		else if(choice1 == 3 && choice2 == 3){
			are2are();
		}
		else if(choice1 == 3 && choice2 == 4){
			are2sqrM();
		}
		else if(choice1 == 3 && choice2 == 5){
			are2sqrDM();
		}
		else if(choice1 == 3 && choice2 == 6){
			are2sqrCM();
		}
		else if(choice1 == 3 && choice2 == 7){
			are2sqrMM();
		}
		else if(choice1 == 3 && choice2 == 8){
			are2sqrMicron();
		}
		else if(choice1 == 3 && choice2 == 9){
			are2acre();
		}
		else if(choice1 == 3 && choice2 == 10){
			are2sqrMile();
		}
		else if(choice1 == 3 && choice2 == 11){
			are2sqrYard();
		}
		else if(choice1 == 3 && choice2 == 12){
			are2sqrFoot();
		}
		else if(choice1 == 3 && choice2 == 13){
			are2sqrInch();
		}
		else if(choice1 == 3 && choice2 == 14){
			are2rod();
		}
		//-----------------------------------------------------\\
		//------------Square Metre Conversion Choices----------\\
		if(choice1 == 4 && choice2 == 1){
			sqrM2sqrKM();
		}
		else if(choice1 == 4 && choice2 == 2){
			sqrM2hectare();
		}
		else if(choice1 == 4 && choice2 == 3){
			sqrM2are();
		}
		else if(choice1 == 4 && choice2 == 4){
			sqrM2sqrM();
		}
		else if(choice1 == 4 && choice2 == 5){
			sqrM2sqrDM();
		}
		else if(choice1 == 4 && choice2 == 6){
			sqrM2sqrCM();
		}
		else if(choice1 == 4 && choice2 == 7){
			sqrM2sqrMM();
		}
		else if(choice1 == 4 && choice2 == 8){
			sqrM2sqrMicron();
		}
		else if(choice1 == 4 && choice2 == 9){
			sqrM2acre();
		}
		else if(choice1 == 4 && choice2 == 10){
			sqrM2sqrMile();
		}
		else if(choice1 == 4 && choice2 == 11){
			sqrM2sqrYard();
		}
		else if(choice1 == 4 && choice2 == 12){
			sqrM2sqrFoot();
		}
		else if(choice1 == 4 && choice2 == 13){
			sqrM2sqrInch();
		}
		else if(choice1 == 4 && choice2 == 14){
			sqrM2rod();
		}
		//---------------------------------------------------------\\
		//------------Square Decimetre Conversion Choices----------\\
		if(choice1 == 5 && choice2 == 1){
			sqrDM2sqrKM();
		}
		else if(choice1 == 5 && choice2 == 2){
			sqrDM2hectare();
		}
		else if(choice1 == 5 && choice2 == 3){
			sqrDM2are();
		}
		else if(choice1 == 5 && choice2 == 4){
			sqrDM2sqrM();
		}
		else if(choice1 == 5 && choice2 == 5){
			sqrDM2sqrDM();
		}
		else if(choice1 == 5 && choice2 == 6){
			sqrDM2sqrCM();
		}
		else if(choice1 == 5 && choice2 == 7){
			sqrDM2sqrMM();
		}
		else if(choice1 == 5 && choice2 == 8){
			sqrDM2sqrMicron();
		}
		else if(choice1 == 5 && choice2 == 9){
			sqrDM2acre();
		}
		else if(choice1 == 5 && choice2 == 10){
			sqrDM2sqrMile();
		}
		else if(choice1 == 5 && choice2 == 11){
			sqrDM2sqrYard();
		}
		else if(choice1 == 5 && choice2 == 12){
			sqrDM2sqrFoot();
		}
		else if(choice1 == 5 && choice2 == 13){
			sqrDM2sqrInch();
		}
		else if(choice1 == 5 && choice2 == 14){
			sqrDM2rod();
		}
		//----------------------------------------------------------\\
		//------------Square Centimetre Conversion Choices----------\\
		if(choice1 == 6 && choice2 == 1){
			sqrCM2sqrKM();
		}
		else if(choice1 == 6 && choice2 == 2){
			sqrCM2hectare();
		}
		else if(choice1 == 6 && choice2 == 3){
			sqrCM2are();
		}
		else if(choice1 == 6 && choice2 == 4){
			sqrCM2sqrM();
		}
		else if(choice1 == 6 && choice2 == 5){
			sqrCM2sqrDM();
		}
		else if(choice1 == 6 && choice2 == 6){
			sqrCM2sqrCM();
		}
		else if(choice1 == 6 && choice2 == 7){
			sqrCM2sqrMM();
		}
		else if(choice1 == 6 && choice2 == 8){
			sqrCM2sqrMicron();
		}
		else if(choice1 == 6 && choice2 == 9){
			sqrCM2acre();
		}
		else if(choice1 == 6 && choice2 == 10){
			sqrCM2sqrMile();
		}
		else if(choice1 == 6 && choice2 == 11){
			sqrCM2sqrYard();
		}
		else if(choice1 == 6 && choice2 == 12){
			sqrCM2sqrFoot();
		}
		else if(choice1 == 6 && choice2 == 13){
			sqrCM2sqrInch();
		}
		else if(choice1 == 6 && choice2 == 14){
			sqrCM2rod();
		}
		//----------------------------------------------------------\\
		//------------Square Millimetre Conversion Choices----------\\
		if(choice1 == 7 && choice2 == 1){
			sqrMM2sqrKM();
		}
		else if(choice1 == 7 && choice2 == 2){
			sqrMM2hectare();
		}
		else if(choice1 == 7 && choice2 == 3){
			sqrMM2are();
		}
		else if(choice1 == 7 && choice2 == 4){
			sqrMM2sqrM();
		}
		else if(choice1 == 7 && choice2 == 5){
			sqrMM2sqrDM();
		}
		else if(choice1 == 7 && choice2 == 6){
			sqrMM2sqrCM();
		}
		else if(choice1 == 7 && choice2 == 7){
			sqrMM2sqrMM();
		}
		else if(choice1 == 7 && choice2 == 8){
			sqrMM2sqrMicron();
		}
		else if(choice1 == 7 && choice2 == 9){
			sqrMM2acre();
		}
		else if(choice1 == 7 && choice2 == 10){
			sqrMM2sqrMile();
		}
		else if(choice1 == 7 && choice2 == 11){
			sqrMM2sqrYard();
		}
		else if(choice1 == 7 && choice2 == 12){
			sqrMM2sqrFoot();
		}
		else if(choice1 == 7 && choice2 == 13){
			sqrMM2sqrInch();
		}
		else if(choice1 == 7 && choice2 == 14){
			sqrMM2rod();
		}
		//-----------------------------------------------------\\
		//------------Square Micron Conversion Choices----------\\
		if(choice1 == 8 && choice2 == 1){
			sqrMicron2sqrKM();
		}
		else if(choice1 == 8 && choice2 == 2){
			sqrMicron2hectare();
		}
		else if(choice1 == 8 && choice2 == 3){
			sqrMicron2are();
		}
		else if(choice1 == 8 && choice2 == 4){
			sqrMicron2sqrM();
		}
		else if(choice1 == 8 && choice2 == 5){
			sqrMicron2sqrDM();
		}
		else if(choice1 == 8 && choice2 == 6){
			sqrMicron2sqrCM();
		}
		else if(choice1 == 8 && choice2 == 7){
			sqrMicron2sqrMM();
		}
		else if(choice1 == 8 && choice2 == 8){
			sqrMicron2sqrMicron();
		}
		else if(choice1 == 8 && choice2 == 9){
			sqrMicron2acre();
		}
		else if(choice1 == 8 && choice2 == 10){
			sqrMicron2sqrMile();
		}
		else if(choice1 == 8 && choice2 == 11){
			sqrMicron2sqrYard();
		}
		else if(choice1 == 8 && choice2 == 12){
			sqrMicron2sqrFoot();
		}
		else if(choice1 == 8 && choice2 == 13){
			sqrMicron2sqrInch();
		}
		else if(choice1 == 8 && choice2 == 14){
			sqrMicron2rod();
		}
		//---------------------------------------------\\
		//------------Acre Conversion Choices----------\\
		if(choice1 == 9 && choice2 == 1){
			acre2sqrKM();
		}
		else if(choice1 == 9 && choice2 == 2){
			acre2hectare();
		}
		else if(choice1 == 9 && choice2 == 3){
			acre2are();
		}
		else if(choice1 == 9 && choice2 == 4){
			acre2sqrM();
		}
		else if(choice1 == 9 && choice2 == 5){
			acre2sqrDM();
		}
		else if(choice1 == 9 && choice2 == 6){
			acre2sqrCM();
		}
		else if(choice1 == 9 && choice2 == 7){
			acre2sqrMM();
		}
		else if(choice1 == 9 && choice2 == 8){
			acre2sqrMicron();
		}
		else if(choice1 == 9 && choice2 == 9){
			acre2acre();
		}
		else if(choice1 == 9 && choice2 == 10){
			acre2sqrMile();
		}
		else if(choice1 == 9 && choice2 == 11){
			acre2sqrYard();
		}
		else if(choice1 == 9 && choice2 == 12){
			acre2sqrFoot();
		}
		else if(choice1 == 9 && choice2 == 13){
			acre2sqrInch();
		}
		else if(choice1 == 9 && choice2 == 14){
			acre2rod();
		}
		//----------------------------------------------------\\
		//------------Square Mile Conversion Choices----------\\
		if(choice1 == 10 && choice2 == 1){
			sqrMile2sqrKM();
		}
		else if(choice1 == 10 && choice2 == 2){
			sqrMile2hectare();
		}
		else if(choice1 == 10 && choice2 == 3){
			sqrMile2are();
		}
		else if(choice1 == 10 && choice2 == 4){
			sqrMile2sqrM();
		}
		else if(choice1 == 10 && choice2 == 5){
			sqrMile2sqrDM();
		}
		else if(choice1 == 10 && choice2 == 6){
			sqrMile2sqrCM();
		}
		else if(choice1 == 10 && choice2 == 7){
			sqrMile2sqrMM();
		}
		else if(choice1 == 10 && choice2 == 8){
			sqrMile2sqrMicron();
		}
		else if(choice1 == 10 && choice2 == 9){
			sqrMile2acre();
		}
		else if(choice1 == 10 && choice2 == 10){
			sqrMile2sqrMile();
		}
		else if(choice1 == 10 && choice2 == 11){
			sqrMile2sqrYard();
		}
		else if(choice1 == 10 && choice2 == 12){
			sqrMile2sqrFoot();
		}
		else if(choice1 == 10 && choice2 == 13){
			sqrMile2sqrInch();
		}
		else if(choice1 == 10 && choice2 == 14){
			sqrMile2rod();
		}
		//----------------------------------------------------\\
		//------------Square Yard Conversion Choices----------\\
		if(choice1 == 11 && choice2 == 1){
			sqrYard2sqrKM();
		}
		else if(choice1 == 11 && choice2 == 2){
			sqrYard2hectare();
		}
		else if(choice1 == 11 && choice2 == 3){
			sqrYard2are();
		}
		else if(choice1 == 11 && choice2 == 4){
			sqrYard2sqrM();
		}
		else if(choice1 == 11 && choice2 == 5){
			sqrYard2sqrDM();
		}
		else if(choice1 == 11 && choice2 == 6){
			sqrYard2sqrCM();
		}
		else if(choice1 == 11 && choice2 == 7){
			sqrYard2sqrMM();
		}
		else if(choice1 == 11 && choice2 == 8){
			sqrYard2sqrMicron();
		}
		else if(choice1 == 11 && choice2 == 9){
			sqrYard2acre();
		}
		else if(choice1 == 11 && choice2 == 10){
			sqrYard2sqrMile();
		}
		else if(choice1 == 11 && choice2 == 11){
			sqrYard2sqrYard();
		}
		else if(choice1 == 11 && choice2 == 12){
			sqrYard2sqrFoot();
		}
		else if(choice1 == 11 && choice2 == 13){
			sqrYard2sqrInch();
		}
		else if(choice1 == 11 && choice2 == 14){
			sqrYard2rod();
		}
		//----------------------------------------------------\\
		//------------Square Foot Conversion Choices----------\\
		if(choice1 == 12 && choice2 == 1){
			sqrFoot2sqrKM();
		}
		else if(choice1 == 12 && choice2 == 2){
			sqrFoot2hectare();
		}
		else if(choice1 == 12 && choice2 == 3){
			sqrFoot2are();
		}
		else if(choice1 == 12 && choice2 == 4){
			sqrFoot2sqrM();
		}
		else if(choice1 == 12 && choice2 == 5){
			sqrFoot2sqrDM();
		}
		else if(choice1 == 12 && choice2 == 6){
			sqrFoot2sqrCM();
		}
		else if(choice1 == 12 && choice2 == 7){
			sqrFoot2sqrMM();
		}
		else if(choice1 == 12 && choice2 == 8){
			sqrFoot2sqrMicron();
		}
		else if(choice1 == 12 && choice2 == 9){
			sqrFoot2acre();
		}
		else if(choice1 == 12 && choice2 == 10){
			sqrFoot2sqrMile();
		}
		else if(choice1 == 12 && choice2 == 11){
			sqrFoot2sqrYard();
		}
		else if(choice1 == 12 && choice2 == 12){
			sqrFoot2sqrFoot();
		}
		else if(choice1 == 12 && choice2 == 13){
			sqrFoot2sqrInch();
		}
		else if(choice1 == 12 && choice2 == 14){
			sqrFoot2rod();
		}
		//----------------------------------------------------\\
		//------------Square Inch Conversion Choices----------\\
		if(choice1 == 13 && choice2 == 1){
			sqrInch2sqrKM();
		}
		else if(choice1 == 13 && choice2 == 2){
			sqrInch2hectare();
		}
		else if(choice1 == 13 && choice2 == 3){
			sqrInch2are();
		}
		else if(choice1 == 13 && choice2 == 4){
			sqrInch2sqrM();
		}
		else if(choice1 == 13 && choice2 == 5){
			sqrInch2sqrDM();
		}
		else if(choice1 == 13 && choice2 == 6){
			sqrInch2sqrCM();
		}
		else if(choice1 == 13 && choice2 == 7){
			sqrInch2sqrMM();
		}
		else if(choice1 == 13 && choice2 == 8){
			sqrInch2sqrMicron();
		}
		else if(choice1 == 13 && choice2 == 9){
			sqrInch2acre();
		}
		else if(choice1 == 13 && choice2 == 10){
			sqrInch2sqrMile();
		}
		else if(choice1 == 13 && choice2 == 11){
			sqrInch2sqrYard();
		}
		else if(choice1 == 13 && choice2 == 12){
			sqrInch2sqrFoot();
		}
		else if(choice1 == 13 && choice2 == 13){
			sqrInch2sqrInch();
		}
		else if(choice1 == 13 && choice2 == 14){
			sqrInch2rod();
		}
		//--------------------------------------------\\
		//------------Rod Conversion Choices----------\\
		if(choice1 == 14 && choice2 == 1){
			rod2sqrKM();
		}
		else if(choice1 == 14 && choice2 == 2){
			rod2hectare();
		}
		else if(choice1 == 14 && choice2 == 3){
			rod2are();
		}
		else if(choice1 == 14 && choice2 == 4){
			rod2sqrM();
		}
		else if(choice1 == 14 && choice2 == 5){
			rod2sqrDM();
		}
		else if(choice1 == 14 && choice2 == 6){
			rod2sqrCM();
		}
		else if(choice1 == 14 && choice2 == 7){
			rod2sqrMM();
		}
		else if(choice1 == 14 && choice2 == 8){
			rod2sqrMicron();
		}
		else if(choice1 == 14 && choice2 == 9){
			rod2acre();
		}
		else if(choice1 == 14 && choice2 == 10){
			rod2sqrMile();
		}
		else if(choice1 == 14 && choice2 == 11){
			rod2sqrYard();
		}
		else if(choice1 == 14 && choice2 == 12){
			rod2sqrFoot();
		}
		else if(choice1 == 14 && choice2 == 13){
			rod2sqrInch();
		}
		else if(choice1 == 14 && choice2 == 14){
			rod2rod();
		}
		//--------------------------------------------\\
		outputUnit();
		scn.nextInt();
	}
	//---------------Output Units-----------------------\\
	public static void outputUnit(){
		System.out.println("\n " + unit +" "+units[choice2-1]);
		System.out.println("Press Enter!");
	}
	//`````````````````````````````````````````````````````````\\
	//-------------------sqrKM Conversions---------------------\\
	public static void sqrKM2sqrKM(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void sqrKM2hectare(){
		unit= unit.multiply(new BigDecimal("100"));
	}
	public static void sqrKM2are(){
		unit= unit.multiply(new BigDecimal("10000"));
	}
	public static void sqrKM2sqrM(){
		unit= unit.multiply(new BigDecimal("1000000"));
	}
	public static void sqrKM2sqrDM(){
		unit= unit.multiply(new BigDecimal("1000000000"));
	}
	public static void sqrKM2sqrCM(){
		unit= unit.multiply(new BigDecimal("10000000000"));
	}
	public static void sqrKM2sqrMM(){
		unit= unit.multiply(new BigDecimal("1000000000000"));
	}
	public static void sqrKM2sqrMicron(){
		unit= unit.multiply(new BigDecimal("1000000000000000000"));
	}
	public static void sqrKM2acre(){
		unit= unit.multiply(new BigDecimal("247.1053814672"));
	}
	public static void sqrKM2sqrMile(){
		unit= unit.multiply(new BigDecimal("0.386102159"));
	}
	public static void sqrKM2sqrYard(){
		unit= unit.multiply(new BigDecimal("1195990.046301"));
	}
	public static void sqrKM2sqrFoot(){
		unit= unit.multiply(new BigDecimal("10763910.41671"));
	}
	public static void sqrKM2sqrInch(){
		unit= unit.multiply(new BigDecimal("1550003100.006"));
	}
	public static void sqrKM2rod(){
		unit= unit.multiply(new BigDecimal("39536.8610"));
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Hectare Conversions---------------------\\
	public static void hectare2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.01"));
	}
	public static void hectare2hectare(){
		hectare2sqrKM();
		sqrKM2hectare();
	}
	public static void hectare2are(){
		hectare2sqrKM();
		sqrKM2are();
	}
	public static void hectare2sqrM(){
		hectare2sqrKM();
		sqrKM2sqrM();
	}
	public static void hectare2sqrDM(){
		hectare2sqrKM();
		sqrKM2sqrDM();
	}
	public static void hectare2sqrCM(){
		hectare2sqrKM();
		sqrKM2sqrCM();
	}
	public static void hectare2sqrMM(){
		hectare2sqrKM();
		sqrKM2sqrMM();
	}
	public static void hectare2sqrMicron(){
		hectare2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void hectare2acre(){
		hectare2sqrKM();
		sqrKM2acre();
	}
	public static void hectare2sqrMile(){
		hectare2sqrKM();
		sqrKM2sqrMile();
	}
	public static void hectare2sqrYard(){
		hectare2sqrKM();
		sqrKM2sqrYard();
	}
	public static void hectare2sqrFoot(){
		hectare2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void hectare2sqrInch(){
		hectare2sqrKM();
		sqrKM2sqrInch();
	}
	public static void hectare2rod(){
		hectare2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//--------------------Are Conversions-----------------------\\
	public static void are2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.0001"));
	}
	public static void are2hectare(){
		are2sqrKM();
		sqrKM2hectare();
	}
	public static void are2are(){
		are2sqrKM();
		sqrKM2are();
	}
	public static void are2sqrM(){
		are2sqrKM();
		sqrKM2sqrM();
	}
	public static void are2sqrDM(){
		are2sqrKM();
		sqrKM2sqrDM();
	}
	public static void are2sqrCM(){
		are2sqrKM();
		sqrKM2sqrCM();
	}
	public static void are2sqrMM(){
		are2sqrKM();
		sqrKM2sqrMM();
	}
	public static void are2sqrMicron(){
		are2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void are2acre(){
		are2sqrKM();
		sqrKM2acre();
	}
	public static void are2sqrMile(){
		are2sqrKM();
		sqrKM2sqrMile();
	}
	public static void are2sqrYard(){
		are2sqrKM();
		sqrKM2sqrYard();
	}
	public static void are2sqrFoot(){
		are2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void are2sqrInch(){
		are2sqrKM();
		sqrKM2sqrInch();
	}
	public static void are2rod(){
		are2sqrKM();
		sqrKM2rod();
	}
	//------------------Square Metre Conversions---------------------\\
	public static void sqrM2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.000001"));
	}
	public static void sqrM2hectare(){
		sqrM2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrM2are(){
		sqrM2sqrKM();
		sqrKM2are();
	}
	public static void sqrM2sqrM(){
		sqrM2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrM2sqrDM(){
		sqrM2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrM2sqrCM(){
		sqrM2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrM2sqrMM(){
		sqrM2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrM2sqrMicron(){
		sqrM2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrM2acre(){
		sqrM2sqrKM();
		sqrKM2acre();
	}
	public static void sqrM2sqrMile(){
		sqrM2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrM2sqrYard(){
		sqrM2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrM2sqrFoot(){
		sqrM2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrM2sqrInch(){
		sqrM2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrM2rod(){
		sqrM2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Square Decimetre Conversions---------------------\\
	public static void  sqrDM2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.00000001"));
	}
	public static void  sqrDM2hectare(){
		sqrDM2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrDM2are(){
		sqrDM2sqrKM();
		sqrKM2are();
	}
	public static void sqrDM2sqrM(){
		sqrDM2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrDM2sqrDM(){
		sqrDM2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrDM2sqrCM(){
		sqrDM2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrDM2sqrMM(){
		sqrDM2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrDM2sqrMicron(){
		sqrDM2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrDM2acre(){
		sqrDM2sqrKM();
		sqrKM2acre();
	}
	public static void sqrDM2sqrMile(){
		sqrDM2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrDM2sqrYard(){
		sqrDM2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrDM2sqrFoot(){
		sqrDM2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrDM2sqrInch(){
		sqrDM2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrDM2rod(){
		sqrDM2sqrKM();
		sqrKM2rod();
	}
	//```````````````````````````````````````````````````````````````````\\
	//------------------Square Centimetre Conversions---------------------\\
	public static void sqrCM2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.0000000001"));
	}
	public static void sqrCM2hectare(){
		sqrCM2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrCM2are(){
		sqrCM2sqrKM();
		sqrKM2are();
	}
	public static void sqrCM2sqrM(){
		sqrCM2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrCM2sqrDM(){
		sqrCM2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrCM2sqrCM(){
		sqrCM2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrCM2sqrMM(){
		sqrCM2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrCM2sqrMicron(){
		sqrCM2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrCM2acre(){
		sqrCM2sqrKM();
		sqrKM2acre();
	}
	public static void sqrCM2sqrMile(){
		sqrCM2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrCM2sqrYard(){
		sqrCM2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrCM2sqrFoot(){
		sqrCM2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrCM2sqrInch(){
		sqrCM2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrCM2rod(){
		sqrCM2sqrKM();
		sqrKM2rod();
	}
	//```````````````````````````````````````````````````````````````````\\
	//------------------Square MilliMetre Conversions---------------------\\
	public static void sqrMM2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.000000000001"));
	}
	public static void sqrMM2hectare(){
		sqrMM2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrMM2are(){
		sqrMM2sqrKM();
		sqrKM2are();
	}
	public static void sqrMM2sqrM(){
		sqrMM2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrMM2sqrDM(){
		sqrMM2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrMM2sqrCM(){
		sqrMM2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrMM2sqrMM(){
		sqrMM2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrMM2sqrMicron(){
		sqrMM2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrMM2acre(){
		sqrMM2sqrKM();
		sqrKM2acre();
	}
	public static void sqrMM2sqrMile(){
		sqrMM2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrMM2sqrYard(){
		sqrMM2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrMM2sqrFoot(){
		sqrMM2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrMM2sqrInch(){
		sqrMM2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrMM2rod(){
		sqrMM2sqrKM();
		sqrKM2rod();
	}
	//```````````````````````````````````````````````````````````````\\
	//------------------Square Micron Conversions---------------------\\
	public static void sqrMicron2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.000000000000000001"));
	}
	public static void sqrMicron2hectare(){
		sqrMicron2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrMicron2are(){
		sqrMicron2sqrKM();
		sqrKM2are();
	}
	public static void sqrMicron2sqrM(){
		sqrMicron2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrMicron2sqrDM(){
		sqrMicron2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrMicron2sqrCM(){
		sqrMicron2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrMicron2sqrMM(){
		sqrMicron2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrMicron2sqrMicron(){
		sqrMicron2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrMicron2acre(){
		sqrMicron2sqrKM();
		sqrKM2acre();
	}
	public static void sqrMicron2sqrMile(){
		sqrMicron2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrMicron2sqrYard(){
		sqrMicron2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrMicron2sqrFoot(){
		sqrMicron2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrMicron2sqrInch(){
		sqrMicron2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrMicron2rod(){
		sqrMicron2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Acre Conversions---------------------\\
	public static void acre2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.004046856"));
	}
	public static void acre2hectare(){
		acre2sqrKM();
		sqrKM2hectare();
	}
	public static void acre2are(){
		acre2sqrKM();
		sqrKM2are();
	}
	public static void acre2sqrM(){
		acre2sqrKM();
		sqrKM2sqrM();
	}
	public static void acre2sqrDM(){
		acre2sqrKM();
		sqrKM2sqrDM();
	}
	public static void acre2sqrCM(){
		acre2sqrKM();
		sqrKM2sqrCM();
	}
	public static void acre2sqrMM(){
		acre2sqrKM();
		sqrKM2sqrMM();
	}
	public static void acre2sqrMicron(){
		acre2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void acre2acre(){
		acre2sqrKM();
		sqrKM2acre();
	}
	public static void acre2sqrMile(){
		acre2sqrKM();
		sqrKM2sqrMile();
	}
	public static void acre2sqrYard(){
		acre2sqrKM();
		sqrKM2sqrYard();
	}
	public static void acre2sqrFoot(){
		acre2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void acre2sqrInch(){
		acre2sqrKM();
		sqrKM2sqrInch();
	}
	public static void acre2rod(){
		acre2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Square Mile Conversions---------------------\\
	public static void sqrMile2sqrKM(){
		unit= unit.multiply(new BigDecimal("2.58998811"));
	}
	public static void sqrMile2hectare(){
		sqrMile2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrMile2are(){
		sqrMile2sqrKM();
		sqrKM2are();
	}
	public static void sqrMile2sqrM(){
		sqrMile2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrMile2sqrDM(){
		sqrMile2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrMile2sqrCM(){
		sqrMile2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrMile2sqrMM(){
		sqrMile2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrMile2sqrMicron(){
		sqrMile2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrMile2acre(){
		sqrMile2sqrKM();
		sqrKM2acre();
	}
	public static void sqrMile2sqrMile(){
		sqrMile2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrMile2sqrYard(){
		sqrMile2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrMile2sqrFoot(){
		sqrMile2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrMile2sqrInch(){
		sqrMile2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrMile2rod(){
		sqrMile2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Square Yard Conversions---------------------\\
	public static void sqrYard2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.000000836127"));
	}
	public static void sqrYard2hectare(){
		sqrYard2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrYard2are(){
		sqrYard2sqrKM();
		sqrKM2are();
	}
	public static void sqrYard2sqrM(){
		sqrYard2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrYard2sqrDM(){
		sqrYard2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrYard2sqrCM(){
		sqrYard2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrYard2sqrMM(){
		sqrYard2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrYard2sqrMicron(){
		sqrYard2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrYard2acre(){
		sqrYard2sqrKM();
		sqrKM2acre();
	}
	public static void sqrYard2sqrMile(){
		sqrYard2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrYard2sqrYard(){
		sqrYard2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrYard2sqrFoot(){
		sqrYard2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrYard2sqrInch(){
		sqrYard2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrYard2rod(){
		sqrYard2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Square Foot Conversions---------------------\\
	public static void sqrFoot2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.00000009290304"));
	}
	public static void sqrFoot2hectare(){
		sqrFoot2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrFoot2are(){
		sqrFoot2sqrKM();
		sqrKM2are();
	}
	public static void sqrFoot2sqrM(){
		sqrFoot2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrFoot2sqrDM(){
		sqrFoot2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrFoot2sqrCM(){
		sqrFoot2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrFoot2sqrMM(){
		sqrFoot2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrFoot2sqrMicron(){
		sqrFoot2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrFoot2acre(){
		sqrFoot2sqrKM();
		sqrKM2acre();
	}
	public static void sqrFoot2sqrMile(){
		sqrFoot2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrFoot2sqrYard(){
		sqrFoot2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrFoot2sqrFoot(){
		sqrFoot2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrFoot2sqrInch(){
		sqrFoot2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrFoot2rod(){
		sqrFoot2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Square Inch Conversions---------------------\\
	public static void sqrInch2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.00000000064516"));
	}
	public static void sqrInch2hectare(){
		sqrInch2sqrKM();
		sqrKM2hectare();
	}
	public static void sqrInch2are(){
		sqrInch2sqrKM();
		sqrKM2are();
	}
	public static void sqrInch2sqrM(){
		sqrInch2sqrKM();
		sqrKM2sqrM();
	}
	public static void sqrInch2sqrDM(){
		sqrInch2sqrKM();
		sqrKM2sqrDM();
	}
	public static void sqrInch2sqrCM(){
		sqrInch2sqrKM();
		sqrKM2sqrCM();
	}
	public static void sqrInch2sqrMM(){
		sqrInch2sqrKM();
		sqrKM2sqrMM();
	}
	public static void sqrInch2sqrMicron(){
		sqrInch2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void sqrInch2acre(){
		sqrInch2sqrKM();
		sqrKM2acre();
	}
	public static void sqrInch2sqrMile(){
		sqrInch2sqrKM();
		sqrKM2sqrMile();
	}
	public static void sqrInch2sqrYard(){
		sqrInch2sqrKM();
		sqrKM2sqrYard();
	}
	public static void sqrInch2sqrFoot(){
		sqrInch2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void sqrInch2sqrInch(){
		sqrInch2sqrKM();
		sqrKM2sqrInch();
	}
	public static void sqrInch2rod(){
		sqrInch2sqrKM();
		sqrKM2rod();
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Rod Conversions---------------------\\
	public static void rod2sqrKM(){
		unit= unit.multiply(new BigDecimal("0.0000252928526"));
	}
	public static void rod2hectare(){
		rod2sqrKM();
		sqrKM2hectare();
	}
	public static void rod2are(){
		rod2sqrKM();
		sqrKM2are();
	}
	public static void rod2sqrM(){
		rod2sqrKM();
		sqrKM2sqrM();
	}
	public static void rod2sqrDM(){
		rod2sqrKM();
		sqrKM2sqrDM();
	}
	public static void rod2sqrCM(){
		rod2sqrKM();
		sqrKM2sqrCM();
	}
	public static void rod2sqrMM(){
		rod2sqrKM();
		sqrKM2sqrMM();
	}
	public static void rod2sqrMicron(){
		rod2sqrKM();
		sqrKM2sqrMicron();
	}
	public static void rod2acre(){
		rod2sqrKM();
		sqrKM2acre();
	}
	public static void rod2sqrMile(){
		rod2sqrKM();
		sqrKM2sqrMile();
	}
	public static void rod2sqrYard(){
		rod2sqrKM();
		sqrKM2sqrYard();
	}
	public static void rod2sqrFoot(){
		rod2sqrKM();
		sqrKM2sqrFoot();
	}
	public static void rod2sqrInch(){
		rod2sqrKM();
		sqrKM2sqrInch();
	}
	public static void rod2rod(){
		rod2sqrKM();
		sqrKM2rod();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Main Method-----------------------------\\
	public static void main(String[] args) {
		while(true){
			options();
			choiceFilling();
		}
	}
}