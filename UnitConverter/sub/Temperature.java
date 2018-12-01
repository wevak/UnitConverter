package sub;
import java.util.Scanner;

public class Temperature{
	static double temp,cel,fahr,kelvin,reaumur,rankine;
	static String[] units = new String[]{"Celsius", "Fahrenhiet", "Kelvin","Reaumur","Rankine","Exit"};
	static int choice1,choice2;
	static Scanner scn = new Scanner(System.in);

	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nTEMPERATURE CONVERTER");
		for(String each:units){
			System.out.println(i + "." + each);
			i++;
		}
	}

	public static void choiceFilling(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();

		if(choice1 == 6 ){
			// Converter pre = new Converter();
			// pre.main(new String[]{""});
			System.exit(0);
		}	

		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();


		if(choice2 == 6 ){
			// Converter pre = new Converter();
			// pre.main(new String[]{""});
			System.exit(0);
		}	
		
		System.out.print("\nEnter " + units[choice1-1] + ":");
		temp = scn.nextDouble();

		if(choice1 == 1 && choice2 == 2){
			fahr = temp * 9/5 + 32;
			System.out.println(fahr+" \u00b0F");
		}
		else if(choice1 == 1 && choice2 == 3){
			kelvin = temp + 273.15f;
			System.out.println(kelvin+" \u00b0K");
		}
		else if(choice1 == 1 && choice2 == 4){
			reaumur = temp * 4.0f/5.0f;
			System.out.println(reaumur+" \u00b0Reaumur");
		}
		else if(choice1 == 1 && choice2 == 5){
			rankine = (temp+273.15f) * 9f/5f;
			System.out.println(rankine+" \u00b0Rankine");
		}
		else if(choice1 == 2 && choice2 == 1){
			cel = (temp-32)*(0.5556);
			System.out.println(cel+" \u00b0C");
		}
		else if(choice1 == 2 && choice2 == 3){
			kelvin = (temp+459.67f)*5f/9f;
			System.out.println(kelvin+" \u00b0K");
		}
		else if(choice1 == 2 && choice2 == 4){
			reaumur = (temp-32)*4f/9f;
			System.out.println(kelvin+" \u00b0Reaumur");
		}
		else if(choice1 == 2 && choice2 == 5){
			rankine = temp+459.67;
			System.out.println(rankine+" \u00b0Rankine");
		}
		else if(choice1 == 3 && choice2 == 1){
			cel = temp-273.15;
			System.out.println(cel+" \u00b0C");
		}
		else if(choice1 == 3 && choice2 == 2){
			fahr = temp*9f/5f-459.67f;
			System.out.println(fahr+" \u00b0F");
		}
		else if(choice1 == 3 && choice2 == 4){
			reaumur = (temp-273.15f)*4f/5f;
			System.out.println(kelvin+" \u00b0Reaumur");
		}
		else if(choice1 == 3 && choice2 == 5){
			rankine = temp*9f/5f;
			System.out.println(rankine+" \u00b0Rankine");
		}
		else if(choice1 == 4 && choice2 == 1){
			cel = temp*5f/4f;
			System.out.println(cel+" \u00b0C");
		}
		else if(choice1 == 4 && choice2 == 2){
			fahr = temp*9f/4f+32;
			System.out.println(fahr+" \u00b0F");
		}
		else if(choice1 == 4 && choice2 == 3){
			kelvin = temp*5f/4f+273.15f;
			System.out.println(kelvin+" \u00b0K");
		}
		else if(choice1 == 4 && choice2 == 5){
			rankine = temp*9f/4f+491.67f;
			System.out.println(rankine+" \u00b0Rankine");
		}
		else if(choice1 == 5 && choice2 == 1){
			cel =(temp-491.67f)*5f/9f;
			System.out.println(cel+" \u00b0C");
		}
		else if(choice1 == 5 && choice2 == 2){
			fahr = temp-459.67f;
			System.out.println(fahr+" \u00b0F");
		}
		else if(choice1 == 5 && choice2 == 3){
			kelvin = temp*5f/9f;
			System.out.println(kelvin+" \u00b0K");
		}
		else if(choice1 == 5 && choice2 == 4){
			reaumur = (temp-491.67f)*0.4444f;
			System.out.println(reaumur+" \u00b0Reaumur");
		}
		scn.nextInt();
	}

	public static void main(String[] args) {
		while(true){
			options();
			choiceFilling();
		}
	}
}