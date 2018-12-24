package sub;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;

public class Cooking{
	static final String[] units = new String[]{"Cup[US]","Dash","DessertSpoon[US]","DessertSpoon[UK]","Dram[US,Fluid]",
												"Dram[UK,Fluid]","Drop","Fifth","Fluid Ounce[US,Fluid]","Fluid Ounce[UK,Fluid]",
												"Gallon[US,Fluid]","Gallon[US,Dry]","Gallon[UK]","Gill[US]","Gill[UK]","Liter",
												"Milliliter","Pint[US,Fluid]","Pint[US,Dry]","Pint[UK]","Quart[US,Fluid]","Quart[US,Dry]",
												"Quart[UK]","TableSpoon[US]","TableSpoon[Food and Drug Administration]","TeaSpoon[US]",
												"TeaSpoon[Food and Drug Administration]", "Exit"};

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
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCOOKING CONVERTER");
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
		//--------------Cup[US] Conversion Choices------------------\\
		if(choice1 == 1 && choice2 == 1){
			CupUS2CupUS();
		}
		if(choice1 == 1 && choice2 == 2){
			CupUS2Dash();
		}
		if(choice1 == 1 && choice2 == 3){
			CupUS2DessertSpoonUS();
		}
		if(choice1 == 1 && choice2 == 4){
			CupUS2DessertSpoonUK();
		}
		if(choice1 == 1 && choice2 == 5){
			CupUS2DramUSfluid();
		}
		if(choice1 == 1 && choice2 == 6){
			CupUS2DramUKfluid();
		}
		if(choice1 == 1 && choice2 == 7){
			CupUS2Drop();
		}
		if(choice1 == 1 && choice2 == 8){
			CupUS2Fifth();
		}
		if(choice1 == 1 && choice2 == 9){
			CupUS2FluidOunceUSfluid();
		}
		if(choice1 == 1 && choice2 == 10){
			CupUS2FluidOunceUKfluid();
		}
		if(choice1 == 1 && choice2 == 11){
			CupUS2GallonUSfluid();
		}
		if(choice1 == 1 && choice2 == 12){
			CupUS2GallonUSdry();
		}
		if(choice1 == 1 && choice2 == 13){
			CupUS2GallonUK();
		}
		if(choice1 == 1 && choice2 == 14){
			CupUS2GillUS();
		}
		if(choice1 == 1 && choice2 == 15){
			CupUS2GillUK();
		}
		if(choice1 == 1 && choice2 == 16){
			CupUS2Liter();
		}
		if(choice1 == 1 && choice2 == 17){
			CupUS2ML();
		}
		if(choice1 == 1 && choice2 == 18){
			CupUS2PintUSfluid();
		}
		if(choice1 == 1 && choice2 == 19){
			CupUS2PintUSdry();
		}
		if(choice1 == 1 && choice2 == 20){
			CupUS2PintUK();
		}
		if(choice1 == 1 && choice2 == 21){
			CupUS2QuartUSfluid();
		}
		if(choice1 == 1 && choice2 == 22){
			CupUS2QuartUSdry();
		}
		if(choice1 == 1 && choice2 == 23){
			CupUS2QuartUK();
		}
		if(choice1 == 1 && choice2 == 24){
			CupUS2tbspUS();
		}
		if(choice1 == 1 && choice2 == 25){
			CupUS2tbspFDA();
		}
		if(choice1 == 1 && choice2 == 26){
			CupUS2tspUS();
		}
		if(choice1 == 1 && choice2 == 27){
			CupUS2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//----------------Dash Conversion Choices-------------------\\
		if(choice1 == 2 && choice2 == 1){
			Dash2CupUS();
		}
		if(choice1 == 2 && choice2 == 2){
			Dash2Dash();
		}
		if(choice1 == 2 && choice2 == 3){
			Dash2DessertSpoonUS();
		}
		if(choice1 == 2 && choice2 == 4){
			Dash2DessertSpoonUK();
		}
		if(choice1 == 2 && choice2 == 5){
			Dash2DramUSfluid();
		}
		if(choice1 == 2 && choice2 == 6){
			Dash2DramUKfluid();
		}
		if(choice1 == 2 && choice2 == 7){
			Dash2Drop();
		}
		if(choice1 == 2 && choice2 == 8){
			Dash2Fifth();
		}
		if(choice1 == 2 && choice2 == 9){
			Dash2FluidOunceUSfluid();
		}
		if(choice1 == 2 && choice2 == 10){
			Dash2FluidOunceUKfluid();
		}
		if(choice1 == 2 && choice2 == 11){
			Dash2GallonUSfluid();
		}
		if(choice1 == 2 && choice2 == 12){
			Dash2GallonUSdry();
		}
		if(choice1 == 2 && choice2 == 13){
			Dash2GallonUK();
		}
		if(choice1 == 2 && choice2 == 14){
			Dash2GillUS();
		}
		if(choice1 == 2 && choice2 == 15){
			Dash2GillUK();
		}
		if(choice1 == 2 && choice2 == 16){
			Dash2Liter();
		}
		if(choice1 == 2 && choice2 == 17){
			Dash2ML();
		}
		if(choice1 == 2 && choice2 == 18){
			Dash2PintUSfluid();
		}
		if(choice1 == 2 && choice2 == 19){
			Dash2PintUSdry();
		}
		if(choice1 == 2 && choice2 == 20){
			Dash2PintUK();
		}
		if(choice1 == 2 && choice2 == 21){
			Dash2QuartUSfluid();
		}
		if(choice1 == 2 && choice2 == 22){
			Dash2QuartUSdry();
		}
		if(choice1 == 2 && choice2 == 23){
			Dash2QuartUK();
		}
		if(choice1 == 2 && choice2 == 24){
			Dash2tbspUS();
		}
		if(choice1 == 2 && choice2 == 25){
			Dash2tbspFDA();
		}
		if(choice1 == 2 && choice2 == 26){
			Dash2tspUS();
		}
		if(choice1 == 2 && choice2 == 27){
			Dash2tspFDA();
		}
		//``````````````````````````````````````````````````````````````````\\
		//--------------DessertSpoon[US] Conversion Choices------------------\\
		if(choice1 == 3 && choice2 == 1){
			DSUS2CupUS();
		}
		if(choice1 == 3 && choice2 == 2){
			DSUS2Dash();
		}
		if(choice1 == 3 && choice2 == 3){
			DSUS2DessertSpoonUS();
		}
		if(choice1 == 3 && choice2 == 4){
			DSUS2DessertSpoonUK();
		}
		if(choice1 == 3 && choice2 == 5){
			DSUS2DramUSfluid();
		}
		if(choice1 == 3 && choice2 == 6){
			DSUS2DramUKfluid();
		}
		if(choice1 == 3 && choice2 == 7){
			DSUS2Drop();
		}
		if(choice1 == 3 && choice2 == 8){
			DSUS2Fifth();
		}
		if(choice1 == 3 && choice2 == 9){
			DSUS2FluidOunceUSfluid();
		}
		if(choice1 == 3 && choice2 == 10){
			DSUS2FluidOunceUKfluid();
		}
		if(choice1 == 3 && choice2 == 11){
			DSUS2GallonUSfluid();
		}
		if(choice1 == 3 && choice2 == 12){
			DSUS2GallonUSdry();
		}
		if(choice1 == 3 && choice2 == 13){
			DSUS2GallonUK();
		}
		if(choice1 == 3 && choice2 == 14){
			DSUS2GillUS();
		}
		if(choice1 == 3 && choice2 == 15){
			DSUS2GillUK();
		}
		if(choice1 == 3 && choice2 == 16){
			DSUS2Liter();
		}
		if(choice1 == 3 && choice2 == 17){
			DSUS2ML();
		}
		if(choice1 == 3 && choice2 == 18){
			DSUS2PintUSfluid();
		}
		if(choice1 == 3 && choice2 == 19){
			DSUS2PintUSdry();
		}
		if(choice1 == 3 && choice2 == 20){
			DSUS2PintUK();
		}
		if(choice1 == 3 && choice2 == 21){
			DSUS2QuartUSfluid();
		}
		if(choice1 == 3 && choice2 == 22){
			DSUS2QuartUSdry();
		}
		if(choice1 == 3 && choice2 == 23){
			DSUS2QuartUK();
		}
		if(choice1 == 3 && choice2 == 24){
			DSUS2tbspUS();
		}
		if(choice1 == 3 && choice2 == 25){
			DSUS2tbspFDA();
		}
		if(choice1 == 3 && choice2 == 26){
			DSUS2tspUS();
		}
		if(choice1 == 3 && choice2 == 27){
			DSUS2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------DessertSpoon[UK] Conversion Choices------------------\\
		if(choice1 == 4 && choice2 == 1){
			DSUK2CupUS();
		}
		if(choice1 == 4 && choice2 == 2){
			DSUK2Dash();
		}
		if(choice1 == 4 && choice2 == 3){
			DSUK2DessertSpoonUS();
		}
		if(choice1 == 4 && choice2 == 4){
			DSUK2DessertSpoonUK();
		}
		if(choice1 == 4 && choice2 == 5){
			DSUK2DramUSfluid();
		}
		if(choice1 == 4 && choice2 == 6){
			DSUK2DramUKfluid();
		}
		if(choice1 == 4 && choice2 == 7){
			DSUK2Drop();
		}
		if(choice1 == 4 && choice2 == 8){
			DSUK2Fifth();
		}
		if(choice1 == 4 && choice2 == 9){
			DSUK2FluidOunceUSfluid();
		}
		if(choice1 == 4 && choice2 == 10){
			DSUK2FluidOunceUKfluid();
		}
		if(choice1 == 4 && choice2 == 11){
			DSUK2GallonUSfluid();
		}
		if(choice1 == 4 && choice2 == 12){
			DSUK2GallonUSdry();
		}
		if(choice1 == 4 && choice2 == 13){
			DSUK2GallonUK();
		}
		if(choice1 == 4 && choice2 == 14){
			DSUK2GillUS();
		}
		if(choice1 == 4 && choice2 == 15){
			DSUK2GillUK();
		}
		if(choice1 == 4 && choice2 == 16){
			DSUK2Liter();
		}
		if(choice1 == 4 && choice2 == 17){
			DSUK2ML();
		}
		if(choice1 == 4 && choice2 == 18){
			DSUK2PintUSfluid();
		}
		if(choice1 == 4 && choice2 == 19){
			DSUK2PintUSdry();
		}
		if(choice1 == 4 && choice2 == 20){
			DSUK2PintUK();
		}
		if(choice1 == 4 && choice2 == 21){
			DSUK2QuartUSfluid();
		}
		if(choice1 == 4 && choice2 == 22){
			DSUK2QuartUSdry();
		}
		if(choice1 == 4 && choice2 == 23){
			DSUK2QuartUK();
		}
		if(choice1 == 4 && choice2 == 24){
			DSUK2tbspUS();
		}
		if(choice1 == 4 && choice2 == 25){
			DSUK2tbspFDA();
		}
		if(choice1 == 4 && choice2 == 26){
			DSUK2tspUS();
		}
		if(choice1 == 4 && choice2 == 27){
			DSUK2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Dram[US,Fluid] Conversion Choices------------------\\
		if(choice1 == 5 && choice2 == 1){
			DramUSfluid2CupUS();
		}
		if(choice1 == 5 && choice2 == 2){
			DramUSfluid2Dash();
		}
		if(choice1 == 5 && choice2 == 3){
			DramUSfluid2DessertSpoonUS();
		}
		if(choice1 == 5 && choice2 == 4){
			DramUSfluid2DessertSpoonUK();
		}
		if(choice1 == 5 && choice2 == 5){
			DramUSfluid2DramUSfluid();
		}
		if(choice1 == 5 && choice2 == 6){
			DramUSfluid2DramUKfluid();
		}
		if(choice1 == 5 && choice2 == 7){
			DramUSfluid2Drop();
		}
		if(choice1 == 5 && choice2 == 8){
			DramUSfluid2Fifth();
		}
		if(choice1 == 5 && choice2 == 9){
			DramUSfluid2FluidOunceUSfluid();
		}
		if(choice1 == 5 && choice2 == 10){
			DramUSfluid2FluidOunceUKfluid();
		}
		if(choice1 == 5 && choice2 == 11){
			DramUSfluid2GallonUSfluid();
		}
		if(choice1 == 5 && choice2 == 12){
			DramUSfluid2GallonUSdry();
		}
		if(choice1 == 5 && choice2 == 13){
			DramUSfluid2GallonUK();
		}
		if(choice1 == 5 && choice2 == 14){
			DramUSfluid2GillUS();
		}
		if(choice1 == 5 && choice2 == 15){
			DramUSfluid2GillUK();
		}
		if(choice1 == 5 && choice2 == 16){
			DramUSfluid2Liter();
		}
		if(choice1 == 5 && choice2 == 17){
			DramUSfluid2ML();
		}
		if(choice1 == 5 && choice2 == 18){
			DramUSfluid2PintUSfluid();
		}
		if(choice1 == 5 && choice2 == 19){
			DramUSfluid2PintUSdry();
		}
		if(choice1 == 5 && choice2 == 20){
			DramUSfluid2PintUK();
		}
		if(choice1 == 5 && choice2 == 21){
			DramUSfluid2QuartUSfluid();
		}
		if(choice1 == 5 && choice2 == 22){
			DramUSfluid2QuartUSdry();
		}
		if(choice1 == 5 && choice2 == 23){
			DramUSfluid2QuartUK();
		}
		if(choice1 == 5 && choice2 == 24){
			DramUSfluid2tbspUS();
		}
		if(choice1 == 5 && choice2 == 25){
			DramUSfluid2tbspFDA();
		}
		if(choice1 == 5 && choice2 == 26){
			DramUSfluid2tspUS();
		}
		if(choice1 == 5 && choice2 == 27){
			DramUSfluid2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Dram [US,Fluid] Conversion Choices------------------\\
		if(choice1 == 6 && choice2 == 1){
			DramUKfluid2CupUS();
		}
		if(choice1 == 6 && choice2 == 2){
			DramUKfluid2Dash();
		}
		if(choice1 == 6 && choice2 == 3){
			DramUKfluid2DessertSpoonUS();
		}
		if(choice1 == 6 && choice2 == 4){
			DramUKfluid2DessertSpoonUK();
		}
		if(choice1 == 6 && choice2 == 5){
			DramUKfluid2DramUSfluid();
		}
		if(choice1 == 6 && choice2 == 6){
			DramUKfluid2DramUKfluid();
		}
		if(choice1 == 6 && choice2 == 7){
			DramUKfluid2Drop();
		}
		if(choice1 == 6 && choice2 == 8){
			DramUKfluid2Fifth();
		}
		if(choice1 == 6 && choice2 == 9){
			DramUKfluid2FluidOunceUSfluid();
		}
		if(choice1 == 6 && choice2 == 10){
			DramUKfluid2FluidOunceUKfluid();
		}
		if(choice1 == 6 && choice2 == 11){
			DramUKfluid2GallonUSfluid();
		}
		if(choice1 == 6 && choice2 == 12){
			DramUKfluid2GallonUSdry();
		}
		if(choice1 == 6 && choice2 == 13){
			DramUKfluid2GallonUK();
		}
		if(choice1 == 6 && choice2 == 14){
			DramUKfluid2GillUS();
		}
		if(choice1 == 6 && choice2 == 15){
			DramUKfluid2GillUK();
		}
		if(choice1 == 6 && choice2 == 16){
			DramUKfluid2Liter();
		}
		if(choice1 == 6 && choice2 == 17){
			DramUKfluid2ML();
		}
		if(choice1 == 6 && choice2 == 18){
			DramUKfluid2PintUSfluid();
		}
		if(choice1 == 6 && choice2 == 19){
			DramUKfluid2PintUSdry();
		}
		if(choice1 == 6 && choice2 == 20){
			DramUKfluid2PintUK();
		}
		if(choice1 == 6 && choice2 == 21){
			DramUKfluid2QuartUSfluid();
		}
		if(choice1 == 6 && choice2 == 22){
			DramUKfluid2QuartUSdry();
		}
		if(choice1 == 6 && choice2 == 23){
			DramUKfluid2QuartUK();
		}
		if(choice1 == 6 && choice2 == 24){
			DramUKfluid2tbspUS();
		}
		if(choice1 == 6 && choice2 == 25){
			DramUKfluid2tbspFDA();
		}
		if(choice1 == 6 && choice2 == 26){
			DramUKfluid2tspUS();
		}
		if(choice1 == 6 && choice2 == 27){
			DramUKfluid2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Drop Conversion Choices------------------\\
		if(choice1 == 7 && choice2 == 1){
			Drop2CupUS();
		}
		if(choice1 == 7 && choice2 == 2){
			Drop2Dash();
		}
		if(choice1 == 7 && choice2 == 3){
			Drop2DessertSpoonUS();
		}
		if(choice1 == 7 && choice2 == 4){
			Drop2DessertSpoonUK();
		}
		if(choice1 == 7 && choice2 == 5){
			Drop2DramUSfluid();
		}
		if(choice1 == 7 && choice2 == 6){
			Drop2DramUKfluid();
		}
		if(choice1 == 7 && choice2 == 7){
			Drop2Drop();
		}
		if(choice1 == 7 && choice2 == 8){
			Drop2Fifth();
		}
		if(choice1 == 7 && choice2 == 9){
			Drop2FluidOunceUSfluid();
		}
		if(choice1 == 7 && choice2 == 10){
			Drop2FluidOunceUKfluid();
		}
		if(choice1 == 7 && choice2 == 11){
			Drop2GallonUSfluid();
		}
		if(choice1 == 7 && choice2 == 12){
			Drop2GallonUSdry();
		}
		if(choice1 == 7 && choice2 == 13){
			Drop2GallonUK();
		}
		if(choice1 == 7 && choice2 == 14){
			Drop2GillUS();
		}
		if(choice1 == 7 && choice2 == 15){
			Drop2GillUK();
		}
		if(choice1 == 7 && choice2 == 16){
			Drop2Liter();
		}
		if(choice1 == 7 && choice2 == 17){
			Drop2ML();
		}
		if(choice1 == 7 && choice2 == 18){
			Drop2PintUSfluid();
		}
		if(choice1 == 7 && choice2 == 19){
			Drop2PintUSdry();
		}
		if(choice1 == 7 && choice2 == 20){
			Drop2PintUK();
		}
		if(choice1 == 7 && choice2 == 21){
			Drop2QuartUSfluid();
		}
		if(choice1 == 7 && choice2 == 22){
			Drop2QuartUSdry();
		}
		if(choice1 == 7 && choice2 == 23){
			Drop2QuartUK();
		}
		if(choice1 == 7 && choice2 == 24){
			Drop2tbspUS();
		}
		if(choice1 == 7 && choice2 == 25){
			Drop2tbspFDA();
		}
		if(choice1 == 7 && choice2 == 26){
			Drop2tspUS();
		}
		if(choice1 == 7 && choice2 == 27){
			Drop2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Fifth Conversion Choices------------------\\
		if(choice1 == 8 && choice2 == 1){
			Fifth2CupUS();
		}
		if(choice1 == 8 && choice2 == 2){
			Fifth2Dash();
		}
		if(choice1 == 8 && choice2 == 3){
			Fifth2DessertSpoonUS();
		}
		if(choice1 == 8 && choice2 == 4){
			Fifth2DessertSpoonUK();
		}
		if(choice1 == 8 && choice2 == 5){
			Fifth2DramUSfluid();
		}
		if(choice1 == 8 && choice2 == 6){
			Fifth2DramUKfluid();
		}
		if(choice1 == 8 && choice2 == 7){
			Fifth2Drop();
		}
		if(choice1 == 8 && choice2 == 8){
			Fifth2Fifth();
		}
		if(choice1 == 8 && choice2 == 9){
			Fifth2FluidOunceUSfluid();
		}
		if(choice1 == 8 && choice2 == 10){
			Fifth2FluidOunceUKfluid();
		}
		if(choice1 == 8 && choice2 == 11){
			Fifth2GallonUSfluid();
		}
		if(choice1 == 8 && choice2 == 12){
			Fifth2GallonUSdry();
		}
		if(choice1 == 8 && choice2 == 13){
			Fifth2GallonUK();
		}
		if(choice1 == 8 && choice2 == 14){
			Fifth2GillUS();
		}
		if(choice1 == 8 && choice2 == 15){
			Fifth2GillUK();
		}
		if(choice1 == 8 && choice2 == 16){
			Fifth2Liter();
		}
		if(choice1 == 8 && choice2 == 17){
			Fifth2ML();
		}
		if(choice1 == 8 && choice2 == 18){
			Fifth2PintUSfluid();
		}
		if(choice1 == 8 && choice2 == 19){
			Fifth2PintUSdry();
		}
		if(choice1 == 8 && choice2 == 20){
			Fifth2PintUK();
		}
		if(choice1 == 8 && choice2 == 21){
			Fifth2QuartUSfluid();
		}
		if(choice1 == 8 && choice2 == 22){
			Fifth2QuartUSdry();
		}
		if(choice1 == 8 && choice2 == 23){
			Fifth2QuartUK();
		}
		if(choice1 == 8 && choice2 == 24){
			Fifth2tbspUS();
		}
		if(choice1 == 8 && choice2 == 25){
			Fifth2tbspFDA();
		}
		if(choice1 == 8 && choice2 == 26){
			Fifth2tspUS();
		}
		if(choice1 == 8 && choice2 == 27){
			Fifth2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------FluidOunce[US,Fluid] Conversion Choices------------------\\
		if(choice1 == 9 && choice2 == 1){
			FOUS2CupUS();
		}
		if(choice1 == 9 && choice2 == 2){
			FOUS2Dash();
		}
		if(choice1 == 9 && choice2 == 3){
			FOUS2DessertSpoonUS();
		}
		if(choice1 == 9 && choice2 == 4){
			FOUS2DessertSpoonUK();
		}
		if(choice1 == 9 && choice2 == 5){
			FOUS2DramUSfluid();
		}
		if(choice1 == 9 && choice2 == 6){
			FOUS2DramUKfluid();
		}
		if(choice1 == 9 && choice2 == 7){
			FOUS2Drop();
		}
		if(choice1 == 9 && choice2 == 8){
			FOUS2Fifth();
		}
		if(choice1 == 9 && choice2 == 9){
			FOUS2FluidOunceUSfluid();
		}
		if(choice1 == 9 && choice2 == 10){
			FOUS2FluidOunceUKfluid();
		}
		if(choice1 == 9 && choice2 == 11){
			FOUS2GallonUSfluid();
		}
		if(choice1 == 9 && choice2 == 12){
			FOUS2GallonUSdry();
		}
		if(choice1 == 9 && choice2 == 13){
			FOUS2GallonUK();
		}
		if(choice1 == 9 && choice2 == 14){
			FOUS2GillUS();
		}
		if(choice1 == 9 && choice2 == 15){
			FOUS2GillUK();
		}
		if(choice1 == 9 && choice2 == 16){
			FOUS2Liter();
		}
		if(choice1 == 9 && choice2 == 17){
			FOUS2ML();
		}
		if(choice1 == 9 && choice2 == 18){
			FOUS2PintUSfluid();
		}
		if(choice1 == 9 && choice2 == 19){
			FOUS2PintUSdry();
		}
		if(choice1 == 9 && choice2 == 20){
			FOUS2PintUK();
		}
		if(choice1 == 9 && choice2 == 21){
			FOUS2QuartUSfluid();
		}
		if(choice1 == 9 && choice2 == 22){
			FOUS2QuartUSdry();
		}
		if(choice1 == 9 && choice2 == 23){
			FOUS2QuartUK();
		}
		if(choice1 == 9 && choice2 == 24){
			FOUS2tbspUS();
		}
		if(choice1 == 9 && choice2 == 25){
			FOUS2tbspFDA();
		}
		if(choice1 == 9 && choice2 == 26){
			FOUS2tspUS();
		}
		if(choice1 == 9 && choice2 == 27){
			FOUS2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------FluidOunce[UK,Fluid] Conversion Choices------------------\\
		if(choice1 == 10 && choice2 == 1){
			FOUK2CupUS();
		}
		if(choice1 == 10 && choice2 == 2){
			FOUK2Dash();
		}
		if(choice1 == 10 && choice2 == 3){
			FOUK2DessertSpoonUS();
		}
		if(choice1 == 10 && choice2 == 4){
			FOUK2DessertSpoonUK();
		}
		if(choice1 == 10 && choice2 == 5){
			FOUK2DramUSfluid();
		}
		if(choice1 == 10 && choice2 == 6){
			FOUK2DramUKfluid();
		}
		if(choice1 == 10 && choice2 == 7){
			FOUK2Drop();
		}
		if(choice1 == 10 && choice2 == 8){
			FOUK2Fifth();
		}
		if(choice1 == 10 && choice2 == 9){
			FOUK2FluidOunceUSfluid();
		}
		if(choice1 == 10 && choice2 == 10){
			FOUK2FluidOunceUKfluid();
		}
		if(choice1 == 10 && choice2 == 11){
			FOUK2GallonUSfluid();
		}
		if(choice1 == 10 && choice2 == 12){
			FOUK2GallonUSdry();
		}
		if(choice1 == 10 && choice2 == 13){
			FOUK2GallonUK();
		}
		if(choice1 == 10 && choice2 == 14){
			FOUK2GillUS();
		}
		if(choice1 == 10 && choice2 == 15){
			FOUK2GillUK();
		}
		if(choice1 == 10 && choice2 == 16){
			FOUK2Liter();
		}
		if(choice1 == 10 && choice2 == 17){
			FOUK2ML();
		}
		if(choice1 == 10 && choice2 == 18){
			FOUK2PintUSfluid();
		}
		if(choice1 == 10 && choice2 == 19){
			FOUK2PintUSdry();
		}
		if(choice1 == 10 && choice2 == 20){
			FOUK2PintUK();
		}
		if(choice1 == 10 && choice2 == 21){
			FOUK2QuartUSfluid();
		}
		if(choice1 == 10 && choice2 == 22){
			FOUK2QuartUSdry();
		}
		if(choice1 == 10 && choice2 == 23){
			FOUK2QuartUK();
		}
		if(choice1 == 10 && choice2 == 24){
			FOUK2tbspUS();
		}
		if(choice1 == 10 && choice2 == 25){
			FOUK2tbspFDA();
		}
		if(choice1 == 10 && choice2 == 26){
			FOUK2tspUS();
		}
		if(choice1 == 10 && choice2 == 27){
			FOUK2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Gallon[US,Dry] Conversion Choices------------------\\
		if(choice1 == 11 && choice2 == 1){
			GallonUSdry2CupUS();
		}
		if(choice1 == 11 && choice2 == 2){
			GallonUSdry2Dash();
		}
		if(choice1 == 11 && choice2 == 3){
			GallonUSdry2DessertSpoonUS();
		}
		if(choice1 == 11 && choice2 == 4){
			GallonUSdry2DessertSpoonUK();
		}
		if(choice1 == 11 && choice2 == 5){
			GallonUSdry2DramUSfluid();
		}
		if(choice1 == 11 && choice2 == 6){
			GallonUSdry2DramUKfluid();
		}
		if(choice1 == 11 && choice2 == 7){
			GallonUSdry2Drop();
		}
		if(choice1 == 11 && choice2 == 8){
			GallonUSdry2Fifth();
		}
		if(choice1 == 11 && choice2 == 9){
			GallonUSdry2FluidOunceUSfluid();
		}
		if(choice1 == 11 && choice2 == 10){
			GallonUSdry2FluidOunceUKfluid();
		}
		if(choice1 == 11 && choice2 == 11){
			GallonUSdry2GallonUSfluid();
		}
		if(choice1 == 11 && choice2 == 12){
			GallonUSdry2GallonUSdry();
		}
		if(choice1 == 11 && choice2 == 13){
			GallonUSdry2GallonUK();
		}
		if(choice1 == 11 && choice2 == 14){
			GallonUSdry2GillUS();
		}
		if(choice1 == 11 && choice2 == 15){
			GallonUSdry2GillUK();
		}
		if(choice1 == 11 && choice2 == 16){
			GallonUSdry2Liter();
		}
		if(choice1 == 11 && choice2 == 17){
			GallonUSdry2ML();
		}
		if(choice1 == 11 && choice2 == 18){
			GallonUSdry2PintUSfluid();
		}
		if(choice1 == 11 && choice2 == 19){
			GallonUSdry2PintUSdry();
		}
		if(choice1 == 11 && choice2 == 20){
			GallonUSdry2PintUK();
		}
		if(choice1 == 11 && choice2 == 21){
			GallonUSdry2QuartUSfluid();
		}
		if(choice1 == 11 && choice2 == 22){
			GallonUSdry2QuartUSdry();
		}
		if(choice1 == 11 && choice2 == 23){
			GallonUSdry2QuartUK();
		}
		if(choice1 == 11 && choice2 == 24){
			GallonUSdry2tbspUS();
		}
		if(choice1 == 11 && choice2 == 25){
			GallonUSdry2tbspFDA();
		}
		if(choice1 == 11 && choice2 == 26){
			GallonUSdry2tspUS();
		}
		if(choice1 == 11 && choice2 == 27){
			GallonUSdry2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Gallon[US,Fluid] Conversion Choices------------------\\
		if(choice1 == 12 && choice2 == 1){
			GallonUSfluid2CupUS();
		}
		if(choice1 == 12 && choice2 == 2){
			GallonUSfluid2Dash();
		}
		if(choice1 == 12 && choice2 == 3){
			GallonUSfluid2DessertSpoonUS();
		}
		if(choice1 == 12 && choice2 == 4){
			GallonUSfluid2DessertSpoonUK();
		}
		if(choice1 == 12 && choice2 == 5){
			GallonUSfluid2DramUSfluid();
		}
		if(choice1 == 12 && choice2 == 6){
			GallonUSfluid2DramUKfluid();
		}
		if(choice1 == 12 && choice2 == 7){
			GallonUSfluid2Drop();
		}
		if(choice1 == 12 && choice2 == 8){
			GallonUSfluid2Fifth();
		}
		if(choice1 == 12 && choice2 == 9){
			GallonUSfluid2FluidOunceUSfluid();
		}
		if(choice1 == 12 && choice2 == 10){
			GallonUSfluid2FluidOunceUKfluid();
		}
		if(choice1 == 12 && choice2 == 11){
			GallonUSfluid2GallonUSfluid();
		}
		if(choice1 == 12 && choice2 == 12){
			GallonUSfluid2GallonUSdry();
		}
		if(choice1 == 12 && choice2 == 13){
			GallonUSfluid2GallonUK();
		}
		if(choice1 == 12 && choice2 == 14){
			GallonUSfluid2GillUS();
		}
		if(choice1 == 12 && choice2 == 15){
			GallonUSfluid2GillUK();
		}
		if(choice1 == 12 && choice2 == 16){
			GallonUSfluid2Liter();
		}
		if(choice1 == 12 && choice2 == 17){
			GallonUSfluid2ML();
		}
		if(choice1 == 12 && choice2 == 18){
			GallonUSfluid2PintUSfluid();
		}
		if(choice1 == 12 && choice2 == 19){
			GallonUSfluid2PintUSdry();
		}
		if(choice1 == 12 && choice2 == 20){
			GallonUSfluid2PintUK();
		}
		if(choice1 == 12 && choice2 == 21){
			GallonUSfluid2QuartUSfluid();
		}
		if(choice1 == 12 && choice2 == 22){
			GallonUSfluid2QuartUSdry();
		}
		if(choice1 == 12 && choice2 == 23){
			GallonUSfluid2QuartUK();
		}
		if(choice1 == 12 && choice2 == 24){
			GallonUSfluid2tbspUS();
		}
		if(choice1 == 12 && choice2 == 25){
			GallonUSfluid2tbspFDA();
		}
		if(choice1 == 12 && choice2 == 26){
			GallonUSfluid2tspUS();
		}
		if(choice1 == 12 && choice2 == 27){
			GallonUSfluid2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Gallon[UK] Conversion Choices------------------\\
		if(choice1 == 13 && choice2 == 1){
			GallonUK2CupUS();
		}
		if(choice1 == 13 && choice2 == 2){
			GallonUK2Dash();
		}
		if(choice1 == 13 && choice2 == 3){
			GallonUK2DessertSpoonUS();
		}
		if(choice1 == 13 && choice2 == 4){
			GallonUK2DessertSpoonUK();
		}
		if(choice1 == 13 && choice2 == 5){
			GallonUK2DramUSfluid();
		}
		if(choice1 == 13 && choice2 == 6){
			GallonUK2DramUKfluid();
		}
		if(choice1 == 13 && choice2 == 7){
			GallonUK2Drop();
		}
		if(choice1 == 13 && choice2 == 8){
			GallonUK2Fifth();
		}
		if(choice1 == 13 && choice2 == 9){
			GallonUK2FluidOunceUSfluid();
		}
		if(choice1 == 13 && choice2 == 10){
			GallonUK2FluidOunceUKfluid();
		}
		if(choice1 == 13 && choice2 == 11){
			GallonUK2GallonUSfluid();
		}
		if(choice1 == 13 && choice2 == 12){
			GallonUK2GallonUSdry();
		}
		if(choice1 == 13 && choice2 == 13){
			GallonUK2GallonUK();
		}
		if(choice1 == 13 && choice2 == 14){
			GallonUK2GillUS();
		}
		if(choice1 == 13 && choice2 == 15){
			GallonUK2GillUK();
		}
		if(choice1 == 13 && choice2 == 16){
			GallonUK2Liter();
		}
		if(choice1 == 13 && choice2 == 17){
			GallonUK2ML();
		}
		if(choice1 == 13 && choice2 == 18){
			GallonUK2PintUSfluid();
		}
		if(choice1 == 13 && choice2 == 19){
			GallonUK2PintUSdry();
		}
		if(choice1 == 13 && choice2 == 20){
			GallonUK2PintUK();
		}
		if(choice1 == 13 && choice2 == 21){
			GallonUK2QuartUSfluid();
		}
		if(choice1 == 13 && choice2 == 22){
			GallonUK2QuartUSdry();
		}
		if(choice1 == 13 && choice2 == 23){
			GallonUK2QuartUK();
		}
		if(choice1 == 13 && choice2 == 24){
			GallonUK2tbspUS();
		}
		if(choice1 == 13 && choice2 == 25){
			GallonUK2tbspFDA();
		}
		if(choice1 == 13 && choice2 == 26){
			GallonUK2tspUS();
		}
		if(choice1 == 13 && choice2 == 27){
			GallonUK2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Gill[US] Conversion Choices------------------\\
		if(choice1 == 14 && choice2 == 1){
			GillUS2CupUS();
		}
		if(choice1 == 14 && choice2 == 2){
			GillUS2Dash();
		}
		if(choice1 == 14 && choice2 == 3){
			GillUS2DessertSpoonUS();
		}
		if(choice1 == 14 && choice2 == 4){
			GillUS2DessertSpoonUK();
		}
		if(choice1 == 14 && choice2 == 5){
			GillUS2DramUSfluid();
		}
		if(choice1 == 14 && choice2 == 6){
			GillUS2DramUKfluid();
		}
		if(choice1 == 14 && choice2 == 7){
			GillUS2Drop();
		}
		if(choice1 == 14 && choice2 == 8){
			GillUS2Fifth();
		}
		if(choice1 == 14 && choice2 == 9){
			GillUS2FluidOunceUSfluid();
		}
		if(choice1 == 14 && choice2 == 10){
			GillUS2FluidOunceUKfluid();
		}
		if(choice1 == 14 && choice2 == 11){
			GillUS2GallonUSfluid();
		}
		if(choice1 == 14 && choice2 == 12){
			GillUS2GallonUSdry();
		}
		if(choice1 == 14 && choice2 == 13){
			GillUS2GallonUK();
		}
		if(choice1 == 14 && choice2 == 14){
			GillUS2GillUS();
		}
		if(choice1 == 14 && choice2 == 15){
			GillUS2GillUK();
		}
		if(choice1 == 14 && choice2 == 16){
			GillUS2Liter();
		}
		if(choice1 == 14 && choice2 == 17){
			GillUS2ML();
		}
		if(choice1 == 14 && choice2 == 18){
			GillUS2PintUSfluid();
		}
		if(choice1 == 14 && choice2 == 19){
			GillUS2PintUSdry();
		}
		if(choice1 == 14 && choice2 == 20){
			GillUS2PintUK();
		}
		if(choice1 == 14 && choice2 == 21){
			GillUS2QuartUSfluid();
		}
		if(choice1 == 14 && choice2 == 22){
			GillUS2QuartUSdry();
		}
		if(choice1 == 14 && choice2 == 23){
			GillUS2QuartUK();
		}
		if(choice1 == 14 && choice2 == 24){
			GillUS2tbspUS();
		}
		if(choice1 == 14 && choice2 == 25){
			GillUS2tbspFDA();
		}
		if(choice1 == 14 && choice2 == 26){
			GillUS2tspUS();
		}
		if(choice1 == 14 && choice2 == 27){
			GillUS2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Gill[UK] Conversion Choices------------------\\
		if(choice1 == 15 && choice2 == 1){
			GillUK2CupUS();
		}
		if(choice1 == 15 && choice2 == 2){
			GillUK2Dash();
		}
		if(choice1 == 15 && choice2 == 3){
			GillUK2DessertSpoonUS();
		}
		if(choice1 == 15 && choice2 == 4){
			GillUK2DessertSpoonUK();
		}
		if(choice1 == 15 && choice2 == 5){
			GillUK2DramUSfluid();
		}
		if(choice1 == 15 && choice2 == 6){
			GillUK2DramUKfluid();
		}
		if(choice1 == 15 && choice2 == 7){
			GillUK2Drop();
		}
		if(choice1 == 15 && choice2 == 8){
			GillUK2Fifth();
		}
		if(choice1 == 15 && choice2 == 9){
			GillUK2FluidOunceUSfluid();
		}
		if(choice1 == 15 && choice2 == 10){
			GillUK2FluidOunceUKfluid();
		}
		if(choice1 == 15 && choice2 == 11){
			GillUK2GallonUSfluid();
		}
		if(choice1 == 15 && choice2 == 12){
			GillUK2GallonUSdry();
		}
		if(choice1 == 15 && choice2 == 13){
			GillUK2GallonUK();
		}
		if(choice1 == 15 && choice2 == 14){
			GillUK2GillUS();
		}
		if(choice1 == 15 && choice2 == 15){
			GillUK2GillUK();
		}
		if(choice1 == 15 && choice2 == 16){
			GillUK2Liter();
		}
		if(choice1 == 15 && choice2 == 17){
			GillUK2ML();
		}
		if(choice1 == 15 && choice2 == 18){
			GillUK2PintUSfluid();
		}
		if(choice1 == 15 && choice2 == 19){
			GillUK2PintUSdry();
		}
		if(choice1 == 15 && choice2 == 20){
			GillUK2PintUK();
		}
		if(choice1 == 15 && choice2 == 21){
			GillUK2QuartUSfluid();
		}
		if(choice1 == 15 && choice2 == 22){
			GillUK2QuartUSdry();
		}
		if(choice1 == 15 && choice2 == 23){
			GillUK2QuartUK();
		}
		if(choice1 == 15 && choice2 == 24){
			GillUK2tbspUS();
		}
		if(choice1 == 15 && choice2 == 25){
			GillUK2tbspFDA();
		}
		if(choice1 == 15 && choice2 == 26){
			GillUK2tspUS();
		}
		if(choice1 == 15 && choice2 == 27){
			GillUK2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Liter Conversion Choices------------------\\
		if(choice1 == 16 && choice2 == 1){
			L2CupUS();
		}
		if(choice1 == 16 && choice2 == 2){
			L2Dash();
		}
		if(choice1 == 16 && choice2 == 3){
			L2DessertSpoonUS();
		}
		if(choice1 == 16 && choice2 == 4){
			L2DessertSpoonUK();
		}
		if(choice1 == 16 && choice2 == 5){
			L2DramUSfluid();
		}
		if(choice1 == 16 && choice2 == 6){
			L2DramUKfluid();
		}
		if(choice1 == 16 && choice2 == 7){
			L2Drop();
		}
		if(choice1 == 16 && choice2 == 8){
			L2Fifth();
		}
		if(choice1 == 16 && choice2 == 9){
			L2FluidOunceUSfluid();
		}
		if(choice1 == 16 && choice2 == 10){
			L2FluidOunceUKfluid();
		}
		if(choice1 == 16 && choice2 == 11){
			L2GallonUSfluid();
		}
		if(choice1 == 16 && choice2 == 12){
			L2GallonUSdry();
		}
		if(choice1 == 16 && choice2 == 13){
			L2GallonUK();
		}
		if(choice1 == 16 && choice2 == 14){
			L2GillUS();
		}
		if(choice1 == 16 && choice2 == 15){
			L2GillUK();
		}
		if(choice1 == 16 && choice2 == 16){
			L2Liter();
		}
		if(choice1 == 16 && choice2 == 17){
			L2ML();
		}
		if(choice1 == 16 && choice2 == 18){
			L2PintUSfluid();
		}
		if(choice1 == 16 && choice2 == 19){
			L2PintUSdry();
		}
		if(choice1 == 16 && choice2 == 20){
			L2PintUK();
		}
		if(choice1 == 16 && choice2 == 21){
			L2QuartUSfluid();
		}
		if(choice1 == 16 && choice2 == 22){
			L2QuartUSdry();
		}
		if(choice1 == 16 && choice2 == 23){
			L2QuartUK();
		}
		if(choice1 == 16 && choice2 == 24){
			L2tbspUS();
		}
		if(choice1 == 16 && choice2 == 25){
			L2tbspFDA();
		}
		if(choice1 == 16 && choice2 == 26){
			L2tspUS();
		}
		if(choice1 == 16 && choice2 == 27){
			L2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Milliliter Conversion Choices------------------\\
		if(choice1 == 17 && choice2 == 1){
			ML2CupUS();
		}
		if(choice1 == 17 && choice2 == 2){
			ML2Dash();
		}
		if(choice1 == 17 && choice2 == 3){
			ML2DessertSpoonUS();
		}
		if(choice1 == 17 && choice2 == 4){
			ML2DessertSpoonUK();
		}
		if(choice1 == 17 && choice2 == 5){
			ML2DramUSfluid();
		}
		if(choice1 == 17 && choice2 == 6){
			ML2DramUKfluid();
		}
		if(choice1 == 17 && choice2 == 7){
			ML2Drop();
		}
		if(choice1 == 17 && choice2 == 8){
			ML2Fifth();
		}
		if(choice1 == 17 && choice2 == 9){
			ML2FluidOunceUSfluid();
		}
		if(choice1 == 17 && choice2 == 10){
			ML2FluidOunceUKfluid();
		}
		if(choice1 == 17 && choice2 == 11){
			ML2GallonUSfluid();
		}
		if(choice1 == 17 && choice2 == 12){
			ML2GallonUSdry();
		}
		if(choice1 == 17 && choice2 == 13){
			ML2GallonUK();
		}
		if(choice1 == 17 && choice2 == 14){
			ML2GillUS();
		}
		if(choice1 == 17 && choice2 == 15){
			ML2GillUK();
		}
		if(choice1 == 17 && choice2 == 16){
			ML2Liter();
		}
		if(choice1 == 17 && choice2 == 17){
			ML2ML();
		}
		if(choice1 == 17 && choice2 == 18){
			ML2PintUSfluid();
		}
		if(choice1 == 17 && choice2 == 19){
			ML2PintUSdry();
		}
		if(choice1 == 17 && choice2 == 20){
			ML2PintUK();
		}
		if(choice1 == 17 && choice2 == 21){
			ML2QuartUSfluid();
		}
		if(choice1 == 17 && choice2 == 22){
			ML2QuartUSdry();
		}
		if(choice1 == 17 && choice2 == 23){
			ML2QuartUK();
		}
		if(choice1 == 17 && choice2 == 24){
			ML2tbspUS();
		}
		if(choice1 == 17 && choice2 == 25){
			ML2tbspFDA();
		}
		if(choice1 == 17 && choice2 == 26){
			ML2tspUS();
		}
		if(choice1 == 17 && choice2 == 27){
			ML2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Pint[US,Fluid] Conversion Choices------------------\\
		if(choice1 == 18 && choice2 == 1){
			PintUSfluid2CupUS();
		}
		if(choice1 == 18 && choice2 == 2){
			PintUSfluid2Dash();
		}
		if(choice1 == 18 && choice2 == 3){
			PintUSfluid2DessertSpoonUS();
		}
		if(choice1 == 18 && choice2 == 4){
			PintUSfluid2DessertSpoonUK();
		}
		if(choice1 == 18 && choice2 == 5){
			PintUSfluid2DramUSfluid();
		}
		if(choice1 == 18 && choice2 == 6){
			PintUSfluid2DramUKfluid();
		}
		if(choice1 == 18 && choice2 == 7){
			PintUSfluid2Drop();
		}
		if(choice1 == 18 && choice2 == 8){
			PintUSfluid2Fifth();
		}
		if(choice1 == 18 && choice2 == 9){
			PintUSfluid2FluidOunceUSfluid();
		}
		if(choice1 == 18 && choice2 == 10){
			PintUSfluid2FluidOunceUKfluid();
		}
		if(choice1 == 18 && choice2 == 11){
			PintUSfluid2GallonUSfluid();
		}
		if(choice1 == 18 && choice2 == 12){
			PintUSfluid2GallonUSdry();
		}
		if(choice1 == 18 && choice2 == 13){
			PintUSfluid2GallonUK();
		}
		if(choice1 == 18 && choice2 == 14){
			PintUSfluid2GillUS();
		}
		if(choice1 == 18 && choice2 == 15){
			PintUSfluid2GillUK();
		}
		if(choice1 == 18 && choice2 == 16){
			PintUSfluid2Liter();
		}
		if(choice1 == 18 && choice2 == 17){
			PintUSfluid2ML();
		}
		if(choice1 == 18 && choice2 == 18){
			PintUSfluid2PintUSfluid();
		}
		if(choice1 == 18 && choice2 == 19){
			PintUSfluid2PintUSdry();
		}
		if(choice1 == 18 && choice2 == 20){
			PintUSfluid2PintUK();
		}
		if(choice1 == 18 && choice2 == 21){
			PintUSfluid2QuartUSfluid();
		}
		if(choice1 == 18 && choice2 == 22){
			PintUSfluid2QuartUSdry();
		}
		if(choice1 == 18 && choice2 == 23){
			PintUSfluid2QuartUK();
		}
		if(choice1 == 18 && choice2 == 24){
			PintUSfluid2tbspUS();
		}
		if(choice1 == 18 && choice2 == 25){
			PintUSfluid2tbspFDA();
		}
		if(choice1 == 18 && choice2 == 26){
			PintUSfluid2tspUS();
		}
		if(choice1 == 18 && choice2 == 27){
			PintUSfluid2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Pint[US,Dry] Conversion Choices------------------\\
		if(choice1 == 19 && choice2 == 1){
			PintUSdry2CupUS();
		}
		if(choice1 == 19 && choice2 == 2){
			PintUSdry2Dash();
		}
		if(choice1 == 19 && choice2 == 3){
			PintUSdry2DessertSpoonUS();
		}
		if(choice1 == 19 && choice2 == 4){
			PintUSdry2DessertSpoonUK();
		}
		if(choice1 == 19 && choice2 == 5){
			PintUSdry2DramUSfluid();
		}
		if(choice1 == 19 && choice2 == 6){
			PintUSdry2DramUKfluid();
		}
		if(choice1 == 19 && choice2 == 7){
			PintUSdry2Drop();
		}
		if(choice1 == 19 && choice2 == 8){
			PintUSdry2Fifth();
		}
		if(choice1 == 19 && choice2 == 9){
			PintUSdry2FluidOunceUSfluid();
		}
		if(choice1 == 19 && choice2 == 10){
			PintUSdry2FluidOunceUKfluid();
		}
		if(choice1 == 19 && choice2 == 11){
			PintUSdry2GallonUSfluid();
		}
		if(choice1 == 19 && choice2 == 12){
			PintUSdry2GallonUSdry();
		}
		if(choice1 == 19 && choice2 == 13){
			PintUSdry2GallonUK();
		}
		if(choice1 == 19 && choice2 == 14){
			PintUSdry2GillUS();
		}
		if(choice1 == 19 && choice2 == 15){
			PintUSdry2GillUK();
		}
		if(choice1 == 19 && choice2 == 16){
			PintUSdry2Liter();
		}
		if(choice1 == 19 && choice2 == 17){
			PintUSdry2ML();
		}
		if(choice1 == 19 && choice2 == 18){
			PintUSdry2PintUSfluid();
		}
		if(choice1 == 19 && choice2 == 19){
			PintUSdry2PintUSdry();
		}
		if(choice1 == 19 && choice2 == 20){
			PintUSdry2PintUK();
		}
		if(choice1 == 19 && choice2 == 21){
			PintUSdry2QuartUSfluid();
		}
		if(choice1 == 19 && choice2 == 22){
			PintUSdry2QuartUSdry();
		}
		if(choice1 == 19 && choice2 == 23){
			PintUSdry2QuartUK();
		}
		if(choice1 == 19 && choice2 == 24){
			PintUSdry2tbspUS();
		}
		if(choice1 == 19 && choice2 == 25){
			PintUSdry2tbspFDA();
		}
		if(choice1 == 19 && choice2 == 26){
			PintUSdry2tspUS();
		}
		if(choice1 == 19 && choice2 == 27){
			PintUSdry2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Pint[UK] Conversion Choices------------------\\
		if(choice1 == 20 && choice2 == 1){
			PintUK2CupUS();
		}
		if(choice1 == 20 && choice2 == 2){
			PintUK2Dash();
		}
		if(choice1 == 20 && choice2 == 3){
			PintUK2DessertSpoonUS();
		}
		if(choice1 == 20 && choice2 == 4){
			PintUK2DessertSpoonUK();
		}
		if(choice1 == 20 && choice2 == 5){
			PintUK2DramUSfluid();
		}
		if(choice1 == 20 && choice2 == 6){
			PintUK2DramUKfluid();
		}
		if(choice1 == 20 && choice2 == 7){
			PintUK2Drop();
		}
		if(choice1 == 20 && choice2 == 8){
			PintUK2Fifth();
		}
		if(choice1 == 20 && choice2 == 9){
			PintUK2FluidOunceUSfluid();
		}
		if(choice1 == 20 && choice2 == 10){
			PintUK2FluidOunceUKfluid();
		}
		if(choice1 == 20 && choice2 == 11){
			PintUK2GallonUSfluid();
		}
		if(choice1 == 20 && choice2 == 12){
			PintUK2GallonUSdry();
		}
		if(choice1 == 20 && choice2 == 13){
			PintUK2GallonUK();
		}
		if(choice1 == 20 && choice2 == 14){
			PintUK2GillUS();
		}
		if(choice1 == 20 && choice2 == 15){
			PintUK2GillUK();
		}
		if(choice1 == 20 && choice2 == 16){
			PintUK2Liter();
		}
		if(choice1 == 20 && choice2 == 17){
			PintUK2ML();
		}
		if(choice1 == 20 && choice2 == 18){
			PintUK2PintUSfluid();
		}
		if(choice1 == 20 && choice2 == 19){
			PintUK2PintUSdry();
		}
		if(choice1 == 20 && choice2 == 20){
			PintUK2PintUK();
		}
		if(choice1 == 20 && choice2 == 21){
			PintUK2QuartUSfluid();
		}
		if(choice1 == 20 && choice2 == 22){
			PintUK2QuartUSdry();
		}
		if(choice1 == 20 && choice2 == 23){
			PintUK2QuartUK();
		}
		if(choice1 == 20 && choice2 == 24){
			PintUK2tbspUS();
		}
		if(choice1 == 20 && choice2 == 25){
			PintUK2tbspFDA();
		}
		if(choice1 == 20 && choice2 == 26){
			PintUK2tspUS();
		}
		if(choice1 == 20 && choice2 == 27){
			PintUK2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Quart[US,fluid] Conversion Choices------------------\\
		if(choice1 == 21 && choice2 == 1){
			QuartUSfluid2CupUS();
		}
		if(choice1 == 21 && choice2 == 2){
			QuartUSfluid2Dash();
		}
		if(choice1 == 21 && choice2 == 3){
			QuartUSfluid2DessertSpoonUS();
		}
		if(choice1 == 21 && choice2 == 4){
			QuartUSfluid2DessertSpoonUK();
		}
		if(choice1 == 21 && choice2 == 5){
			QuartUSfluid2DramUSfluid();
		}
		if(choice1 == 21 && choice2 == 6){
			QuartUSfluid2DramUKfluid();
		}
		if(choice1 == 21 && choice2 == 7){
			QuartUSfluid2Drop();
		}
		if(choice1 == 21 && choice2 == 8){
			QuartUSfluid2Fifth();
		}
		if(choice1 == 21 && choice2 == 9){
			QuartUSfluid2FluidOunceUSfluid();
		}
		if(choice1 == 21 && choice2 == 10){
			QuartUSfluid2FluidOunceUKfluid();
		}
		if(choice1 == 21 && choice2 == 11){
			QuartUSfluid2GallonUSfluid();
		}
		if(choice1 == 21 && choice2 == 12){
			QuartUSfluid2GallonUSdry();
		}
		if(choice1 == 21 && choice2 == 13){
			QuartUSfluid2GallonUK();
		}
		if(choice1 == 21 && choice2 == 14){
			QuartUSfluid2GillUS();
		}
		if(choice1 == 21 && choice2 == 15){
			QuartUSfluid2GillUK();
		}
		if(choice1 == 21 && choice2 == 16){
			QuartUSfluid2Liter();
		}
		if(choice1 == 21 && choice2 == 17){
			QuartUSfluid2ML();
		}
		if(choice1 == 21 && choice2 == 18){
			QuartUSfluid2PintUSfluid();
		}
		if(choice1 == 21 && choice2 == 19){
			QuartUSfluid2PintUSdry();
		}
		if(choice1 == 21 && choice2 == 20){
			QuartUSfluid2PintUK();
		}
		if(choice1 == 21 && choice2 == 21){
			QuartUSfluid2QuartUSfluid();
		}
		if(choice1 == 21 && choice2 == 22){
			QuartUSfluid2QuartUSdry();
		}
		if(choice1 == 21 && choice2 == 23){
			QuartUSfluid2QuartUK();
		}
		if(choice1 == 21 && choice2 == 24){
			QuartUSfluid2tbspUS();
		}
		if(choice1 == 21 && choice2 == 25){
			QuartUSfluid2tbspFDA();
		}
		if(choice1 == 21 && choice2 == 26){
			QuartUSfluid2tspUS();
		}
		if(choice1 == 21 && choice2 == 27){
			QuartUSfluid2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Quart[US,Dry] Conversion Choices------------------\\
		if(choice1 == 22 && choice2 == 1){
			QuartUSdry2CupUS();
		}
		if(choice1 == 22 && choice2 == 2){
			QuartUSdry2Dash();
		}
		if(choice1 == 22 && choice2 == 3){
			QuartUSdry2DessertSpoonUS();
		}
		if(choice1 == 22 && choice2 == 4){
			QuartUSdry2DessertSpoonUK();
		}
		if(choice1 == 22 && choice2 == 5){
			QuartUSdry2DramUSfluid();
		}
		if(choice1 == 22 && choice2 == 6){
			QuartUSdry2DramUKfluid();
		}
		if(choice1 == 22 && choice2 == 7){
			QuartUSdry2Drop();
		}
		if(choice1 == 22 && choice2 == 8){
			QuartUSdry2Fifth();
		}
		if(choice1 == 22 && choice2 == 9){
			QuartUSdry2FluidOunceUSfluid();
		}
		if(choice1 == 22 && choice2 == 10){
			QuartUSdry2FluidOunceUKfluid();
		}
		if(choice1 == 22 && choice2 == 11){
			QuartUSdry2GallonUSfluid();
		}
		if(choice1 == 22 && choice2 == 12){
			QuartUSdry2GallonUSdry();
		}
		if(choice1 == 22 && choice2 == 13){
			QuartUSdry2GallonUK();
		}
		if(choice1 == 22 && choice2 == 14){
			QuartUSdry2GillUS();
		}
		if(choice1 == 22 && choice2 == 15){
			QuartUSdry2GillUK();
		}
		if(choice1 == 22 && choice2 == 16){
			QuartUSdry2Liter();
		}
		if(choice1 == 22 && choice2 == 17){
			QuartUSdry2ML();
		}
		if(choice1 == 22 && choice2 == 18){
			QuartUSdry2PintUSfluid();
		}
		if(choice1 == 22 && choice2 == 19){
			QuartUSdry2PintUSdry();
		}
		if(choice1 == 22 && choice2 == 20){
			QuartUSdry2PintUK();
		}
		if(choice1 == 22 && choice2 == 21){
			QuartUSdry2QuartUSfluid();
		}
		if(choice1 == 22 && choice2 == 22){
			QuartUSdry2QuartUSdry();
		}
		if(choice1 == 22 && choice2 == 23){
			QuartUSdry2QuartUK();
		}
		if(choice1 == 22 && choice2 == 24){
			QuartUSdry2tbspUS();
		}
		if(choice1 == 22 && choice2 == 25){
			QuartUSdry2tbspFDA();
		}
		if(choice1 == 22 && choice2 == 26){
			QuartUSdry2tspUS();
		}
		if(choice1 == 22 && choice2 == 27){
			QuartUSdry2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Quart[UK] Conversion Choices------------------\\
		if(choice1 == 23 && choice2 == 1){
			QuartUK2CupUS();
		}
		if(choice1 == 23 && choice2 == 2){
			QuartUK2Dash();
		}
		if(choice1 == 23 && choice2 == 3){
			QuartUK2DessertSpoonUS();
		}
		if(choice1 == 23 && choice2 == 4){
			QuartUK2DessertSpoonUK();
		}
		if(choice1 == 23 && choice2 == 5){
			QuartUK2DramUSfluid();
		}
		if(choice1 == 23 && choice2 == 6){
			QuartUK2DramUKfluid();
		}
		if(choice1 == 23 && choice2 == 7){
			QuartUK2Drop();
		}
		if(choice1 == 23 && choice2 == 8){
			QuartUK2Fifth();
		}
		if(choice1 == 23 && choice2 == 9){
			QuartUK2FluidOunceUSfluid();
		}
		if(choice1 == 23 && choice2 == 10){
			QuartUK2FluidOunceUKfluid();
		}
		if(choice1 == 23 && choice2 == 11){
			QuartUK2GallonUSfluid();
		}
		if(choice1 == 23 && choice2 == 12){
			QuartUK2GallonUSdry();
		}
		if(choice1 == 23 && choice2 == 13){
			QuartUK2GallonUK();
		}
		if(choice1 == 23 && choice2 == 14){
			QuartUK2GillUS();
		}
		if(choice1 == 23 && choice2 == 15){
			QuartUK2GillUK();
		}
		if(choice1 == 23 && choice2 == 16){
			QuartUK2Liter();
		}
		if(choice1 == 23 && choice2 == 17){
			QuartUK2ML();
		}
		if(choice1 == 23 && choice2 == 18){
			QuartUK2PintUSfluid();
		}
		if(choice1 == 23 && choice2 == 19){
			QuartUK2PintUSdry();
		}
		if(choice1 == 23 && choice2 == 20){
			QuartUK2PintUK();
		}
		if(choice1 == 23 && choice2 == 21){
			QuartUK2QuartUSfluid();
		}
		if(choice1 == 23 && choice2 == 22){
			QuartUK2QuartUSdry();
		}
		if(choice1 == 23 && choice2 == 23){
			QuartUK2QuartUK();
		}
		if(choice1 == 23 && choice2 == 24){
			QuartUK2tbspUS();
		}
		if(choice1 == 23 && choice2 == 25){
			QuartUK2tbspFDA();
		}
		if(choice1 == 23 && choice2 == 26){
			QuartUK2tspUS();
		}
		if(choice1 == 23 && choice2 == 27){
			QuartUK2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------TableSpoon[US] Conversion Choices------------------\\
		if(choice1 == 24 && choice2 == 1){
			tbspUS2CupUS();
		}
		if(choice1 == 24 && choice2 == 2){
			tbspUS2Dash();
		}
		if(choice1 == 24 && choice2 == 3){
			tbspUS2DessertSpoonUS();
		}
		if(choice1 == 24 && choice2 == 4){
			tbspUS2DessertSpoonUK();
		}
		if(choice1 == 24 && choice2 == 5){
			tbspUS2DramUSfluid();
		}
		if(choice1 == 24 && choice2 == 6){
			tbspUS2DramUKfluid();
		}
		if(choice1 == 24 && choice2 == 7){
			tbspUS2Drop();
		}
		if(choice1 == 24 && choice2 == 8){
			tbspUS2Fifth();
		}
		if(choice1 == 24 && choice2 == 9){
			tbspUS2FluidOunceUSfluid();
		}
		if(choice1 == 24 && choice2 == 10){
			tbspUS2FluidOunceUKfluid();
		}
		if(choice1 == 24 && choice2 == 11){
			tbspUS2GallonUSfluid();
		}
		if(choice1 == 24 && choice2 == 12){
			tbspUS2GallonUSdry();
		}
		if(choice1 == 24 && choice2 == 13){
			tbspUS2GallonUK();
		}
		if(choice1 == 24 && choice2 == 14){
			tbspUS2GillUS();
		}
		if(choice1 == 24 && choice2 == 15){
			tbspUS2GillUK();
		}
		if(choice1 == 24 && choice2 == 16){
			tbspUS2Liter();
		}
		if(choice1 == 24 && choice2 == 17){
			tbspUS2ML();
		}
		if(choice1 == 24 && choice2 == 18){
			tbspUS2PintUSfluid();
		}
		if(choice1 == 24 && choice2 == 19){
			tbspUS2PintUSdry();
		}
		if(choice1 == 24 && choice2 == 20){
			tbspUS2PintUK();
		}
		if(choice1 == 24 && choice2 == 21){
			tbspUS2QuartUSfluid();
		}
		if(choice1 == 24 && choice2 == 22){
			tbspUS2QuartUSdry();
		}
		if(choice1 == 24 && choice2 == 23){
			tbspUS2QuartUK();
		}
		if(choice1 == 24 && choice2 == 24){
			tbspUS2tbspUS();
		}
		if(choice1 == 24 && choice2 == 25){
			tbspUS2tbspFDA();
		}
		if(choice1 == 24 && choice2 == 26){
			tbspUS2tspUS();
		}
		if(choice1 == 24 && choice2 == 27){
			tbspUS2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Table Spoon[Food and Drug Administration] Conversion Choices------------------\\
		if(choice1 == 25 && choice2 == 1){
			tbspFDA2CupUS();
		}
		if(choice1 == 25 && choice2 == 2){
			tbspFDA2Dash();
		}
		if(choice1 == 25 && choice2 == 3){
			tbspFDA2DessertSpoonUS();
		}
		if(choice1 == 25 && choice2 == 4){
			tbspFDA2DessertSpoonUK();
		}
		if(choice1 == 25 && choice2 == 5){
			tbspFDA2DramUSfluid();
		}
		if(choice1 == 25 && choice2 == 6){
			tbspFDA2DramUKfluid();
		}
		if(choice1 == 25 && choice2 == 7){
			tbspFDA2Drop();
		}
		if(choice1 == 25 && choice2 == 8){
			tbspFDA2Fifth();
		}
		if(choice1 == 25 && choice2 == 9){
			tbspFDA2FluidOunceUSfluid();
		}
		if(choice1 == 25 && choice2 == 10){
			tbspFDA2FluidOunceUKfluid();
		}
		if(choice1 == 25 && choice2 == 11){
			tbspFDA2GallonUSfluid();
		}
		if(choice1 == 25 && choice2 == 12){
			tbspFDA2GallonUSdry();
		}
		if(choice1 == 25 && choice2 == 13){
			tbspFDA2GallonUK();
		}
		if(choice1 == 25 && choice2 == 14){
			tbspFDA2GillUS();
		}
		if(choice1 == 25 && choice2 == 15){
			tbspFDA2GillUK();
		}
		if(choice1 == 25 && choice2 == 16){
			tbspFDA2Liter();
		}
		if(choice1 == 25 && choice2 == 17){
			tbspFDA2ML();
		}
		if(choice1 == 25 && choice2 == 18){
			tbspFDA2PintUSfluid();
		}
		if(choice1 == 25 && choice2 == 19){
			tbspFDA2PintUSdry();
		}
		if(choice1 == 25 && choice2 == 20){
			tbspFDA2PintUK();
		}
		if(choice1 == 25 && choice2 == 21){
			tbspFDA2QuartUSfluid();
		}
		if(choice1 == 25 && choice2 == 22){
			tbspFDA2QuartUSdry();
		}
		if(choice1 == 25 && choice2 == 23){
			tbspFDA2QuartUK();
		}
		if(choice1 == 25 && choice2 == 24){
			tbspFDA2tbspUS();
		}
		if(choice1 == 25 && choice2 == 25){
			tbspFDA2tbspFDA();
		}
		if(choice1 == 25 && choice2 == 26){
			tbspFDA2tspUS();
		}
		if(choice1 == 25 && choice2 == 27){
			tbspFDA2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------Teaspoon[US] Conversion Choices------------------\\
		if(choice1 == 26 && choice2 == 1){
			tspUS2CupUS();
		}
		if(choice1 == 26 && choice2 == 2){
			tspUS2Dash();
		}
		if(choice1 == 26 && choice2 == 3){
			tspUS2DessertSpoonUS();
		}
		if(choice1 == 26 && choice2 == 4){
			tspUS2DessertSpoonUK();
		}
		if(choice1 == 26 && choice2 == 5){
			tspUS2DramUSfluid();
		}
		if(choice1 == 26 && choice2 == 6){
			tspUS2DramUKfluid();
		}
		if(choice1 == 26 && choice2 == 7){
			tspUS2Drop();
		}
		if(choice1 == 26 && choice2 == 8){
			tspUS2Fifth();
		}
		if(choice1 == 26 && choice2 == 9){
			tspUS2FluidOunceUSfluid();
		}
		if(choice1 == 26 && choice2 == 10){
			tspUS2FluidOunceUKfluid();
		}
		if(choice1 == 26 && choice2 == 11){
			tspUS2GallonUSfluid();
		}
		if(choice1 == 26 && choice2 == 12){
			tspUS2GallonUSdry();
		}
		if(choice1 == 26 && choice2 == 13){
			tspUS2GallonUK();
		}
		if(choice1 == 26 && choice2 == 14){
			tspUS2GillUS();
		}
		if(choice1 == 26 && choice2 == 15){
			tspUS2GillUK();
		}
		if(choice1 == 26 && choice2 == 16){
			tspUS2Liter();
		}
		if(choice1 == 26 && choice2 == 17){
			tspUS2ML();
		}
		if(choice1 == 26 && choice2 == 18){
			tspUS2PintUSfluid();
		}
		if(choice1 == 26 && choice2 == 19){
			tspUS2PintUSdry();
		}
		if(choice1 == 26 && choice2 == 20){
			tspUS2PintUK();
		}
		if(choice1 == 26 && choice2 == 21){
			tspUS2QuartUSfluid();
		}
		if(choice1 == 26 && choice2 == 22){
			tspUS2QuartUSdry();
		}
		if(choice1 == 26 && choice2 == 23){
			tspUS2QuartUK();
		}
		if(choice1 == 26 && choice2 == 24){
			tspUS2tbspUS();
		}
		if(choice1 == 26 && choice2 == 25){
			tspUS2tbspFDA();
		}
		if(choice1 == 26 && choice2 == 26){
			tspUS2tspUS();
		}
		if(choice1 == 26 && choice2 == 27){
			tspUS2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		//--------------TeaSpoon[FDA] Conversion Choices------------------\\
		if(choice1 == 27 && choice2 == 1){
			tspFDA2CupUS();
		}
		if(choice1 == 27 && choice2 == 2){
			tspFDA2Dash();
		}
		if(choice1 == 27 && choice2 == 3){
			tspFDA2DessertSpoonUS();
		}
		if(choice1 == 27 && choice2 == 4){
			tspFDA2DessertSpoonUK();
		}
		if(choice1 == 27 && choice2 == 5){
			tspFDA2DramUSfluid();
		}
		if(choice1 == 27 && choice2 == 6){
			tspFDA2DramUKfluid();
		}
		if(choice1 == 27 && choice2 == 7){
			tspFDA2Drop();
		}
		if(choice1 == 27 && choice2 == 8){
			tspFDA2Fifth();
		}
		if(choice1 == 27 && choice2 == 9){
			tspFDA2FluidOunceUSfluid();
		}
		if(choice1 == 27 && choice2 == 10){
			tspFDA2FluidOunceUKfluid();
		}
		if(choice1 == 27 && choice2 == 11){
			tspFDA2GallonUSfluid();
		}
		if(choice1 == 27 && choice2 == 12){
			tspFDA2GallonUSdry();
		}
		if(choice1 == 27 && choice2 == 13){
			tspFDA2GallonUK();
		}
		if(choice1 == 27 && choice2 == 14){
			tspFDA2GillUS();
		}
		if(choice1 == 27 && choice2 == 15){
			tspFDA2GillUK();
		}
		if(choice1 == 27 && choice2 == 16){
			tspFDA2Liter();
		}
		if(choice1 == 27 && choice2 == 17){
			tspFDA2ML();
		}
		if(choice1 == 27 && choice2 == 18){
			tspFDA2PintUSfluid();
		}
		if(choice1 == 27 && choice2 == 19){
			tspFDA2PintUSdry();
		}
		if(choice1 == 27 && choice2 == 20){
			tspFDA2PintUK();
		}
		if(choice1 == 27 && choice2 == 21){
			tspFDA2QuartUSfluid();
		}
		if(choice1 == 27 && choice2 == 22){
			tspFDA2QuartUSdry();
		}
		if(choice1 == 27 && choice2 == 23){
			tspFDA2QuartUK();
		}
		if(choice1 == 27 && choice2 == 24){
			tspFDA2tbspUS();
		}
		if(choice1 == 27 && choice2 == 25){
			tspFDA2tbspFDA();
		}
		if(choice1 == 27 && choice2 == 26){
			tspFDA2tspUS();
		}
		if(choice1 == 27 && choice2 == 27){
			tspFDA2tspFDA();
		}
		//`````````````````````````````````````````````````````````\\
		outputUnit();
	}

	public static void outputUnit(){
		System.out.println("\n " + unit +" "+units[choice2-1]);
		System.out.println("Press Enter!");
		scn.next();
	}

	//---------------MilliLiter Conversions-------------------\\
	public static void ML2ML(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void ML2CupUS(){
		unit= unit.multiply(new BigDecimal("0.00422675283773"));
	}
	public static void ML2Dash(){
		unit= unit.multiply(new BigDecimal("1.62307308967"));
	}
	public static void ML2DessertSpoonUS(){
		unit= unit.multiply(new BigDecimal("0.10144206811"));
	}
	public static void ML2DessertSpoonUK(){
		unit= unit.multiply(new BigDecimal("0.0844681564"));
	}
	public static void ML2DramUSfluid(){
		unit= unit.multiply(new BigDecimal("0.2705121816147"));
	}
	public static void ML2DramUKfluid(){
		unit= unit.multiply(new BigDecimal("0.2815606378228"));
	}
	public static void ML2Drop(){
		unit= unit.multiply(new BigDecimal("19.476877076"));
	}
	public static void ML2Fifth(){
		unit= unit.multiply(new BigDecimal("0.0013208602617"));
	}
	public static void ML2FluidOunceUSfluid(){
		unit= unit.multiply(new BigDecimal("0.03381402270184"));
	}
	public static void ML2FluidOunceUKfluid(){
		unit= unit.multiply(new BigDecimal("0.03519507972785"));
	}
	public static void ML2GallonUSfluid(){
		unit= unit.multiply(new BigDecimal("0.00026417205235"));
	}
	public static void ML2GallonUSdry(){
		unit= unit.multiply(new BigDecimal("0.0002270194793043"));
	}
	public static void ML2GallonUK(){
		unit= unit.multiply(new BigDecimal("0.0002199692482991"));
	}
	public static void ML2GillUS(){
		unit= unit.multiply(new BigDecimal("0.008453505675461"));
	}
	public static void ML2GillUK(){
		unit= unit.multiply(new BigDecimal("0.007039015945571"));
	}
	public static void ML2Liter(){
		unit= unit.multiply(new BigDecimal("0.001"));
	}
	public static void ML2PintUSfluid(){
		unit= unit.multiply(new BigDecimal("0.002113376418865"));
	}
	public static void ML2PintUSdry(){
		unit= unit.multiply(new BigDecimal("0.001816155834434"));
	}
	public static void ML2PintUK(){
		unit= unit.multiply(new BigDecimal("0.001759753986393"));
	}
	public static void ML2QuartUSfluid(){
		unit= unit.multiply(new BigDecimal("0.001056688209433"));
	}
	public static void ML2QuartUSdry(){
		unit= unit.multiply(new BigDecimal("0.0009080779172171"));
	}
	public static void ML2QuartUK(){
		unit= unit.multiply(new BigDecimal("0.0008798769931964"));
	}
	public static void ML2tbspUS(){
		unit= unit.multiply(new BigDecimal("0.06762804540369"));
	}
	public static void ML2tbspFDA(){
		unit= unit.multiply(new BigDecimal("0.6666666666667"));
	}
	public static void ML2tspUS(){
		unit= unit.multiply(new BigDecimal("0.2028841362111"));
	}
	public static void ML2tspFDA(){
		unit= unit.multiply(new BigDecimal("0.2"));
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Cup US Conversions-------------------\\
	public static void CupUS2ML(){
		unit= unit.multiply(new BigDecimal("236.5882365"));
	}
	public static void CupUS2CupUS(){
		CupUS2ML();
		ML2CupUS();
	}
	public static void CupUS2Dash(){
		CupUS2ML();
		ML2Dash();
	}
	public static void CupUS2DessertSpoonUS(){
		CupUS2ML();
		ML2DessertSpoonUS();
	}
	public static void CupUS2DessertSpoonUK(){
		CupUS2ML();
		ML2DessertSpoonUK();
	}
	public static void CupUS2DramUSfluid(){
		CupUS2ML();
		ML2DramUSfluid();
	}
	public static void CupUS2DramUKfluid(){
		CupUS2ML();
		ML2DramUKfluid();
	}
	public static void CupUS2Drop(){
		CupUS2ML();
		ML2Drop();
	}
	public static void CupUS2Fifth(){
		CupUS2ML();
		ML2Fifth();
	}
	public static void CupUS2FluidOunceUSfluid(){
		CupUS2ML();
		ML2FluidOunceUSfluid();
	}
	public static void CupUS2FluidOunceUKfluid(){
		CupUS2ML();
		ML2FluidOunceUKfluid();
	}
	public static void CupUS2GallonUSfluid(){
		CupUS2ML();
		ML2GallonUSfluid();
	}
	public static void CupUS2GallonUSdry(){
		CupUS2ML();
		ML2GallonUSdry();
	}
	public static void CupUS2GallonUK(){
		CupUS2ML();
		ML2GallonUK();
	}
	public static void CupUS2GillUS(){
		CupUS2ML();
		ML2GillUS();
	}
	public static void CupUS2GillUK(){
		CupUS2ML();
		ML2GillUK();
	}
	public static void CupUS2Liter(){
		CupUS2ML();
		ML2Liter();
	}
	public static void CupUS2PintUSfluid(){
		CupUS2ML();
		ML2PintUSfluid();
	}
	public static void CupUS2PintUSdry(){
		CupUS2ML();
		ML2PintUSdry();
	}
	public static void CupUS2PintUK(){
		CupUS2ML();
		ML2PintUK();
	}
	public static void CupUS2QuartUSfluid(){
		CupUS2ML();
		ML2QuartUSfluid();
	}
	public static void CupUS2QuartUSdry(){
		CupUS2ML();
		ML2QuartUSdry();
	}
	public static void CupUS2QuartUK(){
		CupUS2ML();
		ML2QuartUK();
	}
	public static void CupUS2tbspUS(){
		CupUS2ML();
		ML2tbspUS();
	}
	public static void CupUS2tbspFDA(){
		CupUS2ML();
		ML2tbspFDA();
	}
	public static void CupUS2tspUS(){
		CupUS2ML();
		ML2tspUS();
	}
	public static void CupUS2tspFDA(){
		CupUS2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Dash Conversions-------------------\\
	public static void Dash2ML(){
		unit= unit.multiply(new BigDecimal("0.6161151992258"));
	}
	public static void Dash2CupUS(){
		Dash2ML();
		ML2CupUS();
	}
	public static void Dash2Dash(){
		Dash2ML();
		ML2Dash();
	}
	public static void Dash2DessertSpoonUS(){
		Dash2ML();
		ML2DessertSpoonUS();
	}
	public static void Dash2DessertSpoonUK(){
		Dash2ML();
		ML2DessertSpoonUK();
	}
	public static void Dash2DramUSfluid(){
		Dash2ML();
		ML2DramUSfluid();
	}
	public static void Dash2DramUKfluid(){
		Dash2ML();
		ML2DramUKfluid();
	}
	public static void Dash2Drop(){
		Dash2ML();
		ML2Drop();
	}
	public static void Dash2Fifth(){
		Dash2ML();
		ML2Fifth();
	}
	public static void Dash2FluidOunceUSfluid(){
		Dash2ML();
		ML2FluidOunceUSfluid();
	}
	public static void Dash2FluidOunceUKfluid(){
		Dash2ML();
		ML2FluidOunceUKfluid();
	}
	public static void Dash2GallonUSfluid(){
		Dash2ML();
		ML2GallonUSfluid();
	}
	public static void Dash2GallonUSdry(){
		Dash2ML();
		ML2GallonUSdry();
	}
	public static void Dash2GallonUK(){
		Dash2ML();
		ML2GallonUK();
	}
	public static void Dash2GillUS(){
		Dash2ML();
		ML2GillUS();
	}
	public static void Dash2GillUK(){
		Dash2ML();
		ML2GillUK();
	}
	public static void Dash2Liter(){
		Dash2ML();
		ML2Liter();
	}
	public static void Dash2PintUSfluid(){
		Dash2ML();
		ML2PintUSfluid();
	}
	public static void Dash2PintUSdry(){
		Dash2ML();
		ML2PintUSdry();
	}
	public static void Dash2PintUK(){
		Dash2ML();
		ML2PintUK();
	}
	public static void Dash2QuartUSfluid(){
		Dash2ML();
		ML2QuartUSfluid();
	}
	public static void Dash2QuartUSdry(){
		Dash2ML();
		ML2QuartUSdry();
	}
	public static void Dash2QuartUK(){
		Dash2ML();
		ML2QuartUK();
	}
	public static void Dash2tbspUS(){
		Dash2ML();
		ML2tbspUS();
	}
	public static void Dash2tbspFDA(){
		Dash2ML();
		ML2tbspFDA();
	}
	public static void Dash2tspUS(){
		Dash2ML();
		ML2tspUS();
	}
	public static void Dash2tspFDA(){
		Dash2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------DessertSpoon US Conversions-------------------\\
	public static void DSUS2ML(){
		unit= unit.multiply(new BigDecimal("9.857843187066"));
	}
	public static void DSUS2CupUS(){
		DSUS2ML();
		ML2CupUS();
	}
	public static void DSUS2Dash(){
		DSUS2ML();
		ML2Dash();
	}
	public static void DSUS2DessertSpoonUS(){
		DSUS2ML();
		ML2DessertSpoonUS();
	}
	public static void DSUS2DessertSpoonUK(){
		DSUS2ML();
		ML2DessertSpoonUK();
	}
	public static void DSUS2DramUSfluid(){
		DSUS2ML();
		ML2DramUSfluid();
	}
	public static void DSUS2DramUKfluid(){
		DSUS2ML();
		ML2DramUKfluid();
	}
	public static void DSUS2Drop(){
		DSUS2ML();
		ML2Drop();
	}
	public static void DSUS2Fifth(){
		DSUS2ML();
		ML2Fifth();
	}
	public static void DSUS2FluidOunceUSfluid(){
		DSUS2ML();
		ML2FluidOunceUSfluid();
	}
	public static void DSUS2FluidOunceUKfluid(){
		DSUS2ML();
		ML2FluidOunceUKfluid();
	}
	public static void DSUS2GallonUSfluid(){
		DSUS2ML();
		ML2GallonUSfluid();
	}
	public static void DSUS2GallonUSdry(){
		DSUS2ML();
		ML2GallonUSdry();
	}
	public static void DSUS2GallonUK(){
		DSUS2ML();
		ML2GallonUK();
	}
	public static void DSUS2GillUS(){
		DSUS2ML();
		ML2GillUS();
	}
	public static void DSUS2GillUK(){
		DSUS2ML();
		ML2GillUK();
	}
	public static void DSUS2Liter(){
		DSUS2ML();
		ML2Liter();
	}
	public static void DSUS2PintUSfluid(){
		DSUS2ML();
		ML2PintUSfluid();
	}
	public static void DSUS2PintUSdry(){
		DSUS2ML();
		ML2PintUSdry();
	}
	public static void DSUS2PintUK(){
		DSUS2ML();
		ML2PintUK();
	}
	public static void DSUS2QuartUSfluid(){
		DSUS2ML();
		ML2QuartUSfluid();
	}
	public static void DSUS2QuartUSdry(){
		DSUS2ML();
		ML2QuartUSdry();
	}
	public static void DSUS2QuartUK(){
		DSUS2ML();
		ML2QuartUK();
	}
	public static void DSUS2tbspUS(){
		DSUS2ML();
		ML2tbspUS();
	}
	public static void DSUS2tbspFDA(){
		DSUS2ML();
		ML2tbspFDA();
	}
	public static void DSUS2tspUS(){
		DSUS2ML();
		ML2tspUS();
	}
	public static void DSUS2tspFDA(){
		DSUS2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------DessertSpoon UK Conversions-------------------\\
	public static void DSUK2ML(){
		unit= unit.multiply(new BigDecimal("11.8387809397"));
	}
	public static void DSUK2CupUS(){
		DSUK2ML();
		ML2CupUS();
	}
	public static void DSUK2Dash(){
		DSUK2ML();
		ML2Dash();
	}
	public static void DSUK2DessertSpoonUS(){
		DSUK2ML();
		ML2DessertSpoonUS();
	}
	public static void DSUK2DessertSpoonUK(){
		DSUK2ML();
		ML2DessertSpoonUK();
	}
	public static void DSUK2DramUSfluid(){
		DSUK2ML();
		ML2DramUSfluid();
	}
	public static void DSUK2DramUKfluid(){
		DSUK2ML();
		ML2DramUKfluid();
	}
	public static void DSUK2Drop(){
		DSUK2ML();
		ML2Drop();
	}
	public static void DSUK2Fifth(){
		DSUK2ML();
		ML2Fifth();
	}
	public static void DSUK2FluidOunceUSfluid(){
		DSUK2ML();
		ML2FluidOunceUSfluid();
	}
	public static void DSUK2FluidOunceUKfluid(){
		DSUK2ML();
		ML2FluidOunceUKfluid();
	}
	public static void DSUK2GallonUSfluid(){
		DSUK2ML();
		ML2GallonUSfluid();
	}
	public static void DSUK2GallonUSdry(){
		DSUK2ML();
		ML2GallonUSdry();
	}
	public static void DSUK2GallonUK(){
		DSUK2ML();
		ML2GallonUK();
	}
	public static void DSUK2GillUS(){
		DSUK2ML();
		ML2GillUS();
	}
	public static void DSUK2GillUK(){
		DSUK2ML();
		ML2GillUK();
	}
	public static void DSUK2Liter(){
		DSUK2ML();
		ML2Liter();
	}
	public static void DSUK2PintUSfluid(){
		DSUK2ML();
		ML2PintUSfluid();
	}
	public static void DSUK2PintUSdry(){
		DSUK2ML();
		ML2PintUSdry();
	}
	public static void DSUK2PintUK(){
		DSUK2ML();
		ML2PintUK();
	}
	public static void DSUK2QuartUSfluid(){
		DSUK2ML();
		ML2QuartUSfluid();
	}
	public static void DSUK2QuartUSdry(){
		DSUK2ML();
		ML2QuartUSdry();
	}
	public static void DSUK2QuartUK(){
		DSUK2ML();
		ML2QuartUK();
	}
	public static void DSUK2tbspUS(){
		DSUK2ML();
		ML2tbspUS();
	}
	public static void DSUK2tbspFDA(){
		DSUK2ML();
		ML2tbspFDA();
	}
	public static void DSUK2tspUS(){
		DSUK2ML();
		ML2tspUS();
	}
	public static void DSUK2tspFDA(){
		DSUK2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Dram[US,Fluid] Conversions-------------------\\
	public static void DramUSfluid2ML(){
		unit= unit.multiply(new BigDecimal("3.6966591195313"));
	}
	public static void DramUSfluid2CupUS(){
		DramUSfluid2ML();
		ML2CupUS();
	}
	public static void DramUSfluid2Dash(){
		DramUSfluid2ML();
		ML2Dash();
	}
	public static void DramUSfluid2DessertSpoonUS(){
		DramUSfluid2ML();
		ML2DessertSpoonUS();
	}
	public static void DramUSfluid2DessertSpoonUK(){
		DramUSfluid2ML();
		ML2DessertSpoonUK();
	}
	public static void DramUSfluid2DramUSfluid(){
		DramUSfluid2ML();
		ML2DramUSfluid();
	}
	public static void DramUSfluid2DramUKfluid(){
		DramUSfluid2ML();
		ML2DramUKfluid();
	}
	public static void DramUSfluid2Drop(){
		DramUSfluid2ML();
		ML2Drop();
	}
	public static void DramUSfluid2Fifth(){
		DramUSfluid2ML();
		ML2Fifth();
	}
	public static void DramUSfluid2FluidOunceUSfluid(){
		DramUSfluid2ML();
		ML2FluidOunceUSfluid();
	}
	public static void DramUSfluid2FluidOunceUKfluid(){
		DramUSfluid2ML();
		ML2FluidOunceUKfluid();
	}
	public static void DramUSfluid2GallonUSfluid(){
		DramUSfluid2ML();
		ML2GallonUSfluid();
	}
	public static void DramUSfluid2GallonUSdry(){
		DramUSfluid2ML();
		ML2GallonUSdry();
	}
	public static void DramUSfluid2GallonUK(){
		DramUSfluid2ML();
		ML2GallonUK();
	}
	public static void DramUSfluid2GillUS(){
		DramUSfluid2ML();
		ML2GillUS();
	}
	public static void DramUSfluid2GillUK(){
		DramUSfluid2ML();
		ML2GillUK();
	}
	public static void DramUSfluid2Liter(){
		DramUSfluid2ML();
		ML2Liter();
	}
	public static void DramUSfluid2PintUSfluid(){
		DramUSfluid2ML();
		ML2PintUSfluid();
	}
	public static void DramUSfluid2PintUSdry(){
		DramUSfluid2ML();
		ML2PintUSdry();
	}
	public static void DramUSfluid2PintUK(){
		DramUSfluid2ML();
		ML2PintUK();
	}
	public static void DramUSfluid2QuartUSfluid(){
		DramUSfluid2ML();
		ML2QuartUSfluid();
	}
	public static void DramUSfluid2QuartUSdry(){
		DramUSfluid2ML();
		ML2QuartUSdry();
	}
	public static void DramUSfluid2QuartUK(){
		DramUSfluid2ML();
		ML2QuartUK();
	}
	public static void DramUSfluid2tbspUS(){
		DramUSfluid2ML();
		ML2tbspUS();
	}
	public static void DramUSfluid2tbspFDA(){
		DramUSfluid2ML();
		ML2tbspFDA();
	}
	public static void DramUSfluid2tspUS(){
		DramUSfluid2ML();
		ML2tspUS();
	}
	public static void DramUSfluid2tspFDA(){
		DramUSfluid2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Dram[UK,Fluid] Conversions-------------------\\
	public static void DramUKfluid2ML(){
		unit= unit.multiply(new BigDecimal("3.5516328125"));
	}
	public static void DramUKfluid2CupUS(){
		DramUKfluid2ML();
		ML2CupUS();
	}
	public static void DramUKfluid2Dash(){
		DramUKfluid2ML();
		ML2Dash();
	}
	public static void DramUKfluid2DessertSpoonUS(){
		DramUKfluid2ML();
		ML2DessertSpoonUS();
	}
	public static void DramUKfluid2DessertSpoonUK(){
		DramUKfluid2ML();
		ML2DessertSpoonUK();
	}
	public static void DramUKfluid2DramUSfluid(){
		DramUKfluid2ML();
		ML2DramUSfluid();
	}
	public static void DramUKfluid2DramUKfluid(){
		DramUKfluid2ML();
		ML2DramUKfluid();
	}
	public static void DramUKfluid2Drop(){
		DramUKfluid2ML();
		ML2Drop();
	}
	public static void DramUKfluid2Fifth(){
		DramUKfluid2ML();
		ML2Fifth();
	}
	public static void DramUKfluid2FluidOunceUSfluid(){
		DramUKfluid2ML();
		ML2FluidOunceUSfluid();
	}
	public static void DramUKfluid2FluidOunceUKfluid(){
		DramUKfluid2ML();
		ML2FluidOunceUKfluid();
	}
	public static void DramUKfluid2GallonUSfluid(){
		DramUKfluid2ML();
		ML2GallonUSfluid();
	}
	public static void DramUKfluid2GallonUSdry(){
		DramUKfluid2ML();
		ML2GallonUSdry();
	}
	public static void DramUKfluid2GallonUK(){
		DramUKfluid2ML();
		ML2GallonUK();
	}
	public static void DramUKfluid2GillUS(){
		DramUKfluid2ML();
		ML2GillUS();
	}
	public static void DramUKfluid2GillUK(){
		DramUKfluid2ML();
		ML2GillUK();
	}
	public static void DramUKfluid2Liter(){
		DramUKfluid2ML();
		ML2Liter();
	}
	public static void DramUKfluid2PintUSfluid(){
		DramUKfluid2ML();
		ML2PintUSfluid();
	}
	public static void DramUKfluid2PintUSdry(){
		DramUKfluid2ML();
		ML2PintUSdry();
	}
	public static void DramUKfluid2PintUK(){
		DramUKfluid2ML();
		ML2PintUK();
	}
	public static void DramUKfluid2QuartUSfluid(){
		DramUKfluid2ML();
		ML2QuartUSfluid();
	}
	public static void DramUKfluid2QuartUSdry(){
		DramUKfluid2ML();
		ML2QuartUSdry();
	}
	public static void DramUKfluid2QuartUK(){
		DramUKfluid2ML();
		ML2QuartUK();
	}
	public static void DramUKfluid2tbspUS(){
		DramUKfluid2ML();
		ML2tbspUS();
	}
	public static void DramUKfluid2tbspFDA(){
		DramUKfluid2ML();
		ML2tbspFDA();
	}
	public static void DramUKfluid2tspUS(){
		DramUKfluid2ML();
		ML2tspUS();
	}
	public static void DramUKfluid2tspFDA(){
		DramUKfluid2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Drpp Conversions-------------------\\
	public static void Drop2ML(){
		unit= unit.multiply(new BigDecimal("0.0513429332689"));
	}
	public static void Drop2CupUS(){
		Drop2ML();
		ML2CupUS();
	}
	public static void Drop2Dash(){
		Drop2ML();
		ML2Dash();
	}
	public static void Drop2DessertSpoonUS(){
		Drop2ML();
		ML2DessertSpoonUS();
	}
	public static void Drop2DessertSpoonUK(){
		Drop2ML();
		ML2DessertSpoonUK();
	}
	public static void Drop2DramUSfluid(){
		Drop2ML();
		ML2DramUSfluid();
	}
	public static void Drop2DramUKfluid(){
		Drop2ML();
		ML2DramUKfluid();
	}
	public static void Drop2Drop(){
		Drop2ML();
		ML2Drop();
	}
	public static void Drop2Fifth(){
		Drop2ML();
		ML2Fifth();
	}
	public static void Drop2FluidOunceUSfluid(){
		Drop2ML();
		ML2FluidOunceUSfluid();
	}
	public static void Drop2FluidOunceUKfluid(){
		Drop2ML();
		ML2FluidOunceUKfluid();
	}
	public static void Drop2GallonUSfluid(){
		Drop2ML();
		ML2GallonUSfluid();
	}
	public static void Drop2GallonUSdry(){
		Drop2ML();
		ML2GallonUSdry();
	}
	public static void Drop2GallonUK(){
		Drop2ML();
		ML2GallonUK();
	}
	public static void Drop2GillUS(){
		Drop2ML();
		ML2GillUS();
	}
	public static void Drop2GillUK(){
		Drop2ML();
		ML2GillUK();
	}
	public static void Drop2Liter(){
		Drop2ML();
		ML2Liter();
	}
	public static void Drop2PintUSfluid(){
		Drop2ML();
		ML2PintUSfluid();
	}
	public static void Drop2PintUSdry(){
		Drop2ML();
		ML2PintUSdry();
	}
	public static void Drop2PintUK(){
		Drop2ML();
		ML2PintUK();
	}
	public static void Drop2QuartUSfluid(){
		Drop2ML();
		ML2QuartUSfluid();
	}
	public static void Drop2QuartUSdry(){
		Drop2ML();
		ML2QuartUSdry();
	}
	public static void Drop2QuartUK(){
		Drop2ML();
		ML2QuartUK();
	}
	public static void Drop2tbspUS(){
		Drop2ML();
		ML2tbspUS();
	}
	public static void Drop2tbspFDA(){
		Drop2ML();
		ML2tbspFDA();
	}
	public static void Drop2tspUS(){
		Drop2ML();
		ML2tspUS();
	}
	public static void Drop2tspFDA(){
		Drop2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Cup[US] Conversions-------------------\\
	public static void Fifth2ML(){
		unit= unit.multiply(new BigDecimal("757.0823568"));
	}
	public static void Fifth2CupUS(){
		Fifth2ML();
		ML2CupUS();
	}
	public static void Fifth2Dash(){
		Fifth2ML();
		ML2Dash();
	}
	public static void Fifth2DessertSpoonUS(){
		Fifth2ML();
		ML2DessertSpoonUS();
	}
	public static void Fifth2DessertSpoonUK(){
		Fifth2ML();
		ML2DessertSpoonUK();
	}
	public static void Fifth2DramUSfluid(){
		Fifth2ML();
		ML2DramUSfluid();
	}
	public static void Fifth2DramUKfluid(){
		Fifth2ML();
		ML2DramUKfluid();
	}
	public static void Fifth2Drop(){
		Fifth2ML();
		ML2Drop();
	}
	public static void Fifth2Fifth(){
		Fifth2ML();
		ML2Fifth();
	}
	public static void Fifth2FluidOunceUSfluid(){
		Fifth2ML();
		ML2FluidOunceUSfluid();
	}
	public static void Fifth2FluidOunceUKfluid(){
		Fifth2ML();
		ML2FluidOunceUKfluid();
	}
	public static void Fifth2GallonUSfluid(){
		Fifth2ML();
		ML2GallonUSfluid();
	}
	public static void Fifth2GallonUSdry(){
		Fifth2ML();
		ML2GallonUSdry();
	}
	public static void Fifth2GallonUK(){
		Fifth2ML();
		ML2GallonUK();
	}
	public static void Fifth2GillUS(){
		Fifth2ML();
		ML2GillUS();
	}
	public static void Fifth2GillUK(){
		Fifth2ML();
		ML2GillUK();
	}
	public static void Fifth2Liter(){
		Fifth2ML();
		ML2Liter();
	}
	public static void Fifth2PintUSfluid(){
		Fifth2ML();
		ML2PintUSfluid();
	}
	public static void Fifth2PintUSdry(){
		Fifth2ML();
		ML2PintUSdry();
	}
	public static void Fifth2PintUK(){
		Fifth2ML();
		ML2PintUK();
	}
	public static void Fifth2QuartUSfluid(){
		Fifth2ML();
		ML2QuartUSfluid();
	}
	public static void Fifth2QuartUSdry(){
		Fifth2ML();
		ML2QuartUSdry();
	}
	public static void Fifth2QuartUK(){
		Fifth2ML();
		ML2QuartUK();
	}
	public static void Fifth2tbspUS(){
		Fifth2ML();
		ML2tbspUS();
	}
	public static void Fifth2tbspFDA(){
		Fifth2ML();
		ML2tbspFDA();
	}
	public static void Fifth2tspUS(){
		Fifth2ML();
		ML2tspUS();
	}
	public static void Fifth2tspFDA(){
		Fifth2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Fluid Ounce[US,Fluid] Conversions-------------------\\
	public static void FOUS2ML(){
		unit= unit.multiply(new BigDecimal("29.5735295625"));
	}
	public static void FOUS2CupUS(){
		FOUS2ML();
		ML2CupUS();
	}
	public static void FOUS2Dash(){
		FOUS2ML();
		ML2Dash();
	}
	public static void FOUS2DessertSpoonUS(){
		FOUS2ML();
		ML2DessertSpoonUS();
	}
	public static void FOUS2DessertSpoonUK(){
		FOUS2ML();
		ML2DessertSpoonUK();
	}
	public static void FOUS2DramUSfluid(){
		FOUS2ML();
		ML2DramUSfluid();
	}
	public static void FOUS2DramUKfluid(){
		FOUS2ML();
		ML2DramUKfluid();
	}
	public static void FOUS2Drop(){
		FOUS2ML();
		ML2Drop();
	}
	public static void FOUS2Fifth(){
		FOUS2ML();
		ML2Fifth();
	}
	public static void FOUS2FluidOunceUSfluid(){
		FOUS2ML();
		ML2FluidOunceUSfluid();
	}
	public static void FOUS2FluidOunceUKfluid(){
		FOUS2ML();
		ML2FluidOunceUKfluid();
	}
	public static void FOUS2GallonUSfluid(){
		FOUS2ML();
		ML2GallonUSfluid();
	}
	public static void FOUS2GallonUSdry(){
		FOUS2ML();
		ML2GallonUSdry();
	}
	public static void FOUS2GallonUK(){
		FOUS2ML();
		ML2GallonUK();
	}
	public static void FOUS2GillUS(){
		FOUS2ML();
		ML2GillUS();
	}
	public static void FOUS2GillUK(){
		FOUS2ML();
		ML2GillUK();
	}
	public static void FOUS2Liter(){
		FOUS2ML();
		ML2Liter();
	}
	public static void FOUS2PintUSfluid(){
		FOUS2ML();
		ML2PintUSfluid();
	}
	public static void FOUS2PintUSdry(){
		FOUS2ML();
		ML2PintUSdry();
	}
	public static void FOUS2PintUK(){
		FOUS2ML();
		ML2PintUK();
	}
	public static void FOUS2QuartUSfluid(){
		FOUS2ML();
		ML2QuartUSfluid();
	}
	public static void FOUS2QuartUSdry(){
		FOUS2ML();
		ML2QuartUSdry();
	}
	public static void FOUS2QuartUK(){
		FOUS2ML();
		ML2QuartUK();
	}
	public static void FOUS2tbspUS(){
		FOUS2ML();
		ML2tbspUS();
	}
	public static void FOUS2tbspFDA(){
		FOUS2ML();
		ML2tbspFDA();
	}
	public static void FOUS2tspUS(){
		FOUS2ML();
		ML2tspUS();
	}
	public static void FOUS2tspFDA(){
		FOUS2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Fluid Ounce[UK,Fluid] Conversions-------------------\\
	public static void FOUK2ML(){
		unit= unit.multiply(new BigDecimal("28.4130625"));
	}
	public static void FOUK2CupUS(){
		FOUK2ML();
		ML2CupUS();
	}
	public static void FOUK2Dash(){
		FOUK2ML();
		ML2Dash();
	}
	public static void FOUK2DessertSpoonUS(){
		FOUK2ML();
		ML2DessertSpoonUS();
	}
	public static void FOUK2DessertSpoonUK(){
		FOUK2ML();
		ML2DessertSpoonUK();
	}
	public static void FOUK2DramUSfluid(){
		FOUK2ML();
		ML2DramUSfluid();
	}
	public static void FOUK2DramUKfluid(){
		FOUK2ML();
		ML2DramUKfluid();
	}
	public static void FOUK2Drop(){
		FOUK2ML();
		ML2Drop();
	}
	public static void FOUK2Fifth(){
		FOUK2ML();
		ML2Fifth();
	}
	public static void FOUK2FluidOunceUSfluid(){
		FOUK2ML();
		ML2FluidOunceUSfluid();
	}
	public static void FOUK2FluidOunceUKfluid(){
		FOUK2ML();
		ML2FluidOunceUKfluid();
	}
	public static void FOUK2GallonUSfluid(){
		FOUK2ML();
		ML2GallonUSfluid();
	}
	public static void FOUK2GallonUSdry(){
		FOUK2ML();
		ML2GallonUSdry();
	}
	public static void FOUK2GallonUK(){
		FOUK2ML();
		ML2GallonUK();
	}
	public static void FOUK2GillUS(){
		FOUK2ML();
		ML2GillUS();
	}
	public static void FOUK2GillUK(){
		FOUK2ML();
		ML2GillUK();
	}
	public static void FOUK2Liter(){
		FOUK2ML();
		ML2Liter();
	}
	public static void FOUK2PintUSfluid(){
		FOUK2ML();
		ML2PintUSfluid();
	}
	public static void FOUK2PintUSdry(){
		FOUK2ML();
		ML2PintUSdry();
	}
	public static void FOUK2PintUK(){
		FOUK2ML();
		ML2PintUK();
	}
	public static void FOUK2QuartUSfluid(){
		FOUK2ML();
		ML2QuartUSfluid();
	}
	public static void FOUK2QuartUSdry(){
		FOUK2ML();
		ML2QuartUSdry();
	}
	public static void FOUK2QuartUK(){
		FOUK2ML();
		ML2QuartUK();
	}
	public static void FOUK2tbspUS(){
		FOUK2ML();
		ML2tbspUS();
	}
	public static void FOUK2tbspFDA(){
		FOUK2ML();
		ML2tbspFDA();
	}
	public static void FOUK2tspUS(){
		FOUK2ML();
		ML2tspUS();
	}
	public static void FOUK2tspFDA(){
		FOUK2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Gallon[US,Fluid] Conversions-------------------\\
	public static void GallonUSfluid2ML(){
		unit= unit.multiply(new BigDecimal("3785.411784"));
	}
	public static void GallonUSfluid2CupUS(){
		GallonUSfluid2ML();
		ML2CupUS();
	}
	public static void GallonUSfluid2Dash(){
		GallonUSfluid2ML();
		ML2Dash();
	}
	public static void GallonUSfluid2DessertSpoonUS(){
		GallonUSfluid2ML();
		ML2DessertSpoonUS();
	}
	public static void GallonUSfluid2DessertSpoonUK(){
		GallonUSfluid2ML();
		ML2DessertSpoonUK();
	}
	public static void GallonUSfluid2DramUSfluid(){
		GallonUSfluid2ML();
		ML2DramUSfluid();
	}
	public static void GallonUSfluid2DramUKfluid(){
		GallonUSfluid2ML();
		ML2DramUKfluid();
	}
	public static void GallonUSfluid2Drop(){
		GallonUSfluid2ML();
		ML2Drop();
	}
	public static void GallonUSfluid2Fifth(){
		GallonUSfluid2ML();
		ML2Fifth();
	}
	public static void GallonUSfluid2FluidOunceUSfluid(){
		GallonUSfluid2ML();
		ML2FluidOunceUSfluid();
	}
	public static void GallonUSfluid2FluidOunceUKfluid(){
		GallonUSfluid2ML();
		ML2FluidOunceUKfluid();
	}
	public static void GallonUSfluid2GallonUSfluid(){
		GallonUSfluid2ML();
		ML2GallonUSfluid();
	}
	public static void GallonUSfluid2GallonUSdry(){
		GallonUSfluid2ML();
		ML2GallonUSdry();
	}
	public static void GallonUSfluid2GallonUK(){
		GallonUSfluid2ML();
		ML2GallonUK();
	}
	public static void GallonUSfluid2GillUS(){
		GallonUSfluid2ML();
		ML2GillUS();
	}
	public static void GallonUSfluid2GillUK(){
		GallonUSfluid2ML();
		ML2GillUK();
	}
	public static void GallonUSfluid2Liter(){
		GallonUSfluid2ML();
		ML2Liter();
	}
	public static void GallonUSfluid2PintUSfluid(){
		GallonUSfluid2ML();
		ML2PintUSfluid();
	}
	public static void GallonUSfluid2PintUSdry(){
		GallonUSfluid2ML();
		ML2PintUSdry();
	}
	public static void GallonUSfluid2PintUK(){
		GallonUSfluid2ML();
		ML2PintUK();
	}
	public static void GallonUSfluid2QuartUSfluid(){
		GallonUSfluid2ML();
		ML2QuartUSfluid();
	}
	public static void GallonUSfluid2QuartUSdry(){
		GallonUSfluid2ML();
		ML2QuartUSdry();
	}
	public static void GallonUSfluid2QuartUK(){
		GallonUSfluid2ML();
		ML2QuartUK();
	}
	public static void GallonUSfluid2tbspUS(){
		GallonUSfluid2ML();
		ML2tbspUS();
	}
	public static void GallonUSfluid2tbspFDA(){
		GallonUSfluid2ML();
		ML2tbspFDA();
	}
	public static void GallonUSfluid2tspUS(){
		GallonUSfluid2ML();
		ML2tspUS();
	}
	public static void GallonUSfluid2tspFDA(){
		GallonUSfluid2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Gallon[US,Dry] Conversions-------------------\\
	public static void GallonUSdry2ML(){
		unit= unit.multiply(new BigDecimal("4404.90835"));
	}
	public static void GallonUSdry2CupUS(){
		GallonUSdry2ML();
		ML2CupUS();
	}
	public static void GallonUSdry2Dash(){
		GallonUSdry2ML();
		ML2Dash();
	}
	public static void GallonUSdry2DessertSpoonUS(){
		GallonUSdry2ML();
		ML2DessertSpoonUS();
	}
	public static void GallonUSdry2DessertSpoonUK(){
		GallonUSdry2ML();
		ML2DessertSpoonUK();
	}
	public static void GallonUSdry2DramUSfluid(){
		GallonUSdry2ML();
		ML2DramUSfluid();
	}
	public static void GallonUSdry2DramUKfluid(){
		GallonUSdry2ML();
		ML2DramUKfluid();
	}
	public static void GallonUSdry2Drop(){
		GallonUSdry2ML();
		ML2Drop();
	}
	public static void GallonUSdry2Fifth(){
		GallonUSdry2ML();
		ML2Fifth();
	}
	public static void GallonUSdry2FluidOunceUSfluid(){
		GallonUSdry2ML();
		ML2FluidOunceUSfluid();
	}
	public static void GallonUSdry2FluidOunceUKfluid(){
		GallonUSdry2ML();
		ML2FluidOunceUKfluid();
	}
	public static void GallonUSdry2GallonUSfluid(){
		GallonUSdry2ML();
		ML2GallonUSfluid();
	}
	public static void GallonUSdry2GallonUSdry(){
		GallonUSdry2ML();
		ML2GallonUSdry();
	}
	public static void GallonUSdry2GallonUK(){
		GallonUSdry2ML();
		ML2GallonUK();
	}
	public static void GallonUSdry2GillUS(){
		GallonUSdry2ML();
		ML2GillUS();
	}
	public static void GallonUSdry2GillUK(){
		GallonUSdry2ML();
		ML2GillUK();
	}
	public static void GallonUSdry2Liter(){
		GallonUSdry2ML();
		ML2Liter();
	}
	public static void GallonUSdry2PintUSfluid(){
		GallonUSdry2ML();
		ML2PintUSfluid();
	}
	public static void GallonUSdry2PintUSdry(){
		GallonUSdry2ML();
		ML2PintUSdry();
	}
	public static void GallonUSdry2PintUK(){
		GallonUSdry2ML();
		ML2PintUK();
	}
	public static void GallonUSdry2QuartUSfluid(){
		GallonUSdry2ML();
		ML2QuartUSfluid();
	}
	public static void GallonUSdry2QuartUSdry(){
		GallonUSdry2ML();
		ML2QuartUSdry();
	}
	public static void GallonUSdry2QuartUK(){
		GallonUSdry2ML();
		ML2QuartUK();
	}
	public static void GallonUSdry2tbspUS(){
		GallonUSdry2ML();
		ML2tbspUS();
	}
	public static void GallonUSdry2tbspFDA(){
		GallonUSdry2ML();
		ML2tbspFDA();
	}
	public static void GallonUSdry2tspUS(){
		GallonUSdry2ML();
		ML2tspUS();
	}
	public static void GallonUSdry2tspFDA(){
		GallonUSdry2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Gallon[UK] Conversions-------------------\\
	public static void GallonUK2ML(){
		unit= unit.multiply(new BigDecimal("4546.09"));
	}
	public static void GallonUK2CupUS(){
		GallonUK2ML();
		ML2CupUS();
	}
	public static void GallonUK2Dash(){
		GallonUK2ML();
		ML2Dash();
	}
	public static void GallonUK2DessertSpoonUS(){
		GallonUK2ML();
		ML2DessertSpoonUS();
	}
	public static void GallonUK2DessertSpoonUK(){
		GallonUK2ML();
		ML2DessertSpoonUK();
	}
	public static void GallonUK2DramUSfluid(){
		GallonUK2ML();
		ML2DramUSfluid();
	}
	public static void GallonUK2DramUKfluid(){
		GallonUK2ML();
		ML2DramUKfluid();
	}
	public static void GallonUK2Drop(){
		GallonUK2ML();
		ML2Drop();
	}
	public static void GallonUK2Fifth(){
		GallonUK2ML();
		ML2Fifth();
	}
	public static void GallonUK2FluidOunceUSfluid(){
		GallonUK2ML();
		ML2FluidOunceUSfluid();
	}
	public static void GallonUK2FluidOunceUKfluid(){
		GallonUK2ML();
		ML2FluidOunceUKfluid();
	}
	public static void GallonUK2GallonUSfluid(){
		GallonUK2ML();
		ML2GallonUSfluid();
	}
	public static void GallonUK2GallonUSdry(){
		GallonUK2ML();
		ML2GallonUSdry();
	}
	public static void GallonUK2GallonUK(){
		GallonUK2ML();
		ML2GallonUK();
	}
	public static void GallonUK2GillUS(){
		GallonUK2ML();
		ML2GillUS();
	}
	public static void GallonUK2GillUK(){
		GallonUK2ML();
		ML2GillUK();
	}
	public static void GallonUK2Liter(){
		GallonUK2ML();
		ML2Liter();
	}
	public static void GallonUK2PintUSfluid(){
		GallonUK2ML();
		ML2PintUSfluid();
	}
	public static void GallonUK2PintUSdry(){
		GallonUK2ML();
		ML2PintUSdry();
	}
	public static void GallonUK2PintUK(){
		GallonUK2ML();
		ML2PintUK();
	}
	public static void GallonUK2QuartUSfluid(){
		GallonUK2ML();
		ML2QuartUSfluid();
	}
	public static void GallonUK2QuartUSdry(){
		GallonUK2ML();
		ML2QuartUSdry();
	}
	public static void GallonUK2QuartUK(){
		GallonUK2ML();
		ML2QuartUK();
	}
	public static void GallonUK2tbspUS(){
		GallonUK2ML();
		ML2tbspUS();
	}
	public static void GallonUK2tbspFDA(){
		GallonUK2ML();
		ML2tbspFDA();
	}
	public static void GallonUK2tspUS(){
		GallonUK2ML();
		ML2tspUS();
	}
	public static void GallonUK2tspFDA(){
		GallonUK2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Gill[US] Conversions-------------------\\
	public static void GillUS2ML(){
		unit= unit.multiply(new BigDecimal("118.29411825"));
	}
	public static void GillUS2CupUS(){
		GillUS2ML();
		ML2CupUS();
	}
	public static void GillUS2Dash(){
		GillUS2ML();
		ML2Dash();
	}
	public static void GillUS2DessertSpoonUS(){
		GillUS2ML();
		ML2DessertSpoonUS();
	}
	public static void GillUS2DessertSpoonUK(){
		GillUS2ML();
		ML2DessertSpoonUK();
	}
	public static void GillUS2DramUSfluid(){
		GillUS2ML();
		ML2DramUSfluid();
	}
	public static void GillUS2DramUKfluid(){
		GillUS2ML();
		ML2DramUKfluid();
	}
	public static void GillUS2Drop(){
		GillUS2ML();
		ML2Drop();
	}
	public static void GillUS2Fifth(){
		GillUS2ML();
		ML2Fifth();
	}
	public static void GillUS2FluidOunceUSfluid(){
		GillUS2ML();
		ML2FluidOunceUSfluid();
	}
	public static void GillUS2FluidOunceUKfluid(){
		GillUS2ML();
		ML2FluidOunceUKfluid();
	}
	public static void GillUS2GallonUSfluid(){
		GillUS2ML();
		ML2GallonUSfluid();
	}
	public static void GillUS2GallonUSdry(){
		GillUS2ML();
		ML2GallonUSdry();
	}
	public static void GillUS2GallonUK(){
		GillUS2ML();
		ML2GallonUK();
	}
	public static void GillUS2GillUS(){
		GillUS2ML();
		ML2GillUS();
	}
	public static void GillUS2GillUK(){
		GillUS2ML();
		ML2GillUK();
	}
	public static void GillUS2Liter(){
		GillUS2ML();
		ML2Liter();
	}
	public static void GillUS2PintUSfluid(){
		GillUS2ML();
		ML2PintUSfluid();
	}
	public static void GillUS2PintUSdry(){
		GillUS2ML();
		ML2PintUSdry();
	}
	public static void GillUS2PintUK(){
		GillUS2ML();
		ML2PintUK();
	}
	public static void GillUS2QuartUSfluid(){
		GillUS2ML();
		ML2QuartUSfluid();
	}
	public static void GillUS2QuartUSdry(){
		GillUS2ML();
		ML2QuartUSdry();
	}
	public static void GillUS2QuartUK(){
		GillUS2ML();
		ML2QuartUK();
	}
	public static void GillUS2tbspUS(){
		GillUS2ML();
		ML2tbspUS();
	}
	public static void GillUS2tbspFDA(){
		GillUS2ML();
		ML2tbspFDA();
	}
	public static void GillUS2tspUS(){
		GillUS2ML();
		ML2tspUS();
	}
	public static void GillUS2tspFDA(){
		GillUS2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Gill[UK] Conversions-------------------\\
	public static void GillUK2ML(){
		unit= unit.multiply(new BigDecimal("142.0653125"));
	}
	public static void GillUK2CupUS(){
		GillUK2ML();
		ML2CupUS();
	}
	public static void GillUK2Dash(){
		GillUK2ML();
		ML2Dash();
	}
	public static void GillUK2DessertSpoonUS(){
		GillUK2ML();
		ML2DessertSpoonUS();
	}
	public static void GillUK2DessertSpoonUK(){
		GillUK2ML();
		ML2DessertSpoonUK();
	}
	public static void GillUK2DramUSfluid(){
		GillUK2ML();
		ML2DramUSfluid();
	}
	public static void GillUK2DramUKfluid(){
		GillUK2ML();
		ML2DramUKfluid();
	}
	public static void GillUK2Drop(){
		GillUK2ML();
		ML2Drop();
	}
	public static void GillUK2Fifth(){
		GillUK2ML();
		ML2Fifth();
	}
	public static void GillUK2FluidOunceUSfluid(){
		GillUK2ML();
		ML2FluidOunceUSfluid();
	}
	public static void GillUK2FluidOunceUKfluid(){
		GillUK2ML();
		ML2FluidOunceUKfluid();
	}
	public static void GillUK2GallonUSfluid(){
		GillUK2ML();
		ML2GallonUSfluid();
	}
	public static void GillUK2GallonUSdry(){
		GillUK2ML();
		ML2GallonUSdry();
	}
	public static void GillUK2GallonUK(){
		GillUK2ML();
		ML2GallonUK();
	}
	public static void GillUK2GillUS(){
		GillUK2ML();
		ML2GillUS();
	}
	public static void GillUK2GillUK(){
		GillUK2ML();
		ML2GillUK();
	}
	public static void GillUK2Liter(){
		GillUK2ML();
		ML2Liter();
	}
	public static void GillUK2PintUSfluid(){
		GillUK2ML();
		ML2PintUSfluid();
	}
	public static void GillUK2PintUSdry(){
		GillUK2ML();
		ML2PintUSdry();
	}
	public static void GillUK2PintUK(){
		GillUK2ML();
		ML2PintUK();
	}
	public static void GillUK2QuartUSfluid(){
		GillUK2ML();
		ML2QuartUSfluid();
	}
	public static void GillUK2QuartUSdry(){
		GillUK2ML();
		ML2QuartUSdry();
	}
	public static void GillUK2QuartUK(){
		GillUK2ML();
		ML2QuartUK();
	}
	public static void GillUK2tbspUS(){
		GillUK2ML();
		ML2tbspUS();
	}
	public static void GillUK2tbspFDA(){
		GillUK2ML();
		ML2tbspFDA();
	}
	public static void GillUK2tspUS(){
		GillUK2ML();
		ML2tspUS();
	}
	public static void GillUK2tspFDA(){
		GillUK2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Liter Conversions-------------------\\
	public static void L2ML(){
		unit= unit.multiply(new BigDecimal("1000"));
	}
	public static void L2CupUS(){
		L2ML();
		ML2CupUS();
	}
	public static void L2Dash(){
		L2ML();
		ML2Dash();
	}
	public static void L2DessertSpoonUS(){
		L2ML();
		ML2DessertSpoonUS();
	}
	public static void L2DessertSpoonUK(){
		L2ML();
		ML2DessertSpoonUK();
	}
	public static void L2DramUSfluid(){
		L2ML();
		ML2DramUSfluid();
	}
	public static void L2DramUKfluid(){
		L2ML();
		ML2DramUKfluid();
	}
	public static void L2Drop(){
		L2ML();
		ML2Drop();
	}
	public static void L2Fifth(){
		L2ML();
		ML2Fifth();
	}
	public static void L2FluidOunceUSfluid(){
		L2ML();
		ML2FluidOunceUSfluid();
	}
	public static void L2FluidOunceUKfluid(){
		L2ML();
		ML2FluidOunceUKfluid();
	}
	public static void L2GallonUSfluid(){
		L2ML();
		ML2GallonUSfluid();
	}
	public static void L2GallonUSdry(){
		L2ML();
		ML2GallonUSdry();
	}
	public static void L2GallonUK(){
		L2ML();
		ML2GallonUK();
	}
	public static void L2GillUS(){
		L2ML();
		ML2GillUS();
	}
	public static void L2GillUK(){
		L2ML();
		ML2GillUK();
	}
	public static void L2Liter(){
		L2ML();
		ML2Liter();
	}
	public static void L2PintUSfluid(){
		L2ML();
		ML2PintUSfluid();
	}
	public static void L2PintUSdry(){
		L2ML();
		ML2PintUSdry();
	}
	public static void L2PintUK(){
		L2ML();
		ML2PintUK();
	}
	public static void L2QuartUSfluid(){
		L2ML();
		ML2QuartUSfluid();
	}
	public static void L2QuartUSdry(){
		L2ML();
		ML2QuartUSdry();
	}
	public static void L2QuartUK(){
		L2ML();
		ML2QuartUK();
	}
	public static void L2tbspUS(){
		L2ML();
		ML2tbspUS();
	}
	public static void L2tbspFDA(){
		L2ML();
		ML2tbspFDA();
	}
	public static void L2tspUS(){
		L2ML();
		ML2tspUS();
	}
	public static void L2tspFDA(){
		L2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Pint[US,Fluid] Conversions-------------------\\
	public static void PintUSfluid2ML(){
		unit= unit.multiply(new BigDecimal("473.176473"));
	}
	public static void PintUSfluid2CupUS(){
		PintUSfluid2ML();
		ML2CupUS();
	}
	public static void PintUSfluid2Dash(){
		PintUSfluid2ML();
		ML2Dash();
	}
	public static void PintUSfluid2DessertSpoonUS(){
		PintUSfluid2ML();
		ML2DessertSpoonUS();
	}
	public static void PintUSfluid2DessertSpoonUK(){
		PintUSfluid2ML();
		ML2DessertSpoonUK();
	}
	public static void PintUSfluid2DramUSfluid(){
		PintUSfluid2ML();
		ML2DramUSfluid();
	}
	public static void PintUSfluid2DramUKfluid(){
		PintUSfluid2ML();
		ML2DramUKfluid();
	}
	public static void PintUSfluid2Drop(){
		PintUSfluid2ML();
		ML2Drop();
	}
	public static void PintUSfluid2Fifth(){
		PintUSfluid2ML();
		ML2Fifth();
	}
	public static void PintUSfluid2FluidOunceUSfluid(){
		PintUSfluid2ML();
		ML2FluidOunceUSfluid();
	}
	public static void PintUSfluid2FluidOunceUKfluid(){
		PintUSfluid2ML();
		ML2FluidOunceUKfluid();
	}
	public static void PintUSfluid2GallonUSfluid(){
		PintUSfluid2ML();
		ML2GallonUSfluid();
	}
	public static void PintUSfluid2GallonUSdry(){
		PintUSfluid2ML();
		ML2GallonUSdry();
	}
	public static void PintUSfluid2GallonUK(){
		PintUSfluid2ML();
		ML2GallonUK();
	}
	public static void PintUSfluid2GillUS(){
		PintUSfluid2ML();
		ML2GillUS();
	}
	public static void PintUSfluid2GillUK(){
		PintUSfluid2ML();
		ML2GillUK();
	}
	public static void PintUSfluid2Liter(){
		PintUSfluid2ML();
		ML2Liter();
	}
	public static void PintUSfluid2PintUSfluid(){
		PintUSfluid2ML();
		ML2PintUSfluid();
	}
	public static void PintUSfluid2PintUSdry(){
		PintUSfluid2ML();
		ML2PintUSdry();
	}
	public static void PintUSfluid2PintUK(){
		PintUSfluid2ML();
		ML2PintUK();
	}
	public static void PintUSfluid2QuartUSfluid(){
		PintUSfluid2ML();
		ML2QuartUSfluid();
	}
	public static void PintUSfluid2QuartUSdry(){
		PintUSfluid2ML();
		ML2QuartUSdry();
	}
	public static void PintUSfluid2QuartUK(){
		PintUSfluid2ML();
		ML2QuartUK();
	}
	public static void PintUSfluid2tbspUS(){
		PintUSfluid2ML();
		ML2tbspUS();
	}
	public static void PintUSfluid2tbspFDA(){
		PintUSfluid2ML();
		ML2tbspFDA();
	}
	public static void PintUSfluid2tspUS(){
		PintUSfluid2ML();
		ML2tspUS();
	}
	public static void PintUSfluid2tspFDA(){
		PintUSfluid2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Pint[US,Dry] Conversions-------------------\\
	public static void PintUSdry2ML(){
		unit= unit.multiply(new BigDecimal("550.61354375"));
	}
	public static void PintUSdry2CupUS(){
		PintUSdry2ML();
		ML2CupUS();
	}
	public static void PintUSdry2Dash(){
		PintUSdry2ML();
		ML2Dash();
	}
	public static void PintUSdry2DessertSpoonUS(){
		PintUSdry2ML();
		ML2DessertSpoonUS();
	}
	public static void PintUSdry2DessertSpoonUK(){
		PintUSdry2ML();
		ML2DessertSpoonUK();
	}
	public static void PintUSdry2DramUSfluid(){
		PintUSdry2ML();
		ML2DramUSfluid();
	}
	public static void PintUSdry2DramUKfluid(){
		PintUSdry2ML();
		ML2DramUKfluid();
	}
	public static void PintUSdry2Drop(){
		PintUSdry2ML();
		ML2Drop();
	}
	public static void PintUSdry2Fifth(){
		PintUSdry2ML();
		ML2Fifth();
	}
	public static void PintUSdry2FluidOunceUSfluid(){
		PintUSdry2ML();
		ML2FluidOunceUSfluid();
	}
	public static void PintUSdry2FluidOunceUKfluid(){
		PintUSdry2ML();
		ML2FluidOunceUKfluid();
	}
	public static void PintUSdry2GallonUSfluid(){
		PintUSdry2ML();
		ML2GallonUSfluid();
	}
	public static void PintUSdry2GallonUSdry(){
		PintUSdry2ML();
		ML2GallonUSdry();
	}
	public static void PintUSdry2GallonUK(){
		PintUSdry2ML();
		ML2GallonUK();
	}
	public static void PintUSdry2GillUS(){
		PintUSdry2ML();
		ML2GillUS();
	}
	public static void PintUSdry2GillUK(){
		PintUSdry2ML();
		ML2GillUK();
	}
	public static void PintUSdry2Liter(){
		PintUSdry2ML();
		ML2Liter();
	}
	public static void PintUSdry2PintUSfluid(){
		PintUSdry2ML();
		ML2PintUSfluid();
	}
	public static void PintUSdry2PintUSdry(){
		PintUSdry2ML();
		ML2PintUSdry();
	}
	public static void PintUSdry2PintUK(){
		PintUSdry2ML();
		ML2PintUK();
	}
	public static void PintUSdry2QuartUSfluid(){
		PintUSdry2ML();
		ML2QuartUSfluid();
	}
	public static void PintUSdry2QuartUSdry(){
		PintUSdry2ML();
		ML2QuartUSdry();
	}
	public static void PintUSdry2QuartUK(){
		PintUSdry2ML();
		ML2QuartUK();
	}
	public static void PintUSdry2tbspUS(){
		PintUSdry2ML();
		ML2tbspUS();
	}
	public static void PintUSdry2tbspFDA(){
		PintUSdry2ML();
		ML2tbspFDA();
	}
	public static void PintUSdry2tspUS(){
		PintUSdry2ML();
		ML2tspUS();
	}
	public static void PintUSdry2tspFDA(){
		PintUSdry2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Pint[UK] Conversions-------------------\\
	public static void PintUK2ML(){
		unit= unit.multiply(new BigDecimal("568.26125"));
	}
	public static void PintUK2CupUS(){
		PintUK2ML();
		ML2CupUS();
	}
	public static void PintUK2Dash(){
		PintUK2ML();
		ML2Dash();
	}
	public static void PintUK2DessertSpoonUS(){
		PintUK2ML();
		ML2DessertSpoonUS();
	}
	public static void PintUK2DessertSpoonUK(){
		PintUK2ML();
		ML2DessertSpoonUK();
	}
	public static void PintUK2DramUSfluid(){
		PintUK2ML();
		ML2DramUSfluid();
	}
	public static void PintUK2DramUKfluid(){
		PintUK2ML();
		ML2DramUKfluid();
	}
	public static void PintUK2Drop(){
		PintUK2ML();
		ML2Drop();
	}
	public static void PintUK2Fifth(){
		PintUK2ML();
		ML2Fifth();
	}
	public static void PintUK2FluidOunceUSfluid(){
		PintUK2ML();
		ML2FluidOunceUSfluid();
	}
	public static void PintUK2FluidOunceUKfluid(){
		PintUK2ML();
		ML2FluidOunceUKfluid();
	}
	public static void PintUK2GallonUSfluid(){
		PintUK2ML();
		ML2GallonUSfluid();
	}
	public static void PintUK2GallonUSdry(){
		PintUK2ML();
		ML2GallonUSdry();
	}
	public static void PintUK2GallonUK(){
		PintUK2ML();
		ML2GallonUK();
	}
	public static void PintUK2GillUS(){
		PintUK2ML();
		ML2GillUS();
	}
	public static void PintUK2GillUK(){
		PintUK2ML();
		ML2GillUK();
	}
	public static void PintUK2Liter(){
		PintUK2ML();
		ML2Liter();
	}
	public static void PintUK2PintUSfluid(){
		PintUK2ML();
		ML2PintUSfluid();
	}
	public static void PintUK2PintUSdry(){
		PintUK2ML();
		ML2PintUSdry();
	}
	public static void PintUK2PintUK(){
		PintUK2ML();
		ML2PintUK();
	}
	public static void PintUK2QuartUSfluid(){
		PintUK2ML();
		ML2QuartUSfluid();
	}
	public static void PintUK2QuartUSdry(){
		PintUK2ML();
		ML2QuartUSdry();
	}
	public static void PintUK2QuartUK(){
		PintUK2ML();
		ML2QuartUK();
	}
	public static void PintUK2tbspUS(){
		PintUK2ML();
		ML2tbspUS();
	}
	public static void PintUK2tbspFDA(){
		PintUK2ML();
		ML2tbspFDA();
	}
	public static void PintUK2tspUS(){
		PintUK2ML();
		ML2tspUS();
	}
	public static void PintUK2tspFDA(){
		PintUK2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Quart[US,Fluid] Conversions-------------------\\
	public static void QuartUSfluid2ML(){
		unit= unit.multiply(new BigDecimal("946.352946"));
	}
	public static void QuartUSfluid2CupUS(){
		QuartUSfluid2ML();
		ML2CupUS();
	}
	public static void QuartUSfluid2Dash(){
		QuartUSfluid2ML();
		ML2Dash();
	}
	public static void QuartUSfluid2DessertSpoonUS(){
		QuartUSfluid2ML();
		ML2DessertSpoonUS();
	}
	public static void QuartUSfluid2DessertSpoonUK(){
		QuartUSfluid2ML();
		ML2DessertSpoonUK();
	}
	public static void QuartUSfluid2DramUSfluid(){
		QuartUSfluid2ML();
		ML2DramUSfluid();
	}
	public static void QuartUSfluid2DramUKfluid(){
		QuartUSfluid2ML();
		ML2DramUKfluid();
	}
	public static void QuartUSfluid2Drop(){
		QuartUSfluid2ML();
		ML2Drop();
	}
	public static void QuartUSfluid2Fifth(){
		QuartUSfluid2ML();
		ML2Fifth();
	}
	public static void QuartUSfluid2FluidOunceUSfluid(){
		QuartUSfluid2ML();
		ML2FluidOunceUSfluid();
	}
	public static void QuartUSfluid2FluidOunceUKfluid(){
		QuartUSfluid2ML();
		ML2FluidOunceUKfluid();
	}
	public static void QuartUSfluid2GallonUSfluid(){
		QuartUSfluid2ML();
		ML2GallonUSfluid();
	}
	public static void QuartUSfluid2GallonUSdry(){
		QuartUSfluid2ML();
		ML2GallonUSdry();
	}
	public static void QuartUSfluid2GallonUK(){
		QuartUSfluid2ML();
		ML2GallonUK();
	}
	public static void QuartUSfluid2GillUS(){
		QuartUSfluid2ML();
		ML2GillUS();
	}
	public static void QuartUSfluid2GillUK(){
		QuartUSfluid2ML();
		ML2GillUK();
	}
	public static void QuartUSfluid2Liter(){
		QuartUSfluid2ML();
		ML2Liter();
	}
	public static void QuartUSfluid2PintUSfluid(){
		QuartUSfluid2ML();
		ML2PintUSfluid();
	}
	public static void QuartUSfluid2PintUSdry(){
		QuartUSfluid2ML();
		ML2PintUSdry();
	}
	public static void QuartUSfluid2PintUK(){
		QuartUSfluid2ML();
		ML2PintUK();
	}
	public static void QuartUSfluid2QuartUSfluid(){
		QuartUSfluid2ML();
		ML2QuartUSfluid();
	}
	public static void QuartUSfluid2QuartUSdry(){
		QuartUSfluid2ML();
		ML2QuartUSdry();
	}
	public static void QuartUSfluid2QuartUK(){
		QuartUSfluid2ML();
		ML2QuartUK();
	}
	public static void QuartUSfluid2tbspUS(){
		QuartUSfluid2ML();
		ML2tbspUS();
	}
	public static void QuartUSfluid2tbspFDA(){
		QuartUSfluid2ML();
		ML2tbspFDA();
	}
	public static void QuartUSfluid2tspUS(){
		QuartUSfluid2ML();
		ML2tspUS();
	}
	public static void QuartUSfluid2tspFDA(){
		QuartUSfluid2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Quart[US,dry] Conversions-------------------\\
	public static void QuartUSdry2ML(){
		unit= unit.multiply(new BigDecimal("1101.2270875"));
	}
	public static void QuartUSdry2CupUS(){
		QuartUSdry2ML();
		ML2CupUS();
	}
	public static void QuartUSdry2Dash(){
		QuartUSdry2ML();
		ML2Dash();
	}
	public static void QuartUSdry2DessertSpoonUS(){
		QuartUSdry2ML();
		ML2DessertSpoonUS();
	}
	public static void QuartUSdry2DessertSpoonUK(){
		QuartUSdry2ML();
		ML2DessertSpoonUK();
	}
	public static void QuartUSdry2DramUSfluid(){
		QuartUSdry2ML();
		ML2DramUSfluid();
	}
	public static void QuartUSdry2DramUKfluid(){
		QuartUSdry2ML();
		ML2DramUKfluid();
	}
	public static void QuartUSdry2Drop(){
		QuartUSdry2ML();
		ML2Drop();
	}
	public static void QuartUSdry2Fifth(){
		QuartUSdry2ML();
		ML2Fifth();
	}
	public static void QuartUSdry2FluidOunceUSfluid(){
		QuartUSdry2ML();
		ML2FluidOunceUSfluid();
	}
	public static void QuartUSdry2FluidOunceUKfluid(){
		QuartUSdry2ML();
		ML2FluidOunceUKfluid();
	}
	public static void QuartUSdry2GallonUSfluid(){
		QuartUSdry2ML();
		ML2GallonUSfluid();
	}
	public static void QuartUSdry2GallonUSdry(){
		QuartUSdry2ML();
		ML2GallonUSdry();
	}
	public static void QuartUSdry2GallonUK(){
		QuartUSdry2ML();
		ML2GallonUK();
	}
	public static void QuartUSdry2GillUS(){
		QuartUSdry2ML();
		ML2GillUS();
	}
	public static void QuartUSdry2GillUK(){
		QuartUSdry2ML();
		ML2GillUK();
	}
	public static void QuartUSdry2Liter(){
		QuartUSdry2ML();
		ML2Liter();
	}
	public static void QuartUSdry2PintUSfluid(){
		QuartUSdry2ML();
		ML2PintUSfluid();
	}
	public static void QuartUSdry2PintUSdry(){
		QuartUSdry2ML();
		ML2PintUSdry();
	}
	public static void QuartUSdry2PintUK(){
		QuartUSdry2ML();
		ML2PintUK();
	}
	public static void QuartUSdry2QuartUSfluid(){
		QuartUSdry2ML();
		ML2QuartUSfluid();
	}
	public static void QuartUSdry2QuartUSdry(){
		QuartUSdry2ML();
		ML2QuartUSdry();
	}
	public static void QuartUSdry2QuartUK(){
		QuartUSdry2ML();
		ML2QuartUK();
	}
	public static void QuartUSdry2tbspUS(){
		QuartUSdry2ML();
		ML2tbspUS();
	}
	public static void QuartUSdry2tbspFDA(){
		QuartUSdry2ML();
		ML2tbspFDA();
	}
	public static void QuartUSdry2tspUS(){
		QuartUSdry2ML();
		ML2tspUS();
	}
	public static void QuartUSdry2tspFDA(){
		QuartUSdry2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Quart[UK] Conversions-------------------\\
	public static void QuartUK2ML(){
		unit= unit.multiply(new BigDecimal("1136.5225"));
	}
	public static void QuartUK2CupUS(){
		QuartUK2ML();
		ML2CupUS();
	}
	public static void QuartUK2Dash(){
		QuartUK2ML();
		ML2Dash();
	}
	public static void QuartUK2DessertSpoonUS(){
		QuartUK2ML();
		ML2DessertSpoonUS();
	}
	public static void QuartUK2DessertSpoonUK(){
		QuartUK2ML();
		ML2DessertSpoonUK();
	}
	public static void QuartUK2DramUSfluid(){
		QuartUK2ML();
		ML2DramUSfluid();
	}
	public static void QuartUK2DramUKfluid(){
		QuartUK2ML();
		ML2DramUKfluid();
	}
	public static void QuartUK2Drop(){
		QuartUK2ML();
		ML2Drop();
	}
	public static void QuartUK2Fifth(){
		QuartUK2ML();
		ML2Fifth();
	}
	public static void QuartUK2FluidOunceUSfluid(){
		QuartUK2ML();
		ML2FluidOunceUSfluid();
	}
	public static void QuartUK2FluidOunceUKfluid(){
		QuartUK2ML();
		ML2FluidOunceUKfluid();
	}
	public static void QuartUK2GallonUSfluid(){
		QuartUK2ML();
		ML2GallonUSfluid();
	}
	public static void QuartUK2GallonUSdry(){
		QuartUK2ML();
		ML2GallonUSdry();
	}
	public static void QuartUK2GallonUK(){
		QuartUK2ML();
		ML2GallonUK();
	}
	public static void QuartUK2GillUS(){
		QuartUK2ML();
		ML2GillUS();
	}
	public static void QuartUK2GillUK(){
		QuartUK2ML();
		ML2GillUK();
	}
	public static void QuartUK2Liter(){
		QuartUK2ML();
		ML2Liter();
	}
	public static void QuartUK2PintUSfluid(){
		QuartUK2ML();
		ML2PintUSfluid();
	}
	public static void QuartUK2PintUSdry(){
		QuartUK2ML();
		ML2PintUSdry();
	}
	public static void QuartUK2PintUK(){
		QuartUK2ML();
		ML2PintUK();
	}
	public static void QuartUK2QuartUSfluid(){
		QuartUK2ML();
		ML2QuartUSfluid();
	}
	public static void QuartUK2QuartUSdry(){
		QuartUK2ML();
		ML2QuartUSdry();
	}
	public static void QuartUK2QuartUK(){
		QuartUK2ML();
		ML2QuartUK();
	}
	public static void QuartUK2tbspUS(){
		QuartUK2ML();
		ML2tbspUS();
	}
	public static void QuartUK2tbspFDA(){
		QuartUK2ML();
		ML2tbspFDA();
	}
	public static void QuartUK2tspUS(){
		QuartUK2ML();
		ML2tspUS();
	}
	public static void QuartUK2tspFDA(){
		QuartUK2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------Table Spoon US Conversions-------------------\\
	public static void tbspUS2ML(){
		unit= unit.multiply(new BigDecimal("14.78676478125"));
	}
	public static void tbspUS2CupUS(){
		tbspUS2ML();
		ML2CupUS();
	}
	public static void tbspUS2Dash(){
		tbspUS2ML();
		ML2Dash();
	}
	public static void tbspUS2DessertSpoonUS(){
		tbspUS2ML();
		ML2DessertSpoonUS();
	}
	public static void tbspUS2DessertSpoonUK(){
		tbspUS2ML();
		ML2DessertSpoonUK();
	}
	public static void tbspUS2DramUSfluid(){
		tbspUS2ML();
		ML2DramUSfluid();
	}
	public static void tbspUS2DramUKfluid(){
		tbspUS2ML();
		ML2DramUKfluid();
	}
	public static void tbspUS2Drop(){
		tbspUS2ML();
		ML2Drop();
	}
	public static void tbspUS2Fifth(){
		tbspUS2ML();
		ML2Fifth();
	}
	public static void tbspUS2FluidOunceUSfluid(){
		tbspUS2ML();
		ML2FluidOunceUSfluid();
	}
	public static void tbspUS2FluidOunceUKfluid(){
		tbspUS2ML();
		ML2FluidOunceUKfluid();
	}
	public static void tbspUS2GallonUSfluid(){
		tbspUS2ML();
		ML2GallonUSfluid();
	}
	public static void tbspUS2GallonUSdry(){
		tbspUS2ML();
		ML2GallonUSdry();
	}
	public static void tbspUS2GallonUK(){
		tbspUS2ML();
		ML2GallonUK();
	}
	public static void tbspUS2GillUS(){
		tbspUS2ML();
		ML2GillUS();
	}
	public static void tbspUS2GillUK(){
		tbspUS2ML();
		ML2GillUK();
	}
	public static void tbspUS2Liter(){
		tbspUS2ML();
		ML2Liter();
	}
	public static void tbspUS2PintUSfluid(){
		tbspUS2ML();
		ML2PintUSfluid();
	}
	public static void tbspUS2PintUSdry(){
		tbspUS2ML();
		ML2PintUSdry();
	}
	public static void tbspUS2PintUK(){
		tbspUS2ML();
		ML2PintUK();
	}
	public static void tbspUS2QuartUSfluid(){
		tbspUS2ML();
		ML2QuartUSfluid();
	}
	public static void tbspUS2QuartUSdry(){
		tbspUS2ML();
		ML2QuartUSdry();
	}
	public static void tbspUS2QuartUK(){
		tbspUS2ML();
		ML2QuartUK();
	}
	public static void tbspUS2tbspUS(){
		tbspUS2ML();
		ML2tbspUS();
	}
	public static void tbspUS2tbspFDA(){
		tbspUS2ML();
		ML2tbspFDA();
	}
	public static void tbspUS2tspUS(){
		tbspUS2ML();
		ML2tspUS();
	}
	public static void tbspUS2tspFDA(){
		tbspUS2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------TableSpoon Food and Drug Administration Conversions-------------------\\
	public static void tbspFDA2ML(){
		unit= unit.multiply(new BigDecimal("15"));
	}
	public static void tbspFDA2CupUS(){
		tbspFDA2ML();
		ML2CupUS();
	}
	public static void tbspFDA2Dash(){
		tbspFDA2ML();
		ML2Dash();
	}
	public static void tbspFDA2DessertSpoonUS(){
		tbspFDA2ML();
		ML2DessertSpoonUS();
	}
	public static void tbspFDA2DessertSpoonUK(){
		tbspFDA2ML();
		ML2DessertSpoonUK();
	}
	public static void tbspFDA2DramUSfluid(){
		tbspFDA2ML();
		ML2DramUSfluid();
	}
	public static void tbspFDA2DramUKfluid(){
		tbspFDA2ML();
		ML2DramUKfluid();
	}
	public static void tbspFDA2Drop(){
		tbspFDA2ML();
		ML2Drop();
	}
	public static void tbspFDA2Fifth(){
		tbspFDA2ML();
		ML2Fifth();
	}
	public static void tbspFDA2FluidOunceUSfluid(){
		tbspFDA2ML();
		ML2FluidOunceUSfluid();
	}
	public static void tbspFDA2FluidOunceUKfluid(){
		tbspFDA2ML();
		ML2FluidOunceUKfluid();
	}
	public static void tbspFDA2GallonUSfluid(){
		tbspFDA2ML();
		ML2GallonUSfluid();
	}
	public static void tbspFDA2GallonUSdry(){
		tbspFDA2ML();
		ML2GallonUSdry();
	}
	public static void tbspFDA2GallonUK(){
		tbspFDA2ML();
		ML2GallonUK();
	}
	public static void tbspFDA2GillUS(){
		tbspFDA2ML();
		ML2GillUS();
	}
	public static void tbspFDA2GillUK(){
		tbspFDA2ML();
		ML2GillUK();
	}
	public static void tbspFDA2Liter(){
		tbspFDA2ML();
		ML2Liter();
	}
	public static void tbspFDA2PintUSfluid(){
		tbspFDA2ML();
		ML2PintUSfluid();
	}
	public static void tbspFDA2PintUSdry(){
		tbspFDA2ML();
		ML2PintUSdry();
	}
	public static void tbspFDA2PintUK(){
		tbspFDA2ML();
		ML2PintUK();
	}
	public static void tbspFDA2QuartUSfluid(){
		tbspFDA2ML();
		ML2QuartUSfluid();
	}
	public static void tbspFDA2QuartUSdry(){
		tbspFDA2ML();
		ML2QuartUSdry();
	}
	public static void tbspFDA2QuartUK(){
		tbspFDA2ML();
		ML2QuartUK();
	}
	public static void tbspFDA2tbspUS(){
		tbspFDA2ML();
		ML2tbspUS();
	}
	public static void tbspFDA2tbspFDA(){
		tbspFDA2ML();
		ML2tbspFDA();
	}
	public static void tbspFDA2tspUS(){
		tbspFDA2ML();
		ML2tspUS();
	}
	public static void tbspFDA2tspFDA(){
		tbspFDA2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------TeaSpoon[US] Conversions-------------------\\
	public static void tspUS2ML(){
		unit= unit.multiply(new BigDecimal("4.92892159375"));
	}
	public static void tspUS2CupUS(){
		tspUS2ML();
		ML2CupUS();
	}
	public static void tspUS2Dash(){
		tspUS2ML();
		ML2Dash();
	}
	public static void tspUS2DessertSpoonUS(){
		tspUS2ML();
		ML2DessertSpoonUS();
	}
	public static void tspUS2DessertSpoonUK(){
		tspUS2ML();
		ML2DessertSpoonUK();
	}
	public static void tspUS2DramUSfluid(){
		tspUS2ML();
		ML2DramUSfluid();
	}
	public static void tspUS2DramUKfluid(){
		tspUS2ML();
		ML2DramUKfluid();
	}
	public static void tspUS2Drop(){
		tspUS2ML();
		ML2Drop();
	}
	public static void tspUS2Fifth(){
		tspUS2ML();
		ML2Fifth();
	}
	public static void tspUS2FluidOunceUSfluid(){
		tspUS2ML();
		ML2FluidOunceUSfluid();
	}
	public static void tspUS2FluidOunceUKfluid(){
		tspUS2ML();
		ML2FluidOunceUKfluid();
	}
	public static void tspUS2GallonUSfluid(){
		tspUS2ML();
		ML2GallonUSfluid();
	}
	public static void tspUS2GallonUSdry(){
		tspUS2ML();
		ML2GallonUSdry();
	}
	public static void tspUS2GallonUK(){
		tspUS2ML();
		ML2GallonUK();
	}
	public static void tspUS2GillUS(){
		tspUS2ML();
		ML2GillUS();
	}
	public static void tspUS2GillUK(){
		tspUS2ML();
		ML2GillUK();
	}
	public static void tspUS2Liter(){
		tspUS2ML();
		ML2Liter();
	}
	public static void tspUS2PintUSfluid(){
		tspUS2ML();
		ML2PintUSfluid();
	}
	public static void tspUS2PintUSdry(){
		tspUS2ML();
		ML2PintUSdry();
	}
	public static void tspUS2PintUK(){
		tspUS2ML();
		ML2PintUK();
	}
	public static void tspUS2QuartUSfluid(){
		tspUS2ML();
		ML2QuartUSfluid();
	}
	public static void tspUS2QuartUSdry(){
		tspUS2ML();
		ML2QuartUSdry();
	}
	public static void tspUS2QuartUK(){
		tspUS2ML();
		ML2QuartUK();
	}
	public static void tspUS2tbspUS(){
		tspUS2ML();
		ML2tbspUS();
	}
	public static void tspUS2tbspFDA(){
		tspUS2ML();
		ML2tbspFDA();
	}
	public static void tspUS2tspUS(){
		tspUS2ML();
		ML2tspUS();
	}
	public static void tspUS2tspFDA(){
		tspUS2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//---------------TeaSpoon Food & Drug Administration Conversions-------------------\\
	public static void tspFDA2ML(){
		unit= unit.multiply(new BigDecimal("5"));
	}
	public static void tspFDA2CupUS(){
		tspFDA2ML();
		ML2CupUS();
	}
	public static void tspFDA2Dash(){
		tspFDA2ML();
		ML2Dash();
	}
	public static void tspFDA2DessertSpoonUS(){
		tspFDA2ML();
		ML2DessertSpoonUS();
	}
	public static void tspFDA2DessertSpoonUK(){
		tspFDA2ML();
		ML2DessertSpoonUK();
	}
	public static void tspFDA2DramUSfluid(){
		tspFDA2ML();
		ML2DramUSfluid();
	}
	public static void tspFDA2DramUKfluid(){
		tspFDA2ML();
		ML2DramUKfluid();
	}
	public static void tspFDA2Drop(){
		tspFDA2ML();
		ML2Drop();
	}
	public static void tspFDA2Fifth(){
		tspFDA2ML();
		ML2Fifth();
	}
	public static void tspFDA2FluidOunceUSfluid(){
		tspFDA2ML();
		ML2FluidOunceUSfluid();
	}
	public static void tspFDA2FluidOunceUKfluid(){
		tspFDA2ML();
		ML2FluidOunceUKfluid();
	}
	public static void tspFDA2GallonUSfluid(){
		tspFDA2ML();
		ML2GallonUSfluid();
	}
	public static void tspFDA2GallonUSdry(){
		tspFDA2ML();
		ML2GallonUSdry();
	}
	public static void tspFDA2GallonUK(){
		tspFDA2ML();
		ML2GallonUK();
	}
	public static void tspFDA2GillUS(){
		tspFDA2ML();
		ML2GillUS();
	}
	public static void tspFDA2GillUK(){
		tspFDA2ML();
		ML2GillUK();
	}
	public static void tspFDA2Liter(){
		tspFDA2ML();
		ML2Liter();
	}
	public static void tspFDA2PintUSfluid(){
		tspFDA2ML();
		ML2PintUSfluid();
	}
	public static void tspFDA2PintUSdry(){
		tspFDA2ML();
		ML2PintUSdry();
	}
	public static void tspFDA2PintUK(){
		tspFDA2ML();
		ML2PintUK();
	}
	public static void tspFDA2QuartUSfluid(){
		tspFDA2ML();
		ML2QuartUSfluid();
	}
	public static void tspFDA2QuartUSdry(){
		tspFDA2ML();
		ML2QuartUSdry();
	}
	public static void tspFDA2QuartUK(){
		tspFDA2ML();
		ML2QuartUK();
	}
	public static void tspFDA2tbspUS(){
		tspFDA2ML();
		ML2tbspUS();
	}
	public static void tspFDA2tbspFDA(){
		tspFDA2ML();
		ML2tbspFDA();
	}
	public static void tspFDA2tspUS(){
		tspFDA2ML();
		ML2tspUS();
	}
	public static void tspFDA2tspFDA(){
		tspFDA2ML();
		ML2tspFDA();
	}
	//`````````````````````````````````````````````````````````````````\\
	//``````````````````````````````````````````````````````````````````\\
	public static void main(String arg[]){
		while(true){
			options();
			choiceFilling();
		}
	}
}