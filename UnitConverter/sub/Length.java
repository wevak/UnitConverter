package sub;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;

public class Length{
	static final String[] units = new String[]{"Kilometre km", "Metre m", "Decimetre dm", "Centimetre cm", "Millimetre mm",
	 "Micrometre um", "Nanometre nm", "Picometre pm", "Nautical mile nmi", "Mile mi", "Femara fur", "Fathom fm",
	 "Yard yd", "Foot ft", "Inch in", "Kilometre gongli", "Li li", "Zhang zhang",
	 "Chi chi", "Cun cun", "Fen fen", "Lii lii", "Hao hao", "Parsec pc",
	 "Lunar distance ld", "Astronomical unit", "Light year ly", "Exit"};

	static BigDecimal unit;
	static int choice1, choice2;
	static Scanner scn = new Scanner(System.in);
	
	public static void inputChoice1(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();
		if(choice1 == 28 ){
			System.exit(0);
		}	
	}

	public static void inputChoice2(){
		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();
		if(choice2 == 28 ){
			System.exit(0);
		}
	}

	public static void inputUnit(){
		System.out.print("\nEnter " + units[choice1-1] + ": ");
		unit = scn.nextBigDecimal();
	}

	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLENGTH CONVERTER");
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
		//--------------KM Conversion Choices------------------//
		if(choice1 == 1 && choice2 == 1){
			KM2KM();
		}
		else if(choice1 == 1 && choice2 == 2){
			KM2M();
		}
		else if(choice1 == 1 && choice2 == 3){
			KM2DM();
		}
		else if(choice1 == 1 && choice2 == 4){
			KM2CM();
		}
		else if(choice1 == 1 && choice2 == 5){
			KM2MM();
		}
		else if(choice1 == 1 && choice2 == 6){
			KM2UM();
		}
		else if(choice1 == 1 && choice2 == 7){
			KM2NM();
		}
		else if(choice1 == 1 && choice2 == 8){
			KM2PM();
		}
		else if(choice1 == 1 && choice2 == 9){
			KM2NMI();
		}
		else if(choice1 == 1 && choice2 == 10){
			KM2MI();
		}
		else if(choice1 == 1 && choice2 == 11){
			KM2FUR();
		}
		else if(choice1 == 1 && choice2 == 12){
			KM2FM();
		}
		else if(choice1 == 1 && choice2 == 13){
			KM2YD();
		}
		else if(choice1 == 1 && choice2 == 14){
			KM2FT();
		}
		else if(choice1 == 1 && choice2 == 15){
			KM2IN();
		}
		else if(choice1 == 1 && choice2 == 16){
			KM2GONGLI();
		}
		else if(choice1 == 1 && choice2 == 17){
			KM2LI();
		}
		else if(choice1 == 1 && choice2 == 18){
			KM2ZHANG();
		}
		else if(choice1 == 1 && choice2 == 19){
			KM2CHI();
		}
		else if(choice1 == 1 && choice2 == 20){
			KM2CUN();
		}
		else if(choice1 == 1 && choice2 == 21){
			KM2FEN();
		}
		else if(choice1 == 1 && choice2 == 22){
			KM2LII();
		}
		else if(choice1 == 1 && choice2 == 23){
			KM2HAO();
		}
		else if(choice1 == 1 && choice2 == 24){
			KM2PC();
		}
		else if(choice1 == 1 && choice2 == 25){
			KM2LD();
		}
		else if(choice1 == 1 && choice2 == 26){
			KM2ASTRO();
		}
		else if(choice1 == 1 && choice2 == 27){
			KM2LY();
		}
		//``````````````````````````````````````````````````

		//-------------M Conversion Choices---------------//
		if(choice1 == 2 && choice2 == 1){
			M2KM();
		}
		else if(choice1 == 2 && choice2 == 2){
			M2M();
		}
		else if(choice1 == 2 && choice2 == 3){
			M2DM();
		}
		else if(choice1 == 2 && choice2 == 4){
			M2CM();
		}
		else if(choice1 == 2 && choice2 == 5){
			M2MM();
		}
		else if(choice1 == 2 && choice2 == 6){
			M2UM();
		}
		else if(choice1 == 2 && choice2 == 7){
			M2NM();
		}
		else if(choice1 == 2 && choice2 == 8){
			M2PM();
		}
		else if(choice1 == 2 && choice2 == 9){
			M2NMI();
		}
		else if(choice1 == 2 && choice2 == 10){
			M2MI();
		}
		else if(choice1 == 2 && choice2 == 11){
			M2FUR();
		}
		else if(choice1 == 2 && choice2 == 12){
			M2FM();
		}
		else if(choice1 == 2 && choice2 == 13){
			M2YD();
		}
		else if(choice1 == 2 && choice2 == 14){
			M2FT();
		}
		else if(choice1 == 2 && choice2 == 15){
			M2IN();
		}
		else if(choice1 == 2 && choice2 == 16){
			M2GONGLI();
		}
		else if(choice1 == 2 && choice2 == 17){
			M2LI();
		}
		else if(choice1 == 2 && choice2 == 18){
			M2ZHANG();
		}
		else if(choice1 == 2 && choice2 == 19){
			M2CHI();
		}
		else if(choice1 == 2 && choice2 == 20){
			M2CUN();
		}
		else if(choice1 == 2 && choice2 == 21){
			M2FEN();
		}
		else if(choice1 == 2 && choice2 == 22){
			M2LII();
		}
		else if(choice1 == 2 && choice2 == 23){
			M2HAO();
		}
		else if(choice1 == 2 && choice2 == 24){
			M2PC();
		}
		else if(choice1 == 2 && choice2 == 25){
			M2LD();
		}
		else if(choice1 == 2 && choice2 == 26){
			M2ASTRO();
		}
		else if(choice1 == 2 && choice2 == 27){
			M2LY();
		}
		//``````````````````````````````````````````````````

		//--------------DM Conversion Choices------------------//
		if(choice1 == 3 && choice2 == 1){
			DM2KM();
		}
		else if(choice1 == 3 && choice2 == 2){
			DM2M();
		}
		else if(choice1 == 3 && choice2 == 3){
			DM2DM();
		}
		else if(choice1 == 3 && choice2 == 4){
			DM2CM();
		}
		else if(choice1 == 3 && choice2 == 5){
			DM2MM();
		}
		else if(choice1 == 3 && choice2 == 6){
			DM2UM();
		}
		else if(choice1 == 3 && choice2 == 7){
			DM2NM();
		}
		else if(choice1 == 3 && choice2 == 8){
			DM2PM();
		}
		else if(choice1 == 3 && choice2 == 9){
			DM2NMI();
		}
		else if(choice1 == 3 && choice2 == 10){
			DM2MI();
		}
		else if(choice1 == 3 && choice2 == 11){
			DM2FUR();
		}
		else if(choice1 == 3 && choice2 == 12){
			DM2FM();
		}
		else if(choice1 == 3 && choice2 == 13){
			DM2YD();
		}
		else if(choice1 == 3 && choice2 == 14){
			DM2FT();
		}
		else if(choice1 == 3 && choice2 == 15){
			DM2IN();
		}
		else if(choice1 == 3 && choice2 == 16){
			DM2GONGLI();
		}
		else if(choice1 == 3 && choice2 == 17){
			DM2LI();
		}
		else if(choice1 == 3 && choice2 == 18){
			DM2ZHANG();
		}
		else if(choice1 == 3 && choice2 == 19){
			DM2CHI();
		}
		else if(choice1 == 3 && choice2 == 20){
			DM2CUN();
		}
		else if(choice1 == 3 && choice2 == 21){
			DM2FEN();
		}
		else if(choice1 == 3 && choice2 == 22){
			DM2LII();
		}
		else if(choice1 == 3 && choice2 == 23){
			DM2HAO();
		}
		else if(choice1 == 3 && choice2 == 24){
			DM2PC();
		}
		else if(choice1 == 3 && choice2 == 25){
			DM2LD();
		}
		else if(choice1 == 3 && choice2 == 26){
			DM2ASTRO();
		}
		else if(choice1 == 3 && choice2 == 27){
			DM2LY();
		}
		//``````````````````````````````````````````````````

