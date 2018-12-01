package sub;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Time{
	static String[] units = new String[]{"Year", "Week", "Day", "Hour", "Minute", "Second", "Milli-Second", "Micro-Second", "Nano-Second", "Pico-Second", "Exit"};
	static long prefixUnit, suffixUnit, seconds, milliS, nanos, picos, micros, weeks, days, hours,minutes, years;
	static int choice1, choice2;
	static Scanner scn = new Scanner(System.in);
	
	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nTIME CONVERTER");
		for(String each:units){
			System.out.println(i + "." + each);
			i++;
		}
	}

	public static void choiceFilling(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();

		if(choice1 == 11 ){
			// Converter pre = new Converter();
			// pre.main(new String[]{""});
			System.exit(0);
		}	

		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();


		if(choice2 == 11 ){
			// Converter pre = new Converter();
			// pre.main(new String[]{""});
			System.exit(0);
		}	

		System.out.print("\nEnter " + units[choice1-1] + "s:");
		prefixUnit = scn.nextLong();

		//The if-else ladder
		//----------Second Conversion-----------//
		if(choice1 == 6 && choice2 == 1){
			convertSecToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds" );
		}
		else if(choice1 == 6 && choice2 == 2){
			convertSecToWeek(prefixUnit);
			System.out.println(weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds" );
		}
		else if(choice1 == 6 && choice2 == 3){
			convertSecToDay(prefixUnit);
			System.out.println(days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds" );
		}
		else if(choice1 == 6 && choice2 == 5){
			convertSecToMin(prefixUnit);
			outputUnits();
		}
		else if(choice1 == 6 && choice2 == 4){
			convertSecToHour(prefixUnit);
			System.out.println("\n " + prefixUnit+" "+units[choice2-1]+"s "+suffixUnit+' '+" Minutes "+ seconds + " Seconds");
		}
		else if(choice1 == 6 && choice2 == 7){
			convertSecToMilli(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 6 && choice2 == 8){
			convertSecToMicro(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 6 && choice2 == 9){
			convertSecToNano(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 6 && choice2 == 10){
			convertSecToPico(prefixUnit);
			outputUnit();
		}
		//----------------------------------- -//

		//------Minutes Conversion Choices-----//
		else if(choice1 == 5 && choice2 == 1){
			convertMinToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes");
		}
		else if(choice1 == 5 && choice2 == 2){
			convertMinToWeek(prefixUnit);
			System.out.println(weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes");
		}
		else if(choice1 == 5 && choice2 == 3){
			convertMinToDay(prefixUnit);
			System.out.println(days+" Days "+hours+" Hours "+minutes+" Minutes");
		}
		else if(choice1 == 5 && choice2 == 4){
			convertMinToHour(prefixUnit);
			System.out.println(hours+" Hours "+minutes+" Minutes");
		}
		else if(choice1 == 5 && choice2 == 6){
			convertMinToSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 5 && choice2 == 7){
			convertMinToMilliSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 5 && choice2 == 8){
			convertMinToMicroSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 5 && choice2 == 9){
			convertMinToNanoSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 5 && choice2 == 10){
			convertMinToPicoSecond(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//----------Hour Conversion Choices-----------//
		else if(choice1 == 4 && choice2 == 1){
			convertHourToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" days "+hours+" hours");
		}
		else if(choice1 == 4 && choice2 == 2){
			convertHourToWeek(prefixUnit);
			System.out.println(prefixUnit+" Weeks "+days+" Days "+hours+" Hours");
		}
		else if(choice1 == 4 && choice2 == 3){
			convertHourToDay(prefixUnit);
			outputUnits();
		}
		else if(choice1 == 4 && choice2 == 5){
			convertHourToMinute(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 4 && choice2 == 6){
			convertHourToSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 4 && choice2 == 7){
			convertHourToMilliSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 4 && choice2 == 8){
			convertHourToMicroSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 4 && choice2 == 9){
			convertHourToNanoSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 4 && choice2 == 10){
			convertHourToPicoSecond(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//----------Day Conversion Choices-----------//
		else if(choice1 == 3 && choice2 == 1){
			convertDayToYear(prefixUnit);
			System.out.println(prefixUnit+" years "+weeks+" weeks "+days+" days");
		}
		else if(choice1 == 3 && choice2 == 2){
			convertDayToWeek(prefixUnit);
			outputUnits();
		}
		else if(choice1 == 3 && choice2 == 4){
			convertDayToHour(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 3 && choice2 == 5){
			convertDayToMinute(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 3 && choice2 == 6){
			convertDayToSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 3 && choice2 == 7){
			convertDayToMilliSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 3 && choice2 == 8){
			convertDayToMicroSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 3 && choice2 == 9){
			convertDayToNanoSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 3 && choice2 == 10){
			convertDayToPicoSecond(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//------Milli-Second Conversion Choices-------//
		else if(choice1 == 7 && choice2 == 1){
			convertMilliToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds");
		}
		else if(choice1 == 7 && choice2 == 2){
			convertMilliToWeek(prefixUnit);
			System.out.println(weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds");
		}
		else if(choice1 == 7 && choice2 == 3){
			convertMilliToDay(prefixUnit);
			System.out.println(days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds");
		}
		else if(choice1 == 7 && choice2 == 4){
			convertMilliToHour(prefixUnit);
			System.out.println(hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds");
		}
		else if(choice1 == 7 && choice2 == 5){
			convertMilliToMinute(prefixUnit);
			System.out.println(minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds");
		}
		else if(choice1 == 7 && choice2 == 6){
			convertMilliToSecond(prefixUnit);
			System.out.println(seconds+" Seconds "+milliS+"MilliSeconds");
		}
		else if(choice1 == 7 && choice2 == 8){
			convertMilliToMicro(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 7 && choice2 == 9){
			convertMilliToNano(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 7 && choice2 == 10){
			convertMilliToPico(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//------Micro-Second Conversion Choices-------//
		else if(choice1 == 8 && choice2 == 1){
			convertMicroToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 2){
			convertMicroToWeek(prefixUnit);
			System.out.println(weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 3){
			convertMicroToDay(prefixUnit);
			System.out.println(days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 4){
			convertMicroToHour(prefixUnit);
			System.out.println(hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 5){
			convertMicroToMinute(prefixUnit);
			System.out.println(minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 6){
			convertMicroToSecond(prefixUnit);
			System.out.println(seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 7){
			convertMicroToMilli(prefixUnit);
			System.out.println(milliS+" MilliSeconds "+micros+" MicroSeconds");
		}
		else if(choice1 == 8 && choice2 == 9){
			convertMicroToNano(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 8 && choice2 == 10){
			convertMicroToPico(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//----------- Week Conversion Choices --------//
		else if(choice1 == 2 && choice2 == 1){
			convertWeekToYear(prefixUnit);
			outputUnits();
		}
		else if(choice1 == 2 && choice2 == 3){
			convertWeekToDay(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 4){
			convertWeekToHour(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 5){
			convertWeekToMinute(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 6){
			convertWeekToSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 7){
			convertWeekToMilliSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 8){
			convertWeekToMicroSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 9){
			convertWeekToNanoSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 2 && choice2 == 10){
			convertWeekToPicoSecond(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//----------- Year Conversion Choices --------//
		else if(choice1 == 1 && choice2 == 2){
			convertYearToWeek(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 3){
			convertYearToDay(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 4){
			convertYearToHour(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 5){
			convertYearToMinute(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 6){
			convertYearToSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 7){
			convertYearToMilliSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 8){
			convertYearToMicroSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 9){
			convertYearToNanoSecond(prefixUnit);
			outputUnit();
		}
		else if(choice1 == 1 && choice2 == 10){
			convertYearToPicoSecond(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//----------- Nano Conversion Choices --------//
		else if(choice1 == 9 && choice2 == 1){
			convertNanoToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 2){
			convertNanoToWeek(prefixUnit);
			System.out.println(weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 3){
			convertNanoToDay(prefixUnit);
			System.out.println(days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 4){
			convertNanoToHour(prefixUnit);
			System.out.println(hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 5){
			convertNanoToMinute(prefixUnit);
			System.out.println(minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 6){
			convertNanoToSecond(prefixUnit);
			System.out.println(seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 7){
			convertNanoToMilli(prefixUnit);
			System.out.println(milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 8){
			convertNanoToMicro(prefixUnit);
			System.out.println(micros+" MicroSeconds "+nanos+" NanoSeconds");
		}
		else if(choice1 == 9 && choice2 == 10){
			convertNanoToPico(prefixUnit);
			outputUnit();
		}
		//--------------------------------------------//

		//----------- Nano Conversion Choices --------//
		else if(choice1 == 10 && choice2 == 1){
			convertPicoToYear(prefixUnit);
			System.out.println(years+" Years "+weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 2){
			convertPicoToWeek(prefixUnit);
			System.out.println(weeks+" Weeks "+days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 3){
			convertPicoToDay(prefixUnit);
			System.out.println(days+" Days "+hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 4){
			convertPicoToHour(prefixUnit);
			System.out.println(hours+" Hours "+minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 5){
			convertPicoToMinute(prefixUnit);
			System.out.println(minutes+" Minutes "+seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 6){
			convertPicoToSecond(prefixUnit);
			System.out.println(seconds+" Seconds "+milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 7){
			convertPicoToMilli(prefixUnit);
			System.out.println(milliS+" MilliSeconds "+micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 8){
			convertPicoToMicro(prefixUnit);
			System.out.println(micros+" MicroSeconds "+nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		else if(choice1 == 10 && choice2 == 9){
			convertPicoToNano(prefixUnit);
			System.out.println(nanos+" NanoSeconds "+picos+" PicoSeconds");
		}
		//--------------------------------------------//
		scn.nextInt();
	}


	public static void outputUnits(){
		System.out.println("\n " + prefixUnit+" "+units[choice2-1]+"s "+suffixUnit+' '+units[choice1-1]+'s');
		System.out.println("Press Enter!");
	}

	public static void outputUnit(){
		System.out.println("\n " + prefixUnit+" "+units[choice2-1]+"s ");
		System.out.println("Press Enter!");
	}

	//-------------Hour Conversions -----------------//
	public static void convertHourToYear(long hour){
		years = hour/24/365;
		weeks = hour/24/7%52;
		days = hour/24%7;
		hours = hour%8760%168%24;
	}
	public static void convertHourToWeek(long hour){
		prefixUnit = hour/24/7;
		days = hour/24%7;
		hours = hour%24%7;
	}
	public static void convertHourToDay(long hour){
		prefixUnit = hour / 24;
		suffixUnit = hour % 24;
	}
	public static void convertHourToMinute(long hour){
		prefixUnit = TimeUnit.HOURS.toMinutes(hour);
	}

	public static void convertHourToSecond(long hour){
		prefixUnit = TimeUnit.HOURS.toSeconds(hour);
	}

	public static void convertHourToMilliSecond(long hour){
		prefixUnit = TimeUnit.HOURS.toMillis(hour);
	}

	public static void convertHourToMicroSecond(long hour){
		prefixUnit = TimeUnit.HOURS.toMicros(hour);
	}

	public static void convertHourToNanoSecond(long hour){
		prefixUnit = TimeUnit.HOURS.toNanos(hour);
	}

	public static void convertHourToPicoSecond(long hour){
		prefixUnit = hour*60*60*1000*1000*1000*1000;
	}
	//--------------------------------------------------//

	//-------------Minutes Conversions -----------------//
	public static void convertMinToYear(long min){
		years = min/60/24/365;
		weeks = min/60/24/7%52;
		days = min/60/24%365%7;
		hours = min/60%24%7;
		minutes = min%1440%60%7;
	}
	public static void convertMinToWeek(long min){
		weeks = min/60/24/7;
		days = min/60/24%7;
		hours = min/60%24%7;
		minutes = min%1440%60%7;
	}
	public static void convertMinToDay(long min){
		days = min/60/24;
		hours = min/60%24;
		minutes = min%1440%60;
	}
	public static void convertMinToHour(long min){
		hours = min/60;
		minutes = min%60;
	}
	public static void convertMinToSecond(long min){
		prefixUnit = TimeUnit.MINUTES.toSeconds(min); 
	}

	public static void convertMinToMilliSecond(long min){
		prefixUnit = TimeUnit.MINUTES.toMillis(min);
	}

	public static void convertMinToMicroSecond(long min){
		prefixUnit = TimeUnit.MINUTES.toMicros(min);
	}

	public static void convertMinToNanoSecond(long min){
		prefixUnit = TimeUnit.MINUTES.toNanos(min);
	}

	public static void convertMinToPicoSecond(long min){
		prefixUnit = (min * 60)*1000*1000*1000*1000;
	}
	//-----------------------------------------------//

	//-------------Second Conversions -----------------//
	public static void convertSecToYear(long sec){
		years = sec/60/60/24/365;
		weeks = sec/60/60/24/7%52;
		days = sec/60/60/24%365%7;
		hours = sec/60/60%24;
		minutes = sec/60%60;
		seconds = sec%60;
	}
	public static void convertSecToWeek(long sec){
		weeks = sec/60/60/24/7;
		days = sec/60/60/24%7;
		hours = sec/60/60%24;
		minutes = sec/60%60;
		seconds = sec%60;
	}
	public static void convertSecToDay(long sec){
		days = sec/60/60/24;
		hours = sec/60/60%24;
		minutes = sec/60%60;
		seconds = sec%60;
	}
	public static void convertSecToHour(long sec){
		convertSecToMin(sec);
		prefixUnit = prefixUnit / 60;
		suffixUnit = (sec/60)%60;
		seconds = sec % 60;
	}

	public static void convertSecToMin(long sec){
		prefixUnit = sec / 60;
		suffixUnit = sec % 60;
	}

	public static void convertSecToMilli(long sec){
		prefixUnit = TimeUnit.SECONDS.toMillis(sec);
	}

	public static void convertSecToMicro(long sec){
		prefixUnit = TimeUnit.SECONDS.toMicros(sec);
	}

	public static void convertSecToNano(long sec){
		prefixUnit = TimeUnit.SECONDS.toNanos(sec);
	}

	public static void convertSecToPico(long sec){
		prefixUnit = sec * 1000000000000l;
	}
	//--------------------------------------------------//

	//--------------- Day Conversions ------------------//
	public static void convertDayToYear(long day){
		prefixUnit = day / 365;
		weeks = day%365/7;
		days = day%365%7;
	}
	public static void convertDayToWeek(long day){
		prefixUnit = day / 7;
		suffixUnit = day % 7;
	}
	public static void convertDayToHour(long day){
		prefixUnit = TimeUnit.DAYS.toHours(day);
	}
	public static void convertDayToMinute(long day){
		prefixUnit = TimeUnit.DAYS.toMinutes(day);
	}
	public static void convertDayToSecond(long day){
		prefixUnit = TimeUnit.DAYS.toSeconds(day);
	}
	public static void convertDayToMilliSecond(long day){
		prefixUnit = TimeUnit.DAYS.toMillis(day);
	}
	public static void convertDayToMicroSecond(long day){
		prefixUnit = TimeUnit.DAYS.toMicros(day);
	}
	public static void convertDayToNanoSecond(long day){
		prefixUnit = TimeUnit.DAYS.toNanos(day);
	}
	public static void convertDayToPicoSecond(long day){
		prefixUnit = day*24*60*60*1000*1000*1000*1000;
	}
	//--------------------------------------------------//


	//--------------- Milli-Second Conversion ----------//
	public static void convertMilliToYear(long milli){
		years =  milli/1000/60/60/24/7/52;
		weeks = milli/1000/60/60/24/7%52;
		days = milli/1000/60/60/24%7%365;
		hours = milli/1000/60/60%24;
		minutes = milli/1000/60%60;
		seconds = milli/1000%60;
		milliS = milli%1000;
	}
	public static void convertMilliToWeek(long milli){
		weeks = milli/1000/60/60/24/7;
		days = milli/1000/60/60/24%7;
		hours = milli/1000/60/60%24;
		minutes = milli/1000/60%60;
		seconds = milli/1000%60;
		milliS = milli%1000;
	}
	public static void convertMilliToDay(long milli){
		days = milli/1000/60/60/24;
		hours = milli/1000/60/60%24;
		minutes = milli/1000/60%60;
		seconds = milli/1000%60;
		milliS = milli%1000;
	}
	public static void convertMilliToHour(long milli){
		hours = milli/1000/60/60;
		minutes = milli/1000/60%60;
		seconds = milli/1000%60;
		milliS = milli%1000;
	}
	public static void convertMilliToMinute(long milli){
		minutes = milli/1000/60;
		seconds = milli/1000%60;
		milliS = milli%1000;
	}
	public static void convertMilliToSecond(long milli){
		seconds = milli/1000;
		milliS =  milli%1000;
	}
	public static void convertMilliToMicro(long milli){
		prefixUnit = TimeUnit.MILLISECONDS.toMicros(milli);
	}

	public static void convertMilliToNano(long milli){
		prefixUnit = TimeUnit.MILLISECONDS.toNanos(milli);
	}

	public static void convertMilliToPico(long milli){
		prefixUnit = milli * 1000 * 1000;
	}

	//--------------------------------------------------//

	//--------------- Micro-Second Conversion ----------//
	public static void convertMicroToYear(long micro){
		years =  micro/1000/1000/60/60/24/365;
		weeks = micro/1000/1000/60/60/24/7%52;
		days = micro/1000/1000/60/60/24%365%7;
		hours = micro/1000/1000/60/60%24;
		minutes = micro/1000/1000/60%60;
		seconds = micro/1000/1000%60;
		milliS = micro/1000%1000;
		micros = micro%1000;
	}
	public static void convertMicroToWeek(long micro){
		weeks = micro/1000/1000/60/60/24/7;
		days = micro/1000/1000/60/60/24%7;
		hours = micro/1000/1000/60/60%24;
		minutes = micro/1000/1000/60%60;
		seconds = micro/1000/1000%60;
		milliS = micro/1000%1000;
		micros = micro%1000;
	}
	public static void convertMicroToDay(long micro){
		days = micro/1000/1000/60/60/24;
		hours = micro/1000/1000/60/60%24;
		minutes = micro/1000/1000/60%60;
		seconds = micro/1000/1000%60;
		milliS = micro/1000%1000;
		micros = micro%1000;
	}
	public static void convertMicroToHour(long micro){
		hours = micro/1000/1000/60/60;
		minutes = micro/1000/1000/60%60;
		seconds = micro/1000/1000%60;
		milliS = micro/1000%1000;
		micros = micro%1000;
	}
	public static void convertMicroToMinute(long micro){
		minutes = micro/1000/1000/60;
		seconds = micro/1000/1000%60;
		milliS = micro/1000%1000;
		micros = micro%1000;
	}
	public static void convertMicroToSecond(long micro){
		seconds = micro/1000/1000;
		milliS = micro/1000%1000;
		micros = micro%1000;
	}
	public static void convertMicroToMilli(long micro){
		milliS = micro/1000;
		micros = micro%1000;
	}
	public static void convertMicroToNano(long micro){
		prefixUnit = TimeUnit.MICROSECONDS.toNanos(micro);
	}
	public static void convertMicroToPico(long micro){
		prefixUnit = micro*1000*1000;
	}
	//--------------------------------------------------//

	//--------------- Nano-Second Conversion ----------//
	public static void convertNanoToYear(long nano){
		years = nano/1000/1000/1000/60/60/24/365;
		weeks = nano/1000/1000/1000/60/60/24/7%52;
		days = nano/1000/1000/1000/60/60/24%365%7;
		hours = nano/1000/1000/1000/60/60%24;
		minutes = nano/1000/1000/1000/60%60;
		seconds = nano/1000/1000/1000%60; 
		milliS = nano/1000/1000%1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToWeek(long nano){
		weeks = nano/1000/1000/1000/60/60/24/7;
		days = nano/1000/1000/1000/60/60/24%7;
		hours = nano/1000/1000/1000/60/60%24;
		minutes = nano/1000/1000/1000/60%60;
		seconds = nano/1000/1000/1000%60; 
		milliS = nano/1000/1000%1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToDay(long nano){
		days = nano/1000/1000/1000/60/60/24;
		hours = nano/1000/1000/1000/60/60%24;
		minutes = nano/1000/1000/1000/60%60;
		seconds = nano/1000/1000/1000%60; 
		milliS = nano/1000/1000%1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToHour(long nano){
		hours = nano/1000/1000/1000/60/60;
		minutes = nano/1000/1000/1000/60%60;
		seconds = nano/1000/1000/1000%60; 
		milliS = nano/1000/1000%1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToMinute(long nano){
		minutes = nano/1000/1000/1000/60;
		seconds = nano/1000/1000/1000%60; 
		milliS = nano/1000/1000%1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToSecond(long nano){
		seconds = nano/1000/1000/1000; 
		milliS = nano/1000/1000%1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToMilli(long nano){
		milliS = nano/1000/1000;
		micros = nano/1000%1000;
		nanos = nano%1000;
	}
	public static void convertNanoToMicro(long nano){
		micros = nano/1000;
		nanos = nano%1000;
	}
	public static void convertNanoToPico(long nano){
		prefixUnit = nano*1000;
	}
	//--------------------------------------------------//

	//------------------ Pico Conversion ---------------//
	public static void convertPicoToYear(long pico){
		years = pico/1000/1000/1000/1000/60/60/24/365;
		weeks = pico/1000/1000/1000/1000/60/60/24%365%7;
		days = pico/1000/1000/1000/1000/60/60/24%7;
		hours = pico/1000/1000/1000/1000/60/60%24;
		minutes = pico/1000/1000/1000/1000/60%60;
		seconds = pico/1000/1000/1000/1000%60;
		milliS = pico/1000/1000/1000%1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToWeek(long pico){
		weeks = pico/1000/1000/1000/1000/60/60/24/7;
		days = pico/1000/1000/1000/1000/60/60/24%7;
		hours = pico/1000/1000/1000/1000/60/60%24;
		minutes = pico/1000/1000/1000/1000/60%60;
		seconds = pico/1000/1000/1000/1000%60;
		milliS = pico/1000/1000/1000%1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToDay(long pico){
		days = pico/1000/1000/1000/1000/60/60/24;
		hours = pico/1000/1000/1000/1000/60/60%24;
		minutes = pico/1000/1000/1000/1000/60%60;
		seconds = pico/1000/1000/1000/1000%60;
		milliS = pico/1000/1000/1000%1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToHour(long pico){
		hours = pico/1000/1000/1000/1000/60/60;
		minutes = pico/1000/1000/1000/1000/60%60;
		seconds = pico/1000/1000/1000/1000%60;
		milliS = pico/1000/1000/1000%1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToMinute(long pico){
		minutes = pico/1000/1000/1000/1000/60;
		seconds = pico/1000/1000/1000/1000%60;
		milliS = pico/1000/1000/1000%1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToSecond(long pico){
		seconds = pico/1000/1000/1000/1000;
		milliS = pico/1000/1000/1000%1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToMilli(long pico){
		milliS = pico/1000/1000/1000;
		micros = pico/1000/1000%1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToMicro(long pico){
		micros = pico/1000/1000;
		nanos = pico/1000%1000;
		picos = pico%1000;
	}
	public static void convertPicoToNano(long pico){
		nanos = pico/1000;
		picos = pico%1000;
	}
	//--------------------------------------------------//

	//------------------ Week Conversion ---------------//
	public static void convertWeekToYear(long week){
		prefixUnit = week / 52;
		suffixUnit = week % 52;
	}

	public static void convertWeekToDay(long week){
		prefixUnit = week * 7;
	}

	public static void convertWeekToHour(long week){
		convertDayToHour(week * 7);
	}

	public static void convertWeekToMinute(long week){
		convertDayToMinute(week * 7);
	}

	public static void convertWeekToSecond(long week){
		convertDayToSecond(week * 7);
	}

	public static void convertWeekToMilliSecond(long week){
		convertDayToMilliSecond(week * 7);
	}

	public static void convertWeekToMicroSecond(long week){
		convertDayToMicroSecond(week * 7);
	}

	public static void convertWeekToNanoSecond(long week){
		convertDayToNanoSecond(week * 7);
	}

	public static void convertWeekToPicoSecond(long week){
		convertDayToPicoSecond(week * 7);
	}
	//--------------------------------------------------//

	//------------------ Year Conversion ---------------//
	public static void convertYearToWeek(long year){
		weeks = year * 52;
		prefixUnit = (long)weeks;
	}
	public static void convertYearToDay(long year){
		prefixUnit = year * 365;
	}
	public static void convertYearToHour(long year){
		convertYearToDay(year);
		convertDayToHour(prefixUnit);
	}
	public static void convertYearToMinute(long year){
		convertYearToDay(year);
		convertDayToMinute(prefixUnit);
	}
	public static void convertYearToSecond(long year){
		convertYearToDay(year);
		convertDayToSecond(prefixUnit);
	}
	public static void convertYearToMilliSecond(long year){
		convertYearToDay(year);
		convertDayToMilliSecond(prefixUnit);
	}
	public static void convertYearToMicroSecond(long year){
		convertYearToDay(year);
		convertDayToMicroSecond(prefixUnit);
	}
	public static void convertYearToNanoSecond(long year){
		convertYearToDay(year);
		convertDayToNanoSecond(prefixUnit);
	}
	public static void convertYearToPicoSecond(long year){
		convertYearToDay(year);
		convertDayToPicoSecond(prefixUnit);
	}
	//--------------------------------------------------//

	public static void main(String arg[]){
		while(true){
			options();
			choiceFilling();
		}
	}
}