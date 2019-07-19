import java.util.Scanner;
import java.util.InputMismatchException;
import sub.*;


public class Converter{
	private static int choice;
	public static void menu(){
		String[] units = new String[]{"Computer Storage","Time","Temperature","Cooking","Speed"
										,"Currency","Volume","Area","Mass","Length","Power","Exit"};
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUNIT CONVERTER");
		for(String each:units){
			System.out.println(i + "." + each);
			i++;
		}
	}

	public static void input(){
		Scanner in  = new Scanner(System.in);
		System.out.print("\nYour Choice:");
		choice = in.nextInt();
	}

	public static void choice(String arg[]){
		try{
			input();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input! " + e + "\nPlease enter again.");
			input();
		}
		if(choice==12){
			System.exit(0);
		}
		else if(choice==1){
			Cbit.main(arg);
		}
		else if(choice==2){
			Time.main(arg);
		}
		else if(choice==3){
			Temperature.main(arg);
		}
		else if(choice==4){
			Cooking.main(arg);
		}
		else if(choice==5){
			Speed.main(arg);
		}
		else if(choice==6){
			Currency.main(arg);
		}
		else if(choice==7){
			Volume.main(arg);
		}
		else if(choice==8){
			Area.main(arg);
		}
		else if(choice==9){
			Mass.main(arg);
		}
		else if(choice==10){
			Length.main(arg);
		}
		else if(choice==11){
			Power.main(arg);
		}
	}

	public static void main(String arg[]){
		while(true){
			menu();
			choice(arg);
		}
	}
}