		//--------------CM Conversion Choices------------------//
		if(choice1 == 4 && choice2 == 1){
			CM2KM();
		}
		else if(choice1 == 4 && choice2 == 2){
			CM2M();
		}
		else if(choice1 == 4 && choice2 == 3){
			CM2DM();
		}
		else if(choice1 == 4 && choice2 == 4){
			CM2CM();
		}
		else if(choice1 == 4 && choice2 == 5){
			CM2MM();
		}
		else if(choice1 == 4 && choice2 == 6){
			CM2UM();
		}
		else if(choice1 == 4 && choice2 == 7){
			CM2NM();
		}
		else if(choice1 == 4 && choice2 == 8){
			CM2PM();
		}
		else if(choice1 == 4 && choice2 == 9){
			CM2NMI();
		}
		else if(choice1 == 4 && choice2 == 10){
			CM2MI();
		}
		else if(choice1 == 4 && choice2 == 11){
			CM2FUR();
		}
		else if(choice1 == 4 && choice2 == 12){
			CM2FM();
		}
		else if(choice1 == 4 && choice2 == 13){
			CM2YD();
		}
		else if(choice1 == 4 && choice2 == 14){
			CM2FT();
		}
		else if(choice1 == 4 && choice2 == 15){
			CM2IN();
		}
		else if(choice1 == 4 && choice2 == 16){
			CM2GONGLI();
		}
		else if(choice1 == 4 && choice2 == 17){
			CM2LI();
		}
		else if(choice1 == 4 && choice2 == 18){
			CM2ZHANG();
		}
		else if(choice1 == 4 && choice2 == 19){
			CM2CHI();
		}
		else if(choice1 == 4 && choice2 == 20){
			CM2CUN();
		}
		else if(choice1 == 4 && choice2 == 21){
			CM2FEN();
		}
		else if(choice1 == 4 && choice2 == 22){
			CM2LII();
		}
		else if(choice1 == 4 && choice2 == 23){
			CM2HAO();
		}
		else if(choice1 == 4 && choice2 == 24){
			CM2PC();
		}
		else if(choice1 == 4 && choice2 == 25){
			CM2LD();
		}
		else if(choice1 == 4 && choice2 == 26){
			CM2ASTRO();
		}
		else if(choice1 == 4 && choice2 == 27){
			CM2LY();
		}
		//``````````````````````````````````````````````````
		//--------------MM Conversion Choices------------------//
		if(choice1 == 5 && choice2 == 1){
			MM2KM();
		}
		else if(choice1 == 5 && choice2 == 2){
			MM2M();
		}
		else if(choice1 == 5 && choice2 == 3){
			MM2DM();
		}
		else if(choice1 == 5 && choice2 == 4){
			MM2CM();
		}
		else if(choice1 == 5 && choice2 == 5){
			MM2MM();
		}
		else if(choice1 == 5 && choice2 == 6){
			MM2UM();
		}
		else if(choice1 == 5 && choice2 == 7){
			MM2NM();
		}
		else if(choice1 == 5 && choice2 == 8){
			MM2PM();
		}
		else if(choice1 == 5 && choice2 == 9){
			MM2NMI();
		}
		else if(choice1 == 5 && choice2 == 10){
			MM2MI();
		}
		else if(choice1 == 5 && choice2 == 11){
			MM2FUR();
		}
		else if(choice1 == 5 && choice2 == 12){
			MM2FM();
		}
		else if(choice1 == 5 && choice2 == 13){
			MM2YD();
		}
		else if(choice1 == 5 && choice2 == 14){
			MM2FT();
		}
		else if(choice1 == 5 && choice2 == 15){
			MM2IN();
		}
		else if(choice1 == 5 && choice2 == 16){
			MM2GONGLI();
		}
		else if(choice1 == 5 && choice2 == 17){
			MM2LI();
		}
		else if(choice1 == 5 && choice2 == 18){
			MM2ZHANG();
		}
		else if(choice1 == 5 && choice2 == 19){
			MM2CHI();
		}
		else if(choice1 == 5 && choice2 == 20){
			MM2CUN();
		}
		else if(choice1 == 5 && choice2 == 21){
			MM2FEN();
		}
		else if(choice1 == 5 && choice2 == 22){
			MM2LII();
		}
		else if(choice1 == 5 && choice2 == 23){
			MM2HAO();
		}
		else if(choice1 == 5 && choice2 == 24){
			MM2PC();
		}
		else if(choice1 == 5 && choice2 == 25){
			MM2LD();
		}
		else if(choice1 == 5 && choice2 == 26){
			MM2ASTRO();
		}
		else if(choice1 == 5 && choice2 == 27){
			MM2LY();
		}
		//``````````````````````````````````````````````````
		//--------------UM Conversion Choices------------------//
		if(choice1 == 6 && choice2 == 1){
			UM2KM();
		}
		else if(choice1 == 6 && choice2 == 2){
			UM2M();
		}
		else if(choice1 == 6 && choice2 == 3){
			UM2DM();
		}
		else if(choice1 == 6 && choice2 == 4){
			UM2CM();
		}
		else if(choice1 == 6 && choice2 == 5){
			UM2MM();
		}
		else if(choice1 == 6 && choice2 == 6){
			UM2UM();
		}
		else if(choice1 == 6 && choice2 == 7){
			UM2NM();
		}
		else if(choice1 == 6 && choice2 == 8){
			UM2PM();
		}
		else if(choice1 == 6 && choice2 == 9){
			UM2NMI();
		}
		else if(choice1 == 6 && choice2 == 10){
			UM2MI();
		}
		else if(choice1 == 6 && choice2 == 11){
			UM2FUR();
		}
		else if(choice1 == 6 && choice2 == 12){
			UM2FM();
		}
		else if(choice1 == 6 && choice2 == 13){
			UM2YD();
		}
		else if(choice1 == 6 && choice2 == 14){
			UM2FT();
		}
		else if(choice1 == 6 && choice2 == 15){
			UM2IN();
		}
		else if(choice1 == 6 && choice2 == 16){
			UM2GONGLI();
		}
		else if(choice1 == 6 && choice2 == 17){
			UM2LI();
		}
		else if(choice1 == 6 && choice2 == 18){
			UM2ZHANG();
		}
		else if(choice1 == 6 && choice2 == 19){
			UM2CHI();
		}
		else if(choice1 == 6 && choice2 == 20){
			UM2CUN();
		}
		else if(choice1 == 6 && choice2 == 21){
			UM2FEN();
		}
		else if(choice1 == 6 && choice2 == 22){
			UM2LII();
		}
		else if(choice1 == 6 && choice2 == 23){
			UM2HAO();
		}
		else if(choice1 == 6 && choice2 == 24){
			UM2PC();
		}
		else if(choice1 == 6 && choice2 == 25){
			UM2LD();
		}
		else if(choice1 == 6 && choice2 == 26){
			UM2ASTRO();
		}
		else if(choice1 == 6 && choice2 == 27){
			UM2LY();
		}
		//``````````````````````````````````````````````````
		//--------------NM Conversion Choices------------------//
		if(choice1 == 7 && choice2 == 1){
			NM2KM();
		}
		else if(choice1 == 7 && choice2 == 2){
			NM2M();
		}
		else if(choice1 == 7 && choice2 == 3){
			NM2DM();
		}
		else if(choice1 == 7 && choice2 == 4){
			NM2CM();
		}
		else if(choice1 == 7 && choice2 == 5){
			NM2MM();
		}
		else if(choice1 == 7 && choice2 == 6){
			NM2UM();
		}
		else if(choice1 == 7 && choice2 == 7){
			NM2NM();
		}
		else if(choice1 == 7 && choice2 == 8){
			NM2PM();
		}
		else if(choice1 == 7 && choice2 == 9){
			NM2NMI();
		}
		else if(choice1 == 7 && choice2 == 10){
			NM2MI();
		}
		else if(choice1 == 7 && choice2 == 11){
			NM2FUR();
		}
		else if(choice1 == 7 && choice2 == 12){
			NM2FM();
		}
		else if(choice1 == 7 && choice2 == 13){
			NM2YD();
		}
		else if(choice1 == 7 && choice2 == 14){
			NM2FT();
		}
		else if(choice1 == 7 && choice2 == 15){
			NM2IN();
		}
		else if(choice1 == 7 && choice2 == 16){
			NM2GONGLI();
		}
		else if(choice1 == 7 && choice2 == 17){
			NM2LI();
		}
		else if(choice1 == 7 && choice2 == 18){
			NM2ZHANG();
		}
		else if(choice1 == 7 && choice2 == 19){
			NM2CHI();
		}
		else if(choice1 == 7 && choice2 == 20){
			NM2CUN();
		}
		else if(choice1 == 7 && choice2 == 21){
			NM2FEN();
		}
		else if(choice1 == 7 && choice2 == 22){
			NM2LII();
		}
		else if(choice1 == 7 && choice2 == 23){
			NM2HAO();
		}
		else if(choice1 == 7 && choice2 == 24){
			NM2PC();
		}
		else if(choice1 == 7 && choice2 == 25){
			NM2LD();
		}
		else if(choice1 == 7 && choice2 == 26){
			NM2ASTRO();
		}
		else if(choice1 == 7 && choice2 == 27){
			NM2LY();
		}
		//``````````````````````````````````````````````````
		//--------------PM Conversion Choices------------------//
		if(choice1 == 8 && choice2 == 1){
			PM2KM();
		}
		else if(choice1 == 8 && choice2 == 2){
			PM2M();
		}
		else if(choice1 == 8 && choice2 == 3){
			PM2DM();
		}
		else if(choice1 == 8 && choice2 == 4){
			PM2CM();
		}
		else if(choice1 == 8 && choice2 == 5){
			PM2MM();
		}
		else if(choice1 == 8 && choice2 == 6){
			PM2UM();
		}
		else if(choice1 == 8 && choice2 == 7){
			PM2NM();
		}
		else if(choice1 == 8 && choice2 == 8){
			PM2PM();
		}
		else if(choice1 == 8 && choice2 == 9){
			PM2NMI();
		}
		else if(choice1 == 8 && choice2 == 10){
			PM2MI();
		}
		else if(choice1 == 8 && choice2 == 11){
			PM2FUR();
		}
		else if(choice1 == 8 && choice2 == 12){
			PM2FM();
		}
		else if(choice1 == 8 && choice2 == 13){
			PM2YD();
		}
		else if(choice1 == 8 && choice2 == 14){
			PM2FT();
		}
		else if(choice1 == 8 && choice2 == 15){
			PM2IN();
		}
		else if(choice1 == 8 && choice2 == 16){
			PM2GONGLI();
		}
		else if(choice1 == 8 && choice2 == 17){
			PM2LI();
		}
		else if(choice1 == 8 && choice2 == 18){
			PM2ZHANG();
		}
		else if(choice1 == 8 && choice2 == 19){
			PM2CHI();
		}
		else if(choice1 == 8 && choice2 == 20){
			PM2CUN();
		}
		else if(choice1 == 8 && choice2 == 21){
			PM2FEN();
		}
		else if(choice1 == 8 && choice2 == 22){
			PM2LII();
		}
		else if(choice1 == 8 && choice2 == 23){
			PM2HAO();
		}
		else if(choice1 == 8 && choice2 == 24){
			PM2PC();
		}
		else if(choice1 == 8 && choice2 == 25){
			PM2LD();
		}
		else if(choice1 == 8 && choice2 == 26){
			PM2ASTRO();
		}
		else if(choice1 == 8 && choice2 == 27){
			PM2LY();
		}
		//``````````````````````````````````````````````````
		//--------------NMI Conversion Choices------------------//
		if(choice1 == 9 && choice2 == 1){
			NMI2KM();
		}
		else if(choice1 == 9 && choice2 == 2){
			NMI2M();
		}
		else if(choice1 == 9 && choice2 == 3){
			NMI2DM();
		}
		else if(choice1 == 9 && choice2 == 4){
			NMI2CM();
		}
		else if(choice1 == 9 && choice2 == 5){
			NMI2MM();
		}
		else if(choice1 == 9 && choice2 == 6){
			NMI2UM();
		}
		else if(choice1 == 9 && choice2 == 7){
			NMI2NM();
		}
		else if(choice1 == 9 && choice2 == 8){
			NMI2PM();
		}
		else if(choice1 == 9 && choice2 == 9){
			NMI2NMI();
		}
		else if(choice1 == 9 && choice2 == 10){
			NMI2MI();
		}
		else if(choice1 == 9 && choice2 == 11){
			NMI2FUR();
		}
		else if(choice1 == 9 && choice2 == 12){
			NMI2FM();
		}
		else if(choice1 == 9 && choice2 == 13){
			NMI2YD();
		}
		else if(choice1 == 9 && choice2 == 14){
			NMI2FT();
		}
		else if(choice1 == 9 && choice2 == 15){
			NMI2IN();
		}
		else if(choice1 == 9 && choice2 == 16){
			NMI2GONGLI();
		}
		else if(choice1 == 9 && choice2 == 17){
			NMI2LI();
		}
		else if(choice1 == 9 && choice2 == 18){
			NMI2ZHANG();
		}
		else if(choice1 == 9 && choice2 == 19){
			NMI2CHI();
		}
		else if(choice1 == 9 && choice2 == 20){
			NMI2CUN();
		}
		else if(choice1 == 9 && choice2 == 21){
			NMI2FEN();
		}
		else if(choice1 == 9 && choice2 == 22){
			NMI2LII();
		}
		else if(choice1 == 9 && choice2 == 23){
			NMI2HAO();
		}
		else if(choice1 == 9 && choice2 == 24){
			NMI2PC();
		}
		else if(choice1 == 9 && choice2 == 25){
			NMI2LD();
		}
		else if(choice1 == 9 && choice2 == 26){
			NMI2ASTRO();
		}
		else if(choice1 == 9 && choice2 == 27){
			NMI2LY();
		}
		//``````````````````````````````````````````````````
		//--------------MI Conversion Choices------------------//
		if(choice1 == 10 && choice2 == 1){
			MI2KM();
		}
		else if(choice1 == 10 && choice2 == 2){
			MI2M();
		}
		else if(choice1 == 10 && choice2 == 3){
			MI2DM();
		}
		else if(choice1 == 10 && choice2 == 4){
			MI2CM();
		}
		else if(choice1 == 10 && choice2 == 5){
			MI2MM();
		}
		else if(choice1 == 10 && choice2 == 6){
			MI2UM();
		}
		else if(choice1 == 10 && choice2 == 7){
			MI2NM();
		}
		else if(choice1 == 10 && choice2 == 8){
			MI2PM();
		}
		else if(choice1 == 10 && choice2 == 9){
			MI2NMI();
		}
		else if(choice1 == 10 && choice2 == 10){
			MI2MI();
		}
		else if(choice1 == 10 && choice2 == 11){
			MI2FUR();
		}
		else if(choice1 == 10 && choice2 == 12){
			MI2FM();
		}
		else if(choice1 == 10 && choice2 == 13){
			MI2YD();
		}
		else if(choice1 == 10 && choice2 == 14){
			MI2FT();
		}
		else if(choice1 == 10 && choice2 == 15){
			MI2IN();
		}
		else if(choice1 == 10 && choice2 == 16){
			MI2GONGLI();
		}
		else if(choice1 == 10 && choice2 == 17){
			MI2LI();
		}
		else if(choice1 == 10 && choice2 == 18){
			MI2ZHANG();
		}
		else if(choice1 == 10 && choice2 == 19){
			MI2CHI();
		}
		else if(choice1 == 10 && choice2 == 20){
			MI2CUN();
		}
		else if(choice1 == 10 && choice2 == 21){
			MI2FEN();
		}
		else if(choice1 == 10 && choice2 == 22){
			MI2LII();
		}
		else if(choice1 == 10 && choice2 == 23){
			MI2HAO();
		}
		else if(choice1 == 10 && choice2 == 24){
			MI2PC();
		}
		else if(choice1 == 10 && choice2 == 25){
			MI2LD();
		}
		else if(choice1 == 10 && choice2 == 26){
			MI2ASTRO();
		}
		else if(choice1 == 10 && choice2 == 27){
			MI2LY();
		}
		//``````````````````````````````````````````````````
		//--------------FUR Conversion Choices------------------//
		if(choice1 == 11 && choice2 == 1){
			FUR2KM();
		}
		else if(choice1 == 11 && choice2 == 2){
			FUR2M();
		}
		else if(choice1 == 11 && choice2 == 3){
			FUR2DM();
		}
		else if(choice1 == 11 && choice2 == 4){
			FUR2CM();
		}
		else if(choice1 == 11 && choice2 == 5){
			FUR2MM();
		}
		else if(choice1 == 11 && choice2 == 6){
			FUR2UM();
		}
		else if(choice1 == 11 && choice2 == 7){
			FUR2NM();
		}
		else if(choice1 == 11 && choice2 == 8){
			FUR2PM();
		}
		else if(choice1 == 11 && choice2 == 9){
			FUR2NMI();
		}
		else if(choice1 == 11 && choice2 == 10){
			FUR2MI();
		}
		else if(choice1 == 11 && choice2 == 11){
			FUR2FUR();
		}
		else if(choice1 == 11 && choice2 == 12){
			FUR2FM();
		}
		else if(choice1 == 11 && choice2 == 13){
			FUR2YD();
		}
		else if(choice1 == 11 && choice2 == 14){
			FUR2FT();
		}
		else if(choice1 == 11 && choice2 == 15){
			FUR2IN();
		}
		else if(choice1 == 11 && choice2 == 16){
			FUR2GONGLI();
		}
		else if(choice1 == 11 && choice2 == 17){
			FUR2LI();
		}
		else if(choice1 == 11 && choice2 == 18){
			FUR2ZHANG();
		}
		else if(choice1 == 11 && choice2 == 19){
			FUR2CHI();
		}
		else if(choice1 == 11 && choice2 == 20){
			FUR2CUN();
		}
		else if(choice1 == 11 && choice2 == 21){
			FUR2FEN();
		}
		else if(choice1 == 11 && choice2 == 22){
			FUR2LII();
		}
		else if(choice1 == 11 && choice2 == 23){
			FUR2HAO();
		}
		else if(choice1 == 11 && choice2 == 24){
			FUR2PC();
		}
		else if(choice1 == 11 && choice2 == 25){
			FUR2LD();
		}
		else if(choice1 == 11 && choice2 == 26){
			FUR2ASTRO();
		}
		else if(choice1 == 11 && choice2 == 27){
			FUR2LY();
		}
		//``````````````````````````````````````````````````
		//--------------FM Conversion Choices------------------//
		if(choice1 == 12 && choice2 == 1){
			FM2KM();
		}
		else if(choice1 == 12 && choice2 == 2){
			FM2M();
		}
		else if(choice1 == 12 && choice2 == 3){
			FM2DM();
		}
		else if(choice1 == 12 && choice2 == 4){
			FM2CM();
		}
		else if(choice1 == 12 && choice2 == 5){
			FM2MM();
		}
		else if(choice1 == 12 && choice2 == 6){
			FM2UM();
		}
		else if(choice1 == 12 && choice2 == 7){
			FM2NM();
		}
		else if(choice1 == 12 && choice2 == 8){
			FM2PM();
		}
		else if(choice1 == 12 && choice2 == 9){
			FM2NMI();
		}
		else if(choice1 == 12 && choice2 == 10){
			FM2MI();
		}
		else if(choice1 == 12 && choice2 == 11){
			FM2FUR();
		}
		else if(choice1 == 12 && choice2 == 12){
			FM2FM();
		}
		else if(choice1 == 12 && choice2 == 13){
			FM2YD();
		}
		else if(choice1 == 12 && choice2 == 14){
			FM2FT();
		}
		else if(choice1 == 12 && choice2 == 15){
			FM2IN();
		}
		else if(choice1 == 12 && choice2 == 16){
			FM2GONGLI();
		}
		else if(choice1 == 12 && choice2 == 17){
			FM2LI();
		}
		else if(choice1 == 12 && choice2 == 18){
			FM2ZHANG();
		}
		else if(choice1 == 12 && choice2 == 19){
			FM2CHI();
		}
		else if(choice1 == 12 && choice2 == 20){
			FM2CUN();
		}
		else if(choice1 == 12 && choice2 == 21){
			FM2FEN();
		}
		else if(choice1 == 12 && choice2 == 22){
			FM2LII();
		}
		else if(choice1 == 12 && choice2 == 23){
			FM2HAO();
		}
		else if(choice1 == 12 && choice2 == 24){
			FM2PC();
		}
		else if(choice1 == 12 && choice2 == 25){
			FM2LD();
		}
		else if(choice1 == 12 && choice2 == 26){
			FM2ASTRO();
		}
		else if(choice1 == 12 && choice2 == 27){
			FM2LY();
		}
		//``````````````````````````````````````````````````
		//--------------YD Conversion Choices------------------//
		if(choice1 == 13 && choice2 == 1){
			YD2KM();
		}
		else if(choice1 == 13 && choice2 == 2){
			YD2M();
		}
		else if(choice1 == 13 && choice2 == 3){
			YD2DM();
		}
		else if(choice1 == 13 && choice2 == 4){
			YD2CM();
		}
		else if(choice1 == 13 && choice2 == 5){
			YD2MM();
		}
		else if(choice1 == 13 && choice2 == 6){
			YD2UM();
		}
		else if(choice1 == 13 && choice2 == 7){
			YD2NM();
		}
		else if(choice1 == 13 && choice2 == 8){
			YD2PM();
		}
		else if(choice1 == 13 && choice2 == 9){
			YD2NMI();
		}
		else if(choice1 == 13 && choice2 == 10){
			YD2MI();
		}
		else if(choice1 == 13 && choice2 == 11){
			YD2FUR();
		}
		else if(choice1 == 13 && choice2 == 12){
			YD2FM();
		}
		else if(choice1 == 13 && choice2 == 13){
			YD2YD();
		}
		else if(choice1 == 13 && choice2 == 14){
			YD2FT();
		}
		else if(choice1 == 13 && choice2 == 15){
			YD2IN();
		}
		else if(choice1 == 13 && choice2 == 16){
			YD2GONGLI();
		}
		else if(choice1 == 13 && choice2 == 17){
			YD2LI();
		}
		else if(choice1 == 13 && choice2 == 18){
			YD2ZHANG();
		}
		else if(choice1 == 13 && choice2 == 19){
			YD2CHI();
		}
		else if(choice1 == 13 && choice2 == 20){
			YD2CUN();
		}
		else if(choice1 == 13 && choice2 == 21){
			YD2FEN();
		}
		else if(choice1 == 13 && choice2 == 22){
			YD2LII();
		}
		else if(choice1 == 13 && choice2 == 23){
			YD2HAO();
		}
		else if(choice1 == 13 && choice2 == 24){
			YD2PC();
		}
		else if(choice1 == 13 && choice2 == 25){
			YD2LD();
		}
		else if(choice1 == 13 && choice2 == 26){
			YD2ASTRO();
		}
		else if(choice1 == 13 && choice2 == 27){
			YD2LY();
		}
		//``````````````````````````````````````````````````
		//--------------FT Conversion Choices------------------//
		if(choice1 == 14 && choice2 == 1){
			FT2KM();
		}
		else if(choice1 == 14 && choice2 == 2){
			FT2M();
		}
		else if(choice1 == 14 && choice2 == 3){
			FT2DM();
		}
		else if(choice1 == 14 && choice2 == 4){
			FT2CM();
		}
		else if(choice1 == 14 && choice2 == 5){
			FT2MM();
		}
		else if(choice1 == 14 && choice2 == 6){
			FT2UM();
		}
		else if(choice1 == 14 && choice2 == 7){
			FT2NM();
		}
		else if(choice1 == 14 && choice2 == 8){
			FT2PM();
		}
		else if(choice1 == 14 && choice2 == 9){
			FT2NMI();
		}
		else if(choice1 == 14 && choice2 == 10){
			FT2MI();
		}
		else if(choice1 == 14 && choice2 == 11){
			FT2FUR();
		}
		else if(choice1 == 14 && choice2 == 12){
			FT2FM();
		}
		else if(choice1 == 14 && choice2 == 13){
			FT2YD();
		}
		else if(choice1 == 14 && choice2 == 14){
			FT2FT();
		}
		else if(choice1 == 14 && choice2 == 15){
			FT2IN();
		}
		else if(choice1 == 14 && choice2 == 16){
			FT2GONGLI();
		}
		else if(choice1 == 14 && choice2 == 17){
			FT2LI();
		}
		else if(choice1 == 14 && choice2 == 18){
			FT2ZHANG();
		}
		else if(choice1 == 14 && choice2 == 19){
			FT2CHI();
		}
		else if(choice1 == 14 && choice2 == 20){
			FT2CUN();
		}
		else if(choice1 == 14 && choice2 == 21){
			FT2FEN();
		}
		else if(choice1 == 14 && choice2 == 22){
			FT2LII();
		}
		else if(choice1 == 14 && choice2 == 23){
			FT2HAO();
		}
		else if(choice1 == 14 && choice2 == 24){
			FT2PC();
		}
		else if(choice1 == 14 && choice2 == 25){
			FT2LD();
		}
		else if(choice1 == 14 && choice2 == 26){
			FT2ASTRO();
		}
		else if(choice1 == 14 && choice2 == 27){
			FT2LY();
		}
		//``````````````````````````````````````````````````
		//--------------IN Conversion Choices------------------//
		if(choice1 == 15 && choice2 == 1){
			IN2KM();
		}
		else if(choice1 == 15 && choice2 == 2){
			IN2M();
		}
		else if(choice1 == 15 && choice2 == 3){
			IN2DM();
		}
		else if(choice1 == 15 && choice2 == 4){
			IN2CM();
		}
		else if(choice1 == 15 && choice2 == 5){
			IN2MM();
		}
		else if(choice1 == 15 && choice2 == 6){
			IN2UM();
		}
		else if(choice1 == 15 && choice2 == 7){
			IN2NM();
		}
		else if(choice1 == 15 && choice2 == 8){
			IN2PM();
		}
		else if(choice1 == 15 && choice2 == 9){
			IN2NMI();
		}
		else if(choice1 == 15 && choice2 == 10){
			IN2MI();
		}
		else if(choice1 == 15 && choice2 == 11){
			IN2FUR();
		}
		else if(choice1 == 15 && choice2 == 12){
			IN2FM();
		}
		else if(choice1 == 15 && choice2 == 13){
			IN2YD();
		}
		else if(choice1 == 15 && choice2 == 14){
			IN2FT();
		}
		else if(choice1 == 15 && choice2 == 15){
			IN2IN();
		}
		else if(choice1 == 15 && choice2 == 16){
			IN2GONGLI();
		}
		else if(choice1 == 15 && choice2 == 17){
			IN2LI();
		}
		else if(choice1 == 15 && choice2 == 18){
			IN2ZHANG();
		}
		else if(choice1 == 15 && choice2 == 19){
			IN2CHI();
		}
		else if(choice1 == 15 && choice2 == 20){
			IN2CUN();
		}
		else if(choice1 == 15 && choice2 == 21){
			IN2FEN();
		}
		else if(choice1 == 15 && choice2 == 22){
			IN2LII();
		}
		else if(choice1 == 15 && choice2 == 23){
			IN2HAO();
		}
		else if(choice1 == 15 && choice2 == 24){
			IN2PC();
		}
		else if(choice1 == 15 && choice2 == 25){
			IN2LD();
		}
		else if(choice1 == 15 && choice2 == 26){
			IN2ASTRO();
		}
		else if(choice1 == 15 && choice2 == 27){
			IN2LY();
		}
		//``````````````````````````````````````````````````
		//--------------GONGLI Conversion Choices------------------//
		if(choice1 == 16 && choice2 == 1){
			GONGLI2KM();
		}
		else if(choice1 == 16 && choice2 == 2){
			GONGLI2M();
		}
		else if(choice1 == 16 && choice2 == 3){
			GONGLI2DM();
		}
		else if(choice1 == 16 && choice2 == 4){
			GONGLI2CM();
		}
		else if(choice1 == 16 && choice2 == 5){
			GONGLI2MM();
		}
		else if(choice1 == 16 && choice2 == 6){
			GONGLI2UM();
		}
		else if(choice1 == 16 && choice2 == 7){
			GONGLI2NM();
		}
		else if(choice1 == 16 && choice2 == 8){
			GONGLI2PM();
		}
		else if(choice1 == 16 && choice2 == 9){
			GONGLI2NMI();
		}
		else if(choice1 == 16 && choice2 == 10){
			GONGLI2MI();
		}
		else if(choice1 == 16 && choice2 == 11){
			GONGLI2FUR();
		}
		else if(choice1 == 16 && choice2 == 12){
			GONGLI2FM();
		}
		else if(choice1 == 16 && choice2 == 13){
			GONGLI2YD();
		}
		else if(choice1 == 16 && choice2 == 14){
			GONGLI2FT();
		}
		else if(choice1 == 16 && choice2 == 15){
			GONGLI2IN();
		}
		else if(choice1 == 16 && choice2 == 16){
			GONGLI2GONGLI();
		}
		else if(choice1 == 16 && choice2 == 17){
			GONGLI2LI();
		}
		else if(choice1 == 16 && choice2 == 18){
			GONGLI2ZHANG();
		}
		else if(choice1 == 16 && choice2 == 19){
			GONGLI2CHI();
		}
		else if(choice1 == 16 && choice2 == 20){
			GONGLI2CUN();
		}
		else if(choice1 == 16 && choice2 == 21){
			GONGLI2FEN();
		}
		else if(choice1 == 16 && choice2 == 22){
			GONGLI2LII();
		}
		else if(choice1 == 16 && choice2 == 23){
			GONGLI2HAO();
		}
		else if(choice1 == 16 && choice2 == 24){
			GONGLI2PC();
		}
		else if(choice1 == 16 && choice2 == 25){
			GONGLI2LD();
		}
		else if(choice1 == 16 && choice2 == 26){
			GONGLI2ASTRO();
		}
		else if(choice1 == 16 && choice2 == 27){
			GONGLI2LY();
		}
		//``````````````````````````````````````````````````
		//--------------LI Conversion Choices------------------//
		if(choice1 == 17 && choice2 == 1){
			LI2KM();
		}
		else if(choice1 == 17 && choice2 == 2){
			LI2M();
		}
		else if(choice1 == 17 && choice2 == 3){
			LI2DM();
		}
		else if(choice1 == 17 && choice2 == 4){
			LI2CM();
		}
		else if(choice1 == 17 && choice2 == 5){
			LI2MM();
		}
		else if(choice1 == 17 && choice2 == 6){
			LI2UM();
		}
		else if(choice1 == 17 && choice2 == 7){
			LI2NM();
		}
		else if(choice1 == 17 && choice2 == 8){
			LI2PM();
		}
		else if(choice1 == 17 && choice2 == 9){
			LI2NMI();
		}
		else if(choice1 == 17 && choice2 == 10){
			LI2MI();
		}
		else if(choice1 == 17 && choice2 == 11){
			LI2FUR();
		}
		else if(choice1 == 17 && choice2 == 12){
			LI2FM();
		}
		else if(choice1 == 17 && choice2 == 13){
			LI2YD();
		}
		else if(choice1 == 17 && choice2 == 14){
			LI2FT();
		}
		else if(choice1 == 17 && choice2 == 15){
			LI2IN();
		}
		else if(choice1 == 17 && choice2 == 16){
			LI2GONGLI();
		}
		else if(choice1 == 17 && choice2 == 17){
			LI2LI();
		}
		else if(choice1 == 17 && choice2 == 18){
			LI2ZHANG();
		}
		else if(choice1 == 17 && choice2 == 19){
			LI2CHI();
		}
		else if(choice1 == 17 && choice2 == 20){
			LI2CUN();
		}
		else if(choice1 == 17 && choice2 == 21){
			LI2FEN();
		}
		else if(choice1 == 17 && choice2 == 22){
			LI2LII();
		}
		else if(choice1 == 17 && choice2 == 23){
			LI2HAO();
		}
		else if(choice1 == 17 && choice2 == 24){
			LI2PC();
		}
		else if(choice1 == 17 && choice2 == 25){
			LI2LD();
		}
		else if(choice1 == 17 && choice2 == 26){
			LI2ASTRO();
		}
		else if(choice1 == 17 && choice2 == 27){
			LI2LY();
		}
		//``````````````````````````````````````````````````
		//--------------Zhang Conversion Choices------------------//
		if(choice1 == 18 && choice2 == 1){
			ZHANG2KM();
		}
		else if(choice1 == 18 && choice2 == 2){
			ZHANG2M();
		}
		else if(choice1 == 18 && choice2 == 3){
			ZHANG2DM();
		}
		else if(choice1 == 18 && choice2 == 4){
			ZHANG2CM();
		}
		else if(choice1 == 18 && choice2 == 5){
			ZHANG2MM();
		}
		else if(choice1 == 18 && choice2 == 6){
			ZHANG2UM();
		}
		else if(choice1 == 18 && choice2 == 7){
			ZHANG2NM();
		}
		else if(choice1 == 18 && choice2 == 8){
			ZHANG2PM();
		}
		else if(choice1 == 18 && choice2 == 9){
			ZHANG2NMI();
		}
		else if(choice1 == 18 && choice2 == 10){
			ZHANG2MI();
		}
		else if(choice1 == 18 && choice2 == 11){
			ZHANG2FUR();
		}
		else if(choice1 == 18 && choice2 == 12){
			ZHANG2FM();
		}
		else if(choice1 == 18 && choice2 == 13){
			ZHANG2YD();
		}
		else if(choice1 == 18 && choice2 == 14){
			ZHANG2FT();
		}
		else if(choice1 == 18 && choice2 == 15){
			ZHANG2IN();
		}
		else if(choice1 == 18 && choice2 == 16){
			ZHANG2GONGLI();
		}
		else if(choice1 == 18 && choice2 == 17){
			ZHANG2LI();
		}
		else if(choice1 == 18 && choice2 == 18){
			ZHANG2ZHANG();
		}
		else if(choice1 == 18 && choice2 == 19){
			ZHANG2CHI();
		}
		else if(choice1 == 18 && choice2 == 20){
			ZHANG2CUN();
		}
		else if(choice1 == 18 && choice2 == 21){
			ZHANG2FEN();
		}
		else if(choice1 == 18 && choice2 == 22){
			ZHANG2LII();
		}
		else if(choice1 == 18 && choice2 == 23){
			ZHANG2HAO();
		}
		else if(choice1 == 18 && choice2 == 24){
			ZHANG2PC();
		}
		else if(choice1 == 18 && choice2 == 25){
			ZHANG2LD();
		}
		else if(choice1 == 18 && choice2 == 26){
			ZHANG2ASTRO();
		}
		else if(choice1 == 18 && choice2 == 27){
			ZHANG2LY();
		}
		//``````````````````````````````````````````````````
		//--------------Chi Conversion Choices------------------//
		if(choice1 == 19 && choice2 == 1){
			CHI2KM();
		}
		else if(choice1 == 19 && choice2 == 2){
			CHI2M();
		}
		else if(choice1 == 19 && choice2 == 3){
			CHI2DM();
		}
		else if(choice1 == 19 && choice2 == 4){
			CHI2CM();
		}
		else if(choice1 == 19 && choice2 == 5){
			CHI2MM();
		}
		else if(choice1 == 19 && choice2 == 6){
			CHI2UM();
		}
		else if(choice1 == 19 && choice2 == 7){
			CHI2NM();
		}
		else if(choice1 == 19 && choice2 == 8){
			CHI2PM();
		}
		else if(choice1 == 19 && choice2 == 9){
			CHI2NMI();
		}
		else if(choice1 == 19 && choice2 == 10){
			CHI2MI();
		}
		else if(choice1 == 19 && choice2 == 11){
			CHI2FUR();
		}
		else if(choice1 == 19 && choice2 == 12){
			CHI2FM();
		}
		else if(choice1 == 19 && choice2 == 13){
			CHI2YD();
		}
		else if(choice1 == 19 && choice2 == 14){
			CHI2FT();
		}
		else if(choice1 == 19 && choice2 == 15){
			CHI2IN();
		}
		else if(choice1 == 19 && choice2 == 16){
			CHI2GONGLI();
		}
		else if(choice1 == 19 && choice2 == 17){
			CHI2LI();
		}
		else if(choice1 == 19 && choice2 == 18){
			CHI2ZHANG();
		}
		else if(choice1 == 19 && choice2 == 19){
			CHI2CHI();
		}
		else if(choice1 == 19 && choice2 == 20){
			CHI2CUN();
		}
		else if(choice1 == 19 && choice2 == 21){
			CHI2FEN();
		}
		else if(choice1 == 19 && choice2 == 22){
			CHI2LII();
		}
		else if(choice1 == 19 && choice2 == 23){
			CHI2HAO();
		}
		else if(choice1 == 19 && choice2 == 24){
			CHI2PC();
		}
		else if(choice1 == 19 && choice2 == 25){
			CHI2LD();
		}
		else if(choice1 == 19 && choice2 == 26){
			CHI2ASTRO();
		}
		else if(choice1 == 19 && choice2 == 27){
			CHI2LY();
		}
		//``````````````````````````````````````````````````
		//--------------CUN Conversion Choices------------------//
		if(choice1 == 20 && choice2 == 1){
			CUN2KM();
		}
		else if(choice1 == 20 && choice2 == 2){
			CUN2M();
		}
		else if(choice1 == 20 && choice2 == 3){
			CUN2DM();
		}
		else if(choice1 == 20 && choice2 == 4){
			CUN2CM();
		}
		else if(choice1 == 20 && choice2 == 5){
			CUN2MM();
		}
		else if(choice1 == 20 && choice2 == 6){
			CUN2UM();
		}
		else if(choice1 == 20 && choice2 == 7){
			CUN2NM();
		}
		else if(choice1 == 20 && choice2 == 8){
			CUN2PM();
		}
		else if(choice1 == 20 && choice2 == 9){
			CUN2NMI();
		}
		else if(choice1 == 20 && choice2 == 10){
			CUN2MI();
		}
		else if(choice1 == 20 && choice2 == 11){
			CUN2FUR();
		}
		else if(choice1 == 20 && choice2 == 12){
			CUN2FM();
		}
		else if(choice1 == 20 && choice2 == 13){
			CUN2YD();
		}
		else if(choice1 == 20 && choice2 == 14){
			CUN2FT();
		}
		else if(choice1 == 20 && choice2 == 15){
			CUN2IN();
		}
		else if(choice1 == 20 && choice2 == 16){
			CUN2GONGLI();
		}
		else if(choice1 == 20 && choice2 == 17){
			CUN2LI();
		}
		else if(choice1 == 20 && choice2 == 18){
			CUN2ZHANG();
		}
		else if(choice1 == 20 && choice2 == 19){
			CUN2CHI();
		}
		else if(choice1 == 20 && choice2 == 20){
			CUN2CUN();
		}
		else if(choice1 == 20 && choice2 == 21){
			CUN2FEN();
		}
		else if(choice1 == 20 && choice2 == 22){
			CUN2LII();
		}
		else if(choice1 == 20 && choice2 == 23){
			CUN2HAO();
		}
		else if(choice1 == 20 && choice2 == 24){
			CUN2PC();
		}
		else if(choice1 == 20 && choice2 == 25){
			CUN2LD();
		}
		else if(choice1 == 20 && choice2 == 26){
			CUN2ASTRO();
		}
		else if(choice1 == 20 && choice2 == 27){
			CUN2LY();
		}
		//``````````````````````````````````````````````````
		//--------------FEN Conversion Choices------------------//
		if(choice1 == 21 && choice2 == 1){
			FEN2KM();
		}
		else if(choice1 == 21 && choice2 == 2){
			FEN2M();
		}
		else if(choice1 == 21 && choice2 == 3){
			FEN2DM();
		}
		else if(choice1 == 21 && choice2 == 4){
			FEN2CM();
		}
		else if(choice1 == 21 && choice2 == 5){
			FEN2MM();
		}
		else if(choice1 == 21 && choice2 == 6){
			FEN2UM();
		}
		else if(choice1 == 21 && choice2 == 7){
			FEN2NM();
		}
		else if(choice1 == 21 && choice2 == 8){
			FEN2PM();
		}
		else if(choice1 == 21 && choice2 == 9){
			FEN2NMI();
		}
		else if(choice1 == 21 && choice2 == 10){
			FEN2MI();
		}
		else if(choice1 == 21 && choice2 == 11){
			FEN2FUR();
		}
		else if(choice1 == 21 && choice2 == 12){
			FEN2FM();
		}
		else if(choice1 == 21 && choice2 == 13){
			FEN2YD();
		}
		else if(choice1 == 21 && choice2 == 14){
			FEN2FT();
		}
		else if(choice1 == 21 && choice2 == 15){
			FEN2IN();
		}
		else if(choice1 == 21 && choice2 == 16){
			FEN2GONGLI();
		}
		else if(choice1 == 21 && choice2 == 17){
			FEN2LI();
		}
		else if(choice1 == 21 && choice2 == 18){
			FEN2ZHANG();
		}
		else if(choice1 == 21 && choice2 == 19){
			FEN2CHI();
		}
		else if(choice1 == 21 && choice2 == 20){
			FEN2CUN();
		}
		else if(choice1 == 21 && choice2 == 21){
			FEN2FEN();
		}
		else if(choice1 == 21 && choice2 == 22){
			FEN2LII();
		}
		else if(choice1 == 21 && choice2 == 23){
			FEN2HAO();
		}
		else if(choice1 == 21 && choice2 == 24){
			FEN2PC();
		}
		else if(choice1 == 21 && choice2 == 25){
			FEN2LD();
		}
		else if(choice1 == 21 && choice2 == 26){
			FEN2ASTRO();
		}
		else if(choice1 == 21 && choice2 == 27){
			FEN2LY();
		}
		//``````````````````````````````````````````````````
		//--------------LII Conversion Choices------------------//
		if(choice1 == 22 && choice2 == 1){
			LII2KM();
		}
		else if(choice1 == 22 && choice2 == 2){
			LII2M();
		}
		else if(choice1 == 22 && choice2 == 3){
			LII2DM();
		}
		else if(choice1 == 22 && choice2 == 4){
			LII2CM();
		}
		else if(choice1 == 22 && choice2 == 5){
			LII2MM();
		}
		else if(choice1 == 22 && choice2 == 6){
			LII2UM();
		}
		else if(choice1 == 22 && choice2 == 7){
			LII2NM();
		}
		else if(choice1 == 22 && choice2 == 8){
			LII2PM();
		}
		else if(choice1 == 22 && choice2 == 9){
			LII2NMI();
		}
		else if(choice1 == 22 && choice2 == 10){
			LII2MI();
		}
		else if(choice1 == 22 && choice2 == 11){
			LII2FUR();
		}
		else if(choice1 == 22 && choice2 == 12){
			LII2FM();
		}
		else if(choice1 == 22 && choice2 == 13){
			LII2YD();
		}
		else if(choice1 == 22 && choice2 == 14){
			LII2FT();
		}
		else if(choice1 == 22 && choice2 == 15){
			LII2IN();
		}
		else if(choice1 == 22 && choice2 == 16){
			LII2GONGLI();
		}
		else if(choice1 == 22 && choice2 == 17){
			LII2LI();
		}
		else if(choice1 == 22 && choice2 == 18){
			LII2ZHANG();
		}
		else if(choice1 == 22 && choice2 == 19){
			LII2CHI();
		}
		else if(choice1 == 22 && choice2 == 20){
			LII2CUN();
		}
		else if(choice1 == 22 && choice2 == 21){
			LII2FEN();
		}
		else if(choice1 == 22 && choice2 == 22){
			LII2LII();
		}
		else if(choice1 == 22 && choice2 == 23){
			LII2HAO();
		}
		else if(choice1 == 22 && choice2 == 24){
			LII2PC();
		}
		else if(choice1 == 22 && choice2 == 25){
			LII2LD();
		}
		else if(choice1 == 22 && choice2 == 26){
			LII2ASTRO();
		}
		else if(choice1 == 22 && choice2 == 27){
			LII2LY();
		}
		//``````````````````````````````````````````````````
		//--------------HAO Conversion Choices------------------//
		if(choice1 == 23 && choice2 == 1){
			HAO2KM();
		}
		else if(choice1 == 23 && choice2 == 2){
			HAO2M();
		}
		else if(choice1 == 23 && choice2 == 3){
			HAO2DM();
		}
		else if(choice1 == 23 && choice2 == 4){
			HAO2CM();
		}
		else if(choice1 == 23 && choice2 == 5){
			HAO2MM();
		}
		else if(choice1 == 23 && choice2 == 6){
			HAO2UM();
		}
		else if(choice1 == 23 && choice2 == 7){
			HAO2NM();
		}
		else if(choice1 == 23 && choice2 == 8){
			HAO2PM();
		}
		else if(choice1 == 23 && choice2 == 9){
			HAO2NMI();
		}
		else if(choice1 == 23 && choice2 == 10){
			HAO2MI();
		}
		else if(choice1 == 23 && choice2 == 11){
			HAO2FUR();
		}
		else if(choice1 == 23 && choice2 == 12){
			HAO2FM();
		}
		else if(choice1 == 23 && choice2 == 13){
			HAO2YD();
		}
		else if(choice1 == 23 && choice2 == 14){
			HAO2FT();
		}
		else if(choice1 == 23 && choice2 == 15){
			HAO2IN();
		}
		else if(choice1 == 23 && choice2 == 16){
			HAO2GONGLI();
		}
		else if(choice1 == 23 && choice2 == 17){
			HAO2LI();
		}
		else if(choice1 == 23 && choice2 == 18){
			HAO2ZHANG();
		}
		else if(choice1 == 23 && choice2 == 19){
			HAO2CHI();
		}
		else if(choice1 == 23 && choice2 == 20){
			HAO2CUN();
		}
		else if(choice1 == 23 && choice2 == 21){
			HAO2FEN();
		}
		else if(choice1 == 23 && choice2 == 22){
			HAO2LII();
		}
		else if(choice1 == 23 && choice2 == 23){
			HAO2HAO();
		}
		else if(choice1 == 23 && choice2 == 24){
			HAO2PC();
		}
		else if(choice1 == 23 && choice2 == 25){
			HAO2LD();
		}
		else if(choice1 == 23 && choice2 == 26){
			HAO2ASTRO();
		}
		else if(choice1 == 23 && choice2 == 27){
			HAO2LY();
		}
		//``````````````````````````````````````````````````
		//--------------Parsec Conversion Choices------------------//
		if(choice1 == 24 && choice2 == 1){
			PC2KM();
		}
		else if(choice1 == 24 && choice2 == 2){
			PC2M();
		}
		else if(choice1 == 24 && choice2 == 3){
			PC2DM();
		}
		else if(choice1 == 24 && choice2 == 4){
			PC2CM();
		}
		else if(choice1 == 24 && choice2 == 5){
			PC2MM();
		}
		else if(choice1 == 24 && choice2 == 6){
			PC2UM();
		}
		else if(choice1 == 24 && choice2 == 7){
			PC2NM();
		}
		else if(choice1 == 24 && choice2 == 8){
			PC2PM();
		}
		else if(choice1 == 24 && choice2 == 9){
			PC2NMI();
		}
		else if(choice1 == 24 && choice2 == 10){
			PC2MI();
		}
		else if(choice1 == 24 && choice2 == 11){
			PC2FUR();
		}
		else if(choice1 == 24 && choice2 == 12){
			PC2FM();
		}
		else if(choice1 == 24 && choice2 == 13){
			PC2YD();
		}
		else if(choice1 == 24 && choice2 == 14){
			PC2FT();
		}
		else if(choice1 == 24 && choice2 == 15){
			PC2IN();
		}
		else if(choice1 == 24 && choice2 == 16){
			PC2GONGLI();
		}
		else if(choice1 == 24 && choice2 == 17){
			PC2LI();
		}
		else if(choice1 == 24 && choice2 == 18){
			PC2ZHANG();
		}
		else if(choice1 == 24 && choice2 == 19){
			PC2CHI();
		}
		else if(choice1 == 24 && choice2 == 20){
			PC2CUN();
		}
		else if(choice1 == 24 && choice2 == 21){
			PC2FEN();
		}
		else if(choice1 == 24 && choice2 == 22){
			PC2LII();
		}
		else if(choice1 == 24 && choice2 == 23){
			PC2HAO();
		}
		else if(choice1 == 24 && choice2 == 24){
			PC2PC();
		}
		else if(choice1 == 24 && choice2 == 25){
			PC2LD();
		}
		else if(choice1 == 24 && choice2 == 26){
			PC2ASTRO();
		}
		else if(choice1 == 24 && choice2 == 27){
			PC2LY();
		}
		//``````````````````````````````````````````````````
		//--------------Lunar Distance Conversion Choices------------------//
		if(choice1 == 25 && choice2 == 1){
			LD2KM();
		}
		else if(choice1 == 25 && choice2 == 2){
			LD2M();
		}
		else if(choice1 == 25 && choice2 == 3){
			LD2DM();
		}
		else if(choice1 == 25 && choice2 == 4){
			LD2CM();
		}
		else if(choice1 == 25 && choice2 == 5){
			LD2MM();
		}
		else if(choice1 == 25 && choice2 == 6){
			LD2UM();
		}
		else if(choice1 == 25 && choice2 == 7){
			LD2NM();
		}
		else if(choice1 == 25 && choice2 == 8){
			LD2PM();
		}
		else if(choice1 == 25 && choice2 == 9){
			LD2NMI();
		}
		else if(choice1 == 25 && choice2 == 10){
			LD2MI();
		}
		else if(choice1 == 25 && choice2 == 11){
			LD2FUR();
		}
		else if(choice1 == 25 && choice2 == 12){
			LD2FM();
		}
		else if(choice1 == 25 && choice2 == 13){
			LD2YD();
		}
		else if(choice1 == 25 && choice2 == 14){
			LD2FT();
		}
		else if(choice1 == 25 && choice2 == 15){
			LD2IN();
		}
		else if(choice1 == 25 && choice2 == 16){
			LD2GONGLI();
		}
		else if(choice1 == 25 && choice2 == 17){
			LD2LI();
		}
		else if(choice1 == 25 && choice2 == 18){
			LD2ZHANG();
		}
		else if(choice1 == 25 && choice2 == 19){
			LD2CHI();
		}
		else if(choice1 == 25 && choice2 == 20){
			LD2CUN();
		}
		else if(choice1 == 25 && choice2 == 21){
			LD2FEN();
		}
		else if(choice1 == 25 && choice2 == 22){
			LD2LII();
		}
		else if(choice1 == 25 && choice2 == 23){
			LD2HAO();
		}
		else if(choice1 == 25 && choice2 == 24){
			LD2PC();
		}
		else if(choice1 == 25 && choice2 == 25){
			LD2LD();
		}
		else if(choice1 == 25 && choice2 == 26){
			LD2ASTRO();
		}
		else if(choice1 == 25 && choice2 == 27){
			LD2LY();
		}
		//``````````````````````````````````````````````````
		//--------------Astronomical Unit Conversion Choices------------------//
		if(choice1 == 26 && choice2 == 1){
			ASTRO2KM();
		}
		else if(choice1 == 26 && choice2 == 2){
			ASTRO2M();
		}
		else if(choice1 == 26 && choice2 == 3){
			ASTRO2DM();
		}
		else if(choice1 == 26 && choice2 == 4){
			ASTRO2CM();
		}
		else if(choice1 == 26 && choice2 == 5){
			ASTRO2MM();
		}
		else if(choice1 == 26 && choice2 == 6){
			ASTRO2UM();
		}
		else if(choice1 == 26 && choice2 == 7){
			ASTRO2NM();
		}
		else if(choice1 == 26 && choice2 == 8){
			ASTRO2PM();
		}
		else if(choice1 == 26 && choice2 == 9){
			ASTRO2NMI();
		}
		else if(choice1 == 26 && choice2 == 10){
			ASTRO2MI();
		}
		else if(choice1 == 26 && choice2 == 11){
			ASTRO2FUR();
		}
		else if(choice1 == 26 && choice2 == 12){
			ASTRO2FM();
		}
		else if(choice1 == 26 && choice2 == 13){
			ASTRO2YD();
		}
		else if(choice1 == 26 && choice2 == 14){
			ASTRO2FT();
		}
		else if(choice1 == 26 && choice2 == 15){
			ASTRO2IN();
		}
		else if(choice1 == 26 && choice2 == 16){
			ASTRO2GONGLI();
		}
		else if(choice1 == 26 && choice2 == 17){
			ASTRO2LI();
		}
		else if(choice1 == 26 && choice2 == 18){
			ASTRO2ZHANG();
		}
		else if(choice1 == 26 && choice2 == 19){
			ASTRO2CHI();
		}
		else if(choice1 == 26 && choice2 == 20){
			ASTRO2CUN();
		}
		else if(choice1 == 26 && choice2 == 21){
			ASTRO2FEN();
		}
		else if(choice1 == 26 && choice2 == 22){
			ASTRO2LII();
		}
		else if(choice1 == 26 && choice2 == 23){
			ASTRO2HAO();
		}
		else if(choice1 == 26 && choice2 == 24){
			ASTRO2PC();
		}
		else if(choice1 == 26 && choice2 == 25){
			ASTRO2LD();
		}
		else if(choice1 == 26 && choice2 == 26){
			ASTRO2ASTRO();
		}
		else if(choice1 == 26 && choice2 == 27){
			ASTRO2LY();
		}
		//``````````````````````````````````````````````````
		//--------------Light Year Conversion Choices------------------//
		if(choice1 == 27 && choice2 == 1){
			LY2KM();
		}
		else if(choice1 == 27 && choice2 == 2){
			LY2M();
		}
		else if(choice1 == 27 && choice2 == 3){
			LY2DM();
		}
		else if(choice1 == 27 && choice2 == 4){
			LY2CM();
		}
		else if(choice1 == 27 && choice2 == 5){
			LY2MM();
		}
		else if(choice1 == 27 && choice2 == 6){
			LY2UM();
		}
		else if(choice1 == 27 && choice2 == 7){
			LY2NM();
		}
		else if(choice1 == 27 && choice2 == 8){
			LY2PM();
		}
		else if(choice1 == 27 && choice2 == 9){
			LY2NMI();
		}
		else if(choice1 == 27 && choice2 == 10){
			LY2MI();
		}
		else if(choice1 == 27 && choice2 == 11){
			LY2FUR();
		}
		else if(choice1 == 27 && choice2 == 12){
			LY2FM();
		}
		else if(choice1 == 27 && choice2 == 13){
			LY2YD();
		}
		else if(choice1 == 27 && choice2 == 14){
			LY2FT();
		}
		else if(choice1 == 27 && choice2 == 15){
			LY2IN();
		}
		else if(choice1 == 27 && choice2 == 16){
			LY2GONGLI();
		}
		else if(choice1 == 27 && choice2 == 17){
			LY2LI();
		}
		else if(choice1 == 27 && choice2 == 18){
			LY2ZHANG();
		}
		else if(choice1 == 27 && choice2 == 19){
			LY2CHI();
		}
		else if(choice1 == 27 && choice2 == 20){
			LY2CUN();
		}
		else if(choice1 == 27 && choice2 == 21){
			LY2FEN();
		}
		else if(choice1 == 27 && choice2 == 22){
			LY2LII();
		}
		else if(choice1 == 27 && choice2 == 23){
			LY2HAO();
		}
		else if(choice1 == 27 && choice2 == 24){
			LY2PC();
		}
		else if(choice1 == 27 && choice2 == 25){
			LY2LD();
		}
		else if(choice1 == 27 && choice2 == 26){
			LY2ASTRO();
		}
		else if(choice1 == 27 && choice2 == 27){
			LY2LY();
		}
		//``````````````````````````````````````````````````

