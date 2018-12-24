package sub;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;

public class Speed{
	static final String[] units = new String[]{"Centimeter/sec","Foot/sec","Kilometer/hour","Kilometer/min","Kilometer/sec","Knot",
												"Mach","Meter/min","Meter/sec","Mile/hour","Speed of Light", "Speed of Sound",
												"Yard/sec", "Exit"};

	static BigDecimal unit;
	static int choice1, choice2;
	static Scanner scn = new Scanner(System.in);
	
	public static void inputChoice1(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();
		if(choice1 == 14 ){
			System.exit(0);
		}	
	}

	public static void inputChoice2(){
		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();
		if(choice2 == 14 ){
			System.exit(0);
		}
	}

	public static void inputUnit(){
		System.out.print("\nEnter " + units[choice1-1] + ": ");
		unit = scn.nextBigDecimal();
	}

	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nSPEED CONVERTER");
		for(String each:units){
			System.out.println(i + ". " + each);
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
		//--------------Centimeter Per Second Conversion Choices------------------\\
		if(choice1 == 1 && choice2 == 1){
			CMPS2CMPS();
		}
		if(choice1 == 1 && choice2 == 2){
			CMPS2FPS();
		}
		if(choice1 == 1 && choice2 == 3){
			CMPS2KMPH();
		}
		if(choice1 == 1 && choice2 == 4){
			CMPS2KMPM();
		}
		if(choice1 == 1 && choice2 == 5){
			CMPS2KMPS();
		}
		if(choice1 == 1 && choice2 == 6){
			CMPS2Knot();
		}
		if(choice1 == 1 && choice2 == 7){
			CMPS2Mach();
		}
		if(choice1 == 1 && choice2 == 8){
			CMPS2MPM();
		}
		if(choice1 == 1 && choice2 == 9){
			CMPS2MPS();
		}
		if(choice1 == 1 && choice2 == 10){
			CMPS2MPH();
		}
		if(choice1 == 1 && choice2 == 11){
			CMPS2SpeedOfLight();
		}
		if(choice1 == 1 && choice2 == 12){
			CMPS2SpeedOfSound();
		}
		if(choice1 == 1 && choice2 == 13){
			CMPS2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//-------------------Foot Per Second Conversion Choices-------------------\\
		if(choice1 == 2 && choice2 == 1){
			FPS2CMPS();
		}
		if(choice1 == 2 && choice2 == 2){
			FPS2FPS();
		}
		if(choice1 == 2 && choice2 == 3){
			FPS2KMPH();
		}
		if(choice1 == 2 && choice2 == 4){
			FPS2KMPM();
		}
		if(choice1 == 2 && choice2 == 5){
			FPS2KMPS();
		}
		if(choice1 == 2 && choice2 == 6){
			FPS2Knot();
		}
		if(choice1 == 2 && choice2 == 7){
			FPS2Mach();
		}
		if(choice1 == 2 && choice2 == 8){
			FPS2MPM();
		}
		if(choice1 == 2 && choice2 == 9){
			FPS2MPS();
		}
		if(choice1 == 2 && choice2 == 10){
			FPS2MPH();
		}
		if(choice1 == 2 && choice2 == 11){
			FPS2SpeedOfLight();
		}
		if(choice1 == 2 && choice2 == 12){
			FPS2SpeedOfSound();
		}
		if(choice1 == 2 && choice2 == 13){
			FPS2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//-----------------Kilometer Per Hour Conversion Choices------------------\\
		if(choice1 == 3 && choice2 == 1){
			KMPH2CMPS();
		}
		if(choice1 == 3 && choice2 == 2){
			KMPH2FPS();
		}
		if(choice1 == 3 && choice2 == 3){
			KMPH2KMPH();
		}
		if(choice1 == 3 && choice2 == 4){
			KMPH2KMPM();
		}
		if(choice1 == 3 && choice2 == 5){
			KMPH2KMPS();
		}
		if(choice1 == 3 && choice2 == 6){
			KMPH2Knot();
		}
		if(choice1 == 3 && choice2 == 7){
			KMPH2Mach();
		}
		if(choice1 == 3 && choice2 == 8){
			KMPH2MPM();
		}
		if(choice1 == 3 && choice2 == 9){
			KMPH2MPS();
		}
		if(choice1 == 3 && choice2 == 10){
			KMPH2MPH();
		}
		if(choice1 == 3 && choice2 == 11){
			KMPH2SpeedOfLight();
		}
		if(choice1 == 3 && choice2 == 12){
			KMPH2SpeedOfSound();
		}
		if(choice1 == 3 && choice2 == 13){
			KMPH2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//---------------Kilometer Per Minute Conversion Choices------------------\\
		if(choice1 == 4 && choice2 == 1){
			KMPM2CMPS();
		}
		if(choice1 == 4 && choice2 == 2){
			KMPM2FPS();
		}
		if(choice1 == 4 && choice2 == 3){
			KMPM2KMPH();
		}
		if(choice1 == 4 && choice2 == 4){
			KMPM2KMPM();
		}
		if(choice1 == 4 && choice2 == 5){
			KMPM2KMPS();
		}
		if(choice1 == 4 && choice2 == 6){
			KMPM2Knot();
		}
		if(choice1 == 4 && choice2 == 7){
			KMPM2Mach();
		}
		if(choice1 == 4 && choice2 == 8){
			KMPM2MPM();
		}
		if(choice1 == 4 && choice2 == 9){
			KMPM2MPS();
		}
		if(choice1 == 4 && choice2 == 10){
			KMPM2MPH();
		}
		if(choice1 == 4 && choice2 == 11){
			KMPM2SpeedOfLight();
		}
		if(choice1 == 4 && choice2 == 12){
			KMPM2SpeedOfSound();
		}
		if(choice1 == 4 && choice2 == 13){
			KMPM2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//---------------Kilometer Per Second Conversion Choices------------------\\
		if(choice1 == 5 && choice2 == 1){
			KMPS2CMPS();
		}
		if(choice1 == 5 && choice2 == 2){
			KMPS2FPS();
		}
		if(choice1 == 5 && choice2 == 3){
			KMPS2KMPH();
		}
		if(choice1 == 5 && choice2 == 4){
			KMPS2KMPM();
		}
		if(choice1 == 5 && choice2 == 5){
			KMPS2KMPS();
		}
		if(choice1 == 5 && choice2 == 6){
			KMPS2Knot();
		}
		if(choice1 == 5 && choice2 == 7){
			KMPS2Mach();
		}
		if(choice1 == 5 && choice2 == 8){
			KMPS2MPM();
		}
		if(choice1 == 5 && choice2 == 9){
			KMPS2MPS();
		}
		if(choice1 == 5 && choice2 == 10){
			KMPS2MPH();
		}
		if(choice1 == 5 && choice2 == 11){
			KMPS2SpeedOfLight();
		}
		if(choice1 == 5 && choice2 == 12){
			KMPS2SpeedOfSound();
		}
		if(choice1 == 5 && choice2 == 13){
			KMPS2YPS();
		}
		//``````````````````````````````````````````````````````\\
		//--------------Knot Conversion Choices------------------\\
		if(choice1 == 6 && choice2 == 1){
			Knot2CMPS();
		}
		if(choice1 == 6 && choice2 == 2){
			Knot2FPS();
		}
		if(choice1 == 6 && choice2 == 3){
			Knot2KMPH();
		}
		if(choice1 == 6 && choice2 == 4){
			Knot2KMPM();
		}
		if(choice1 == 6 && choice2 == 5){
			Knot2KMPS();
		}
		if(choice1 == 6 && choice2 == 6){
			Knot2Knot();
		}
		if(choice1 == 6 && choice2 == 7){
			Knot2Mach();
		}
		if(choice1 == 6 && choice2 == 8){
			Knot2MPM();
		}
		if(choice1 == 6 && choice2 == 9){
			Knot2MPS();
		}
		if(choice1 == 6 && choice2 == 10){
			Knot2MPH();
		}
		if(choice1 == 6 && choice2 == 11){
			Knot2SpeedOfLight();
		}
		if(choice1 == 6 && choice2 == 12){
			Knot2SpeedOfSound();
		}
		if(choice1 == 6 && choice2 == 13){
			Knot2YPS();
		}
		//``````````````````````````````````````````````````````\\
		//--------------Mach Conversion Choices------------------\\
		if(choice1 == 7 && choice2 == 1){
			Mach2CMPS();
		}
		if(choice1 == 7 && choice2 == 2){
			Mach2FPS();
		}
		if(choice1 == 7 && choice2 == 3){
			Mach2KMPH();
		}
		if(choice1 == 7 && choice2 == 4){
			Mach2KMPM();
		}
		if(choice1 == 7 && choice2 == 5){
			Mach2KMPS();
		}
		if(choice1 == 7 && choice2 == 6){
			Mach2Knot();
		}
		if(choice1 == 7 && choice2 == 7){
			Mach2Mach();
		}
		if(choice1 == 7 && choice2 == 8){
			Mach2MPM();
		}
		if(choice1 == 7 && choice2 == 9){
			Mach2MPS();
		}
		if(choice1 == 7 && choice2 == 10){
			Mach2MPH();
		}
		if(choice1 == 7 && choice2 == 11){
			Mach2SpeedOfLight();
		}
		if(choice1 == 7 && choice2 == 12){
			Mach2SpeedOfSound();
		}
		if(choice1 == 7 && choice2 == 13){
			Mach2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//-----------------Meter Per Minute Conversion Choices--------------------\\
		if(choice1 == 8 && choice2 == 1){
			MPM2CMPS();
		}
		if(choice1 == 8 && choice2 == 2){
			MPM2FPS();
		}
		if(choice1 == 8 && choice2 == 3){
			MPM2KMPH();
		}
		if(choice1 == 8 && choice2 == 4){
			MPM2KMPM();
		}
		if(choice1 == 8 && choice2 == 5){
			MPM2KMPS();
		}
		if(choice1 == 8 && choice2 == 6){
			MPM2Knot();
		}
		if(choice1 == 8 && choice2 == 7){
			MPM2Mach();
		}
		if(choice1 == 8 && choice2 == 8){
			MPM2MPM();
		}
		if(choice1 == 8 && choice2 == 9){
			MPM2MPS();
		}
		if(choice1 == 8 && choice2 == 10){
			MPM2MPH();
		}
		if(choice1 == 8 && choice2 == 11){
			MPM2SpeedOfLight();
		}
		if(choice1 == 8 && choice2 == 12){
			MPM2SpeedOfSound();
		}
		if(choice1 == 8 && choice2 == 13){
			MPM2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//--------------Centimeter Per Second Conversion Choices------------------\\
		if(choice1 == 9 && choice2 == 1){
			MPS2CMPS();
		}
		if(choice1 == 9 && choice2 == 2){
			MPS2FPS();
		}
		if(choice1 == 9 && choice2 == 3){
			MPS2KMPH();
		}
		if(choice1 == 9 && choice2 == 4){
			MPS2KMPM();
		}
		if(choice1 == 9 && choice2 == 5){
			MPS2KMPS();
		}
		if(choice1 == 9 && choice2 == 6){
			MPS2Knot();
		}
		if(choice1 == 9 && choice2 == 7){
			MPS2Mach();
		}
		if(choice1 == 9 && choice2 == 8){
			MPS2MPM();
		}
		if(choice1 == 9 && choice2 == 9){
			MPS2MPS();
		}
		if(choice1 == 9 && choice2 == 10){
			MPS2MPH();
		}
		if(choice1 == 9 && choice2 == 11){
			MPS2SpeedOfLight();
		}
		if(choice1 == 9 && choice2 == 12){
			MPS2SpeedOfSound();
		}
		if(choice1 == 9 && choice2 == 13){
			MPS2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//--------------Centimeter Per Second Conversion Choices------------------\\
		if(choice1 == 10 && choice2 == 1){
			MPH2CMPS();
		}
		if(choice1 == 10 && choice2 == 2){
			MPH2FPS();
		}
		if(choice1 == 10 && choice2 == 3){
			MPH2KMPH();
		}
		if(choice1 == 10 && choice2 == 4){
			MPH2KMPM();
		}
		if(choice1 == 10 && choice2 == 5){
			MPH2KMPS();
		}
		if(choice1 == 10 && choice2 == 6){
			MPH2Knot();
		}
		if(choice1 == 10 && choice2 == 7){
			MPH2Mach();
		}
		if(choice1 == 10 && choice2 == 8){
			MPH2MPM();
		}
		if(choice1 == 10 && choice2 == 9){
			MPH2MPS();
		}
		if(choice1 == 10 && choice2 == 10){
			MPH2MPH();
		}
		if(choice1 == 10 && choice2 == 11){
			MPH2SpeedOfLight();
		}
		if(choice1 == 10 && choice2 == 12){
			MPH2SpeedOfSound();
		}
		if(choice1 == 10 && choice2 == 13){
			MPH2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//------------------Speed Of Light Conversion Choices---------------------\\
		if(choice1 == 11 && choice2 == 1){
			SpeedOfLight2CMPS();
		}
		if(choice1 == 11 && choice2 == 2){
			SpeedOfLight2FPS();
		}
		if(choice1 == 11 && choice2 == 3){
			SpeedOfLight2KMPH();
		}
		if(choice1 == 11 && choice2 == 4){
			SpeedOfLight2KMPM();
		}
		if(choice1 == 11 && choice2 == 5){
			SpeedOfLight2KMPS();
		}
		if(choice1 == 11 && choice2 == 6){
			SpeedOfLight2Knot();
		}
		if(choice1 == 11 && choice2 == 7){
			SpeedOfLight2Mach();
		}
		if(choice1 == 11 && choice2 == 8){
			SpeedOfLight2MPM();
		}
		if(choice1 == 11 && choice2 == 9){
			SpeedOfLight2MPS();
		}
		if(choice1 == 11 && choice2 == 10){
			SpeedOfLight2MPH();
		}
		if(choice1 == 11 && choice2 == 11){
			SpeedOfLight2SpeedOfLight();
		}
		if(choice1 == 11 && choice2 == 12){
			SpeedOfLight2SpeedOfSound();
		}
		if(choice1 == 11 && choice2 == 13){
			SpeedOfLight2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//------------------Speed Of Sound Conversion Choices---------------------\\
		if(choice1 == 12 && choice2 == 1){
			CMPS2CMPS();
		}
		if(choice1 == 12 && choice2 == 2){
			CMPS2FPS();
		}
		if(choice1 == 12 && choice2 == 3){
			CMPS2KMPH();
		}
		if(choice1 == 12 && choice2 == 4){
			CMPS2KMPM();
		}
		if(choice1 == 12 && choice2 == 5){
			CMPS2KMPS();
		}
		if(choice1 == 12 && choice2 == 6){
			CMPS2Knot();
		}
		if(choice1 == 12 && choice2 == 7){
			CMPS2Mach();
		}
		if(choice1 == 12 && choice2 == 8){
			CMPS2MPM();
		}
		if(choice1 == 12 && choice2 == 9){
			CMPS2MPS();
		}
		if(choice1 == 12 && choice2 == 10){
			CMPS2MPH();
		}
		if(choice1 == 12 && choice2 == 11){
			CMPS2SpeedOfLight();
		}
		if(choice1 == 12 && choice2 == 12){
			CMPS2SpeedOfSound();
		}
		if(choice1 == 12 && choice2 == 13){
			CMPS2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		//------------------Yard Per Second Conversion Choices--------------------\\
		if(choice1 == 13 && choice2 == 1){
			YPS2CMPS();
		}
		if(choice1 == 13 && choice2 == 2){
			YPS2FPS();
		}
		if(choice1 == 13 && choice2 == 3){
			YPS2KMPH();
		}
		if(choice1 == 13 && choice2 == 4){
			YPS2KMPM();
		}
		if(choice1 == 13 && choice2 == 5){
			YPS2KMPS();
		}
		if(choice1 == 13 && choice2 == 6){
			YPS2Knot();
		}
		if(choice1 == 13 && choice2 == 7){
			YPS2Mach();
		}
		if(choice1 == 13 && choice2 == 8){
			YPS2MPM();
		}
		if(choice1 == 13 && choice2 == 9){
			YPS2MPS();
		}
		if(choice1 == 13 && choice2 == 10){
			YPS2MPH();
		}
		if(choice1 == 13 && choice2 == 11){
			YPS2SpeedOfLight();
		}
		if(choice1 == 13 && choice2 == 12){
			YPS2SpeedOfSound();
		}
		if(choice1 == 13 && choice2 == 13){
			YPS2YPS();
		}
		//```````````````````````````````````````````````````````````````````````\\
		outputUnit();
	}

	public static void outputUnit(){
		System.out.println("\n " + unit +" "+units[choice2-1]);
		System.out.println("Press Enter!");
		scn.next();
	}

	//---------------Speed Of Light Conversions-------------------\\
	public static void SpeedOfLight2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void SpeedOfLight2CMPS(){
		unit= unit.multiply(new BigDecimal("29979245800"));
	}
	public static void SpeedOfLight2FPS(){
		unit= unit.multiply(new BigDecimal("983571056.4304"));
	}
	public static void SpeedOfLight2KMPH(){
		unit= unit.multiply(new BigDecimal("1079252848.8"));
	}
	public static void SpeedOfLight2KMPM(){
		unit= unit.multiply(new BigDecimal("17987547.48"));
	}
	public static void SpeedOfLight2KMPS(){
		unit= unit.multiply(new BigDecimal("299792.458"));
	}
	public static void SpeedOfLight2Knot(){
		unit= unit.multiply(new BigDecimal("582749918.3585"));
	}
	public static void SpeedOfLight2Mach(){
		unit= unit.multiply(new BigDecimal("874030.4897959"));
	}
	public static void SpeedOfLight2MPM(){
		unit= unit.multiply(new BigDecimal("17987547480"));
	}
	public static void SpeedOfLight2MPS(){
		unit= unit.multiply(new BigDecimal("299792458"));
	}
	public static void SpeedOfLight2MPH(){
		unit= unit.multiply(new BigDecimal("670616629.3844"));
	}
	public static void SpeedOfLight2SpeedOfSound(){
		unit= unit.multiply(new BigDecimal("874030.4897959"));
	}
	public static void SpeedOfLight2YPS(){
		unit= unit.multiply(new BigDecimal("327857018.8101"));
	}
	//``````````````````````````````````````````````````````````````````\\
	//--------------Centimeter Per Second Conversions--------------------\\
	public static void CMPS2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.00000000003335640951982"));
	}
	public static void CMPS2CMPS(){
		CMPS2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void CMPS2FPS(){
		CMPS2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void CMPS2KMPH(){
		CMPS2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void CMPS2KMPM(){
		CMPS2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void CMPS2KMPS(){
		CMPS2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void CMPS2Knot(){
		CMPS2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void CMPS2Mach(){
		CMPS2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void CMPS2MPM(){
		CMPS2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void CMPS2MPS(){
		CMPS2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void CMPS2MPH(){
		CMPS2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void CMPS2SpeedOfSound(){
		CMPS2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void CMPS2YPS(){
		CMPS2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//-----------------Foot Per Second Conversions-----------------------\\
	public static void FPS2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000000001016703362164"));
	}
	public static void FPS2CMPS(){
		FPS2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void FPS2FPS(){
		FPS2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void FPS2KMPH(){
		FPS2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void FPS2KMPM(){
		FPS2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void FPS2KMPS(){
		FPS2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void FPS2Knot(){
		FPS2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void FPS2Mach(){
		FPS2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void FPS2MPM(){
		FPS2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void FPS2MPS(){
		FPS2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void FPS2MPH(){
		FPS2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void FPS2SpeedOfSound(){
		FPS2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void FPS2YPS(){
		FPS2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//----------------Kilometer Per Hour Conversions---------------------\\
	public static void KMPH2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000000000926566931106"));
	}
	public static void KMPH2CMPS(){
		KMPH2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void KMPH2FPS(){
		KMPH2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void KMPH2KMPH(){
		KMPH2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void KMPH2KMPM(){
		KMPH2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void KMPH2KMPS(){
		KMPH2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void KMPH2Knot(){
		KMPH2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void KMPH2Mach(){
		KMPH2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void KMPH2MPM(){
		KMPH2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void KMPH2MPS(){
		KMPH2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void KMPH2MPH(){
		KMPH2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void KMPH2SpeedOfSound(){
		KMPH2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void KMPH2YPS(){
		KMPH2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//--------------Kilometer Per Minute Conversions---------------------\\
	public static void KMPM2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.00000005559401586636"));
	}
	public static void KMPM2CMPS(){
		KMPM2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void KMPM2FPS(){
		KMPM2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void KMPM2KMPH(){
		KMPM2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void KMPM2KMPM(){
		KMPM2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void KMPM2KMPS(){
		KMPM2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void KMPM2Knot(){
		KMPM2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void KMPM2Mach(){
		KMPM2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void KMPM2MPM(){
		KMPM2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void KMPM2MPS(){
		KMPM2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void KMPM2MPH(){
		KMPM2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void KMPM2SpeedOfSound(){
		KMPM2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void KMPM2YPS(){
		KMPM2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//--------------Kilometer Per Second Conversions--------------------\\
	public static void KMPS2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000003335640951982"));
	}
	public static void KMPS2CMPS(){
		KMPS2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void KMPS2FPS(){
		KMPS2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void KMPS2KMPH(){
		KMPS2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void KMPS2KMPM(){
		KMPS2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void KMPS2KMPS(){
		KMPS2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void KMPS2Knot(){
		KMPS2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void KMPS2Mach(){
		KMPS2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void KMPS2MPM(){
		KMPS2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void KMPS2MPS(){
		KMPS2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void KMPS2MPH(){
		KMPS2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void KMPS2SpeedOfSound(){
		KMPS2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void KMPS2YPS(){
		KMPS2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//-------------------------Knot Conversions--------------------------\\
	public static void Knot2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000000001716001956408"));
	}
	public static void Knot2CMPS(){
		Knot2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void Knot2FPS(){
		Knot2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void Knot2KMPH(){
		Knot2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void Knot2KMPM(){
		Knot2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void Knot2KMPS(){
		Knot2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void Knot2Knot(){
		Knot2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void Knot2Mach(){
		Knot2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void Knot2MPM(){
		Knot2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void Knot2MPS(){
		Knot2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void Knot2MPH(){
		Knot2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void Knot2SpeedOfSound(){
		Knot2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void Knot2YPS(){
		Knot2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//-----------------------Mach Conversions----------------------------\\
	public static void Mach2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.00000114412484653"));
	}
	public static void Mach2CMPS(){
		Mach2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void Mach2FPS(){
		Mach2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void Mach2KMPH(){
		Mach2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void Mach2KMPM(){
		Mach2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void Mach2KMPS(){
		Mach2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void Mach2Knot(){
		Mach2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void Mach2Mach(){
		Mach2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void Mach2MPM(){
		Mach2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void Mach2MPS(){
		Mach2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void Mach2MPH(){
		Mach2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void Mach2SpeedOfSound(){
		Mach2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void Mach2YPS(){
		Mach2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//----------------Meter Per Minute Conversions-----------------------\\
	public static void MPM2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.00000000005559401586636"));
	}
	public static void MPM2CMPS(){
		MPM2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void MPM2FPS(){
		MPM2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void MPM2KMPH(){
		MPM2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void MPM2KMPM(){
		MPM2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void MPM2KMPS(){
		MPM2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void MPM2Knot(){
		MPM2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void MPM2Mach(){
		MPM2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void MPM2MPM(){
		MPM2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void MPM2MPS(){
		MPM2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void MPM2MPH(){
		MPM2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void MPM2SpeedOfSound(){
		MPM2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void MPM2YPS(){
		MPM2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//---------------------Meter Per Second Conversions------------------\\
	public static void MPS2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000000003335640951982"));
	}
	public static void MPS2CMPS(){
		MPS2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void MPS2FPS(){
		MPS2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void MPS2KMPH(){
		MPS2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void MPS2KMPM(){
		MPS2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void MPS2KMPS(){
		MPS2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void MPS2Knot(){
		MPS2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void MPS2Mach(){
		MPS2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void MPS2MPM(){
		MPS2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void MPS2MPS(){
		MPS2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void MPS2MPH(){
		MPS2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void MPS2SpeedOfSound(){
		MPS2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void MPS2YPS(){
		MPS2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//-------------------Mile Per Hour Conversions-----------------------\\
	public static void MPH2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000000001491164931174"));
	}
	public static void MPH2CMPS(){
		MPH2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void MPH2FPS(){
		MPH2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void MPH2KMPH(){
		MPH2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void MPH2KMPM(){
		MPH2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void MPH2KMPS(){
		MPH2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void MPH2Knot(){
		MPH2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void MPH2Mach(){
		MPH2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void MPH2MPM(){
		MPH2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void MPH2MPS(){
		MPH2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void MPH2MPH(){
		MPH2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void MPH2SpeedOfSound(){
		MPH2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void MPH2YPS(){
		MPH2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//------------------Speed Of Sound Conversions-----------------------\\
	public static void SpeedOfSound2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.0000011441248"));
	}
	public static void SpeedOfSound2CMPS(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void SpeedOfSound2FPS(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void SpeedOfSound2KMPH(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void SpeedOfSound2KMPM(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void SpeedOfSound2KMPS(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void SpeedOfSound2Knot(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void SpeedOfSound2Mach(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void SpeedOfSound2MPM(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void SpeedOfSound2MPS(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void SpeedOfSound2MPH(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void SpeedOfSound2SpeedOfSound(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void SpeedOfSound2YPS(){
		SpeedOfSound2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	//-------------------Yard Per Second Conversions---------------------\\
	public static void YPS2SpeedOfLight(){
		unit= unit.multiply(new BigDecimal("0.000000003050110086492"));
	}
	public static void YPS2CMPS(){
		YPS2SpeedOfLight();
		SpeedOfLight2CMPS();
	}
	public static void YPS2FPS(){
		YPS2SpeedOfLight();
		SpeedOfLight2FPS();
	}
	public static void YPS2KMPH(){
		YPS2SpeedOfLight();
		SpeedOfLight2KMPH();
	}
	public static void YPS2KMPM(){
		YPS2SpeedOfLight();
		SpeedOfLight2KMPM();
	}
	public static void YPS2KMPS(){
		YPS2SpeedOfLight();
		SpeedOfLight2KMPS();
	}
	public static void YPS2Knot(){
		YPS2SpeedOfLight();
		SpeedOfLight2Knot();
	}
	public static void YPS2Mach(){
		YPS2SpeedOfLight();
		SpeedOfLight2Mach();
	}
	public static void YPS2MPM(){
		YPS2SpeedOfLight();
		SpeedOfLight2MPM();
	}
	public static void YPS2MPS(){
		YPS2SpeedOfLight();
		SpeedOfLight2MPS();
	}
	public static void YPS2MPH(){
		YPS2SpeedOfLight();
		SpeedOfLight2MPH();
	}
	public static void YPS2SpeedOfSound(){
		YPS2SpeedOfLight();
		SpeedOfLight2SpeedOfSound();
	}
	public static void YPS2YPS(){
		YPS2SpeedOfLight();
		SpeedOfLight2YPS();
	}
	//``````````````````````````````````````````````````````````````````\\
	public static void main(String arg[]){
		while(true){
			options();
			choiceFilling();
		}
	}
}