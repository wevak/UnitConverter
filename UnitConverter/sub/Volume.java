package sub;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Volume{
	static BigDecimal barrel, bushelUK, bushelUSdry ,centiliter, cubicCentimeter, cubicDecimeter, cubicFoot, cubicInch,
					cubicMeter, cubicMillimeter, cubicYard, dekaliter, fluidDram, fluidOunce, gallonFluid, gallonUK,
					gill, hectoliter, kiloliter, liter, microliter, milliliter, minim, peckUSdry, pintFluid, pintUK,
					pintUSdry, quartFluid, quartUK, quartUSdry;

	static String[] units = new String[]{"Barrel", "Bushel(UK)", "Bushel(US Dry)", "Centiliter", "Cubic Centimeter",
									"Cubic Decimeter", "Cubic Foot", "Cubic Inch", "Cubic Meter","Cubic Millimeter",
									"Cubic Yard", "Dekaliter", "Fluid Dram", "Fluid Ounce", "Gallon(fluid)",
									"Gallon(UK)", "Gill", "Hectoliter", "KiloLiter", "Liter", "MicroLiter",
									"MilliLiter", "Minim", "Peck(US Dry)", "Pint(fluid)", "Pint(UK)",
									"Pint(US dry)", "Quart(fluid)", "Quart(UK)", "Quart(US Dry)", "Exit"
								};
	static BigDecimal unit;
	static int choice1,choice2;
	static Scanner scn = new Scanner(System.in);

	public static void inputChoice1(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();
		if(choice1 == 31){
			System.exit(0);
		}	
	}

	public static void inputChoice2(){
		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();
		if(choice2 == 31){
			System.exit(0);
		}
	}

	public static void inputUnit(){
		System.out.print("\nEnter " + units[choice1-1] + ": ");
		unit = scn.nextBigDecimal();
	}

	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nVOLUME CONVERTER");
		for(String each:units){
			System.out.println(i + "." + each);
			i++;
		}
	}

	public static void choiceFilling(){
		try{
			inputChoice1();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input! " + e + "\nPlease enter again.");
			inputChoice1();
		}
		try{
			inputChoice2();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input! " + e + "\nPlease enter again.");
			inputChoice2();
		}
		try{
			inputUnit();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input! " + e + "\nPlease enter again.");
			inputUnit();
		}


		//The if-else ladder
		//--------Barrel Conversion Choices--------\\
		if(choice1 == 1 && choice2 == 1){
			barrel2barrel();
		}
		else if(choice1 == 1 && choice2 == 2){
			barrel2bushelUK();
		}
		else if(choice1 == 1 && choice2 == 3){
			barrel2bushelUSdry();
		}
		else if(choice1 == 1 && choice2 == 4){
			barrel2centiliter();
		}
		else if(choice1 == 1 && choice2 == 5){
			barrel2cubicCM();
		}
		else if(choice1 == 1 && choice2 == 6){
			barrel2cubicDM();
		}
		else if(choice1 == 1 && choice2 == 7){
			barrel2cubicFoot();
		}
		else if(choice1 == 1 && choice2 == 8){
			barrel2cubicInch();
		}
		else if(choice1 == 1 && choice2 == 9){
			barrel2cubicM();
		}
		else if(choice1 == 1 && choice2 == 10){
			barrel2cubicMM();
		}
		else if(choice1 == 1 && choice2 == 11){
			barrel2cubicYard();
		}
		else if(choice1 == 1 && choice2 == 12){
			barrel2dekaL();
		}
		else if(choice1 == 1 && choice2 == 13){
			barrel2fluidDram();
		}
		else if(choice1 == 1 && choice2 == 14){
			barrel2fluidOunce();
		}
		else if(choice1 == 1 && choice2 == 15){
			barrel2gallon();
		}
		else if(choice1 == 1 && choice2 == 16){
			barrel2gallonUK();
		}
		else if(choice1 == 1 && choice2 == 17){
			barrel2gill();
		}
		else if(choice1 == 1 && choice2 == 18){
			barrel2hectoL();
		}
		else if(choice1 == 1 && choice2 == 19){
			barrel2KL();
		}
		else if(choice1 == 1 && choice2 == 20){
			barrel2L();
		}
		else if(choice1 == 1 && choice2 == 21){
			barrel2microL();
		}
		else if(choice1 == 1 && choice2 == 22){
			barrel2ML();
		}
		else if(choice1 == 1 && choice2 == 23){
			barrel2minim();
		}
		else if(choice1 == 1 && choice2 == 24){
			barrel2peckUSdry();
		}
		else if(choice1 == 1 && choice2 == 25){
			barrel2pintFluid();
		}
		else if(choice1 == 1 && choice2 == 26){
			barrel2pintUK();
		}
		else if(choice1 == 1 && choice2 == 27){
			barrel2pintUSdry();
		}
		else if(choice1 == 1 && choice2 == 28){
			barrel2quartFluid();
		}
		else if(choice1 == 1 && choice2 == 29){
			barrel2quartUK();
		}
		else if(choice1 == 1 && choice2 == 30){
			barrel2quartUSdry();
		}
		//----------------------------------------\\
		//--------Bushel UK Conversion Choices--------\\
		if(choice1 == 2 && choice2 == 1){
			bushelUK2barrel();
		}
		else if(choice1 == 2 && choice2 == 2){
			bushelUK2bushelUK();
		}
		else if(choice1 == 2 && choice2 == 3){
			bushelUK2bushelUSdry();
		}
		else if(choice1 == 2 && choice2 == 4){
			bushelUK2centiliter();
		}
		else if(choice1 == 2 && choice2 == 5){
			bushelUK2cubicCM();
		}
		else if(choice1 == 2 && choice2 == 6){
			bushelUK2cubicDM();
		}
		else if(choice1 == 2 && choice2 == 7){
			bushelUK2cubicFoot();
		}
		else if(choice1 == 2 && choice2 == 8){
			bushelUK2cubicInch();
		}
		else if(choice1 == 2 && choice2 == 9){
			bushelUK2cubicM();
		}
		else if(choice1 == 2 && choice2 == 10){
			bushelUK2cubicMM();
		}
		else if(choice1 == 2 && choice2 == 11){
			bushelUK2cubicYard();
		}
		else if(choice1 == 2 && choice2 == 12){
			bushelUK2dekaL();
		}
		else if(choice1 == 2 && choice2 == 13){
			bushelUK2fluidDram();
		}
		else if(choice1 == 2 && choice2 == 14){
			bushelUK2fluidOunce();
		}
		else if(choice1 == 2 && choice2 == 15){
			bushelUK2gallon();
		}
		else if(choice1 == 2 && choice2 == 16){
			bushelUK2gallonUK();
		}
		else if(choice1 == 2 && choice2 == 17){
			bushelUK2gill();
		}
		else if(choice1 == 2 && choice2 == 18){
			bushelUK2hectoL();
		}
		else if(choice1 == 2 && choice2 == 19){
			bushelUK2KL();
		}
		else if(choice1 == 2 && choice2 == 20){
			bushelUK2L();
		}
		else if(choice1 == 2 && choice2 == 21){
			bushelUK2microL();
		}
		else if(choice1 == 2 && choice2 == 22){
			bushelUK2ML();
		}
		else if(choice1 == 2 && choice2 == 23){
			bushelUK2minim();
		}
		else if(choice1 == 2 && choice2 == 24){
			bushelUK2peckUSdry();
		}
		else if(choice1 == 2 && choice2 == 25){
			bushelUK2pintFluid();
		}
		else if(choice1 == 2 && choice2 == 26){
			bushelUK2pintUK();
		}
		else if(choice1 == 2 && choice2 == 27){
			bushelUK2pintUSdry();
		}
		else if(choice1 == 2 && choice2 == 28){
			bushelUK2quartFluid();
		}
		else if(choice1 == 2 && choice2 == 29){
			bushelUK2quartUK();
		}
		else if(choice1 == 2 && choice2 == 30){
			bushelUK2quartUSdry();
		}
		//---------------------------------------------\\
		//--------BushelUSdry Conversion Choices--------\\
		if(choice1 == 3 && choice2 == 1){
			bushelUSdry2barrel();
		}
		else if(choice1 == 3 && choice2 == 2){
			bushelUSdry2bushelUK();
		}
		else if(choice1 == 3 && choice2 == 3){
			bushelUSdry2bushelUSdry();
		}
		else if(choice1 == 3 && choice2 == 4){
			bushelUSdry2centiliter();
		}
		else if(choice1 == 3 && choice2 == 5){
			bushelUSdry2cubicCM();
		}
		else if(choice1 == 3 && choice2 == 6){
			bushelUSdry2cubicDM();
		}
		else if(choice1 == 3 && choice2 == 7){
			bushelUSdry2cubicFoot();
		}
		else if(choice1 == 3 && choice2 == 8){
			bushelUSdry2cubicInch();
		}
		else if(choice1 == 3 && choice2 == 9){
			bushelUSdry2cubicM();
		}
		else if(choice1 == 3 && choice2 == 10){
			bushelUSdry2cubicMM();
		}
		else if(choice1 == 3 && choice2 == 11){
			bushelUSdry2cubicYard();
		}
		else if(choice1 == 3 && choice2 == 12){
			bushelUSdry2dekaL();
		}
		else if(choice1 == 3 && choice2 == 13){
			bushelUSdry2fluidDram();
		}
		else if(choice1 == 3 && choice2 == 14){
			bushelUSdry2fluidOunce();
		}
		else if(choice1 == 3 && choice2 == 15){
			bushelUSdry2gallon();
		}
		else if(choice1 == 3 && choice2 == 16){
			bushelUSdry2gallonUK();
		}
		else if(choice1 == 3 && choice2 == 17){
			bushelUSdry2gill();
		}
		else if(choice1 == 3 && choice2 == 18){
			bushelUSdry2hectoL();
		}
		else if(choice1 == 3 && choice2 == 19){
			bushelUSdry2KL();
		}
		else if(choice1 == 3 && choice2 == 20){
			bushelUSdry2L();
		}
		else if(choice1 == 3 && choice2 == 21){
			bushelUSdry2microL();
		}
		else if(choice1 == 3 && choice2 == 22){
			bushelUSdry2ML();
		}
		else if(choice1 == 3 && choice2 == 23){
			bushelUSdry2minim();
		}
		else if(choice1 == 3 && choice2 == 24){
			bushelUSdry2peckUSdry();
		}
		else if(choice1 == 3 && choice2 == 25){
			bushelUSdry2pintFluid();
		}
		else if(choice1 == 3 && choice2 == 26){
			bushelUSdry2pintUK();
		}
		else if(choice1 == 3 && choice2 == 27){
			bushelUSdry2pintUSdry();
		}
		else if(choice1 == 3 && choice2 == 28){
			bushelUSdry2quartFluid();
		}
		else if(choice1 == 3 && choice2 == 29){
			bushelUSdry2quartUK();
		}
		else if(choice1 == 3 && choice2 == 30){
			bushelUSdry2quartUSdry();
		}
		//----------------------------------------\\
		//--------Centiliter Conversion Choices--------\\
		if(choice1 == 4 && choice2 == 1){
			centiliter2barrel();
		}
		else if(choice1 == 4 && choice2 == 2){
			centiliter2bushelUK();
		}
		else if(choice1 == 4 && choice2 == 3){
			centiliter2bushelUSdry();
		}
		else if(choice1 == 4 && choice2 == 4){
			centiliter2centiliter();
		}
		else if(choice1 == 4 && choice2 == 5){
			centiliter2cubicCM();
		}
		else if(choice1 == 4 && choice2 == 6){
			centiliter2cubicDM();
		}
		else if(choice1 == 4 && choice2 == 7){
			centiliter2cubicFoot();
		}
		else if(choice1 == 4 && choice2 == 8){
			centiliter2cubicInch();
		}
		else if(choice1 == 4 && choice2 == 9){
			centiliter2cubicM();
		}
		else if(choice1 == 4 && choice2 == 10){
			centiliter2cubicMM();
		}
		else if(choice1 == 4 && choice2 == 11){
			centiliter2cubicYard();
		}
		else if(choice1 == 4 && choice2 == 12){
			centiliter2dekaL();
		}
		else if(choice1 == 4 && choice2 == 13){
			centiliter2fluidDram();
		}
		else if(choice1 == 4 && choice2 == 14){
			centiliter2fluidOunce();
		}
		else if(choice1 == 4 && choice2 == 15){
			centiliter2gallon();
		}
		else if(choice1 == 4 && choice2 == 16){
			centiliter2gallonUK();
		}
		else if(choice1 == 4 && choice2 == 17){
			centiliter2gill();
		}
		else if(choice1 == 4 && choice2 == 18){
			centiliter2hectoL();
		}
		else if(choice1 == 4 && choice2 == 19){
			centiliter2KL();
		}
		else if(choice1 == 4 && choice2 == 20){
			centiliter2L();
		}
		else if(choice1 == 4 && choice2 == 21){
			centiliter2microL();
		}
		else if(choice1 == 4 && choice2 == 22){
			centiliter2ML();
		}
		else if(choice1 == 4 && choice2 == 23){
			centiliter2minim();
		}
		else if(choice1 == 4 && choice2 == 24){
			centiliter2peckUSdry();
		}
		else if(choice1 == 4 && choice2 == 25){
			centiliter2pintFluid();
		}
		else if(choice1 == 4 && choice2 == 26){
			centiliter2pintUK();
		}
		else if(choice1 == 4 && choice2 == 27){
			centiliter2pintUSdry();
		}
		else if(choice1 == 4 && choice2 == 28){
			centiliter2quartFluid();
		}
		else if(choice1 == 4 && choice2 == 29){
			centiliter2quartUK();
		}
		else if(choice1 == 4 && choice2 == 30){
			centiliter2quartUSdry();
		}
		//----------------------------------------\\
		//--------CubicCM Conversion Choices--------\\
		if(choice1 == 5 && choice2 == 1){
			cubicCM2barrel();
		}
		else if(choice1 == 5 && choice2 == 2){
			cubicCM2bushelUK();
		}
		else if(choice1 == 5 && choice2 == 3){
			cubicCM2bushelUSdry();
		}
		else if(choice1 == 5 && choice2 == 4){
			cubicCM2centiliter();
		}
		else if(choice1 == 5 && choice2 == 5){
			cubicCM2cubicCM();
		}
		else if(choice1 == 5 && choice2 == 6){
			cubicCM2cubicDM();
		}
		else if(choice1 == 5 && choice2 == 7){
			cubicCM2cubicFoot();
		}
		else if(choice1 == 5 && choice2 == 8){
			cubicCM2cubicInch();
		}
		else if(choice1 == 5 && choice2 == 9){
			cubicCM2cubicM();
		}
		else if(choice1 == 5 && choice2 == 10){
			cubicCM2cubicMM();
		}
		else if(choice1 == 5 && choice2 == 11){
			cubicCM2cubicYard();
		}
		else if(choice1 == 5 && choice2 == 12){
			cubicCM2dekaL();
		}
		else if(choice1 == 5 && choice2 == 13){
			cubicCM2fluidDram();
		}
		else if(choice1 == 5 && choice2 == 14){
			cubicCM2fluidOunce();
		}
		else if(choice1 == 5 && choice2 == 15){
			cubicCM2gallon();
		}
		else if(choice1 == 5 && choice2 == 16){
			cubicCM2gallonUK();
		}
		else if(choice1 == 5 && choice2 == 17){
			cubicCM2gill();
		}
		else if(choice1 == 5 && choice2 == 18){
			cubicCM2hectoL();
		}
		else if(choice1 == 5 && choice2 == 19){
			cubicCM2KL();
		}
		else if(choice1 == 5 && choice2 == 20){
			cubicCM2L();
		}
		else if(choice1 == 5 && choice2 == 21){
			cubicCM2microL();
		}
		else if(choice1 == 5 && choice2 == 22){
			cubicCM2ML();
		}
		else if(choice1 == 5 && choice2 == 23){
			cubicCM2minim();
		}
		else if(choice1 == 5 && choice2 == 24){
			cubicCM2peckUSdry();
		}
		else if(choice1 == 5 && choice2 == 25){
			cubicCM2pintFluid();
		}
		else if(choice1 == 5 && choice2 == 26){
			cubicCM2pintUK();
		}
		else if(choice1 == 5 && choice2 == 27){
			cubicCM2pintUSdry();
		}
		else if(choice1 == 5 && choice2 == 28){
			cubicCM2quartFluid();
		}
		else if(choice1 == 5 && choice2 == 29){
			cubicCM2quartUK();
		}
		else if(choice1 == 5 && choice2 == 30){
			cubicCM2quartUSdry();
		}
		//----------------------------------------\\
		//--------CubicDM Conversion Choices--------\\
		if(choice1 == 6 && choice2 == 1){
			cubicDM2barrel();
		}
		else if(choice1 == 6 && choice2 == 2){
			cubicDM2bushelUK();
		}
		else if(choice1 == 6 && choice2 == 3){
			cubicDM2bushelUSdry();
		}
		else if(choice1 == 6 && choice2 == 4){
			cubicDM2centiliter();
		}
		else if(choice1 == 6 && choice2 == 5){
			cubicDM2cubicCM();
		}
		else if(choice1 == 6 && choice2 == 6){
			cubicDM2cubicDM();
		}
		else if(choice1 == 6 && choice2 == 7){
			cubicDM2cubicFoot();
		}
		else if(choice1 == 6 && choice2 == 8){
			cubicDM2cubicInch();
		}
		else if(choice1 == 6 && choice2 == 9){
			cubicDM2cubicM();
		}
		else if(choice1 == 6 && choice2 == 10){
			cubicDM2cubicMM();
		}
		else if(choice1 == 6 && choice2 == 11){
			cubicDM2cubicYard();
		}
		else if(choice1 == 6 && choice2 == 12){
			cubicDM2dekaL();
		}
		else if(choice1 == 6 && choice2 == 13){
			cubicDM2fluidDram();
		}
		else if(choice1 == 6 && choice2 == 14){
			cubicDM2fluidOunce();
		}
		else if(choice1 == 6 && choice2 == 15){
			cubicDM2gallon();
		}
		else if(choice1 == 6 && choice2 == 16){
			cubicDM2gallonUK();
		}
		else if(choice1 == 6 && choice2 == 17){
			cubicDM2gill();
		}
		else if(choice1 == 6 && choice2 == 18){
			cubicDM2hectoL();
		}
		else if(choice1 == 6 && choice2 == 19){
			cubicDM2KL();
		}
		else if(choice1 == 6 && choice2 == 20){
			cubicDM2L();
		}
		else if(choice1 == 6 && choice2 == 21){
			cubicDM2microL();
		}
		else if(choice1 == 6 && choice2 == 22){
			cubicDM2ML();
		}
		else if(choice1 == 6 && choice2 == 23){
			cubicDM2minim();
		}
		else if(choice1 == 6 && choice2 == 24){
			cubicDM2peckUSdry();
		}
		else if(choice1 == 6 && choice2 == 25){
			cubicDM2pintFluid();
		}
		else if(choice1 == 6 && choice2 == 26){
			cubicDM2pintUK();
		}
		else if(choice1 == 6 && choice2 == 27){
			cubicDM2pintUSdry();
		}
		else if(choice1 == 6 && choice2 == 28){
			cubicDM2quartFluid();
		}
		else if(choice1 == 6 && choice2 == 29){
			cubicDM2quartUK();
		}
		else if(choice1 == 6 && choice2 == 30){
			cubicDM2quartUSdry();
		}
		//----------------------------------------\\
		//--------CubicFoot Conversion Choices--------\\
		if(choice1 == 7 && choice2 == 1){
			cubicFoot2barrel();
		}
		else if(choice1 == 7 && choice2 == 2){
			cubicFoot2bushelUK();
		}
		else if(choice1 == 7 && choice2 == 3){
			cubicFoot2bushelUSdry();
		}
		else if(choice1 == 7 && choice2 == 4){
			cubicFoot2centiliter();
		}
		else if(choice1 == 7 && choice2 == 5){
			cubicFoot2cubicCM();
		}
		else if(choice1 == 7 && choice2 == 6){
			cubicFoot2cubicDM();
		}
		else if(choice1 == 7 && choice2 == 7){
			cubicFoot2cubicFoot();
		}
		else if(choice1 == 7 && choice2 == 8){
			cubicFoot2cubicInch();
		}
		else if(choice1 == 7 && choice2 == 9){
			cubicFoot2cubicM();
		}
		else if(choice1 == 7 && choice2 == 10){
			cubicFoot2cubicMM();
		}
		else if(choice1 == 7 && choice2 == 11){
			cubicFoot2cubicYard();
		}
		else if(choice1 == 7 && choice2 == 12){
			cubicFoot2dekaL();
		}
		else if(choice1 == 7 && choice2 == 13){
			cubicFoot2fluidDram();
		}
		else if(choice1 == 7 && choice2 == 14){
			cubicFoot2fluidOunce();
		}
		else if(choice1 == 7 && choice2 == 15){
			cubicFoot2gallon();
		}
		else if(choice1 == 7 && choice2 == 16){
			cubicFoot2gallonUK();
		}
		else if(choice1 == 7 && choice2 == 17){
			cubicFoot2gill();
		}
		else if(choice1 == 7 && choice2 == 18){
			cubicFoot2hectoL();
		}
		else if(choice1 == 7 && choice2 == 19){
			cubicFoot2KL();
		}
		else if(choice1 == 7 && choice2 == 20){
			cubicFoot2L();
		}
		else if(choice1 == 7 && choice2 == 21){
			cubicFoot2microL();
		}
		else if(choice1 == 7 && choice2 == 22){
			cubicFoot2ML();
		}
		else if(choice1 == 7 && choice2 == 23){
			cubicFoot2minim();
		}
		else if(choice1 == 7 && choice2 == 24){
			cubicFoot2peckUSdry();
		}
		else if(choice1 == 7 && choice2 == 25){
			cubicFoot2pintFluid();
		}
		else if(choice1 == 7 && choice2 == 26){
			cubicFoot2pintUK();
		}
		else if(choice1 == 7 && choice2 == 27){
			cubicFoot2pintUSdry();
		}
		else if(choice1 == 7 && choice2 == 28){
			cubicFoot2quartFluid();
		}
		else if(choice1 == 7 && choice2 == 29){
			cubicFoot2quartUK();
		}
		else if(choice1 == 7 && choice2 == 30){
			cubicFoot2quartUSdry();
		}
		//----------------------------------------\\
		//--------Cubic Inch Conversion Choices--------\\
		if(choice1 == 8 && choice2 == 1){
			cubicInch2barrel();
		}
		else if(choice1 == 8 && choice2 == 2){
			cubicInch2bushelUK();
		}
		else if(choice1 == 8 && choice2 == 3){
			cubicInch2bushelUSdry();
		}
		else if(choice1 == 8 && choice2 == 4){
			cubicInch2centiliter();
		}
		else if(choice1 == 8 && choice2 == 5){
			cubicInch2cubicCM();
		}
		else if(choice1 == 8 && choice2 == 6){
			cubicInch2cubicDM();
		}
		else if(choice1 == 8 && choice2 == 7){
			cubicInch2cubicFoot();
		}
		else if(choice1 == 8 && choice2 == 8){
			cubicInch2cubicInch();
		}
		else if(choice1 == 8 && choice2 == 9){
			cubicInch2cubicM();
		}
		else if(choice1 == 8 && choice2 == 10){
			cubicInch2cubicMM();
		}
		else if(choice1 == 8 && choice2 == 11){
			cubicInch2cubicYard();
		}
		else if(choice1 == 8 && choice2 == 12){
			cubicInch2dekaL();
		}
		else if(choice1 == 8 && choice2 == 13){
			cubicInch2fluidDram();
		}
		else if(choice1 == 8 && choice2 == 14){
			cubicInch2fluidOunce();
		}
		else if(choice1 == 8 && choice2 == 15){
			cubicInch2gallon();
		}
		else if(choice1 == 8 && choice2 == 16){
			cubicInch2gallonUK();
		}
		else if(choice1 == 8 && choice2 == 17){
			cubicInch2gill();
		}
		else if(choice1 == 8 && choice2 == 18){
			cubicInch2hectoL();
		}
		else if(choice1 == 8 && choice2 == 19){
			cubicInch2KL();
		}
		else if(choice1 == 8 && choice2 == 20){
			cubicInch2L();
		}
		else if(choice1 == 8 && choice2 == 21){
			cubicInch2microL();
		}
		else if(choice1 == 8 && choice2 == 22){
			cubicInch2ML();
		}
		else if(choice1 == 8 && choice2 == 23){
			cubicInch2minim();
		}
		else if(choice1 == 8 && choice2 == 24){
			cubicInch2peckUSdry();
		}
		else if(choice1 == 8 && choice2 == 25){
			cubicInch2pintFluid();
		}
		else if(choice1 == 8 && choice2 == 26){
			cubicInch2pintUK();
		}
		else if(choice1 == 8 && choice2 == 27){
			cubicInch2pintUSdry();
		}
		else if(choice1 == 8 && choice2 == 28){
			cubicInch2quartFluid();
		}
		else if(choice1 == 8 && choice2 == 29){
			cubicInch2quartUK();
		}
		else if(choice1 == 8 && choice2 == 30){
			cubicInch2quartUSdry();
		}
		//----------------------------------------\\
		//--------Cubic Meter Conversion Choices--------\\
		if(choice1 == 9 && choice2 == 1){
			cubicM2barrel();
		}
		else if(choice1 == 9 && choice2 == 2){
			cubicM2bushelUK();
		}
		else if(choice1 == 9 && choice2 == 3){
			cubicM2bushelUSdry();
		}
		else if(choice1 == 9 && choice2 == 4){
			cubicM2centiliter();
		}
		else if(choice1 == 9 && choice2 == 5){
			cubicM2cubicCM();
		}
		else if(choice1 == 9 && choice2 == 6){
			cubicM2cubicDM();
		}
		else if(choice1 == 9 && choice2 == 7){
			cubicM2cubicFoot();
		}
		else if(choice1 == 9 && choice2 == 8){
			cubicM2cubicInch();
		}
		else if(choice1 == 9 && choice2 == 9){
			cubicM2cubicM();
		}
		else if(choice1 == 9 && choice2 == 10){
			cubicM2cubicMM();
		}
		else if(choice1 == 9 && choice2 == 11){
			cubicM2cubicYard();
		}
		else if(choice1 == 9 && choice2 == 12){
			cubicM2dekaL();
		}
		else if(choice1 == 9 && choice2 == 13){
			cubicM2fluidDram();
		}
		else if(choice1 == 9 && choice2 == 14){
			cubicM2fluidOunce();
		}
		else if(choice1 == 9 && choice2 == 15){
			cubicM2gallon();
		}
		else if(choice1 == 9 && choice2 == 16){
			cubicM2gallonUK();
		}
		else if(choice1 == 9 && choice2 == 17){
			cubicM2gill();
		}
		else if(choice1 == 9 && choice2 == 18){
			cubicM2hectoL();
		}
		else if(choice1 == 9 && choice2 == 19){
			cubicM2KL();
		}
		else if(choice1 == 9 && choice2 == 20){
			cubicM2L();
		}
		else if(choice1 == 9 && choice2 == 21){
			cubicM2microL();
		}
		else if(choice1 == 9 && choice2 == 22){
			cubicM2ML();
		}
		else if(choice1 == 9 && choice2 == 23){
			cubicM2minim();
		}
		else if(choice1 == 9 && choice2 == 24){
			cubicM2peckUSdry();
		}
		else if(choice1 == 9 && choice2 == 25){
			cubicM2pintFluid();
		}
		else if(choice1 == 9 && choice2 == 26){
			cubicM2pintUK();
		}
		else if(choice1 == 9 && choice2 == 27){
			cubicM2pintUSdry();
		}
		else if(choice1 == 9 && choice2 == 28){
			cubicM2quartFluid();
		}
		else if(choice1 == 9 && choice2 == 29){
			cubicM2quartUK();
		}
		else if(choice1 == 9 && choice2 == 30){
			cubicM2quartUSdry();
		}
		//----------------------------------------\\
		//--------Cubic Millimeter Conversion Choices--------\\
		if(choice1 == 10 && choice2 == 1){
			cubicMM2barrel();
		}
		else if(choice1 == 10 && choice2 == 2){
			cubicMM2bushelUK();
		}
		else if(choice1 == 10 && choice2 == 3){
			cubicMM2bushelUSdry();
		}
		else if(choice1 == 10 && choice2 == 4){
			cubicMM2centiliter();
		}
		else if(choice1 == 10 && choice2 == 5){
			cubicMM2cubicCM();
		}
		else if(choice1 == 10 && choice2 == 6){
			cubicMM2cubicDM();
		}
		else if(choice1 == 10 && choice2 == 7){
			cubicMM2cubicFoot();
		}
		else if(choice1 == 10 && choice2 == 8){
			cubicMM2cubicInch();
		}
		else if(choice1 == 10 && choice2 == 9){
			cubicMM2cubicM();
		}
		else if(choice1 == 10 && choice2 == 10){
			cubicMM2cubicMM();
		}
		else if(choice1 == 10 && choice2 == 11){
			cubicMM2cubicYard();
		}
		else if(choice1 == 10 && choice2 == 12){
			cubicMM2dekaL();
		}
		else if(choice1 == 10 && choice2 == 13){
			cubicMM2fluidDram();
		}
		else if(choice1 == 10 && choice2 == 14){
			cubicMM2fluidOunce();
		}
		else if(choice1 == 10 && choice2 == 15){
			cubicMM2gallon();
		}
		else if(choice1 == 10 && choice2 == 16){
			cubicMM2gallonUK();
		}
		else if(choice1 == 10 && choice2 == 17){
			cubicMM2gill();
		}
		else if(choice1 == 10 && choice2 == 18){
			cubicMM2hectoL();
		}
		else if(choice1 == 10 && choice2 == 19){
			cubicMM2KL();
		}
		else if(choice1 == 10 && choice2 == 20){
			cubicMM2L();
		}
		else if(choice1 == 10 && choice2 == 21){
			cubicMM2microL();
		}
		else if(choice1 == 10 && choice2 == 22){
			cubicMM2ML();
		}
		else if(choice1 == 10 && choice2 == 23){
			cubicMM2minim();
		}
		else if(choice1 == 10 && choice2 == 24){
			cubicMM2peckUSdry();
		}
		else if(choice1 == 10 && choice2 == 25){
			cubicMM2pintFluid();
		}
		else if(choice1 == 10 && choice2 == 26){
			cubicMM2pintUK();
		}
		else if(choice1 == 10 && choice2 == 27){
			cubicMM2pintUSdry();
		}
		else if(choice1 == 10 && choice2 == 28){
			cubicMM2quartFluid();
		}
		else if(choice1 == 10 && choice2 == 29){
			cubicMM2quartUK();
		}
		else if(choice1 == 10 && choice2 == 30){
			cubicMM2quartUSdry();
		}
		//----------------------------------------\\
		//--------Cubic Yard Conversion Choices--------\\
		if(choice1 == 11 && choice2 == 1){
			cubicYard2barrel();
		}
		else if(choice1 == 11 && choice2 == 2){
			cubicYard2bushelUK();
		}
		else if(choice1 == 11 && choice2 == 3){
			cubicYard2bushelUSdry();
		}
		else if(choice1 == 11 && choice2 == 4){
			cubicYard2centiliter();
		}
		else if(choice1 == 11 && choice2 == 5){
			cubicYard2cubicCM();
		}
		else if(choice1 == 11 && choice2 == 6){
			cubicYard2cubicDM();
		}
		else if(choice1 == 11 && choice2 == 7){
			cubicYard2cubicFoot();
		}
		else if(choice1 == 11 && choice2 == 8){
			cubicYard2cubicInch();
		}
		else if(choice1 == 11 && choice2 == 9){
			cubicYard2cubicM();
		}
		else if(choice1 == 11 && choice2 == 10){
			cubicYard2cubicMM();
		}
		else if(choice1 == 11 && choice2 == 11){
			cubicYard2cubicYard();
		}
		else if(choice1 == 11 && choice2 == 12){
			cubicYard2dekaL();
		}
		else if(choice1 == 11 && choice2 == 13){
			cubicYard2fluidDram();
		}
		else if(choice1 == 11 && choice2 == 14){
			cubicYard2fluidOunce();
		}
		else if(choice1 == 11 && choice2 == 15){
			cubicYard2gallon();
		}
		else if(choice1 == 11 && choice2 == 16){
			cubicYard2gallonUK();
		}
		else if(choice1 == 11 && choice2 == 17){
			cubicYard2gill();
		}
		else if(choice1 == 11 && choice2 == 18){
			cubicYard2hectoL();
		}
		else if(choice1 == 11 && choice2 == 19){
			cubicYard2KL();
		}
		else if(choice1 == 11 && choice2 == 20){
			cubicYard2L();
		}
		else if(choice1 == 11 && choice2 == 21){
			cubicYard2microL();
		}
		else if(choice1 == 11 && choice2 == 22){
			cubicYard2ML();
		}
		else if(choice1 == 11 && choice2 == 23){
			cubicYard2minim();
		}
		else if(choice1 == 11 && choice2 == 24){
			cubicYard2peckUSdry();
		}
		else if(choice1 == 11 && choice2 == 25){
			cubicYard2pintFluid();
		}
		else if(choice1 == 11 && choice2 == 26){
			cubicYard2pintUK();
		}
		else if(choice1 == 11 && choice2 == 27){
			cubicYard2pintUSdry();
		}
		else if(choice1 == 11 && choice2 == 28){
			cubicYard2quartFluid();
		}
		else if(choice1 == 11 && choice2 == 29){
			cubicYard2quartUK();
		}
		else if(choice1 == 11 && choice2 == 30){
			cubicYard2quartUSdry();
		}
		//----------------------------------------\\
		//--------Dekaliter Conversion Choices--------\\
		if(choice1 == 12 && choice2 == 1){
			dekaL2barrel();
		}
		else if(choice1 == 12 && choice2 == 2){
			dekaL2bushelUK();
		}
		else if(choice1 == 12 && choice2 == 3){
			dekaL2bushelUSdry();
		}
		else if(choice1 == 12 && choice2 == 4){
			dekaL2centiliter();
		}
		else if(choice1 == 12 && choice2 == 5){
			dekaL2cubicCM();
		}
		else if(choice1 == 12 && choice2 == 6){
			dekaL2cubicDM();
		}
		else if(choice1 == 12 && choice2 == 7){
			dekaL2cubicFoot();
		}
		else if(choice1 == 12 && choice2 == 8){
			dekaL2cubicInch();
		}
		else if(choice1 == 12 && choice2 == 9){
			dekaL2cubicM();
		}
		else if(choice1 == 12 && choice2 == 10){
			dekaL2cubicMM();
		}
		else if(choice1 == 12 && choice2 == 11){
			dekaL2cubicYard();
		}
		else if(choice1 == 12 && choice2 == 12){
			dekaL2dekaL();
		}
		else if(choice1 == 12 && choice2 == 13){
			dekaL2fluidDram();
		}
		else if(choice1 == 12 && choice2 == 14){
			dekaL2fluidOunce();
		}
		else if(choice1 == 12 && choice2 == 15){
			dekaL2gallon();
		}
		else if(choice1 == 12 && choice2 == 16){
			dekaL2gallonUK();
		}
		else if(choice1 == 12 && choice2 == 17){
			dekaL2gill();
		}
		else if(choice1 == 12 && choice2 == 18){
			dekaL2hectoL();
		}
		else if(choice1 == 12 && choice2 == 19){
			dekaL2KL();
		}
		else if(choice1 == 12 && choice2 == 20){
			dekaL2L();
		}
		else if(choice1 == 12 && choice2 == 21){
			dekaL2microL();
		}
		else if(choice1 == 12 && choice2 == 22){
			dekaL2ML();
		}
		else if(choice1 == 12 && choice2 == 23){
			dekaL2minim();
		}
		else if(choice1 == 12 && choice2 == 24){
			dekaL2peckUSdry();
		}
		else if(choice1 == 12 && choice2 == 25){
			dekaL2pintFluid();
		}
		else if(choice1 == 12 && choice2 == 26){
			dekaL2pintUK();
		}
		else if(choice1 == 12 && choice2 == 27){
			dekaL2pintUSdry();
		}
		else if(choice1 == 12 && choice2 == 28){
			dekaL2quartFluid();
		}
		else if(choice1 == 12 && choice2 == 29){
			dekaL2quartUK();
		}
		else if(choice1 == 12 && choice2 == 30){
			dekaL2quartUSdry();
		}
		//----------------------------------------\\
		//--------Fluid Dram Conversion Choices--------\\
		if(choice1 == 13 && choice2 == 1){
			fluidDram2barrel();
		}
		else if(choice1 == 13 && choice2 == 2){
			fluidDram2bushelUK();
		}
		else if(choice1 == 13 && choice2 == 3){
			fluidDram2bushelUSdry();
		}
		else if(choice1 == 13 && choice2 == 4){
			fluidDram2centiliter();
		}
		else if(choice1 == 13 && choice2 == 5){
			fluidDram2cubicCM();
		}
		else if(choice1 == 13 && choice2 == 6){
			fluidDram2cubicDM();
		}
		else if(choice1 == 13 && choice2 == 7){
			fluidDram2cubicFoot();
		}
		else if(choice1 == 13 && choice2 == 8){
			fluidDram2cubicInch();
		}
		else if(choice1 == 13 && choice2 == 9){
			fluidDram2cubicM();
		}
		else if(choice1 == 13 && choice2 == 10){
			fluidDram2cubicMM();
		}
		else if(choice1 == 13 && choice2 == 11){
			fluidDram2cubicYard();
		}
		else if(choice1 == 13 && choice2 == 12){
			fluidDram2dekaL();
		}
		else if(choice1 == 13 && choice2 == 13){
			fluidDram2fluidDram();
		}
		else if(choice1 == 13 && choice2 == 14){
			fluidDram2fluidOunce();
		}
		else if(choice1 == 13 && choice2 == 15){
			fluidDram2gallon();
		}
		else if(choice1 == 13 && choice2 == 16){
			fluidDram2gallonUK();
		}
		else if(choice1 == 13 && choice2 == 17){
			fluidDram2gill();
		}
		else if(choice1 == 13 && choice2 == 18){
			fluidDram2hectoL();
		}
		else if(choice1 == 13 && choice2 == 19){
			fluidDram2KL();
		}
		else if(choice1 == 13 && choice2 == 20){
			fluidDram2L();
		}
		else if(choice1 == 13 && choice2 == 21){
			fluidDram2microL();
		}
		else if(choice1 == 13 && choice2 == 22){
			fluidDram2ML();
		}
		else if(choice1 == 13 && choice2 == 23){
			fluidDram2minim();
		}
		else if(choice1 == 13 && choice2 == 24){
			fluidDram2peckUSdry();
		}
		else if(choice1 == 13 && choice2 == 25){
			fluidDram2pintFluid();
		}
		else if(choice1 == 13 && choice2 == 26){
			fluidDram2pintUK();
		}
		else if(choice1 == 13 && choice2 == 27){
			fluidDram2pintUSdry();
		}
		else if(choice1 == 13 && choice2 == 28){
			fluidDram2quartFluid();
		}
		else if(choice1 == 13 && choice2 == 29){
			fluidDram2quartUK();
		}
		else if(choice1 == 13 && choice2 == 30){
			fluidDram2quartUSdry();
		}
		//----------------------------------------\\
		//--------Fluid Ounce Conversion Choices--------\\
		if(choice1 == 14 && choice2 == 1){
			fluidOunce2barrel();
		}
		else if(choice1 == 14 && choice2 == 2){
			fluidOunce2bushelUK();
		}
		else if(choice1 == 14 && choice2 == 3){
			fluidOunce2bushelUSdry();
		}
		else if(choice1 == 14 && choice2 == 4){
			fluidOunce2centiliter();
		}
		else if(choice1 == 14 && choice2 == 5){
			fluidOunce2cubicCM();
		}
		else if(choice1 == 14 && choice2 == 6){
			fluidOunce2cubicDM();
		}
		else if(choice1 == 14 && choice2 == 7){
			fluidOunce2cubicFoot();
		}
		else if(choice1 == 14 && choice2 == 8){
			fluidOunce2cubicInch();
		}
		else if(choice1 == 14 && choice2 == 9){
			fluidOunce2cubicM();
		}
		else if(choice1 == 14 && choice2 == 10){
			fluidOunce2cubicMM();
		}
		else if(choice1 == 14 && choice2 == 11){
			fluidOunce2cubicYard();
		}
		else if(choice1 == 14 && choice2 == 12){
			fluidOunce2dekaL();
		}
		else if(choice1 == 14 && choice2 == 13){
			fluidOunce2fluidDram();
		}
		else if(choice1 == 14 && choice2 == 14){
			fluidOunce2fluidOunce();
		}
		else if(choice1 == 14 && choice2 == 15){
			fluidOunce2gallon();
		}
		else if(choice1 == 14 && choice2 == 16){
			fluidOunce2gallonUK();
		}
		else if(choice1 == 14 && choice2 == 17){
			fluidOunce2gill();
		}
		else if(choice1 == 14 && choice2 == 18){
			fluidOunce2hectoL();
		}
		else if(choice1 == 14 && choice2 == 19){
			fluidOunce2KL();
		}
		else if(choice1 == 14 && choice2 == 20){
			fluidOunce2L();
		}
		else if(choice1 == 14 && choice2 == 21){
			fluidOunce2microL();
		}
		else if(choice1 == 14 && choice2 == 22){
			fluidOunce2ML();
		}
		else if(choice1 == 14 && choice2 == 23){
			fluidOunce2minim();
		}
		else if(choice1 == 14 && choice2 == 24){
			fluidOunce2peckUSdry();
		}
		else if(choice1 == 14 && choice2 == 25){
			fluidOunce2pintFluid();
		}
		else if(choice1 == 14 && choice2 == 26){
			fluidOunce2pintUK();
		}
		else if(choice1 == 14 && choice2 == 27){
			fluidOunce2pintUSdry();
		}
		else if(choice1 == 14 && choice2 == 28){
			fluidOunce2quartFluid();
		}
		else if(choice1 == 14 && choice2 == 29){
			fluidOunce2quartUK();
		}
		else if(choice1 == 14 && choice2 == 30){
			fluidOunce2quartUSdry();
		}
		//----------------------------------------\\
		//--------Gallon Conversion Choices--------\\
		if(choice1 == 15 && choice2 == 1){
			gallon2barrel();
		}
		else if(choice1 == 15 && choice2 == 2){
			gallon2bushelUK();
		}
		else if(choice1 == 15 && choice2 == 3){
			gallon2bushelUSdry();
		}
		else if(choice1 == 15 && choice2 == 4){
			gallon2centiliter();
		}
		else if(choice1 == 15 && choice2 == 5){
			gallon2cubicCM();
		}
		else if(choice1 == 15 && choice2 == 6){
			gallon2cubicDM();
		}
		else if(choice1 == 15 && choice2 == 7){
			gallon2cubicFoot();
		}
		else if(choice1 == 15 && choice2 == 8){
			gallon2cubicInch();
		}
		else if(choice1 == 15 && choice2 == 9){
			gallon2cubicM();
		}
		else if(choice1 == 15 && choice2 == 10){
			gallon2cubicMM();
		}
		else if(choice1 == 15 && choice2 == 11){
			gallon2cubicYard();
		}
		else if(choice1 == 15 && choice2 == 12){
			gallon2dekaL();
		}
		else if(choice1 == 15 && choice2 == 13){
			gallon2fluidDram();
		}
		else if(choice1 == 15 && choice2 == 14){
			gallon2fluidOunce();
		}
		else if(choice1 == 15 && choice2 == 15){
			gallon2gallon();
		}
		else if(choice1 == 15 && choice2 == 16){
			gallon2gallonUK();
		}
		else if(choice1 == 15 && choice2 == 17){
			gallon2gill();
		}
		else if(choice1 == 15 && choice2 == 18){
			gallon2hectoL();
		}
		else if(choice1 == 15 && choice2 == 19){
			gallon2KL();
		}
		else if(choice1 == 15 && choice2 == 20){
			gallon2L();
		}
		else if(choice1 == 15 && choice2 == 21){
			gallon2microL();
		}
		else if(choice1 == 15 && choice2 == 22){
			gallon2ML();
		}
		else if(choice1 == 15 && choice2 == 23){
			gallon2minim();
		}
		else if(choice1 == 15 && choice2 == 24){
			gallon2peckUSdry();
		}
		else if(choice1 == 15 && choice2 == 25){
			gallon2pintFluid();
		}
		else if(choice1 == 15 && choice2 == 26){
			gallon2pintUK();
		}
		else if(choice1 == 15 && choice2 == 27){
			gallon2pintUSdry();
		}
		else if(choice1 == 15 && choice2 == 28){
			gallon2quartFluid();
		}
		else if(choice1 == 15 && choice2 == 29){
			gallon2quartUK();
		}
		else if(choice1 == 15 && choice2 == 30){
			gallon2quartUSdry();
		}
		//----------------------------------------\\
		//--------GallonUK Conversion Choices--------\\
		if(choice1 == 16 && choice2 == 1){
			gallonUK2barrel();
		}
		else if(choice1 == 16 && choice2 == 2){
			gallonUK2bushelUK();
		}
		else if(choice1 == 16 && choice2 == 3){
			gallonUK2bushelUSdry();
		}
		else if(choice1 == 16 && choice2 == 4){
			gallonUK2centiliter();
		}
		else if(choice1 == 16 && choice2 == 5){
			gallonUK2cubicCM();
		}
		else if(choice1 == 16 && choice2 == 6){
			gallonUK2cubicDM();
		}
		else if(choice1 == 16 && choice2 == 7){
			gallonUK2cubicFoot();
		}
		else if(choice1 == 16 && choice2 == 8){
			gallonUK2cubicInch();
		}
		else if(choice1 == 16 && choice2 == 9){
			gallonUK2cubicM();
		}
		else if(choice1 == 16 && choice2 == 10){
			gallonUK2cubicMM();
		}
		else if(choice1 == 16 && choice2 == 11){
			gallonUK2cubicYard();
		}
		else if(choice1 == 16 && choice2 == 12){
			gallonUK2dekaL();
		}
		else if(choice1 == 16 && choice2 == 13){
			gallonUK2fluidDram();
		}
		else if(choice1 == 16 && choice2 == 14){
			gallonUK2fluidOunce();
		}
		else if(choice1 == 16 && choice2 == 15){
			gallonUK2gallon();
		}
		else if(choice1 == 16 && choice2 == 16){
			gallonUK2gallonUK();
		}
		else if(choice1 == 16 && choice2 == 17){
			gallonUK2gill();
		}
		else if(choice1 == 16 && choice2 == 18){
			gallonUK2hectoL();
		}
		else if(choice1 == 16 && choice2 == 19){
			gallonUK2KL();
		}
		else if(choice1 == 16 && choice2 == 20){
			gallonUK2L();
		}
		else if(choice1 == 16 && choice2 == 21){
			gallonUK2microL();
		}
		else if(choice1 == 16 && choice2 == 22){
			gallonUK2ML();
		}
		else if(choice1 == 16 && choice2 == 23){
			gallonUK2minim();
		}
		else if(choice1 == 16 && choice2 == 24){
			gallonUK2peckUSdry();
		}
		else if(choice1 == 16 && choice2 == 25){
			gallonUK2pintFluid();
		}
		else if(choice1 == 16 && choice2 == 26){
			gallonUK2pintUK();
		}
		else if(choice1 == 16 && choice2 == 27){
			gallonUK2pintUSdry();
		}
		else if(choice1 == 16 && choice2 == 28){
			gallonUK2quartFluid();
		}
		else if(choice1 == 16 && choice2 == 29){
			gallonUK2quartUK();
		}
		else if(choice1 == 16 && choice2 == 30){
			gallonUK2quartUSdry();
		}
		//----------------------------------------\\
		//--------Gill Conversion Choices--------\\
		if(choice1 == 17 && choice2 == 1){
			gill2barrel();
		}
		else if(choice1 == 17 && choice2 == 2){
			gill2bushelUK();
		}
		else if(choice1 == 17 && choice2 == 3){
			gill2bushelUSdry();
		}
		else if(choice1 == 17 && choice2 == 4){
			gill2centiliter();
		}
		else if(choice1 == 17 && choice2 == 5){
			gill2cubicCM();
		}
		else if(choice1 == 17 && choice2 == 6){
			gill2cubicDM();
		}
		else if(choice1 == 17 && choice2 == 7){
			gill2cubicFoot();
		}
		else if(choice1 == 17 && choice2 == 8){
			gill2cubicInch();
		}
		else if(choice1 == 17 && choice2 == 9){
			gill2cubicM();
		}
		else if(choice1 == 17 && choice2 == 10){
			gill2cubicMM();
		}
		else if(choice1 == 17 && choice2 == 11){
			gill2cubicYard();
		}
		else if(choice1 == 17 && choice2 == 12){
			gill2dekaL();
		}
		else if(choice1 == 17 && choice2 == 13){
			gill2fluidDram();
		}
		else if(choice1 == 17 && choice2 == 14){
			gill2fluidOunce();
		}
		else if(choice1 == 17 && choice2 == 15){
			gill2gallon();
		}
		else if(choice1 == 17 && choice2 == 16){
			gill2gallonUK();
		}
		else if(choice1 == 17 && choice2 == 17){
			gill2gill();
		}
		else if(choice1 == 17 && choice2 == 18){
			gill2hectoL();
		}
		else if(choice1 == 17 && choice2 == 19){
			gill2KL();
		}
		else if(choice1 == 17 && choice2 == 20){
			gill2L();
		}
		else if(choice1 == 17 && choice2 == 21){
			gill2microL();
		}
		else if(choice1 == 17 && choice2 == 22){
			gill2ML();
		}
		else if(choice1 == 17 && choice2 == 23){
			gill2minim();
		}
		else if(choice1 == 17 && choice2 == 24){
			gill2peckUSdry();
		}
		else if(choice1 == 17 && choice2 == 25){
			gill2pintFluid();
		}
		else if(choice1 == 17 && choice2 == 26){
			gill2pintUK();
		}
		else if(choice1 == 17 && choice2 == 27){
			gill2pintUSdry();
		}
		else if(choice1 == 17 && choice2 == 28){
			gill2quartFluid();
		}
		else if(choice1 == 17 && choice2 == 29){
			gill2quartUK();
		}
		else if(choice1 == 17 && choice2 == 30){
			gill2quartUSdry();
		}
		//----------------------------------------\\
		//--------hectoL Conversion Choices--------\\
		if(choice1 == 18 && choice2 == 1){
			hectoL2barrel();
		}
		else if(choice1 == 18 && choice2 == 2){
			hectoL2bushelUK();
		}
		else if(choice1 == 18 && choice2 == 3){
			hectoL2bushelUSdry();
		}
		else if(choice1 == 18 && choice2 == 4){
			hectoL2centiliter();
		}
		else if(choice1 == 18 && choice2 == 5){
			hectoL2cubicCM();
		}
		else if(choice1 == 18 && choice2 == 6){
			hectoL2cubicDM();
		}
		else if(choice1 == 18 && choice2 == 7){
			hectoL2cubicFoot();
		}
		else if(choice1 == 18 && choice2 == 8){
			hectoL2cubicInch();
		}
		else if(choice1 == 18 && choice2 == 9){
			hectoL2cubicM();
		}
		else if(choice1 == 18 && choice2 == 10){
			hectoL2cubicMM();
		}
		else if(choice1 == 18 && choice2 == 11){
			hectoL2cubicYard();
		}
		else if(choice1 == 18 && choice2 == 12){
			hectoL2dekaL();
		}
		else if(choice1 == 18 && choice2 == 13){
			hectoL2fluidDram();
		}
		else if(choice1 == 18 && choice2 == 14){
			hectoL2fluidOunce();
		}
		else if(choice1 == 18 && choice2 == 15){
			hectoL2gallon();
		}
		else if(choice1 == 18 && choice2 == 16){
			hectoL2gallonUK();
		}
		else if(choice1 == 18 && choice2 == 17){
			hectoL2gill();
		}
		else if(choice1 == 18 && choice2 == 18){
			hectoL2hectoL();
		}
		else if(choice1 == 18 && choice2 == 19){
			hectoL2KL();
		}
		else if(choice1 == 18 && choice2 == 20){
			hectoL2L();
		}
		else if(choice1 == 18 && choice2 == 21){
			hectoL2microL();
		}
		else if(choice1 == 18 && choice2 == 22){
			hectoL2ML();
		}
		else if(choice1 == 18 && choice2 == 23){
			hectoL2minim();
		}
		else if(choice1 == 18 && choice2 == 24){
			hectoL2peckUSdry();
		}
		else if(choice1 == 18 && choice2 == 25){
			hectoL2pintFluid();
		}
		else if(choice1 == 18 && choice2 == 26){
			hectoL2pintUK();
		}
		else if(choice1 == 18 && choice2 == 27){
			hectoL2pintUSdry();
		}
		else if(choice1 == 18 && choice2 == 28){
			hectoL2quartFluid();
		}
		else if(choice1 == 18 && choice2 == 29){
			hectoL2quartUK();
		}
		else if(choice1 == 18 && choice2 == 30){
			hectoL2quartUSdry();
		}
		//----------------------------------------\\
		//--------KiloLiter Conversion Choices--------\\
		if(choice1 == 19 && choice2 == 1){
			KL2barrel();
		}
		else if(choice1 == 19 && choice2 == 2){
			KL2bushelUK();
		}
		else if(choice1 == 19 && choice2 == 3){
			KL2bushelUSdry();
		}
		else if(choice1 == 19 && choice2 == 4){
			KL2centiliter();
		}
		else if(choice1 == 19 && choice2 == 5){
			KL2cubicCM();
		}
		else if(choice1 == 19 && choice2 == 6){
			KL2cubicDM();
		}
		else if(choice1 == 19 && choice2 == 7){
			KL2cubicFoot();
		}
		else if(choice1 == 19 && choice2 == 8){
			KL2cubicInch();
		}
		else if(choice1 == 19 && choice2 == 9){
			KL2cubicM();
		}
		else if(choice1 == 19 && choice2 == 10){
			KL2cubicMM();
		}
		else if(choice1 == 19 && choice2 == 11){
			KL2cubicYard();
		}
		else if(choice1 == 19 && choice2 == 12){
			KL2dekaL();
		}
		else if(choice1 == 19 && choice2 == 13){
			KL2fluidDram();
		}
		else if(choice1 == 19 && choice2 == 14){
			KL2fluidOunce();
		}
		else if(choice1 == 19 && choice2 == 15){
			KL2gallon();
		}
		else if(choice1 == 19 && choice2 == 16){
			KL2gallonUK();
		}
		else if(choice1 == 19 && choice2 == 17){
			KL2gill();
		}
		else if(choice1 == 19 && choice2 == 18){
			KL2hectoL();
		}
		else if(choice1 == 19 && choice2 == 19){
			KL2KL();
		}
		else if(choice1 == 19 && choice2 == 20){
			KL2L();
		}
		else if(choice1 == 19 && choice2 == 21){
			KL2microL();
		}
		else if(choice1 == 19 && choice2 == 22){
			KL2ML();
		}
		else if(choice1 == 19 && choice2 == 23){
			KL2minim();
		}
		else if(choice1 == 19 && choice2 == 24){
			KL2peckUSdry();
		}
		else if(choice1 == 19 && choice2 == 25){
			KL2pintFluid();
		}
		else if(choice1 == 19 && choice2 == 26){
			KL2pintUK();
		}
		else if(choice1 == 19 && choice2 == 27){
			KL2pintUSdry();
		}
		else if(choice1 == 19 && choice2 == 28){
			KL2quartFluid();
		}
		else if(choice1 == 19 && choice2 == 29){
			KL2quartUK();
		}
		else if(choice1 == 19 && choice2 == 30){
			KL2quartUSdry();
		}
		//----------------------------------------\\
		//--------Liter Conversion Choices--------\\
		if(choice1 == 20 && choice2 == 1){
			L2barrel();
		}
		else if(choice1 == 20 && choice2 == 2){
			L2bushelUK();
		}
		else if(choice1 == 20 && choice2 == 3){
			L2bushelUSdry();
		}
		else if(choice1 == 20 && choice2 == 4){
			L2centiliter();
		}
		else if(choice1 == 20 && choice2 == 5){
			L2cubicCM();
		}
		else if(choice1 == 20 && choice2 == 6){
			L2cubicDM();
		}
		else if(choice1 == 20 && choice2 == 7){
			L2cubicFoot();
		}
		else if(choice1 == 20 && choice2 == 8){
			L2cubicInch();
		}
		else if(choice1 == 20 && choice2 == 9){
			L2cubicM();
		}
		else if(choice1 == 20 && choice2 == 10){
			L2cubicMM();
		}
		else if(choice1 == 20 && choice2 == 11){
			L2cubicYard();
		}
		else if(choice1 == 20 && choice2 == 12){
			L2dekaL();
		}
		else if(choice1 == 20 && choice2 == 13){
			L2fluidDram();
		}
		else if(choice1 == 20 && choice2 == 14){
			L2fluidOunce();
		}
		else if(choice1 == 20 && choice2 == 15){
			L2gallon();
		}
		else if(choice1 == 20 && choice2 == 16){
			L2gallonUK();
		}
		else if(choice1 == 20 && choice2 == 17){
			L2gill();
		}
		else if(choice1 == 20 && choice2 == 18){
			L2hectoL();
		}
		else if(choice1 == 20 && choice2 == 19){
			L2KL();
		}
		else if(choice1 == 20 && choice2 == 20){
			L2L();
		}
		else if(choice1 == 20 && choice2 == 21){
			L2microL();
		}
		else if(choice1 == 20 && choice2 == 22){
			L2ML();
		}
		else if(choice1 == 20 && choice2 == 23){
			L2minim();
		}
		else if(choice1 == 20 && choice2 == 24){
			L2peckUSdry();
		}
		else if(choice1 == 20 && choice2 == 25){
			L2pintFluid();
		}
		else if(choice1 == 20 && choice2 == 26){
			L2pintUK();
		}
		else if(choice1 == 20 && choice2 == 27){
			L2pintUSdry();
		}
		else if(choice1 == 20 && choice2 == 28){
			L2quartFluid();
		}
		else if(choice1 == 20 && choice2 == 29){
			L2quartUK();
		}
		else if(choice1 == 20 && choice2 == 30){
			L2quartUSdry();
		}
		//----------------------------------------\\
		//--------Micro Liter Conversion Choices--------\\
		if(choice1 == 21 && choice2 == 1){
			microL2barrel();
		}
		else if(choice1 == 21 && choice2 == 2){
			microL2bushelUK();
		}
		else if(choice1 == 21 && choice2 == 3){
			microL2bushelUSdry();
		}
		else if(choice1 == 21 && choice2 == 4){
			microL2centiliter();
		}
		else if(choice1 == 21 && choice2 == 5){
			microL2cubicCM();
		}
		else if(choice1 == 21 && choice2 == 6){
			microL2cubicDM();
		}
		else if(choice1 == 21 && choice2 == 7){
			microL2cubicFoot();
		}
		else if(choice1 == 21 && choice2 == 8){
			microL2cubicInch();
		}
		else if(choice1 == 21 && choice2 == 9){
			microL2cubicM();
		}
		else if(choice1 == 21 && choice2 == 10){
			microL2cubicMM();
		}
		else if(choice1 == 21 && choice2 == 11){
			microL2cubicYard();
		}
		else if(choice1 == 21 && choice2 == 12){
			microL2dekaL();
		}
		else if(choice1 == 21 && choice2 == 13){
			microL2fluidDram();
		}
		else if(choice1 == 21 && choice2 == 14){
			microL2fluidOunce();
		}
		else if(choice1 == 21 && choice2 == 15){
			microL2gallon();
		}
		else if(choice1 == 21 && choice2 == 16){
			microL2gallonUK();
		}
		else if(choice1 == 21 && choice2 == 17){
			microL2gill();
		}
		else if(choice1 == 21 && choice2 == 18){
			microL2hectoL();
		}
		else if(choice1 == 21 && choice2 == 19){
			microL2KL();
		}
		else if(choice1 == 21 && choice2 == 20){
			microL2L();
		}
		else if(choice1 == 21 && choice2 == 21){
			microL2microL();
		}
		else if(choice1 == 21 && choice2 == 22){
			microL2ML();
		}
		else if(choice1 == 21 && choice2 == 23){
			microL2minim();
		}
		else if(choice1 == 21 && choice2 == 24){
			microL2peckUSdry();
		}
		else if(choice1 == 21 && choice2 == 25){
			microL2pintFluid();
		}
		else if(choice1 == 21 && choice2 == 26){
			microL2pintUK();
		}
		else if(choice1 == 21 && choice2 == 27){
			microL2pintUSdry();
		}
		else if(choice1 == 21 && choice2 == 28){
			microL2quartFluid();
		}
		else if(choice1 == 21 && choice2 == 29){
			microL2quartUK();
		}
		else if(choice1 == 21 && choice2 == 30){
			microL2quartUSdry();
		}
		//----------------------------------------\\
		//--------Milliliter Conversion Choices--------\\
		if(choice1 == 22 && choice2 == 1){
			ML2barrel();
		}
		else if(choice1 == 22 && choice2 == 2){
			ML2bushelUK();
		}
		else if(choice1 == 22 && choice2 == 3){
			ML2bushelUSdry();
		}
		else if(choice1 == 22 && choice2 == 4){
			ML2centiliter();
		}
		else if(choice1 == 22 && choice2 == 5){
			ML2cubicCM();
		}
		else if(choice1 == 22 && choice2 == 6){
			ML2cubicDM();
		}
		else if(choice1 == 22 && choice2 == 7){
			ML2cubicFoot();
		}
		else if(choice1 == 22 && choice2 == 8){
			ML2cubicInch();
		}
		else if(choice1 == 22 && choice2 == 9){
			ML2cubicM();
		}
		else if(choice1 == 22 && choice2 == 10){
			ML2cubicMM();
		}
		else if(choice1 == 22 && choice2 == 11){
			ML2cubicYard();
		}
		else if(choice1 == 22 && choice2 == 12){
			ML2dekaL();
		}
		else if(choice1 == 22 && choice2 == 13){
			ML2fluidDram();
		}
		else if(choice1 == 22 && choice2 == 14){
			ML2fluidOunce();
		}
		else if(choice1 == 22 && choice2 == 15){
			ML2gallon();
		}
		else if(choice1 == 22 && choice2 == 16){
			ML2gallonUK();
		}
		else if(choice1 == 22 && choice2 == 17){
			ML2gill();
		}
		else if(choice1 == 22 && choice2 == 18){
			ML2hectoL();
		}
		else if(choice1 == 22 && choice2 == 19){
			ML2KL();
		}
		else if(choice1 == 22 && choice2 == 20){
			ML2L();
		}
		else if(choice1 == 22 && choice2 == 21){
			ML2microL();
		}
		else if(choice1 == 22 && choice2 == 22){
			ML2ML();
		}
		else if(choice1 == 22 && choice2 == 23){
			ML2minim();
		}
		else if(choice1 == 22 && choice2 == 24){
			ML2peckUSdry();
		}
		else if(choice1 == 22 && choice2 == 25){
			ML2pintFluid();
		}
		else if(choice1 == 22 && choice2 == 26){
			ML2pintUK();
		}
		else if(choice1 == 22 && choice2 == 27){
			ML2pintUSdry();
		}
		else if(choice1 == 22 && choice2 == 28){
			ML2quartFluid();
		}
		else if(choice1 == 22 && choice2 == 29){
			ML2quartUK();
		}
		else if(choice1 == 22 && choice2 == 30){
			ML2quartUSdry();
		}
		//----------------------------------------\\
		//--------Minim Conversion Choices--------\\
		if(choice1 == 23 && choice2 == 1){
			minim2barrel();
		}
		else if(choice1 == 23 && choice2 == 2){
			minim2bushelUK();
		}
		else if(choice1 == 23 && choice2 == 3){
			minim2bushelUSdry();
		}
		else if(choice1 == 23 && choice2 == 4){
			minim2centiliter();
		}
		else if(choice1 == 23 && choice2 == 5){
			minim2cubicCM();
		}
		else if(choice1 == 23 && choice2 == 6){
			minim2cubicDM();
		}
		else if(choice1 == 23 && choice2 == 7){
			minim2cubicFoot();
		}
		else if(choice1 == 23 && choice2 == 8){
			minim2cubicInch();
		}
		else if(choice1 == 23 && choice2 == 9){
			minim2cubicM();
		}
		else if(choice1 == 23 && choice2 == 10){
			minim2cubicMM();
		}
		else if(choice1 == 23 && choice2 == 11){
			minim2cubicYard();
		}
		else if(choice1 == 23 && choice2 == 12){
			minim2dekaL();
		}
		else if(choice1 == 23 && choice2 == 13){
			minim2fluidDram();
		}
		else if(choice1 == 23 && choice2 == 14){
			minim2fluidOunce();
		}
		else if(choice1 == 23 && choice2 == 15){
			minim2gallon();
		}
		else if(choice1 == 23 && choice2 == 16){
			minim2gallonUK();
		}
		else if(choice1 == 23 && choice2 == 17){
			minim2gill();
		}
		else if(choice1 == 23 && choice2 == 18){
			minim2hectoL();
		}
		else if(choice1 == 23 && choice2 == 19){
			minim2KL();
		}
		else if(choice1 == 23 && choice2 == 20){
			minim2L();
		}
		else if(choice1 == 23 && choice2 == 21){
			minim2microL();
		}
		else if(choice1 == 23 && choice2 == 22){
			minim2ML();
		}
		else if(choice1 == 23 && choice2 == 23){
			minim2minim();
		}
		else if(choice1 == 23 && choice2 == 24){
			minim2peckUSdry();
		}
		else if(choice1 == 23 && choice2 == 25){
			minim2pintFluid();
		}
		else if(choice1 == 23 && choice2 == 26){
			minim2pintUK();
		}
		else if(choice1 == 23 && choice2 == 27){
			minim2pintUSdry();
		}
		else if(choice1 == 23 && choice2 == 28){
			minim2quartFluid();
		}
		else if(choice1 == 23 && choice2 == 29){
			minim2quartUK();
		}
		else if(choice1 == 23 && choice2 == 30){
			minim2quartUSdry();
		}
		//----------------------------------------\\
		//--------Peck US Dry Conversion Choices--------\\
		if(choice1 == 24 && choice2 == 1){
			peckUSdry2barrel();
		}
		else if(choice1 == 24 && choice2 == 2){
			peckUSdry2bushelUK();
		}
		else if(choice1 == 24 && choice2 == 3){
			peckUSdry2bushelUSdry();
		}
		else if(choice1 == 24 && choice2 == 4){
			peckUSdry2centiliter();
		}
		else if(choice1 == 24 && choice2 == 5){
			peckUSdry2cubicCM();
		}
		else if(choice1 == 24 && choice2 == 6){
			peckUSdry2cubicDM();
		}
		else if(choice1 == 24 && choice2 == 7){
			peckUSdry2cubicFoot();
		}
		else if(choice1 == 24 && choice2 == 8){
			peckUSdry2cubicInch();
		}
		else if(choice1 == 24 && choice2 == 9){
			peckUSdry2cubicM();
		}
		else if(choice1 == 24 && choice2 == 10){
			peckUSdry2cubicMM();
		}
		else if(choice1 == 24 && choice2 == 11){
			peckUSdry2cubicYard();
		}
		else if(choice1 == 24 && choice2 == 12){
			peckUSdry2dekaL();
		}
		else if(choice1 == 24 && choice2 == 13){
			peckUSdry2fluidDram();
		}
		else if(choice1 == 24 && choice2 == 14){
			peckUSdry2fluidOunce();
		}
		else if(choice1 == 24 && choice2 == 15){
			peckUSdry2gallon();
		}
		else if(choice1 == 24 && choice2 == 16){
			peckUSdry2gallonUK();
		}
		else if(choice1 == 24 && choice2 == 17){
			peckUSdry2gill();
		}
		else if(choice1 == 24 && choice2 == 18){
			peckUSdry2hectoL();
		}
		else if(choice1 == 24 && choice2 == 19){
			peckUSdry2KL();
		}
		else if(choice1 == 24 && choice2 == 20){
			peckUSdry2L();
		}
		else if(choice1 == 24 && choice2 == 21){
			peckUSdry2microL();
		}
		else if(choice1 == 24 && choice2 == 22){
			peckUSdry2ML();
		}
		else if(choice1 == 24 && choice2 == 23){
			peckUSdry2minim();
		}
		else if(choice1 == 24 && choice2 == 24){
			peckUSdry2peckUSdry();
		}
		else if(choice1 == 24 && choice2 == 25){
			peckUSdry2pintFluid();
		}
		else if(choice1 == 24 && choice2 == 26){
			peckUSdry2pintUK();
		}
		else if(choice1 == 24 && choice2 == 27){
			peckUSdry2pintUSdry();
		}
		else if(choice1 == 24 && choice2 == 28){
			peckUSdry2quartFluid();
		}
		else if(choice1 == 24 && choice2 == 29){
			peckUSdry2quartUK();
		}
		else if(choice1 == 24 && choice2 == 30){
			peckUSdry2quartUSdry();
		}
		//----------------------------------------\\
		//--------Pint Fluid Conversion Choices--------\\
		if(choice1 == 25 && choice2 == 1){
			pintFluid2barrel();
		}
		else if(choice1 == 25 && choice2 == 2){
			pintFluid2bushelUK();
		}
		else if(choice1 == 25 && choice2 == 3){
			pintFluid2bushelUSdry();
		}
		else if(choice1 == 25 && choice2 == 4){
			pintFluid2centiliter();
		}
		else if(choice1 == 25 && choice2 == 5){
			pintFluid2cubicCM();
		}
		else if(choice1 == 25 && choice2 == 6){
			pintFluid2cubicDM();
		}
		else if(choice1 == 25 && choice2 == 7){
			pintFluid2cubicFoot();
		}
		else if(choice1 == 25 && choice2 == 8){
			pintFluid2cubicInch();
		}
		else if(choice1 == 25 && choice2 == 9){
			pintFluid2cubicM();
		}
		else if(choice1 == 25 && choice2 == 10){
			pintFluid2cubicMM();
		}
		else if(choice1 == 25 && choice2 == 11){
			pintFluid2cubicYard();
		}
		else if(choice1 == 25 && choice2 == 12){
			pintFluid2dekaL();
		}
		else if(choice1 == 25 && choice2 == 13){
			pintFluid2fluidDram();
		}
		else if(choice1 == 25 && choice2 == 14){
			pintFluid2fluidOunce();
		}
		else if(choice1 == 25 && choice2 == 15){
			pintFluid2gallon();
		}
		else if(choice1 == 25 && choice2 == 16){
			pintFluid2gallonUK();
		}
		else if(choice1 == 25 && choice2 == 17){
			pintFluid2gill();
		}
		else if(choice1 == 25 && choice2 == 18){
			pintFluid2hectoL();
		}
		else if(choice1 == 25 && choice2 == 19){
			pintFluid2KL();
		}
		else if(choice1 == 25 && choice2 == 20){
			pintFluid2L();
		}
		else if(choice1 == 25 && choice2 == 21){
			pintFluid2microL();
		}
		else if(choice1 == 25 && choice2 == 22){
			pintFluid2ML();
		}
		else if(choice1 == 25 && choice2 == 23){
			pintFluid2minim();
		}
		else if(choice1 == 25 && choice2 == 24){
			pintFluid2peckUSdry();
		}
		else if(choice1 == 25 && choice2 == 25){
			pintFluid2pintFluid();
		}
		else if(choice1 == 25 && choice2 == 26){
			pintFluid2pintUK();
		}
		else if(choice1 == 25 && choice2 == 27){
			pintFluid2pintUSdry();
		}
		else if(choice1 == 25 && choice2 == 28){
			pintFluid2quartFluid();
		}
		else if(choice1 == 25 && choice2 == 29){
			pintFluid2quartUK();
		}
		else if(choice1 == 25 && choice2 == 30){
			pintFluid2quartUSdry();
		}
		//----------------------------------------\\
		//--------Pint UK Conversion Choices--------\\
		if(choice1 == 26 && choice2 == 1){
			pintUK2barrel();
		}
		else if(choice1 == 26 && choice2 == 2){
			pintUK2bushelUK();
		}
		else if(choice1 == 26 && choice2 == 3){
			pintUK2bushelUSdry();
		}
		else if(choice1 == 26 && choice2 == 4){
			pintUK2centiliter();
		}
		else if(choice1 == 26 && choice2 == 5){
			pintUK2cubicCM();
		}
		else if(choice1 == 26 && choice2 == 6){
			pintUK2cubicDM();
		}
		else if(choice1 == 26 && choice2 == 7){
			pintUK2cubicFoot();
		}
		else if(choice1 == 26 && choice2 == 8){
			pintUK2cubicInch();
		}
		else if(choice1 == 26 && choice2 == 9){
			pintUK2cubicM();
		}
		else if(choice1 == 26 && choice2 == 10){
			pintUK2cubicMM();
		}
		else if(choice1 == 26 && choice2 == 11){
			pintUK2cubicYard();
		}
		else if(choice1 == 26 && choice2 == 12){
			pintUK2dekaL();
		}
		else if(choice1 == 26 && choice2 == 13){
			pintUK2fluidDram();
		}
		else if(choice1 == 26 && choice2 == 14){
			pintUK2fluidOunce();
		}
		else if(choice1 == 26 && choice2 == 15){
			pintUK2gallon();
		}
		else if(choice1 == 26 && choice2 == 16){
			pintUK2gallonUK();
		}
		else if(choice1 == 26 && choice2 == 17){
			pintUK2gill();
		}
		else if(choice1 == 26 && choice2 == 18){
			pintUK2hectoL();
		}
		else if(choice1 == 26 && choice2 == 19){
			pintUK2KL();
		}
		else if(choice1 == 26 && choice2 == 20){
			pintUK2L();
		}
		else if(choice1 == 26 && choice2 == 21){
			pintUK2microL();
		}
		else if(choice1 == 26 && choice2 == 22){
			pintUK2ML();
		}
		else if(choice1 == 26 && choice2 == 23){
			pintUK2minim();
		}
		else if(choice1 == 26 && choice2 == 24){
			pintUK2peckUSdry();
		}
		else if(choice1 == 26 && choice2 == 25){
			pintUK2pintFluid();
		}
		else if(choice1 == 26 && choice2 == 26){
			pintUK2pintUK();
		}
		else if(choice1 == 26 && choice2 == 27){
			pintUK2pintUSdry();
		}
		else if(choice1 == 26 && choice2 == 28){
			pintUK2quartFluid();
		}
		else if(choice1 == 26 && choice2 == 29){
			pintUK2quartUK();
		}
		else if(choice1 == 26 && choice2 == 30){
			pintUK2quartUSdry();
		}
		//----------------------------------------\\
		//--------Pint US Dry Conversion Choices--------\\
		if(choice1 == 27 && choice2 == 1){
			pintUSdry2barrel();
		}
		else if(choice1 == 27 && choice2 == 2){
			pintUSdry2bushelUK();
		}
		else if(choice1 == 27 && choice2 == 3){
			pintUSdry2bushelUSdry();
		}
		else if(choice1 == 27 && choice2 == 4){
			pintUSdry2centiliter();
		}
		else if(choice1 == 27 && choice2 == 5){
			pintUSdry2cubicCM();
		}
		else if(choice1 == 27 && choice2 == 6){
			pintUSdry2cubicDM();
		}
		else if(choice1 == 27 && choice2 == 7){
			pintUSdry2cubicFoot();
		}
		else if(choice1 == 27 && choice2 == 8){
			pintUSdry2cubicInch();
		}
		else if(choice1 == 27 && choice2 == 9){
			pintUSdry2cubicM();
		}
		else if(choice1 == 27 && choice2 == 10){
			pintUSdry2cubicMM();
		}
		else if(choice1 == 27 && choice2 == 11){
			pintUSdry2cubicYard();
		}
		else if(choice1 == 27 && choice2 == 12){
			pintUSdry2dekaL();
		}
		else if(choice1 == 27 && choice2 == 13){
			pintUSdry2fluidDram();
		}
		else if(choice1 == 27 && choice2 == 14){
			pintUSdry2fluidOunce();
		}
		else if(choice1 == 27 && choice2 == 15){
			pintUSdry2gallon();
		}
		else if(choice1 == 27 && choice2 == 16){
			pintUSdry2gallonUK();
		}
		else if(choice1 == 27 && choice2 == 17){
			pintUSdry2gill();
		}
		else if(choice1 == 27 && choice2 == 18){
			pintUSdry2hectoL();
		}
		else if(choice1 == 27 && choice2 == 19){
			pintUSdry2KL();
		}
		else if(choice1 == 27 && choice2 == 20){
			pintUSdry2L();
		}
		else if(choice1 == 27 && choice2 == 21){
			pintUSdry2microL();
		}
		else if(choice1 == 27 && choice2 == 22){
			pintUSdry2ML();
		}
		else if(choice1 == 27 && choice2 == 23){
			pintUSdry2minim();
		}
		else if(choice1 == 27 && choice2 == 24){
			pintUSdry2peckUSdry();
		}
		else if(choice1 == 27 && choice2 == 25){
			pintUSdry2pintFluid();
		}
		else if(choice1 == 27 && choice2 == 26){
			pintUSdry2pintUK();
		}
		else if(choice1 == 27 && choice2 == 27){
			pintUSdry2pintUSdry();
		}
		else if(choice1 == 27 && choice2 == 28){
			pintUSdry2quartFluid();
		}
		else if(choice1 == 27 && choice2 == 29){
			pintUSdry2quartUK();
		}
		else if(choice1 == 27 && choice2 == 30){
			pintUSdry2quartUSdry();
		}
		//----------------------------------------\\
		//--------Quart Fluid Conversion Choices--------\\
		if(choice1 == 28 && choice2 == 1){
			quartFluid2barrel();
		}
		else if(choice1 == 28 && choice2 == 2){
			quartFluid2bushelUK();
		}
		else if(choice1 == 28 && choice2 == 3){
			quartFluid2bushelUSdry();
		}
		else if(choice1 == 28 && choice2 == 4){
			quartFluid2centiliter();
		}
		else if(choice1 == 28 && choice2 == 5){
			quartFluid2cubicCM();
		}
		else if(choice1 == 28 && choice2 == 6){
			quartFluid2cubicDM();
		}
		else if(choice1 == 28 && choice2 == 7){
			quartFluid2cubicFoot();
		}
		else if(choice1 == 28 && choice2 == 8){
			quartFluid2cubicInch();
		}
		else if(choice1 == 28 && choice2 == 9){
			quartFluid2cubicM();
		}
		else if(choice1 == 28 && choice2 == 10){
			quartFluid2cubicMM();
		}
		else if(choice1 == 28 && choice2 == 11){
			quartFluid2cubicYard();
		}
		else if(choice1 == 28 && choice2 == 12){
			quartFluid2dekaL();
		}
		else if(choice1 == 28 && choice2 == 13){
			quartFluid2fluidDram();
		}
		else if(choice1 == 28 && choice2 == 14){
			quartFluid2fluidOunce();
		}
		else if(choice1 == 28 && choice2 == 15){
			quartFluid2gallon();
		}
		else if(choice1 == 28 && choice2 == 16){
			quartFluid2gallonUK();
		}
		else if(choice1 == 28 && choice2 == 17){
			quartFluid2gill();
		}
		else if(choice1 == 28 && choice2 == 18){
			quartFluid2hectoL();
		}
		else if(choice1 == 28 && choice2 == 19){
			quartFluid2KL();
		}
		else if(choice1 == 28 && choice2 == 20){
			quartFluid2L();
		}
		else if(choice1 == 28 && choice2 == 21){
			quartFluid2microL();
		}
		else if(choice1 == 28 && choice2 == 22){
			quartFluid2ML();
		}
		else if(choice1 == 28 && choice2 == 23){
			quartFluid2minim();
		}
		else if(choice1 == 28 && choice2 == 24){
			quartFluid2peckUSdry();
		}
		else if(choice1 == 28 && choice2 == 25){
			quartFluid2pintFluid();
		}
		else if(choice1 == 28 && choice2 == 26){
			quartFluid2pintUK();
		}
		else if(choice1 == 28 && choice2 == 27){
			quartFluid2pintUSdry();
		}
		else if(choice1 == 28 && choice2 == 28){
			quartFluid2quartFluid();
		}
		else if(choice1 == 28 && choice2 == 29){
			quartFluid2quartUK();
		}
		else if(choice1 == 28 && choice2 == 30){
			quartFluid2quartUSdry();
		}
		//----------------------------------------\\
		//--------Quart UK Conversion Choices--------\\
		if(choice1 == 29 && choice2 == 1){
			quartUK2barrel();
		}
		else if(choice1 == 29 && choice2 == 2){
			quartUK2bushelUK();
		}
		else if(choice1 == 29 && choice2 == 3){
			quartUK2bushelUSdry();
		}
		else if(choice1 == 29 && choice2 == 4){
			quartUK2centiliter();
		}
		else if(choice1 == 29 && choice2 == 5){
			quartUK2cubicCM();
		}
		else if(choice1 == 29 && choice2 == 6){
			quartUK2cubicDM();
		}
		else if(choice1 == 29 && choice2 == 7){
			quartUK2cubicFoot();
		}
		else if(choice1 == 29 && choice2 == 8){
			quartUK2cubicInch();
		}
		else if(choice1 == 29 && choice2 == 9){
			quartUK2cubicM();
		}
		else if(choice1 == 29 && choice2 == 10){
			quartUK2cubicMM();
		}
		else if(choice1 == 29 && choice2 == 11){
			quartUK2cubicYard();
		}
		else if(choice1 == 29 && choice2 == 12){
			quartUK2dekaL();
		}
		else if(choice1 == 29 && choice2 == 13){
			quartUK2fluidDram();
		}
		else if(choice1 == 29 && choice2 == 14){
			quartUK2fluidOunce();
		}
		else if(choice1 == 29 && choice2 == 15){
			quartUK2gallon();
		}
		else if(choice1 == 29 && choice2 == 16){
			quartUK2gallonUK();
		}
		else if(choice1 == 29 && choice2 == 17){
			quartUK2gill();
		}
		else if(choice1 == 29 && choice2 == 18){
			quartUK2hectoL();
		}
		else if(choice1 == 29 && choice2 == 19){
			quartUK2KL();
		}
		else if(choice1 == 29 && choice2 == 20){
			quartUK2L();
		}
		else if(choice1 == 29 && choice2 == 21){
			quartUK2microL();
		}
		else if(choice1 == 29 && choice2 == 22){
			quartUK2ML();
		}
		else if(choice1 == 29 && choice2 == 23){
			quartUK2minim();
		}
		else if(choice1 == 29 && choice2 == 24){
			quartUK2peckUSdry();
		}
		else if(choice1 == 29 && choice2 == 25){
			quartUK2pintFluid();
		}
		else if(choice1 == 29 && choice2 == 26){
			quartUK2pintUK();
		}
		else if(choice1 == 29 && choice2 == 27){
			quartUK2pintUSdry();
		}
		else if(choice1 == 29 && choice2 == 28){
			quartUK2quartFluid();
		}
		else if(choice1 == 29 && choice2 == 29){
			quartUK2quartUK();
		}
		else if(choice1 == 29 && choice2 == 30){
			quartUK2quartUSdry();
		}
		//----------------------------------------\\
		//--------Quart US Conversion Choices--------\\
		if(choice1 == 30 && choice2 == 1){
			quartUSdry2barrel();
		}
		else if(choice1 == 30 && choice2 == 2){
			quartUSdry2bushelUK();
		}
		else if(choice1 == 30 && choice2 == 3){
			quartUSdry2bushelUSdry();
		}
		else if(choice1 == 30 && choice2 == 4){
			quartUSdry2centiliter();
		}
		else if(choice1 == 30 && choice2 == 5){
			quartUSdry2cubicCM();
		}
		else if(choice1 == 30 && choice2 == 6){
			quartUSdry2cubicDM();
		}
		else if(choice1 == 30 && choice2 == 7){
			quartUSdry2cubicFoot();
		}
		else if(choice1 == 30 && choice2 == 8){
			quartUSdry2cubicInch();
		}
		else if(choice1 == 30 && choice2 == 9){
			quartUSdry2cubicM();
		}
		else if(choice1 == 30 && choice2 == 10){
			quartUSdry2cubicMM();
		}
		else if(choice1 == 30 && choice2 == 11){
			quartUSdry2cubicYard();
		}
		else if(choice1 == 30 && choice2 == 12){
			quartUSdry2dekaL();
		}
		else if(choice1 == 30 && choice2 == 13){
			quartUSdry2fluidDram();
		}
		else if(choice1 == 30 && choice2 == 14){
			quartUSdry2fluidOunce();
		}
		else if(choice1 == 30 && choice2 == 15){
			quartUSdry2gallon();
		}
		else if(choice1 == 30 && choice2 == 16){
			quartUSdry2gallonUK();
		}
		else if(choice1 == 30 && choice2 == 17){
			quartUSdry2gill();
		}
		else if(choice1 == 30 && choice2 == 18){
			quartUSdry2hectoL();
		}
		else if(choice1 == 30 && choice2 == 19){
			quartUSdry2KL();
		}
		else if(choice1 == 30 && choice2 == 20){
			quartUSdry2L();
		}
		else if(choice1 == 30 && choice2 == 21){
			quartUSdry2microL();
		}
		else if(choice1 == 30 && choice2 == 22){
			quartUSdry2ML();
		}
		else if(choice1 == 30 && choice2 == 23){
			quartUSdry2minim();
		}
		else if(choice1 == 30 && choice2 == 24){
			quartUSdry2peckUSdry();
		}
		else if(choice1 == 30 && choice2 == 25){
			quartUSdry2pintFluid();
		}
		else if(choice1 == 30 && choice2 == 26){
			quartUSdry2pintUK();
		}
		else if(choice1 == 30 && choice2 == 27){
			quartUSdry2pintUSdry();
		}
		else if(choice1 == 30 && choice2 == 28){
			quartUSdry2quartFluid();
		}
		else if(choice1 == 30 && choice2 == 29){
			quartUSdry2quartUK();
		}
		else if(choice1 == 30 && choice2 == 30){
			quartUSdry2quartUSdry();
		}
		//----------------------------------------\\
		outputUnit();
		scn.nextInt();
	}
	//---------------Output Units-----------------------\\
	public static void outputUnit(){
		System.out.println("\n " + unit +" "+units[choice2-1]);
		System.out.println("Press Enter!");
	}
	//`````````````````````````````````````````````````````````\\
	//------------------Cubic Meter Conversions----------------------\\
	public static void cubicM2barrel(){
		unit= unit.multiply(new BigDecimal("6.2898150771432"));
	}
	public static void cubicM2bushelUK(){
		unit= unit.multiply(new BigDecimal("27.49615603739"));
	}
	public static void cubicM2bushelUSdry(){
		unit= unit.multiply(new BigDecimal("28.3775932584"));
	}
	public static void cubicM2centiliter(){
		unit= unit.multiply(new BigDecimal("100000"));
	}
	public static void cubicM2cubicCM(){
		unit= unit.multiply(new BigDecimal("1000000"));
	}
	public static void cubicM2cubicDM(){
		unit= unit.multiply(new BigDecimal("1000"));
	}
	public static void cubicM2cubicFoot(){
		unit= unit.multiply(new BigDecimal("35.31466672149"));
	}
	public static void cubicM2cubicInch(){
		unit= unit.multiply(new BigDecimal("61023.74409473"));
	}
	public static void cubicM2cubicM(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void cubicM2cubicMM(){
		unit= unit.multiply(new BigDecimal("1000000000"));
	}
	public static void cubicM2cubicYard(){
		unit= unit.multiply(new BigDecimal("1.307950619314"));
	}
	public static void cubicM2dekaL(){
		unit= unit.multiply(new BigDecimal("100"));
	}
	public static void cubicM2fluidDram(){
		unit= unit.multiply(new BigDecimal("270512.1816147"));
	}
	public static void cubicM2fluidOunce(){
		unit= unit.multiply(new BigDecimal("33814.02270184"));
	}
	public static void cubicM2gallon(){
		unit= unit.multiply(new BigDecimal("264.1720523581"));
	}
	public static void cubicM2gallonUK(){
		unit= unit.multiply(new BigDecimal("219.9692482991"));
	}
	public static void cubicM2gill(){
		unit= unit.multiply(new BigDecimal("8453.505675461"));
	}
	public static void cubicM2hectoL(){
		unit= unit.multiply(new BigDecimal("10"));
	}
	public static void cubicM2KL(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void cubicM2L(){
		unit= unit.multiply(new BigDecimal("1000"));
	}
	public static void cubicM2microL(){
		unit= unit.multiply(new BigDecimal("1000000000"));
	}
	public static void cubicM2ML(){
		unit= unit.multiply(new BigDecimal("1000000"));
	}
	public static void cubicM2minim(){
		unit= unit.multiply(new BigDecimal("16230730.89689"));
	}
	public static void cubicM2peckUSdry(){
		unit= unit.multiply(new BigDecimal("113.5103730336"));
	}
	public static void cubicM2pintFluid(){
		unit= unit.multiply(new BigDecimal("2113.376418865"));
	}
	public static void cubicM2pintUK(){
		unit= unit.multiply(new BigDecimal("1759.753986393"));
	}
	public static void cubicM2pintUSdry(){
		unit= unit.multiply(new BigDecimal("1816.165968538"));
	}
	public static void cubicM2quartFluid(){
		unit= unit.multiply(new BigDecimal("1056.688209433"));
	}
	public static void cubicM2quartUK(){
		unit= unit.multiply(new BigDecimal("879.8769931964"));
	}
	public static void cubicM2quartUSdry(){
		unit= unit.multiply(new BigDecimal("908.0829842689"));
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Barrel Conversions----------------------\\
	public static void barrel2cubicM(){
		unit= unit.multiply(new BigDecimal("0.158987294928"));
	}
	public static void barrel2barrel(){
		barrel2cubicM();
		cubicM2barrel();
	}
	public static void barrel2bushelUK(){
		barrel2cubicM();
		cubicM2bushelUK();
	}
	public static void barrel2bushelUSdry(){
		barrel2cubicM();
		cubicM2bushelUSdry();
	}
	public static void barrel2centiliter(){
		barrel2cubicM();
		cubicM2centiliter();
	}
	public static void barrel2cubicCM(){
		barrel2cubicM();
		cubicM2cubicCM();
	}
	public static void barrel2cubicDM(){
		barrel2cubicM();
		cubicM2cubicDM();
	}
	public static void barrel2cubicFoot(){
		barrel2cubicM();
		cubicM2cubicFoot();
	}
	public static void barrel2cubicInch(){
		barrel2cubicM();
		cubicM2cubicInch();
	}
	public static void barrel2cubicMM(){
		barrel2cubicM();
		cubicM2cubicMM();
	}
	public static void barrel2cubicYard(){
		barrel2cubicM();
		cubicM2cubicYard();
	}
	public static void barrel2dekaL(){
		barrel2cubicM();
		cubicM2dekaL();
	}
	public static void barrel2fluidDram(){
		barrel2cubicM();
		cubicM2fluidDram();
	}
	public static void barrel2fluidOunce(){
		barrel2cubicM();
		cubicM2fluidOunce();
	}
	public static void barrel2gallon(){
		barrel2cubicM();
		cubicM2gallon();
	}
	public static void barrel2gallonUK(){
		barrel2cubicM();
		cubicM2gallonUK();
	}
	public static void barrel2gill(){
		barrel2cubicM();
		cubicM2gill();
	}
	public static void barrel2hectoL(){
		barrel2cubicM();
		cubicM2hectoL();
	}
	public static void barrel2KL(){
		barrel2cubicM();
		cubicM2KL();
	}
	public static void barrel2L(){
		barrel2cubicM();
		cubicM2L();
	}
	public static void barrel2microL(){
		barrel2cubicM();
		cubicM2microL();
	}
	public static void barrel2ML(){
		barrel2cubicM();
		cubicM2ML();
	}
	public static void barrel2minim(){
		barrel2cubicM();
		cubicM2minim();
	}
	public static void barrel2peckUSdry(){
		barrel2cubicM();
		cubicM2peckUSdry();
	}
	public static void barrel2pintFluid(){
		barrel2cubicM();
		cubicM2pintFluid();
	}
	public static void barrel2pintUK(){
		barrel2cubicM();
		cubicM2pintUK();
	}
	public static void barrel2pintUSdry(){
		barrel2cubicM();
		cubicM2pintUSdry();
	}
	public static void barrel2quartFluid(){
		barrel2cubicM();
		cubicM2quartFluid();
	}
	public static void barrel2quartUK(){
		barrel2cubicM();
		cubicM2quartUK();
	}
	public static void barrel2quartUSdry(){
		barrel2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Bushel UK Conversions----------------------\\
	public static void bushelUK2cubicM(){
		unit= unit.multiply(new BigDecimal("0.03636872"));
	}
	public static void bushelUK2barrel(){
		bushelUK2cubicM();
		cubicM2barrel();
	}
	public static void bushelUK2bushelUK(){
		bushelUK2cubicM();
		cubicM2bushelUK();
	}
	public static void bushelUK2bushelUSdry(){
		bushelUK2cubicM();
		cubicM2bushelUSdry();
	}
	public static void bushelUK2centiliter(){
		bushelUK2cubicM();
		cubicM2centiliter();
	}
	public static void bushelUK2cubicCM(){
		bushelUK2cubicM();
		cubicM2cubicCM();
	}
	public static void bushelUK2cubicDM(){
		bushelUK2cubicM();
		cubicM2cubicDM();
	}
	public static void bushelUK2cubicFoot(){
		bushelUK2cubicM();
		cubicM2cubicFoot();
	}
	public static void bushelUK2cubicInch(){
		bushelUK2cubicM();
		cubicM2cubicInch();
	}
	public static void bushelUK2cubicMM(){
		bushelUK2cubicM();
		cubicM2cubicMM();
	}
	public static void bushelUK2cubicYard(){
		bushelUK2cubicM();
		cubicM2cubicYard();
	}
	public static void bushelUK2dekaL(){
		bushelUK2cubicM();
		cubicM2dekaL();
	}
	public static void bushelUK2fluidDram(){
		bushelUK2cubicM();
		cubicM2fluidDram();
	}
	public static void bushelUK2fluidOunce(){
		bushelUK2cubicM();
		cubicM2fluidOunce();
	}
	public static void bushelUK2gallon(){
		bushelUK2cubicM();
		cubicM2gallon();
	}
	public static void bushelUK2gallonUK(){
		bushelUK2cubicM();
		cubicM2gallonUK();
	}
	public static void bushelUK2gill(){
		bushelUK2cubicM();
		cubicM2gill();
	}
	public static void bushelUK2hectoL(){
		bushelUK2cubicM();
		cubicM2hectoL();
	}
	public static void bushelUK2KL(){
		bushelUK2cubicM();
		cubicM2KL();
	}
	public static void bushelUK2L(){
		bushelUK2cubicM();
		cubicM2L();
	}
	public static void bushelUK2microL(){
		bushelUK2cubicM();
		cubicM2microL();
	}
	public static void bushelUK2ML(){
		bushelUK2cubicM();
		cubicM2ML();
	}
	public static void bushelUK2minim(){
		bushelUK2cubicM();
		cubicM2minim();
	}
	public static void bushelUK2peckUSdry(){
		bushelUK2cubicM();
		cubicM2peckUSdry();
	}
	public static void bushelUK2pintFluid(){
		bushelUK2cubicM();
		cubicM2pintFluid();
	}
	public static void bushelUK2pintUK(){
		bushelUK2cubicM();
		cubicM2pintUK();
	}
	public static void bushelUK2pintUSdry(){
		bushelUK2cubicM();
		cubicM2pintUSdry();
	}
	public static void bushelUK2quartFluid(){
		bushelUK2cubicM();
		cubicM2quartFluid();
	}
	public static void bushelUK2quartUK(){
		bushelUK2cubicM();
		cubicM2quartUK();
	}
	public static void bushelUK2quartUSdry(){
		bushelUK2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Bushel US Dry Conversions----------------------\\
	public static void bushelUSdry2cubicM(){
		unit= unit.multiply(new BigDecimal("0.0352390701668"));
	}
	public static void bushelUSdry2barrel(){
		bushelUSdry2cubicM();
		cubicM2barrel();
	}
	public static void bushelUSdry2bushelUK(){
		bushelUSdry2cubicM();
		cubicM2bushelUK();
	}
	public static void bushelUSdry2bushelUSdry(){
		bushelUSdry2cubicM();
		cubicM2bushelUSdry();
	}
	public static void bushelUSdry2centiliter(){
		bushelUSdry2cubicM();
		cubicM2centiliter();
	}
	public static void bushelUSdry2cubicCM(){
		bushelUSdry2cubicM();
		cubicM2cubicCM();
	}
	public static void bushelUSdry2cubicDM(){
		bushelUSdry2cubicM();
		cubicM2cubicDM();
	}
	public static void bushelUSdry2cubicFoot(){
		bushelUSdry2cubicM();
		cubicM2cubicFoot();
	}
	public static void bushelUSdry2cubicInch(){
		bushelUSdry2cubicM();
		cubicM2cubicInch();
	}
	public static void bushelUSdry2cubicMM(){
		bushelUSdry2cubicM();
		cubicM2cubicMM();
	}
	public static void bushelUSdry2cubicYard(){
		bushelUSdry2cubicM();
		cubicM2cubicYard();
	}
	public static void bushelUSdry2dekaL(){
		bushelUSdry2cubicM();
		cubicM2dekaL();
	}
	public static void bushelUSdry2fluidDram(){
		bushelUSdry2cubicM();
		cubicM2fluidDram();
	}
	public static void bushelUSdry2fluidOunce(){
		bushelUSdry2cubicM();
		cubicM2fluidOunce();
	}
	public static void bushelUSdry2gallon(){
		bushelUSdry2cubicM();
		cubicM2gallon();
	}
	public static void bushelUSdry2gallonUK(){
		bushelUSdry2cubicM();
		cubicM2gallonUK();
	}
	public static void bushelUSdry2gill(){
		bushelUSdry2cubicM();
		cubicM2gill();
	}
	public static void bushelUSdry2hectoL(){
		bushelUSdry2cubicM();
		cubicM2hectoL();
	}
	public static void bushelUSdry2KL(){
		bushelUSdry2cubicM();
		cubicM2KL();
	}
	public static void bushelUSdry2L(){
		bushelUSdry2cubicM();
		cubicM2L();
	}
	public static void bushelUSdry2microL(){
		bushelUSdry2cubicM();
		cubicM2microL();
	}
	public static void bushelUSdry2ML(){
		bushelUSdry2cubicM();
		cubicM2ML();
	}
	public static void bushelUSdry2minim(){
		bushelUSdry2cubicM();
		cubicM2minim();
	}
	public static void bushelUSdry2peckUSdry(){
		bushelUSdry2cubicM();
		cubicM2peckUSdry();
	}
	public static void bushelUSdry2pintFluid(){
		bushelUSdry2cubicM();
		cubicM2pintFluid();
	}
	public static void bushelUSdry2pintUK(){
		bushelUSdry2cubicM();
		cubicM2pintUK();
	}
	public static void bushelUSdry2pintUSdry(){
		bushelUSdry2cubicM();
		cubicM2pintUSdry();
	}
	public static void bushelUSdry2quartFluid(){
		bushelUSdry2cubicM();
		cubicM2quartFluid();
	}
	public static void bushelUSdry2quartUK(){
		bushelUSdry2cubicM();
		cubicM2quartUK();
	}
	public static void bushelUSdry2quartUSdry(){
		bushelUSdry2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Centiliter Conversions----------------------\\
	public static void centiliter2cubicM(){
		unit= unit.multiply(new BigDecimal("0.00001"));
	}
	public static void centiliter2barrel(){
		centiliter2cubicM();
		cubicM2barrel();
	}
	public static void centiliter2bushelUK(){
		centiliter2cubicM();
		cubicM2bushelUK();
	}
	public static void centiliter2bushelUSdry(){
		centiliter2cubicM();
		cubicM2bushelUSdry();
	}
	public static void centiliter2centiliter(){
		centiliter2cubicM();
		cubicM2centiliter();
	}
	public static void centiliter2cubicCM(){
		centiliter2cubicM();
		cubicM2cubicCM();
	}
	public static void centiliter2cubicDM(){
		centiliter2cubicM();
		cubicM2cubicDM();
	}
	public static void centiliter2cubicFoot(){
		centiliter2cubicM();
		cubicM2cubicFoot();
	}
	public static void centiliter2cubicInch(){
		centiliter2cubicM();
		cubicM2cubicInch();
	}
	public static void centiliter2cubicMM(){
		centiliter2cubicM();
		cubicM2cubicMM();
	}
	public static void centiliter2cubicYard(){
		centiliter2cubicM();
		cubicM2cubicYard();
	}
	public static void centiliter2dekaL(){
		centiliter2cubicM();
		cubicM2dekaL();
	}
	public static void centiliter2fluidDram(){
		centiliter2cubicM();
		cubicM2fluidDram();
	}
	public static void centiliter2fluidOunce(){
		centiliter2cubicM();
		cubicM2fluidOunce();
	}
	public static void centiliter2gallon(){
		centiliter2cubicM();
		cubicM2gallon();
	}
	public static void centiliter2gallonUK(){
		centiliter2cubicM();
		cubicM2gallonUK();
	}
	public static void centiliter2gill(){
		centiliter2cubicM();
		cubicM2gill();
	}
	public static void centiliter2hectoL(){
		centiliter2cubicM();
		cubicM2hectoL();
	}
	public static void centiliter2KL(){
		centiliter2cubicM();
		cubicM2KL();
	}
	public static void centiliter2L(){
		centiliter2cubicM();
		cubicM2L();
	}
	public static void centiliter2microL(){
		centiliter2cubicM();
		cubicM2microL();
	}
	public static void centiliter2ML(){
		centiliter2cubicM();
		cubicM2ML();
	}
	public static void centiliter2minim(){
		centiliter2cubicM();
		cubicM2minim();
	}
	public static void centiliter2peckUSdry(){
		centiliter2cubicM();
		cubicM2peckUSdry();
	}
	public static void centiliter2pintFluid(){
		centiliter2cubicM();
		cubicM2pintFluid();
	}
	public static void centiliter2pintUK(){
		centiliter2cubicM();
		cubicM2pintUK();
	}
	public static void centiliter2pintUSdry(){
		centiliter2cubicM();
		cubicM2pintUSdry();
	}
	public static void centiliter2quartFluid(){
		centiliter2cubicM();
		cubicM2quartFluid();
	}
	public static void centiliter2quartUK(){
		centiliter2cubicM();
		cubicM2quartUK();
	}
	public static void centiliter2quartUSdry(){
		centiliter2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Cubic CM Conversions----------------------\\
	public static void cubicCM2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000001"));
	}
	public static void cubicCM2barrel(){
		cubicCM2cubicM();
		cubicM2barrel();
	}
	public static void cubicCM2bushelUK(){
		cubicCM2cubicM();
		cubicM2bushelUK();
	}
	public static void cubicCM2bushelUSdry(){
		cubicCM2cubicM();
		cubicM2bushelUSdry();
	}
	public static void cubicCM2centiliter(){
		cubicCM2cubicM();
		cubicM2centiliter();
	}
	public static void cubicCM2cubicCM(){
		cubicCM2cubicM();
		cubicM2cubicCM();
	}
	public static void cubicCM2cubicDM(){
		cubicCM2cubicM();
		cubicM2cubicDM();
	}
	public static void cubicCM2cubicFoot(){
		cubicCM2cubicM();
		cubicM2cubicFoot();
	}
	public static void cubicCM2cubicInch(){
		cubicCM2cubicM();
		cubicM2cubicInch();
	}
	public static void cubicCM2cubicMM(){
		cubicCM2cubicM();
		cubicM2cubicMM();
	}
	public static void cubicCM2cubicYard(){
		cubicCM2cubicM();
		cubicM2cubicYard();
	}
	public static void cubicCM2dekaL(){
		cubicCM2cubicM();
		cubicM2dekaL();
	}
	public static void cubicCM2fluidDram(){
		cubicCM2cubicM();
		cubicM2fluidDram();
	}
	public static void cubicCM2fluidOunce(){
		cubicCM2cubicM();
		cubicM2fluidOunce();
	}
	public static void cubicCM2gallon(){
		cubicCM2cubicM();
		cubicM2gallon();
	}
	public static void cubicCM2gallonUK(){
		cubicCM2cubicM();
		cubicM2gallonUK();
	}
	public static void cubicCM2gill(){
		cubicCM2cubicM();
		cubicM2gill();
	}
	public static void cubicCM2hectoL(){
		cubicCM2cubicM();
		cubicM2hectoL();
	}
	public static void cubicCM2KL(){
		cubicCM2cubicM();
		cubicM2KL();
	}
	public static void cubicCM2L(){
		cubicCM2cubicM();
		cubicM2L();
	}
	public static void cubicCM2microL(){
		cubicCM2cubicM();
		cubicM2microL();
	}
	public static void cubicCM2ML(){
		cubicCM2cubicM();
		cubicM2ML();
	}
	public static void cubicCM2minim(){
		cubicCM2cubicM();
		cubicM2minim();
	}
	public static void cubicCM2peckUSdry(){
		cubicCM2cubicM();
		cubicM2peckUSdry();
	}
	public static void cubicCM2pintFluid(){
		cubicCM2cubicM();
		cubicM2pintFluid();
	}
	public static void cubicCM2pintUK(){
		cubicCM2cubicM();
		cubicM2pintUK();
	}
	public static void cubicCM2pintUSdry(){
		cubicCM2cubicM();
		cubicM2pintUSdry();
	}
	public static void cubicCM2quartFluid(){
		cubicCM2cubicM();
		cubicM2quartFluid();
	}
	public static void cubicCM2quartUK(){
		cubicCM2cubicM();
		cubicM2quartUK();
	}
	public static void cubicCM2quartUSdry(){
		cubicCM2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Cubic DM Conversions----------------------\\
	public static void cubicDM2cubicM(){
		unit= unit.multiply(new BigDecimal("0.001"));
	}
	public static void cubicDM2barrel(){
		cubicDM2cubicM();
		cubicM2barrel();
	}
	public static void cubicDM2bushelUK(){
		cubicDM2cubicM();
		cubicM2bushelUK();
	}
	public static void cubicDM2bushelUSdry(){
		cubicDM2cubicM();
		cubicM2bushelUSdry();
	}
	public static void cubicDM2centiliter(){
		cubicDM2cubicM();
		cubicM2centiliter();
	}
	public static void cubicDM2cubicCM(){
		cubicDM2cubicM();
		cubicM2cubicCM();
	}
	public static void cubicDM2cubicDM(){
		cubicDM2cubicM();
		cubicM2cubicDM();
	}
	public static void cubicDM2cubicFoot(){
		cubicDM2cubicM();
		cubicM2cubicFoot();
	}
	public static void cubicDM2cubicInch(){
		cubicDM2cubicM();
		cubicM2cubicInch();
	}
	public static void cubicDM2cubicMM(){
		cubicDM2cubicM();
		cubicM2cubicMM();
	}
	public static void cubicDM2cubicYard(){
		cubicDM2cubicM();
		cubicM2cubicYard();
	}
	public static void cubicDM2dekaL(){
		cubicDM2cubicM();
		cubicM2dekaL();
	}
	public static void cubicDM2fluidDram(){
		cubicDM2cubicM();
		cubicM2fluidDram();
	}
	public static void cubicDM2fluidOunce(){
		cubicDM2cubicM();
		cubicM2fluidOunce();
	}
	public static void cubicDM2gallon(){
		cubicDM2cubicM();
		cubicM2gallon();
	}
	public static void cubicDM2gallonUK(){
		cubicDM2cubicM();
		cubicM2gallonUK();
	}
	public static void cubicDM2gill(){
		cubicDM2cubicM();
		cubicM2gill();
	}
	public static void cubicDM2hectoL(){
		cubicDM2cubicM();
		cubicM2hectoL();
	}
	public static void cubicDM2KL(){
		cubicDM2cubicM();
		cubicM2KL();
	}
	public static void cubicDM2L(){
		cubicDM2cubicM();
		cubicM2L();
	}
	public static void cubicDM2microL(){
		cubicDM2cubicM();
		cubicM2microL();
	}
	public static void cubicDM2ML(){
		cubicDM2cubicM();
		cubicM2ML();
	}
	public static void cubicDM2minim(){
		cubicDM2cubicM();
		cubicM2minim();
	}
	public static void cubicDM2peckUSdry(){
		cubicDM2cubicM();
		cubicM2peckUSdry();
	}
	public static void cubicDM2pintFluid(){
		cubicDM2cubicM();
		cubicM2pintFluid();
	}
	public static void cubicDM2pintUK(){
		cubicDM2cubicM();
		cubicM2pintUK();
	}
	public static void cubicDM2pintUSdry(){
		cubicDM2cubicM();
		cubicM2pintUSdry();
	}
	public static void cubicDM2quartFluid(){
		cubicDM2cubicM();
		cubicM2quartFluid();
	}
	public static void cubicDM2quartUK(){
		cubicDM2cubicM();
		cubicM2quartUK();
	}
	public static void cubicDM2quartUSdry(){
		cubicDM2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Cubic Foot Conversions----------------------\\
	public static void cubicFoot2cubicM(){
		unit= unit.multiply(new BigDecimal("0.028316846592"));
	}
	public static void cubicFoot2barrel(){
		cubicFoot2cubicM();
		cubicM2barrel();
	}
	public static void cubicFoot2bushelUK(){
		cubicFoot2cubicM();
		cubicM2bushelUK();
	}
	public static void cubicFoot2bushelUSdry(){
		cubicFoot2cubicM();
		cubicM2bushelUSdry();
	}
	public static void cubicFoot2centiliter(){
		cubicFoot2cubicM();
		cubicM2centiliter();
	}
	public static void cubicFoot2cubicCM(){
		cubicFoot2cubicM();
		cubicM2cubicCM();
	}
	public static void cubicFoot2cubicDM(){
		cubicFoot2cubicM();
		cubicM2cubicDM();
	}
	public static void cubicFoot2cubicFoot(){
		cubicFoot2cubicM();
		cubicM2cubicFoot();
	}
	public static void cubicFoot2cubicInch(){
		cubicFoot2cubicM();
		cubicM2cubicInch();
	}
	public static void cubicFoot2cubicMM(){
		cubicFoot2cubicM();
		cubicM2cubicMM();
	}
	public static void cubicFoot2cubicYard(){
		cubicFoot2cubicM();
		cubicM2cubicYard();
	}
	public static void cubicFoot2dekaL(){
		cubicFoot2cubicM();
		cubicM2dekaL();
	}
	public static void cubicFoot2fluidDram(){
		cubicFoot2cubicM();
		cubicM2fluidDram();
	}
	public static void cubicFoot2fluidOunce(){
		cubicFoot2cubicM();
		cubicM2fluidOunce();
	}
	public static void cubicFoot2gallon(){
		cubicFoot2cubicM();
		cubicM2gallon();
	}
	public static void cubicFoot2gallonUK(){
		cubicFoot2cubicM();
		cubicM2gallonUK();
	}
	public static void cubicFoot2gill(){
		cubicFoot2cubicM();
		cubicM2gill();
	}
	public static void cubicFoot2hectoL(){
		cubicFoot2cubicM();
		cubicM2hectoL();
	}
	public static void cubicFoot2KL(){
		cubicFoot2cubicM();
		cubicM2KL();
	}
	public static void cubicFoot2L(){
		cubicFoot2cubicM();
		cubicM2L();
	}
	public static void cubicFoot2microL(){
		cubicFoot2cubicM();
		cubicM2microL();
	}
	public static void cubicFoot2ML(){
		cubicFoot2cubicM();
		cubicM2ML();
	}
	public static void cubicFoot2minim(){
		cubicFoot2cubicM();
		cubicM2minim();
	}
	public static void cubicFoot2peckUSdry(){
		cubicFoot2cubicM();
		cubicM2peckUSdry();
	}
	public static void cubicFoot2pintFluid(){
		cubicFoot2cubicM();
		cubicM2pintFluid();
	}
	public static void cubicFoot2pintUK(){
		cubicFoot2cubicM();
		cubicM2pintUK();
	}
	public static void cubicFoot2pintUSdry(){
		cubicFoot2cubicM();
		cubicM2pintUSdry();
	}
	public static void cubicFoot2quartFluid(){
		cubicFoot2cubicM();
		cubicM2quartFluid();
	}
	public static void cubicFoot2quartUK(){
		cubicFoot2cubicM();
		cubicM2quartUK();
	}
	public static void cubicFoot2quartUSdry(){
		cubicFoot2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Cubic Inch Conversions----------------------\\
	public static void cubicInch2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000016387064"));
	}
	public static void cubicInch2barrel(){
		cubicInch2cubicM();
		cubicM2barrel();
	}
	public static void cubicInch2bushelUK(){
		cubicInch2cubicM();
		cubicM2bushelUK();
	}
	public static void cubicInch2bushelUSdry(){
		cubicInch2cubicM();
		cubicM2bushelUSdry();
	}
	public static void cubicInch2centiliter(){
		cubicInch2cubicM();
		cubicM2centiliter();
	}
	public static void cubicInch2cubicCM(){
		cubicInch2cubicM();
		cubicM2cubicCM();
	}
	public static void cubicInch2cubicDM(){
		cubicInch2cubicM();
		cubicM2cubicDM();
	}
	public static void cubicInch2cubicFoot(){
		cubicInch2cubicM();
		cubicM2cubicFoot();
	}
	public static void cubicInch2cubicInch(){
		cubicInch2cubicM();
		cubicM2cubicInch();
	}
	public static void cubicInch2cubicMM(){
		cubicInch2cubicM();
		cubicM2cubicMM();
	}
	public static void cubicInch2cubicYard(){
		cubicInch2cubicM();
		cubicM2cubicYard();
	}
	public static void cubicInch2dekaL(){
		cubicInch2cubicM();
		cubicM2dekaL();
	}
	public static void cubicInch2fluidDram(){
		cubicInch2cubicM();
		cubicM2fluidDram();
	}
	public static void cubicInch2fluidOunce(){
		cubicInch2cubicM();
		cubicM2fluidOunce();
	}
	public static void cubicInch2gallon(){
		cubicInch2cubicM();
		cubicM2gallon();
	}
	public static void cubicInch2gallonUK(){
		cubicInch2cubicM();
		cubicM2gallonUK();
	}
	public static void cubicInch2gill(){
		cubicInch2cubicM();
		cubicM2gill();
	}
	public static void cubicInch2hectoL(){
		cubicInch2cubicM();
		cubicM2hectoL();
	}
	public static void cubicInch2KL(){
		cubicInch2cubicM();
		cubicM2KL();
	}
	public static void cubicInch2L(){
		cubicInch2cubicM();
		cubicM2L();
	}
	public static void cubicInch2microL(){
		cubicInch2cubicM();
		cubicM2microL();
	}
	public static void cubicInch2ML(){
		cubicInch2cubicM();
		cubicM2ML();
	}
	public static void cubicInch2minim(){
		cubicInch2cubicM();
		cubicM2minim();
	}
	public static void cubicInch2peckUSdry(){
		cubicInch2cubicM();
		cubicM2peckUSdry();
	}
	public static void cubicInch2pintFluid(){
		cubicInch2cubicM();
		cubicM2pintFluid();
	}
	public static void cubicInch2pintUK(){
		cubicInch2cubicM();
		cubicM2pintUK();
	}
	public static void cubicInch2pintUSdry(){
		cubicInch2cubicM();
		cubicM2pintUSdry();
	}
	public static void cubicInch2quartFluid(){
		cubicInch2cubicM();
		cubicM2quartFluid();
	}
	public static void cubicInch2quartUK(){
		cubicInch2cubicM();
		cubicM2quartUK();
	}
	public static void cubicInch2quartUSdry(){
		cubicInch2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Cubic MM Conversions----------------------\\
	public static void cubicMM2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000000001"));
	}
	public static void cubicMM2barrel(){
		cubicMM2cubicM();
		cubicM2barrel();
	}
	public static void cubicMM2bushelUK(){
		cubicMM2cubicM();
		cubicM2bushelUK();
	}
	public static void cubicMM2bushelUSdry(){
		cubicMM2cubicM();
		cubicM2bushelUSdry();
	}
	public static void cubicMM2centiliter(){
		cubicMM2cubicM();
		cubicM2centiliter();
	}
	public static void cubicMM2cubicCM(){
		cubicMM2cubicM();
		cubicM2cubicCM();
	}
	public static void cubicMM2cubicDM(){
		cubicMM2cubicM();
		cubicM2cubicDM();
	}
	public static void cubicMM2cubicFoot(){
		cubicMM2cubicM();
		cubicM2cubicFoot();
	}
	public static void cubicMM2cubicInch(){
		cubicMM2cubicM();
		cubicM2cubicInch();
	}
	public static void cubicMM2cubicMM(){
		cubicMM2cubicM();
		cubicM2cubicMM();
	}
	public static void cubicMM2cubicYard(){
		cubicMM2cubicM();
		cubicM2cubicYard();
	}
	public static void cubicMM2dekaL(){
		cubicMM2cubicM();
		cubicM2dekaL();
	}
	public static void cubicMM2fluidDram(){
		cubicMM2cubicM();
		cubicM2fluidDram();
	}
	public static void cubicMM2fluidOunce(){
		cubicMM2cubicM();
		cubicM2fluidOunce();
	}
	public static void cubicMM2gallon(){
		cubicMM2cubicM();
		cubicM2gallon();
	}
	public static void cubicMM2gallonUK(){
		cubicMM2cubicM();
		cubicM2gallonUK();
	}
	public static void cubicMM2gill(){
		cubicMM2cubicM();
		cubicM2gill();
	}
	public static void cubicMM2hectoL(){
		cubicMM2cubicM();
		cubicM2hectoL();
	}
	public static void cubicMM2KL(){
		cubicMM2cubicM();
		cubicM2KL();
	}
	public static void cubicMM2L(){
		cubicMM2cubicM();
		cubicM2L();
	}
	public static void cubicMM2microL(){
		cubicMM2cubicM();
		cubicM2microL();
	}
	public static void cubicMM2ML(){
		cubicMM2cubicM();
		cubicM2ML();
	}
	public static void cubicMM2minim(){
		cubicMM2cubicM();
		cubicM2minim();
	}
	public static void cubicMM2peckUSdry(){
		cubicMM2cubicM();
		cubicM2peckUSdry();
	}
	public static void cubicMM2pintFluid(){
		cubicMM2cubicM();
		cubicM2pintFluid();
	}
	public static void cubicMM2pintUK(){
		cubicMM2cubicM();
		cubicM2pintUK();
	}
	public static void cubicMM2pintUSdry(){
		cubicMM2cubicM();
		cubicM2pintUSdry();
	}
	public static void cubicMM2quartFluid(){
		cubicMM2cubicM();
		cubicM2quartFluid();
	}
	public static void cubicMM2quartUK(){
		cubicMM2cubicM();
		cubicM2quartUK();
	}
	public static void cubicMM2quartUSdry(){
		cubicMM2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Cubic Yard Conversions----------------------\\
	public static void cubicYard2cubicM(){
		unit= unit.multiply(new BigDecimal("0.764554857984"));
	}
	public static void cubicYard2barrel(){
		cubicYard2cubicM();
		cubicM2barrel();
	}
	public static void cubicYard2bushelUK(){
		cubicYard2cubicM();
		cubicM2bushelUK();
	}
	public static void cubicYard2bushelUSdry(){
		cubicYard2cubicM();
		cubicM2bushelUSdry();
	}
	public static void cubicYard2centiliter(){
		cubicYard2cubicM();
		cubicM2centiliter();
	}
	public static void cubicYard2cubicCM(){
		cubicYard2cubicM();
		cubicM2cubicCM();
	}
	public static void cubicYard2cubicDM(){
		cubicYard2cubicM();
		cubicM2cubicDM();
	}
	public static void cubicYard2cubicFoot(){
		cubicYard2cubicM();
		cubicM2cubicFoot();
	}
	public static void cubicYard2cubicInch(){
		cubicYard2cubicM();
		cubicM2cubicInch();
	}
	public static void cubicYard2cubicMM(){
		cubicYard2cubicM();
		cubicM2cubicMM();
	}
	public static void cubicYard2cubicYard(){
		cubicYard2cubicM();
		cubicM2cubicYard();
	}
	public static void cubicYard2dekaL(){
		cubicYard2cubicM();
		cubicM2dekaL();
	}
	public static void cubicYard2fluidDram(){
		cubicYard2cubicM();
		cubicM2fluidDram();
	}
	public static void cubicYard2fluidOunce(){
		cubicYard2cubicM();
		cubicM2fluidOunce();
	}
	public static void cubicYard2gallon(){
		cubicYard2cubicM();
		cubicM2gallon();
	}
	public static void cubicYard2gallonUK(){
		cubicYard2cubicM();
		cubicM2gallonUK();
	}
	public static void cubicYard2gill(){
		cubicYard2cubicM();
		cubicM2gill();
	}
	public static void cubicYard2hectoL(){
		cubicYard2cubicM();
		cubicM2hectoL();
	}
	public static void cubicYard2KL(){
		cubicYard2cubicM();
		cubicM2KL();
	}
	public static void cubicYard2L(){
		cubicYard2cubicM();
		cubicM2L();
	}
	public static void cubicYard2microL(){
		cubicYard2cubicM();
		cubicM2microL();
	}
	public static void cubicYard2ML(){
		cubicYard2cubicM();
		cubicM2ML();
	}
	public static void cubicYard2minim(){
		cubicYard2cubicM();
		cubicM2minim();
	}
	public static void cubicYard2peckUSdry(){
		cubicYard2cubicM();
		cubicM2peckUSdry();
	}
	public static void cubicYard2pintFluid(){
		cubicYard2cubicM();
		cubicM2pintFluid();
	}
	public static void cubicYard2pintUK(){
		cubicYard2cubicM();
		cubicM2pintUK();
	}
	public static void cubicYard2pintUSdry(){
		cubicYard2cubicM();
		cubicM2pintUSdry();
	}
	public static void cubicYard2quartFluid(){
		cubicYard2cubicM();
		cubicM2quartFluid();
	}
	public static void cubicYard2quartUK(){
		cubicYard2cubicM();
		cubicM2quartUK();
	}
	public static void cubicYard2quartUSdry(){
		cubicYard2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------DekaLiter Conversions----------------------\\
	public static void dekaL2cubicM(){
		unit= unit.multiply(new BigDecimal("0.01"));
	}
	public static void dekaL2barrel(){
		dekaL2cubicM();
		cubicM2barrel();
	}
	public static void dekaL2bushelUK(){
		dekaL2cubicM();
		cubicM2bushelUK();
	}
	public static void dekaL2bushelUSdry(){
		dekaL2cubicM();
		cubicM2bushelUSdry();
	}
	public static void dekaL2centiliter(){
		dekaL2cubicM();
		cubicM2centiliter();
	}
	public static void dekaL2cubicCM(){
		dekaL2cubicM();
		cubicM2cubicCM();
	}
	public static void dekaL2cubicDM(){
		dekaL2cubicM();
		cubicM2cubicDM();
	}
	public static void dekaL2cubicFoot(){
		dekaL2cubicM();
		cubicM2cubicFoot();
	}
	public static void dekaL2cubicInch(){
		dekaL2cubicM();
		cubicM2cubicInch();
	}
	public static void dekaL2cubicMM(){
		dekaL2cubicM();
		cubicM2cubicMM();
	}
	public static void dekaL2cubicYard(){
		dekaL2cubicM();
		cubicM2cubicYard();
	}
	public static void dekaL2dekaL(){
		dekaL2cubicM();
		cubicM2dekaL();
	}
	public static void dekaL2fluidDram(){
		dekaL2cubicM();
		cubicM2fluidDram();
	}
	public static void dekaL2fluidOunce(){
		dekaL2cubicM();
		cubicM2fluidOunce();
	}
	public static void dekaL2gallon(){
		dekaL2cubicM();
		cubicM2gallon();
	}
	public static void dekaL2gallonUK(){
		dekaL2cubicM();
		cubicM2gallonUK();
	}
	public static void dekaL2gill(){
		dekaL2cubicM();
		cubicM2gill();
	}
	public static void dekaL2hectoL(){
		dekaL2cubicM();
		cubicM2hectoL();
	}
	public static void dekaL2KL(){
		dekaL2cubicM();
		cubicM2KL();
	}
	public static void dekaL2L(){
		dekaL2cubicM();
		cubicM2L();
	}
	public static void dekaL2microL(){
		dekaL2cubicM();
		cubicM2microL();
	}
	public static void dekaL2ML(){
		dekaL2cubicM();
		cubicM2ML();
	}
	public static void dekaL2minim(){
		dekaL2cubicM();
		cubicM2minim();
	}
	public static void dekaL2peckUSdry(){
		dekaL2cubicM();
		cubicM2peckUSdry();
	}
	public static void dekaL2pintFluid(){
		dekaL2cubicM();
		cubicM2pintFluid();
	}
	public static void dekaL2pintUK(){
		dekaL2cubicM();
		cubicM2pintUK();
	}
	public static void dekaL2pintUSdry(){
		dekaL2cubicM();
		cubicM2pintUSdry();
	}
	public static void dekaL2quartFluid(){
		dekaL2cubicM();
		cubicM2quartFluid();
	}
	public static void dekaL2quartUK(){
		dekaL2cubicM();
		cubicM2quartUK();
	}
	public static void dekaL2quartUSdry(){
		dekaL2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Fluid Dram Conversions----------------------\\
	public static void fluidDram2cubicM(){
		unit= unit.multiply(new BigDecimal("0.0000036966911"));
	}
	public static void fluidDram2barrel(){
		fluidDram2cubicM();
		cubicM2barrel();
	}
	public static void fluidDram2bushelUK(){
		fluidDram2cubicM();
		cubicM2bushelUK();
	}
	public static void fluidDram2bushelUSdry(){
		fluidDram2cubicM();
		cubicM2bushelUSdry();
	}
	public static void fluidDram2centiliter(){
		fluidDram2cubicM();
		cubicM2centiliter();
	}
	public static void fluidDram2cubicCM(){
		fluidDram2cubicM();
		cubicM2cubicCM();
	}
	public static void fluidDram2cubicDM(){
		fluidDram2cubicM();
		cubicM2cubicDM();
	}
	public static void fluidDram2cubicFoot(){
		fluidDram2cubicM();
		cubicM2cubicFoot();
	}
	public static void fluidDram2cubicInch(){
		fluidDram2cubicM();
		cubicM2cubicInch();
	}
	public static void fluidDram2cubicMM(){
		fluidDram2cubicM();
		cubicM2cubicMM();
	}
	public static void fluidDram2cubicYard(){
		fluidDram2cubicM();
		cubicM2cubicYard();
	}
	public static void fluidDram2dekaL(){
		fluidDram2cubicM();
		cubicM2dekaL();
	}
	public static void fluidDram2fluidDram(){
		fluidDram2cubicM();
		cubicM2fluidDram();
	}
	public static void fluidDram2fluidOunce(){
		fluidDram2cubicM();
		cubicM2fluidOunce();
	}
	public static void fluidDram2gallon(){
		fluidDram2cubicM();
		cubicM2gallon();
	}
	public static void fluidDram2gallonUK(){
		fluidDram2cubicM();
		cubicM2gallonUK();
	}
	public static void fluidDram2gill(){
		fluidDram2cubicM();
		cubicM2gill();
	}
	public static void fluidDram2hectoL(){
		fluidDram2cubicM();
		cubicM2hectoL();
	}
	public static void fluidDram2KL(){
		fluidDram2cubicM();
		cubicM2KL();
	}
	public static void fluidDram2L(){
		fluidDram2cubicM();
		cubicM2L();
	}
	public static void fluidDram2microL(){
		fluidDram2cubicM();
		cubicM2microL();
	}
	public static void fluidDram2ML(){
		fluidDram2cubicM();
		cubicM2ML();
	}
	public static void fluidDram2minim(){
		fluidDram2cubicM();
		cubicM2minim();
	}
	public static void fluidDram2peckUSdry(){
		fluidDram2cubicM();
		cubicM2peckUSdry();
	}
	public static void fluidDram2pintFluid(){
		fluidDram2cubicM();
		cubicM2pintFluid();
	}
	public static void fluidDram2pintUK(){
		fluidDram2cubicM();
		cubicM2pintUK();
	}
	public static void fluidDram2pintUSdry(){
		fluidDram2cubicM();
		cubicM2pintUSdry();
	}
	public static void fluidDram2quartFluid(){
		fluidDram2cubicM();
		cubicM2quartFluid();
	}
	public static void fluidDram2quartUK(){
		fluidDram2cubicM();
		cubicM2quartUK();
	}
	public static void fluidDram2quartUSdry(){
		fluidDram2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Fluid Ounce Conversions----------------------\\
	public static void fluidOunce2cubicM(){
		unit= unit.multiply(new BigDecimal("0.0000295735295"));
	}
	public static void fluidOunce2barrel(){
		fluidOunce2cubicM();
		cubicM2barrel();
	}
	public static void fluidOunce2bushelUK(){
		fluidOunce2cubicM();
		cubicM2bushelUK();
	}
	public static void fluidOunce2bushelUSdry(){
		fluidOunce2cubicM();
		cubicM2bushelUSdry();
	}
	public static void fluidOunce2centiliter(){
		fluidOunce2cubicM();
		cubicM2centiliter();
	}
	public static void fluidOunce2cubicCM(){
		fluidOunce2cubicM();
		cubicM2cubicCM();
	}
	public static void fluidOunce2cubicDM(){
		fluidOunce2cubicM();
		cubicM2cubicDM();
	}
	public static void fluidOunce2cubicFoot(){
		fluidOunce2cubicM();
		cubicM2cubicFoot();
	}
	public static void fluidOunce2cubicInch(){
		fluidOunce2cubicM();
		cubicM2cubicInch();
	}
	public static void fluidOunce2cubicMM(){
		fluidOunce2cubicM();
		cubicM2cubicMM();
	}
	public static void fluidOunce2cubicYard(){
		fluidOunce2cubicM();
		cubicM2cubicYard();
	}
	public static void fluidOunce2dekaL(){
		fluidOunce2cubicM();
		cubicM2dekaL();
	}
	public static void fluidOunce2fluidDram(){
		fluidOunce2cubicM();
		cubicM2fluidDram();
	}
	public static void fluidOunce2fluidOunce(){
		fluidOunce2cubicM();
		cubicM2fluidOunce();
	}
	public static void fluidOunce2gallon(){
		fluidOunce2cubicM();
		cubicM2gallon();
	}
	public static void fluidOunce2gallonUK(){
		fluidOunce2cubicM();
		cubicM2gallonUK();
	}
	public static void fluidOunce2gill(){
		fluidOunce2cubicM();
		cubicM2gill();
	}
	public static void fluidOunce2hectoL(){
		fluidOunce2cubicM();
		cubicM2hectoL();
	}
	public static void fluidOunce2KL(){
		fluidOunce2cubicM();
		cubicM2KL();
	}
	public static void fluidOunce2L(){
		fluidOunce2cubicM();
		cubicM2L();
	}
	public static void fluidOunce2microL(){
		fluidOunce2cubicM();
		cubicM2microL();
	}
	public static void fluidOunce2ML(){
		fluidOunce2cubicM();
		cubicM2ML();
	}
	public static void fluidOunce2minim(){
		fluidOunce2cubicM();
		cubicM2minim();
	}
	public static void fluidOunce2peckUSdry(){
		fluidOunce2cubicM();
		cubicM2peckUSdry();
	}
	public static void fluidOunce2pintFluid(){
		fluidOunce2cubicM();
		cubicM2pintFluid();
	}
	public static void fluidOunce2pintUK(){
		fluidOunce2cubicM();
		cubicM2pintUK();
	}
	public static void fluidOunce2pintUSdry(){
		fluidOunce2cubicM();
		cubicM2pintUSdry();
	}
	public static void fluidOunce2quartFluid(){
		fluidOunce2cubicM();
		cubicM2quartFluid();
	}
	public static void fluidOunce2quartUK(){
		fluidOunce2cubicM();
		cubicM2quartUK();
	}
	public static void fluidOunce2quartUSdry(){
		fluidOunce2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Gallon Conversions----------------------\\
	public static void gallon2cubicM(){
		unit= unit.multiply(new BigDecimal("0.003785411784"));
	}
	public static void gallon2barrel(){
		gallon2cubicM();
		cubicM2barrel();
	}
	public static void gallon2bushelUK(){
		gallon2cubicM();
		cubicM2bushelUK();
	}
	public static void gallon2bushelUSdry(){
		gallon2cubicM();
		cubicM2bushelUSdry();
	}
	public static void gallon2centiliter(){
		gallon2cubicM();
		cubicM2centiliter();
	}
	public static void gallon2cubicCM(){
		gallon2cubicM();
		cubicM2cubicCM();
	}
	public static void gallon2cubicDM(){
		gallon2cubicM();
		cubicM2cubicDM();
	}
	public static void gallon2cubicFoot(){
		gallon2cubicM();
		cubicM2cubicFoot();
	}
	public static void gallon2cubicInch(){
		gallon2cubicM();
		cubicM2cubicInch();
	}
	public static void gallon2cubicMM(){
		gallon2cubicM();
		cubicM2cubicMM();
	}
	public static void gallon2cubicYard(){
		gallon2cubicM();
		cubicM2cubicYard();
	}
	public static void gallon2dekaL(){
		gallon2cubicM();
		cubicM2dekaL();
	}
	public static void gallon2fluidDram(){
		gallon2cubicM();
		cubicM2fluidDram();
	}
	public static void gallon2fluidOunce(){
		gallon2cubicM();
		cubicM2fluidOunce();
	}
	public static void gallon2gallon(){
		gallon2cubicM();
		cubicM2gallon();
	}
	public static void gallon2gallonUK(){
		gallon2cubicM();
		cubicM2gallonUK();
	}
	public static void gallon2gill(){
		gallon2cubicM();
		cubicM2gill();
	}
	public static void gallon2hectoL(){
		gallon2cubicM();
		cubicM2hectoL();
	}
	public static void gallon2KL(){
		gallon2cubicM();
		cubicM2KL();
	}
	public static void gallon2L(){
		gallon2cubicM();
		cubicM2L();
	}
	public static void gallon2microL(){
		gallon2cubicM();
		cubicM2microL();
	}
	public static void gallon2ML(){
		gallon2cubicM();
		cubicM2ML();
	}
	public static void gallon2minim(){
		gallon2cubicM();
		cubicM2minim();
	}
	public static void gallon2peckUSdry(){
		gallon2cubicM();
		cubicM2peckUSdry();
	}
	public static void gallon2pintFluid(){
		gallon2cubicM();
		cubicM2pintFluid();
	}
	public static void gallon2pintUK(){
		gallon2cubicM();
		cubicM2pintUK();
	}
	public static void gallon2pintUSdry(){
		gallon2cubicM();
		cubicM2pintUSdry();
	}
	public static void gallon2quartFluid(){
		gallon2cubicM();
		cubicM2quartFluid();
	}
	public static void gallon2quartUK(){
		gallon2cubicM();
		cubicM2quartUK();
	}
	public static void gallon2quartUSdry(){
		gallon2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Gallon UK Conversions----------------------\\
	public static void gallonUK2cubicM(){
		unit= unit.multiply(new BigDecimal("0.00454609"));
	}
	public static void gallonUK2barrel(){
		gallonUK2cubicM();
		cubicM2barrel();
	}
	public static void gallonUK2bushelUK(){
		gallonUK2cubicM();
		cubicM2bushelUK();
	}
	public static void gallonUK2bushelUSdry(){
		gallonUK2cubicM();
		cubicM2bushelUSdry();
	}
	public static void gallonUK2centiliter(){
		gallonUK2cubicM();
		cubicM2centiliter();
	}
	public static void gallonUK2cubicCM(){
		gallonUK2cubicM();
		cubicM2cubicCM();
	}
	public static void gallonUK2cubicDM(){
		gallonUK2cubicM();
		cubicM2cubicDM();
	}
	public static void gallonUK2cubicFoot(){
		gallonUK2cubicM();
		cubicM2cubicFoot();
	}
	public static void gallonUK2cubicInch(){
		gallonUK2cubicM();
		cubicM2cubicInch();
	}
	public static void gallonUK2cubicMM(){
		gallonUK2cubicM();
		cubicM2cubicMM();
	}
	public static void gallonUK2cubicYard(){
		gallonUK2cubicM();
		cubicM2cubicYard();
	}
	public static void gallonUK2dekaL(){
		gallonUK2cubicM();
		cubicM2dekaL();
	}
	public static void gallonUK2fluidDram(){
		gallonUK2cubicM();
		cubicM2fluidDram();
	}
	public static void gallonUK2fluidOunce(){
		gallonUK2cubicM();
		cubicM2fluidOunce();
	}
	public static void gallonUK2gallon(){
		gallonUK2cubicM();
		cubicM2gallon();
	}
	public static void gallonUK2gallonUK(){
		gallonUK2cubicM();
		cubicM2gallonUK();
	}
	public static void gallonUK2gill(){
		gallonUK2cubicM();
		cubicM2gill();
	}
	public static void gallonUK2hectoL(){
		gallonUK2cubicM();
		cubicM2hectoL();
	}
	public static void gallonUK2KL(){
		gallonUK2cubicM();
		cubicM2KL();
	}
	public static void gallonUK2L(){
		gallonUK2cubicM();
		cubicM2L();
	}
	public static void gallonUK2microL(){
		gallonUK2cubicM();
		cubicM2microL();
	}
	public static void gallonUK2ML(){
		gallonUK2cubicM();
		cubicM2ML();
	}
	public static void gallonUK2minim(){
		gallonUK2cubicM();
		cubicM2minim();
	}
	public static void gallonUK2peckUSdry(){
		gallonUK2cubicM();
		cubicM2peckUSdry();
	}
	public static void gallonUK2pintFluid(){
		gallonUK2cubicM();
		cubicM2pintFluid();
	}
	public static void gallonUK2pintUK(){
		gallonUK2cubicM();
		cubicM2pintUK();
	}
	public static void gallonUK2pintUSdry(){
		gallonUK2cubicM();
		cubicM2pintUSdry();
	}
	public static void gallonUK2quartFluid(){
		gallonUK2cubicM();
		cubicM2quartFluid();
	}
	public static void gallonUK2quartUK(){
		gallonUK2cubicM();
		cubicM2quartUK();
	}
	public static void gallonUK2quartUSdry(){
		gallonUK2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Gill Conversions----------------------\\
	public static void gill2cubicM(){
		unit= unit.multiply(new BigDecimal("0.0001182941182"));
	}
	public static void gill2barrel(){
		gill2cubicM();
		cubicM2barrel();
	}
	public static void gill2bushelUK(){
		gill2cubicM();
		cubicM2bushelUK();
	}
	public static void gill2bushelUSdry(){
		gill2cubicM();
		cubicM2bushelUSdry();
	}
	public static void gill2centiliter(){
		gill2cubicM();
		cubicM2centiliter();
	}
	public static void gill2cubicCM(){
		gill2cubicM();
		cubicM2cubicCM();
	}
	public static void gill2cubicDM(){
		gill2cubicM();
		cubicM2cubicDM();
	}
	public static void gill2cubicFoot(){
		gill2cubicM();
		cubicM2cubicFoot();
	}
	public static void gill2cubicInch(){
		gill2cubicM();
		cubicM2cubicInch();
	}
	public static void gill2cubicMM(){
		gill2cubicM();
		cubicM2cubicMM();
	}
	public static void gill2cubicYard(){
		gill2cubicM();
		cubicM2cubicYard();
	}
	public static void gill2dekaL(){
		gill2cubicM();
		cubicM2dekaL();
	}
	public static void gill2fluidDram(){
		gill2cubicM();
		cubicM2fluidDram();
	}
	public static void gill2fluidOunce(){
		gill2cubicM();
		cubicM2fluidOunce();
	}
	public static void gill2gallon(){
		gill2cubicM();
		cubicM2gallon();
	}
	public static void gill2gallonUK(){
		gill2cubicM();
		cubicM2gallonUK();
	}
	public static void gill2gill(){
		gill2cubicM();
		cubicM2gill();
	}
	public static void gill2hectoL(){
		gill2cubicM();
		cubicM2hectoL();
	}
	public static void gill2KL(){
		gill2cubicM();
		cubicM2KL();
	}
	public static void gill2L(){
		gill2cubicM();
		cubicM2L();
	}
	public static void gill2microL(){
		gill2cubicM();
		cubicM2microL();
	}
	public static void gill2ML(){
		gill2cubicM();
		cubicM2ML();
	}
	public static void gill2minim(){
		gill2cubicM();
		cubicM2minim();
	}
	public static void gill2peckUSdry(){
		gill2cubicM();
		cubicM2peckUSdry();
	}
	public static void gill2pintFluid(){
		gill2cubicM();
		cubicM2pintFluid();
	}
	public static void gill2pintUK(){
		gill2cubicM();
		cubicM2pintUK();
	}
	public static void gill2pintUSdry(){
		gill2cubicM();
		cubicM2pintUSdry();
	}
	public static void gill2quartFluid(){
		gill2cubicM();
		cubicM2quartFluid();
	}
	public static void gill2quartUK(){
		gill2cubicM();
		cubicM2quartUK();
	}
	public static void gill2quartUSdry(){
		gill2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Hecto Liter Conversions----------------------\\
	public static void hectoL2cubicM(){
		unit= unit.multiply(new BigDecimal("0.1"));
	}
	public static void hectoL2barrel(){
		hectoL2cubicM();
		cubicM2barrel();
	}
	public static void hectoL2bushelUK(){
		hectoL2cubicM();
		cubicM2bushelUK();
	}
	public static void hectoL2bushelUSdry(){
		hectoL2cubicM();
		cubicM2bushelUSdry();
	}
	public static void hectoL2centiliter(){
		hectoL2cubicM();
		cubicM2centiliter();
	}
	public static void hectoL2cubicCM(){
		hectoL2cubicM();
		cubicM2cubicCM();
	}
	public static void hectoL2cubicDM(){
		hectoL2cubicM();
		cubicM2cubicDM();
	}
	public static void hectoL2cubicFoot(){
		hectoL2cubicM();
		cubicM2cubicFoot();
	}
	public static void hectoL2cubicInch(){
		hectoL2cubicM();
		cubicM2cubicInch();
	}
	public static void hectoL2cubicMM(){
		hectoL2cubicM();
		cubicM2cubicMM();
	}
	public static void hectoL2cubicYard(){
		hectoL2cubicM();
		cubicM2cubicYard();
	}
	public static void hectoL2dekaL(){
		hectoL2cubicM();
		cubicM2dekaL();
	}
	public static void hectoL2fluidDram(){
		hectoL2cubicM();
		cubicM2fluidDram();
	}
	public static void hectoL2fluidOunce(){
		hectoL2cubicM();
		cubicM2fluidOunce();
	}
	public static void hectoL2gallon(){
		hectoL2cubicM();
		cubicM2gallon();
	}
	public static void hectoL2gallonUK(){
		hectoL2cubicM();
		cubicM2gallonUK();
	}
	public static void hectoL2gill(){
		hectoL2cubicM();
		cubicM2gill();
	}
	public static void hectoL2hectoL(){
		hectoL2cubicM();
		cubicM2hectoL();
	}
	public static void hectoL2KL(){
		hectoL2cubicM();
		cubicM2KL();
	}
	public static void hectoL2L(){
		hectoL2cubicM();
		cubicM2L();
	}
	public static void hectoL2microL(){
		hectoL2cubicM();
		cubicM2microL();
	}
	public static void hectoL2ML(){
		hectoL2cubicM();
		cubicM2ML();
	}
	public static void hectoL2minim(){
		hectoL2cubicM();
		cubicM2minim();
	}
	public static void hectoL2peckUSdry(){
		hectoL2cubicM();
		cubicM2peckUSdry();
	}
	public static void hectoL2pintFluid(){
		hectoL2cubicM();
		cubicM2pintFluid();
	}
	public static void hectoL2pintUK(){
		hectoL2cubicM();
		cubicM2pintUK();
	}
	public static void hectoL2pintUSdry(){
		hectoL2cubicM();
		cubicM2pintUSdry();
	}
	public static void hectoL2quartFluid(){
		hectoL2cubicM();
		cubicM2quartFluid();
	}
	public static void hectoL2quartUK(){
		hectoL2cubicM();
		cubicM2quartUK();
	}
	public static void hectoL2quartUSdry(){
		hectoL2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------KiloLiter Conversions----------------------\\
	public static void KL2cubicM(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void KL2barrel(){
		KL2cubicM();
		cubicM2barrel();
	}
	public static void KL2bushelUK(){
		KL2cubicM();
		cubicM2bushelUK();
	}
	public static void KL2bushelUSdry(){
		KL2cubicM();
		cubicM2bushelUSdry();
	}
	public static void KL2centiliter(){
		KL2cubicM();
		cubicM2centiliter();
	}
	public static void KL2cubicCM(){
		KL2cubicM();
		cubicM2cubicCM();
	}
	public static void KL2cubicDM(){
		KL2cubicM();
		cubicM2cubicDM();
	}
	public static void KL2cubicFoot(){
		KL2cubicM();
		cubicM2cubicFoot();
	}
	public static void KL2cubicInch(){
		KL2cubicM();
		cubicM2cubicInch();
	}
	public static void KL2cubicMM(){
		KL2cubicM();
		cubicM2cubicMM();
	}
	public static void KL2cubicYard(){
		KL2cubicM();
		cubicM2cubicYard();
	}
	public static void KL2dekaL(){
		KL2cubicM();
		cubicM2dekaL();
	}
	public static void KL2fluidDram(){
		KL2cubicM();
		cubicM2fluidDram();
	}
	public static void KL2fluidOunce(){
		KL2cubicM();
		cubicM2fluidOunce();
	}
	public static void KL2gallon(){
		KL2cubicM();
		cubicM2gallon();
	}
	public static void KL2gallonUK(){
		KL2cubicM();
		cubicM2gallonUK();
	}
	public static void KL2gill(){
		KL2cubicM();
		cubicM2gill();
	}
	public static void KL2hectoL(){
		KL2cubicM();
		cubicM2hectoL();
	}
	public static void KL2KL(){
		KL2cubicM();
		cubicM2KL();
	}
	public static void KL2L(){
		KL2cubicM();
		cubicM2L();
	}
	public static void KL2microL(){
		KL2cubicM();
		cubicM2microL();
	}
	public static void KL2ML(){
		KL2cubicM();
		cubicM2ML();
	}
	public static void KL2minim(){
		KL2cubicM();
		cubicM2minim();
	}
	public static void KL2peckUSdry(){
		KL2cubicM();
		cubicM2peckUSdry();
	}
	public static void KL2pintFluid(){
		KL2cubicM();
		cubicM2pintFluid();
	}
	public static void KL2pintUK(){
		KL2cubicM();
		cubicM2pintUK();
	}
	public static void KL2pintUSdry(){
		KL2cubicM();
		cubicM2pintUSdry();
	}
	public static void KL2quartFluid(){
		KL2cubicM();
		cubicM2quartFluid();
	}
	public static void KL2quartUK(){
		KL2cubicM();
		cubicM2quartUK();
	}
	public static void KL2quartUSdry(){
		KL2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Liter Conversions----------------------\\
	public static void L2cubicM(){
		unit= unit.multiply(new BigDecimal("0.001"));
	}
	public static void L2barrel(){
		L2cubicM();
		cubicM2barrel();
	}
	public static void L2bushelUK(){
		L2cubicM();
		cubicM2bushelUK();
	}
	public static void L2bushelUSdry(){
		L2cubicM();
		cubicM2bushelUSdry();
	}
	public static void L2centiliter(){
		L2cubicM();
		cubicM2centiliter();
	}
	public static void L2cubicCM(){
		L2cubicM();
		cubicM2cubicCM();
	}
	public static void L2cubicDM(){
		L2cubicM();
		cubicM2cubicDM();
	}
	public static void L2cubicFoot(){
		L2cubicM();
		cubicM2cubicFoot();
	}
	public static void L2cubicInch(){
		L2cubicM();
		cubicM2cubicInch();
	}
	public static void L2cubicMM(){
		L2cubicM();
		cubicM2cubicMM();
	}
	public static void L2cubicYard(){
		L2cubicM();
		cubicM2cubicYard();
	}
	public static void L2dekaL(){
		L2cubicM();
		cubicM2dekaL();
	}
	public static void L2fluidDram(){
		L2cubicM();
		cubicM2fluidDram();
	}
	public static void L2fluidOunce(){
		L2cubicM();
		cubicM2fluidOunce();
	}
	public static void L2gallon(){
		L2cubicM();
		cubicM2gallon();
	}
	public static void L2gallonUK(){
		L2cubicM();
		cubicM2gallonUK();
	}
	public static void L2gill(){
		L2cubicM();
		cubicM2gill();
	}
	public static void L2hectoL(){
		L2cubicM();
		cubicM2hectoL();
	}
	public static void L2KL(){
		L2cubicM();
		cubicM2KL();
	}
	public static void L2L(){
		L2cubicM();
		cubicM2L();
	}
	public static void L2microL(){
		L2cubicM();
		cubicM2microL();
	}
	public static void L2ML(){
		L2cubicM();
		cubicM2ML();
	}
	public static void L2minim(){
		L2cubicM();
		cubicM2minim();
	}
	public static void L2peckUSdry(){
		L2cubicM();
		cubicM2peckUSdry();
	}
	public static void L2pintFluid(){
		L2cubicM();
		cubicM2pintFluid();
	}
	public static void L2pintUK(){
		L2cubicM();
		cubicM2pintUK();
	}
	public static void L2pintUSdry(){
		L2cubicM();
		cubicM2pintUSdry();
	}
	public static void L2quartFluid(){
		L2cubicM();
		cubicM2quartFluid();
	}
	public static void L2quartUK(){
		L2cubicM();
		cubicM2quartUK();
	}
	public static void L2quartUSdry(){
		L2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Micro Liter Conversions----------------------\\
	public static void microL2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000000001"));
	}
	public static void microL2barrel(){
		microL2cubicM();
		cubicM2barrel();
	}
	public static void microL2bushelUK(){
		microL2cubicM();
		cubicM2bushelUK();
	}
	public static void microL2bushelUSdry(){
		microL2cubicM();
		cubicM2bushelUSdry();
	}
	public static void microL2centiliter(){
		microL2cubicM();
		cubicM2centiliter();
	}
	public static void microL2cubicCM(){
		microL2cubicM();
		cubicM2cubicCM();
	}
	public static void microL2cubicDM(){
		microL2cubicM();
		cubicM2cubicDM();
	}
	public static void microL2cubicFoot(){
		microL2cubicM();
		cubicM2cubicFoot();
	}
	public static void microL2cubicInch(){
		microL2cubicM();
		cubicM2cubicInch();
	}
	public static void microL2cubicMM(){
		microL2cubicM();
		cubicM2cubicMM();
	}
	public static void microL2cubicYard(){
		microL2cubicM();
		cubicM2cubicYard();
	}
	public static void microL2dekaL(){
		microL2cubicM();
		cubicM2dekaL();
	}
	public static void microL2fluidDram(){
		microL2cubicM();
		cubicM2fluidDram();
	}
	public static void microL2fluidOunce(){
		microL2cubicM();
		cubicM2fluidOunce();
	}
	public static void microL2gallon(){
		microL2cubicM();
		cubicM2gallon();
	}
	public static void microL2gallonUK(){
		microL2cubicM();
		cubicM2gallonUK();
	}
	public static void microL2gill(){
		microL2cubicM();
		cubicM2gill();
	}
	public static void microL2hectoL(){
		microL2cubicM();
		cubicM2hectoL();
	}
	public static void microL2KL(){
		microL2cubicM();
		cubicM2KL();
	}
	public static void microL2L(){
		microL2cubicM();
		cubicM2L();
	}
	public static void microL2microL(){
		microL2cubicM();
		cubicM2microL();
	}
	public static void microL2ML(){
		microL2cubicM();
		cubicM2ML();
	}
	public static void microL2minim(){
		microL2cubicM();
		cubicM2minim();
	}
	public static void microL2peckUSdry(){
		microL2cubicM();
		cubicM2peckUSdry();
	}
	public static void microL2pintFluid(){
		microL2cubicM();
		cubicM2pintFluid();
	}
	public static void microL2pintUK(){
		microL2cubicM();
		cubicM2pintUK();
	}
	public static void microL2pintUSdry(){
		microL2cubicM();
		cubicM2pintUSdry();
	}
	public static void microL2quartFluid(){
		microL2cubicM();
		cubicM2quartFluid();
	}
	public static void microL2quartUK(){
		microL2cubicM();
		cubicM2quartUK();
	}
	public static void microL2quartUSdry(){
		microL2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------MilliLiter Conversions----------------------\\
	public static void ML2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000001"));
	}
	public static void ML2barrel(){
		ML2cubicM();
		cubicM2barrel();
	}
	public static void ML2bushelUK(){
		ML2cubicM();
		cubicM2bushelUK();
	}
	public static void ML2bushelUSdry(){
		ML2cubicM();
		cubicM2bushelUSdry();
	}
	public static void ML2centiliter(){
		ML2cubicM();
		cubicM2centiliter();
	}
	public static void ML2cubicCM(){
		ML2cubicM();
		cubicM2cubicCM();
	}
	public static void ML2cubicDM(){
		ML2cubicM();
		cubicM2cubicDM();
	}
	public static void ML2cubicFoot(){
		ML2cubicM();
		cubicM2cubicFoot();
	}
	public static void ML2cubicInch(){
		ML2cubicM();
		cubicM2cubicInch();
	}
	public static void ML2cubicMM(){
		ML2cubicM();
		cubicM2cubicMM();
	}
	public static void ML2cubicYard(){
		ML2cubicM();
		cubicM2cubicYard();
	}
	public static void ML2dekaL(){
		ML2cubicM();
		cubicM2dekaL();
	}
	public static void ML2fluidDram(){
		ML2cubicM();
		cubicM2fluidDram();
	}
	public static void ML2fluidOunce(){
		ML2cubicM();
		cubicM2fluidOunce();
	}
	public static void ML2gallon(){
		ML2cubicM();
		cubicM2gallon();
	}
	public static void ML2gallonUK(){
		ML2cubicM();
		cubicM2gallonUK();
	}
	public static void ML2gill(){
		ML2cubicM();
		cubicM2gill();
	}
	public static void ML2hectoL(){
		ML2cubicM();
		cubicM2hectoL();
	}
	public static void ML2KL(){
		ML2cubicM();
		cubicM2KL();
	}
	public static void ML2L(){
		ML2cubicM();
		cubicM2L();
	}
	public static void ML2microL(){
		ML2cubicM();
		cubicM2microL();
	}
	public static void ML2ML(){
		ML2cubicM();
		cubicM2ML();
	}
	public static void ML2minim(){
		ML2cubicM();
		cubicM2minim();
	}
	public static void ML2peckUSdry(){
		ML2cubicM();
		cubicM2peckUSdry();
	}
	public static void ML2pintFluid(){
		ML2cubicM();
		cubicM2pintFluid();
	}
	public static void ML2pintUK(){
		ML2cubicM();
		cubicM2pintUK();
	}
	public static void ML2pintUSdry(){
		ML2cubicM();
		cubicM2pintUSdry();
	}
	public static void ML2quartFluid(){
		ML2cubicM();
		cubicM2quartFluid();
	}
	public static void ML2quartUK(){
		ML2cubicM();
		cubicM2quartUK();
	}
	public static void ML2quartUSdry(){
		ML2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Minim Conversions----------------------\\
	public static void minim2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000000061611519921"));
	}
	public static void minim2barrel(){
		minim2cubicM();
		cubicM2barrel();
	}
	public static void minim2bushelUK(){
		minim2cubicM();
		cubicM2bushelUK();
	}
	public static void minim2bushelUSdry(){
		minim2cubicM();
		cubicM2bushelUSdry();
	}
	public static void minim2centiliter(){
		minim2cubicM();
		cubicM2centiliter();
	}
	public static void minim2cubicCM(){
		minim2cubicM();
		cubicM2cubicCM();
	}
	public static void minim2cubicDM(){
		minim2cubicM();
		cubicM2cubicDM();
	}
	public static void minim2cubicFoot(){
		minim2cubicM();
		cubicM2cubicFoot();
	}
	public static void minim2cubicInch(){
		minim2cubicM();
		cubicM2cubicInch();
	}
	public static void minim2cubicMM(){
		minim2cubicM();
		cubicM2cubicMM();
	}
	public static void minim2cubicYard(){
		minim2cubicM();
		cubicM2cubicYard();
	}
	public static void minim2dekaL(){
		minim2cubicM();
		cubicM2dekaL();
	}
	public static void minim2fluidDram(){
		minim2cubicM();
		cubicM2fluidDram();
	}
	public static void minim2fluidOunce(){
		minim2cubicM();
		cubicM2fluidOunce();
	}
	public static void minim2gallon(){
		minim2cubicM();
		cubicM2gallon();
	}
	public static void minim2gallonUK(){
		minim2cubicM();
		cubicM2gallonUK();
	}
	public static void minim2gill(){
		minim2cubicM();
		cubicM2gill();
	}
	public static void minim2hectoL(){
		minim2cubicM();
		cubicM2hectoL();
	}
	public static void minim2KL(){
		minim2cubicM();
		cubicM2KL();
	}
	public static void minim2L(){
		minim2cubicM();
		cubicM2L();
	}
	public static void minim2microL(){
		minim2cubicM();
		cubicM2microL();
	}
	public static void minim2ML(){
		minim2cubicM();
		cubicM2ML();
	}
	public static void minim2minim(){
		minim2cubicM();
		cubicM2minim();
	}
	public static void minim2peckUSdry(){
		minim2cubicM();
		cubicM2peckUSdry();
	}
	public static void minim2pintFluid(){
		minim2cubicM();
		cubicM2pintFluid();
	}
	public static void minim2pintUK(){
		minim2cubicM();
		cubicM2pintUK();
	}
	public static void minim2pintUSdry(){
		minim2cubicM();
		cubicM2pintUSdry();
	}
	public static void minim2quartFluid(){
		minim2cubicM();
		cubicM2quartFluid();
	}
	public static void minim2quartUK(){
		minim2cubicM();
		cubicM2quartUK();
	}
	public static void minim2quartUSdry(){
		minim2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Peck US Dry Conversions----------------------\\
	public static void peckUSdry2cubicM(){
		unit= unit.multiply(new BigDecimal("0.00880976754172"));
	}
	public static void peckUSdry2barrel(){
		peckUSdry2cubicM();
		cubicM2barrel();
	}
	public static void peckUSdry2bushelUK(){
		peckUSdry2cubicM();
		cubicM2bushelUK();
	}
	public static void peckUSdry2bushelUSdry(){
		peckUSdry2cubicM();
		cubicM2bushelUSdry();
	}
	public static void peckUSdry2centiliter(){
		peckUSdry2cubicM();
		cubicM2centiliter();
	}
	public static void peckUSdry2cubicCM(){
		peckUSdry2cubicM();
		cubicM2cubicCM();
	}
	public static void peckUSdry2cubicDM(){
		peckUSdry2cubicM();
		cubicM2cubicDM();
	}
	public static void peckUSdry2cubicFoot(){
		peckUSdry2cubicM();
		cubicM2cubicFoot();
	}
	public static void peckUSdry2cubicInch(){
		peckUSdry2cubicM();
		cubicM2cubicInch();
	}
	public static void peckUSdry2cubicMM(){
		peckUSdry2cubicM();
		cubicM2cubicMM();
	}
	public static void peckUSdry2cubicYard(){
		peckUSdry2cubicM();
		cubicM2cubicYard();
	}
	public static void peckUSdry2dekaL(){
		peckUSdry2cubicM();
		cubicM2dekaL();
	}
	public static void peckUSdry2fluidDram(){
		peckUSdry2cubicM();
		cubicM2fluidDram();
	}
	public static void peckUSdry2fluidOunce(){
		peckUSdry2cubicM();
		cubicM2fluidOunce();
	}
	public static void peckUSdry2gallon(){
		peckUSdry2cubicM();
		cubicM2gallon();
	}
	public static void peckUSdry2gallonUK(){
		peckUSdry2cubicM();
		cubicM2gallonUK();
	}
	public static void peckUSdry2gill(){
		peckUSdry2cubicM();
		cubicM2gill();
	}
	public static void peckUSdry2hectoL(){
		peckUSdry2cubicM();
		cubicM2hectoL();
	}
	public static void peckUSdry2KL(){
		peckUSdry2cubicM();
		cubicM2KL();
	}
	public static void peckUSdry2L(){
		peckUSdry2cubicM();
		cubicM2L();
	}
	public static void peckUSdry2microL(){
		peckUSdry2cubicM();
		cubicM2microL();
	}
	public static void peckUSdry2ML(){
		peckUSdry2cubicM();
		cubicM2ML();
	}
	public static void peckUSdry2minim(){
		peckUSdry2cubicM();
		cubicM2minim();
	}
	public static void peckUSdry2peckUSdry(){
		peckUSdry2cubicM();
		cubicM2peckUSdry();
	}
	public static void peckUSdry2pintFluid(){
		peckUSdry2cubicM();
		cubicM2pintFluid();
	}
	public static void peckUSdry2pintUK(){
		peckUSdry2cubicM();
		cubicM2pintUK();
	}
	public static void peckUSdry2pintUSdry(){
		peckUSdry2cubicM();
		cubicM2pintUSdry();
	}
	public static void peckUSdry2quartFluid(){
		peckUSdry2cubicM();
		cubicM2quartFluid();
	}
	public static void peckUSdry2quartUK(){
		peckUSdry2cubicM();
		cubicM2quartUK();
	}
	public static void peckUSdry2quartUSdry(){
		peckUSdry2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Pint Fluid Conversions----------------------\\
	public static void pintFluid2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000473176473"));
	}
	public static void pintFluid2barrel(){
		pintFluid2cubicM();
		cubicM2barrel();
	}
	public static void pintFluid2bushelUK(){
		pintFluid2cubicM();
		cubicM2bushelUK();
	}
	public static void pintFluid2bushelUSdry(){
		pintFluid2cubicM();
		cubicM2bushelUSdry();
	}
	public static void pintFluid2centiliter(){
		pintFluid2cubicM();
		cubicM2centiliter();
	}
	public static void pintFluid2cubicCM(){
		pintFluid2cubicM();
		cubicM2cubicCM();
	}
	public static void pintFluid2cubicDM(){
		pintFluid2cubicM();
		cubicM2cubicDM();
	}
	public static void pintFluid2cubicFoot(){
		pintFluid2cubicM();
		cubicM2cubicFoot();
	}
	public static void pintFluid2cubicInch(){
		pintFluid2cubicM();
		cubicM2cubicInch();
	}
	public static void pintFluid2cubicMM(){
		pintFluid2cubicM();
		cubicM2cubicMM();
	}
	public static void pintFluid2cubicYard(){
		pintFluid2cubicM();
		cubicM2cubicYard();
	}
	public static void pintFluid2dekaL(){
		pintFluid2cubicM();
		cubicM2dekaL();
	}
	public static void pintFluid2fluidDram(){
		pintFluid2cubicM();
		cubicM2fluidDram();
	}
	public static void pintFluid2fluidOunce(){
		pintFluid2cubicM();
		cubicM2fluidOunce();
	}
	public static void pintFluid2gallon(){
		pintFluid2cubicM();
		cubicM2gallon();
	}
	public static void pintFluid2gallonUK(){
		pintFluid2cubicM();
		cubicM2gallonUK();
	}
	public static void pintFluid2gill(){
		pintFluid2cubicM();
		cubicM2gill();
	}
	public static void pintFluid2hectoL(){
		pintFluid2cubicM();
		cubicM2hectoL();
	}
	public static void pintFluid2KL(){
		pintFluid2cubicM();
		cubicM2KL();
	}
	public static void pintFluid2L(){
		pintFluid2cubicM();
		cubicM2L();
	}
	public static void pintFluid2microL(){
		pintFluid2cubicM();
		cubicM2microL();
	}
	public static void pintFluid2ML(){
		pintFluid2cubicM();
		cubicM2ML();
	}
	public static void pintFluid2minim(){
		pintFluid2cubicM();
		cubicM2minim();
	}
	public static void pintFluid2peckUSdry(){
		pintFluid2cubicM();
		cubicM2peckUSdry();
	}
	public static void pintFluid2pintFluid(){
		pintFluid2cubicM();
		cubicM2pintFluid();
	}
	public static void pintFluid2pintUK(){
		pintFluid2cubicM();
		cubicM2pintUK();
	}
	public static void pintFluid2pintUSdry(){
		pintFluid2cubicM();
		cubicM2pintUSdry();
	}
	public static void pintFluid2quartFluid(){
		pintFluid2cubicM();
		cubicM2quartFluid();
	}
	public static void pintFluid2quartUK(){
		pintFluid2cubicM();
		cubicM2quartUK();
	}
	public static void pintFluid2quartUSdry(){
		pintFluid2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Pint UK Conversions----------------------\\
	public static void pintUK2cubicM(){
		unit= unit.multiply(new BigDecimal("0.00056826125"));
	}
	public static void pintUK2barrel(){
		pintUK2cubicM();
		cubicM2barrel();
	}
	public static void pintUK2bushelUK(){
		pintUK2cubicM();
		cubicM2bushelUK();
	}
	public static void pintUK2bushelUSdry(){
		pintUK2cubicM();
		cubicM2bushelUSdry();
	}
	public static void pintUK2centiliter(){
		pintUK2cubicM();
		cubicM2centiliter();
	}
	public static void pintUK2cubicCM(){
		pintUK2cubicM();
		cubicM2cubicCM();
	}
	public static void pintUK2cubicDM(){
		pintUK2cubicM();
		cubicM2cubicDM();
	}
	public static void pintUK2cubicFoot(){
		pintUK2cubicM();
		cubicM2cubicFoot();
	}
	public static void pintUK2cubicInch(){
		pintUK2cubicM();
		cubicM2cubicInch();
	}
	public static void pintUK2cubicMM(){
		pintUK2cubicM();
		cubicM2cubicMM();
	}
	public static void pintUK2cubicYard(){
		pintUK2cubicM();
		cubicM2cubicYard();
	}
	public static void pintUK2dekaL(){
		pintUK2cubicM();
		cubicM2dekaL();
	}
	public static void pintUK2fluidDram(){
		pintUK2cubicM();
		cubicM2fluidDram();
	}
	public static void pintUK2fluidOunce(){
		pintUK2cubicM();
		cubicM2fluidOunce();
	}
	public static void pintUK2gallon(){
		pintUK2cubicM();
		cubicM2gallon();
	}
	public static void pintUK2gallonUK(){
		pintUK2cubicM();
		cubicM2gallonUK();
	}
	public static void pintUK2gill(){
		pintUK2cubicM();
		cubicM2gill();
	}
	public static void pintUK2hectoL(){
		pintUK2cubicM();
		cubicM2hectoL();
	}
	public static void pintUK2KL(){
		pintUK2cubicM();
		cubicM2KL();
	}
	public static void pintUK2L(){
		pintUK2cubicM();
		cubicM2L();
	}
	public static void pintUK2microL(){
		pintUK2cubicM();
		cubicM2microL();
	}
	public static void pintUK2ML(){
		pintUK2cubicM();
		cubicM2ML();
	}
	public static void pintUK2minim(){
		pintUK2cubicM();
		cubicM2minim();
	}
	public static void pintUK2peckUSdry(){
		pintUK2cubicM();
		cubicM2peckUSdry();
	}
	public static void pintUK2pintFluid(){
		pintUK2cubicM();
		cubicM2pintFluid();
	}
	public static void pintUK2pintUK(){
		pintUK2cubicM();
		cubicM2pintUK();
	}
	public static void pintUK2pintUSdry(){
		pintUK2cubicM();
		cubicM2pintUSdry();
	}
	public static void pintUK2quartFluid(){
		pintUK2cubicM();
		cubicM2quartFluid();
	}
	public static void pintUK2quartUK(){
		pintUK2cubicM();
		cubicM2quartUK();
	}
	public static void pintUK2quartUSdry(){
		pintUK2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Pint US Dry Conversions----------------------\\
	public static void pintUSdry2cubicM(){
		unit= unit.multiply(new BigDecimal("0.0005506104713"));
	}
	public static void pintUSdry2barrel(){
		pintUSdry2cubicM();
		cubicM2barrel();
	}
	public static void pintUSdry2bushelUK(){
		pintUSdry2cubicM();
		cubicM2bushelUK();
	}
	public static void pintUSdry2bushelUSdry(){
		pintUSdry2cubicM();
		cubicM2bushelUSdry();
	}
	public static void pintUSdry2centiliter(){
		pintUSdry2cubicM();
		cubicM2centiliter();
	}
	public static void pintUSdry2cubicCM(){
		pintUSdry2cubicM();
		cubicM2cubicCM();
	}
	public static void pintUSdry2cubicDM(){
		pintUSdry2cubicM();
		cubicM2cubicDM();
	}
	public static void pintUSdry2cubicFoot(){
		pintUSdry2cubicM();
		cubicM2cubicFoot();
	}
	public static void pintUSdry2cubicInch(){
		pintUSdry2cubicM();
		cubicM2cubicInch();
	}
	public static void pintUSdry2cubicMM(){
		pintUSdry2cubicM();
		cubicM2cubicMM();
	}
	public static void pintUSdry2cubicYard(){
		pintUSdry2cubicM();
		cubicM2cubicYard();
	}
	public static void pintUSdry2dekaL(){
		pintUSdry2cubicM();
		cubicM2dekaL();
	}
	public static void pintUSdry2fluidDram(){
		pintUSdry2cubicM();
		cubicM2fluidDram();
	}
	public static void pintUSdry2fluidOunce(){
		pintUSdry2cubicM();
		cubicM2fluidOunce();
	}
	public static void pintUSdry2gallon(){
		pintUSdry2cubicM();
		cubicM2gallon();
	}
	public static void pintUSdry2gallonUK(){
		pintUSdry2cubicM();
		cubicM2gallonUK();
	}
	public static void pintUSdry2gill(){
		pintUSdry2cubicM();
		cubicM2gill();
	}
	public static void pintUSdry2hectoL(){
		pintUSdry2cubicM();
		cubicM2hectoL();
	}
	public static void pintUSdry2KL(){
		pintUSdry2cubicM();
		cubicM2KL();
	}
	public static void pintUSdry2L(){
		pintUSdry2cubicM();
		cubicM2L();
	}
	public static void pintUSdry2microL(){
		pintUSdry2cubicM();
		cubicM2microL();
	}
	public static void pintUSdry2ML(){
		pintUSdry2cubicM();
		cubicM2ML();
	}
	public static void pintUSdry2minim(){
		pintUSdry2cubicM();
		cubicM2minim();
	}
	public static void pintUSdry2peckUSdry(){
		pintUSdry2cubicM();
		cubicM2peckUSdry();
	}
	public static void pintUSdry2pintFluid(){
		pintUSdry2cubicM();
		cubicM2pintFluid();
	}
	public static void pintUSdry2pintUK(){
		pintUSdry2cubicM();
		cubicM2pintUK();
	}
	public static void pintUSdry2pintUSdry(){
		pintUSdry2cubicM();
		cubicM2pintUSdry();
	}
	public static void pintUSdry2quartFluid(){
		pintUSdry2cubicM();
		cubicM2quartFluid();
	}
	public static void pintUSdry2quartUK(){
		pintUSdry2cubicM();
		cubicM2quartUK();
	}
	public static void pintUSdry2quartUSdry(){
		pintUSdry2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Quart Fluid Conversions----------------------\\
	public static void quartFluid2cubicM(){
		unit= unit.multiply(new BigDecimal("0.000946352946"));
	}
	public static void quartFluid2barrel(){
		quartFluid2cubicM();
		cubicM2barrel();
	}
	public static void quartFluid2bushelUK(){
		quartFluid2cubicM();
		cubicM2bushelUK();
	}
	public static void quartFluid2bushelUSdry(){
		quartFluid2cubicM();
		cubicM2bushelUSdry();
	}
	public static void quartFluid2centiliter(){
		quartFluid2cubicM();
		cubicM2centiliter();
	}
	public static void quartFluid2cubicCM(){
		quartFluid2cubicM();
		cubicM2cubicCM();
	}
	public static void quartFluid2cubicDM(){
		quartFluid2cubicM();
		cubicM2cubicDM();
	}
	public static void quartFluid2cubicFoot(){
		quartFluid2cubicM();
		cubicM2cubicFoot();
	}
	public static void quartFluid2cubicInch(){
		quartFluid2cubicM();
		cubicM2cubicInch();
	}
	public static void quartFluid2cubicMM(){
		quartFluid2cubicM();
		cubicM2cubicMM();
	}
	public static void quartFluid2cubicYard(){
		quartFluid2cubicM();
		cubicM2cubicYard();
	}
	public static void quartFluid2dekaL(){
		quartFluid2cubicM();
		cubicM2dekaL();
	}
	public static void quartFluid2fluidDram(){
		quartFluid2cubicM();
		cubicM2fluidDram();
	}
	public static void quartFluid2fluidOunce(){
		quartFluid2cubicM();
		cubicM2fluidOunce();
	}
	public static void quartFluid2gallon(){
		quartFluid2cubicM();
		cubicM2gallon();
	}
	public static void quartFluid2gallonUK(){
		quartFluid2cubicM();
		cubicM2gallonUK();
	}
	public static void quartFluid2gill(){
		quartFluid2cubicM();
		cubicM2gill();
	}
	public static void quartFluid2hectoL(){
		quartFluid2cubicM();
		cubicM2hectoL();
	}
	public static void quartFluid2KL(){
		quartFluid2cubicM();
		cubicM2KL();
	}
	public static void quartFluid2L(){
		quartFluid2cubicM();
		cubicM2L();
	}
	public static void quartFluid2microL(){
		quartFluid2cubicM();
		cubicM2microL();
	}
	public static void quartFluid2ML(){
		quartFluid2cubicM();
		cubicM2ML();
	}
	public static void quartFluid2minim(){
		quartFluid2cubicM();
		cubicM2minim();
	}
	public static void quartFluid2peckUSdry(){
		quartFluid2cubicM();
		cubicM2peckUSdry();
	}
	public static void quartFluid2pintFluid(){
		quartFluid2cubicM();
		cubicM2pintFluid();
	}
	public static void quartFluid2pintUK(){
		quartFluid2cubicM();
		cubicM2pintUK();
	}
	public static void quartFluid2pintUSdry(){
		quartFluid2cubicM();
		cubicM2pintUSdry();
	}
	public static void quartFluid2quartFluid(){
		quartFluid2cubicM();
		cubicM2quartFluid();
	}
	public static void quartFluid2quartUK(){
		quartFluid2cubicM();
		cubicM2quartUK();
	}
	public static void quartFluid2quartUSdry(){
		quartFluid2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Quart UK Conversions----------------------\\
	public static void quartUK2cubicM(){
		unit= unit.multiply(new BigDecimal("0.0011365225"));
	}
	public static void quartUK2barrel(){
		quartUK2cubicM();
		cubicM2barrel();
	}
	public static void quartUK2bushelUK(){
		quartUK2cubicM();
		cubicM2bushelUK();
	}
	public static void quartUK2bushelUSdry(){
		quartUK2cubicM();
		cubicM2bushelUSdry();
	}
	public static void quartUK2centiliter(){
		quartUK2cubicM();
		cubicM2centiliter();
	}
	public static void quartUK2cubicCM(){
		quartUK2cubicM();
		cubicM2cubicCM();
	}
	public static void quartUK2cubicDM(){
		quartUK2cubicM();
		cubicM2cubicDM();
	}
	public static void quartUK2cubicFoot(){
		quartUK2cubicM();
		cubicM2cubicFoot();
	}
	public static void quartUK2cubicInch(){
		quartUK2cubicM();
		cubicM2cubicInch();
	}
	public static void quartUK2cubicMM(){
		quartUK2cubicM();
		cubicM2cubicMM();
	}
	public static void quartUK2cubicYard(){
		quartUK2cubicM();
		cubicM2cubicYard();
	}
	public static void quartUK2dekaL(){
		quartUK2cubicM();
		cubicM2dekaL();
	}
	public static void quartUK2fluidDram(){
		quartUK2cubicM();
		cubicM2fluidDram();
	}
	public static void quartUK2fluidOunce(){
		quartUK2cubicM();
		cubicM2fluidOunce();
	}
	public static void quartUK2gallon(){
		quartUK2cubicM();
		cubicM2gallon();
	}
	public static void quartUK2gallonUK(){
		quartUK2cubicM();
		cubicM2gallonUK();
	}
	public static void quartUK2gill(){
		quartUK2cubicM();
		cubicM2gill();
	}
	public static void quartUK2hectoL(){
		quartUK2cubicM();
		cubicM2hectoL();
	}
	public static void quartUK2KL(){
		quartUK2cubicM();
		cubicM2KL();
	}
	public static void quartUK2L(){
		quartUK2cubicM();
		cubicM2L();
	}
	public static void quartUK2microL(){
		quartUK2cubicM();
		cubicM2microL();
	}
	public static void quartUK2ML(){
		quartUK2cubicM();
		cubicM2ML();
	}
	public static void quartUK2minim(){
		quartUK2cubicM();
		cubicM2minim();
	}
	public static void quartUK2peckUSdry(){
		quartUK2cubicM();
		cubicM2peckUSdry();
	}
	public static void quartUK2pintFluid(){
		quartUK2cubicM();
		cubicM2pintFluid();
	}
	public static void quartUK2pintUK(){
		quartUK2cubicM();
		cubicM2pintUK();
	}
	public static void quartUK2pintUSdry(){
		quartUK2cubicM();
		cubicM2pintUSdry();
	}
	public static void quartUK2quartFluid(){
		quartUK2cubicM();
		cubicM2quartFluid();
	}
	public static void quartUK2quartUK(){
		quartUK2cubicM();
		cubicM2quartUK();
	}
	public static void quartUK2quartUSdry(){
		quartUK2cubicM();
		cubicM2quartUSdry();
	}
	 //````````````````````````````````````````````````````````\\
	//------------------Quart US Dry Conversions----------------------\\
	public static void quartUSdry2cubicM(){
		unit= unit.multiply(new BigDecimal("0.001101220942715"));
	}
	public static void quartUSdry2barrel(){
		quartUSdry2cubicM();
		cubicM2barrel();
	}
	public static void quartUSdry2bushelUK(){
		quartUSdry2cubicM();
		cubicM2bushelUK();
	}
	public static void quartUSdry2bushelUSdry(){
		quartUSdry2cubicM();
		cubicM2bushelUSdry();
	}
	public static void quartUSdry2centiliter(){
		quartUSdry2cubicM();
		cubicM2centiliter();
	}
	public static void quartUSdry2cubicCM(){
		quartUSdry2cubicM();
		cubicM2cubicCM();
	}
	public static void quartUSdry2cubicDM(){
		quartUSdry2cubicM();
		cubicM2cubicDM();
	}
	public static void quartUSdry2cubicFoot(){
		quartUSdry2cubicM();
		cubicM2cubicFoot();
	}
	public static void quartUSdry2cubicInch(){
		quartUSdry2cubicM();
		cubicM2cubicInch();
	}
	public static void quartUSdry2cubicMM(){
		quartUSdry2cubicM();
		cubicM2cubicMM();
	}
	public static void quartUSdry2cubicYard(){
		quartUSdry2cubicM();
		cubicM2cubicYard();
	}
	public static void quartUSdry2dekaL(){
		quartUSdry2cubicM();
		cubicM2dekaL();
	}
	public static void quartUSdry2fluidDram(){
		quartUSdry2cubicM();
		cubicM2fluidDram();
	}
	public static void quartUSdry2fluidOunce(){
		quartUSdry2cubicM();
		cubicM2fluidOunce();
	}
	public static void quartUSdry2gallon(){
		quartUSdry2cubicM();
		cubicM2gallon();
	}
	public static void quartUSdry2gallonUK(){
		quartUSdry2cubicM();
		cubicM2gallonUK();
	}
	public static void quartUSdry2gill(){
		quartUSdry2cubicM();
		cubicM2gill();
	}
	public static void quartUSdry2hectoL(){
		quartUSdry2cubicM();
		cubicM2hectoL();
	}
	public static void quartUSdry2KL(){
		quartUSdry2cubicM();
		cubicM2KL();
	}
	public static void quartUSdry2L(){
		quartUSdry2cubicM();
		cubicM2L();
	}
	public static void quartUSdry2microL(){
		quartUSdry2cubicM();
		cubicM2microL();
	}
	public static void quartUSdry2ML(){
		quartUSdry2cubicM();
		cubicM2ML();
	}
	public static void quartUSdry2minim(){
		quartUSdry2cubicM();
		cubicM2minim();
	}
	public static void quartUSdry2peckUSdry(){
		quartUSdry2cubicM();
		cubicM2peckUSdry();
	}
	public static void quartUSdry2pintFluid(){
		quartUSdry2cubicM();
		cubicM2pintFluid();
	}
	public static void quartUSdry2pintUK(){
		quartUSdry2cubicM();
		cubicM2pintUK();
	}
	public static void quartUSdry2pintUSdry(){
		quartUSdry2cubicM();
		cubicM2pintUSdry();
	}
	public static void quartUSdry2quartFluid(){
		quartUSdry2cubicM();
		cubicM2quartFluid();
	}
	public static void quartUSdry2quartUK(){
		quartUSdry2cubicM();
		cubicM2quartUK();
	}
	public static void quartUSdry2quartUSdry(){
		quartUSdry2cubicM();
		cubicM2quartUSdry();
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