		outputUnit();
	}

	public static void outputUnit(){
		System.out.println("\n " + unit +" "+units[choice2-1]);
		System.out.println("Press Enter!");
		scn.next();
	}

	//---------------KM Conversions-------------------//
	public static void KM2KM(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void KM2M(){
		unit= unit.multiply(new BigDecimal("1000"));
	}
	public static void KM2DM(){
		unit= unit.multiply(new BigDecimal("10000"));
	}
	public static void KM2CM(){
		unit= unit.multiply(new BigDecimal("100000"));
	}
	public static void KM2MM(){
		unit= unit.multiply(new BigDecimal("1000000"));
	}
	public static void KM2UM(){
		unit= unit.multiply(new BigDecimal("100000000"));
	}
	public static void KM2NM(){
		unit= unit.multiply(new BigDecimal("1000000000000"));
	}
	public static void KM2PM(){
		unit= unit.multiply(new BigDecimal("1000000000000000"));
	}
	public static void KM2NMI(){
		unit= unit.multiply(new BigDecimal("0.539956803"));
	}
	public static void KM2MI(){
		unit= unit.multiply(new BigDecimal("0.621371192"));
	}
	public static void KM2FUR(){
		unit= unit.multiply(new BigDecimal("4.97096954"));
	}
	public static void KM2FM(){
		unit= unit.multiply(new BigDecimal("546.806649"));
	}
	public static void KM2YD(){
		unit= unit.multiply(new BigDecimal("1093.6133"));
	}
	public static void KM2FT(){
		unit= unit.multiply(new BigDecimal("3280.8399"));
	}
	public static void KM2IN(){
		unit= unit.multiply(new BigDecimal("39370.0787"));
	}
	public static void KM2GONGLI(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void KM2LI(){
		unit= unit.multiply(new BigDecimal("2"));
	}
	public static void KM2ZHANG(){
		unit= unit.multiply(new BigDecimal("300"));
	}
	public static void KM2CHI(){
		unit= unit.multiply(new BigDecimal("3000"));
	}
	public static void KM2CUN(){
		unit= unit.multiply(new BigDecimal("30000"));
	}
	public static void KM2FEN(){
		unit= unit.multiply(new BigDecimal("300000"));
	}
	public static void KM2LII(){
		unit= unit.multiply(new BigDecimal("3000000"));
	}
	public static void KM2HAO(){
		unit= unit.multiply(new BigDecimal("30000000"));
	}
	public static void KM2PC(){
		unit= unit.multiply(new BigDecimal("0.000000000000032"));
	}
	public static void KM2LD(){
		unit= unit.multiply(new BigDecimal("0.000002604166"));
	}
	public static void KM2ASTRO(){
		unit= unit.multiply(new BigDecimal("0.00000000668458"));
	}
	public static void KM2LY(){
		unit= unit.multiply(new BigDecimal("0.0000000000001057"));
	}
	//``````````````````````````````````````````````````

	//---------------Metre Conversions-------------------//
	public static void M2KM(){
		unit= unit.multiply(new BigDecimal("0.001"));
	}
	public static void M2M(){
		M2KM();
		KM2M();
	}
	public static void M2DM(){
		M2KM();
		KM2DM();
	}
	public static void M2CM(){
		M2KM();
		KM2CM();
	}
	public static void M2MM(){
		M2KM();
		KM2MM();
	}
	public static void M2UM(){
		M2KM();
		KM2UM();
	}
	public static void M2NM(){
		M2KM();
		KM2NM();
	}
	public static void M2PM(){
		M2KM();
		KM2PM();
	}
	public static void M2NMI(){
		M2KM();
		KM2NMI();
	}
	public static void M2MI(){
		M2KM();
		KM2MI();
	}
	public static void M2FUR(){
		M2KM();
		KM2FUR();
	}
	public static void M2FM(){
		M2KM();
		KM2FM();
	}
	public static void M2YD(){
		M2KM();
		KM2YD();
	}
	public static void M2FT(){
		M2KM();
		KM2FT();
	}
	public static void M2IN(){
		M2KM();
		KM2IN();
	}
	public static void M2GONGLI(){
		M2KM();
		KM2GONGLI();
	}
	public static void M2LI(){
		M2KM();
		KM2LI();
	}
	public static void M2ZHANG(){
		M2KM();
		KM2ZHANG();
	}
	public static void M2CHI(){
		M2KM();
		KM2CHI();
	}
	public static void M2CUN(){
		M2KM();
		KM2CUN();
	}
	public static void M2FEN(){
		M2KM();
		KM2FEN();
	}
	public static void M2LII(){
		M2KM();
		KM2LII();
	}
	public static void M2HAO(){
		M2KM();
		KM2HAO();
	}
	public static void M2PC(){
		M2KM();
		KM2PC();
	}
	public static void M2LD(){
		M2KM();
		KM2LD();
	}
	public static void M2ASTRO(){
		M2KM();
		KM2ASTRO();
	}
	public static void M2LY(){
		M2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````

	//---------------Decimetre Conversions-------------------//
	public static void DM2KM(){
		unit= unit.multiply(new BigDecimal("0.0001"));
	}
	public static void DM2M(){
		DM2KM();
		KM2M();
	}
	public static void DM2DM(){
		DM2KM();
		KM2DM();
	}
	public static void DM2CM(){
		DM2KM();
		KM2CM();
	}
	public static void DM2MM(){
		DM2KM();
		KM2MM();
	}
	public static void DM2UM(){
		DM2KM();
		KM2UM();
	}
	public static void DM2NM(){
		DM2KM();
		KM2NM();
	}
	public static void DM2PM(){
		DM2KM();
		KM2PM();
	}
	public static void DM2NMI(){
		DM2KM();
		KM2NMI();
	}
	public static void DM2MI(){
		DM2KM();
		KM2MI();
	}
	public static void DM2FUR(){
		DM2KM();
		KM2FUR();
	}
	public static void DM2FM(){
		DM2KM();
		KM2FM();
	}
	public static void DM2YD(){
		DM2KM();
		KM2YD();
	}
	public static void DM2FT(){
		DM2KM();
		KM2FT();
	}
	public static void DM2IN(){
		DM2KM();
		KM2IN();
	}
	public static void DM2GONGLI(){
		DM2KM();
		KM2GONGLI();
	}
	public static void DM2LI(){
		DM2KM();
		KM2LI();
	}
	public static void DM2ZHANG(){
		DM2KM();
		KM2ZHANG();
	}
	public static void DM2CHI(){
		DM2KM();
		KM2CHI();
	}
	public static void DM2CUN(){
		DM2KM();
		KM2CUN();
	}
	public static void DM2FEN(){
		DM2KM();
		KM2FEN();
	}
	public static void DM2LII(){
		DM2KM();
		KM2LII();
	}
	public static void DM2HAO(){
		DM2KM();
		KM2HAO();
	}
	public static void DM2PC(){
		DM2KM();
		KM2PC();
	}
	public static void DM2LD(){
		DM2KM();
		KM2LD();
	}
	public static void DM2ASTRO(){
		DM2KM();
		KM2ASTRO();
	}
	public static void DM2LY(){
		DM2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Centimetre Conversions-------------------//
	public static void CM2KM(){
		unit= unit.multiply(new BigDecimal("0.00001"));
	}
	public static void CM2M(){
		CM2KM();
		KM2M();
	}
	public static void CM2DM(){
		CM2KM();
		KM2DM();
	}
	public static void CM2CM(){
		CM2KM();
		KM2CM();
	}
	public static void CM2MM(){
		CM2KM();
		KM2MM();
	}
	public static void CM2UM(){
		CM2KM();
		KM2UM();
	}
	public static void CM2NM(){
		CM2KM();
		KM2NM();
	}
	public static void CM2PM(){
		CM2KM();
		KM2PM();
	}
	public static void CM2NMI(){
		CM2KM();
		KM2NMI();
	}
	public static void CM2MI(){
		CM2KM();
		KM2MI();
	}
	public static void CM2FUR(){
		CM2KM();
		KM2FUR();
	}
	public static void CM2FM(){
		CM2KM();
		KM2FM();
	}
	public static void CM2YD(){
		CM2KM();
		KM2YD();
	}
	public static void CM2FT(){
		CM2KM();
		KM2FT();
	}
	public static void CM2IN(){
		CM2KM();
		KM2IN();
	}
	public static void CM2GONGLI(){
		CM2KM();
		KM2GONGLI();
	}
	public static void CM2LI(){
		CM2KM();
		KM2LI();
	}
	public static void CM2ZHANG(){
		CM2KM();
		KM2ZHANG();
	}
	public static void CM2CHI(){
		CM2KM();
		KM2CHI();
	}
	public static void CM2CUN(){
		CM2KM();
		KM2CUN();
	}
	public static void CM2FEN(){
		CM2KM();
		KM2FEN();
	}
	public static void CM2LII(){
		CM2KM();
		KM2LII();
	}
	public static void CM2HAO(){
		CM2KM();
		KM2HAO();
	}
	public static void CM2PC(){
		CM2KM();
		KM2PC();
	}
	public static void CM2LD(){
		CM2KM();
		KM2LD();
	}
	public static void CM2ASTRO(){
		CM2KM();
		KM2ASTRO();
	}
	public static void CM2LY(){
		CM2KM();
		KM2LY();
	}
	//````````````````````````````````````````````````````````
		

	//---------------Mellimetre Conversions-------------------//
	public static void MM2KM(){
		unit= unit.multiply(new BigDecimal("0.000001"));
	}
	public static void MM2M(){
		MM2KM();
		KM2M();
	}
	public static void MM2DM(){
		MM2KM();
		KM2MM();
	}
	public static void MM2CM(){
		MM2KM();
		KM2CM();
	}
	public static void MM2MM(){
		MM2KM();
		KM2MM();
	}
	public static void MM2UM(){
		MM2KM();
		KM2UM();
	}
	public static void MM2NM(){
		MM2KM();
		KM2NM();
	}
	public static void MM2PM(){
		MM2KM();
		KM2PM();
	}
	public static void MM2NMI(){
		MM2KM();
		KM2NMI();
	}
	public static void MM2MI(){
		MM2KM();
		KM2MI();
	}
	public static void MM2FUR(){
		MM2KM();
		KM2FUR();
	}
	public static void MM2FM(){
		MM2KM();
		KM2FM();
	}
	public static void MM2YD(){
		MM2KM();
		KM2YD();
	}
	public static void MM2FT(){
		MM2KM();
		KM2FT();
	}
	public static void MM2IN(){
		MM2KM();
		KM2IN();
	}
	public static void MM2GONGLI(){
		MM2KM();
		KM2GONGLI();
	}
	public static void MM2LI(){
		MM2KM();
		KM2LI();
	}
	public static void MM2ZHANG(){
		MM2KM();
		KM2ZHANG();
	}
	public static void MM2CHI(){
		MM2KM();
		KM2CHI();
	}
	public static void MM2CUN(){
		MM2KM();
		KM2CUN();
	}
	public static void MM2FEN(){
		MM2KM();
		KM2FEN();
	}
	public static void MM2LII(){
		MM2KM();
		KM2LII();
	}
	public static void MM2HAO(){
		MM2KM();
		KM2HAO();
	}
	public static void MM2PC(){
		MM2KM();
		KM2PC();
	}
	public static void MM2LD(){
		MM2KM();
		KM2LD();
	}
	public static void MM2ASTRO(){
		MM2KM();
		KM2ASTRO();
	}
	public static void MM2LY(){
		MM2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		
	//---------------Micrometre Conversions-------------------//
	public static void UM2KM(){
		unit= unit.multiply(new BigDecimal("0.000000001"));
	}
	public static void UM2M(){
		UM2KM();
		KM2M();
	}
	public static void UM2DM(){
		UM2KM();
		KM2UM();
	}
	public static void UM2CM(){
		UM2KM();
		KM2CM();
	}
	public static void UM2MM(){
		UM2KM();
		KM2MM();
	}
	public static void UM2UM(){
		UM2KM();
		KM2UM();
	}
	public static void UM2NM(){
		UM2KM();
		KM2NM();
	}
	public static void UM2PM(){
		UM2KM();
		KM2PM();
	}
	public static void UM2NMI(){
		UM2KM();
		KM2NMI();
	}
	public static void UM2MI(){
		UM2KM();
		KM2MI();
	}
	public static void UM2FUR(){
		UM2KM();
		KM2FUR();
	}
	public static void UM2FM(){
		UM2KM();
		KM2FM();
	}
	public static void UM2YD(){
		UM2KM();
		KM2YD();
	}
	public static void UM2FT(){
		UM2KM();
		KM2FT();
	}
	public static void UM2IN(){
		UM2KM();
		KM2IN();
	}
	public static void UM2GONGLI(){
		UM2KM();
		KM2GONGLI();
	}
	public static void UM2LI(){
		UM2KM();
		KM2LI();
	}
	public static void UM2ZHANG(){
		UM2KM();
		KM2ZHANG();
	}
	public static void UM2CHI(){
		UM2KM();
		KM2CHI();
	}
	public static void UM2CUN(){
		UM2KM();
		KM2CUN();
	}
	public static void UM2FEN(){
		UM2KM();
		KM2FEN();
	}
	public static void UM2LII(){
		UM2KM();
		KM2LII();
	}
	public static void UM2HAO(){
		UM2KM();
		KM2HAO();
	}
	public static void UM2PC(){
		UM2KM();
		KM2PC();
	}
	public static void UM2LD(){
		UM2KM();
		KM2LD();
	}
	public static void UM2ASTRO(){
		UM2KM();
		KM2ASTRO();
	}
	public static void UM2LY(){
		UM2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Nanometre Conversions-------------------//
	public static void NM2KM(){
		unit= unit.multiply(new BigDecimal("0.000000000001"));
	}
	public static void NM2M(){
		NM2KM();
		KM2M();
	}
	public static void NM2DM(){
		NM2KM();
		KM2NM();
	}
	public static void NM2CM(){
		NM2KM();
		KM2CM();
	}
	public static void NM2MM(){
		NM2KM();
		KM2MM();
	}
	public static void NM2UM(){
		NM2KM();
		KM2UM();
	}
	public static void NM2NM(){
		NM2KM();
		KM2NM();
	}
	public static void NM2PM(){
		NM2KM();
		KM2PM();
	}
	public static void NM2NMI(){
		NM2KM();
		KM2NMI();
	}
	public static void NM2MI(){
		NM2KM();
		KM2MI();
	}
	public static void NM2FUR(){
		NM2KM();
		KM2FUR();
	}
	public static void NM2FM(){
		NM2KM();
		KM2FM();
	}
	public static void NM2YD(){
		NM2KM();
		KM2YD();
	}
	public static void NM2FT(){
		NM2KM();
		KM2FT();
	}
	public static void NM2IN(){
		NM2KM();
		KM2IN();
	}
	public static void NM2GONGLI(){
		NM2KM();
		KM2GONGLI();
	}
	public static void NM2LI(){
		NM2KM();
		KM2LI();
	}
	public static void NM2ZHANG(){
		NM2KM();
		KM2ZHANG();
	}
	public static void NM2CHI(){
		NM2KM();
		KM2CHI();
	}
	public static void NM2CUN(){
		NM2KM();
		KM2CUN();
	}
	public static void NM2FEN(){
		NM2KM();
		KM2FEN();
	}
	public static void NM2LII(){
		NM2KM();
		KM2LII();
	}
	public static void NM2HAO(){
		NM2KM();
		KM2HAO();
	}
	public static void NM2PC(){
		NM2KM();
		KM2PC();
	}
	public static void NM2LD(){
		NM2KM();
		KM2LD();
	}
	public static void NM2ASTRO(){
		NM2KM();
		KM2ASTRO();
	}
	public static void NM2LY(){
		NM2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Picometre Conversions-------------------//
	public static void PM2KM(){
		unit= unit.multiply(new BigDecimal("0.000000000000001"));
	}
	public static void PM2M(){
		PM2KM();
		KM2M();
	}
	public static void PM2DM(){
		PM2KM();
		KM2PM();
	}
	public static void PM2CM(){
		PM2KM();
		KM2CM();
	}
	public static void PM2MM(){
		PM2KM();
		KM2MM();
	}
	public static void PM2UM(){
		PM2KM();
		KM2UM();
	}
	public static void PM2NM(){
		PM2KM();
		KM2NM();
	}
	public static void PM2PM(){
		PM2KM();
		KM2PM();
	}
	public static void PM2NMI(){
		PM2KM();
		KM2NMI();
	}
	public static void PM2MI(){
		PM2KM();
		KM2MI();
	}
	public static void PM2FUR(){
		PM2KM();
		KM2FUR();
	}
	public static void PM2FM(){
		PM2KM();
		KM2FM();
	}
	public static void PM2YD(){
		PM2KM();
		KM2YD();
	}
	public static void PM2FT(){
		PM2KM();
		KM2FT();
	}
	public static void PM2IN(){
		PM2KM();
		KM2IN();
	}
	public static void PM2GONGLI(){
		PM2KM();
		KM2GONGLI();
	}
	public static void PM2LI(){
		PM2KM();
		KM2LI();
	}
	public static void PM2ZHANG(){
		PM2KM();
		KM2ZHANG();
	}
	public static void PM2CHI(){
		PM2KM();
		KM2CHI();
	}
	public static void PM2CUN(){
		PM2KM();
		KM2CUN();
	}
	public static void PM2FEN(){
		PM2KM();
		KM2FEN();
	}
	public static void PM2LII(){
		PM2KM();
		KM2LII();
	}
	public static void PM2HAO(){
		PM2KM();
		KM2HAO();
	}
	public static void PM2PC(){
		PM2KM();
		KM2PC();
	}
	public static void PM2LD(){
		PM2KM();
		KM2LD();
	}
	public static void PM2ASTRO(){
		PM2KM();
		KM2ASTRO();
	}
	public static void PM2LY(){
		PM2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Nautical Mile Conversions-------------------//
	public static void NMI2KM(){
		unit= unit.multiply(new BigDecimal("1.852"));
	}
	public static void NMI2M(){
		NMI2KM();
		KM2M();
	}
	public static void NMI2DM(){
		NMI2KM();
		KM2NMI();
	}
	public static void NMI2CM(){
		NMI2KM();
		KM2CM();
	}
	public static void NMI2MM(){
		NMI2KM();
		KM2MM();
	}
	public static void NMI2UM(){
		NMI2KM();
		KM2UM();
	}
	public static void NMI2NM(){
		NMI2KM();
		KM2NM();
	}
	public static void NMI2PM(){
		NMI2KM();
		KM2PM();
	}
	public static void NMI2NMI(){
		NMI2KM();
		KM2NMI();
	}
	public static void NMI2MI(){
		NMI2KM();
		KM2MI();
	}
	public static void NMI2FUR(){
		NMI2KM();
		KM2FUR();
	}
	public static void NMI2FM(){
		NMI2KM();
		KM2FM();
	}
	public static void NMI2YD(){
		NMI2KM();
		KM2YD();
	}
	public static void NMI2FT(){
		NMI2KM();
		KM2FT();
	}
	public static void NMI2IN(){
		NMI2KM();
		KM2IN();
	}
	public static void NMI2GONGLI(){
		NMI2KM();
		KM2GONGLI();
	}
	public static void NMI2LI(){
		NMI2KM();
		KM2LI();
	}
	public static void NMI2ZHANG(){
		NMI2KM();
		KM2ZHANG();
	}
	public static void NMI2CHI(){
		NMI2KM();
		KM2CHI();
	}
	public static void NMI2CUN(){
		NMI2KM();
		KM2CUN();
	}
	public static void NMI2FEN(){
		NMI2KM();
		KM2FEN();
	}
	public static void NMI2LII(){
		NMI2KM();
		KM2LII();
	}
	public static void NMI2HAO(){
		NMI2KM();
		KM2HAO();
	}
	public static void NMI2PC(){
		NMI2KM();
		KM2PC();
	}
	public static void NMI2LD(){
		NMI2KM();
		KM2LD();
	}
	public static void NMI2ASTRO(){
		NMI2KM();
		KM2ASTRO();
	}
	public static void NMI2LY(){
		NMI2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Mile Conversions-------------------//
	public static void MI2KM(){
		unit= unit.multiply(new BigDecimal("1.609344"));
	}
	public static void MI2M(){
		MI2KM();
		KM2M();
	}
	public static void MI2DM(){
		MI2KM();
		KM2MI();
	}
	public static void MI2CM(){
		MI2KM();
		KM2CM();
	}
	public static void MI2MM(){
		MI2KM();
		KM2MM();
	}
	public static void MI2UM(){
		MI2KM();
		KM2UM();
	}
	public static void MI2NM(){
		MI2KM();
		KM2NM();
	}
	public static void MI2PM(){
		MI2KM();
		KM2PM();
	}
	public static void MI2NMI(){
		MI2KM();
		KM2NMI();
	}
	public static void MI2MI(){
		MI2KM();
		KM2MI();
	}
	public static void MI2FUR(){
		MI2KM();
		KM2FUR();
	}
	public static void MI2FM(){
		MI2KM();
		KM2FM();
	}
	public static void MI2YD(){
		MI2KM();
		KM2YD();
	}
	public static void MI2FT(){
		MI2KM();
		KM2FT();
	}
	public static void MI2IN(){
		MI2KM();
		KM2IN();
	}
	public static void MI2GONGLI(){
		MI2KM();
		KM2GONGLI();
	}
	public static void MI2LI(){
		MI2KM();
		KM2LI();
	}
	public static void MI2ZHANG(){
		MI2KM();
		KM2ZHANG();
	}
	public static void MI2CHI(){
		MI2KM();
		KM2CHI();
	}
	public static void MI2CUN(){
		MI2KM();
		KM2CUN();
	}
	public static void MI2FEN(){
		MI2KM();
		KM2FEN();
	}
	public static void MI2LII(){
		MI2KM();
		KM2LII();
	}
	public static void MI2HAO(){
		MI2KM();
		KM2HAO();
	}
	public static void MI2PC(){
		MI2KM();
		KM2PC();
	}
	public static void MI2LD(){
		MI2KM();
		KM2LD();
	}
	public static void MI2ASTRO(){
		MI2KM();
		KM2ASTRO();
	}
	public static void MI2LY(){
		MI2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Femara Conversions-------------------//
	public static void FUR2KM(){
		unit= unit.multiply(new BigDecimal("0.201168"));
	}
	public static void FUR2M(){
		FUR2KM();
		KM2M();
	}
	public static void FUR2DM(){
		FUR2KM();
		KM2FUR();
	}
	public static void FUR2CM(){
		FUR2KM();
		KM2CM();
	}
	public static void FUR2MM(){
		FUR2KM();
		KM2MM();
	}
	public static void FUR2UM(){
		FUR2KM();
		KM2UM();
	}
	public static void FUR2NM(){
		FUR2KM();
		KM2NM();
	}
	public static void FUR2PM(){
		FUR2KM();
		KM2PM();
	}
	public static void FUR2NMI(){
		FUR2KM();
		KM2NMI();
	}
	public static void FUR2MI(){
		FUR2KM();
		KM2MI();
	}
	public static void FUR2FUR(){
		FUR2KM();
		KM2FUR();
	}
	public static void FUR2FM(){
		FUR2KM();
		KM2FM();
	}
	public static void FUR2YD(){
		FUR2KM();
		KM2YD();
	}
	public static void FUR2FT(){
		FUR2KM();
		KM2FT();
	}
	public static void FUR2IN(){
		FUR2KM();
		KM2IN();
	}
	public static void FUR2GONGLI(){
		FUR2KM();
		KM2GONGLI();
	}
	public static void FUR2LI(){
		FUR2KM();
		KM2LI();
	}
	public static void FUR2ZHANG(){
		FUR2KM();
		KM2ZHANG();
	}
	public static void FUR2CHI(){
		FUR2KM();
		KM2CHI();
	}
	public static void FUR2CUN(){
		FUR2KM();
		KM2CUN();
	}
	public static void FUR2FEN(){
		FUR2KM();
		KM2FEN();
	}
	public static void FUR2LII(){
		FUR2KM();
		KM2LII();
	}
	public static void FUR2HAO(){
		FUR2KM();
		KM2HAO();
	}
	public static void FUR2PC(){
		FUR2KM();
		KM2PC();
	}
	public static void FUR2LD(){
		FUR2KM();
		KM2LD();
	}
	public static void FUR2ASTRO(){
		FUR2KM();
		KM2ASTRO();
	}
	public static void FUR2LY(){
		FUR2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Fathom Conversions-------------------//
	public static void FM2KM(){
		unit= unit.multiply(new BigDecimal("0.0018288"));
	}
	public static void FM2M(){
		FM2KM();
		KM2M();
	}
	public static void FM2DM(){
		FM2KM();
		KM2FM();
	}
	public static void FM2CM(){
		FM2KM();
		KM2CM();
	}
	public static void FM2MM(){
		FM2KM();
		KM2MM();
	}
	public static void FM2UM(){
		FM2KM();
		KM2UM();
	}
	public static void FM2NM(){
		FM2KM();
		KM2NM();
	}
	public static void FM2PM(){
		FM2KM();
		KM2PM();
	}
	public static void FM2NMI(){
		FM2KM();
		KM2NMI();
	}
	public static void FM2MI(){
		FM2KM();
		KM2MI();
	}
	public static void FM2FUR(){
		FM2KM();
		KM2FUR();
	}
	public static void FM2FM(){
		FM2KM();
		KM2FM();
	}
	public static void FM2YD(){
		FM2KM();
		KM2YD();
	}
	public static void FM2FT(){
		FM2KM();
		KM2FT();
	}
	public static void FM2IN(){
		FM2KM();
		KM2IN();
	}
	public static void FM2GONGLI(){
		FM2KM();
		KM2GONGLI();
	}
	public static void FM2LI(){
		FM2KM();
		KM2LI();
	}
	public static void FM2ZHANG(){
		FM2KM();
		KM2ZHANG();
	}
	public static void FM2CHI(){
		FM2KM();
		KM2CHI();
	}
	public static void FM2CUN(){
		FM2KM();
		KM2CUN();
	}
	public static void FM2FEN(){
		FM2KM();
		KM2FEN();
	}
	public static void FM2LII(){
		FM2KM();
		KM2LII();
	}
	public static void FM2HAO(){
		FM2KM();
		KM2HAO();
	}
	public static void FM2PC(){
		FM2KM();
		KM2PC();
	}
	public static void FM2LD(){
		FM2KM();
		KM2LD();
	}
	public static void FM2ASTRO(){
		FM2KM();
		KM2ASTRO();
	}
	public static void FM2LY(){
		FM2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Yard Conversions-------------------//
	public static void YD2KM(){
		unit= unit.multiply(new BigDecimal("0.0009144"));
	}
	public static void YD2M(){
		YD2KM();
		KM2M();
	}
	public static void YD2DM(){
		YD2KM();
		KM2YD();
	}
	public static void YD2CM(){
		YD2KM();
		KM2CM();
	}
	public static void YD2MM(){
		YD2KM();
		KM2MM();
	}
	public static void YD2UM(){
		YD2KM();
		KM2UM();
	}
	public static void YD2NM(){
		YD2KM();
		KM2NM();
	}
	public static void YD2PM(){
		YD2KM();
		KM2PM();
	}
	public static void YD2NMI(){
		YD2KM();
		KM2NMI();
	}
	public static void YD2MI(){
		YD2KM();
		KM2MI();
	}
	public static void YD2FUR(){
		YD2KM();
		KM2FUR();
	}
	public static void YD2FM(){
		YD2KM();
		KM2FM();
	}
	public static void YD2YD(){
		YD2KM();
		KM2YD();
	}
	public static void YD2FT(){
		YD2KM();
		KM2FT();
	}
	public static void YD2IN(){
		YD2KM();
		KM2IN();
	}
	public static void YD2GONGLI(){
		YD2KM();
		KM2GONGLI();
	}
	public static void YD2LI(){
		YD2KM();
		KM2LI();
	}
	public static void YD2ZHANG(){
		YD2KM();
		KM2ZHANG();
	}
	public static void YD2CHI(){
		YD2KM();
		KM2CHI();
	}
	public static void YD2CUN(){
		YD2KM();
		KM2CUN();
	}
	public static void YD2FEN(){
		YD2KM();
		KM2FEN();
	}
	public static void YD2LII(){
		YD2KM();
		KM2LII();
	}
	public static void YD2HAO(){
		YD2KM();
		KM2HAO();
	}
	public static void YD2PC(){
		YD2KM();
		KM2PC();
	}
	public static void YD2LD(){
		YD2KM();
		KM2LD();
	}
	public static void YD2ASTRO(){
		YD2KM();
		KM2ASTRO();
	}
	public static void YD2LY(){
		YD2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Foot Conversions-------------------//
	public static void FT2KM(){
		unit= unit.multiply(new BigDecimal("0.0003048"));
	}
	public static void FT2M(){
		FT2KM();
		KM2M();
	}
	public static void FT2DM(){
		FT2KM();
		KM2FT();
	}
	public static void FT2CM(){
		FT2KM();
		KM2CM();
	}
	public static void FT2MM(){
		FT2KM();
		KM2MM();
	}
	public static void FT2UM(){
		FT2KM();
		KM2UM();
	}
	public static void FT2NM(){
		FT2KM();
		KM2NM();
	}
	public static void FT2PM(){
		FT2KM();
		KM2PM();
	}
	public static void FT2NMI(){
		FT2KM();
		KM2NMI();
	}
	public static void FT2MI(){
		FT2KM();
		KM2MI();
	}
	public static void FT2FUR(){
		FT2KM();
		KM2FUR();
	}
	public static void FT2FM(){
		FT2KM();
		KM2FM();
	}
	public static void FT2YD(){
		FT2KM();
		KM2YD();
	}
	public static void FT2FT(){
		FT2KM();
		KM2FT();
	}
	public static void FT2IN(){
		FT2KM();
		KM2IN();
	}
	public static void FT2GONGLI(){
		FT2KM();
		KM2GONGLI();
	}
	public static void FT2LI(){
		FT2KM();
		KM2LI();
	}
	public static void FT2ZHANG(){
		FT2KM();
		KM2ZHANG();
	}
	public static void FT2CHI(){
		FT2KM();
		KM2CHI();
	}
	public static void FT2CUN(){
		FT2KM();
		KM2CUN();
	}
	public static void FT2FEN(){
		FT2KM();
		KM2FEN();
	}
	public static void FT2LII(){
		FT2KM();
		KM2LII();
	}
	public static void FT2HAO(){
		FT2KM();
		KM2HAO();
	}
	public static void FT2PC(){
		FT2KM();
		KM2PC();
	}
	public static void FT2LD(){
		FT2KM();
		KM2LD();
	}
	public static void FT2ASTRO(){
		FT2KM();
		KM2ASTRO();
	}
	public static void FT2LY(){
		FT2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Inch Conversions-------------------//
	public static void IN2KM(){
		unit= unit.multiply(new BigDecimal("0.0000254"));
	}
	public static void IN2M(){
		IN2KM();
		KM2M();
	}
	public static void IN2DM(){
		IN2KM();
		KM2IN();
	}
	public static void IN2CM(){
		IN2KM();
		KM2CM();
	}
	public static void IN2MM(){
		IN2KM();
		KM2MM();
	}
	public static void IN2UM(){
		IN2KM();
		KM2UM();
	}
	public static void IN2NM(){
		IN2KM();
		KM2NM();
	}
	public static void IN2PM(){
		IN2KM();
		KM2PM();
	}
	public static void IN2NMI(){
		IN2KM();
		KM2NMI();
	}
	public static void IN2MI(){
		IN2KM();
		KM2MI();
	}
	public static void IN2FUR(){
		IN2KM();
		KM2FUR();
	}
	public static void IN2FM(){
		IN2KM();
		KM2FM();
	}
	public static void IN2YD(){
		IN2KM();
		KM2YD();
	}
	public static void IN2FT(){
		IN2KM();
		KM2FT();
	}
	public static void IN2IN(){
		IN2KM();
		KM2IN();
	}
	public static void IN2GONGLI(){
		IN2KM();
		KM2GONGLI();
	}
	public static void IN2LI(){
		IN2KM();
		KM2LI();
	}
	public static void IN2ZHANG(){
		IN2KM();
		KM2ZHANG();
	}
	public static void IN2CHI(){
		IN2KM();
		KM2CHI();
	}
	public static void IN2CUN(){
		IN2KM();
		KM2CUN();
	}
	public static void IN2FEN(){
		IN2KM();
		KM2FEN();
	}
	public static void IN2LII(){
		IN2KM();
		KM2LII();
	}
	public static void IN2HAO(){
		IN2KM();
		KM2HAO();
	}
	public static void IN2PC(){
		IN2KM();
		KM2PC();
	}
	public static void IN2LD(){
		IN2KM();
		KM2LD();
	}
	public static void IN2ASTRO(){
		IN2KM();
		KM2ASTRO();
	}
	public static void IN2LY(){
		IN2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Gongli Conversions-------------------//
	public static void GONGLI2KM(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void GONGLI2M(){
		GONGLI2KM();
		KM2M();
	}
	public static void GONGLI2DM(){
		GONGLI2KM();
		KM2GONGLI();
	}
	public static void GONGLI2CM(){
		GONGLI2KM();
		KM2CM();
	}
	public static void GONGLI2MM(){
		GONGLI2KM();
		KM2MM();
	}
	public static void GONGLI2UM(){
		GONGLI2KM();
		KM2UM();
	}
	public static void GONGLI2NM(){
		GONGLI2KM();
		KM2NM();
	}
	public static void GONGLI2PM(){
		GONGLI2KM();
		KM2PM();
	}
	public static void GONGLI2NMI(){
		GONGLI2KM();
		KM2NMI();
	}
	public static void GONGLI2MI(){
		GONGLI2KM();
		KM2MI();
	}
	public static void GONGLI2FUR(){
		GONGLI2KM();
		KM2FUR();
	}
	public static void GONGLI2FM(){
		GONGLI2KM();
		KM2FM();
	}
	public static void GONGLI2YD(){
		GONGLI2KM();
		KM2YD();
	}
	public static void GONGLI2FT(){
		GONGLI2KM();
		KM2FT();
	}
	public static void GONGLI2IN(){
		GONGLI2KM();
		KM2IN();
	}
	public static void GONGLI2GONGLI(){
		GONGLI2KM();
		KM2GONGLI();
	}
	public static void GONGLI2LI(){
		GONGLI2KM();
		KM2LI();
	}
	public static void GONGLI2ZHANG(){
		GONGLI2KM();
		KM2ZHANG();
	}
	public static void GONGLI2CHI(){
		GONGLI2KM();
		KM2CHI();
	}
	public static void GONGLI2CUN(){
		GONGLI2KM();
		KM2CUN();
	}
	public static void GONGLI2FEN(){
		GONGLI2KM();
		KM2FEN();
	}
	public static void GONGLI2LII(){
		GONGLI2KM();
		KM2LII();
	}
	public static void GONGLI2HAO(){
		GONGLI2KM();
		KM2HAO();
	}
	public static void GONGLI2PC(){
		GONGLI2KM();
		KM2PC();
	}
	public static void GONGLI2LD(){
		GONGLI2KM();
		KM2LD();
	}
	public static void GONGLI2ASTRO(){
		GONGLI2KM();
		KM2ASTRO();
	}
	public static void GONGLI2LY(){
		GONGLI2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Li Conversions-------------------//
	public static void LI2KM(){
		unit= unit.multiply(new BigDecimal("0.5"));
	}
	public static void LI2M(){
		LI2KM();
		KM2M();
	}
	public static void LI2DM(){
		LI2KM();
		KM2LI();
	}
	public static void LI2CM(){
		LI2KM();
		KM2CM();
	}
	public static void LI2MM(){
		LI2KM();
		KM2MM();
	}
	public static void LI2UM(){
		LI2KM();
		KM2UM();
	}
	public static void LI2NM(){
		LI2KM();
		KM2NM();
	}
	public static void LI2PM(){
		LI2KM();
		KM2PM();
	}
	public static void LI2NMI(){
		LI2KM();
		KM2NMI();
	}
	public static void LI2MI(){
		LI2KM();
		KM2MI();
	}
	public static void LI2FUR(){
		LI2KM();
		KM2FUR();
	}
	public static void LI2FM(){
		LI2KM();
		KM2FM();
	}
	public static void LI2YD(){
		LI2KM();
		KM2YD();
	}
	public static void LI2FT(){
		LI2KM();
		KM2FT();
	}
	public static void LI2IN(){
		LI2KM();
		KM2IN();
	}
	public static void LI2GONGLI(){
		LI2KM();
		KM2GONGLI();
	}
	public static void LI2LI(){
		LI2KM();
		KM2LI();
	}
	public static void LI2ZHANG(){
		LI2KM();
		KM2ZHANG();
	}
	public static void LI2CHI(){
		LI2KM();
		KM2CHI();
	}
	public static void LI2CUN(){
		LI2KM();
		KM2CUN();
	}
	public static void LI2FEN(){
		LI2KM();
		KM2FEN();
	}
	public static void LI2LII(){
		LI2KM();
		KM2LII();
	}
	public static void LI2HAO(){
		LI2KM();
		KM2HAO();
	}
	public static void LI2PC(){
		LI2KM();
		KM2PC();
	}
	public static void LI2LD(){
		LI2KM();
		KM2LD();
	}
	public static void LI2ASTRO(){
		LI2KM();
		KM2ASTRO();
	}
	public static void LI2LY(){
		LI2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Zhang Conversions-------------------//
	public static void ZHANG2KM(){
		unit= unit.multiply(new BigDecimal("0.00333"));
	}
	public static void ZHANG2M(){
		ZHANG2KM();
		KM2M();
	}
	public static void ZHANG2DM(){
		ZHANG2KM();
		KM2ZHANG();
	}
	public static void ZHANG2CM(){
		ZHANG2KM();
		KM2CM();
	}
	public static void ZHANG2MM(){
		ZHANG2KM();
		KM2MM();
	}
	public static void ZHANG2UM(){
		ZHANG2KM();
		KM2UM();
	}
	public static void ZHANG2NM(){
		ZHANG2KM();
		KM2NM();
	}
	public static void ZHANG2PM(){
		ZHANG2KM();
		KM2PM();
	}
	public static void ZHANG2NMI(){
		ZHANG2KM();
		KM2NMI();
	}
	public static void ZHANG2MI(){
		ZHANG2KM();
		KM2MI();
	}
	public static void ZHANG2FUR(){
		ZHANG2KM();
		KM2FUR();
	}
	public static void ZHANG2FM(){
		ZHANG2KM();
		KM2FM();
	}
	public static void ZHANG2YD(){
		ZHANG2KM();
		KM2YD();
	}
	public static void ZHANG2FT(){
		ZHANG2KM();
		KM2FT();
	}
	public static void ZHANG2IN(){
		ZHANG2KM();
		KM2IN();
	}
	public static void ZHANG2GONGLI(){
		ZHANG2KM();
		KM2GONGLI();
	}
	public static void ZHANG2LI(){
		ZHANG2KM();
		KM2LI();
	}
	public static void ZHANG2ZHANG(){
		ZHANG2KM();
		KM2ZHANG();
	}
	public static void ZHANG2CHI(){
		ZHANG2KM();
		KM2CHI();
	}
	public static void ZHANG2CUN(){
		ZHANG2KM();
		KM2CUN();
	}
	public static void ZHANG2FEN(){
		ZHANG2KM();
		KM2FEN();
	}
	public static void ZHANG2LII(){
		ZHANG2KM();
		KM2LII();
	}
	public static void ZHANG2HAO(){
		ZHANG2KM();
		KM2HAO();
	}
	public static void ZHANG2PC(){
		ZHANG2KM();
		KM2PC();
	}
	public static void ZHANG2LD(){
		ZHANG2KM();
		KM2LD();
	}
	public static void ZHANG2ASTRO(){
		ZHANG2KM();
		KM2ASTRO();
	}
	public static void ZHANG2LY(){
		ZHANG2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
		

	//---------------Chi Conversions-------------------//
	public static void CHI2KM(){
		unit= unit.multiply(new BigDecimal("0.0003333"));
	}
	public static void CHI2M(){
		CHI2KM();
		KM2M();
	}
	public static void CHI2DM(){
		CHI2KM();
		KM2CHI();
	}
	public static void CHI2CM(){
		CHI2KM();
		KM2CM();
	}
	public static void CHI2MM(){
		CHI2KM();
		KM2MM();
	}
	public static void CHI2UM(){
		CHI2KM();
		KM2UM();
	}
	public static void CHI2NM(){
		CHI2KM();
		KM2NM();
	}
	public static void CHI2PM(){
		CHI2KM();
		KM2PM();
	}
	public static void CHI2NMI(){
		CHI2KM();
		KM2NMI();
	}
	public static void CHI2MI(){
		CHI2KM();
		KM2MI();
	}
	public static void CHI2FUR(){
		CHI2KM();
		KM2FUR();
	}
	public static void CHI2FM(){
		CHI2KM();
		KM2FM();
	}
	public static void CHI2YD(){
		CHI2KM();
		KM2YD();
	}
	public static void CHI2FT(){
		CHI2KM();
		KM2FT();
	}
	public static void CHI2IN(){
		CHI2KM();
		KM2IN();
	}
	public static void CHI2GONGLI(){
		CHI2KM();
		KM2GONGLI();
	}
	public static void CHI2LI(){
		CHI2KM();
		KM2LI();
	}
	public static void CHI2ZHANG(){
		CHI2KM();
		KM2ZHANG();
	}
	public static void CHI2CHI(){
		CHI2KM();
		KM2CHI();
	}
	public static void CHI2CUN(){
		CHI2KM();
		KM2CUN();
	}
	public static void CHI2FEN(){
		CHI2KM();
		KM2FEN();
	}
	public static void CHI2LII(){
		CHI2KM();
		KM2LII();
	}
	public static void CHI2HAO(){
		CHI2KM();
		KM2HAO();
	}
	public static void CHI2PC(){
		CHI2KM();
		KM2PC();
	}
	public static void CHI2LD(){
		CHI2KM();
		KM2LD();
	}
	public static void CHI2ASTRO(){
		CHI2KM();
		KM2ASTRO();
	}
	public static void CHI2LY(){
		CHI2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Cun Conversions-------------------//
	public static void CUN2KM(){
		unit= unit.multiply(new BigDecimal("0.0000333"));
	}
	public static void CUN2M(){
		CUN2KM();
		KM2M();
	}
	public static void CUN2DM(){
		CUN2KM();
		KM2CUN();
	}
	public static void CUN2CM(){
		CUN2KM();
		KM2CM();
	}
	public static void CUN2MM(){
		CUN2KM();
		KM2MM();
	}
	public static void CUN2UM(){
		CUN2KM();
		KM2UM();
	}
	public static void CUN2NM(){
		CUN2KM();
		KM2NM();
	}
	public static void CUN2PM(){
		CUN2KM();
		KM2PM();
	}
	public static void CUN2NMI(){
		CUN2KM();
		KM2NMI();
	}
	public static void CUN2MI(){
		CUN2KM();
		KM2MI();
	}
	public static void CUN2FUR(){
		CUN2KM();
		KM2FUR();
	}
	public static void CUN2FM(){
		CUN2KM();
		KM2FM();
	}
	public static void CUN2YD(){
		CUN2KM();
		KM2YD();
	}
	public static void CUN2FT(){
		CUN2KM();
		KM2FT();
	}
	public static void CUN2IN(){
		CUN2KM();
		KM2IN();
	}
	public static void CUN2GONGLI(){
		CUN2KM();
		KM2GONGLI();
	}
	public static void CUN2LI(){
		CUN2KM();
		KM2LI();
	}
	public static void CUN2ZHANG(){
		CUN2KM();
		KM2ZHANG();
	}
	public static void CUN2CHI(){
		CUN2KM();
		KM2CHI();
	}
	public static void CUN2CUN(){
		CUN2KM();
		KM2CUN();
	}
	public static void CUN2FEN(){
		CUN2KM();
		KM2FEN();
	}
	public static void CUN2LII(){
		CUN2KM();
		KM2LII();
	}
	public static void CUN2HAO(){
		CUN2KM();
		KM2HAO();
	}
	public static void CUN2PC(){
		CUN2KM();
		KM2PC();
	}
	public static void CUN2LD(){
		CUN2KM();
		KM2LD();
	}
	public static void CUN2ASTRO(){
		CUN2KM();
		KM2ASTRO();
	}
	public static void CUN2LY(){
		CUN2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Fen Conversions-------------------//
	public static void FEN2KM(){
		unit= unit.multiply(new BigDecimal("0.00000333"));
	}
	public static void FEN2M(){
		FEN2KM();
		KM2M();
	}
	public static void FEN2DM(){
		FEN2KM();
		KM2FEN();
	}
	public static void FEN2CM(){
		FEN2KM();
		KM2CM();
	}
	public static void FEN2MM(){
		FEN2KM();
		KM2MM();
	}
	public static void FEN2UM(){
		FEN2KM();
		KM2UM();
	}
	public static void FEN2NM(){
		FEN2KM();
		KM2NM();
	}
	public static void FEN2PM(){
		FEN2KM();
		KM2PM();
	}
	public static void FEN2NMI(){
		FEN2KM();
		KM2NMI();
	}
	public static void FEN2MI(){
		FEN2KM();
		KM2MI();
	}
	public static void FEN2FUR(){
		FEN2KM();
		KM2FUR();
	}
	public static void FEN2FM(){
		FEN2KM();
		KM2FM();
	}
	public static void FEN2YD(){
		FEN2KM();
		KM2YD();
	}
	public static void FEN2FT(){
		FEN2KM();
		KM2FT();
	}
	public static void FEN2IN(){
		FEN2KM();
		KM2IN();
	}
	public static void FEN2GONGLI(){
		FEN2KM();
		KM2GONGLI();
	}
	public static void FEN2LI(){
		FEN2KM();
		KM2LI();
	}
	public static void FEN2ZHANG(){
		FEN2KM();
		KM2ZHANG();
	}
	public static void FEN2CHI(){
		FEN2KM();
		KM2CHI();
	}
	public static void FEN2CUN(){
		FEN2KM();
		KM2CUN();
	}
	public static void FEN2FEN(){
		FEN2KM();
		KM2FEN();
	}
	public static void FEN2LII(){
		FEN2KM();
		KM2LII();
	}
	public static void FEN2HAO(){
		FEN2KM();
		KM2HAO();
	}
	public static void FEN2PC(){
		FEN2KM();
		KM2PC();
	}
	public static void FEN2LD(){
		FEN2KM();
		KM2LD();
	}
	public static void FEN2ASTRO(){
		FEN2KM();
		KM2ASTRO();
	}
	public static void FEN2LY(){
		FEN2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Lii Conversions-------------------//
	public static void LII2KM(){
		unit= unit.multiply(new BigDecimal("0.000000333"));
	}
	public static void LII2M(){
		LII2KM();
		KM2M();
	}
	public static void LII2DM(){
		LII2KM();
		KM2LII();
	}
	public static void LII2CM(){
		LII2KM();
		KM2CM();
	}
	public static void LII2MM(){
		LII2KM();
		KM2MM();
	}
	public static void LII2UM(){
		LII2KM();
		KM2UM();
	}
	public static void LII2NM(){
		LII2KM();
		KM2NM();
	}
	public static void LII2PM(){
		LII2KM();
		KM2PM();
	}
	public static void LII2NMI(){
		LII2KM();
		KM2NMI();
	}
	public static void LII2MI(){
		LII2KM();
		KM2MI();
	}
	public static void LII2FUR(){
		LII2KM();
		KM2FUR();
	}
	public static void LII2FM(){
		LII2KM();
		KM2FM();
	}
	public static void LII2YD(){
		LII2KM();
		KM2YD();
	}
	public static void LII2FT(){
		LII2KM();
		KM2FT();
	}
	public static void LII2IN(){
		LII2KM();
		KM2IN();
	}
	public static void LII2GONGLI(){
		LII2KM();
		KM2GONGLI();
	}
	public static void LII2LI(){
		LII2KM();
		KM2LI();
	}
	public static void LII2ZHANG(){
		LII2KM();
		KM2ZHANG();
	}
	public static void LII2CHI(){
		LII2KM();
		KM2CHI();
	}
	public static void LII2CUN(){
		LII2KM();
		KM2CUN();
	}
	public static void LII2FEN(){
		LII2KM();
		KM2FEN();
	}
	public static void LII2LII(){
		LII2KM();
		KM2LII();
	}
	public static void LII2HAO(){
		LII2KM();
		KM2HAO();
	}
	public static void LII2PC(){
		LII2KM();
		KM2PC();
	}
	public static void LII2LD(){
		LII2KM();
		KM2LD();
	}
	public static void LII2ASTRO(){
		LII2KM();
		KM2ASTRO();
	}
	public static void LII2LY(){
		LII2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Hao Conversions-------------------//
	public static void HAO2KM(){
		unit= unit.multiply(new BigDecimal("0.00000003333"));
	}
	public static void HAO2M(){
		HAO2KM();
		KM2M();
	}
	public static void HAO2DM(){
		HAO2KM();
		KM2HAO();
	}
	public static void HAO2CM(){
		HAO2KM();
		KM2CM();
	}
	public static void HAO2MM(){
		HAO2KM();
		KM2MM();
	}
	public static void HAO2UM(){
		HAO2KM();
		KM2UM();
	}
	public static void HAO2NM(){
		HAO2KM();
		KM2NM();
	}
	public static void HAO2PM(){
		HAO2KM();
		KM2PM();
	}
	public static void HAO2NMI(){
		HAO2KM();
		KM2NMI();
	}
	public static void HAO2MI(){
		HAO2KM();
		KM2MI();
	}
	public static void HAO2FUR(){
		HAO2KM();
		KM2FUR();
	}
	public static void HAO2FM(){
		HAO2KM();
		KM2FM();
	}
	public static void HAO2YD(){
		HAO2KM();
		KM2YD();
	}
	public static void HAO2FT(){
		HAO2KM();
		KM2FT();
	}
	public static void HAO2IN(){
		HAO2KM();
		KM2IN();
	}
	public static void HAO2GONGLI(){
		HAO2KM();
		KM2GONGLI();
	}
	public static void HAO2LI(){
		HAO2KM();
		KM2LI();
	}
	public static void HAO2ZHANG(){
		HAO2KM();
		KM2ZHANG();
	}
	public static void HAO2CHI(){
		HAO2KM();
		KM2CHI();
	}
	public static void HAO2CUN(){
		HAO2KM();
		KM2CUN();
	}
	public static void HAO2FEN(){
		HAO2KM();
		KM2FEN();
	}
	public static void HAO2LII(){
		HAO2KM();
		KM2LII();
	}
	public static void HAO2HAO(){
		HAO2KM();
		KM2HAO();
	}
	public static void HAO2PC(){
		HAO2KM();
		KM2PC();
	}
	public static void HAO2LD(){
		HAO2KM();
		KM2LD();
	}
	public static void HAO2ASTRO(){
		HAO2KM();
		KM2ASTRO();
	}
	public static void HAO2LY(){
		HAO2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Parsec Conversions-------------------//
	public static void PC2KM(){
		unit= unit.multiply(new BigDecimal("30856775812800"));
	}
	public static void PC2M(){
		PC2KM();
		KM2M();
	}
	public static void PC2DM(){
		PC2KM();
		KM2PC();
	}
	public static void PC2CM(){
		PC2KM();
		KM2CM();
	}
	public static void PC2MM(){
		PC2KM();
		KM2MM();
	}
	public static void PC2UM(){
		PC2KM();
		KM2UM();
	}
	public static void PC2NM(){
		PC2KM();
		KM2NM();
	}
	public static void PC2PM(){
		PC2KM();
		KM2PM();
	}
	public static void PC2NMI(){
		PC2KM();
		KM2NMI();
	}
	public static void PC2MI(){
		PC2KM();
		KM2MI();
	}
	public static void PC2FUR(){
		PC2KM();
		KM2FUR();
	}
	public static void PC2FM(){
		PC2KM();
		KM2FM();
	}
	public static void PC2YD(){
		PC2KM();
		KM2YD();
	}
	public static void PC2FT(){
		PC2KM();
		KM2FT();
	}
	public static void PC2IN(){
		PC2KM();
		KM2IN();
	}
	public static void PC2GONGLI(){
		PC2KM();
		KM2GONGLI();
	}
	public static void PC2LI(){
		PC2KM();
		KM2LI();
	}
	public static void PC2ZHANG(){
		PC2KM();
		KM2ZHANG();
	}
	public static void PC2CHI(){
		PC2KM();
		KM2CHI();
	}
	public static void PC2CUN(){
		PC2KM();
		KM2CUN();
	}
	public static void PC2FEN(){
		PC2KM();
		KM2FEN();
	}
	public static void PC2LII(){
		PC2KM();
		KM2LII();
	}
	public static void PC2HAO(){
		PC2KM();
		KM2HAO();
	}
	public static void PC2PC(){
		PC2KM();
		KM2PC();
	}
	public static void PC2LD(){
		PC2KM();
		KM2LD();
	}
	public static void PC2ASTRO(){
		PC2KM();
		KM2ASTRO();
	}
	public static void PC2LY(){
		PC2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Lunar Distance Conversions-------------------//
	public static void LD2KM(){
		unit= unit.multiply(new BigDecimal("384401"));
	}
	public static void LD2M(){
		LD2KM();
		KM2M();
	}
	public static void LD2DM(){
		LD2KM();
		KM2LD();
	}
	public static void LD2CM(){
		LD2KM();
		KM2CM();
	}
	public static void LD2MM(){
		LD2KM();
		KM2MM();
	}
	public static void LD2UM(){
		LD2KM();
		KM2UM();
	}
	public static void LD2NM(){
		LD2KM();
		KM2NM();
	}
	public static void LD2PM(){
		LD2KM();
		KM2PM();
	}
	public static void LD2NMI(){
		LD2KM();
		KM2NMI();
	}
	public static void LD2MI(){
		LD2KM();
		KM2MI();
	}
	public static void LD2FUR(){
		LD2KM();
		KM2FUR();
	}
	public static void LD2FM(){
		LD2KM();
		KM2FM();
	}
	public static void LD2YD(){
		LD2KM();
		KM2YD();
	}
	public static void LD2FT(){
		LD2KM();
		KM2FT();
	}
	public static void LD2IN(){
		LD2KM();
		KM2IN();
	}
	public static void LD2GONGLI(){
		LD2KM();
		KM2GONGLI();
	}
	public static void LD2LI(){
		LD2KM();
		KM2LI();
	}
	public static void LD2ZHANG(){
		LD2KM();
		KM2ZHANG();
	}
	public static void LD2CHI(){
		LD2KM();
		KM2CHI();
	}
	public static void LD2CUN(){
		LD2KM();
		KM2CUN();
	}
	public static void LD2FEN(){
		LD2KM();
		KM2FEN();
	}
	public static void LD2LII(){
		LD2KM();
		KM2LII();
	}
	public static void LD2HAO(){
		LD2KM();
		KM2HAO();
	}
	public static void LD2PC(){
		LD2KM();
		KM2PC();
	}
	public static void LD2LD(){
		LD2KM();
		KM2LD();
	}
	public static void LD2ASTRO(){
		LD2KM();
		KM2ASTRO();
	}
	public static void LD2LY(){
		LD2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````
	//---------------Astronomical Unit Conversions-------------------//
	public static void ASTRO2KM(){
		unit= unit.multiply(new BigDecimal("149597871"));
	}
	public static void ASTRO2M(){
		ASTRO2KM();
		KM2M();
	}
	public static void ASTRO2DM(){
		ASTRO2KM();
		KM2ASTRO();
	}
	public static void ASTRO2CM(){
		ASTRO2KM();
		KM2CM();
	}
	public static void ASTRO2MM(){
		ASTRO2KM();
		KM2MM();
	}
	public static void ASTRO2UM(){
		ASTRO2KM();
		KM2UM();
	}
	public static void ASTRO2NM(){
		ASTRO2KM();
		KM2NM();
	}
	public static void ASTRO2PM(){
		ASTRO2KM();
		KM2PM();
	}
	public static void ASTRO2NMI(){
		ASTRO2KM();
		KM2NMI();
	}
	public static void ASTRO2MI(){
		ASTRO2KM();
		KM2MI();
	}
	public static void ASTRO2FUR(){
		ASTRO2KM();
		KM2FUR();
	}
	public static void ASTRO2FM(){
		ASTRO2KM();
		KM2FM();
	}
	public static void ASTRO2YD(){
		ASTRO2KM();
		KM2YD();
	}
	public static void ASTRO2FT(){
		ASTRO2KM();
		KM2FT();
	}
	public static void ASTRO2IN(){
		ASTRO2KM();
		KM2IN();
	}
	public static void ASTRO2GONGLI(){
		ASTRO2KM();
		KM2GONGLI();
	}
	public static void ASTRO2LI(){
		ASTRO2KM();
		KM2LI();
	}
	public static void ASTRO2ZHANG(){
		ASTRO2KM();
		KM2ZHANG();
	}
	public static void ASTRO2CHI(){
		ASTRO2KM();
		KM2CHI();
	}
	public static void ASTRO2CUN(){
		ASTRO2KM();
		KM2CUN();
	}
	public static void ASTRO2FEN(){
		ASTRO2KM();
		KM2FEN();
	}
	public static void ASTRO2LII(){
		ASTRO2KM();
		KM2LII();
	}
	public static void ASTRO2HAO(){
		ASTRO2KM();
		KM2HAO();
	}
	public static void ASTRO2PC(){
		ASTRO2KM();
		KM2PC();
	}
	public static void ASTRO2LD(){
		ASTRO2KM();
		KM2LD();
	}
	public static void ASTRO2ASTRO(){
		ASTRO2KM();
		KM2ASTRO();
	}
	public static void ASTRO2LY(){
		ASTRO2KM();
		KM2LY();
	}
	//`````````````````````````````````````````````````````````
	//---------------Light Year Conversions-------------------//
	public static void LY2KM(){
		unit= unit.multiply(new BigDecimal("0.0000158125074"));
	}
	public static void LY2M(){
		LY2KM();
		KM2M();
	}
	public static void LY2DM(){
		LY2KM();
		KM2LY();
	}
	public static void LY2CM(){
		LY2KM();
		KM2CM();
	}
	public static void LY2MM(){
		LY2KM();
		KM2MM();
	}
	public static void LY2UM(){
		LY2KM();
		KM2UM();
	}
	public static void LY2NM(){
		LY2KM();
		KM2NM();
	}
	public static void LY2PM(){
		LY2KM();
		KM2PM();
	}
	public static void LY2NMI(){
		LY2KM();
		KM2NMI();
	}
	public static void LY2MI(){
		LY2KM();
		KM2MI();
	}
	public static void LY2FUR(){
		LY2KM();
		KM2FUR();
	}
	public static void LY2FM(){
		LY2KM();
		KM2FM();
	}
	public static void LY2YD(){
		LY2KM();
		KM2YD();
	}
	public static void LY2FT(){
		LY2KM();
		KM2FT();
	}
	public static void LY2IN(){
		LY2KM();
		KM2IN();
	}
	public static void LY2GONGLI(){
		LY2KM();
		KM2GONGLI();
	}
	public static void LY2LI(){
		LY2KM();
		KM2LI();
	}
	public static void LY2ZHANG(){
		LY2KM();
		KM2ZHANG();
	}
	public static void LY2CHI(){
		LY2KM();
		KM2CHI();
	}
	public static void LY2CUN(){
		LY2KM();
		KM2CUN();
	}
	public static void LY2FEN(){
		LY2KM();
		KM2FEN();
	}
	public static void LY2LII(){
		LY2KM();
		KM2LII();
	}
	public static void LY2HAO(){
		LY2KM();
		KM2HAO();
	}
	public static void LY2PC(){
		LY2KM();
		KM2PC();
	}
	public static void LY2LD(){
		LY2KM();
		KM2LD();
	}
	public static void LY2ASTRO(){
		LY2KM();
		KM2ASTRO();
	}
	public static void LY2LY(){
		LY2KM();
		KM2LY();
	}
	//``````````````````````````````````````````````````

	public static void main(String arg[]){
		while(true){
			options();
			choiceFilling();
		}
	}
}