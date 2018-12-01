package sub;
import java.util.Scanner;
import java.math.BigDecimal;

public class Currency{
	static final String[] units = new String[]{"USD US Dollar", "EUR Euro", "HKD Hong Kong Dollar", "Bitcoin", "Bitcoin Cash",
	 "JPY Japanese Yen", "CNY Chinese Yuan", "INR Indian Rupee", "DZD Algerian Dinar", "ARS Argentine Peso", "AUD Australian Dollar", "BRL Brazilian",
	 "GBP British Pound", "BGN Bulgarian Lev", "KHR Cambodian Riel", "CAD Canadian Dollar", "CLP Chilean Peso", "COP Columbian Peso",
	 "CRC Costa Rican Colon", "HRK Croatian Kuna", "CZK Czech Republic Koruna", "DKK Danish Krone", "EGP Egyptian Pound", "ISK Icelandic Krona",
	 "IDR Indonesian Rupiah", "IQD Iraqi Dinar", "ILS Israeli New Shekel", "JOD Jordanian Dinar", "KES Kenyan Shilling", "KWD Kuwaiti Dinar",
	 "MYR Malaysian Ringgit", "MXN Mexican Peso", "MAD Moroccan Dirham", "MMK Myanmar Kyat", "TWD New Taiwan Dollar", "NZD New Zealand Dollar",
	 "NOK Norwegian Krone", "PHP Philippine Peso", "QAR Qatari Rial", "RON Romanian Leu", "RUB Russian Rouble", "SAR Saudi Riyal", 
	 "RSD Serbian Dinar", "SGD Singapore Dollar", "ZAR South African Rand", "KRW South Korean Won", "LKR Sri Lankan Rupee", "SEK Swedish Krona",
	 "CHF Swiss Franc", "SYP Syrian Pound", "TZS Tanzanian Shilling",  "THB Thai Baht", "TRY Turkish Lira", "UGX Ugandan Shilling",
	 "UAH Ukrainian Hryvnia",  "AED United Arab Emirates Dirham", "VND Vietnamese Dong", "ZMW Zambian Kwacha", "Exit"};

	static BigDecimal unit;
	static int choice1, choice2;
	static Scanner scn = new Scanner(System.in);
	
	public static void options(){
		int i=1;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCURRENCY CONVERTER");
		for(String each:units){
			System.out.println(i + ". " + each);
			i++;
		}
	}

	public static void choiceFilling(){
		System.out.println();
		System.out.print("\nConvert From:");
		choice1 = scn.nextInt();

		if(choice1 == 59 ){
			System.exit(0);
		}	

		System.out.print("\nConvert To:");
		choice2 = scn.nextInt();


		if(choice2 == 59 ){
			System.exit(0);
		}

		System.out.print("\nEnter " + units[choice1-1] + ": ");
		unit = scn.nextBigDecimal();

		//The if-else ladder
		//-------USD Conversion Choices-------//
		if(choice1 == 1 && choice2 == 1){
			USDtoUSD();
		}
		else if(choice1 == 1 && choice2 == 2){
			USDtoEUR();
		}
		else if(choice1 == 1 && choice2 == 3){
			USDtoHKD();
		}
		else if(choice1 == 1 && choice2 == 4){
			USDtoBitcoin();
		}
		else if(choice1 == 1 && choice2 == 5){
			USDtoBitcoinCash();
		}
		else if(choice1 == 1 && choice2 == 6){
			USDtoJPY();
		}
		else if(choice1 == 1 && choice2 == 7){
			USDtoCNY();
		}
		else if(choice1 == 1 && choice2 == 8){
			USDtoINR();
		}
		else if(choice1 == 1 && choice2 == 9){
			USDtoDZD();
		}
		else if(choice1 == 1 && choice2 == 10){
			USDtoARS();
		}
		else if(choice1 == 1 && choice2 == 11){
			USDtoAUD();
		}
		else if(choice1 == 1 && choice2 == 12){
			USDtoBRL();
		}
		else if(choice1 == 1 && choice2 == 13){
			USDtoGBP();
		}
		else if(choice1 == 1 && choice2 == 14){
			USDtoBGN();
		}
		else if(choice1 == 1 && choice2 == 15){
			USDtoKHR();
		}
		else if(choice1 == 1 && choice2 == 16){
			USDtoCAD();
		}
		else if(choice1 == 1 && choice2 == 17){
			USDtoCLP();
		}
		else if(choice1 == 1 && choice2 == 18){
			USDtoCOP();
		}
		else if(choice1 == 1 && choice2 == 19){
			USDtoCRC();
		}
		else if(choice1 == 1 && choice2 == 20){
			USDtoHRK();
		}
		else if(choice1 == 1 && choice2 == 21){
			USDtoCZK();
		}
		else if(choice1 == 1 && choice2 == 22){
			USDtoDKK();
		}
		else if(choice1 == 1 && choice2 == 23){
			USDtoEGP();
		}
		else if(choice1 == 1 && choice2 == 24){
			USDtoISK();
		}
		else if(choice1 == 1 && choice2 == 25){
			USDtoIDR();
		}
		else if(choice1 == 1 && choice2 == 26){
			USDtoIQD();
		}
		else if(choice1 == 1 && choice2 == 27){
			USDtoILS();
		}
		else if(choice1 == 1 && choice2 == 28){
			USDtoJOD();
		}
		else if(choice1 == 1 && choice2 == 29){
			USDtoKES();
		}
		else if(choice1 == 1 && choice2 == 30){
			USDtoKWD();
		}
		else if(choice1 == 1 && choice2 == 31){
			USDtoMYR();
		}
		else if(choice1 == 1 && choice2 == 32){
			USDtoMXN();
		}
		else if(choice1 == 1 && choice2 == 33){
			USDtoMAD();
		}
		else if(choice1 == 1 && choice2 == 34){
			USDtoMMK();
		}
		else if(choice1 == 1 && choice2 == 35){
			USDtoTWD();
		}
		else if(choice1 == 1 && choice2 == 36){
			USDtoNZD();
		}
		else if(choice1 == 1 && choice2 == 37){
			USDtoNOK();
		}
		else if(choice1 == 1 && choice2 == 38){
			USDtoPHP();
		}
		else if(choice1 == 1 && choice2 == 39){
			USDtoQAR();
		}
		else if(choice1 == 1 && choice2 == 40){
			USDtoRON();
		}
		else if(choice1 == 1 && choice2 == 41){
			USDtoRUB();
		}
		else if(choice1 == 1 && choice2 == 42){
			USDtoSAR();
		}
		else if(choice1 == 1 && choice2 == 43){
			USDtoRSD();
		}
		else if(choice1 == 1 && choice2 == 44){
			USDtoSGD();
		}
		else if(choice1 == 1 && choice2 == 45){
			USDtoZAR();
		}
		else if(choice1 == 1 && choice2 == 46){
			USDtoKRW();
		}
		else if(choice1 == 1 && choice2 == 47){
			USDtoLKR();
		}
		else if(choice1 == 1 && choice2 == 48){
			USDtoSEK();
		}
		else if(choice1 == 1 && choice2 == 49){
			USDtoCHF();
		}
		else if(choice1 == 1 && choice2 == 50){
			USDtoSYP();
		}
		else if(choice1 == 1 && choice2 == 51){
			USDtoTZS();
		}
		else if(choice1 == 1 && choice2 == 52){
			USDtoTHB();
		}
		else if(choice1 == 1 && choice2 == 53){
			USDtoTRY();
		}
		else if(choice1 == 1 && choice2 == 54){
			USDtoUGX();
		}
		else if(choice1 == 1 && choice2 == 55){
			USDtoUAH();
		}
		else if(choice1 == 1 && choice2 == 56){
			USDtoAED();
		}
		else if(choice1 == 1 && choice2 == 57){
			USDtoVND();
		}
		else if(choice1 == 1 && choice2 == 58){
			USDtoZMW();
		}
		//--------------------------------------------//

		//------------EURO Conversion Choices----------//
		if(choice1 == 2 && choice2 == 1){
			EURtoUSD();
		}
		else if(choice1 == 2 && choice2 == 2){
			EURtoEUR();
		}
		else if(choice1 == 2 && choice2 == 3){
			EURtoHKD();
		}
		else if(choice1 == 2 && choice2 == 4){
			EURtoBitcoin();
		}
		else if(choice1 == 2 && choice2 == 5){
			EURtoBitcoinCash();
		}
		else if(choice1 == 2 && choice2 == 6){
			EURtoJPY();
		}
		else if(choice1 == 2 && choice2 == 7){
			EURtoCNY();
		}
		else if(choice1 == 2 && choice2 == 8){
			EURtoINR();
		}
		else if(choice1 == 2 && choice2 == 9){
			EURtoDZD();
		}
		else if(choice1 == 2 && choice2 == 10){
			EURtoARS();
		}
		else if(choice1 == 2 && choice2 == 11){
			EURtoAUD();
		}
		else if(choice1 == 2 && choice2 == 12){
			EURtoBRL();
		}
		else if(choice1 == 2 && choice2 == 13){
			EURtoGBP();
		}
		else if(choice1 == 2 && choice2 == 14){
			EURtoBGN();
		}
		else if(choice1 == 2 && choice2 == 15){
			EURtoKHR();
		}
		else if(choice1 == 2 && choice2 == 16){
			EURtoCAD();
		}
		else if(choice1 == 2 && choice2 == 17){
			EURtoCLP();
		}
		else if(choice1 == 2 && choice2 == 18){
			EURtoCOP();
		}
		else if(choice1 == 2 && choice2 == 19){
			EURtoCRC();
		}
		else if(choice1 == 2 && choice2 == 20){
			EURtoHRK();
		}
		else if(choice1 == 2 && choice2 == 21){
			EURtoCZK();
		}
		else if(choice1 == 2 && choice2 == 22){
			EURtoDKK();
		}
		else if(choice1 == 2 && choice2 == 23){
			EURtoEGP();
		}
		else if(choice1 == 2 && choice2 == 24){
			EURtoISK();
		}
		else if(choice1 == 2 && choice2 == 25){
			EURtoIDR();
		}
		else if(choice1 == 2 && choice2 == 26){
			EURtoIQD();
		}
		else if(choice1 == 2 && choice2 == 27){
			EURtoILS();
		}
		else if(choice1 == 2 && choice2 == 28){
			EURtoJOD();
		}
		else if(choice1 == 2 && choice2 == 29){
			EURtoKES();
		}
		else if(choice1 == 2 && choice2 == 30){
			EURtoKWD();
		}
		else if(choice1 == 2 && choice2 == 31){
			EURtoMYR();
		}
		else if(choice1 == 2 && choice2 == 32){
			EURtoMXN();
		}
		else if(choice1 == 2 && choice2 == 33){
			EURtoMAD();
		}
		else if(choice1 == 2 && choice2 == 34){
			EURtoMMK();
		}
		else if(choice1 == 2 && choice2 == 35){
			EURtoTWD();
		}
		else if(choice1 == 2 && choice2 == 36){
			EURtoNZD();
		}
		else if(choice1 == 2 && choice2 == 37){
			EURtoNOK();
		}
		else if(choice1 == 2 && choice2 == 38){
			EURtoPHP();
		}
		else if(choice1 == 2 && choice2 == 39){
			EURtoQAR();
		}
		else if(choice1 == 2 && choice2 == 40){
			EURtoRON();
		}
		else if(choice1 == 2 && choice2 == 41){
			EURtoRUB();
		}
		else if(choice1 == 2 && choice2 == 42){
			EURtoSAR();
		}
		else if(choice1 == 2 && choice2 == 43){
			EURtoRSD();
		}
		else if(choice1 == 2 && choice2 == 44){
			EURtoSGD();
		}
		else if(choice1 == 2 && choice2 == 45){
			EURtoZAR();
		}
		else if(choice1 == 2 && choice2 == 46){
			EURtoKRW();
		}
		else if(choice1 == 2 && choice2 == 47){
			EURtoLKR();
		}
		else if(choice1 == 2 && choice2 == 48){
			EURtoSEK();
		}
		else if(choice1 == 2 && choice2 == 49){
			EURtoCHF();
		}
		else if(choice1 == 2 && choice2 == 50){
			EURtoSYP();
		}
		else if(choice1 == 2 && choice2 == 51){
			EURtoTZS();
		}
		else if(choice1 == 2 && choice2 == 52){
			EURtoTHB();
		}
		else if(choice1 == 2 && choice2 == 53){
			EURtoTRY();
		}
		else if(choice1 == 2 && choice2 == 54){
			EURtoUGX();
		}
		else if(choice1 == 2 && choice2 == 55){
			EURtoUAH();
		}
		else if(choice1 == 2 && choice2 == 56){
			EURtoAED();
		}
		else if(choice1 == 2 && choice2 == 57){
			EURtoVND();
		}
		else if(choice1 == 2 && choice2 == 58){
			EURtoZMW();
		}

		//------------Hong Kong Dollar Conversion Choices----------//
		if(choice1 == 3 && choice2 == 1){
			HKDtoUSD();
		}
		else if(choice1 == 3 && choice2 == 2){
			HKDtoEUR();
		}
		else if(choice1 == 3 && choice2 == 3){
			HKDtoHKD();
		}
		else if(choice1 == 3 && choice2 == 4){
			HKDtoBitcoin();
		}
		else if(choice1 == 3 && choice2 == 5){
			HKDtoBitcoinCash();
		}
		else if(choice1 == 3 && choice2 == 6){
			HKDtoJPY();
		}
		else if(choice1 == 3 && choice2 == 7){
			HKDtoCNY();
		}
		else if(choice1 == 3 && choice2 == 8){
			HKDtoINR();
		}
		else if(choice1 == 3 && choice2 == 9){
			HKDtoDZD();
		}
		else if(choice1 == 3 && choice2 == 10){
			HKDtoARS();
		}
		else if(choice1 == 3 && choice2 == 11){
			HKDtoAUD();
		}
		else if(choice1 == 3 && choice2 == 12){
			HKDtoBRL();
		}
		else if(choice1 == 3 && choice2 == 13){
			HKDtoGBP();
		}
		else if(choice1 == 3 && choice2 == 14){
			HKDtoBGN();
		}
		else if(choice1 == 3 && choice2 == 15){
			HKDtoKHR();
		}
		else if(choice1 == 3 && choice2 == 16){
			HKDtoCAD();
		}
		else if(choice1 == 3 && choice2 == 17){
			HKDtoCLP();
		}
		else if(choice1 == 3 && choice2 == 18){
			HKDtoCOP();
		}
		else if(choice1 == 3 && choice2 == 19){
			HKDtoCRC();
		}
		else if(choice1 == 3 && choice2 == 20){
			HKDtoHRK();
		}
		else if(choice1 == 3 && choice2 == 21){
			HKDtoCZK();
		}
		else if(choice1 == 3 && choice2 == 22){
			HKDtoDKK();
		}
		else if(choice1 == 3 && choice2 == 23){
			HKDtoEGP();
		}
		else if(choice1 == 3 && choice2 == 24){
			HKDtoISK();
		}
		else if(choice1 == 3 && choice2 == 25){
			HKDtoIDR();
		}
		else if(choice1 == 3 && choice2 == 26){
			HKDtoIQD();
		}
		else if(choice1 == 3 && choice2 == 27){
			HKDtoILS();
		}
		else if(choice1 == 3 && choice2 == 28){
			HKDtoJOD();
		}
		else if(choice1 == 3 && choice2 == 29){
			HKDtoKES();
		}
		else if(choice1 == 3 && choice2 == 30){
			HKDtoKWD();
		}
		else if(choice1 == 3 && choice2 == 31){
			HKDtoMYR();
		}
		else if(choice1 == 3 && choice2 == 32){
			HKDtoMXN();
		}
		else if(choice1 == 3 && choice2 == 33){
			HKDtoMAD();
		}
		else if(choice1 == 3 && choice2 == 34){
			HKDtoMMK();
		}
		else if(choice1 == 3 && choice2 == 35){
			HKDtoTWD();
		}
		else if(choice1 == 3 && choice2 == 36){
			HKDtoNZD();
		}
		else if(choice1 == 3 && choice2 == 37){
			HKDtoNOK();
		}
		else if(choice1 == 3 && choice2 == 38){
			HKDtoPHP();
		}
		else if(choice1 == 3 && choice2 == 39){
			HKDtoQAR();
		}
		else if(choice1 == 3 && choice2 == 40){
			HKDtoRON();
		}
		else if(choice1 == 3 && choice2 == 41){
			HKDtoRUB();
		}
		else if(choice1 == 3 && choice2 == 42){
			HKDtoSAR();
		}
		else if(choice1 == 3 && choice2 == 43){
			HKDtoRSD();
		}
		else if(choice1 == 3 && choice2 == 44){
			HKDtoSGD();
		}
		else if(choice1 == 3 && choice2 == 45){
			HKDtoZAR();
		}
		else if(choice1 == 3 && choice2 == 46){
			HKDtoKRW();
		}
		else if(choice1 == 3 && choice2 == 47){
			HKDtoLKR();
		}
		else if(choice1 == 3 && choice2 == 48){
			HKDtoSEK();
		}
		else if(choice1 == 3 && choice2 == 49){
			HKDtoCHF();
		}
		else if(choice1 == 3 && choice2 == 50){
			HKDtoSYP();
		}
		else if(choice1 == 3 && choice2 == 51){
			HKDtoTZS();
		}
		else if(choice1 == 3 && choice2 == 52){
			HKDtoTHB();
		}
		else if(choice1 == 3 && choice2 == 53){
			HKDtoTRY();
		}
		else if(choice1 == 3 && choice2 == 54){
			HKDtoUGX();
		}
		else if(choice1 == 3 && choice2 == 55){
			HKDtoUAH();
		}
		else if(choice1 == 3 && choice2 == 56){
			HKDtoAED();
		}
		else if(choice1 == 3 && choice2 == 57){
			HKDtoVND();
		}
		else if(choice1 == 3 && choice2 == 58){
			HKDtoZMW();
		}
		//------------Bitcoin Conversion Choices----------//
		if(choice1 == 4 && choice2 == 1){
			BitcointoUSD();
		}
		else if(choice1 == 4 && choice2 == 2){
			BitcointoEUR();
		}
		else if(choice1 == 4 && choice2 == 3){
			BitcointoHKD();
		}
		else if(choice1 == 4 && choice2 == 4){
			BitcointoBitcoin();
		}
		else if(choice1 == 4 && choice2 == 5){
			BitcointoBitcoinCash();
		}
		else if(choice1 == 4 && choice2 == 6){
			BitcointoJPY();
		}
		else if(choice1 == 4 && choice2 == 7){
			BitcointoCNY();
		}
		else if(choice1 == 4 && choice2 == 8){
			BitcointoINR();
		}
		else if(choice1 == 4 && choice2 == 9){
			BitcointoDZD();
		}
		else if(choice1 == 4 && choice2 == 10){
			BitcointoARS();
		}
		else if(choice1 == 4 && choice2 == 11){
			BitcointoAUD();
		}
		else if(choice1 == 4 && choice2 == 12){
			BitcointoBRL();
		}
		else if(choice1 == 4 && choice2 == 13){
			BitcointoGBP();
		}
		else if(choice1 == 4 && choice2 == 14){
			BitcointoBGN();
		}
		else if(choice1 == 4 && choice2 == 15){
			BitcointoKHR();
		}
		else if(choice1 == 4 && choice2 == 16){
			BitcointoCAD();
		}
		else if(choice1 == 4 && choice2 == 17){
			BitcointoCLP();
		}
		else if(choice1 == 4 && choice2 == 18){
			BitcointoCOP();
		}
		else if(choice1 == 4 && choice2 == 19){
			BitcointoCRC();
		}
		else if(choice1 == 4 && choice2 == 20){
			BitcointoHRK();
		}
		else if(choice1 == 4 && choice2 == 21){
			BitcointoCZK();
		}
		else if(choice1 == 4 && choice2 == 22){
			BitcointoDKK();
		}
		else if(choice1 == 4 && choice2 == 23){
			BitcointoEGP();
		}
		else if(choice1 == 4 && choice2 == 24){
			BitcointoISK();
		}
		else if(choice1 == 4 && choice2 == 25){
			BitcointoIDR();
		}
		else if(choice1 == 4 && choice2 == 26){
			BitcointoIQD();
		}
		else if(choice1 == 4 && choice2 == 27){
			BitcointoILS();
		}
		else if(choice1 == 4 && choice2 == 28){
			BitcointoJOD();
		}
		else if(choice1 == 4 && choice2 == 29){
			BitcointoKES();
		}
		else if(choice1 == 4 && choice2 == 30){
			BitcointoKWD();
		}
		else if(choice1 == 4 && choice2 == 31){
			BitcointoMYR();
		}
		else if(choice1 == 4 && choice2 == 32){
			BitcointoMXN();
		}
		else if(choice1 == 4 && choice2 == 33){
			BitcointoMAD();
		}
		else if(choice1 == 4 && choice2 == 34){
			BitcointoMMK();
		}
		else if(choice1 == 4 && choice2 == 35){
			BitcointoTWD();
		}
		else if(choice1 == 4 && choice2 == 36){
			BitcointoNZD();
		}
		else if(choice1 == 4 && choice2 == 37){
			BitcointoNOK();
		}
		else if(choice1 == 4 && choice2 == 38){
			BitcointoPHP();
		}
		else if(choice1 == 4 && choice2 == 39){
			BitcointoQAR();
		}
		else if(choice1 == 4 && choice2 == 40){
			BitcointoRON();
		}
		else if(choice1 == 4 && choice2 == 41){
			BitcointoRUB();
		}
		else if(choice1 == 4 && choice2 == 42){
			BitcointoSAR();
		}
		else if(choice1 == 4 && choice2 == 43){
			BitcointoRSD();
		}
		else if(choice1 == 4 && choice2 == 44){
			BitcointoSGD();
		}
		else if(choice1 == 4 && choice2 == 45){
			BitcointoZAR();
		}
		else if(choice1 == 4 && choice2 == 46){
			BitcointoKRW();
		}
		else if(choice1 == 4 && choice2 == 47){
			BitcointoLKR();
		}
		else if(choice1 == 4 && choice2 == 48){
			BitcointoSEK();
		}
		else if(choice1 == 4 && choice2 == 49){
			BitcointoCHF();
		}
		else if(choice1 == 4 && choice2 == 50){
			BitcointoSYP();
		}
		else if(choice1 == 4 && choice2 == 51){
			BitcointoTZS();
		}
		else if(choice1 == 4 && choice2 == 52){
			BitcointoTHB();
		}
		else if(choice1 == 4 && choice2 == 53){
			BitcointoTRY();
		}
		else if(choice1 == 4 && choice2 == 54){
			BitcointoUGX();
		}
		else if(choice1 == 4 && choice2 == 55){
			BitcointoUAH();
		}
		else if(choice1 == 4 && choice2 == 56){
			BitcointoAED();
		}
		else if(choice1 == 4 && choice2 == 57){
			BitcointoVND();
		}
		else if(choice1 == 4 && choice2 == 58){
			BitcointoZMW();
		}
		//------------Bitcoin Cash Conversion Choices----------//
		if(choice1 == 5 && choice2 == 1){
			BitcoinCashtoUSD();
		}
		else if(choice1 == 5 && choice2 == 2){
			BitcoinCashtoEUR();
		}
		else if(choice1 == 5 && choice2 == 3){
			BitcoinCashtoHKD();
		}
		else if(choice1 == 5 && choice2 == 4){
			BitcoinCashtoBitcoin();
		}
		else if(choice1 == 5 && choice2 == 5){
			BitcoinCashtoBitcoinCash();
		}
		else if(choice1 == 5 && choice2 == 6){
			BitcoinCashtoJPY();
		}
		else if(choice1 == 5 && choice2 == 7){
			BitcoinCashtoCNY();
		}
		else if(choice1 == 5 && choice2 == 8){
			BitcoinCashtoINR();
		}
		else if(choice1 == 5 && choice2 == 9){
			BitcoinCashtoDZD();
		}
		else if(choice1 == 5 && choice2 == 10){
			BitcoinCashtoARS();
		}
		else if(choice1 == 5 && choice2 == 11){
			BitcoinCashtoAUD();
		}
		else if(choice1 == 5 && choice2 == 12){
			BitcoinCashtoBRL();
		}
		else if(choice1 == 5 && choice2 == 13){
			BitcoinCashtoGBP();
		}
		else if(choice1 == 5 && choice2 == 14){
			BitcoinCashtoBGN();
		}
		else if(choice1 == 5 && choice2 == 15){
			BitcoinCashtoKHR();
		}
		else if(choice1 == 5 && choice2 == 16){
			BitcoinCashtoCAD();
		}
		else if(choice1 == 5 && choice2 == 17){
			BitcoinCashtoCLP();
		}
		else if(choice1 == 5 && choice2 == 18){
			BitcoinCashtoCOP();
		}
		else if(choice1 == 5 && choice2 == 19){
			BitcoinCashtoCRC();
		}
		else if(choice1 == 5 && choice2 == 20){
			BitcoinCashtoHRK();
		}
		else if(choice1 == 5 && choice2 == 21){
			BitcoinCashtoCZK();
		}
		else if(choice1 == 5 && choice2 == 22){
			BitcoinCashtoDKK();
		}
		else if(choice1 == 5 && choice2 == 23){
			BitcoinCashtoEGP();
		}
		else if(choice1 == 5 && choice2 == 24){
			BitcoinCashtoISK();
		}
		else if(choice1 == 5 && choice2 == 25){
			BitcoinCashtoIDR();
		}
		else if(choice1 == 5 && choice2 == 26){
			BitcoinCashtoIQD();
		}
		else if(choice1 == 5 && choice2 == 27){
			BitcoinCashtoILS();
		}
		else if(choice1 == 5 && choice2 == 28){
			BitcoinCashtoJOD();
		}
		else if(choice1 == 5 && choice2 == 29){
			BitcoinCashtoKES();
		}
		else if(choice1 == 5 && choice2 == 30){
			BitcoinCashtoKWD();
		}
		else if(choice1 == 5 && choice2 == 31){
			BitcoinCashtoMYR();
		}
		else if(choice1 == 5 && choice2 == 32){
			BitcoinCashtoMXN();
		}
		else if(choice1 == 5 && choice2 == 33){
			BitcoinCashtoMAD();
		}
		else if(choice1 == 5 && choice2 == 34){
			BitcoinCashtoMMK();
		}
		else if(choice1 == 5 && choice2 == 35){
			BitcoinCashtoTWD();
		}
		else if(choice1 == 5 && choice2 == 36){
			BitcoinCashtoNZD();
		}
		else if(choice1 == 5 && choice2 == 37){
			BitcoinCashtoNOK();
		}
		else if(choice1 == 5 && choice2 == 38){
			BitcoinCashtoPHP();
		}
		else if(choice1 == 5 && choice2 == 39){
			BitcoinCashtoQAR();
		}
		else if(choice1 == 5 && choice2 == 40){
			BitcoinCashtoRON();
		}
		else if(choice1 == 5 && choice2 == 41){
			BitcoinCashtoRUB();
		}
		else if(choice1 == 5 && choice2 == 42){
			BitcoinCashtoSAR();
		}
		else if(choice1 == 5 && choice2 == 43){
			BitcoinCashtoRSD();
		}
		else if(choice1 == 5 && choice2 == 44){
			BitcoinCashtoSGD();
		}
		else if(choice1 == 5 && choice2 == 45){
			BitcoinCashtoZAR();
		}
		else if(choice1 == 5 && choice2 == 46){
			BitcoinCashtoKRW();
		}
		else if(choice1 == 5 && choice2 == 47){
			BitcoinCashtoLKR();
		}
		else if(choice1 == 5 && choice2 == 48){
			BitcoinCashtoSEK();
		}
		else if(choice1 == 5 && choice2 == 49){
			BitcoinCashtoCHF();
		}
		else if(choice1 == 5 && choice2 == 50){
			BitcoinCashtoSYP();
		}
		else if(choice1 == 5 && choice2 == 51){
			BitcoinCashtoTZS();
		}
		else if(choice1 == 5 && choice2 == 52){
			BitcoinCashtoTHB();
		}
		else if(choice1 == 5 && choice2 == 53){
			BitcoinCashtoTRY();
		}
		else if(choice1 == 5 && choice2 == 54){
			BitcoinCashtoUGX();
		}
		else if(choice1 == 5 && choice2 == 55){
			BitcoinCashtoUAH();
		}
		else if(choice1 == 5 && choice2 == 56){
			BitcoinCashtoAED();
		}
		else if(choice1 == 5 && choice2 == 57){
			BitcoinCashtoVND();
		}
		else if(choice1 == 5 && choice2 == 58){
			BitcoinCashtoZMW();
		}
		//------------JPY Yen Conversion Choices----------//
		if(choice1 == 6 && choice2 == 1){
			JPYtoUSD();
		}
		else if(choice1 == 6 && choice2 == 2){
			JPYtoEUR();
		}
		else if(choice1 == 6 && choice2 == 3){
			JPYtoHKD();
		}
		else if(choice1 == 6 && choice2 == 4){
			JPYtoBitcoin();
		}
		else if(choice1 == 6 && choice2 == 5){
			JPYtoBitcoinCash();
		}
		else if(choice1 == 6 && choice2 == 6){
			JPYtoJPY();
		}
		else if(choice1 == 6 && choice2 == 7){
			JPYtoCNY();
		}
		else if(choice1 == 6 && choice2 == 8){
			JPYtoINR();
		}
		else if(choice1 == 6 && choice2 == 9){
			JPYtoDZD();
		}
		else if(choice1 == 6 && choice2 == 10){
			JPYtoARS();
		}
		else if(choice1 == 6 && choice2 == 11){
			JPYtoAUD();
		}
		else if(choice1 == 6 && choice2 == 12){
			JPYtoBRL();
		}
		else if(choice1 == 6 && choice2 == 13){
			JPYtoGBP();
		}
		else if(choice1 == 6 && choice2 == 14){
			JPYtoBGN();
		}
		else if(choice1 == 6 && choice2 == 15){
			JPYtoKHR();
		}
		else if(choice1 == 6 && choice2 == 16){
			JPYtoCAD();
		}
		else if(choice1 == 6 && choice2 == 17){
			JPYtoCLP();
		}
		else if(choice1 == 6 && choice2 == 18){
			JPYtoCOP();
		}
		else if(choice1 == 6 && choice2 == 19){
			JPYtoCRC();
		}
		else if(choice1 == 6 && choice2 == 20){
			JPYtoHRK();
		}
		else if(choice1 == 6 && choice2 == 21){
			JPYtoCZK();
		}
		else if(choice1 == 6 && choice2 == 22){
			JPYtoDKK();
		}
		else if(choice1 == 6 && choice2 == 23){
			JPYtoEGP();
		}
		else if(choice1 == 6 && choice2 == 24){
			JPYtoISK();
		}
		else if(choice1 == 6 && choice2 == 25){
			JPYtoIDR();
		}
		else if(choice1 == 6 && choice2 == 26){
			JPYtoIQD();
		}
		else if(choice1 == 6 && choice2 == 27){
			JPYtoILS();
		}
		else if(choice1 == 6 && choice2 == 28){
			JPYtoJOD();
		}
		else if(choice1 == 6 && choice2 == 29){
			JPYtoKES();
		}
		else if(choice1 == 6 && choice2 == 30){
			JPYtoKWD();
		}
		else if(choice1 == 6 && choice2 == 31){
			JPYtoMYR();
		}
		else if(choice1 == 6 && choice2 == 32){
			JPYtoMXN();
		}
		else if(choice1 == 6 && choice2 == 33){
			JPYtoMAD();
		}
		else if(choice1 == 6 && choice2 == 34){
			JPYtoMMK();
		}
		else if(choice1 == 6 && choice2 == 35){
			JPYtoTWD();
		}
		else if(choice1 == 6 && choice2 == 36){
			JPYtoNZD();
		}
		else if(choice1 == 6 && choice2 == 37){
			JPYtoNOK();
		}
		else if(choice1 == 6 && choice2 == 38){
			JPYtoPHP();
		}
		else if(choice1 == 6 && choice2 == 39){
			JPYtoQAR();
		}
		else if(choice1 == 6 && choice2 == 40){
			JPYtoRON();
		}
		else if(choice1 == 6 && choice2 == 41){
			JPYtoRUB();
		}
		else if(choice1 == 6 && choice2 == 42){
			JPYtoSAR();
		}
		else if(choice1 == 6 && choice2 == 43){
			JPYtoRSD();
		}
		else if(choice1 == 6 && choice2 == 44){
			JPYtoSGD();
		}
		else if(choice1 == 6 && choice2 == 45){
			JPYtoZAR();
		}
		else if(choice1 == 6 && choice2 == 46){
			JPYtoKRW();
		}
		else if(choice1 == 6 && choice2 == 47){
			JPYtoLKR();
		}
		else if(choice1 == 6 && choice2 == 48){
			JPYtoSEK();
		}
		else if(choice1 == 6 && choice2 == 49){
			JPYtoCHF();
		}
		else if(choice1 == 6 && choice2 == 50){
			JPYtoSYP();
		}
		else if(choice1 == 6 && choice2 == 51){
			JPYtoTZS();
		}
		else if(choice1 == 6 && choice2 == 52){
			JPYtoTHB();
		}
		else if(choice1 == 6 && choice2 == 53){
			JPYtoTRY();
		}
		else if(choice1 == 6 && choice2 == 54){
			JPYtoUGX();
		}
		else if(choice1 == 6 && choice2 == 55){
			JPYtoUAH();
		}
		else if(choice1 == 6 && choice2 == 56){
			JPYtoAED();
		}
		else if(choice1 == 6 && choice2 == 57){
			JPYtoVND();
		}
		else if(choice1 == 6 && choice2 == 58){
			JPYtoZMW();
		}
		//------------CNY Conversion Choices----------//
		if(choice1 == 7 && choice2 == 1){
			CNYtoUSD();
		}
		else if(choice1 == 7 && choice2 == 2){
			CNYtoEUR();
		}
		else if(choice1 == 7 && choice2 == 3){
			CNYtoHKD();
		}
		else if(choice1 == 7 && choice2 == 4){
			CNYtoBitcoin();
		}
		else if(choice1 == 7 && choice2 == 5){
			CNYtoBitcoinCash();
		}
		else if(choice1 == 7 && choice2 == 6){
			CNYtoJPY();
		}
		else if(choice1 == 7 && choice2 == 7){
			CNYtoCNY();
		}
		else if(choice1 == 7 && choice2 == 8){
			CNYtoINR();
		}
		else if(choice1 == 7 && choice2 == 9){
			CNYtoDZD();
		}
		else if(choice1 == 7 && choice2 == 10){
			CNYtoARS();
		}
		else if(choice1 == 7 && choice2 == 11){
			CNYtoAUD();
		}
		else if(choice1 == 7 && choice2 == 12){
			CNYtoBRL();
		}
		else if(choice1 == 7 && choice2 == 13){
			CNYtoGBP();
		}
		else if(choice1 == 7 && choice2 == 14){
			CNYtoBGN();
		}
		else if(choice1 == 7 && choice2 == 15){
			CNYtoKHR();
		}
		else if(choice1 == 7 && choice2 == 16){
			CNYtoCAD();
		}
		else if(choice1 == 7 && choice2 == 17){
			CNYtoCLP();
		}
		else if(choice1 == 7 && choice2 == 18){
			CNYtoCOP();
		}
		else if(choice1 == 7 && choice2 == 19){
			CNYtoCRC();
		}
		else if(choice1 == 7 && choice2 == 20){
			CNYtoHRK();
		}
		else if(choice1 == 7 && choice2 == 21){
			CNYtoCZK();
		}
		else if(choice1 == 7 && choice2 == 22){
			CNYtoDKK();
		}
		else if(choice1 == 7 && choice2 == 23){
			CNYtoEGP();
		}
		else if(choice1 == 7 && choice2 == 24){
			CNYtoISK();
		}
		else if(choice1 == 7 && choice2 == 25){
			CNYtoIDR();
		}
		else if(choice1 == 7 && choice2 == 26){
			CNYtoIQD();
		}
		else if(choice1 == 7 && choice2 == 27){
			CNYtoILS();
		}
		else if(choice1 == 7 && choice2 == 28){
			CNYtoJOD();
		}
		else if(choice1 == 7 && choice2 == 29){
			CNYtoKES();
		}
		else if(choice1 == 7 && choice2 == 30){
			CNYtoKWD();
		}
		else if(choice1 == 7 && choice2 == 31){
			CNYtoMYR();
		}
		else if(choice1 == 7 && choice2 == 32){
			CNYtoMXN();
		}
		else if(choice1 == 7 && choice2 == 33){
			CNYtoMAD();
		}
		else if(choice1 == 7 && choice2 == 34){
			CNYtoMMK();
		}
		else if(choice1 == 7 && choice2 == 35){
			CNYtoTWD();
		}
		else if(choice1 == 7 && choice2 == 36){
			CNYtoNZD();
		}
		else if(choice1 == 7 && choice2 == 37){
			CNYtoNOK();
		}
		else if(choice1 == 7 && choice2 == 38){
			CNYtoPHP();
		}
		else if(choice1 == 7 && choice2 == 39){
			CNYtoQAR();
		}
		else if(choice1 == 7 && choice2 == 40){
			CNYtoRON();
		}
		else if(choice1 == 7 && choice2 == 41){
			CNYtoRUB();
		}
		else if(choice1 == 7 && choice2 == 42){
			CNYtoSAR();
		}
		else if(choice1 == 7 && choice2 == 43){
			CNYtoRSD();
		}
		else if(choice1 == 7 && choice2 == 44){
			CNYtoSGD();
		}
		else if(choice1 == 7 && choice2 == 45){
			CNYtoZAR();
		}
		else if(choice1 == 7 && choice2 == 46){
			CNYtoKRW();
		}
		else if(choice1 == 7 && choice2 == 47){
			CNYtoLKR();
		}
		else if(choice1 == 7 && choice2 == 48){
			CNYtoSEK();
		}
		else if(choice1 == 7 && choice2 == 49){
			CNYtoCHF();
		}
		else if(choice1 == 7 && choice2 == 50){
			CNYtoSYP();
		}
		else if(choice1 == 7 && choice2 == 51){
			CNYtoTZS();
		}
		else if(choice1 == 7 && choice2 == 52){
			CNYtoTHB();
		}
		else if(choice1 == 7 && choice2 == 53){
			CNYtoTRY();
		}
		else if(choice1 == 7 && choice2 == 54){
			CNYtoUGX();
		}
		else if(choice1 == 7 && choice2 == 55){
			CNYtoUAH();
		}
		else if(choice1 == 7 && choice2 == 56){
			CNYtoAED();
		}
		else if(choice1 == 7 && choice2 == 57){
			CNYtoVND();
		}
		else if(choice1 == 7 && choice2 == 58){
			CNYtoZMW();
		}
		//------------INR Conversion Choices----------//
		if(choice1 == 8 && choice2 == 1){
			INRtoUSD();
		}
		else if(choice1 == 8 && choice2 == 2){
			INRtoEUR();
		}
		else if(choice1 == 8 && choice2 == 3){
			INRtoHKD();
		}
		else if(choice1 == 8 && choice2 == 4){
			INRtoBitcoin();
		}
		else if(choice1 == 8 && choice2 == 5){
			INRtoBitcoinCash();
		}
		else if(choice1 == 8 && choice2 == 6){
			INRtoJPY();
		}
		else if(choice1 == 8 && choice2 == 7){
			INRtoCNY();
		}
		else if(choice1 == 8 && choice2 == 8){
			INRtoINR();
		}
		else if(choice1 == 8 && choice2 == 9){
			INRtoDZD();
		}
		else if(choice1 == 8 && choice2 == 10){
			INRtoARS();
		}
		else if(choice1 == 8 && choice2 == 11){
			INRtoAUD();
		}
		else if(choice1 == 8 && choice2 == 12){
			INRtoBRL();
		}
		else if(choice1 == 8 && choice2 == 13){
			INRtoGBP();
		}
		else if(choice1 == 8 && choice2 == 14){
			INRtoBGN();
		}
		else if(choice1 == 8 && choice2 == 15){
			INRtoKHR();
		}
		else if(choice1 == 8 && choice2 == 16){
			INRtoCAD();
		}
		else if(choice1 == 8 && choice2 == 17){
			INRtoCLP();
		}
		else if(choice1 == 8 && choice2 == 18){
			INRtoCOP();
		}
		else if(choice1 == 8 && choice2 == 19){
			INRtoCRC();
		}
		else if(choice1 == 8 && choice2 == 20){
			INRtoHRK();
		}
		else if(choice1 == 8 && choice2 == 21){
			INRtoCZK();
		}
		else if(choice1 == 8 && choice2 == 22){
			INRtoDKK();
		}
		else if(choice1 == 8 && choice2 == 23){
			INRtoEGP();
		}
		else if(choice1 == 8 && choice2 == 24){
			INRtoISK();
		}
		else if(choice1 == 8 && choice2 == 25){
			INRtoIDR();
		}
		else if(choice1 == 8 && choice2 == 26){
			INRtoIQD();
		}
		else if(choice1 == 8 && choice2 == 27){
			INRtoILS();
		}
		else if(choice1 == 8 && choice2 == 28){
			INRtoJOD();
		}
		else if(choice1 == 8 && choice2 == 29){
			INRtoKES();
		}
		else if(choice1 == 8 && choice2 == 30){
			INRtoKWD();
		}
		else if(choice1 == 8 && choice2 == 31){
			INRtoMYR();
		}
		else if(choice1 == 8 && choice2 == 32){
			INRtoMXN();
		}
		else if(choice1 == 8 && choice2 == 33){
			INRtoMAD();
		}
		else if(choice1 == 8 && choice2 == 34){
			INRtoMMK();
		}
		else if(choice1 == 8 && choice2 == 35){
			INRtoTWD();
		}
		else if(choice1 == 8 && choice2 == 36){
			INRtoNZD();
		}
		else if(choice1 == 8 && choice2 == 37){
			INRtoNOK();
		}
		else if(choice1 == 8 && choice2 == 38){
			INRtoPHP();
		}
		else if(choice1 == 8 && choice2 == 39){
			INRtoQAR();
		}
		else if(choice1 == 8 && choice2 == 40){
			INRtoRON();
		}
		else if(choice1 == 8 && choice2 == 41){
			INRtoRUB();
		}
		else if(choice1 == 8 && choice2 == 42){
			INRtoSAR();
		}
		else if(choice1 == 8 && choice2 == 43){
			INRtoRSD();
		}
		else if(choice1 == 8 && choice2 == 44){
			INRtoSGD();
		}
		else if(choice1 == 8 && choice2 == 45){
			INRtoZAR();
		}
		else if(choice1 == 8 && choice2 == 46){
			INRtoKRW();
		}
		else if(choice1 == 8 && choice2 == 47){
			INRtoLKR();
		}
		else if(choice1 == 8 && choice2 == 48){
			INRtoSEK();
		}
		else if(choice1 == 8 && choice2 == 49){
			INRtoCHF();
		}
		else if(choice1 == 8 && choice2 == 50){
			INRtoSYP();
		}
		else if(choice1 == 8 && choice2 == 51){
			INRtoTZS();
		}
		else if(choice1 == 8 && choice2 == 52){
			INRtoTHB();
		}
		else if(choice1 == 8 && choice2 == 53){
			INRtoTRY();
		}
		else if(choice1 == 8 && choice2 == 54){
			INRtoUGX();
		}
		else if(choice1 == 8 && choice2 == 55){
			INRtoUAH();
		}
		else if(choice1 == 8 && choice2 == 56){
			INRtoAED();
		}
		else if(choice1 == 8 && choice2 == 57){
			INRtoVND();
		}
		else if(choice1 == 8 && choice2 == 58){
			INRtoZMW();
		}
		//------------Algerian Dinar Conversion Choices----------//
		if(choice1 == 9 && choice2 == 1){
			DZDtoUSD();
		}
		else if(choice1 == 9 && choice2 == 2){
			DZDtoEUR();
		}
		else if(choice1 == 9 && choice2 == 3){
			DZDtoHKD();
		}
		else if(choice1 == 9 && choice2 == 4){
			DZDtoBitcoin();
		}
		else if(choice1 == 9 && choice2 == 5){
			DZDtoBitcoinCash();
		}
		else if(choice1 == 9 && choice2 == 6){
			DZDtoJPY();
		}
		else if(choice1 == 9 && choice2 == 7){
			DZDtoCNY();
		}
		else if(choice1 == 9 && choice2 == 8){
			DZDtoINR();
		}
		else if(choice1 == 9 && choice2 == 9){
			DZDtoDZD();
		}
		else if(choice1 == 9 && choice2 == 10){
			DZDtoARS();
		}
		else if(choice1 == 9 && choice2 == 11){
			DZDtoAUD();
		}
		else if(choice1 == 9 && choice2 == 12){
			DZDtoBRL();
		}
		else if(choice1 == 9 && choice2 == 13){
			DZDtoGBP();
		}
		else if(choice1 == 9 && choice2 == 14){
			DZDtoBGN();
		}
		else if(choice1 == 9 && choice2 == 15){
			DZDtoKHR();
		}
		else if(choice1 == 9 && choice2 == 16){
			DZDtoCAD();
		}
		else if(choice1 == 9 && choice2 == 17){
			DZDtoCLP();
		}
		else if(choice1 == 9 && choice2 == 18){
			DZDtoCOP();
		}
		else if(choice1 == 9 && choice2 == 19){
			DZDtoCRC();
		}
		else if(choice1 == 9 && choice2 == 20){
			DZDtoHRK();
		}
		else if(choice1 == 9 && choice2 == 21){
			DZDtoCZK();
		}
		else if(choice1 == 9 && choice2 == 22){
			DZDtoDKK();
		}
		else if(choice1 == 9 && choice2 == 23){
			DZDtoEGP();
		}
		else if(choice1 == 9 && choice2 == 24){
			DZDtoISK();
		}
		else if(choice1 == 9 && choice2 == 25){
			DZDtoIDR();
		}
		else if(choice1 == 9 && choice2 == 26){
			DZDtoIQD();
		}
		else if(choice1 == 9 && choice2 == 27){
			DZDtoILS();
		}
		else if(choice1 == 9 && choice2 == 28){
			DZDtoJOD();
		}
		else if(choice1 == 9 && choice2 == 29){
			DZDtoKES();
		}
		else if(choice1 == 9 && choice2 == 30){
			DZDtoKWD();
		}
		else if(choice1 == 9 && choice2 == 31){
			DZDtoMYR();
		}
		else if(choice1 == 9 && choice2 == 32){
			DZDtoMXN();
		}
		else if(choice1 == 9 && choice2 == 33){
			DZDtoMAD();
		}
		else if(choice1 == 9 && choice2 == 34){
			DZDtoMMK();
		}
		else if(choice1 == 9 && choice2 == 35){
			DZDtoTWD();
		}
		else if(choice1 == 9 && choice2 == 36){
			DZDtoNZD();
		}
		else if(choice1 == 9 && choice2 == 37){
			DZDtoNOK();
		}
		else if(choice1 == 9 && choice2 == 38){
			DZDtoPHP();
		}
		else if(choice1 == 9 && choice2 == 39){
			DZDtoQAR();
		}
		else if(choice1 == 9 && choice2 == 40){
			DZDtoRON();
		}
		else if(choice1 == 9 && choice2 == 41){
			DZDtoRUB();
		}
		else if(choice1 == 9 && choice2 == 42){
			DZDtoSAR();
		}
		else if(choice1 == 9 && choice2 == 43){
			DZDtoRSD();
		}
		else if(choice1 == 9 && choice2 == 44){
			DZDtoSGD();
		}
		else if(choice1 == 9 && choice2 == 45){
			DZDtoZAR();
		}
		else if(choice1 == 9 && choice2 == 46){
			DZDtoKRW();
		}
		else if(choice1 == 9 && choice2 == 47){
			DZDtoLKR();
		}
		else if(choice1 == 9 && choice2 == 48){
			DZDtoSEK();
		}
		else if(choice1 == 9 && choice2 == 49){
			DZDtoCHF();
		}
		else if(choice1 == 9 && choice2 == 50){
			DZDtoSYP();
		}
		else if(choice1 == 9 && choice2 == 51){
			DZDtoTZS();
		}
		else if(choice1 == 9 && choice2 == 52){
			DZDtoTHB();
		}
		else if(choice1 == 9 && choice2 == 53){
			DZDtoTRY();
		}
		else if(choice1 == 9 && choice2 == 54){
			DZDtoUGX();
		}
		else if(choice1 == 9 && choice2 == 55){
			DZDtoUAH();
		}
		else if(choice1 == 9 && choice2 == 56){
			DZDtoAED();
		}
		else if(choice1 == 9 && choice2 == 57){
			DZDtoVND();
		}
		else if(choice1 == 9 && choice2 == 58){
			DZDtoZMW();
		}
		//------------Argentine Peso Conversion Choices----------//
		if(choice1 == 10 && choice2 == 1){
			ARStoUSD();
		}
		else if(choice1 == 10 && choice2 == 2){
			ARStoEUR();
		}
		else if(choice1 == 10 && choice2 == 3){
			ARStoHKD();
		}
		else if(choice1 == 10 && choice2 == 4){
			ARStoBitcoin();
		}
		else if(choice1 == 10 && choice2 == 5){
			ARStoBitcoinCash();
		}
		else if(choice1 == 10 && choice2 == 6){
			ARStoJPY();
		}
		else if(choice1 == 10 && choice2 == 7){
			ARStoCNY();
		}
		else if(choice1 == 10 && choice2 == 8){
			ARStoINR();
		}
		else if(choice1 == 10 && choice2 == 9){
			ARStoDZD();
		}
		else if(choice1 == 10 && choice2 == 10){
			ARStoARS();
		}
		else if(choice1 == 10 && choice2 == 11){
			ARStoAUD();
		}
		else if(choice1 == 10 && choice2 == 12){
			ARStoBRL();
		}
		else if(choice1 == 10 && choice2 == 13){
			ARStoGBP();
		}
		else if(choice1 == 10 && choice2 == 14){
			ARStoBGN();
		}
		else if(choice1 == 10 && choice2 == 15){
			ARStoKHR();
		}
		else if(choice1 == 10 && choice2 == 16){
			ARStoCAD();
		}
		else if(choice1 == 10 && choice2 == 17){
			ARStoCLP();
		}
		else if(choice1 == 10 && choice2 == 18){
			ARStoCOP();
		}
		else if(choice1 == 10 && choice2 == 19){
			ARStoCRC();
		}
		else if(choice1 == 10 && choice2 == 20){
			ARStoHRK();
		}
		else if(choice1 == 10 && choice2 == 21){
			ARStoCZK();
		}
		else if(choice1 == 10 && choice2 == 22){
			ARStoDKK();
		}
		else if(choice1 == 10 && choice2 == 23){
			ARStoEGP();
		}
		else if(choice1 == 10 && choice2 == 24){
			ARStoISK();
		}
		else if(choice1 == 10 && choice2 == 25){
			ARStoIDR();
		}
		else if(choice1 == 10 && choice2 == 26){
			ARStoIQD();
		}
		else if(choice1 == 10 && choice2 == 27){
			ARStoILS();
		}
		else if(choice1 == 10 && choice2 == 28){
			ARStoJOD();
		}
		else if(choice1 == 10 && choice2 == 29){
			ARStoKES();
		}
		else if(choice1 == 10 && choice2 == 30){
			ARStoKWD();
		}
		else if(choice1 == 10 && choice2 == 31){
			ARStoMYR();
		}
		else if(choice1 == 10 && choice2 == 32){
			ARStoMXN();
		}
		else if(choice1 == 10 && choice2 == 33){
			ARStoMAD();
		}
		else if(choice1 == 10 && choice2 == 34){
			ARStoMMK();
		}
		else if(choice1 == 10 && choice2 == 35){
			ARStoTWD();
		}
		else if(choice1 == 10 && choice2 == 36){
			ARStoNZD();
		}
		else if(choice1 == 10 && choice2 == 37){
			ARStoNOK();
		}
		else if(choice1 == 10 && choice2 == 38){
			ARStoPHP();
		}
		else if(choice1 == 10 && choice2 == 39){
			ARStoQAR();
		}
		else if(choice1 == 10 && choice2 == 40){
			ARStoRON();
		}
		else if(choice1 == 10 && choice2 == 41){
			ARStoRUB();
		}
		else if(choice1 == 10 && choice2 == 42){
			ARStoSAR();
		}
		else if(choice1 == 10 && choice2 == 43){
			ARStoRSD();
		}
		else if(choice1 == 10 && choice2 == 44){
			ARStoSGD();
		}
		else if(choice1 == 10 && choice2 == 45){
			ARStoZAR();
		}
		else if(choice1 == 10 && choice2 == 46){
			ARStoKRW();
		}
		else if(choice1 == 10 && choice2 == 47){
			ARStoLKR();
		}
		else if(choice1 == 10 && choice2 == 48){
			ARStoSEK();
		}
		else if(choice1 == 10 && choice2 == 49){
			ARStoCHF();
		}
		else if(choice1 == 10 && choice2 == 50){
			ARStoSYP();
		}
		else if(choice1 == 10 && choice2 == 51){
			ARStoTZS();
		}
		else if(choice1 == 10 && choice2 == 52){
			ARStoTHB();
		}
		else if(choice1 == 10 && choice2 == 53){
			ARStoTRY();
		}
		else if(choice1 == 10 && choice2 == 54){
			ARStoUGX();
		}
		else if(choice1 == 10 && choice2 == 55){
			ARStoUAH();
		}
		else if(choice1 == 10 && choice2 == 56){
			ARStoAED();
		}
		else if(choice1 == 10 && choice2 == 57){
			ARStoVND();
		}
		else if(choice1 == 10 && choice2 == 58){
			ARStoZMW();
		}
		//------------Australian Conversion Choices----------//
		if(choice1 == 11 && choice2 == 1){
			AUDtoUSD();
		}
		else if(choice1 == 11 && choice2 == 2){
			AUDtoEUR();
		}
		else if(choice1 == 11 && choice2 == 3){
			AUDtoHKD();
		}
		else if(choice1 == 11 && choice2 == 4){
			AUDtoBitcoin();
		}
		else if(choice1 == 11 && choice2 == 5){
			AUDtoBitcoinCash();
		}
		else if(choice1 == 11 && choice2 == 6){
			AUDtoJPY();
		}
		else if(choice1 == 11 && choice2 == 7){
			AUDtoCNY();
		}
		else if(choice1 == 11 && choice2 == 8){
			AUDtoINR();
		}
		else if(choice1 == 11 && choice2 == 9){
			AUDtoDZD();
		}
		else if(choice1 == 11 && choice2 == 10){
			AUDtoARS();
		}
		else if(choice1 == 11 && choice2 == 11){
			AUDtoAUD();
		}
		else if(choice1 == 11 && choice2 == 12){
			AUDtoBRL();
		}
		else if(choice1 == 11 && choice2 == 13){
			AUDtoGBP();
		}
		else if(choice1 == 11 && choice2 == 14){
			AUDtoBGN();
		}
		else if(choice1 == 11 && choice2 == 15){
			AUDtoKHR();
		}
		else if(choice1 == 11 && choice2 == 16){
			AUDtoCAD();
		}
		else if(choice1 == 11 && choice2 == 17){
			AUDtoCLP();
		}
		else if(choice1 == 11 && choice2 == 18){
			AUDtoCOP();
		}
		else if(choice1 == 11 && choice2 == 19){
			AUDtoCRC();
		}
		else if(choice1 == 11 && choice2 == 20){
			AUDtoHRK();
		}
		else if(choice1 == 11 && choice2 == 21){
			AUDtoCZK();
		}
		else if(choice1 == 11 && choice2 == 22){
			AUDtoDKK();
		}
		else if(choice1 == 11 && choice2 == 23){
			AUDtoEGP();
		}
		else if(choice1 == 11 && choice2 == 24){
			AUDtoISK();
		}
		else if(choice1 == 11 && choice2 == 25){
			AUDtoIDR();
		}
		else if(choice1 == 11 && choice2 == 26){
			AUDtoIQD();
		}
		else if(choice1 == 11 && choice2 == 27){
			AUDtoILS();
		}
		else if(choice1 == 11 && choice2 == 28){
			AUDtoJOD();
		}
		else if(choice1 == 11 && choice2 == 29){
			AUDtoKES();
		}
		else if(choice1 == 11 && choice2 == 30){
			AUDtoKWD();
		}
		else if(choice1 == 11 && choice2 == 31){
			AUDtoMYR();
		}
		else if(choice1 == 11 && choice2 == 32){
			AUDtoMXN();
		}
		else if(choice1 == 11 && choice2 == 33){
			AUDtoMAD();
		}
		else if(choice1 == 11 && choice2 == 34){
			AUDtoMMK();
		}
		else if(choice1 == 11 && choice2 == 35){
			AUDtoTWD();
		}
		else if(choice1 == 11 && choice2 == 36){
			AUDtoNZD();
		}
		else if(choice1 == 11 && choice2 == 37){
			AUDtoNOK();
		}
		else if(choice1 == 11 && choice2 == 38){
			AUDtoPHP();
		}
		else if(choice1 == 11 && choice2 == 39){
			AUDtoQAR();
		}
		else if(choice1 == 11 && choice2 == 40){
			AUDtoRON();
		}
		else if(choice1 == 11 && choice2 == 41){
			AUDtoRUB();
		}
		else if(choice1 == 11 && choice2 == 42){
			AUDtoSAR();
		}
		else if(choice1 == 11 && choice2 == 43){
			AUDtoRSD();
		}
		else if(choice1 == 11 && choice2 == 44){
			AUDtoSGD();
		}
		else if(choice1 == 11 && choice2 == 45){
			AUDtoZAR();
		}
		else if(choice1 == 11 && choice2 == 46){
			AUDtoKRW();
		}
		else if(choice1 == 11 && choice2 == 47){
			AUDtoLKR();
		}
		else if(choice1 == 11 && choice2 == 48){
			AUDtoSEK();
		}
		else if(choice1 == 11 && choice2 == 49){
			AUDtoCHF();
		}
		else if(choice1 == 11 && choice2 == 50){
			AUDtoSYP();
		}
		else if(choice1 == 11 && choice2 == 51){
			AUDtoTZS();
		}
		else if(choice1 == 11 && choice2 == 52){
			AUDtoTHB();
		}
		else if(choice1 == 11 && choice2 == 53){
			AUDtoTRY();
		}
		else if(choice1 == 11 && choice2 == 54){
			AUDtoUGX();
		}
		else if(choice1 == 11 && choice2 == 55){
			AUDtoUAH();
		}
		else if(choice1 == 11 && choice2 == 56){
			AUDtoAED();
		}
		else if(choice1 == 11 && choice2 == 57){
			AUDtoVND();
		}
		else if(choice1 == 11 && choice2 == 58){
			AUDtoZMW();
		}
		//------------Brazilian Conversion Choices----------//
		if(choice1 == 12 && choice2 == 1){
			BRLtoUSD();
		}
		else if(choice1 == 12 && choice2 == 2){
			BRLtoEUR();
		}
		else if(choice1 == 12 && choice2 == 3){
			BRLtoHKD();
		}
		else if(choice1 == 12 && choice2 == 4){
			BRLtoBitcoin();
		}
		else if(choice1 == 12 && choice2 == 5){
			BRLtoBitcoinCash();
		}
		else if(choice1 == 12 && choice2 == 6){
			BRLtoJPY();
		}
		else if(choice1 == 12 && choice2 == 7){
			BRLtoCNY();
		}
		else if(choice1 == 12 && choice2 == 8){
			BRLtoINR();
		}
		else if(choice1 == 12 && choice2 == 9){
			BRLtoDZD();
		}
		else if(choice1 == 12 && choice2 == 10){
			BRLtoARS();
		}
		else if(choice1 == 12 && choice2 == 11){
			BRLtoAUD();
		}
		else if(choice1 == 12 && choice2 == 12){
			BRLtoBRL();
		}
		else if(choice1 == 12 && choice2 == 13){
			BRLtoGBP();
		}
		else if(choice1 == 12 && choice2 == 14){
			BRLtoBGN();
		}
		else if(choice1 == 12 && choice2 == 15){
			BRLtoKHR();
		}
		else if(choice1 == 12 && choice2 == 16){
			BRLtoCAD();
		}
		else if(choice1 == 12 && choice2 == 17){
			BRLtoCLP();
		}
		else if(choice1 == 12 && choice2 == 18){
			BRLtoCOP();
		}
		else if(choice1 == 12 && choice2 == 19){
			BRLtoCRC();
		}
		else if(choice1 == 12 && choice2 == 20){
			BRLtoHRK();
		}
		else if(choice1 == 12 && choice2 == 21){
			BRLtoCZK();
		}
		else if(choice1 == 12 && choice2 == 22){
			BRLtoDKK();
		}
		else if(choice1 == 12 && choice2 == 23){
			BRLtoEGP();
		}
		else if(choice1 == 12 && choice2 == 24){
			BRLtoISK();
		}
		else if(choice1 == 12 && choice2 == 25){
			BRLtoIDR();
		}
		else if(choice1 == 12 && choice2 == 26){
			BRLtoIQD();
		}
		else if(choice1 == 12 && choice2 == 27){
			BRLtoILS();
		}
		else if(choice1 == 12 && choice2 == 28){
			BRLtoJOD();
		}
		else if(choice1 == 12 && choice2 == 29){
			BRLtoKES();
		}
		else if(choice1 == 12 && choice2 == 30){
			BRLtoKWD();
		}
		else if(choice1 == 12 && choice2 == 31){
			BRLtoMYR();
		}
		else if(choice1 == 12 && choice2 == 32){
			BRLtoMXN();
		}
		else if(choice1 == 12 && choice2 == 33){
			BRLtoMAD();
		}
		else if(choice1 == 12 && choice2 == 34){
			BRLtoMMK();
		}
		else if(choice1 == 12 && choice2 == 35){
			BRLtoTWD();
		}
		else if(choice1 == 12 && choice2 == 36){
			BRLtoNZD();
		}
		else if(choice1 == 12 && choice2 == 37){
			BRLtoNOK();
		}
		else if(choice1 == 12 && choice2 == 38){
			BRLtoPHP();
		}
		else if(choice1 == 12 && choice2 == 39){
			BRLtoQAR();
		}
		else if(choice1 == 12 && choice2 == 40){
			BRLtoRON();
		}
		else if(choice1 == 12 && choice2 == 41){
			BRLtoRUB();
		}
		else if(choice1 == 12 && choice2 == 42){
			BRLtoSAR();
		}
		else if(choice1 == 12 && choice2 == 43){
			BRLtoRSD();
		}
		else if(choice1 == 12 && choice2 == 44){
			BRLtoSGD();
		}
		else if(choice1 == 12 && choice2 == 45){
			BRLtoZAR();
		}
		else if(choice1 == 12 && choice2 == 46){
			BRLtoKRW();
		}
		else if(choice1 == 12 && choice2 == 47){
			BRLtoLKR();
		}
		else if(choice1 == 12 && choice2 == 48){
			BRLtoSEK();
		}
		else if(choice1 == 12 && choice2 == 49){
			BRLtoCHF();
		}
		else if(choice1 == 12 && choice2 == 50){
			BRLtoSYP();
		}
		else if(choice1 == 12 && choice2 == 51){
			BRLtoTZS();
		}
		else if(choice1 == 12 && choice2 == 52){
			BRLtoTHB();
		}
		else if(choice1 == 12 && choice2 == 53){
			BRLtoTRY();
		}
		else if(choice1 == 12 && choice2 == 54){
			BRLtoUGX();
		}
		else if(choice1 == 12 && choice2 == 55){
			BRLtoUAH();
		}
		else if(choice1 == 12 && choice2 == 56){
			BRLtoAED();
		}
		else if(choice1 == 12 && choice2 == 57){
			BRLtoVND();
		}
		else if(choice1 == 12 && choice2 == 58){
			BRLtoZMW();
		}
		//------------British Pound Conversion Choices----------//
		if(choice1 == 13 && choice2 == 1){
			GBPtoUSD();
		}
		else if(choice1 == 13 && choice2 == 2){
			GBPtoEUR();
		}
		else if(choice1 == 13 && choice2 == 3){
			GBPtoHKD();
		}
		else if(choice1 == 13 && choice2 == 4){
			GBPtoBitcoin();
		}
		else if(choice1 == 13 && choice2 == 5){
			GBPtoBitcoinCash();
		}
		else if(choice1 == 13 && choice2 == 6){
			GBPtoJPY();
		}
		else if(choice1 == 13 && choice2 == 7){
			GBPtoCNY();
		}
		else if(choice1 == 13 && choice2 == 8){
			GBPtoINR();
		}
		else if(choice1 == 13 && choice2 == 9){
			GBPtoDZD();
		}
		else if(choice1 == 13 && choice2 == 10){
			GBPtoARS();
		}
		else if(choice1 == 13 && choice2 == 11){
			GBPtoAUD();
		}
		else if(choice1 == 13 && choice2 == 12){
			GBPtoBRL();
		}
		else if(choice1 == 13 && choice2 == 13){
			GBPtoGBP();
		}
		else if(choice1 == 13 && choice2 == 14){
			GBPtoBGN();
		}
		else if(choice1 == 13 && choice2 == 15){
			GBPtoKHR();
		}
		else if(choice1 == 13 && choice2 == 16){
			GBPtoCAD();
		}
		else if(choice1 == 13 && choice2 == 17){
			GBPtoCLP();
		}
		else if(choice1 == 13 && choice2 == 18){
			GBPtoCOP();
		}
		else if(choice1 == 13 && choice2 == 19){
			GBPtoCRC();
		}
		else if(choice1 == 13 && choice2 == 20){
			GBPtoHRK();
		}
		else if(choice1 == 13 && choice2 == 21){
			GBPtoCZK();
		}
		else if(choice1 == 13 && choice2 == 22){
			GBPtoDKK();
		}
		else if(choice1 == 13 && choice2 == 23){
			GBPtoEGP();
		}
		else if(choice1 == 13 && choice2 == 24){
			GBPtoISK();
		}
		else if(choice1 == 13 && choice2 == 25){
			GBPtoIDR();
		}
		else if(choice1 == 13 && choice2 == 26){
			GBPtoIQD();
		}
		else if(choice1 == 13 && choice2 == 27){
			GBPtoILS();
		}
		else if(choice1 == 13 && choice2 == 28){
			GBPtoJOD();
		}
		else if(choice1 == 13 && choice2 == 29){
			GBPtoKES();
		}
		else if(choice1 == 13 && choice2 == 30){
			GBPtoKWD();
		}
		else if(choice1 == 13 && choice2 == 31){
			GBPtoMYR();
		}
		else if(choice1 == 13 && choice2 == 32){
			GBPtoMXN();
		}
		else if(choice1 == 13 && choice2 == 33){
			GBPtoMAD();
		}
		else if(choice1 == 13 && choice2 == 34){
			GBPtoMMK();
		}
		else if(choice1 == 13 && choice2 == 35){
			GBPtoTWD();
		}
		else if(choice1 == 13 && choice2 == 36){
			GBPtoNZD();
		}
		else if(choice1 == 13 && choice2 == 37){
			GBPtoNOK();
		}
		else if(choice1 == 13 && choice2 == 38){
			GBPtoPHP();
		}
		else if(choice1 == 13 && choice2 == 39){
			GBPtoQAR();
		}
		else if(choice1 == 13 && choice2 == 40){
			GBPtoRON();
		}
		else if(choice1 == 13 && choice2 == 41){
			GBPtoRUB();
		}
		else if(choice1 == 13 && choice2 == 42){
			GBPtoSAR();
		}
		else if(choice1 == 13 && choice2 == 43){
			GBPtoRSD();
		}
		else if(choice1 == 13 && choice2 == 44){
			GBPtoSGD();
		}
		else if(choice1 == 13 && choice2 == 45){
			GBPtoZAR();
		}
		else if(choice1 == 13 && choice2 == 46){
			GBPtoKRW();
		}
		else if(choice1 == 13 && choice2 == 47){
			GBPtoLKR();
		}
		else if(choice1 == 13 && choice2 == 48){
			GBPtoSEK();
		}
		else if(choice1 == 13 && choice2 == 49){
			GBPtoCHF();
		}
		else if(choice1 == 13 && choice2 == 50){
			GBPtoSYP();
		}
		else if(choice1 == 13 && choice2 == 51){
			GBPtoTZS();
		}
		else if(choice1 == 13 && choice2 == 52){
			GBPtoTHB();
		}
		else if(choice1 == 13 && choice2 == 53){
			GBPtoTRY();
		}
		else if(choice1 == 13 && choice2 == 54){
			GBPtoUGX();
		}
		else if(choice1 == 13 && choice2 == 55){
			GBPtoUAH();
		}
		else if(choice1 == 13 && choice2 == 56){
			GBPtoAED();
		}
		else if(choice1 == 13 && choice2 == 57){
			GBPtoVND();
		}
		else if(choice1 == 13 && choice2 == 58){
			GBPtoZMW();
		}
		//------------Bulgarian Lev Conversion Choices----------//
		if(choice1 == 14 && choice2 == 1){
			BGNtoUSD();
		}
		else if(choice1 == 14 && choice2 == 2){
			BGNtoEUR();
		}
		else if(choice1 == 14 && choice2 == 3){
			BGNtoHKD();
		}
		else if(choice1 == 14 && choice2 == 4){
			BGNtoBitcoin();
		}
		else if(choice1 == 14 && choice2 == 5){
			BGNtoBitcoinCash();
		}
		else if(choice1 == 14 && choice2 == 6){
			BGNtoJPY();
		}
		else if(choice1 == 14 && choice2 == 7){
			BGNtoCNY();
		}
		else if(choice1 == 14 && choice2 == 8){
			BGNtoINR();
		}
		else if(choice1 == 14 && choice2 == 9){
			BGNtoDZD();
		}
		else if(choice1 == 14 && choice2 == 10){
			BGNtoARS();
		}
		else if(choice1 == 14 && choice2 == 11){
			BGNtoAUD();
		}
		else if(choice1 == 14 && choice2 == 12){
			BGNtoBRL();
		}
		else if(choice1 == 14 && choice2 == 13){
			BGNtoGBP();
		}
		else if(choice1 == 14 && choice2 == 14){
			BGNtoBGN();
		}
		else if(choice1 == 14 && choice2 == 15){
			BGNtoKHR();
		}
		else if(choice1 == 14 && choice2 == 16){
			BGNtoCAD();
		}
		else if(choice1 == 14 && choice2 == 17){
			BGNtoCLP();
		}
		else if(choice1 == 14 && choice2 == 18){
			BGNtoCOP();
		}
		else if(choice1 == 14 && choice2 == 19){
			BGNtoCRC();
		}
		else if(choice1 == 14 && choice2 == 20){
			BGNtoHRK();
		}
		else if(choice1 == 14 && choice2 == 21){
			BGNtoCZK();
		}
		else if(choice1 == 14 && choice2 == 22){
			BGNtoDKK();
		}
		else if(choice1 == 14 && choice2 == 23){
			BGNtoEGP();
		}
		else if(choice1 == 14 && choice2 == 24){
			BGNtoISK();
		}
		else if(choice1 == 14 && choice2 == 25){
			BGNtoIDR();
		}
		else if(choice1 == 14 && choice2 == 26){
			BGNtoIQD();
		}
		else if(choice1 == 14 && choice2 == 27){
			BGNtoILS();
		}
		else if(choice1 == 14 && choice2 == 28){
			BGNtoJOD();
		}
		else if(choice1 == 14 && choice2 == 29){
			BGNtoKES();
		}
		else if(choice1 == 14 && choice2 == 30){
			BGNtoKWD();
		}
		else if(choice1 == 14 && choice2 == 31){
			BGNtoMYR();
		}
		else if(choice1 == 14 && choice2 == 32){
			BGNtoMXN();
		}
		else if(choice1 == 14 && choice2 == 33){
			BGNtoMAD();
		}
		else if(choice1 == 14 && choice2 == 34){
			BGNtoMMK();
		}
		else if(choice1 == 14 && choice2 == 35){
			BGNtoTWD();
		}
		else if(choice1 == 14 && choice2 == 36){
			BGNtoNZD();
		}
		else if(choice1 == 14 && choice2 == 37){
			BGNtoNOK();
		}
		else if(choice1 == 14 && choice2 == 38){
			BGNtoPHP();
		}
		else if(choice1 == 14 && choice2 == 39){
			BGNtoQAR();
		}
		else if(choice1 == 14 && choice2 == 40){
			BGNtoRON();
		}
		else if(choice1 == 14 && choice2 == 41){
			BGNtoRUB();
		}
		else if(choice1 == 14 && choice2 == 42){
			BGNtoSAR();
		}
		else if(choice1 == 14 && choice2 == 43){
			BGNtoRSD();
		}
		else if(choice1 == 14 && choice2 == 44){
			BGNtoSGD();
		}
		else if(choice1 == 14 && choice2 == 45){
			BGNtoZAR();
		}
		else if(choice1 == 14 && choice2 == 46){
			BGNtoKRW();
		}
		else if(choice1 == 14 && choice2 == 47){
			BGNtoLKR();
		}
		else if(choice1 == 14 && choice2 == 48){
			BGNtoSEK();
		}
		else if(choice1 == 14 && choice2 == 49){
			BGNtoCHF();
		}
		else if(choice1 == 14 && choice2 == 50){
			BGNtoSYP();
		}
		else if(choice1 == 14 && choice2 == 51){
			BGNtoTZS();
		}
		else if(choice1 == 14 && choice2 == 52){
			BGNtoTHB();
		}
		else if(choice1 == 14 && choice2 == 53){
			BGNtoTRY();
		}
		else if(choice1 == 14 && choice2 == 54){
			BGNtoUGX();
		}
		else if(choice1 == 14 && choice2 == 55){
			BGNtoUAH();
		}
		else if(choice1 == 14 && choice2 == 56){
			BGNtoAED();
		}
		else if(choice1 == 14 && choice2 == 57){
			BGNtoVND();
		}
		else if(choice1 == 14 && choice2 == 58){
			BGNtoZMW();
		}
		//------------Cambodian Reil Conversion Choices----------//
		if(choice1 == 15 && choice2 == 1){
			KHRtoUSD();
		}
		else if(choice1 == 15 && choice2 == 2){
			KHRtoEUR();
		}
		else if(choice1 == 15 && choice2 == 3){
			KHRtoHKD();
		}
		else if(choice1 == 15 && choice2 == 4){
			KHRtoBitcoin();
		}
		else if(choice1 == 15 && choice2 == 5){
			KHRtoBitcoinCash();
		}
		else if(choice1 == 15 && choice2 == 6){
			KHRtoJPY();
		}
		else if(choice1 == 15 && choice2 == 7){
			KHRtoCNY();
		}
		else if(choice1 == 15 && choice2 == 8){
			KHRtoINR();
		}
		else if(choice1 == 15 && choice2 == 9){
			KHRtoDZD();
		}
		else if(choice1 == 15 && choice2 == 10){
			KHRtoARS();
		}
		else if(choice1 == 15 && choice2 == 11){
			KHRtoAUD();
		}
		else if(choice1 == 15 && choice2 == 12){
			KHRtoBRL();
		}
		else if(choice1 == 15 && choice2 == 13){
			KHRtoGBP();
		}
		else if(choice1 == 15 && choice2 == 14){
			KHRtoBGN();
		}
		else if(choice1 == 15 && choice2 == 15){
			KHRtoKHR();
		}
		else if(choice1 == 15 && choice2 == 16){
			KHRtoCAD();
		}
		else if(choice1 == 15 && choice2 == 17){
			KHRtoCLP();
		}
		else if(choice1 == 15 && choice2 == 18){
			KHRtoCOP();
		}
		else if(choice1 == 15 && choice2 == 19){
			KHRtoCRC();
		}
		else if(choice1 == 15 && choice2 == 20){
			KHRtoHRK();
		}
		else if(choice1 == 15 && choice2 == 21){
			KHRtoCZK();
		}
		else if(choice1 == 15 && choice2 == 22){
			KHRtoDKK();
		}
		else if(choice1 == 15 && choice2 == 23){
			KHRtoEGP();
		}
		else if(choice1 == 15 && choice2 == 24){
			KHRtoISK();
		}
		else if(choice1 == 15 && choice2 == 25){
			KHRtoIDR();
		}
		else if(choice1 == 15 && choice2 == 26){
			KHRtoIQD();
		}
		else if(choice1 == 15 && choice2 == 27){
			KHRtoILS();
		}
		else if(choice1 == 15 && choice2 == 28){
			KHRtoJOD();
		}
		else if(choice1 == 15 && choice2 == 29){
			KHRtoKES();
		}
		else if(choice1 == 15 && choice2 == 30){
			KHRtoKWD();
		}
		else if(choice1 == 15 && choice2 == 31){
			KHRtoMYR();
		}
		else if(choice1 == 15 && choice2 == 32){
			KHRtoMXN();
		}
		else if(choice1 == 15 && choice2 == 33){
			KHRtoMAD();
		}
		else if(choice1 == 15 && choice2 == 34){
			KHRtoMMK();
		}
		else if(choice1 == 15 && choice2 == 35){
			KHRtoTWD();
		}
		else if(choice1 == 15 && choice2 == 36){
			KHRtoNZD();
		}
		else if(choice1 == 15 && choice2 == 37){
			KHRtoNOK();
		}
		else if(choice1 == 15 && choice2 == 38){
			KHRtoPHP();
		}
		else if(choice1 == 15 && choice2 == 39){
			KHRtoQAR();
		}
		else if(choice1 == 15 && choice2 == 40){
			KHRtoRON();
		}
		else if(choice1 == 15 && choice2 == 41){
			KHRtoRUB();
		}
		else if(choice1 == 15 && choice2 == 42){
			KHRtoSAR();
		}
		else if(choice1 == 15 && choice2 == 43){
			KHRtoRSD();
		}
		else if(choice1 == 15 && choice2 == 44){
			KHRtoSGD();
		}
		else if(choice1 == 15 && choice2 == 45){
			KHRtoZAR();
		}
		else if(choice1 == 15 && choice2 == 46){
			KHRtoKRW();
		}
		else if(choice1 == 15 && choice2 == 47){
			KHRtoLKR();
		}
		else if(choice1 == 15 && choice2 == 48){
			KHRtoSEK();
		}
		else if(choice1 == 15 && choice2 == 49){
			KHRtoCHF();
		}
		else if(choice1 == 15 && choice2 == 50){
			KHRtoSYP();
		}
		else if(choice1 == 15 && choice2 == 51){
			KHRtoTZS();
		}
		else if(choice1 == 15 && choice2 == 52){
			KHRtoTHB();
		}
		else if(choice1 == 15 && choice2 == 53){
			KHRtoTRY();
		}
		else if(choice1 == 15 && choice2 == 54){
			KHRtoUGX();
		}
		else if(choice1 == 15 && choice2 == 55){
			KHRtoUAH();
		}
		else if(choice1 == 15 && choice2 == 56){
			KHRtoAED();
		}
		else if(choice1 == 15 && choice2 == 57){
			KHRtoVND();
		}
		else if(choice1 == 15 && choice2 == 58){
			KHRtoZMW();
		}
		//------------Canadian Dollar Conversion Choices----------//
		if(choice1 == 16 && choice2 == 1){
			CADtoUSD();
		}
		else if(choice1 == 16 && choice2 == 2){
			CADtoEUR();
		}
		else if(choice1 == 16 && choice2 == 3){
			CADtoHKD();
		}
		else if(choice1 == 16 && choice2 == 4){
			CADtoBitcoin();
		}
		else if(choice1 == 16 && choice2 == 5){
			CADtoBitcoinCash();
		}
		else if(choice1 == 16 && choice2 == 6){
			CADtoJPY();
		}
		else if(choice1 == 16 && choice2 == 7){
			CADtoCNY();
		}
		else if(choice1 == 16 && choice2 == 8){
			CADtoINR();
		}
		else if(choice1 == 16 && choice2 == 9){
			CADtoDZD();
		}
		else if(choice1 == 16 && choice2 == 10){
			CADtoARS();
		}
		else if(choice1 == 16 && choice2 == 11){
			CADtoAUD();
		}
		else if(choice1 == 16 && choice2 == 12){
			CADtoBRL();
		}
		else if(choice1 == 16 && choice2 == 13){
			CADtoGBP();
		}
		else if(choice1 == 16 && choice2 == 14){
			CADtoBGN();
		}
		else if(choice1 == 16 && choice2 == 15){
			CADtoKHR();
		}
		else if(choice1 == 16 && choice2 == 16){
			CADtoCAD();
		}
		else if(choice1 == 16 && choice2 == 17){
			CADtoCLP();
		}
		else if(choice1 == 16 && choice2 == 18){
			CADtoCOP();
		}
		else if(choice1 == 16 && choice2 == 19){
			CADtoCRC();
		}
		else if(choice1 == 16 && choice2 == 20){
			CADtoHRK();
		}
		else if(choice1 == 16 && choice2 == 21){
			CADtoCZK();
		}
		else if(choice1 == 16 && choice2 == 22){
			CADtoDKK();
		}
		else if(choice1 == 16 && choice2 == 23){
			CADtoEGP();
		}
		else if(choice1 == 16 && choice2 == 24){
			CADtoISK();
		}
		else if(choice1 == 16 && choice2 == 25){
			CADtoIDR();
		}
		else if(choice1 == 16 && choice2 == 26){
			CADtoIQD();
		}
		else if(choice1 == 16 && choice2 == 27){
			CADtoILS();
		}
		else if(choice1 == 16 && choice2 == 28){
			CADtoJOD();
		}
		else if(choice1 == 16 && choice2 == 29){
			CADtoKES();
		}
		else if(choice1 == 16 && choice2 == 30){
			CADtoKWD();
		}
		else if(choice1 == 16 && choice2 == 31){
			CADtoMYR();
		}
		else if(choice1 == 16 && choice2 == 32){
			CADtoMXN();
		}
		else if(choice1 == 16 && choice2 == 33){
			CADtoMAD();
		}
		else if(choice1 == 16 && choice2 == 34){
			CADtoMMK();
		}
		else if(choice1 == 16 && choice2 == 35){
			CADtoTWD();
		}
		else if(choice1 == 16 && choice2 == 36){
			CADtoNZD();
		}
		else if(choice1 == 16 && choice2 == 37){
			CADtoNOK();
		}
		else if(choice1 == 16 && choice2 == 38){
			CADtoPHP();
		}
		else if(choice1 == 16 && choice2 == 39){
			CADtoQAR();
		}
		else if(choice1 == 16 && choice2 == 40){
			CADtoRON();
		}
		else if(choice1 == 16 && choice2 == 41){
			CADtoRUB();
		}
		else if(choice1 == 16 && choice2 == 42){
			CADtoSAR();
		}
		else if(choice1 == 16 && choice2 == 43){
			CADtoRSD();
		}
		else if(choice1 == 16 && choice2 == 44){
			CADtoSGD();
		}
		else if(choice1 == 16 && choice2 == 45){
			CADtoZAR();
		}
		else if(choice1 == 16 && choice2 == 46){
			CADtoKRW();
		}
		else if(choice1 == 16 && choice2 == 47){
			CADtoLKR();
		}
		else if(choice1 == 16 && choice2 == 48){
			CADtoSEK();
		}
		else if(choice1 == 16 && choice2 == 49){
			CADtoCHF();
		}
		else if(choice1 == 16 && choice2 == 50){
			CADtoSYP();
		}
		else if(choice1 == 16 && choice2 == 51){
			CADtoTZS();
		}
		else if(choice1 == 16 && choice2 == 52){
			CADtoTHB();
		}
		else if(choice1 == 16 && choice2 == 53){
			CADtoTRY();
		}
		else if(choice1 == 16 && choice2 == 54){
			CADtoUGX();
		}
		else if(choice1 == 16 && choice2 == 55){
			CADtoUAH();
		}
		else if(choice1 == 16 && choice2 == 56){
			CADtoAED();
		}
		else if(choice1 == 16 && choice2 == 57){
			CADtoVND();
		}
		else if(choice1 == 16 && choice2 == 58){
			CADtoZMW();
		}
		//------------Chilean Peso Conversion Choices----------//
		if(choice1 == 17 && choice2 == 1){
			CLPtoUSD();
		}
		else if(choice1 == 17 && choice2 == 2){
			CLPtoEUR();
		}
		else if(choice1 == 17 && choice2 == 3){
			CLPtoHKD();
		}
		else if(choice1 == 17 && choice2 == 4){
			CLPtoBitcoin();
		}
		else if(choice1 == 17 && choice2 == 5){
			CLPtoBitcoinCash();
		}
		else if(choice1 == 17 && choice2 == 6){
			CLPtoJPY();
		}
		else if(choice1 == 17 && choice2 == 7){
			CLPtoCNY();
		}
		else if(choice1 == 17 && choice2 == 8){
			CLPtoINR();
		}
		else if(choice1 == 17 && choice2 == 9){
			CLPtoDZD();
		}
		else if(choice1 == 17 && choice2 == 10){
			CLPtoARS();
		}
		else if(choice1 == 17 && choice2 == 11){
			CLPtoAUD();
		}
		else if(choice1 == 17 && choice2 == 12){
			CLPtoBRL();
		}
		else if(choice1 == 17 && choice2 == 13){
			CLPtoGBP();
		}
		else if(choice1 == 17 && choice2 == 14){
			CLPtoBGN();
		}
		else if(choice1 == 17 && choice2 == 15){
			CLPtoKHR();
		}
		else if(choice1 == 17 && choice2 == 16){
			CLPtoCAD();
		}
		else if(choice1 == 17 && choice2 == 17){
			CLPtoCLP();
		}
		else if(choice1 == 17 && choice2 == 18){
			CLPtoCOP();
		}
		else if(choice1 == 17 && choice2 == 19){
			CLPtoCRC();
		}
		else if(choice1 == 17 && choice2 == 20){
			CLPtoHRK();
		}
		else if(choice1 == 17 && choice2 == 21){
			CLPtoCZK();
		}
		else if(choice1 == 17 && choice2 == 22){
			CLPtoDKK();
		}
		else if(choice1 == 17 && choice2 == 23){
			CLPtoEGP();
		}
		else if(choice1 == 17 && choice2 == 24){
			CLPtoISK();
		}
		else if(choice1 == 17 && choice2 == 25){
			CLPtoIDR();
		}
		else if(choice1 == 17 && choice2 == 26){
			CLPtoIQD();
		}
		else if(choice1 == 17 && choice2 == 27){
			CLPtoILS();
		}
		else if(choice1 == 17 && choice2 == 28){
			CLPtoJOD();
		}
		else if(choice1 == 17 && choice2 == 29){
			CLPtoKES();
		}
		else if(choice1 == 17 && choice2 == 30){
			CLPtoKWD();
		}
		else if(choice1 == 17 && choice2 == 31){
			CLPtoMYR();
		}
		else if(choice1 == 17 && choice2 == 32){
			CLPtoMXN();
		}
		else if(choice1 == 17 && choice2 == 33){
			CLPtoMAD();
		}
		else if(choice1 == 17 && choice2 == 34){
			CLPtoMMK();
		}
		else if(choice1 == 17 && choice2 == 35){
			CLPtoTWD();
		}
		else if(choice1 == 17 && choice2 == 36){
			CLPtoNZD();
		}
		else if(choice1 == 17 && choice2 == 37){
			CLPtoNOK();
		}
		else if(choice1 == 17 && choice2 == 38){
			CLPtoPHP();
		}
		else if(choice1 == 17 && choice2 == 39){
			CLPtoQAR();
		}
		else if(choice1 == 17 && choice2 == 40){
			CLPtoRON();
		}
		else if(choice1 == 17 && choice2 == 41){
			CLPtoRUB();
		}
		else if(choice1 == 17 && choice2 == 42){
			CLPtoSAR();
		}
		else if(choice1 == 17 && choice2 == 43){
			CLPtoRSD();
		}
		else if(choice1 == 17 && choice2 == 44){
			CLPtoSGD();
		}
		else if(choice1 == 17 && choice2 == 45){
			CLPtoZAR();
		}
		else if(choice1 == 17 && choice2 == 46){
			CLPtoKRW();
		}
		else if(choice1 == 17 && choice2 == 47){
			CLPtoLKR();
		}
		else if(choice1 == 17 && choice2 == 48){
			CLPtoSEK();
		}
		else if(choice1 == 17 && choice2 == 49){
			CLPtoCHF();
		}
		else if(choice1 == 17 && choice2 == 50){
			CLPtoSYP();
		}
		else if(choice1 == 17 && choice2 == 51){
			CLPtoTZS();
		}
		else if(choice1 == 17 && choice2 == 52){
			CLPtoTHB();
		}
		else if(choice1 == 17 && choice2 == 53){
			CLPtoTRY();
		}
		else if(choice1 == 17 && choice2 == 54){
			CLPtoUGX();
		}
		else if(choice1 == 17 && choice2 == 55){
			CLPtoUAH();
		}
		else if(choice1 == 17 && choice2 == 56){
			CLPtoAED();
		}
		else if(choice1 == 17 && choice2 == 57){
			CLPtoVND();
		}
		else if(choice1 == 17 && choice2 == 58){
			CLPtoZMW();
		}
		//------------Columbian Peso Conversion Choices----------//
		if(choice1 == 18 && choice2 == 1){
			COPtoUSD();
		}
		else if(choice1 == 18 && choice2 == 2){
			COPtoEUR();
		}
		else if(choice1 == 18 && choice2 == 3){
			COPtoHKD();
		}
		else if(choice1 == 18 && choice2 == 4){
			COPtoBitcoin();
		}
		else if(choice1 == 18 && choice2 == 5){
			COPtoBitcoinCash();
		}
		else if(choice1 == 18 && choice2 == 6){
			COPtoJPY();
		}
		else if(choice1 == 18 && choice2 == 7){
			COPtoCNY();
		}
		else if(choice1 == 18 && choice2 == 8){
			COPtoINR();
		}
		else if(choice1 == 18 && choice2 == 9){
			COPtoDZD();
		}
		else if(choice1 == 18 && choice2 == 10){
			COPtoARS();
		}
		else if(choice1 == 18 && choice2 == 11){
			COPtoAUD();
		}
		else if(choice1 == 18 && choice2 == 12){
			COPtoBRL();
		}
		else if(choice1 == 18 && choice2 == 13){
			COPtoGBP();
		}
		else if(choice1 == 18 && choice2 == 14){
			COPtoBGN();
		}
		else if(choice1 == 18 && choice2 == 15){
			COPtoKHR();
		}
		else if(choice1 == 18 && choice2 == 16){
			COPtoCAD();
		}
		else if(choice1 == 18 && choice2 == 17){
			COPtoCLP();
		}
		else if(choice1 == 18 && choice2 == 18){
			COPtoCOP();
		}
		else if(choice1 == 18 && choice2 == 19){
			COPtoCRC();
		}
		else if(choice1 == 18 && choice2 == 20){
			COPtoHRK();
		}
		else if(choice1 == 18 && choice2 == 21){
			COPtoCZK();
		}
		else if(choice1 == 18 && choice2 == 22){
			COPtoDKK();
		}
		else if(choice1 == 18 && choice2 == 23){
			COPtoEGP();
		}
		else if(choice1 == 18 && choice2 == 24){
			COPtoISK();
		}
		else if(choice1 == 18 && choice2 == 25){
			COPtoIDR();
		}
		else if(choice1 == 18 && choice2 == 26){
			COPtoIQD();
		}
		else if(choice1 == 18 && choice2 == 27){
			COPtoILS();
		}
		else if(choice1 == 18 && choice2 == 28){
			COPtoJOD();
		}
		else if(choice1 == 18 && choice2 == 29){
			COPtoKES();
		}
		else if(choice1 == 18 && choice2 == 30){
			COPtoKWD();
		}
		else if(choice1 == 18 && choice2 == 31){
			COPtoMYR();
		}
		else if(choice1 == 18 && choice2 == 32){
			COPtoMXN();
		}
		else if(choice1 == 18 && choice2 == 33){
			COPtoMAD();
		}
		else if(choice1 == 18 && choice2 == 34){
			COPtoMMK();
		}
		else if(choice1 == 18 && choice2 == 35){
			COPtoTWD();
		}
		else if(choice1 == 18 && choice2 == 36){
			COPtoNZD();
		}
		else if(choice1 == 18 && choice2 == 37){
			COPtoNOK();
		}
		else if(choice1 == 18 && choice2 == 38){
			COPtoPHP();
		}
		else if(choice1 == 18 && choice2 == 39){
			COPtoQAR();
		}
		else if(choice1 == 18 && choice2 == 40){
			COPtoRON();
		}
		else if(choice1 == 18 && choice2 == 41){
			COPtoRUB();
		}
		else if(choice1 == 18 && choice2 == 42){
			COPtoSAR();
		}
		else if(choice1 == 18 && choice2 == 43){
			COPtoRSD();
		}
		else if(choice1 == 18 && choice2 == 44){
			COPtoSGD();
		}
		else if(choice1 == 18 && choice2 == 45){
			COPtoZAR();
		}
		else if(choice1 == 18 && choice2 == 46){
			COPtoKRW();
		}
		else if(choice1 == 18 && choice2 == 47){
			COPtoLKR();
		}
		else if(choice1 == 18 && choice2 == 48){
			COPtoSEK();
		}
		else if(choice1 == 18 && choice2 == 49){
			COPtoCHF();
		}
		else if(choice1 == 18 && choice2 == 50){
			COPtoSYP();
		}
		else if(choice1 == 18 && choice2 == 51){
			COPtoTZS();
		}
		else if(choice1 == 18 && choice2 == 52){
			COPtoTHB();
		}
		else if(choice1 == 18 && choice2 == 53){
			COPtoTRY();
		}
		else if(choice1 == 18 && choice2 == 54){
			COPtoUGX();
		}
		else if(choice1 == 18 && choice2 == 55){
			COPtoUAH();
		}
		else if(choice1 == 18 && choice2 == 56){
			COPtoAED();
		}
		else if(choice1 == 18 && choice2 == 57){
			COPtoVND();
		}
		else if(choice1 == 18 && choice2 == 58){
			COPtoZMW();
		}
		//------------Costa Rican Colon Conversion Choices----------//
		if(choice1 == 19 && choice2 == 1){
			CRCtoUSD();
		}
		else if(choice1 == 19 && choice2 == 2){
			CRCtoEUR();
		}
		else if(choice1 == 19 && choice2 == 3){
			CRCtoHKD();
		}
		else if(choice1 == 19 && choice2 == 4){
			CRCtoBitcoin();
		}
		else if(choice1 == 19 && choice2 == 5){
			CRCtoBitcoinCash();
		}
		else if(choice1 == 19 && choice2 == 6){
			CRCtoJPY();
		}
		else if(choice1 == 19 && choice2 == 7){
			CRCtoCNY();
		}
		else if(choice1 == 19 && choice2 == 8){
			CRCtoINR();
		}
		else if(choice1 == 19 && choice2 == 9){
			CRCtoDZD();
		}
		else if(choice1 == 19 && choice2 == 10){
			CRCtoARS();
		}
		else if(choice1 == 19 && choice2 == 11){
			CRCtoAUD();
		}
		else if(choice1 == 19 && choice2 == 12){
			CRCtoBRL();
		}
		else if(choice1 == 19 && choice2 == 13){
			CRCtoGBP();
		}
		else if(choice1 == 19 && choice2 == 14){
			CRCtoBGN();
		}
		else if(choice1 == 19 && choice2 == 15){
			CRCtoKHR();
		}
		else if(choice1 == 19 && choice2 == 16){
			CRCtoCAD();
		}
		else if(choice1 == 19 && choice2 == 17){
			CRCtoCLP();
		}
		else if(choice1 == 19 && choice2 == 18){
			CRCtoCOP();
		}
		else if(choice1 == 19 && choice2 == 19){
			CRCtoCRC();
		}
		else if(choice1 == 19 && choice2 == 20){
			CRCtoHRK();
		}
		else if(choice1 == 19 && choice2 == 21){
			CRCtoCZK();
		}
		else if(choice1 == 19 && choice2 == 22){
			CRCtoDKK();
		}
		else if(choice1 == 19 && choice2 == 23){
			CRCtoEGP();
		}
		else if(choice1 == 19 && choice2 == 24){
			CRCtoISK();
		}
		else if(choice1 == 19 && choice2 == 25){
			CRCtoIDR();
		}
		else if(choice1 == 19 && choice2 == 26){
			CRCtoIQD();
		}
		else if(choice1 == 19 && choice2 == 27){
			CRCtoILS();
		}
		else if(choice1 == 19 && choice2 == 28){
			CRCtoJOD();
		}
		else if(choice1 == 19 && choice2 == 29){
			CRCtoKES();
		}
		else if(choice1 == 19 && choice2 == 30){
			CRCtoKWD();
		}
		else if(choice1 == 19 && choice2 == 31){
			CRCtoMYR();
		}
		else if(choice1 == 19 && choice2 == 32){
			CRCtoMXN();
		}
		else if(choice1 == 19 && choice2 == 33){
			CRCtoMAD();
		}
		else if(choice1 == 19 && choice2 == 34){
			CRCtoMMK();
		}
		else if(choice1 == 19 && choice2 == 35){
			CRCtoTWD();
		}
		else if(choice1 == 19 && choice2 == 36){
			CRCtoNZD();
		}
		else if(choice1 == 19 && choice2 == 37){
			CRCtoNOK();
		}
		else if(choice1 == 19 && choice2 == 38){
			CRCtoPHP();
		}
		else if(choice1 == 19 && choice2 == 39){
			CRCtoQAR();
		}
		else if(choice1 == 19 && choice2 == 40){
			CRCtoRON();
		}
		else if(choice1 == 19 && choice2 == 41){
			CRCtoRUB();
		}
		else if(choice1 == 19 && choice2 == 42){
			CRCtoSAR();
		}
		else if(choice1 == 19 && choice2 == 43){
			CRCtoRSD();
		}
		else if(choice1 == 19 && choice2 == 44){
			CRCtoSGD();
		}
		else if(choice1 == 19 && choice2 == 45){
			CRCtoZAR();
		}
		else if(choice1 == 19 && choice2 == 46){
			CRCtoKRW();
		}
		else if(choice1 == 19 && choice2 == 47){
			CRCtoLKR();
		}
		else if(choice1 == 19 && choice2 == 48){
			CRCtoSEK();
		}
		else if(choice1 == 19 && choice2 == 49){
			CRCtoCHF();
		}
		else if(choice1 == 19 && choice2 == 50){
			CRCtoSYP();
		}
		else if(choice1 == 19 && choice2 == 51){
			CRCtoTZS();
		}
		else if(choice1 == 19 && choice2 == 52){
			CRCtoTHB();
		}
		else if(choice1 == 19 && choice2 == 53){
			CRCtoTRY();
		}
		else if(choice1 == 19 && choice2 == 54){
			CRCtoUGX();
		}
		else if(choice1 == 19 && choice2 == 55){
			CRCtoUAH();
		}
		else if(choice1 == 19 && choice2 == 56){
			CRCtoAED();
		}
		else if(choice1 == 19 && choice2 == 57){
			CRCtoVND();
		}
		else if(choice1 == 19 && choice2 == 58){
			CRCtoZMW();
		}
		//------------Croatian Cuna Conversion Choices----------//
		if(choice1 == 20 && choice2 == 1){
			HRKtoUSD();
		}
		else if(choice1 == 20 && choice2 == 2){
			HRKtoEUR();
		}
		else if(choice1 == 20 && choice2 == 3){
			HRKtoHKD();
		}
		else if(choice1 == 20 && choice2 == 4){
			HRKtoBitcoin();
		}
		else if(choice1 == 20 && choice2 == 5){
			HRKtoBitcoinCash();
		}
		else if(choice1 == 20 && choice2 == 6){
			HRKtoJPY();
		}
		else if(choice1 == 20 && choice2 == 7){
			HRKtoCNY();
		}
		else if(choice1 == 20 && choice2 == 8){
			HRKtoINR();
		}
		else if(choice1 == 20 && choice2 == 9){
			HRKtoDZD();
		}
		else if(choice1 == 20 && choice2 == 10){
			HRKtoARS();
		}
		else if(choice1 == 20 && choice2 == 11){
			HRKtoAUD();
		}
		else if(choice1 == 20 && choice2 == 12){
			HRKtoBRL();
		}
		else if(choice1 == 20 && choice2 == 13){
			HRKtoGBP();
		}
		else if(choice1 == 20 && choice2 == 14){
			HRKtoBGN();
		}
		else if(choice1 == 20 && choice2 == 15){
			HRKtoKHR();
		}
		else if(choice1 == 20 && choice2 == 16){
			HRKtoCAD();
		}
		else if(choice1 == 20 && choice2 == 17){
			HRKtoCLP();
		}
		else if(choice1 == 20 && choice2 == 18){
			HRKtoCOP();
		}
		else if(choice1 == 20 && choice2 == 19){
			HRKtoCRC();
		}
		else if(choice1 == 20 && choice2 == 20){
			HRKtoHRK();
		}
		else if(choice1 == 20 && choice2 == 21){
			HRKtoCZK();
		}
		else if(choice1 == 20 && choice2 == 22){
			HRKtoDKK();
		}
		else if(choice1 == 20 && choice2 == 23){
			HRKtoEGP();
		}
		else if(choice1 == 20 && choice2 == 24){
			HRKtoISK();
		}
		else if(choice1 == 20 && choice2 == 25){
			HRKtoIDR();
		}
		else if(choice1 == 20 && choice2 == 26){
			HRKtoIQD();
		}
		else if(choice1 == 20 && choice2 == 27){
			HRKtoILS();
		}
		else if(choice1 == 20 && choice2 == 28){
			HRKtoJOD();
		}
		else if(choice1 == 20 && choice2 == 29){
			HRKtoKES();
		}
		else if(choice1 == 20 && choice2 == 30){
			HRKtoKWD();
		}
		else if(choice1 == 20 && choice2 == 31){
			HRKtoMYR();
		}
		else if(choice1 == 20 && choice2 == 32){
			HRKtoMXN();
		}
		else if(choice1 == 20 && choice2 == 33){
			HRKtoMAD();
		}
		else if(choice1 == 20 && choice2 == 34){
			HRKtoMMK();
		}
		else if(choice1 == 20 && choice2 == 35){
			HRKtoTWD();
		}
		else if(choice1 == 20 && choice2 == 36){
			HRKtoNZD();
		}
		else if(choice1 == 20 && choice2 == 37){
			HRKtoNOK();
		}
		else if(choice1 == 20 && choice2 == 38){
			HRKtoPHP();
		}
		else if(choice1 == 20 && choice2 == 39){
			HRKtoQAR();
		}
		else if(choice1 == 20 && choice2 == 40){
			HRKtoRON();
		}
		else if(choice1 == 20 && choice2 == 41){
			HRKtoRUB();
		}
		else if(choice1 == 20 && choice2 == 42){
			HRKtoSAR();
		}
		else if(choice1 == 20 && choice2 == 43){
			HRKtoRSD();
		}
		else if(choice1 == 20 && choice2 == 44){
			HRKtoSGD();
		}
		else if(choice1 == 20 && choice2 == 45){
			HRKtoZAR();
		}
		else if(choice1 == 20 && choice2 == 46){
			HRKtoKRW();
		}
		else if(choice1 == 20 && choice2 == 47){
			HRKtoLKR();
		}
		else if(choice1 == 20 && choice2 == 48){
			HRKtoSEK();
		}
		else if(choice1 == 20 && choice2 == 49){
			HRKtoCHF();
		}
		else if(choice1 == 20 && choice2 == 50){
			HRKtoSYP();
		}
		else if(choice1 == 20 && choice2 == 51){
			HRKtoTZS();
		}
		else if(choice1 == 20 && choice2 == 52){
			HRKtoTHB();
		}
		else if(choice1 == 20 && choice2 == 53){
			HRKtoTRY();
		}
		else if(choice1 == 20 && choice2 == 54){
			HRKtoUGX();
		}
		else if(choice1 == 20 && choice2 == 55){
			HRKtoUAH();
		}
		else if(choice1 == 20 && choice2 == 56){
			HRKtoAED();
		}
		else if(choice1 == 20 && choice2 == 57){
			HRKtoVND();
		}
		else if(choice1 == 20 && choice2 == 58){
			HRKtoZMW();
		}
		//------------Czech Republic Conversion Choices----------//
		if(choice1 == 21 && choice2 == 1){
			CZKtoUSD();
		}
		else if(choice1 == 21 && choice2 == 2){
			CZKtoEUR();
		}
		else if(choice1 == 21 && choice2 == 3){
			CZKtoHKD();
		}
		else if(choice1 == 21 && choice2 == 4){
			CZKtoBitcoin();
		}
		else if(choice1 == 21 && choice2 == 5){
			CZKtoBitcoinCash();
		}
		else if(choice1 == 21 && choice2 == 6){
			CZKtoJPY();
		}
		else if(choice1 == 21 && choice2 == 7){
			CZKtoCNY();
		}
		else if(choice1 == 21 && choice2 == 8){
			CZKtoINR();
		}
		else if(choice1 == 21 && choice2 == 9){
			CZKtoDZD();
		}
		else if(choice1 == 21 && choice2 == 10){
			CZKtoARS();
		}
		else if(choice1 == 21 && choice2 == 11){
			CZKtoAUD();
		}
		else if(choice1 == 21 && choice2 == 12){
			CZKtoBRL();
		}
		else if(choice1 == 21 && choice2 == 13){
			CZKtoGBP();
		}
		else if(choice1 == 21 && choice2 == 14){
			CZKtoBGN();
		}
		else if(choice1 == 21 && choice2 == 15){
			CZKtoKHR();
		}
		else if(choice1 == 21 && choice2 == 16){
			CZKtoCAD();
		}
		else if(choice1 == 21 && choice2 == 17){
			CZKtoCLP();
		}
		else if(choice1 == 21 && choice2 == 18){
			CZKtoCOP();
		}
		else if(choice1 == 21 && choice2 == 19){
			CZKtoCRC();
		}
		else if(choice1 == 21 && choice2 == 20){
			CZKtoHRK();
		}
		else if(choice1 == 21 && choice2 == 21){
			CZKtoCZK();
		}
		else if(choice1 == 21 && choice2 == 22){
			CZKtoDKK();
		}
		else if(choice1 == 21 && choice2 == 23){
			CZKtoEGP();
		}
		else if(choice1 == 21 && choice2 == 24){
			CZKtoISK();
		}
		else if(choice1 == 21 && choice2 == 25){
			CZKtoIDR();
		}
		else if(choice1 == 21 && choice2 == 26){
			CZKtoIQD();
		}
		else if(choice1 == 21 && choice2 == 27){
			CZKtoILS();
		}
		else if(choice1 == 21 && choice2 == 28){
			CZKtoJOD();
		}
		else if(choice1 == 21 && choice2 == 29){
			CZKtoKES();
		}
		else if(choice1 == 21 && choice2 == 30){
			CZKtoKWD();
		}
		else if(choice1 == 21 && choice2 == 31){
			CZKtoMYR();
		}
		else if(choice1 == 21 && choice2 == 32){
			CZKtoMXN();
		}
		else if(choice1 == 21 && choice2 == 33){
			CZKtoMAD();
		}
		else if(choice1 == 21 && choice2 == 34){
			CZKtoMMK();
		}
		else if(choice1 == 21 && choice2 == 35){
			CZKtoTWD();
		}
		else if(choice1 == 21 && choice2 == 36){
			CZKtoNZD();
		}
		else if(choice1 == 21 && choice2 == 37){
			CZKtoNOK();
		}
		else if(choice1 == 21 && choice2 == 38){
			CZKtoPHP();
		}
		else if(choice1 == 21 && choice2 == 39){
			CZKtoQAR();
		}
		else if(choice1 == 21 && choice2 == 40){
			CZKtoRON();
		}
		else if(choice1 == 21 && choice2 == 41){
			CZKtoRUB();
		}
		else if(choice1 == 21 && choice2 == 42){
			CZKtoSAR();
		}
		else if(choice1 == 21 && choice2 == 43){
			CZKtoRSD();
		}
		else if(choice1 == 21 && choice2 == 44){
			CZKtoSGD();
		}
		else if(choice1 == 21 && choice2 == 45){
			CZKtoZAR();
		}
		else if(choice1 == 21 && choice2 == 46){
			CZKtoKRW();
		}
		else if(choice1 == 21 && choice2 == 47){
			CZKtoLKR();
		}
		else if(choice1 == 21 && choice2 == 48){
			CZKtoSEK();
		}
		else if(choice1 == 21 && choice2 == 49){
			CZKtoCHF();
		}
		else if(choice1 == 21 && choice2 == 50){
			CZKtoSYP();
		}
		else if(choice1 == 21 && choice2 == 51){
			CZKtoTZS();
		}
		else if(choice1 == 21 && choice2 == 52){
			CZKtoTHB();
		}
		else if(choice1 == 21 && choice2 == 53){
			CZKtoTRY();
		}
		else if(choice1 == 21 && choice2 == 54){
			CZKtoUGX();
		}
		else if(choice1 == 21 && choice2 == 55){
			CZKtoUAH();
		}
		else if(choice1 == 21 && choice2 == 56){
			CZKtoAED();
		}
		else if(choice1 == 21 && choice2 == 57){
			CZKtoVND();
		}
		else if(choice1 == 21 && choice2 == 58){
			CZKtoZMW();
		}
		//------------Danish Krone Conversion Choices----------//
		if(choice1 == 22 && choice2 == 1){
			DKKtoUSD();
		}
		else if(choice1 == 22 && choice2 == 2){
			DKKtoEUR();
		}
		else if(choice1 == 22 && choice2 == 3){
			DKKtoHKD();
		}
		else if(choice1 == 22 && choice2 == 4){
			DKKtoBitcoin();
		}
		else if(choice1 == 22 && choice2 == 5){
			DKKtoBitcoinCash();
		}
		else if(choice1 == 22 && choice2 == 6){
			DKKtoJPY();
		}
		else if(choice1 == 22 && choice2 == 7){
			DKKtoCNY();
		}
		else if(choice1 == 22 && choice2 == 8){
			DKKtoINR();
		}
		else if(choice1 == 22 && choice2 == 9){
			DKKtoDZD();
		}
		else if(choice1 == 22 && choice2 == 10){
			DKKtoARS();
		}
		else if(choice1 == 22 && choice2 == 11){
			DKKtoAUD();
		}
		else if(choice1 == 22 && choice2 == 12){
			DKKtoBRL();
		}
		else if(choice1 == 22 && choice2 == 13){
			DKKtoGBP();
		}
		else if(choice1 == 22 && choice2 == 14){
			DKKtoBGN();
		}
		else if(choice1 == 22 && choice2 == 15){
			DKKtoKHR();
		}
		else if(choice1 == 22 && choice2 == 16){
			DKKtoCAD();
		}
		else if(choice1 == 22 && choice2 == 17){
			DKKtoCLP();
		}
		else if(choice1 == 22 && choice2 == 18){
			DKKtoCOP();
		}
		else if(choice1 == 22 && choice2 == 19){
			DKKtoCRC();
		}
		else if(choice1 == 22 && choice2 == 20){
			DKKtoHRK();
		}
		else if(choice1 == 22 && choice2 == 21){
			DKKtoCZK();
		}
		else if(choice1 == 22 && choice2 == 22){
			DKKtoDKK();
		}
		else if(choice1 == 22 && choice2 == 23){
			DKKtoEGP();
		}
		else if(choice1 == 22 && choice2 == 24){
			DKKtoISK();
		}
		else if(choice1 == 22 && choice2 == 25){
			DKKtoIDR();
		}
		else if(choice1 == 22 && choice2 == 26){
			DKKtoIQD();
		}
		else if(choice1 == 22 && choice2 == 27){
			DKKtoILS();
		}
		else if(choice1 == 22 && choice2 == 28){
			DKKtoJOD();
		}
		else if(choice1 == 22 && choice2 == 29){
			DKKtoKES();
		}
		else if(choice1 == 22 && choice2 == 30){
			DKKtoKWD();
		}
		else if(choice1 == 22 && choice2 == 31){
			DKKtoMYR();
		}
		else if(choice1 == 22 && choice2 == 32){
			DKKtoMXN();
		}
		else if(choice1 == 22 && choice2 == 33){
			DKKtoMAD();
		}
		else if(choice1 == 22 && choice2 == 34){
			DKKtoMMK();
		}
		else if(choice1 == 22 && choice2 == 35){
			DKKtoTWD();
		}
		else if(choice1 == 22 && choice2 == 36){
			DKKtoNZD();
		}
		else if(choice1 == 22 && choice2 == 37){
			DKKtoNOK();
		}
		else if(choice1 == 22 && choice2 == 38){
			DKKtoPHP();
		}
		else if(choice1 == 22 && choice2 == 39){
			DKKtoQAR();
		}
		else if(choice1 == 22 && choice2 == 40){
			DKKtoRON();
		}
		else if(choice1 == 22 && choice2 == 41){
			DKKtoRUB();
		}
		else if(choice1 == 22 && choice2 == 42){
			DKKtoSAR();
		}
		else if(choice1 == 22 && choice2 == 43){
			DKKtoRSD();
		}
		else if(choice1 == 22 && choice2 == 44){
			DKKtoSGD();
		}
		else if(choice1 == 22 && choice2 == 45){
			DKKtoZAR();
		}
		else if(choice1 == 22 && choice2 == 46){
			DKKtoKRW();
		}
		else if(choice1 == 22 && choice2 == 47){
			DKKtoLKR();
		}
		else if(choice1 == 22 && choice2 == 48){
			DKKtoSEK();
		}
		else if(choice1 == 22 && choice2 == 49){
			DKKtoCHF();
		}
		else if(choice1 == 22 && choice2 == 50){
			DKKtoSYP();
		}
		else if(choice1 == 22 && choice2 == 51){
			DKKtoTZS();
		}
		else if(choice1 == 22 && choice2 == 52){
			DKKtoTHB();
		}
		else if(choice1 == 22 && choice2 == 53){
			DKKtoTRY();
		}
		else if(choice1 == 22 && choice2 == 54){
			DKKtoUGX();
		}
		else if(choice1 == 22 && choice2 == 55){
			DKKtoUAH();
		}
		else if(choice1 == 22 && choice2 == 56){
			DKKtoAED();
		}
		else if(choice1 == 22 && choice2 == 57){
			DKKtoVND();
		}
		else if(choice1 == 22 && choice2 == 58){
			DKKtoZMW();
		}
		//------------Egyptian Pound Conversion Choices----------//
		if(choice1 == 23 && choice2 == 1){
			EGPtoUSD();
		}
		else if(choice1 == 23 && choice2 == 2){
			EGPtoEUR();
		}
		else if(choice1 == 23 && choice2 == 3){
			EGPtoHKD();
		}
		else if(choice1 == 23 && choice2 == 4){
			EGPtoBitcoin();
		}
		else if(choice1 == 23 && choice2 == 5){
			EGPtoBitcoinCash();
		}
		else if(choice1 == 23 && choice2 == 6){
			EGPtoJPY();
		}
		else if(choice1 == 23 && choice2 == 7){
			EGPtoCNY();
		}
		else if(choice1 == 23 && choice2 == 8){
			EGPtoINR();
		}
		else if(choice1 == 23 && choice2 == 9){
			EGPtoDZD();
		}
		else if(choice1 == 23 && choice2 == 10){
			EGPtoARS();
		}
		else if(choice1 == 23 && choice2 == 11){
			EGPtoAUD();
		}
		else if(choice1 == 23 && choice2 == 12){
			EGPtoBRL();
		}
		else if(choice1 == 23 && choice2 == 13){
			EGPtoGBP();
		}
		else if(choice1 == 23 && choice2 == 14){
			EGPtoBGN();
		}
		else if(choice1 == 23 && choice2 == 15){
			EGPtoKHR();
		}
		else if(choice1 == 23 && choice2 == 16){
			EGPtoCAD();
		}
		else if(choice1 == 23 && choice2 == 17){
			EGPtoCLP();
		}
		else if(choice1 == 23 && choice2 == 18){
			EGPtoCOP();
		}
		else if(choice1 == 23 && choice2 == 19){
			EGPtoCRC();
		}
		else if(choice1 == 23 && choice2 == 20){
			EGPtoHRK();
		}
		else if(choice1 == 23 && choice2 == 21){
			EGPtoCZK();
		}
		else if(choice1 == 23 && choice2 == 22){
			EGPtoDKK();
		}
		else if(choice1 == 23 && choice2 == 23){
			EGPtoEGP();
		}
		else if(choice1 == 23 && choice2 == 24){
			EGPtoISK();
		}
		else if(choice1 == 23 && choice2 == 25){
			EGPtoIDR();
		}
		else if(choice1 == 23 && choice2 == 26){
			EGPtoIQD();
		}
		else if(choice1 == 23 && choice2 == 27){
			EGPtoILS();
		}
		else if(choice1 == 23 && choice2 == 28){
			EGPtoJOD();
		}
		else if(choice1 == 23 && choice2 == 29){
			EGPtoKES();
		}
		else if(choice1 == 23 && choice2 == 30){
			EGPtoKWD();
		}
		else if(choice1 == 23 && choice2 == 31){
			EGPtoMYR();
		}
		else if(choice1 == 23 && choice2 == 32){
			EGPtoMXN();
		}
		else if(choice1 == 23 && choice2 == 33){
			EGPtoMAD();
		}
		else if(choice1 == 23 && choice2 == 34){
			EGPtoMMK();
		}
		else if(choice1 == 23 && choice2 == 35){
			EGPtoTWD();
		}
		else if(choice1 == 23 && choice2 == 36){
			EGPtoNZD();
		}
		else if(choice1 == 23 && choice2 == 37){
			EGPtoNOK();
		}
		else if(choice1 == 23 && choice2 == 38){
			EGPtoPHP();
		}
		else if(choice1 == 23 && choice2 == 39){
			EGPtoQAR();
		}
		else if(choice1 == 23 && choice2 == 40){
			EGPtoRON();
		}
		else if(choice1 == 23 && choice2 == 41){
			EGPtoRUB();
		}
		else if(choice1 == 23 && choice2 == 42){
			EGPtoSAR();
		}
		else if(choice1 == 23 && choice2 == 43){
			EGPtoRSD();
		}
		else if(choice1 == 23 && choice2 == 44){
			EGPtoSGD();
		}
		else if(choice1 == 23 && choice2 == 45){
			EGPtoZAR();
		}
		else if(choice1 == 23 && choice2 == 46){
			EGPtoKRW();
		}
		else if(choice1 == 23 && choice2 == 47){
			EGPtoLKR();
		}
		else if(choice1 == 23 && choice2 == 48){
			EGPtoSEK();
		}
		else if(choice1 == 23 && choice2 == 49){
			EGPtoCHF();
		}
		else if(choice1 == 23 && choice2 == 50){
			EGPtoSYP();
		}
		else if(choice1 == 23 && choice2 == 51){
			EGPtoTZS();
		}
		else if(choice1 == 23 && choice2 == 52){
			EGPtoTHB();
		}
		else if(choice1 == 23 && choice2 == 53){
			EGPtoTRY();
		}
		else if(choice1 == 23 && choice2 == 54){
			EGPtoUGX();
		}
		else if(choice1 == 23 && choice2 == 55){
			EGPtoUAH();
		}
		else if(choice1 == 23 && choice2 == 56){
			EGPtoAED();
		}
		else if(choice1 == 23 && choice2 == 57){
			EGPtoVND();
		}
		else if(choice1 == 23 && choice2 == 58){
			EGPtoZMW();
		}
		//--------------------------------------------//

		//------------Icelandic Krona Conversion Choices----------//
		if(choice1 == 24 && choice2 == 1){
			ISKtoUSD();
		}
		else if(choice1 == 24 && choice2 == 2){
			ISKtoEUR();
		}
		else if(choice1 == 24 && choice2 == 3){
			ISKtoHKD();
		}
		else if(choice1 == 24 && choice2 == 4){
			ISKtoBitcoin();
		}
		else if(choice1 == 24 && choice2 == 5){
			ISKtoBitcoinCash();
		}
		else if(choice1 == 24 && choice2 == 6){
			ISKtoJPY();
		}
		else if(choice1 == 24 && choice2 == 7){
			ISKtoCNY();
		}
		else if(choice1 == 24 && choice2 == 8){
			ISKtoINR();
		}
		else if(choice1 == 24 && choice2 == 9){
			ISKtoDZD();
		}
		else if(choice1 == 24 && choice2 == 10){
			ISKtoARS();
		}
		else if(choice1 == 24 && choice2 == 11){
			ISKtoAUD();
		}
		else if(choice1 == 24 && choice2 == 12){
			ISKtoBRL();
		}
		else if(choice1 == 24 && choice2 == 13){
			ISKtoGBP();
		}
		else if(choice1 == 24 && choice2 == 14){
			ISKtoBGN();
		}
		else if(choice1 == 24 && choice2 == 15){
			ISKtoKHR();
		}
		else if(choice1 == 24 && choice2 == 16){
			ISKtoCAD();
		}
		else if(choice1 == 24 && choice2 == 17){
			ISKtoCLP();
		}
		else if(choice1 == 24 && choice2 == 18){
			ISKtoCOP();
		}
		else if(choice1 == 24 && choice2 == 19){
			ISKtoCRC();
		}
		else if(choice1 == 24 && choice2 == 20){
			ISKtoHRK();
		}
		else if(choice1 == 24 && choice2 == 21){
			ISKtoCZK();
		}
		else if(choice1 == 24 && choice2 == 22){
			ISKtoDKK();
		}
		else if(choice1 == 24 && choice2 == 23){
			ISKtoEGP();
		}
		else if(choice1 == 24 && choice2 == 24){
			ISKtoISK();
		}
		else if(choice1 == 24 && choice2 == 25){
			ISKtoIDR();
		}
		else if(choice1 == 24 && choice2 == 26){
			ISKtoIQD();
		}
		else if(choice1 == 24 && choice2 == 27){
			ISKtoILS();
		}
		else if(choice1 == 24 && choice2 == 28){
			ISKtoJOD();
		}
		else if(choice1 == 24 && choice2 == 29){
			ISKtoKES();
		}
		else if(choice1 == 24 && choice2 == 30){
			ISKtoKWD();
		}
		else if(choice1 == 24 && choice2 == 31){
			ISKtoMYR();
		}
		else if(choice1 == 24 && choice2 == 32){
			ISKtoMXN();
		}
		else if(choice1 == 24 && choice2 == 33){
			ISKtoMAD();
		}
		else if(choice1 == 24 && choice2 == 34){
			ISKtoMMK();
		}
		else if(choice1 == 24 && choice2 == 35){
			ISKtoTWD();
		}
		else if(choice1 == 24 && choice2 == 36){
			ISKtoNZD();
		}
		else if(choice1 == 24 && choice2 == 37){
			ISKtoNOK();
		}
		else if(choice1 == 24 && choice2 == 38){
			ISKtoPHP();
		}
		else if(choice1 == 24 && choice2 == 39){
			ISKtoQAR();
		}
		else if(choice1 == 24 && choice2 == 40){
			ISKtoRON();
		}
		else if(choice1 == 24 && choice2 == 41){
			ISKtoRUB();
		}
		else if(choice1 == 24 && choice2 == 42){
			ISKtoSAR();
		}
		else if(choice1 == 24 && choice2 == 43){
			ISKtoRSD();
		}
		else if(choice1 == 24 && choice2 == 44){
			ISKtoSGD();
		}
		else if(choice1 == 24 && choice2 == 45){
			ISKtoZAR();
		}
		else if(choice1 == 24 && choice2 == 46){
			ISKtoKRW();
		}
		else if(choice1 == 24 && choice2 == 47){
			ISKtoLKR();
		}
		else if(choice1 == 24 && choice2 == 48){
			ISKtoSEK();
		}
		else if(choice1 == 24 && choice2 == 49){
			ISKtoCHF();
		}
		else if(choice1 == 24 && choice2 == 50){
			ISKtoSYP();
		}
		else if(choice1 == 24 && choice2 == 51){
			ISKtoTZS();
		}
		else if(choice1 == 24 && choice2 == 52){
			ISKtoTHB();
		}
		else if(choice1 == 24 && choice2 == 53){
			ISKtoTRY();
		}
		else if(choice1 == 24 && choice2 == 54){
			ISKtoUGX();
		}
		else if(choice1 == 24 && choice2 == 55){
			ISKtoUAH();
		}
		else if(choice1 == 24 && choice2 == 56){
			ISKtoAED();
		}
		else if(choice1 == 24 && choice2 == 57){
			ISKtoVND();
		}
		else if(choice1 == 24 && choice2 == 58){
			ISKtoZMW();
		}
		//------------Indonesian Rupiah Conversion Choices----------//
		if(choice1 == 25 && choice2 == 1){
			IDRtoUSD();
		}
		else if(choice1 == 25 && choice2 == 2){
			IDRtoEUR();
		}
		else if(choice1 == 25 && choice2 == 3){
			IDRtoHKD();
		}
		else if(choice1 == 25 && choice2 == 4){
			IDRtoBitcoin();
		}
		else if(choice1 == 25 && choice2 == 5){
			IDRtoBitcoinCash();
		}
		else if(choice1 == 25 && choice2 == 6){
			IDRtoJPY();
		}
		else if(choice1 == 25 && choice2 == 7){
			IDRtoCNY();
		}
		else if(choice1 == 25 && choice2 == 8){
			IDRtoINR();
		}
		else if(choice1 == 25 && choice2 == 9){
			IDRtoDZD();
		}
		else if(choice1 == 25 && choice2 == 10){
			IDRtoARS();
		}
		else if(choice1 == 25 && choice2 == 11){
			IDRtoAUD();
		}
		else if(choice1 == 25 && choice2 == 12){
			IDRtoBRL();
		}
		else if(choice1 == 25 && choice2 == 13){
			IDRtoGBP();
		}
		else if(choice1 == 25 && choice2 == 14){
			IDRtoBGN();
		}
		else if(choice1 == 25 && choice2 == 15){
			IDRtoKHR();
		}
		else if(choice1 == 25 && choice2 == 16){
			IDRtoCAD();
		}
		else if(choice1 == 25 && choice2 == 17){
			IDRtoCLP();
		}
		else if(choice1 == 25 && choice2 == 18){
			IDRtoCOP();
		}
		else if(choice1 == 25 && choice2 == 19){
			IDRtoCRC();
		}
		else if(choice1 == 25 && choice2 == 20){
			IDRtoHRK();
		}
		else if(choice1 == 25 && choice2 == 21){
			IDRtoCZK();
		}
		else if(choice1 == 25 && choice2 == 22){
			IDRtoDKK();
		}
		else if(choice1 == 25 && choice2 == 23){
			IDRtoEGP();
		}
		else if(choice1 == 25 && choice2 == 24){
			IDRtoISK();
		}
		else if(choice1 == 25 && choice2 == 25){
			IDRtoIDR();
		}
		else if(choice1 == 25 && choice2 == 26){
			IDRtoIQD();
		}
		else if(choice1 == 25 && choice2 == 27){
			IDRtoILS();
		}
		else if(choice1 == 25 && choice2 == 28){
			IDRtoJOD();
		}
		else if(choice1 == 25 && choice2 == 29){
			IDRtoKES();
		}
		else if(choice1 == 25 && choice2 == 30){
			IDRtoKWD();
		}
		else if(choice1 == 25 && choice2 == 31){
			IDRtoMYR();
		}
		else if(choice1 == 25 && choice2 == 32){
			IDRtoMXN();
		}
		else if(choice1 == 25 && choice2 == 33){
			IDRtoMAD();
		}
		else if(choice1 == 25 && choice2 == 34){
			IDRtoMMK();
		}
		else if(choice1 == 25 && choice2 == 35){
			IDRtoTWD();
		}
		else if(choice1 == 25 && choice2 == 36){
			IDRtoNZD();
		}
		else if(choice1 == 25 && choice2 == 37){
			IDRtoNOK();
		}
		else if(choice1 == 25 && choice2 == 38){
			IDRtoPHP();
		}
		else if(choice1 == 25 && choice2 == 39){
			IDRtoQAR();
		}
		else if(choice1 == 25 && choice2 == 40){
			IDRtoRON();
		}
		else if(choice1 == 25 && choice2 == 41){
			IDRtoRUB();
		}
		else if(choice1 == 25 && choice2 == 42){
			IDRtoSAR();
		}
		else if(choice1 == 25 && choice2 == 43){
			IDRtoRSD();
		}
		else if(choice1 == 25 && choice2 == 44){
			IDRtoSGD();
		}
		else if(choice1 == 25 && choice2 == 45){
			IDRtoZAR();
		}
		else if(choice1 == 25 && choice2 == 46){
			IDRtoKRW();
		}
		else if(choice1 == 25 && choice2 == 47){
			IDRtoLKR();
		}
		else if(choice1 == 25 && choice2 == 48){
			IDRtoSEK();
		}
		else if(choice1 == 25 && choice2 == 49){
			IDRtoCHF();
		}
		else if(choice1 == 25 && choice2 == 50){
			IDRtoSYP();
		}
		else if(choice1 == 25 && choice2 == 51){
			IDRtoTZS();
		}
		else if(choice1 == 25 && choice2 == 52){
			IDRtoTHB();
		}
		else if(choice1 == 25 && choice2 == 53){
			IDRtoTRY();
		}
		else if(choice1 == 25 && choice2 == 54){
			IDRtoUGX();
		}
		else if(choice1 == 25 && choice2 == 55){
			IDRtoUAH();
		}
		else if(choice1 == 25 && choice2 == 56){
			IDRtoAED();
		}
		else if(choice1 == 25 && choice2 == 57){
			IDRtoVND();
		}
		else if(choice1 == 25 && choice2 == 58){
			IDRtoZMW();
		}
		//--------------------------------------------//

		//------------Iraqi Dinar Conversion Choices----------//
		if(choice1 == 26 && choice2 == 1){
			IQDtoUSD();
		}
		else if(choice1 == 26 && choice2 == 2){
			IQDtoEUR();
		}
		else if(choice1 == 26 && choice2 == 3){
			IQDtoHKD();
		}
		else if(choice1 == 26 && choice2 == 4){
			IQDtoBitcoin();
		}
		else if(choice1 == 26 && choice2 == 5){
			IQDtoBitcoinCash();
		}
		else if(choice1 == 26 && choice2 == 6){
			IQDtoJPY();
		}
		else if(choice1 == 26 && choice2 == 7){
			IQDtoCNY();
		}
		else if(choice1 == 26 && choice2 == 8){
			IQDtoINR();
		}
		else if(choice1 == 26 && choice2 == 9){
			IQDtoDZD();
		}
		else if(choice1 == 26 && choice2 == 10){
			IQDtoARS();
		}
		else if(choice1 == 26 && choice2 == 11){
			IQDtoAUD();
		}
		else if(choice1 == 26 && choice2 == 12){
			IQDtoBRL();
		}
		else if(choice1 == 26 && choice2 == 13){
			IQDtoGBP();
		}
		else if(choice1 == 26 && choice2 == 14){
			IQDtoBGN();
		}
		else if(choice1 == 26 && choice2 == 15){
			IQDtoKHR();
		}
		else if(choice1 == 26 && choice2 == 16){
			IQDtoCAD();
		}
		else if(choice1 == 26 && choice2 == 17){
			IQDtoCLP();
		}
		else if(choice1 == 26 && choice2 == 18){
			IQDtoCOP();
		}
		else if(choice1 == 26 && choice2 == 19){
			IQDtoCRC();
		}
		else if(choice1 == 26 && choice2 == 20){
			IQDtoHRK();
		}
		else if(choice1 == 26 && choice2 == 21){
			IQDtoCZK();
		}
		else if(choice1 == 26 && choice2 == 22){
			IQDtoDKK();
		}
		else if(choice1 == 26 && choice2 == 23){
			IQDtoEGP();
		}
		else if(choice1 == 26 && choice2 == 24){
			IQDtoISK();
		}
		else if(choice1 == 26 && choice2 == 25){
			IQDtoIDR();
		}
		else if(choice1 == 26 && choice2 == 26){
			IQDtoIQD();
		}
		else if(choice1 == 26 && choice2 == 27){
			IQDtoILS();
		}
		else if(choice1 == 26 && choice2 == 28){
			IQDtoJOD();
		}
		else if(choice1 == 26 && choice2 == 29){
			IQDtoKES();
		}
		else if(choice1 == 26 && choice2 == 30){
			IQDtoKWD();
		}
		else if(choice1 == 26 && choice2 == 31){
			IQDtoMYR();
		}
		else if(choice1 == 26 && choice2 == 32){
			IQDtoMXN();
		}
		else if(choice1 == 26 && choice2 == 33){
			IQDtoMAD();
		}
		else if(choice1 == 26 && choice2 == 34){
			IQDtoMMK();
		}
		else if(choice1 == 26 && choice2 == 35){
			IQDtoTWD();
		}
		else if(choice1 == 26 && choice2 == 36){
			IQDtoNZD();
		}
		else if(choice1 == 26 && choice2 == 37){
			IQDtoNOK();
		}
		else if(choice1 == 26 && choice2 == 38){
			IQDtoPHP();
		}
		else if(choice1 == 26 && choice2 == 39){
			IQDtoQAR();
		}
		else if(choice1 == 26 && choice2 == 40){
			IQDtoRON();
		}
		else if(choice1 == 26 && choice2 == 41){
			IQDtoRUB();
		}
		else if(choice1 == 26 && choice2 == 42){
			IQDtoSAR();
		}
		else if(choice1 == 26 && choice2 == 43){
			IQDtoRSD();
		}
		else if(choice1 == 26 && choice2 == 44){
			IQDtoSGD();
		}
		else if(choice1 == 26 && choice2 == 45){
			IQDtoZAR();
		}
		else if(choice1 == 26 && choice2 == 46){
			IQDtoKRW();
		}
		else if(choice1 == 26 && choice2 == 47){
			IQDtoLKR();
		}
		else if(choice1 == 26 && choice2 == 48){
			IQDtoSEK();
		}
		else if(choice1 == 26 && choice2 == 49){
			IQDtoCHF();
		}
		else if(choice1 == 26 && choice2 == 50){
			IQDtoSYP();
		}
		else if(choice1 == 26 && choice2 == 51){
			IQDtoTZS();
		}
		else if(choice1 == 26 && choice2 == 52){
			IQDtoTHB();
		}
		else if(choice1 == 26 && choice2 == 53){
			IQDtoTRY();
		}
		else if(choice1 == 26 && choice2 == 54){
			IQDtoUGX();
		}
		else if(choice1 == 26 && choice2 == 55){
			IQDtoUAH();
		}
		else if(choice1 == 26 && choice2 == 56){
			IQDtoAED();
		}
		else if(choice1 == 26 && choice2 == 57){
			IQDtoVND();
		}
		else if(choice1 == 26 && choice2 == 58){
			IQDtoZMW();
		}
		//---------------------------------------------------//

		//------------Israeli New Shekel Conversion Choices----------//
		if(choice1 == 27 && choice2 == 1){
			ILStoUSD();
		}
		else if(choice1 == 27 && choice2 == 2){
			ILStoEUR();
		}
		else if(choice1 == 27 && choice2 == 3){
			ILStoHKD();
		}
		else if(choice1 == 27 && choice2 == 4){
			ILStoBitcoin();
		}
		else if(choice1 == 27 && choice2 == 5){
			ILStoBitcoinCash();
		}
		else if(choice1 == 27 && choice2 == 6){
			ILStoJPY();
		}
		else if(choice1 == 27 && choice2 == 7){
			ILStoCNY();
		}
		else if(choice1 == 27 && choice2 == 8){
			ILStoINR();
		}
		else if(choice1 == 27 && choice2 == 9){
			ILStoDZD();
		}
		else if(choice1 == 27 && choice2 == 10){
			ILStoARS();
		}
		else if(choice1 == 27 && choice2 == 11){
			ILStoAUD();
		}
		else if(choice1 == 27 && choice2 == 12){
			ILStoBRL();
		}
		else if(choice1 == 27 && choice2 == 13){
			ILStoGBP();
		}
		else if(choice1 == 27 && choice2 == 14){
			ILStoBGN();
		}
		else if(choice1 == 27 && choice2 == 15){
			ILStoKHR();
		}
		else if(choice1 == 27 && choice2 == 16){
			ILStoCAD();
		}
		else if(choice1 == 27 && choice2 == 17){
			ILStoCLP();
		}
		else if(choice1 == 27 && choice2 == 18){
			ILStoCOP();
		}
		else if(choice1 == 27 && choice2 == 19){
			ILStoCRC();
		}
		else if(choice1 == 27 && choice2 == 20){
			ILStoHRK();
		}
		else if(choice1 == 27 && choice2 == 21){
			ILStoCZK();
		}
		else if(choice1 == 27 && choice2 == 22){
			ILStoDKK();
		}
		else if(choice1 == 27 && choice2 == 23){
			ILStoEGP();
		}
		else if(choice1 == 27 && choice2 == 24){
			ILStoISK();
		}
		else if(choice1 == 27 && choice2 == 25){
			ILStoIDR();
		}
		else if(choice1 == 27 && choice2 == 26){
			ILStoIQD();
		}
		else if(choice1 == 27 && choice2 == 27){
			ILStoILS();
		}
		else if(choice1 == 27 && choice2 == 28){
			ILStoJOD();
		}
		else if(choice1 == 27 && choice2 == 29){
			ILStoKES();
		}
		else if(choice1 == 27 && choice2 == 30){
			ILStoKWD();
		}
		else if(choice1 == 27 && choice2 == 31){
			ILStoMYR();
		}
		else if(choice1 == 27 && choice2 == 32){
			ILStoMXN();
		}
		else if(choice1 == 27 && choice2 == 33){
			ILStoMAD();
		}
		else if(choice1 == 27 && choice2 == 34){
			ILStoMMK();
		}
		else if(choice1 == 27 && choice2 == 35){
			ILStoTWD();
		}
		else if(choice1 == 27 && choice2 == 36){
			ILStoNZD();
		}
		else if(choice1 == 27 && choice2 == 37){
			ILStoNOK();
		}
		else if(choice1 == 27 && choice2 == 38){
			ILStoPHP();
		}
		else if(choice1 == 27 && choice2 == 39){
			ILStoQAR();
		}
		else if(choice1 == 27 && choice2 == 40){
			ILStoRON();
		}
		else if(choice1 == 27 && choice2 == 41){
			ILStoRUB();
		}
		else if(choice1 == 27 && choice2 == 42){
			ILStoSAR();
		}
		else if(choice1 == 27 && choice2 == 43){
			ILStoRSD();
		}
		else if(choice1 == 27 && choice2 == 44){
			ILStoSGD();
		}
		else if(choice1 == 27 && choice2 == 45){
			ILStoZAR();
		}
		else if(choice1 == 27 && choice2 == 46){
			ILStoKRW();
		}
		else if(choice1 == 27 && choice2 == 47){
			ILStoLKR();
		}
		else if(choice1 == 27 && choice2 == 48){
			ILStoSEK();
		}
		else if(choice1 == 27 && choice2 == 49){
			ILStoCHF();
		}
		else if(choice1 == 27 && choice2 == 50){
			ILStoSYP();
		}
		else if(choice1 == 27 && choice2 == 51){
			ILStoTZS();
		}
		else if(choice1 == 27 && choice2 == 52){
			ILStoTHB();
		}
		else if(choice1 == 27 && choice2 == 53){
			ILStoTRY();
		}
		else if(choice1 == 27 && choice2 == 54){
			ILStoUGX();
		}
		else if(choice1 == 27 && choice2 == 55){
			ILStoUAH();
		}
		else if(choice1 == 27 && choice2 == 56){
			ILStoAED();
		}
		else if(choice1 == 27 && choice2 == 57){
			ILStoVND();
		}
		else if(choice1 == 27 && choice2 == 58){
			ILStoZMW();
		}
		//------------Jordanian Dinar Conversion Choices----------//
		if(choice1 == 28 && choice2 == 1){
			JODtoUSD();
		}
		else if(choice1 == 28 && choice2 == 2){
			JODtoEUR();
		}
		else if(choice1 == 28 && choice2 == 3){
			JODtoHKD();
		}
		else if(choice1 == 28 && choice2 == 4){
			JODtoBitcoin();
		}
		else if(choice1 == 28 && choice2 == 5){
			JODtoBitcoinCash();
		}
		else if(choice1 == 28 && choice2 == 6){
			JODtoJPY();
		}
		else if(choice1 == 28 && choice2 == 7){
			JODtoCNY();
		}
		else if(choice1 == 28 && choice2 == 8){
			JODtoINR();
		}
		else if(choice1 == 28 && choice2 == 9){
			JODtoDZD();
		}
		else if(choice1 == 28 && choice2 == 10){
			JODtoARS();
		}
		else if(choice1 == 28 && choice2 == 11){
			JODtoAUD();
		}
		else if(choice1 == 28 && choice2 == 12){
			JODtoBRL();
		}
		else if(choice1 == 28 && choice2 == 13){
			JODtoGBP();
		}
		else if(choice1 == 28 && choice2 == 14){
			JODtoBGN();
		}
		else if(choice1 == 28 && choice2 == 15){
			JODtoKHR();
		}
		else if(choice1 == 28 && choice2 == 16){
			JODtoCAD();
		}
		else if(choice1 == 28 && choice2 == 17){
			JODtoCLP();
		}
		else if(choice1 == 28 && choice2 == 18){
			JODtoCOP();
		}
		else if(choice1 == 28 && choice2 == 19){
			JODtoCRC();
		}
		else if(choice1 == 28 && choice2 == 20){
			JODtoHRK();
		}
		else if(choice1 == 28 && choice2 == 21){
			JODtoCZK();
		}
		else if(choice1 == 28 && choice2 == 22){
			JODtoDKK();
		}
		else if(choice1 == 28 && choice2 == 23){
			JODtoEGP();
		}
		else if(choice1 == 28 && choice2 == 24){
			JODtoISK();
		}
		else if(choice1 == 28 && choice2 == 25){
			JODtoIDR();
		}
		else if(choice1 == 28 && choice2 == 26){
			JODtoIQD();
		}
		else if(choice1 == 28 && choice2 == 27){
			JODtoILS();
		}
		else if(choice1 == 28 && choice2 == 28){
			JODtoJOD();
		}
		else if(choice1 == 28 && choice2 == 29){
			JODtoKES();
		}
		else if(choice1 == 28 && choice2 == 30){
			JODtoKWD();
		}
		else if(choice1 == 28 && choice2 == 31){
			JODtoMYR();
		}
		else if(choice1 == 28 && choice2 == 32){
			JODtoMXN();
		}
		else if(choice1 == 28 && choice2 == 33){
			JODtoMAD();
		}
		else if(choice1 == 28 && choice2 == 34){
			JODtoMMK();
		}
		else if(choice1 == 28 && choice2 == 35){
			JODtoTWD();
		}
		else if(choice1 == 28 && choice2 == 36){
			JODtoNZD();
		}
		else if(choice1 == 28 && choice2 == 37){
			JODtoNOK();
		}
		else if(choice1 == 28 && choice2 == 38){
			JODtoPHP();
		}
		else if(choice1 == 28 && choice2 == 39){
			JODtoQAR();
		}
		else if(choice1 == 28 && choice2 == 40){
			JODtoRON();
		}
		else if(choice1 == 28 && choice2 == 41){
			JODtoRUB();
		}
		else if(choice1 == 28 && choice2 == 42){
			JODtoSAR();
		}
		else if(choice1 == 28 && choice2 == 43){
			JODtoRSD();
		}
		else if(choice1 == 28 && choice2 == 44){
			JODtoSGD();
		}
		else if(choice1 == 28 && choice2 == 45){
			JODtoZAR();
		}
		else if(choice1 == 28 && choice2 == 46){
			JODtoKRW();
		}
		else if(choice1 == 28 && choice2 == 47){
			JODtoLKR();
		}
		else if(choice1 == 28 && choice2 == 48){
			JODtoSEK();
		}
		else if(choice1 == 28 && choice2 == 49){
			JODtoCHF();
		}
		else if(choice1 == 28 && choice2 == 50){
			JODtoSYP();
		}
		else if(choice1 == 28 && choice2 == 51){
			JODtoTZS();
		}
		else if(choice1 == 28 && choice2 == 52){
			JODtoTHB();
		}
		else if(choice1 == 28 && choice2 == 53){
			JODtoTRY();
		}
		else if(choice1 == 28 && choice2 == 54){
			JODtoUGX();
		}
		else if(choice1 == 28 && choice2 == 55){
			JODtoUAH();
		}
		else if(choice1 == 28 && choice2 == 56){
			JODtoAED();
		}
		else if(choice1 == 28 && choice2 == 57){
			JODtoVND();
		}
		else if(choice1 == 28 && choice2 == 58){
			JODtoZMW();
		}
		//--------------------------------------------//

		//------------Kenyan Shilling Conversion Choices----------//
		if(choice1 == 29 && choice2 == 1){
			KEStoUSD();
		}
		else if(choice1 == 29 && choice2 == 2){
			KEStoEUR();
		}
		else if(choice1 == 29 && choice2 == 3){
			KEStoHKD();
		}
		else if(choice1 == 29 && choice2 == 4){
			KEStoBitcoin();
		}
		else if(choice1 == 29 && choice2 == 5){
			KEStoBitcoinCash();
		}
		else if(choice1 == 29 && choice2 == 6){
			KEStoJPY();
		}
		else if(choice1 == 29 && choice2 == 7){
			KEStoCNY();
		}
		else if(choice1 == 29 && choice2 == 8){
			KEStoINR();
		}
		else if(choice1 == 29 && choice2 == 9){
			KEStoDZD();
		}
		else if(choice1 == 29 && choice2 == 10){
			KEStoARS();
		}
		else if(choice1 == 29 && choice2 == 11){
			KEStoAUD();
		}
		else if(choice1 == 29 && choice2 == 12){
			KEStoBRL();
		}
		else if(choice1 == 29 && choice2 == 13){
			KEStoGBP();
		}
		else if(choice1 == 29 && choice2 == 14){
			KEStoBGN();
		}
		else if(choice1 == 29 && choice2 == 15){
			KEStoKHR();
		}
		else if(choice1 == 29 && choice2 == 16){
			KEStoCAD();
		}
		else if(choice1 == 29 && choice2 == 17){
			KEStoCLP();
		}
		else if(choice1 == 29 && choice2 == 18){
			KEStoCOP();
		}
		else if(choice1 == 29 && choice2 == 19){
			KEStoCRC();
		}
		else if(choice1 == 29 && choice2 == 20){
			KEStoHRK();
		}
		else if(choice1 == 29 && choice2 == 21){
			KEStoCZK();
		}
		else if(choice1 == 29 && choice2 == 22){
			KEStoDKK();
		}
		else if(choice1 == 29 && choice2 == 23){
			KEStoEGP();
		}
		else if(choice1 == 29 && choice2 == 24){
			KEStoISK();
		}
		else if(choice1 == 29 && choice2 == 25){
			KEStoIDR();
		}
		else if(choice1 == 29 && choice2 == 26){
			KEStoIQD();
		}
		else if(choice1 == 29 && choice2 == 27){
			KEStoILS();
		}
		else if(choice1 == 29 && choice2 == 28){
			KEStoJOD();
		}
		else if(choice1 == 29 && choice2 == 29){
			KEStoKES();
		}
		else if(choice1 == 29 && choice2 == 30){
			KEStoKWD();
		}
		else if(choice1 == 29 && choice2 == 31){
			KEStoMYR();
		}
		else if(choice1 == 29 && choice2 == 32){
			KEStoMXN();
		}
		else if(choice1 == 29 && choice2 == 33){
			KEStoMAD();
		}
		else if(choice1 == 29 && choice2 == 34){
			KEStoMMK();
		}
		else if(choice1 == 29 && choice2 == 35){
			KEStoTWD();
		}
		else if(choice1 == 29 && choice2 == 36){
			KEStoNZD();
		}
		else if(choice1 == 29 && choice2 == 37){
			KEStoNOK();
		}
		else if(choice1 == 29 && choice2 == 38){
			KEStoPHP();
		}
		else if(choice1 == 29 && choice2 == 39){
			KEStoQAR();
		}
		else if(choice1 == 29 && choice2 == 40){
			KEStoRON();
		}
		else if(choice1 == 29 && choice2 == 41){
			KEStoRUB();
		}
		else if(choice1 == 29 && choice2 == 42){
			KEStoSAR();
		}
		else if(choice1 == 29 && choice2 == 43){
			KEStoRSD();
		}
		else if(choice1 == 29 && choice2 == 44){
			KEStoSGD();
		}
		else if(choice1 == 29 && choice2 == 45){
			KEStoZAR();
		}
		else if(choice1 == 29 && choice2 == 46){
			KEStoKRW();
		}
		else if(choice1 == 29 && choice2 == 47){
			KEStoLKR();
		}
		else if(choice1 == 29 && choice2 == 48){
			KEStoSEK();
		}
		else if(choice1 == 29 && choice2 == 49){
			KEStoCHF();
		}
		else if(choice1 == 29 && choice2 == 50){
			KEStoSYP();
		}
		else if(choice1 == 29 && choice2 == 51){
			KEStoTZS();
		}
		else if(choice1 == 29 && choice2 == 52){
			KEStoTHB();
		}
		else if(choice1 == 29 && choice2 == 53){
			KEStoTRY();
		}
		else if(choice1 == 29 && choice2 == 54){
			KEStoUGX();
		}
		else if(choice1 == 29 && choice2 == 55){
			KEStoUAH();
		}
		else if(choice1 == 29 && choice2 == 56){
			KEStoAED();
		}
		else if(choice1 == 29 && choice2 == 57){
			KEStoVND();
		}
		else if(choice1 == 29 && choice2 == 58){
			KEStoZMW();
		}
		//--------------------------------------------//

		//------------Kuwaiti Dinar Conversion Choices----------//
		if(choice1 == 30 && choice2 == 1){
			KWDtoUSD();
		}
		else if(choice1 == 30 && choice2 == 2){
			KWDtoEUR();
		}
		else if(choice1 == 30 && choice2 == 3){
			KWDtoHKD();
		}
		else if(choice1 == 30 && choice2 == 4){
			KWDtoBitcoin();
		}
		else if(choice1 == 30 && choice2 == 5){
			KWDtoBitcoinCash();
		}
		else if(choice1 == 30 && choice2 == 6){
			KWDtoJPY();
		}
		else if(choice1 == 30 && choice2 == 7){
			KWDtoCNY();
		}
		else if(choice1 == 30 && choice2 == 8){
			KWDtoINR();
		}
		else if(choice1 == 30 && choice2 == 9){
			KWDtoDZD();
		}
		else if(choice1 == 30 && choice2 == 10){
			KWDtoARS();
		}
		else if(choice1 == 30 && choice2 == 11){
			KWDtoAUD();
		}
		else if(choice1 == 30 && choice2 == 12){
			KWDtoBRL();
		}
		else if(choice1 == 30 && choice2 == 13){
			KWDtoGBP();
		}
		else if(choice1 == 30 && choice2 == 14){
			KWDtoBGN();
		}
		else if(choice1 == 30 && choice2 == 15){
			KWDtoKHR();
		}
		else if(choice1 == 30 && choice2 == 16){
			KWDtoCAD();
		}
		else if(choice1 == 30 && choice2 == 17){
			KWDtoCLP();
		}
		else if(choice1 == 30 && choice2 == 18){
			KWDtoCOP();
		}
		else if(choice1 == 30 && choice2 == 19){
			KWDtoCRC();
		}
		else if(choice1 == 30 && choice2 == 20){
			KWDtoHRK();
		}
		else if(choice1 == 30 && choice2 == 21){
			KWDtoCZK();
		}
		else if(choice1 == 30 && choice2 == 22){
			KWDtoDKK();
		}
		else if(choice1 == 30 && choice2 == 23){
			KWDtoEGP();
		}
		else if(choice1 == 30 && choice2 == 24){
			KWDtoISK();
		}
		else if(choice1 == 30 && choice2 == 25){
			KWDtoIDR();
		}
		else if(choice1 == 30 && choice2 == 26){
			KWDtoIQD();
		}
		else if(choice1 == 30 && choice2 == 27){
			KWDtoILS();
		}
		else if(choice1 == 30 && choice2 == 28){
			KWDtoJOD();
		}
		else if(choice1 == 30 && choice2 == 29){
			KWDtoKES();
		}
		else if(choice1 == 30 && choice2 == 30){
			KWDtoKWD();
		}
		else if(choice1 == 30 && choice2 == 31){
			KWDtoMYR();
		}
		else if(choice1 == 30 && choice2 == 32){
			KWDtoMXN();
		}
		else if(choice1 == 30 && choice2 == 33){
			KWDtoMAD();
		}
		else if(choice1 == 30 && choice2 == 34){
			KWDtoMMK();
		}
		else if(choice1 == 30 && choice2 == 35){
			KWDtoTWD();
		}
		else if(choice1 == 30 && choice2 == 36){
			KWDtoNZD();
		}
		else if(choice1 == 30 && choice2 == 37){
			KWDtoNOK();
		}
		else if(choice1 == 30 && choice2 == 38){
			KWDtoPHP();
		}
		else if(choice1 == 30 && choice2 == 39){
			KWDtoQAR();
		}
		else if(choice1 == 30 && choice2 == 40){
			KWDtoRON();
		}
		else if(choice1 == 30 && choice2 == 41){
			KWDtoRUB();
		}
		else if(choice1 == 30 && choice2 == 42){
			KWDtoSAR();
		}
		else if(choice1 == 30 && choice2 == 43){
			KWDtoRSD();
		}
		else if(choice1 == 30 && choice2 == 44){
			KWDtoSGD();
		}
		else if(choice1 == 30 && choice2 == 45){
			KWDtoZAR();
		}
		else if(choice1 == 30 && choice2 == 46){
			KWDtoKRW();
		}
		else if(choice1 == 30 && choice2 == 47){
			KWDtoLKR();
		}
		else if(choice1 == 30 && choice2 == 48){
			KWDtoSEK();
		}
		else if(choice1 == 30 && choice2 == 49){
			KWDtoCHF();
		}
		else if(choice1 == 30 && choice2 == 50){
			KWDtoSYP();
		}
		else if(choice1 == 30 && choice2 == 51){
			KWDtoTZS();
		}
		else if(choice1 == 30 && choice2 == 52){
			KWDtoTHB();
		}
		else if(choice1 == 30 && choice2 == 53){
			KWDtoTRY();
		}
		else if(choice1 == 30 && choice2 == 54){
			KWDtoUGX();
		}
		else if(choice1 == 30 && choice2 == 55){
			KWDtoUAH();
		}
		else if(choice1 == 30 && choice2 == 56){
			KWDtoAED();
		}
		else if(choice1 == 30 && choice2 == 57){
			KWDtoVND();
		}
		else if(choice1 == 30 && choice2 == 58){
			KWDtoZMW();
		}
		//--------------------------------------------//

		//------------Malaysian Ringgit Conversion Choices----------//
		if(choice1 == 31 && choice2 == 1){
			MYRtoUSD();
		}
		else if(choice1 == 31 && choice2 == 2){
			MYRtoEUR();
		}
		else if(choice1 == 31 && choice2 == 3){
			MYRtoHKD();
		}
		else if(choice1 == 31 && choice2 == 4){
			MYRtoBitcoin();
		}
		else if(choice1 == 31 && choice2 == 5){
			MYRtoBitcoinCash();
		}
		else if(choice1 == 31 && choice2 == 6){
			MYRtoJPY();
		}
		else if(choice1 == 31 && choice2 == 7){
			MYRtoCNY();
		}
		else if(choice1 == 31 && choice2 == 8){
			MYRtoINR();
		}
		else if(choice1 == 31 && choice2 == 9){
			MYRtoDZD();
		}
		else if(choice1 == 31 && choice2 == 10){
			MYRtoARS();
		}
		else if(choice1 == 31 && choice2 == 11){
			MYRtoAUD();
		}
		else if(choice1 == 31 && choice2 == 12){
			MYRtoBRL();
		}
		else if(choice1 == 31 && choice2 == 13){
			MYRtoGBP();
		}
		else if(choice1 == 31 && choice2 == 14){
			MYRtoBGN();
		}
		else if(choice1 == 31 && choice2 == 15){
			MYRtoKHR();
		}
		else if(choice1 == 31 && choice2 == 16){
			MYRtoCAD();
		}
		else if(choice1 == 31 && choice2 == 17){
			MYRtoCLP();
		}
		else if(choice1 == 31 && choice2 == 18){
			MYRtoCOP();
		}
		else if(choice1 == 31 && choice2 == 19){
			MYRtoCRC();
		}
		else if(choice1 == 31 && choice2 == 20){
			MYRtoHRK();
		}
		else if(choice1 == 31 && choice2 == 21){
			MYRtoCZK();
		}
		else if(choice1 == 31 && choice2 == 22){
			MYRtoDKK();
		}
		else if(choice1 == 31 && choice2 == 23){
			MYRtoEGP();
		}
		else if(choice1 == 31 && choice2 == 24){
			MYRtoISK();
		}
		else if(choice1 == 31 && choice2 == 25){
			MYRtoIDR();
		}
		else if(choice1 == 31 && choice2 == 26){
			MYRtoIQD();
		}
		else if(choice1 == 31 && choice2 == 27){
			MYRtoILS();
		}
		else if(choice1 == 31 && choice2 == 28){
			MYRtoJOD();
		}
		else if(choice1 == 31 && choice2 == 29){
			MYRtoKES();
		}
		else if(choice1 == 31 && choice2 == 30){
			MYRtoKWD();
		}
		else if(choice1 == 31 && choice2 == 31){
			MYRtoMYR();
		}
		else if(choice1 == 31 && choice2 == 32){
			MYRtoMXN();
		}
		else if(choice1 == 31 && choice2 == 33){
			MYRtoMAD();
		}
		else if(choice1 == 31 && choice2 == 34){
			MYRtoMMK();
		}
		else if(choice1 == 31 && choice2 == 35){
			MYRtoTWD();
		}
		else if(choice1 == 31 && choice2 == 36){
			MYRtoNZD();
		}
		else if(choice1 == 31 && choice2 == 37){
			MYRtoNOK();
		}
		else if(choice1 == 31 && choice2 == 38){
			MYRtoPHP();
		}
		else if(choice1 == 31 && choice2 == 39){
			MYRtoQAR();
		}
		else if(choice1 == 31 && choice2 == 40){
			MYRtoRON();
		}
		else if(choice1 == 31 && choice2 == 41){
			MYRtoRUB();
		}
		else if(choice1 == 31 && choice2 == 42){
			MYRtoSAR();
		}
		else if(choice1 == 31 && choice2 == 43){
			MYRtoRSD();
		}
		else if(choice1 == 31 && choice2 == 44){
			MYRtoSGD();
		}
		else if(choice1 == 31 && choice2 == 45){
			MYRtoZAR();
		}
		else if(choice1 == 31 && choice2 == 46){
			MYRtoKRW();
		}
		else if(choice1 == 31 && choice2 == 47){
			MYRtoLKR();
		}
		else if(choice1 == 31 && choice2 == 48){
			MYRtoSEK();
		}
		else if(choice1 == 31 && choice2 == 49){
			MYRtoCHF();
		}
		else if(choice1 == 31 && choice2 == 50){
			MYRtoSYP();
		}
		else if(choice1 == 31 && choice2 == 51){
			MYRtoTZS();
		}
		else if(choice1 == 31 && choice2 == 52){
			MYRtoTHB();
		}
		else if(choice1 == 31 && choice2 == 53){
			MYRtoTRY();
		}
		else if(choice1 == 31 && choice2 == 54){
			MYRtoUGX();
		}
		else if(choice1 == 31 && choice2 == 55){
			MYRtoUAH();
		}
		else if(choice1 == 31 && choice2 == 56){
			MYRtoAED();
		}
		else if(choice1 == 31 && choice2 == 57){
			MYRtoVND();
		}
		else if(choice1 == 31 && choice2 == 58){
			MYRtoZMW();
		}
		//------------Mexican Peso Conversion Choices----------//
		if(choice1 == 32 && choice2 == 1){
			MXNtoUSD();
		}
		else if(choice1 == 32 && choice2 == 2){
			MXNtoEUR();
		}
		else if(choice1 == 32 && choice2 == 3){
			MXNtoHKD();
		}
		else if(choice1 == 32 && choice2 == 4){
			MXNtoBitcoin();
		}
		else if(choice1 == 32 && choice2 == 5){
			MXNtoBitcoinCash();
		}
		else if(choice1 == 32 && choice2 == 6){
			MXNtoJPY();
		}
		else if(choice1 == 32 && choice2 == 7){
			MXNtoCNY();
		}
		else if(choice1 == 32 && choice2 == 8){
			MXNtoINR();
		}
		else if(choice1 == 32 && choice2 == 9){
			MXNtoDZD();
		}
		else if(choice1 == 32 && choice2 == 10){
			MXNtoARS();
		}
		else if(choice1 == 32 && choice2 == 11){
			MXNtoAUD();
		}
		else if(choice1 == 32 && choice2 == 12){
			MXNtoBRL();
		}
		else if(choice1 == 32 && choice2 == 13){
			MXNtoGBP();
		}
		else if(choice1 == 32 && choice2 == 14){
			MXNtoBGN();
		}
		else if(choice1 == 32 && choice2 == 15){
			MXNtoKHR();
		}
		else if(choice1 == 32 && choice2 == 16){
			MXNtoCAD();
		}
		else if(choice1 == 32 && choice2 == 17){
			MXNtoCLP();
		}
		else if(choice1 == 32 && choice2 == 18){
			MXNtoCOP();
		}
		else if(choice1 == 32 && choice2 == 19){
			MXNtoCRC();
		}
		else if(choice1 == 32 && choice2 == 20){
			MXNtoHRK();
		}
		else if(choice1 == 32 && choice2 == 21){
			MXNtoCZK();
		}
		else if(choice1 == 32 && choice2 == 32){
			MXNtoDKK();
		}
		else if(choice1 == 32 && choice2 == 23){
			MXNtoEGP();
		}
		else if(choice1 == 32 && choice2 == 24){
			MXNtoISK();
		}
		else if(choice1 == 32 && choice2 == 25){
			MXNtoIDR();
		}
		else if(choice1 == 32 && choice2 == 26){
			MXNtoIQD();
		}
		else if(choice1 == 32 && choice2 == 27){
			MXNtoILS();
		}
		else if(choice1 == 32 && choice2 == 28){
			MXNtoJOD();
		}
		else if(choice1 == 32 && choice2 == 29){
			MXNtoKES();
		}
		else if(choice1 == 32 && choice2 == 30){
			MXNtoKWD();
		}
		else if(choice1 == 32 && choice2 == 31){
			MXNtoMYR();
		}
		else if(choice1 == 32 && choice2 == 32){
			MXNtoMXN();
		}
		else if(choice1 == 32 && choice2 == 33){
			MXNtoMAD();
		}
		else if(choice1 == 32 && choice2 == 34){
			MXNtoMMK();
		}
		else if(choice1 == 32 && choice2 == 35){
			MXNtoTWD();
		}
		else if(choice1 == 32 && choice2 == 36){
			MXNtoNZD();
		}
		else if(choice1 == 32 && choice2 == 37){
			MXNtoNOK();
		}
		else if(choice1 == 32 && choice2 == 38){
			MXNtoPHP();
		}
		else if(choice1 == 32 && choice2 == 39){
			MXNtoQAR();
		}
		else if(choice1 == 32 && choice2 == 40){
			MXNtoRON();
		}
		else if(choice1 == 32 && choice2 == 41){
			MXNtoRUB();
		}
		else if(choice1 == 32 && choice2 == 42){
			MXNtoSAR();
		}
		else if(choice1 == 32 && choice2 == 43){
			MXNtoRSD();
		}
		else if(choice1 == 32 && choice2 == 44){
			MXNtoSGD();
		}
		else if(choice1 == 32 && choice2 == 45){
			MXNtoZAR();
		}
		else if(choice1 == 32 && choice2 == 46){
			MXNtoKRW();
		}
		else if(choice1 == 32 && choice2 == 47){
			MXNtoLKR();
		}
		else if(choice1 == 32 && choice2 == 48){
			MXNtoSEK();
		}
		else if(choice1 == 32 && choice2 == 49){
			MXNtoCHF();
		}
		else if(choice1 == 32 && choice2 == 50){
			MXNtoSYP();
		}
		else if(choice1 == 32 && choice2 == 51){
			MXNtoTZS();
		}
		else if(choice1 == 32 && choice2 == 52){
			MXNtoTHB();
		}
		else if(choice1 == 32 && choice2 == 53){
			MXNtoTRY();
		}
		else if(choice1 == 32 && choice2 == 54){
			MXNtoUGX();
		}
		else if(choice1 == 32 && choice2 == 55){
			MXNtoUAH();
		}
		else if(choice1 == 32 && choice2 == 56){
			MXNtoAED();
		}
		else if(choice1 == 32 && choice2 == 57){
			MXNtoVND();
		}
		else if(choice1 == 32 && choice2 == 58){
			MXNtoZMW();
		}
		//--------------------------------------------//

		//------------Moroccan Dirham Conversion Choices----------//
		if(choice1 == 33 && choice2 == 1){
			MADtoUSD();
		}
		else if(choice1 == 33 && choice2 == 2){
			MADtoEUR();
		}
		else if(choice1 == 33 && choice2 == 3){
			MADtoHKD();
		}
		else if(choice1 == 33 && choice2 == 4){
			MADtoBitcoin();
		}
		else if(choice1 == 33 && choice2 == 5){
			MADtoBitcoinCash();
		}
		else if(choice1 == 33 && choice2 == 6){
			MADtoJPY();
		}
		else if(choice1 == 33 && choice2 == 7){
			MADtoCNY();
		}
		else if(choice1 == 33 && choice2 == 8){
			MADtoINR();
		}
		else if(choice1 == 33 && choice2 == 9){
			MADtoDZD();
		}
		else if(choice1 == 33 && choice2 == 10){
			MADtoARS();
		}
		else if(choice1 == 33 && choice2 == 11){
			MADtoAUD();
		}
		else if(choice1 == 33 && choice2 == 12){
			MADtoBRL();
		}
		else if(choice1 == 33 && choice2 == 13){
			MADtoGBP();
		}
		else if(choice1 == 33 && choice2 == 14){
			MADtoBGN();
		}
		else if(choice1 == 33 && choice2 == 15){
			MADtoKHR();
		}
		else if(choice1 == 33 && choice2 == 16){
			MADtoCAD();
		}
		else if(choice1 == 33 && choice2 == 17){
			MADtoCLP();
		}
		else if(choice1 == 33 && choice2 == 18){
			MADtoCOP();
		}
		else if(choice1 == 33 && choice2 == 19){
			MADtoCRC();
		}
		else if(choice1 == 33 && choice2 == 20){
			MADtoHRK();
		}
		else if(choice1 == 33 && choice2 == 21){
			MADtoCZK();
		}
		else if(choice1 == 33 && choice2 == 22){
			MADtoDKK();
		}
		else if(choice1 == 33 && choice2 == 23){
			MADtoEGP();
		}
		else if(choice1 == 33 && choice2 == 24){
			MADtoISK();
		}
		else if(choice1 == 33 && choice2 == 25){
			MADtoIDR();
		}
		else if(choice1 == 33 && choice2 == 26){
			MADtoIQD();
		}
		else if(choice1 == 33 && choice2 == 27){
			MADtoILS();
		}
		else if(choice1 == 33 && choice2 == 28){
			MADtoJOD();
		}
		else if(choice1 == 33 && choice2 == 29){
			MADtoKES();
		}
		else if(choice1 == 33 && choice2 == 30){
			MADtoKWD();
		}
		else if(choice1 == 33 && choice2 == 31){
			MADtoMYR();
		}
		else if(choice1 == 33 && choice2 == 32){
			MADtoMXN();
		}
		else if(choice1 == 33 && choice2 == 33){
			MADtoMAD();
		}
		else if(choice1 == 33 && choice2 == 34){
			MADtoMMK();
		}
		else if(choice1 == 33 && choice2 == 35){
			MADtoTWD();
		}
		else if(choice1 == 33 && choice2 == 36){
			MADtoNZD();
		}
		else if(choice1 == 33 && choice2 == 37){
			MADtoNOK();
		}
		else if(choice1 == 33 && choice2 == 38){
			MADtoPHP();
		}
		else if(choice1 == 33 && choice2 == 39){
			MADtoQAR();
		}
		else if(choice1 == 33 && choice2 == 40){
			MADtoRON();
		}
		else if(choice1 == 33 && choice2 == 41){
			MADtoRUB();
		}
		else if(choice1 == 33 && choice2 == 42){
			MADtoSAR();
		}
		else if(choice1 == 33 && choice2 == 43){
			MADtoRSD();
		}
		else if(choice1 == 33 && choice2 == 44){
			MADtoSGD();
		}
		else if(choice1 == 33 && choice2 == 45){
			MADtoZAR();
		}
		else if(choice1 == 33 && choice2 == 46){
			MADtoKRW();
		}
		else if(choice1 == 33 && choice2 == 47){
			MADtoLKR();
		}
		else if(choice1 == 33 && choice2 == 48){
			MADtoSEK();
		}
		else if(choice1 == 33 && choice2 == 49){
			MADtoCHF();
		}
		else if(choice1 == 33 && choice2 == 50){
			MADtoSYP();
		}
		else if(choice1 == 33 && choice2 == 51){
			MADtoTZS();
		}
		else if(choice1 == 33 && choice2 == 52){
			MADtoTHB();
		}
		else if(choice1 == 33 && choice2 == 53){
			MADtoTRY();
		}
		else if(choice1 == 33 && choice2 == 54){
			MADtoUGX();
		}
		else if(choice1 == 33 && choice2 == 55){
			MADtoUAH();
		}
		else if(choice1 == 33 && choice2 == 56){
			MADtoAED();
		}
		else if(choice1 == 33 && choice2 == 57){
			MADtoVND();
		}
		else if(choice1 == 33 && choice2 == 58){
			MADtoZMW();
		}
		//------------Myanmar Kyat Conversion Choices----------//
		if(choice1 == 34 && choice2 == 1){
			MMKtoUSD();
		}
		else if(choice1 == 34 && choice2 == 2){
			MMKtoEUR();
		}
		else if(choice1 == 34 && choice2 == 3){
			MMKtoHKD();
		}
		else if(choice1 == 34 && choice2 == 4){
			MMKtoBitcoin();
		}
		else if(choice1 == 34 && choice2 == 5){
			MMKtoBitcoinCash();
		}
		else if(choice1 == 34 && choice2 == 6){
			MMKtoJPY();
		}
		else if(choice1 == 34 && choice2 == 7){
			MMKtoCNY();
		}
		else if(choice1 == 34 && choice2 == 8){
			MMKtoINR();
		}
		else if(choice1 == 34 && choice2 == 9){
			MMKtoDZD();
		}
		else if(choice1 == 34 && choice2 == 10){
			MMKtoARS();
		}
		else if(choice1 == 34 && choice2 == 11){
			MMKtoAUD();
		}
		else if(choice1 == 34 && choice2 == 12){
			MMKtoBRL();
		}
		else if(choice1 == 34 && choice2 == 13){
			MMKtoGBP();
		}
		else if(choice1 == 34 && choice2 == 14){
			MMKtoBGN();
		}
		else if(choice1 == 34 && choice2 == 15){
			MMKtoKHR();
		}
		else if(choice1 == 34 && choice2 == 16){
			MMKtoCAD();
		}
		else if(choice1 == 34 && choice2 == 17){
			MMKtoCLP();
		}
		else if(choice1 == 34 && choice2 == 18){
			MMKtoCOP();
		}
		else if(choice1 == 34 && choice2 == 19){
			MMKtoCRC();
		}
		else if(choice1 == 34 && choice2 == 20){
			MMKtoHRK();
		}
		else if(choice1 == 34 && choice2 == 21){
			MMKtoCZK();
		}
		else if(choice1 == 34 && choice2 == 22){
			MMKtoDKK();
		}
		else if(choice1 == 34 && choice2 == 23){
			MMKtoEGP();
		}
		else if(choice1 == 34 && choice2 == 24){
			MMKtoISK();
		}
		else if(choice1 == 34 && choice2 == 25){
			MMKtoIDR();
		}
		else if(choice1 == 34 && choice2 == 26){
			MMKtoIQD();
		}
		else if(choice1 == 34 && choice2 == 27){
			MMKtoILS();
		}
		else if(choice1 == 34 && choice2 == 28){
			MMKtoJOD();
		}
		else if(choice1 == 34 && choice2 == 29){
			MMKtoKES();
		}
		else if(choice1 == 34 && choice2 == 30){
			MMKtoKWD();
		}
		else if(choice1 == 34 && choice2 == 31){
			MMKtoMYR();
		}
		else if(choice1 == 34 && choice2 == 32){
			MMKtoMXN();
		}
		else if(choice1 == 34 && choice2 == 33){
			MMKtoMAD();
		}
		else if(choice1 == 34 && choice2 == 34){
			MMKtoMMK();
		}
		else if(choice1 == 34 && choice2 == 35){
			MMKtoTWD();
		}
		else if(choice1 == 34 && choice2 == 36){
			MMKtoNZD();
		}
		else if(choice1 == 34 && choice2 == 37){
			MMKtoNOK();
		}
		else if(choice1 == 34 && choice2 == 38){
			MMKtoPHP();
		}
		else if(choice1 == 34 && choice2 == 39){
			MMKtoQAR();
		}
		else if(choice1 == 34 && choice2 == 40){
			MMKtoRON();
		}
		else if(choice1 == 34 && choice2 == 41){
			MMKtoRUB();
		}
		else if(choice1 == 34 && choice2 == 42){
			MMKtoSAR();
		}
		else if(choice1 == 34 && choice2 == 43){
			MMKtoRSD();
		}
		else if(choice1 == 34 && choice2 == 44){
			MMKtoSGD();
		}
		else if(choice1 == 34 && choice2 == 45){
			MMKtoZAR();
		}
		else if(choice1 == 34 && choice2 == 46){
			MMKtoKRW();
		}
		else if(choice1 == 34 && choice2 == 47){
			MMKtoLKR();
		}
		else if(choice1 == 34 && choice2 == 48){
			MMKtoSEK();
		}
		else if(choice1 == 34 && choice2 == 49){
			MMKtoCHF();
		}
		else if(choice1 == 34 && choice2 == 50){
			MMKtoSYP();
		}
		else if(choice1 == 34 && choice2 == 51){
			MMKtoTZS();
		}
		else if(choice1 == 34 && choice2 == 52){
			MMKtoTHB();
		}
		else if(choice1 == 34 && choice2 == 53){
			MMKtoTRY();
		}
		else if(choice1 == 34 && choice2 == 54){
			MMKtoUGX();
		}
		else if(choice1 == 34 && choice2 == 55){
			MMKtoUAH();
		}
		else if(choice1 == 34 && choice2 == 56){
			MMKtoAED();
		}
		else if(choice1 == 34 && choice2 == 57){
			MMKtoVND();
		}
		else if(choice1 == 34 && choice2 == 58){
			MMKtoZMW();
		}
		//------------New Taiwan Dollar Conversion Choices----------//
		if(choice1 == 35 && choice2 == 1){
			TWDtoUSD();
		}
		else if(choice1 == 35 && choice2 == 2){
			TWDtoEUR();
		}
		else if(choice1 == 35 && choice2 == 3){
			TWDtoHKD();
		}
		else if(choice1 == 35 && choice2 == 4){
			TWDtoBitcoin();
		}
		else if(choice1 == 35 && choice2 == 5){
			TWDtoBitcoinCash();
		}
		else if(choice1 == 35 && choice2 == 6){
			TWDtoJPY();
		}
		else if(choice1 == 35 && choice2 == 7){
			TWDtoCNY();
		}
		else if(choice1 == 35 && choice2 == 8){
			TWDtoINR();
		}
		else if(choice1 == 35 && choice2 == 9){
			TWDtoDZD();
		}
		else if(choice1 == 35 && choice2 == 10){
			TWDtoARS();
		}
		else if(choice1 == 35 && choice2 == 11){
			TWDtoAUD();
		}
		else if(choice1 == 35 && choice2 == 12){
			TWDtoBRL();
		}
		else if(choice1 == 35 && choice2 == 13){
			TWDtoGBP();
		}
		else if(choice1 == 35 && choice2 == 14){
			TWDtoBGN();
		}
		else if(choice1 == 35 && choice2 == 15){
			TWDtoKHR();
		}
		else if(choice1 == 35 && choice2 == 16){
			TWDtoCAD();
		}
		else if(choice1 == 35 && choice2 == 17){
			TWDtoCLP();
		}
		else if(choice1 == 35 && choice2 == 18){
			TWDtoCOP();
		}
		else if(choice1 == 35 && choice2 == 19){
			TWDtoCRC();
		}
		else if(choice1 == 35 && choice2 == 20){
			TWDtoHRK();
		}
		else if(choice1 == 35 && choice2 == 21){
			TWDtoCZK();
		}
		else if(choice1 == 35 && choice2 == 22){
			TWDtoDKK();
		}
		else if(choice1 == 35 && choice2 == 23){
			TWDtoEGP();
		}
		else if(choice1 == 35 && choice2 == 24){
			TWDtoISK();
		}
		else if(choice1 == 35 && choice2 == 25){
			TWDtoIDR();
		}
		else if(choice1 == 35 && choice2 == 26){
			TWDtoIQD();
		}
		else if(choice1 == 35 && choice2 == 27){
			TWDtoILS();
		}
		else if(choice1 == 35 && choice2 == 28){
			TWDtoJOD();
		}
		else if(choice1 == 35 && choice2 == 29){
			TWDtoKES();
		}
		else if(choice1 == 35 && choice2 == 30){
			TWDtoKWD();
		}
		else if(choice1 == 35 && choice2 == 31){
			TWDtoMYR();
		}
		else if(choice1 == 35 && choice2 == 32){
			TWDtoMXN();
		}
		else if(choice1 == 35 && choice2 == 33){
			TWDtoMAD();
		}
		else if(choice1 == 35 && choice2 == 34){
			TWDtoMMK();
		}
		else if(choice1 == 35 && choice2 == 35){
			TWDtoTWD();
		}
		else if(choice1 == 35 && choice2 == 36){
			TWDtoNZD();
		}
		else if(choice1 == 35 && choice2 == 37){
			TWDtoNOK();
		}
		else if(choice1 == 35 && choice2 == 38){
			TWDtoPHP();
		}
		else if(choice1 == 35 && choice2 == 39){
			TWDtoQAR();
		}
		else if(choice1 == 35 && choice2 == 40){
			TWDtoRON();
		}
		else if(choice1 == 35 && choice2 == 41){
			TWDtoRUB();
		}
		else if(choice1 == 35 && choice2 == 42){
			TWDtoSAR();
		}
		else if(choice1 == 35 && choice2 == 43){
			TWDtoRSD();
		}
		else if(choice1 == 35 && choice2 == 44){
			TWDtoSGD();
		}
		else if(choice1 == 35 && choice2 == 45){
			TWDtoZAR();
		}
		else if(choice1 == 35 && choice2 == 46){
			TWDtoKRW();
		}
		else if(choice1 == 35 && choice2 == 47){
			TWDtoLKR();
		}
		else if(choice1 == 35 && choice2 == 48){
			TWDtoSEK();
		}
		else if(choice1 == 35 && choice2 == 49){
			TWDtoCHF();
		}
		else if(choice1 == 35 && choice2 == 50){
			TWDtoSYP();
		}
		else if(choice1 == 35 && choice2 == 51){
			TWDtoTZS();
		}
		else if(choice1 == 35 && choice2 == 52){
			TWDtoTHB();
		}
		else if(choice1 == 35 && choice2 == 53){
			TWDtoTRY();
		}
		else if(choice1 == 35 && choice2 == 54){
			TWDtoUGX();
		}
		else if(choice1 == 35 && choice2 == 55){
			TWDtoUAH();
		}
		else if(choice1 == 35 && choice2 == 56){
			TWDtoAED();
		}
		else if(choice1 == 35 && choice2 == 57){
			TWDtoVND();
		}
		else if(choice1 == 35 && choice2 == 58){
			TWDtoZMW();
		}
		//------------New Zealand Dollar Conversion Choices----------//
		if(choice1 == 36 && choice2 == 1){
			NZDtoUSD();
		}
		else if(choice1 == 36 && choice2 == 2){
			NZDtoEUR();
		}
		else if(choice1 == 36 && choice2 == 3){
			NZDtoHKD();
		}
		else if(choice1 == 36 && choice2 == 4){
			NZDtoBitcoin();
		}
		else if(choice1 == 36 && choice2 == 5){
			NZDtoBitcoinCash();
		}
		else if(choice1 == 36 && choice2 == 6){
			NZDtoJPY();
		}
		else if(choice1 == 36 && choice2 == 7){
			NZDtoCNY();
		}
		else if(choice1 == 36 && choice2 == 8){
			NZDtoINR();
		}
		else if(choice1 == 36 && choice2 == 9){
			NZDtoDZD();
		}
		else if(choice1 == 36 && choice2 == 10){
			NZDtoARS();
		}
		else if(choice1 == 36 && choice2 == 11){
			NZDtoAUD();
		}
		else if(choice1 == 36 && choice2 == 12){
			NZDtoBRL();
		}
		else if(choice1 == 36 && choice2 == 13){
			NZDtoGBP();
		}
		else if(choice1 == 36 && choice2 == 14){
			NZDtoBGN();
		}
		else if(choice1 == 36 && choice2 == 15){
			NZDtoKHR();
		}
		else if(choice1 == 36 && choice2 == 16){
			NZDtoCAD();
		}
		else if(choice1 == 36 && choice2 == 17){
			NZDtoCLP();
		}
		else if(choice1 == 36 && choice2 == 18){
			NZDtoCOP();
		}
		else if(choice1 == 36 && choice2 == 19){
			NZDtoCRC();
		}
		else if(choice1 == 36 && choice2 == 20){
			NZDtoHRK();
		}
		else if(choice1 == 36 && choice2 == 21){
			NZDtoCZK();
		}
		else if(choice1 == 36 && choice2 == 22){
			NZDtoDKK();
		}
		else if(choice1 == 36 && choice2 == 23){
			NZDtoEGP();
		}
		else if(choice1 == 36 && choice2 == 24){
			NZDtoISK();
		}
		else if(choice1 == 36 && choice2 == 25){
			NZDtoIDR();
		}
		else if(choice1 == 36 && choice2 == 26){
			NZDtoIQD();
		}
		else if(choice1 == 36 && choice2 == 27){
			NZDtoILS();
		}
		else if(choice1 == 36 && choice2 == 28){
			NZDtoJOD();
		}
		else if(choice1 == 36 && choice2 == 29){
			NZDtoKES();
		}
		else if(choice1 == 36 && choice2 == 30){
			NZDtoKWD();
		}
		else if(choice1 == 36 && choice2 == 31){
			NZDtoMYR();
		}
		else if(choice1 == 36 && choice2 == 32){
			NZDtoMXN();
		}
		else if(choice1 == 36 && choice2 == 33){
			NZDtoMAD();
		}
		else if(choice1 == 36 && choice2 == 34){
			NZDtoMMK();
		}
		else if(choice1 == 36 && choice2 == 35){
			NZDtoTWD();
		}
		else if(choice1 == 36 && choice2 == 36){
			NZDtoNZD();
		}
		else if(choice1 == 36 && choice2 == 37){
			NZDtoNOK();
		}
		else if(choice1 == 36 && choice2 == 38){
			NZDtoPHP();
		}
		else if(choice1 == 36 && choice2 == 39){
			NZDtoQAR();
		}
		else if(choice1 == 36 && choice2 == 40){
			NZDtoRON();
		}
		else if(choice1 == 36 && choice2 == 41){
			NZDtoRUB();
		}
		else if(choice1 == 36 && choice2 == 42){
			NZDtoSAR();
		}
		else if(choice1 == 36 && choice2 == 43){
			NZDtoRSD();
		}
		else if(choice1 == 36 && choice2 == 44){
			NZDtoSGD();
		}
		else if(choice1 == 36 && choice2 == 45){
			NZDtoZAR();
		}
		else if(choice1 == 36 && choice2 == 46){
			NZDtoKRW();
		}
		else if(choice1 == 36 && choice2 == 47){
			NZDtoLKR();
		}
		else if(choice1 == 36 && choice2 == 48){
			NZDtoSEK();
		}
		else if(choice1 == 36 && choice2 == 49){
			NZDtoCHF();
		}
		else if(choice1 == 36 && choice2 == 50){
			NZDtoSYP();
		}
		else if(choice1 == 36 && choice2 == 51){
			NZDtoTZS();
		}
		else if(choice1 == 36 && choice2 == 52){
			NZDtoTHB();
		}
		else if(choice1 == 36 && choice2 == 53){
			NZDtoTRY();
		}
		else if(choice1 == 36 && choice2 == 54){
			NZDtoUGX();
		}
		else if(choice1 == 36 && choice2 == 55){
			NZDtoUAH();
		}
		else if(choice1 == 36 && choice2 == 56){
			NZDtoAED();
		}
		else if(choice1 == 36 && choice2 == 57){
			NZDtoVND();
		}
		else if(choice1 == 36 && choice2 == 58){
			NZDtoZMW();
		}
		//------------Norweigan Krone Conversion Choices----------//
		if(choice1 == 37 && choice2 == 1){
			NOKtoUSD();
		}
		else if(choice1 == 37 && choice2 == 2){
			NOKtoEUR();
		}
		else if(choice1 == 37 && choice2 == 3){
			NOKtoHKD();
		}
		else if(choice1 == 37 && choice2 == 4){
			NOKtoBitcoin();
		}
		else if(choice1 == 37 && choice2 == 5){
			NOKtoBitcoinCash();
		}
		else if(choice1 == 37 && choice2 == 6){
			NOKtoJPY();
		}
		else if(choice1 == 37 && choice2 == 7){
			NOKtoCNY();
		}
		else if(choice1 == 37 && choice2 == 8){
			NOKtoINR();
		}
		else if(choice1 == 37 && choice2 == 9){
			NOKtoDZD();
		}
		else if(choice1 == 37 && choice2 == 10){
			NOKtoARS();
		}
		else if(choice1 == 37 && choice2 == 11){
			NOKtoAUD();
		}
		else if(choice1 == 37 && choice2 == 12){
			NOKtoBRL();
		}
		else if(choice1 == 37 && choice2 == 13){
			NOKtoGBP();
		}
		else if(choice1 == 37 && choice2 == 14){
			NOKtoBGN();
		}
		else if(choice1 == 37 && choice2 == 15){
			NOKtoKHR();
		}
		else if(choice1 == 37 && choice2 == 16){
			NOKtoCAD();
		}
		else if(choice1 == 37 && choice2 == 17){
			NOKtoCLP();
		}
		else if(choice1 == 37 && choice2 == 18){
			NOKtoCOP();
		}
		else if(choice1 == 37 && choice2 == 19){
			NOKtoCRC();
		}
		else if(choice1 == 37 && choice2 == 20){
			NOKtoHRK();
		}
		else if(choice1 == 37 && choice2 == 21){
			NOKtoCZK();
		}
		else if(choice1 == 37 && choice2 == 22){
			NOKtoDKK();
		}
		else if(choice1 == 37 && choice2 == 23){
			NOKtoEGP();
		}
		else if(choice1 == 37 && choice2 == 24){
			NOKtoISK();
		}
		else if(choice1 == 37 && choice2 == 25){
			NOKtoIDR();
		}
		else if(choice1 == 37 && choice2 == 26){
			NOKtoIQD();
		}
		else if(choice1 == 37 && choice2 == 27){
			NOKtoILS();
		}
		else if(choice1 == 37 && choice2 == 28){
			NOKtoJOD();
		}
		else if(choice1 == 37 && choice2 == 29){
			NOKtoKES();
		}
		else if(choice1 == 37 && choice2 == 30){
			NOKtoKWD();
		}
		else if(choice1 == 37 && choice2 == 31){
			NOKtoMYR();
		}
		else if(choice1 == 37 && choice2 == 32){
			NOKtoMXN();
		}
		else if(choice1 == 37 && choice2 == 33){
			NOKtoMAD();
		}
		else if(choice1 == 37 && choice2 == 34){
			NOKtoMMK();
		}
		else if(choice1 == 37 && choice2 == 35){
			NOKtoTWD();
		}
		else if(choice1 == 37 && choice2 == 36){
			NOKtoNZD();
		}
		else if(choice1 == 37 && choice2 == 37){
			NOKtoNOK();
		}
		else if(choice1 == 37 && choice2 == 38){
			NOKtoPHP();
		}
		else if(choice1 == 37 && choice2 == 39){
			NOKtoQAR();
		}
		else if(choice1 == 37 && choice2 == 40){
			NOKtoRON();
		}
		else if(choice1 == 37 && choice2 == 41){
			NOKtoRUB();
		}
		else if(choice1 == 37 && choice2 == 42){
			NOKtoSAR();
		}
		else if(choice1 == 37 && choice2 == 43){
			NOKtoRSD();
		}
		else if(choice1 == 37 && choice2 == 44){
			NOKtoSGD();
		}
		else if(choice1 == 37 && choice2 == 45){
			NOKtoZAR();
		}
		else if(choice1 == 37 && choice2 == 46){
			NOKtoKRW();
		}
		else if(choice1 == 37 && choice2 == 47){
			NOKtoLKR();
		}
		else if(choice1 == 37 && choice2 == 48){
			NOKtoSEK();
		}
		else if(choice1 == 37 && choice2 == 49){
			NOKtoCHF();
		}
		else if(choice1 == 37 && choice2 == 50){
			NOKtoSYP();
		}
		else if(choice1 == 37 && choice2 == 51){
			NOKtoTZS();
		}
		else if(choice1 == 37 && choice2 == 52){
			NOKtoTHB();
		}
		else if(choice1 == 37 && choice2 == 53){
			NOKtoTRY();
		}
		else if(choice1 == 37 && choice2 == 54){
			NOKtoUGX();
		}
		else if(choice1 == 37 && choice2 == 55){
			NOKtoUAH();
		}
		else if(choice1 == 37 && choice2 == 56){
			NOKtoAED();
		}
		else if(choice1 == 37 && choice2 == 57){
			NOKtoVND();
		}
		else if(choice1 == 37 && choice2 == 58){
			NOKtoZMW();
		}
		//------------Philippine Peso Conversion Choices----------//
		if(choice1 == 38 && choice2 == 1){
			PHPtoUSD();
		}
		else if(choice1 == 38 && choice2 == 2){
			PHPtoEUR();
		}
		else if(choice1 == 38 && choice2 == 3){
			PHPtoHKD();
		}
		else if(choice1 == 38 && choice2 == 4){
			PHPtoBitcoin();
		}
		else if(choice1 == 38 && choice2 == 5){
			PHPtoBitcoinCash();
		}
		else if(choice1 == 38 && choice2 == 6){
			PHPtoJPY();
		}
		else if(choice1 == 38 && choice2 == 7){
			PHPtoCNY();
		}
		else if(choice1 == 38 && choice2 == 8){
			PHPtoINR();
		}
		else if(choice1 == 38 && choice2 == 9){
			PHPtoDZD();
		}
		else if(choice1 == 38 && choice2 == 10){
			PHPtoARS();
		}
		else if(choice1 == 38 && choice2 == 11){
			PHPtoAUD();
		}
		else if(choice1 == 38 && choice2 == 12){
			PHPtoBRL();
		}
		else if(choice1 == 38 && choice2 == 13){
			PHPtoGBP();
		}
		else if(choice1 == 38 && choice2 == 14){
			PHPtoBGN();
		}
		else if(choice1 == 38 && choice2 == 15){
			PHPtoKHR();
		}
		else if(choice1 == 38 && choice2 == 16){
			PHPtoCAD();
		}
		else if(choice1 == 38 && choice2 == 17){
			PHPtoCLP();
		}
		else if(choice1 == 38 && choice2 == 18){
			PHPtoCOP();
		}
		else if(choice1 == 38 && choice2 == 19){
			PHPtoCRC();
		}
		else if(choice1 == 38 && choice2 == 20){
			PHPtoHRK();
		}
		else if(choice1 == 38 && choice2 == 21){
			PHPtoCZK();
		}
		else if(choice1 == 38 && choice2 == 22){
			PHPtoDKK();
		}
		else if(choice1 == 38 && choice2 == 23){
			PHPtoEGP();
		}
		else if(choice1 == 38 && choice2 == 24){
			PHPtoISK();
		}
		else if(choice1 == 38 && choice2 == 25){
			PHPtoIDR();
		}
		else if(choice1 == 38 && choice2 == 26){
			PHPtoIQD();
		}
		else if(choice1 == 38 && choice2 == 27){
			PHPtoILS();
		}
		else if(choice1 == 38 && choice2 == 28){
			PHPtoJOD();
		}
		else if(choice1 == 38 && choice2 == 29){
			PHPtoKES();
		}
		else if(choice1 == 38 && choice2 == 30){
			PHPtoKWD();
		}
		else if(choice1 == 38 && choice2 == 31){
			PHPtoMYR();
		}
		else if(choice1 == 38 && choice2 == 32){
			PHPtoMXN();
		}
		else if(choice1 == 38 && choice2 == 33){
			PHPtoMAD();
		}
		else if(choice1 == 38 && choice2 == 34){
			PHPtoMMK();
		}
		else if(choice1 == 38 && choice2 == 35){
			PHPtoTWD();
		}
		else if(choice1 == 38 && choice2 == 36){
			PHPtoNZD();
		}
		else if(choice1 == 38 && choice2 == 37){
			PHPtoNOK();
		}
		else if(choice1 == 38 && choice2 == 38){
			PHPtoPHP();
		}
		else if(choice1 == 38 && choice2 == 39){
			PHPtoQAR();
		}
		else if(choice1 == 38 && choice2 == 40){
			PHPtoRON();
		}
		else if(choice1 == 38 && choice2 == 41){
			PHPtoRUB();
		}
		else if(choice1 == 38 && choice2 == 42){
			PHPtoSAR();
		}
		else if(choice1 == 38 && choice2 == 43){
			PHPtoRSD();
		}
		else if(choice1 == 38 && choice2 == 44){
			PHPtoSGD();
		}
		else if(choice1 == 38 && choice2 == 45){
			PHPtoZAR();
		}
		else if(choice1 == 38 && choice2 == 46){
			PHPtoKRW();
		}
		else if(choice1 == 38 && choice2 == 47){
			PHPtoLKR();
		}
		else if(choice1 == 38 && choice2 == 48){
			PHPtoSEK();
		}
		else if(choice1 == 38 && choice2 == 49){
			PHPtoCHF();
		}
		else if(choice1 == 38 && choice2 == 50){
			PHPtoSYP();
		}
		else if(choice1 == 38 && choice2 == 51){
			PHPtoTZS();
		}
		else if(choice1 == 38 && choice2 == 52){
			PHPtoTHB();
		}
		else if(choice1 == 38 && choice2 == 53){
			PHPtoTRY();
		}
		else if(choice1 == 38 && choice2 == 54){
			PHPtoUGX();
		}
		else if(choice1 == 38 && choice2 == 55){
			PHPtoUAH();
		}
		else if(choice1 == 38 && choice2 == 56){
			PHPtoAED();
		}
		else if(choice1 == 38 && choice2 == 57){
			PHPtoVND();
		}
		else if(choice1 == 38 && choice2 == 58){
			PHPtoZMW();
		}
		//------------Qatari Rial Conversion Choices----------//
		if(choice1 == 39 && choice2 == 1){
			QARtoUSD();
		}
		else if(choice1 == 39 && choice2 == 2){
			QARtoEUR();
		}
		else if(choice1 == 39 && choice2 == 3){
			QARtoHKD();
		}
		else if(choice1 == 39 && choice2 == 4){
			QARtoBitcoin();
		}
		else if(choice1 == 39 && choice2 == 5){
			QARtoBitcoinCash();
		}
		else if(choice1 == 39 && choice2 == 6){
			QARtoJPY();
		}
		else if(choice1 == 39 && choice2 == 7){
			QARtoCNY();
		}
		else if(choice1 == 39 && choice2 == 8){
			QARtoINR();
		}
		else if(choice1 == 39 && choice2 == 9){
			QARtoDZD();
		}
		else if(choice1 == 39 && choice2 == 10){
			QARtoARS();
		}
		else if(choice1 == 39 && choice2 == 11){
			QARtoAUD();
		}
		else if(choice1 == 39 && choice2 == 12){
			QARtoBRL();
		}
		else if(choice1 == 39 && choice2 == 13){
			QARtoGBP();
		}
		else if(choice1 == 39 && choice2 == 14){
			QARtoBGN();
		}
		else if(choice1 == 39 && choice2 == 15){
			QARtoKHR();
		}
		else if(choice1 == 39 && choice2 == 16){
			QARtoCAD();
		}
		else if(choice1 == 39 && choice2 == 17){
			QARtoCLP();
		}
		else if(choice1 == 39 && choice2 == 18){
			QARtoCOP();
		}
		else if(choice1 == 39 && choice2 == 19){
			QARtoCRC();
		}
		else if(choice1 == 39 && choice2 == 20){
			QARtoHRK();
		}
		else if(choice1 == 39 && choice2 == 21){
			QARtoCZK();
		}
		else if(choice1 == 39 && choice2 == 22){
			QARtoDKK();
		}
		else if(choice1 == 39 && choice2 == 23){
			QARtoEGP();
		}
		else if(choice1 == 39 && choice2 == 24){
			QARtoISK();
		}
		else if(choice1 == 39 && choice2 == 25){
			QARtoIDR();
		}
		else if(choice1 == 39 && choice2 == 26){
			QARtoIQD();
		}
		else if(choice1 == 39 && choice2 == 27){
			QARtoILS();
		}
		else if(choice1 == 39 && choice2 == 28){
			QARtoJOD();
		}
		else if(choice1 == 39 && choice2 == 29){
			QARtoKES();
		}
		else if(choice1 == 39 && choice2 == 30){
			QARtoKWD();
		}
		else if(choice1 == 39 && choice2 == 31){
			QARtoMYR();
		}
		else if(choice1 == 39 && choice2 == 32){
			QARtoMXN();
		}
		else if(choice1 == 39 && choice2 == 33){
			QARtoMAD();
		}
		else if(choice1 == 39 && choice2 == 34){
			QARtoMMK();
		}
		else if(choice1 == 39 && choice2 == 35){
			QARtoTWD();
		}
		else if(choice1 == 39 && choice2 == 36){
			QARtoNZD();
		}
		else if(choice1 == 39 && choice2 == 37){
			QARtoNOK();
		}
		else if(choice1 == 39 && choice2 == 38){
			QARtoPHP();
		}
		else if(choice1 == 39 && choice2 == 39){
			QARtoQAR();
		}
		else if(choice1 == 39 && choice2 == 40){
			QARtoRON();
		}
		else if(choice1 == 39 && choice2 == 41){
			QARtoRUB();
		}
		else if(choice1 == 39 && choice2 == 42){
			QARtoSAR();
		}
		else if(choice1 == 39 && choice2 == 43){
			QARtoRSD();
		}
		else if(choice1 == 39 && choice2 == 44){
			QARtoSGD();
		}
		else if(choice1 == 39 && choice2 == 45){
			QARtoZAR();
		}
		else if(choice1 == 39 && choice2 == 46){
			QARtoKRW();
		}
		else if(choice1 == 39 && choice2 == 47){
			QARtoLKR();
		}
		else if(choice1 == 39 && choice2 == 48){
			QARtoSEK();
		}
		else if(choice1 == 39 && choice2 == 49){
			QARtoCHF();
		}
		else if(choice1 == 39 && choice2 == 50){
			QARtoSYP();
		}
		else if(choice1 == 39 && choice2 == 51){
			QARtoTZS();
		}
		else if(choice1 == 39 && choice2 == 52){
			QARtoTHB();
		}
		else if(choice1 == 39 && choice2 == 53){
			QARtoTRY();
		}
		else if(choice1 == 39 && choice2 == 54){
			QARtoUGX();
		}
		else if(choice1 == 39 && choice2 == 55){
			QARtoUAH();
		}
		else if(choice1 == 39 && choice2 == 56){
			QARtoAED();
		}
		else if(choice1 == 39 && choice2 == 57){
			QARtoVND();
		}
		else if(choice1 == 39 && choice2 == 58){
			QARtoZMW();
		}
		//--------------------------------------------//

		//------------Romanian Lieu Conversion Choices----------//
		if(choice1 == 40 && choice2 == 1){
			RONtoUSD();
		}
		else if(choice1 == 40 && choice2 == 2){
			RONtoEUR();
		}
		else if(choice1 == 40 && choice2 == 3){
			RONtoHKD();
		}
		else if(choice1 == 40 && choice2 == 4){
			RONtoBitcoin();
		}
		else if(choice1 == 40 && choice2 == 5){
			RONtoBitcoinCash();
		}
		else if(choice1 == 40 && choice2 == 6){
			RONtoJPY();
		}
		else if(choice1 == 40 && choice2 == 7){
			RONtoCNY();
		}
		else if(choice1 == 40 && choice2 == 8){
			RONtoINR();
		}
		else if(choice1 == 40 && choice2 == 9){
			RONtoDZD();
		}
		else if(choice1 == 40 && choice2 == 10){
			RONtoARS();
		}
		else if(choice1 == 40 && choice2 == 11){
			RONtoAUD();
		}
		else if(choice1 == 40 && choice2 == 12){
			RONtoBRL();
		}
		else if(choice1 == 40 && choice2 == 13){
			RONtoGBP();
		}
		else if(choice1 == 40 && choice2 == 14){
			RONtoBGN();
		}
		else if(choice1 == 40 && choice2 == 15){
			RONtoKHR();
		}
		else if(choice1 == 40 && choice2 == 16){
			RONtoCAD();
		}
		else if(choice1 == 40 && choice2 == 17){
			RONtoCLP();
		}
		else if(choice1 == 40 && choice2 == 18){
			RONtoCOP();
		}
		else if(choice1 == 40 && choice2 == 19){
			RONtoCRC();
		}
		else if(choice1 == 40 && choice2 == 20){
			RONtoHRK();
		}
		else if(choice1 == 40 && choice2 == 21){
			RONtoCZK();
		}
		else if(choice1 == 40 && choice2 == 22){
			RONtoDKK();
		}
		else if(choice1 == 40 && choice2 == 23){
			RONtoEGP();
		}
		else if(choice1 == 40 && choice2 == 24){
			RONtoISK();
		}
		else if(choice1 == 40 && choice2 == 25){
			RONtoIDR();
		}
		else if(choice1 == 40 && choice2 == 26){
			RONtoIQD();
		}
		else if(choice1 == 40 && choice2 == 27){
			RONtoILS();
		}
		else if(choice1 == 40 && choice2 == 28){
			RONtoJOD();
		}
		else if(choice1 == 40 && choice2 == 29){
			RONtoKES();
		}
		else if(choice1 == 40 && choice2 == 30){
			RONtoKWD();
		}
		else if(choice1 == 40 && choice2 == 31){
			RONtoMYR();
		}
		else if(choice1 == 40 && choice2 == 32){
			RONtoMXN();
		}
		else if(choice1 == 40 && choice2 == 33){
			RONtoMAD();
		}
		else if(choice1 == 40 && choice2 == 34){
			RONtoMMK();
		}
		else if(choice1 == 40 && choice2 == 35){
			RONtoTWD();
		}
		else if(choice1 == 40 && choice2 == 36){
			RONtoNZD();
		}
		else if(choice1 == 40 && choice2 == 37){
			RONtoNOK();
		}
		else if(choice1 == 40 && choice2 == 38){
			RONtoPHP();
		}
		else if(choice1 == 40 && choice2 == 39){
			RONtoQAR();
		}
		else if(choice1 == 40 && choice2 == 40){
			RONtoRON();
		}
		else if(choice1 == 40 && choice2 == 41){
			RONtoRUB();
		}
		else if(choice1 == 40 && choice2 == 42){
			RONtoSAR();
		}
		else if(choice1 == 40 && choice2 == 43){
			RONtoRSD();
		}
		else if(choice1 == 40 && choice2 == 44){
			RONtoSGD();
		}
		else if(choice1 == 40 && choice2 == 45){
			RONtoZAR();
		}
		else if(choice1 == 40 && choice2 == 46){
			RONtoKRW();
		}
		else if(choice1 == 40 && choice2 == 47){
			RONtoLKR();
		}
		else if(choice1 == 40 && choice2 == 48){
			RONtoSEK();
		}
		else if(choice1 == 40 && choice2 == 49){
			RONtoCHF();
		}
		else if(choice1 == 40 && choice2 == 50){
			RONtoSYP();
		}
		else if(choice1 == 40 && choice2 == 51){
			RONtoTZS();
		}
		else if(choice1 == 40 && choice2 == 52){
			RONtoTHB();
		}
		else if(choice1 == 40 && choice2 == 53){
			RONtoTRY();
		}
		else if(choice1 == 40 && choice2 == 54){
			RONtoUGX();
		}
		else if(choice1 == 40 && choice2 == 55){
			RONtoUAH();
		}
		else if(choice1 == 40 && choice2 == 56){
			RONtoAED();
		}
		else if(choice1 == 40 && choice2 == 57){
			RONtoVND();
		}
		else if(choice1 == 40 && choice2 == 58){
			RONtoZMW();
		}
		//------------Russian Rouble Conversion Choices----------//
		if(choice1 == 41 && choice2 == 1){
			RUBtoUSD();
		}
		else if(choice1 == 41 && choice2 == 2){
			RUBtoEUR();
		}
		else if(choice1 == 41 && choice2 == 3){
			RUBtoHKD();
		}
		else if(choice1 == 41 && choice2 == 4){
			RUBtoBitcoin();
		}
		else if(choice1 == 41 && choice2 == 5){
			RUBtoBitcoinCash();
		}
		else if(choice1 == 41 && choice2 == 6){
			RUBtoJPY();
		}
		else if(choice1 == 41 && choice2 == 7){
			RUBtoCNY();
		}
		else if(choice1 == 41 && choice2 == 8){
			RUBtoINR();
		}
		else if(choice1 == 41 && choice2 == 9){
			RUBtoDZD();
		}
		else if(choice1 == 41 && choice2 == 10){
			RUBtoARS();
		}
		else if(choice1 == 41 && choice2 == 11){
			RUBtoAUD();
		}
		else if(choice1 == 41 && choice2 == 12){
			RUBtoBRL();
		}
		else if(choice1 == 41 && choice2 == 13){
			RUBtoGBP();
		}
		else if(choice1 == 41 && choice2 == 14){
			RUBtoBGN();
		}
		else if(choice1 == 41 && choice2 == 15){
			RUBtoKHR();
		}
		else if(choice1 == 41 && choice2 == 16){
			RUBtoCAD();
		}
		else if(choice1 == 41 && choice2 == 17){
			RUBtoCLP();
		}
		else if(choice1 == 41 && choice2 == 18){
			RUBtoCOP();
		}
		else if(choice1 == 41 && choice2 == 19){
			RUBtoCRC();
		}
		else if(choice1 == 41 && choice2 == 20){
			RUBtoHRK();
		}
		else if(choice1 == 41 && choice2 == 21){
			RUBtoCZK();
		}
		else if(choice1 == 41 && choice2 == 22){
			RUBtoDKK();
		}
		else if(choice1 == 41 && choice2 == 23){
			RUBtoEGP();
		}
		else if(choice1 == 41 && choice2 == 24){
			RUBtoISK();
		}
		else if(choice1 == 41 && choice2 == 25){
			RUBtoIDR();
		}
		else if(choice1 == 41 && choice2 == 26){
			RUBtoIQD();
		}
		else if(choice1 == 41 && choice2 == 27){
			RUBtoILS();
		}
		else if(choice1 == 41 && choice2 == 28){
			RUBtoJOD();
		}
		else if(choice1 == 41 && choice2 == 29){
			RUBtoKES();
		}
		else if(choice1 == 41 && choice2 == 30){
			RUBtoKWD();
		}
		else if(choice1 == 41 && choice2 == 31){
			RUBtoMYR();
		}
		else if(choice1 == 41 && choice2 == 32){
			RUBtoMXN();
		}
		else if(choice1 == 41 && choice2 == 33){
			RUBtoMAD();
		}
		else if(choice1 == 41 && choice2 == 34){
			RUBtoMMK();
		}
		else if(choice1 == 41 && choice2 == 35){
			RUBtoTWD();
		}
		else if(choice1 == 41 && choice2 == 36){
			RUBtoNZD();
		}
		else if(choice1 == 41 && choice2 == 37){
			RUBtoNOK();
		}
		else if(choice1 == 41 && choice2 == 38){
			RUBtoPHP();
		}
		else if(choice1 == 41 && choice2 == 39){
			RUBtoQAR();
		}
		else if(choice1 == 41 && choice2 == 40){
			RUBtoRON();
		}
		else if(choice1 == 41 && choice2 == 41){
			RUBtoRUB();
		}
		else if(choice1 == 41 && choice2 == 42){
			RUBtoSAR();
		}
		else if(choice1 == 41 && choice2 == 43){
			RUBtoRSD();
		}
		else if(choice1 == 41 && choice2 == 44){
			RUBtoSGD();
		}
		else if(choice1 == 41 && choice2 == 45){
			RUBtoZAR();
		}
		else if(choice1 == 41 && choice2 == 46){
			RUBtoKRW();
		}
		else if(choice1 == 41 && choice2 == 47){
			RUBtoLKR();
		}
		else if(choice1 == 41 && choice2 == 48){
			RUBtoSEK();
		}
		else if(choice1 == 41 && choice2 == 49){
			RUBtoCHF();
		}
		else if(choice1 == 41 && choice2 == 50){
			RUBtoSYP();
		}
		else if(choice1 == 41 && choice2 == 51){
			RUBtoTZS();
		}
		else if(choice1 == 41 && choice2 == 52){
			RUBtoTHB();
		}
		else if(choice1 == 41 && choice2 == 53){
			RUBtoTRY();
		}
		else if(choice1 == 41 && choice2 == 54){
			RUBtoUGX();
		}
		else if(choice1 == 41 && choice2 == 55){
			RUBtoUAH();
		}
		else if(choice1 == 41 && choice2 == 56){
			RUBtoAED();
		}
		else if(choice1 == 41 && choice2 == 57){
			RUBtoVND();
		}
		else if(choice1 == 41 && choice2 == 58){
			RUBtoZMW();
		}
		//--------------------------------------------//

		//------------Saudi Riyal Conversion Choices----------//
		if(choice1 == 42 && choice2 == 1){
			SARtoUSD();
		}
		else if(choice1 == 42 && choice2 == 2){
			SARtoEUR();
		}
		else if(choice1 == 42 && choice2 == 3){
			SARtoHKD();
		}
		else if(choice1 == 42 && choice2 == 4){
			SARtoBitcoin();
		}
		else if(choice1 == 42 && choice2 == 5){
			SARtoBitcoinCash();
		}
		else if(choice1 == 42 && choice2 == 6){
			SARtoJPY();
		}
		else if(choice1 == 42 && choice2 == 7){
			SARtoCNY();
		}
		else if(choice1 == 42 && choice2 == 8){
			SARtoINR();
		}
		else if(choice1 == 42 && choice2 == 9){
			SARtoDZD();
		}
		else if(choice1 == 42 && choice2 == 10){
			SARtoARS();
		}
		else if(choice1 == 42 && choice2 == 11){
			SARtoAUD();
		}
		else if(choice1 == 42 && choice2 == 12){
			SARtoBRL();
		}
		else if(choice1 == 42 && choice2 == 13){
			SARtoGBP();
		}
		else if(choice1 == 42 && choice2 == 14){
			SARtoBGN();
		}
		else if(choice1 == 42 && choice2 == 15){
			SARtoKHR();
		}
		else if(choice1 == 42 && choice2 == 16){
			SARtoCAD();
		}
		else if(choice1 == 42 && choice2 == 17){
			SARtoCLP();
		}
		else if(choice1 == 42 && choice2 == 18){
			SARtoCOP();
		}
		else if(choice1 == 42 && choice2 == 19){
			SARtoCRC();
		}
		else if(choice1 == 42 && choice2 == 20){
			SARtoHRK();
		}
		else if(choice1 == 42 && choice2 == 21){
			SARtoCZK();
		}
		else if(choice1 == 42 && choice2 == 22){
			SARtoDKK();
		}
		else if(choice1 == 42 && choice2 == 23){
			SARtoEGP();
		}
		else if(choice1 == 42 && choice2 == 24){
			SARtoISK();
		}
		else if(choice1 == 42 && choice2 == 25){
			SARtoIDR();
		}
		else if(choice1 == 42 && choice2 == 26){
			SARtoIQD();
		}
		else if(choice1 == 42 && choice2 == 27){
			SARtoILS();
		}
		else if(choice1 == 42 && choice2 == 28){
			SARtoJOD();
		}
		else if(choice1 == 42 && choice2 == 29){
			SARtoKES();
		}
		else if(choice1 == 42 && choice2 == 30){
			SARtoKWD();
		}
		else if(choice1 == 42 && choice2 == 31){
			SARtoMYR();
		}
		else if(choice1 == 42 && choice2 == 32){
			SARtoMXN();
		}
		else if(choice1 == 42 && choice2 == 33){
			SARtoMAD();
		}
		else if(choice1 == 42 && choice2 == 34){
			SARtoMMK();
		}
		else if(choice1 == 42 && choice2 == 35){
			SARtoTWD();
		}
		else if(choice1 == 42 && choice2 == 36){
			SARtoNZD();
		}
		else if(choice1 == 42 && choice2 == 37){
			SARtoNOK();
		}
		else if(choice1 == 42 && choice2 == 38){
			SARtoPHP();
		}
		else if(choice1 == 42 && choice2 == 39){
			SARtoQAR();
		}
		else if(choice1 == 42 && choice2 == 40){
			SARtoRON();
		}
		else if(choice1 == 42 && choice2 == 41){
			SARtoRUB();
		}
		else if(choice1 == 42 && choice2 == 42){
			SARtoSAR();
		}
		else if(choice1 == 42 && choice2 == 43){
			SARtoRSD();
		}
		else if(choice1 == 42 && choice2 == 44){
			SARtoSGD();
		}
		else if(choice1 == 42 && choice2 == 45){
			SARtoZAR();
		}
		else if(choice1 == 42 && choice2 == 46){
			SARtoKRW();
		}
		else if(choice1 == 42 && choice2 == 47){
			SARtoLKR();
		}
		else if(choice1 == 42 && choice2 == 48){
			SARtoSEK();
		}
		else if(choice1 == 42 && choice2 == 49){
			SARtoCHF();
		}
		else if(choice1 == 42 && choice2 == 50){
			SARtoSYP();
		}
		else if(choice1 == 42 && choice2 == 51){
			SARtoTZS();
		}
		else if(choice1 == 42 && choice2 == 52){
			SARtoTHB();
		}
		else if(choice1 == 42 && choice2 == 53){
			SARtoTRY();
		}
		else if(choice1 == 42 && choice2 == 54){
			SARtoUGX();
		}
		else if(choice1 == 42 && choice2 == 55){
			SARtoUAH();
		}
		else if(choice1 == 42 && choice2 == 56){
			SARtoAED();
		}
		else if(choice1 == 42 && choice2 == 57){
			SARtoVND();
		}
		else if(choice1 == 42 && choice2 == 58){
			SARtoZMW();
		}
				//--------------------------------------------//
		next();
		scn.nextInt();
	}
	public static void next(){
		//------------Serbian Dinar Conversion Choices----------//
		if(choice1 == 43 && choice2 == 1){
			RSDtoUSD();
		}
		else if(choice1 == 43 && choice2 == 2){
			RSDtoEUR();
		}
		else if(choice1 == 43 && choice2 == 3){
			RSDtoHKD();
		}
		else if(choice1 == 43 && choice2 == 4){
			RSDtoBitcoin();
		}
		else if(choice1 == 43 && choice2 == 5){
			RSDtoBitcoinCash();
		}
		else if(choice1 == 43 && choice2 == 6){
			RSDtoJPY();
		}
		else if(choice1 == 43 && choice2 == 7){
			RSDtoCNY();
		}
		else if(choice1 == 43 && choice2 == 8){
			RSDtoINR();
		}
		else if(choice1 == 43 && choice2 == 9){
			RSDtoDZD();
		}
		else if(choice1 == 43 && choice2 == 10){
			RSDtoARS();
		}
		else if(choice1 == 43 && choice2 == 11){
			RSDtoAUD();
		}
		else if(choice1 == 43 && choice2 == 12){
			RSDtoBRL();
		}
		else if(choice1 == 43 && choice2 == 13){
			RSDtoGBP();
		}
		else if(choice1 == 43 && choice2 == 14){
			RSDtoBGN();
		}
		else if(choice1 == 43 && choice2 == 15){
			RSDtoKHR();
		}
		else if(choice1 == 43 && choice2 == 16){
			RSDtoCAD();
		}
		else if(choice1 == 43 && choice2 == 17){
			RSDtoCLP();
		}
		else if(choice1 == 43 && choice2 == 18){
			RSDtoCOP();
		}
		else if(choice1 == 43 && choice2 == 19){
			RSDtoCRC();
		}
		else if(choice1 == 43 && choice2 == 20){
			RSDtoHRK();
		}
		else if(choice1 == 43 && choice2 == 21){
			RSDtoCZK();
		}
		else if(choice1 == 43 && choice2 == 22){
			RSDtoDKK();
		}
		else if(choice1 == 43 && choice2 == 23){
			RSDtoEGP();
		}
		else if(choice1 == 43 && choice2 == 24){
			RSDtoISK();
		}
		else if(choice1 == 43 && choice2 == 25){
			RSDtoIDR();
		}
		else if(choice1 == 43 && choice2 == 26){
			RSDtoIQD();
		}
		else if(choice1 == 43 && choice2 == 27){
			RSDtoILS();
		}
		else if(choice1 == 43 && choice2 == 28){
			RSDtoJOD();
		}
		else if(choice1 == 43 && choice2 == 29){
			RSDtoKES();
		}
		else if(choice1 == 43 && choice2 == 30){
			RSDtoKWD();
		}
		else if(choice1 == 43 && choice2 == 31){
			RSDtoMYR();
		}
		else if(choice1 == 43 && choice2 == 32){
			RSDtoMXN();
		}
		else if(choice1 == 43 && choice2 == 33){
			RSDtoMAD();
		}
		else if(choice1 == 43 && choice2 == 34){
			RSDtoMMK();
		}
		else if(choice1 == 43 && choice2 == 35){
			RSDtoTWD();
		}
		else if(choice1 == 43 && choice2 == 36){
			RSDtoNZD();
		}
		else if(choice1 == 43 && choice2 == 37){
			RSDtoNOK();
		}
		else if(choice1 == 43 && choice2 == 38){
			RSDtoPHP();
		}
		else if(choice1 == 43 && choice2 == 39){
			RSDtoQAR();
		}
		else if(choice1 == 43 && choice2 == 40){
			RSDtoRON();
		}
		else if(choice1 == 43 && choice2 == 41){
			RSDtoRUB();
		}
		else if(choice1 == 43 && choice2 == 42){
			RSDtoSAR();
		}
		else if(choice1 == 43 && choice2 == 43){
			RSDtoRSD();
		}
		else if(choice1 == 43 && choice2 == 44){
			RSDtoSGD();
		}
		else if(choice1 == 43 && choice2 == 45){
			RSDtoZAR();
		}
		else if(choice1 == 43 && choice2 == 46){
			RSDtoKRW();
		}
		else if(choice1 == 43 && choice2 == 47){
			RSDtoLKR();
		}
		else if(choice1 == 43 && choice2 == 48){
			RSDtoSEK();
		}
		else if(choice1 == 43 && choice2 == 49){
			RSDtoCHF();
		}
		else if(choice1 == 43 && choice2 == 50){
			RSDtoSYP();
		}
		else if(choice1 == 43 && choice2 == 51){
			RSDtoTZS();
		}
		else if(choice1 == 43 && choice2 == 52){
			RSDtoTHB();
		}
		else if(choice1 == 43 && choice2 == 53){
			RSDtoTRY();
		}
		else if(choice1 == 43 && choice2 == 54){
			RSDtoUGX();
		}
		else if(choice1 == 43 && choice2 == 55){
			RSDtoUAH();
		}
		else if(choice1 == 43 && choice2 == 56){
			RSDtoAED();
		}
		else if(choice1 == 43 && choice2 == 57){
			RSDtoVND();
		}
		else if(choice1 == 43 && choice2 == 58){
			RSDtoZMW();
		}
		//------------Singapore Dollar Conversion Choices----------//
		if(choice1 == 44 && choice2 == 1){
			SGDtoUSD();
		}
		else if(choice1 == 44 && choice2 == 2){
			SGDtoEUR();
		}
		else if(choice1 == 44 && choice2 == 3){
			SGDtoHKD();
		}
		else if(choice1 == 44 && choice2 == 4){
			SGDtoBitcoin();
		}
		else if(choice1 == 44 && choice2 == 5){
			SGDtoBitcoinCash();
		}
		else if(choice1 == 44 && choice2 == 6){
			SGDtoJPY();
		}
		else if(choice1 == 44 && choice2 == 7){
			SGDtoCNY();
		}
		else if(choice1 == 44 && choice2 == 8){
			SGDtoINR();
		}
		else if(choice1 == 44 && choice2 == 9){
			SGDtoDZD();
		}
		else if(choice1 == 44 && choice2 == 10){
			SGDtoARS();
		}
		else if(choice1 == 44 && choice2 == 11){
			SGDtoAUD();
		}
		else if(choice1 == 44 && choice2 == 12){
			SGDtoBRL();
		}
		else if(choice1 == 44 && choice2 == 13){
			SGDtoGBP();
		}
		else if(choice1 == 44 && choice2 == 14){
			SGDtoBGN();
		}
		else if(choice1 == 44 && choice2 == 15){
			SGDtoKHR();
		}
		else if(choice1 == 44 && choice2 == 16){
			SGDtoCAD();
		}
		else if(choice1 == 44 && choice2 == 17){
			SGDtoCLP();
		}
		else if(choice1 == 44 && choice2 == 18){
			SGDtoCOP();
		}
		else if(choice1 == 44 && choice2 == 19){
			SGDtoCRC();
		}
		else if(choice1 == 44 && choice2 == 20){
			SGDtoHRK();
		}
		else if(choice1 == 44 && choice2 == 21){
			SGDtoCZK();
		}
		else if(choice1 == 44 && choice2 == 22){
			SGDtoDKK();
		}
		else if(choice1 == 44 && choice2 == 23){
			SGDtoEGP();
		}
		else if(choice1 == 44 && choice2 == 24){
			SGDtoISK();
		}
		else if(choice1 == 44 && choice2 == 25){
			SGDtoIDR();
		}
		else if(choice1 == 44 && choice2 == 26){
			SGDtoIQD();
		}
		else if(choice1 == 44 && choice2 == 27){
			SGDtoILS();
		}
		else if(choice1 == 44 && choice2 == 28){
			SGDtoJOD();
		}
		else if(choice1 == 44 && choice2 == 29){
			SGDtoKES();
		}
		else if(choice1 == 44 && choice2 == 30){
			SGDtoKWD();
		}
		else if(choice1 == 44 && choice2 == 31){
			SGDtoMYR();
		}
		else if(choice1 == 44 && choice2 == 32){
			SGDtoMXN();
		}
		else if(choice1 == 44 && choice2 == 33){
			SGDtoMAD();
		}
		else if(choice1 == 44 && choice2 == 34){
			SGDtoMMK();
		}
		else if(choice1 == 44 && choice2 == 35){
			SGDtoTWD();
		}
		else if(choice1 == 44 && choice2 == 36){
			SGDtoNZD();
		}
		else if(choice1 == 44 && choice2 == 37){
			SGDtoNOK();
		}
		else if(choice1 == 44 && choice2 == 38){
			SGDtoPHP();
		}
		else if(choice1 == 44 && choice2 == 39){
			SGDtoQAR();
		}
		else if(choice1 == 44 && choice2 == 40){
			SGDtoRON();
		}
		else if(choice1 == 44 && choice2 == 41){
			SGDtoRUB();
		}
		else if(choice1 == 44 && choice2 == 42){
			SGDtoSAR();
		}
		else if(choice1 == 44 && choice2 == 43){
			SGDtoRSD();
		}
		else if(choice1 == 44 && choice2 == 44){
			SGDtoSGD();
		}
		else if(choice1 == 44 && choice2 == 45){
			SGDtoZAR();
		}
		else if(choice1 == 44 && choice2 == 46){
			SGDtoKRW();
		}
		else if(choice1 == 44 && choice2 == 47){
			SGDtoLKR();
		}
		else if(choice1 == 44 && choice2 == 48){
			SGDtoSEK();
		}
		else if(choice1 == 44 && choice2 == 49){
			SGDtoCHF();
		}
		else if(choice1 == 44 && choice2 == 50){
			SGDtoSYP();
		}
		else if(choice1 == 44 && choice2 == 51){
			SGDtoTZS();
		}
		else if(choice1 == 44 && choice2 == 52){
			SGDtoTHB();
		}
		else if(choice1 == 44 && choice2 == 53){
			SGDtoTRY();
		}
		else if(choice1 == 44 && choice2 == 54){
			SGDtoUGX();
		}
		else if(choice1 == 44 && choice2 == 55){
			SGDtoUAH();
		}
		else if(choice1 == 44 && choice2 == 56){
			SGDtoAED();
		}
		else if(choice1 == 44 && choice2 == 57){
			SGDtoVND();
		}
		else if(choice1 == 44 && choice2 == 58){
			SGDtoZMW();
		}
		//------------South African Rand Conversion Choices----------//
		if(choice1 == 45 && choice2 == 1){
			ZARtoUSD();
		}
		else if(choice1 == 45 && choice2 == 2){
			ZARtoEUR();
		}
		else if(choice1 == 45 && choice2 == 3){
			ZARtoHKD();
		}
		else if(choice1 == 45 && choice2 == 4){
			ZARtoBitcoin();
		}
		else if(choice1 == 45 && choice2 == 5){
			ZARtoBitcoinCash();
		}
		else if(choice1 == 45 && choice2 == 6){
			ZARtoJPY();
		}
		else if(choice1 == 45 && choice2 == 7){
			ZARtoCNY();
		}
		else if(choice1 == 45 && choice2 == 8){
			ZARtoINR();
		}
		else if(choice1 == 45 && choice2 == 9){
			ZARtoDZD();
		}
		else if(choice1 == 45 && choice2 == 10){
			ZARtoARS();
		}
		else if(choice1 == 45 && choice2 == 11){
			ZARtoAUD();
		}
		else if(choice1 == 45 && choice2 == 12){
			ZARtoBRL();
		}
		else if(choice1 == 45 && choice2 == 13){
			ZARtoGBP();
		}
		else if(choice1 == 45 && choice2 == 14){
			ZARtoBGN();
		}
		else if(choice1 == 45 && choice2 == 15){
			ZARtoKHR();
		}
		else if(choice1 == 45 && choice2 == 16){
			ZARtoCAD();
		}
		else if(choice1 == 45 && choice2 == 17){
			ZARtoCLP();
		}
		else if(choice1 == 45 && choice2 == 18){
			ZARtoCOP();
		}
		else if(choice1 == 45 && choice2 == 19){
			ZARtoCRC();
		}
		else if(choice1 == 45 && choice2 == 20){
			ZARtoHRK();
		}
		else if(choice1 == 45 && choice2 == 21){
			ZARtoCZK();
		}
		else if(choice1 == 45 && choice2 == 22){
			ZARtoDKK();
		}
		else if(choice1 == 45 && choice2 == 23){
			ZARtoEGP();
		}
		else if(choice1 == 45 && choice2 == 24){
			ZARtoISK();
		}
		else if(choice1 == 45 && choice2 == 25){
			ZARtoIDR();
		}
		else if(choice1 == 45 && choice2 == 26){
			ZARtoIQD();
		}
		else if(choice1 == 45 && choice2 == 27){
			ZARtoILS();
		}
		else if(choice1 == 45 && choice2 == 28){
			ZARtoJOD();
		}
		else if(choice1 == 45 && choice2 == 29){
			ZARtoKES();
		}
		else if(choice1 == 45 && choice2 == 30){
			ZARtoKWD();
		}
		else if(choice1 == 45 && choice2 == 31){
			ZARtoMYR();
		}
		else if(choice1 == 45 && choice2 == 32){
			ZARtoMXN();
		}
		else if(choice1 == 45 && choice2 == 33){
			ZARtoMAD();
		}
		else if(choice1 == 45 && choice2 == 34){
			ZARtoMMK();
		}
		else if(choice1 == 45 && choice2 == 35){
			ZARtoTWD();
		}
		else if(choice1 == 45 && choice2 == 36){
			ZARtoNZD();
		}
		else if(choice1 == 45 && choice2 == 37){
			ZARtoNOK();
		}
		else if(choice1 == 45 && choice2 == 38){
			ZARtoPHP();
		}
		else if(choice1 == 45 && choice2 == 39){
			ZARtoQAR();
		}
		else if(choice1 == 45 && choice2 == 40){
			ZARtoRON();
		}
		else if(choice1 == 45 && choice2 == 41){
			ZARtoRUB();
		}
		else if(choice1 == 45 && choice2 == 42){
			ZARtoSAR();
		}
		else if(choice1 == 45 && choice2 == 43){
			ZARtoRSD();
		}
		else if(choice1 == 45 && choice2 == 44){
			ZARtoSGD();
		}
		else if(choice1 == 45 && choice2 == 45){
			ZARtoZAR();
		}
		else if(choice1 == 45 && choice2 == 46){
			ZARtoKRW();
		}
		else if(choice1 == 45 && choice2 == 47){
			ZARtoLKR();
		}
		else if(choice1 == 45 && choice2 == 48){
			ZARtoSEK();
		}
		else if(choice1 == 45 && choice2 == 49){
			ZARtoCHF();
		}
		else if(choice1 == 45 && choice2 == 50){
			ZARtoSYP();
		}
		else if(choice1 == 45 && choice2 == 51){
			ZARtoTZS();
		}
		else if(choice1 == 45 && choice2 == 52){
			ZARtoTHB();
		}
		else if(choice1 == 45 && choice2 == 53){
			ZARtoTRY();
		}
		else if(choice1 == 45 && choice2 == 54){
			ZARtoUGX();
		}
		else if(choice1 == 45 && choice2 == 55){
			ZARtoUAH();
		}
		else if(choice1 == 45 && choice2 == 56){
			ZARtoAED();
		}
		else if(choice1 == 45 && choice2 == 57){
			ZARtoVND();
		}
		else if(choice1 == 45 && choice2 == 58){
			ZARtoZMW();
		}
		//------------South Korean Won Conversion Choices----------//
		if(choice1 == 46 && choice2 == 1){
			KRWtoUSD();
		}
		else if(choice1 == 46 && choice2 == 2){
			KRWtoEUR();
		}
		else if(choice1 == 46 && choice2 == 3){
			KRWtoHKD();
		}
		else if(choice1 == 46 && choice2 == 4){
			KRWtoBitcoin();
		}
		else if(choice1 == 46 && choice2 == 5){
			KRWtoBitcoinCash();
		}
		else if(choice1 == 46 && choice2 == 6){
			KRWtoJPY();
		}
		else if(choice1 == 46 && choice2 == 7){
			KRWtoCNY();
		}
		else if(choice1 == 46 && choice2 == 8){
			KRWtoINR();
		}
		else if(choice1 == 46 && choice2 == 9){
			KRWtoDZD();
		}
		else if(choice1 == 46 && choice2 == 10){
			KRWtoARS();
		}
		else if(choice1 == 46 && choice2 == 11){
			KRWtoAUD();
		}
		else if(choice1 == 46 && choice2 == 12){
			KRWtoBRL();
		}
		else if(choice1 == 46 && choice2 == 13){
			KRWtoGBP();
		}
		else if(choice1 == 46 && choice2 == 14){
			KRWtoBGN();
		}
		else if(choice1 == 46 && choice2 == 15){
			KRWtoKHR();
		}
		else if(choice1 == 46 && choice2 == 16){
			KRWtoCAD();
		}
		else if(choice1 == 46 && choice2 == 17){
			KRWtoCLP();
		}
		else if(choice1 == 46 && choice2 == 18){
			KRWtoCOP();
		}
		else if(choice1 == 46 && choice2 == 19){
			KRWtoCRC();
		}
		else if(choice1 == 46 && choice2 == 20){
			KRWtoHRK();
		}
		else if(choice1 == 46 && choice2 == 21){
			KRWtoCZK();
		}
		else if(choice1 == 46 && choice2 == 22){
			KRWtoDKK();
		}
		else if(choice1 == 46 && choice2 == 23){
			KRWtoEGP();
		}
		else if(choice1 == 46 && choice2 == 24){
			KRWtoISK();
		}
		else if(choice1 == 46 && choice2 == 25){
			KRWtoIDR();
		}
		else if(choice1 == 46 && choice2 == 26){
			KRWtoIQD();
		}
		else if(choice1 == 46 && choice2 == 27){
			KRWtoILS();
		}
		else if(choice1 == 46 && choice2 == 28){
			KRWtoJOD();
		}
		else if(choice1 == 46 && choice2 == 29){
			KRWtoKES();
		}
		else if(choice1 == 46 && choice2 == 30){
			KRWtoKWD();
		}
		else if(choice1 == 46 && choice2 == 31){
			KRWtoMYR();
		}
		else if(choice1 == 46 && choice2 == 32){
			KRWtoMXN();
		}
		else if(choice1 == 46 && choice2 == 33){
			KRWtoMAD();
		}
		else if(choice1 == 46 && choice2 == 34){
			KRWtoMMK();
		}
		else if(choice1 == 46 && choice2 == 35){
			KRWtoTWD();
		}
		else if(choice1 == 46 && choice2 == 36){
			KRWtoNZD();
		}
		else if(choice1 == 46 && choice2 == 37){
			KRWtoNOK();
		}
		else if(choice1 == 46 && choice2 == 38){
			KRWtoPHP();
		}
		else if(choice1 == 46 && choice2 == 39){
			KRWtoQAR();
		}
		else if(choice1 == 46 && choice2 == 40){
			KRWtoRON();
		}
		else if(choice1 == 46 && choice2 == 41){
			KRWtoRUB();
		}
		else if(choice1 == 46 && choice2 == 42){
			KRWtoSAR();
		}
		else if(choice1 == 46 && choice2 == 43){
			KRWtoRSD();
		}
		else if(choice1 == 46 && choice2 == 44){
			KRWtoSGD();
		}
		else if(choice1 == 46 && choice2 == 45){
			KRWtoZAR();
		}
		else if(choice1 == 46 && choice2 == 46){
			KRWtoKRW();
		}
		else if(choice1 == 46 && choice2 == 47){
			KRWtoLKR();
		}
		else if(choice1 == 46 && choice2 == 48){
			KRWtoSEK();
		}
		else if(choice1 == 46 && choice2 == 49){
			KRWtoCHF();
		}
		else if(choice1 == 46 && choice2 == 50){
			KRWtoSYP();
		}
		else if(choice1 == 46 && choice2 == 51){
			KRWtoTZS();
		}
		else if(choice1 == 46 && choice2 == 52){
			KRWtoTHB();
		}
		else if(choice1 == 46 && choice2 == 53){
			KRWtoTRY();
		}
		else if(choice1 == 46 && choice2 == 54){
			KRWtoUGX();
		}
		else if(choice1 == 46 && choice2 == 55){
			KRWtoUAH();
		}
		else if(choice1 == 46 && choice2 == 56){
			KRWtoAED();
		}
		else if(choice1 == 46 && choice2 == 57){
			KRWtoVND();
		}
		else if(choice1 == 46 && choice2 == 58){
			KRWtoZMW();
		}
		//------------Sri Lankan Rupee Conversion Choices----------//
		if(choice1 == 47 && choice2 == 1){
			LKRtoUSD();
		}
		else if(choice1 == 47 && choice2 == 2){
			LKRtoEUR();
		}
		else if(choice1 == 47 && choice2 == 3){
			LKRtoHKD();
		}
		else if(choice1 == 47 && choice2 == 4){
			LKRtoBitcoin();
		}
		else if(choice1 == 47 && choice2 == 5){
			LKRtoBitcoinCash();
		}
		else if(choice1 == 47 && choice2 == 6){
			LKRtoJPY();
		}
		else if(choice1 == 47 && choice2 == 7){
			LKRtoCNY();
		}
		else if(choice1 == 47 && choice2 == 8){
			LKRtoINR();
		}
		else if(choice1 == 47 && choice2 == 9){
			LKRtoDZD();
		}
		else if(choice1 == 47 && choice2 == 10){
			LKRtoARS();
		}
		else if(choice1 == 47 && choice2 == 11){
			LKRtoAUD();
		}
		else if(choice1 == 47 && choice2 == 12){
			LKRtoBRL();
		}
		else if(choice1 == 47 && choice2 == 13){
			LKRtoGBP();
		}
		else if(choice1 == 47 && choice2 == 14){
			LKRtoBGN();
		}
		else if(choice1 == 47 && choice2 == 15){
			LKRtoKHR();
		}
		else if(choice1 == 47 && choice2 == 16){
			LKRtoCAD();
		}
		else if(choice1 == 47 && choice2 == 17){
			LKRtoCLP();
		}
		else if(choice1 == 47 && choice2 == 18){
			LKRtoCOP();
		}
		else if(choice1 == 47 && choice2 == 19){
			LKRtoCRC();
		}
		else if(choice1 == 47 && choice2 == 20){
			LKRtoHRK();
		}
		else if(choice1 == 47 && choice2 == 21){
			LKRtoCZK();
		}
		else if(choice1 == 47 && choice2 == 22){
			LKRtoDKK();
		}
		else if(choice1 == 47 && choice2 == 23){
			LKRtoEGP();
		}
		else if(choice1 == 47 && choice2 == 24){
			LKRtoISK();
		}
		else if(choice1 == 47 && choice2 == 25){
			LKRtoIDR();
		}
		else if(choice1 == 47 && choice2 == 26){
			LKRtoIQD();
		}
		else if(choice1 == 47 && choice2 == 27){
			LKRtoILS();
		}
		else if(choice1 == 47 && choice2 == 28){
			LKRtoJOD();
		}
		else if(choice1 == 47 && choice2 == 29){
			LKRtoKES();
		}
		else if(choice1 == 47 && choice2 == 30){
			LKRtoKWD();
		}
		else if(choice1 == 47 && choice2 == 31){
			LKRtoMYR();
		}
		else if(choice1 == 47 && choice2 == 32){
			LKRtoMXN();
		}
		else if(choice1 == 47 && choice2 == 33){
			LKRtoMAD();
		}
		else if(choice1 == 47 && choice2 == 34){
			LKRtoMMK();
		}
		else if(choice1 == 47 && choice2 == 35){
			LKRtoTWD();
		}
		else if(choice1 == 47 && choice2 == 36){
			LKRtoNZD();
		}
		else if(choice1 == 47 && choice2 == 37){
			LKRtoNOK();
		}
		else if(choice1 == 47 && choice2 == 38){
			LKRtoPHP();
		}
		else if(choice1 == 47 && choice2 == 39){
			LKRtoQAR();
		}
		else if(choice1 == 47 && choice2 == 40){
			LKRtoRON();
		}
		else if(choice1 == 47 && choice2 == 41){
			LKRtoRUB();
		}
		else if(choice1 == 47 && choice2 == 42){
			LKRtoSAR();
		}
		else if(choice1 == 47 && choice2 == 43){
			LKRtoRSD();
		}
		else if(choice1 == 47 && choice2 == 44){
			LKRtoSGD();
		}
		else if(choice1 == 47 && choice2 == 45){
			LKRtoZAR();
		}
		else if(choice1 == 47 && choice2 == 46){
			LKRtoKRW();
		}
		else if(choice1 == 47 && choice2 == 47){
			LKRtoLKR();
		}
		else if(choice1 == 47 && choice2 == 48){
			LKRtoSEK();
		}
		else if(choice1 == 47 && choice2 == 49){
			LKRtoCHF();
		}
		else if(choice1 == 47 && choice2 == 50){
			LKRtoSYP();
		}
		else if(choice1 == 47 && choice2 == 51){
			LKRtoTZS();
		}
		else if(choice1 == 47 && choice2 == 52){
			LKRtoTHB();
		}
		else if(choice1 == 47 && choice2 == 53){
			LKRtoTRY();
		}
		else if(choice1 == 47 && choice2 == 54){
			LKRtoUGX();
		}
		else if(choice1 == 47 && choice2 == 55){
			LKRtoUAH();
		}
		else if(choice1 == 47 && choice2 == 56){
			LKRtoAED();
		}
		else if(choice1 == 47 && choice2 == 57){
			LKRtoVND();
		}
		else if(choice1 == 47 && choice2 == 58){
			LKRtoZMW();
		}
		//------------Swedish Krona Conversion Choices----------//
		if(choice1 == 48 && choice2 == 1){
			SEKtoUSD();
		}
		else if(choice1 == 48 && choice2 == 2){
			SEKtoEUR();
		}
		else if(choice1 == 48 && choice2 == 3){
			SEKtoHKD();
		}
		else if(choice1 == 48 && choice2 == 4){
			SEKtoBitcoin();
		}
		else if(choice1 == 48 && choice2 == 5){
			SEKtoBitcoinCash();
		}
		else if(choice1 == 48 && choice2 == 6){
			SEKtoJPY();
		}
		else if(choice1 == 48 && choice2 == 7){
			SEKtoCNY();
		}
		else if(choice1 == 48 && choice2 == 8){
			SEKtoINR();
		}
		else if(choice1 == 48 && choice2 == 9){
			SEKtoDZD();
		}
		else if(choice1 == 48 && choice2 == 10){
			SEKtoARS();
		}
		else if(choice1 == 48 && choice2 == 11){
			SEKtoAUD();
		}
		else if(choice1 == 48 && choice2 == 12){
			SEKtoBRL();
		}
		else if(choice1 == 48 && choice2 == 13){
			SEKtoGBP();
		}
		else if(choice1 == 48 && choice2 == 14){
			SEKtoBGN();
		}
		else if(choice1 == 48 && choice2 == 15){
			SEKtoKHR();
		}
		else if(choice1 == 48 && choice2 == 16){
			SEKtoCAD();
		}
		else if(choice1 == 48 && choice2 == 17){
			SEKtoCLP();
		}
		else if(choice1 == 48 && choice2 == 18){
			SEKtoCOP();
		}
		else if(choice1 == 48 && choice2 == 19){
			SEKtoCRC();
		}
		else if(choice1 == 48 && choice2 == 20){
			SEKtoHRK();
		}
		else if(choice1 == 48 && choice2 == 21){
			SEKtoCZK();
		}
		else if(choice1 == 48 && choice2 == 22){
			SEKtoDKK();
		}
		else if(choice1 == 48 && choice2 == 23){
			SEKtoEGP();
		}
		else if(choice1 == 48 && choice2 == 24){
			SEKtoISK();
		}
		else if(choice1 == 48 && choice2 == 25){
			SEKtoIDR();
		}
		else if(choice1 == 48 && choice2 == 26){
			SEKtoIQD();
		}
		else if(choice1 == 48 && choice2 == 27){
			SEKtoILS();
		}
		else if(choice1 == 48 && choice2 == 28){
			SEKtoJOD();
		}
		else if(choice1 == 48 && choice2 == 29){
			SEKtoKES();
		}
		else if(choice1 == 48 && choice2 == 30){
			SEKtoKWD();
		}
		else if(choice1 == 48 && choice2 == 31){
			SEKtoMYR();
		}
		else if(choice1 == 48 && choice2 == 32){
			SEKtoMXN();
		}
		else if(choice1 == 48 && choice2 == 33){
			SEKtoMAD();
		}
		else if(choice1 == 48 && choice2 == 34){
			SEKtoMMK();
		}
		else if(choice1 == 48 && choice2 == 35){
			SEKtoTWD();
		}
		else if(choice1 == 48 && choice2 == 36){
			SEKtoNZD();
		}
		else if(choice1 == 48 && choice2 == 37){
			SEKtoNOK();
		}
		else if(choice1 == 48 && choice2 == 38){
			SEKtoPHP();
		}
		else if(choice1 == 48 && choice2 == 39){
			SEKtoQAR();
		}
		else if(choice1 == 48 && choice2 == 40){
			SEKtoRON();
		}
		else if(choice1 == 48 && choice2 == 41){
			SEKtoRUB();
		}
		else if(choice1 == 48 && choice2 == 42){
			SEKtoSAR();
		}
		else if(choice1 == 48 && choice2 == 43){
			SEKtoRSD();
		}
		else if(choice1 == 48 && choice2 == 44){
			SEKtoSGD();
		}
		else if(choice1 == 48 && choice2 == 45){
			SEKtoZAR();
		}
		else if(choice1 == 48 && choice2 == 46){
			SEKtoKRW();
		}
		else if(choice1 == 48 && choice2 == 47){
			SEKtoLKR();
		}
		else if(choice1 == 48 && choice2 == 48){
			SEKtoSEK();
		}
		else if(choice1 == 48 && choice2 == 49){
			SEKtoCHF();
		}
		else if(choice1 == 48 && choice2 == 50){
			SEKtoSYP();
		}
		else if(choice1 == 48 && choice2 == 51){
			SEKtoTZS();
		}
		else if(choice1 == 48 && choice2 == 52){
			SEKtoTHB();
		}
		else if(choice1 == 48 && choice2 == 53){
			SEKtoTRY();
		}
		else if(choice1 == 48 && choice2 == 54){
			SEKtoUGX();
		}
		else if(choice1 == 48 && choice2 == 55){
			SEKtoUAH();
		}
		else if(choice1 == 48 && choice2 == 56){
			SEKtoAED();
		}
		else if(choice1 == 48 && choice2 == 57){
			SEKtoVND();
		}
		else if(choice1 == 48 && choice2 == 58){
			SEKtoZMW();
		}
		//------------Swiss Franc Conversion Choices----------//
		if(choice1 == 49 && choice2 == 1){
			CHFtoUSD();
		}
		else if(choice1 == 49 && choice2 == 2){
			CHFtoEUR();
		}
		else if(choice1 == 49 && choice2 == 3){
			CHFtoHKD();
		}
		else if(choice1 == 49 && choice2 == 4){
			CHFtoBitcoin();
		}
		else if(choice1 == 49 && choice2 == 5){
			CHFtoBitcoinCash();
		}
		else if(choice1 == 49 && choice2 == 6){
			CHFtoJPY();
		}
		else if(choice1 == 49 && choice2 == 7){
			CHFtoCNY();
		}
		else if(choice1 == 49 && choice2 == 8){
			CHFtoINR();
		}
		else if(choice1 == 49 && choice2 == 9){
			CHFtoDZD();
		}
		else if(choice1 == 49 && choice2 == 10){
			CHFtoARS();
		}
		else if(choice1 == 49 && choice2 == 11){
			CHFtoAUD();
		}
		else if(choice1 == 49 && choice2 == 12){
			CHFtoBRL();
		}
		else if(choice1 == 49 && choice2 == 13){
			CHFtoGBP();
		}
		else if(choice1 == 49 && choice2 == 14){
			CHFtoBGN();
		}
		else if(choice1 == 49 && choice2 == 15){
			CHFtoKHR();
		}
		else if(choice1 == 49 && choice2 == 16){
			CHFtoCAD();
		}
		else if(choice1 == 49 && choice2 == 17){
			CHFtoCLP();
		}
		else if(choice1 == 49 && choice2 == 18){
			CHFtoCOP();
		}
		else if(choice1 == 49 && choice2 == 19){
			CHFtoCRC();
		}
		else if(choice1 == 49 && choice2 == 20){
			CHFtoHRK();
		}
		else if(choice1 == 49 && choice2 == 21){
			CHFtoCZK();
		}
		else if(choice1 == 49 && choice2 == 22){
			CHFtoDKK();
		}
		else if(choice1 == 49 && choice2 == 23){
			CHFtoEGP();
		}
		else if(choice1 == 49 && choice2 == 24){
			CHFtoISK();
		}
		else if(choice1 == 49 && choice2 == 25){
			CHFtoIDR();
		}
		else if(choice1 == 49 && choice2 == 26){
			CHFtoIQD();
		}
		else if(choice1 == 49 && choice2 == 27){
			CHFtoILS();
		}
		else if(choice1 == 49 && choice2 == 28){
			CHFtoJOD();
		}
		else if(choice1 == 49 && choice2 == 29){
			CHFtoKES();
		}
		else if(choice1 == 49 && choice2 == 30){
			CHFtoKWD();
		}
		else if(choice1 == 49 && choice2 == 31){
			CHFtoMYR();
		}
		else if(choice1 == 49 && choice2 == 32){
			CHFtoMXN();
		}
		else if(choice1 == 49 && choice2 == 33){
			CHFtoMAD();
		}
		else if(choice1 == 49 && choice2 == 34){
			CHFtoMMK();
		}
		else if(choice1 == 49 && choice2 == 35){
			CHFtoTWD();
		}
		else if(choice1 == 49 && choice2 == 36){
			CHFtoNZD();
		}
		else if(choice1 == 49 && choice2 == 37){
			CHFtoNOK();
		}
		else if(choice1 == 49 && choice2 == 38){
			CHFtoPHP();
		}
		else if(choice1 == 49 && choice2 == 39){
			CHFtoQAR();
		}
		else if(choice1 == 49 && choice2 == 40){
			CHFtoRON();
		}
		else if(choice1 == 49 && choice2 == 41){
			CHFtoRUB();
		}
		else if(choice1 == 49 && choice2 == 42){
			CHFtoSAR();
		}
		else if(choice1 == 49 && choice2 == 43){
			CHFtoRSD();
		}
		else if(choice1 == 49 && choice2 == 44){
			CHFtoSGD();
		}
		else if(choice1 == 49 && choice2 == 45){
			CHFtoZAR();
		}
		else if(choice1 == 49 && choice2 == 46){
			CHFtoKRW();
		}
		else if(choice1 == 49 && choice2 == 47){
			CHFtoLKR();
		}
		else if(choice1 == 49 && choice2 == 48){
			CHFtoSEK();
		}
		else if(choice1 == 49 && choice2 == 49){
			CHFtoCHF();
		}
		else if(choice1 == 49 && choice2 == 50){
			CHFtoSYP();
		}
		else if(choice1 == 49 && choice2 == 51){
			CHFtoTZS();
		}
		else if(choice1 == 49 && choice2 == 52){
			CHFtoTHB();
		}
		else if(choice1 == 49 && choice2 == 53){
			CHFtoTRY();
		}
		else if(choice1 == 49 && choice2 == 54){
			CHFtoUGX();
		}
		else if(choice1 == 49 && choice2 == 55){
			CHFtoUAH();
		}
		else if(choice1 == 49 && choice2 == 56){
			CHFtoAED();
		}
		else if(choice1 == 49 && choice2 == 57){
			CHFtoVND();
		}
		else if(choice1 == 49 && choice2 == 58){
			CHFtoZMW();
		}
		//------------Syrian Pound Conversion Choices----------//
		if(choice1 == 50 && choice2 == 1){
			SYPtoUSD();
		}
		else if(choice1 == 50 && choice2 == 2){
			SYPtoEUR();
		}
		else if(choice1 == 50 && choice2 == 3){
			SYPtoHKD();
		}
		else if(choice1 == 50 && choice2 == 4){
			SYPtoBitcoin();
		}
		else if(choice1 == 50 && choice2 == 5){
			SYPtoBitcoinCash();
		}
		else if(choice1 == 50 && choice2 == 6){
			SYPtoJPY();
		}
		else if(choice1 == 50 && choice2 == 7){
			SYPtoCNY();
		}
		else if(choice1 == 50 && choice2 == 8){
			SYPtoINR();
		}
		else if(choice1 == 50 && choice2 == 9){
			SYPtoDZD();
		}
		else if(choice1 == 50 && choice2 == 10){
			SYPtoARS();
		}
		else if(choice1 == 50 && choice2 == 11){
			SYPtoAUD();
		}
		else if(choice1 == 50 && choice2 == 12){
			SYPtoBRL();
		}
		else if(choice1 == 50 && choice2 == 13){
			SYPtoGBP();
		}
		else if(choice1 == 50 && choice2 == 14){
			SYPtoBGN();
		}
		else if(choice1 == 50 && choice2 == 15){
			SYPtoKHR();
		}
		else if(choice1 == 50 && choice2 == 16){
			SYPtoCAD();
		}
		else if(choice1 == 50 && choice2 == 17){
			SYPtoCLP();
		}
		else if(choice1 == 50 && choice2 == 18){
			SYPtoCOP();
		}
		else if(choice1 == 50 && choice2 == 19){
			SYPtoCRC();
		}
		else if(choice1 == 50 && choice2 == 20){
			SYPtoHRK();
		}
		else if(choice1 == 50 && choice2 == 21){
			SYPtoCZK();
		}
		else if(choice1 == 50 && choice2 == 22){
			SYPtoDKK();
		}
		else if(choice1 == 50 && choice2 == 23){
			SYPtoEGP();
		}
		else if(choice1 == 50 && choice2 == 24){
			SYPtoISK();
		}
		else if(choice1 == 50 && choice2 == 25){
			SYPtoIDR();
		}
		else if(choice1 == 50 && choice2 == 26){
			SYPtoIQD();
		}
		else if(choice1 == 50 && choice2 == 27){
			SYPtoILS();
		}
		else if(choice1 == 50 && choice2 == 28){
			SYPtoJOD();
		}
		else if(choice1 == 50 && choice2 == 29){
			SYPtoKES();
		}
		else if(choice1 == 50 && choice2 == 30){
			SYPtoKWD();
		}
		else if(choice1 == 50 && choice2 == 31){
			SYPtoMYR();
		}
		else if(choice1 == 50 && choice2 == 32){
			SYPtoMXN();
		}
		else if(choice1 == 50 && choice2 == 33){
			SYPtoMAD();
		}
		else if(choice1 == 50 && choice2 == 34){
			SYPtoMMK();
		}
		else if(choice1 == 50 && choice2 == 35){
			SYPtoTWD();
		}
		else if(choice1 == 50 && choice2 == 36){
			SYPtoNZD();
		}
		else if(choice1 == 50 && choice2 == 37){
			SYPtoNOK();
		}
		else if(choice1 == 50 && choice2 == 38){
			SYPtoPHP();
		}
		else if(choice1 == 50 && choice2 == 39){
			SYPtoQAR();
		}
		else if(choice1 == 50 && choice2 == 40){
			SYPtoRON();
		}
		else if(choice1 == 50 && choice2 == 41){
			SYPtoRUB();
		}
		else if(choice1 == 50 && choice2 == 42){
			SYPtoSAR();
		}
		else if(choice1 == 50 && choice2 == 43){
			SYPtoRSD();
		}
		else if(choice1 == 50 && choice2 == 44){
			SYPtoSGD();
		}
		else if(choice1 == 50 && choice2 == 45){
			SYPtoZAR();
		}
		else if(choice1 == 50 && choice2 == 46){
			SYPtoKRW();
		}
		else if(choice1 == 50 && choice2 == 47){
			SYPtoLKR();
		}
		else if(choice1 == 50 && choice2 == 48){
			SYPtoSEK();
		}
		else if(choice1 == 50 && choice2 == 49){
			SYPtoCHF();
		}
		else if(choice1 == 50 && choice2 == 50){
			SYPtoSYP();
		}
		else if(choice1 == 50 && choice2 == 51){
			SYPtoTZS();
		}
		else if(choice1 == 50 && choice2 == 52){
			SYPtoTHB();
		}
		else if(choice1 == 50 && choice2 == 53){
			SYPtoTRY();
		}
		else if(choice1 == 50 && choice2 == 54){
			SYPtoUGX();
		}
		else if(choice1 == 50 && choice2 == 55){
			SYPtoUAH();
		}
		else if(choice1 == 50 && choice2 == 56){
			SYPtoAED();
		}
		else if(choice1 == 50 && choice2 == 57){
			SYPtoVND();
		}
		else if(choice1 == 50 && choice2 == 58){
			SYPtoZMW();
		}
		//------------Tanzanian Shilling Conversion Choices----------//
		if(choice1 == 51 && choice2 == 1){
			TZStoUSD();
		}
		else if(choice1 == 51 && choice2 == 2){
			TZStoEUR();
		}
		else if(choice1 == 51 && choice2 == 3){
			TZStoHKD();
		}
		else if(choice1 == 51 && choice2 == 4){
			TZStoBitcoin();
		}
		else if(choice1 == 51 && choice2 == 5){
			TZStoBitcoinCash();
		}
		else if(choice1 == 51 && choice2 == 6){
			TZStoJPY();
		}
		else if(choice1 == 51 && choice2 == 7){
			TZStoCNY();
		}
		else if(choice1 == 51 && choice2 == 8){
			TZStoINR();
		}
		else if(choice1 == 51 && choice2 == 9){
			TZStoDZD();
		}
		else if(choice1 == 51 && choice2 == 10){
			TZStoARS();
		}
		else if(choice1 == 51 && choice2 == 11){
			TZStoAUD();
		}
		else if(choice1 == 51 && choice2 == 12){
			TZStoBRL();
		}
		else if(choice1 == 51 && choice2 == 13){
			TZStoGBP();
		}
		else if(choice1 == 51 && choice2 == 14){
			TZStoBGN();
		}
		else if(choice1 == 51 && choice2 == 15){
			TZStoKHR();
		}
		else if(choice1 == 51 && choice2 == 16){
			TZStoCAD();
		}
		else if(choice1 == 51 && choice2 == 17){
			TZStoCLP();
		}
		else if(choice1 == 51 && choice2 == 18){
			TZStoCOP();
		}
		else if(choice1 == 51 && choice2 == 19){
			TZStoCRC();
		}
		else if(choice1 == 51 && choice2 == 20){
			TZStoHRK();
		}
		else if(choice1 == 51 && choice2 == 21){
			TZStoCZK();
		}
		else if(choice1 == 51 && choice2 == 22){
			TZStoDKK();
		}
		else if(choice1 == 51 && choice2 == 23){
			TZStoEGP();
		}
		else if(choice1 == 51 && choice2 == 24){
			TZStoISK();
		}
		else if(choice1 == 51 && choice2 == 25){
			TZStoIDR();
		}
		else if(choice1 == 51 && choice2 == 26){
			TZStoIQD();
		}
		else if(choice1 == 51 && choice2 == 27){
			TZStoILS();
		}
		else if(choice1 == 51 && choice2 == 28){
			TZStoJOD();
		}
		else if(choice1 == 51 && choice2 == 29){
			TZStoKES();
		}
		else if(choice1 == 51 && choice2 == 30){
			TZStoKWD();
		}
		else if(choice1 == 51 && choice2 == 31){
			TZStoMYR();
		}
		else if(choice1 == 51 && choice2 == 32){
			TZStoMXN();
		}
		else if(choice1 == 51 && choice2 == 33){
			TZStoMAD();
		}
		else if(choice1 == 51 && choice2 == 34){
			TZStoMMK();
		}
		else if(choice1 == 51 && choice2 == 35){
			TZStoTWD();
		}
		else if(choice1 == 51 && choice2 == 36){
			TZStoNZD();
		}
		else if(choice1 == 51 && choice2 == 37){
			TZStoNOK();
		}
		else if(choice1 == 51 && choice2 == 38){
			TZStoPHP();
		}
		else if(choice1 == 51 && choice2 == 39){
			TZStoQAR();
		}
		else if(choice1 == 51 && choice2 == 40){
			TZStoRON();
		}
		else if(choice1 == 51 && choice2 == 41){
			TZStoRUB();
		}
		else if(choice1 == 51 && choice2 == 42){
			TZStoSAR();
		}
		else if(choice1 == 51 && choice2 == 43){
			TZStoRSD();
		}
		else if(choice1 == 51 && choice2 == 44){
			TZStoSGD();
		}
		else if(choice1 == 51 && choice2 == 45){
			TZStoZAR();
		}
		else if(choice1 == 51 && choice2 == 46){
			TZStoKRW();
		}
		else if(choice1 == 51 && choice2 == 47){
			TZStoLKR();
		}
		else if(choice1 == 51 && choice2 == 48){
			TZStoSEK();
		}
		else if(choice1 == 51 && choice2 == 49){
			TZStoCHF();
		}
		else if(choice1 == 51 && choice2 == 50){
			TZStoSYP();
		}
		else if(choice1 == 51 && choice2 == 51){
			TZStoTZS();
		}
		else if(choice1 == 51 && choice2 == 52){
			TZStoTHB();
		}
		else if(choice1 == 51 && choice2 == 53){
			TZStoTRY();
		}
		else if(choice1 == 51 && choice2 == 54){
			TZStoUGX();
		}
		else if(choice1 == 51 && choice2 == 55){
			TZStoUAH();
		}
		else if(choice1 == 51 && choice2 == 56){
			TZStoAED();
		}
		else if(choice1 == 51 && choice2 == 57){
			TZStoVND();
		}
		else if(choice1 == 51 && choice2 == 58){
			TZStoZMW();
		}
		//------------Thai Baht Conversion Choices----------//
		if(choice1 == 52 && choice2 == 1){
			THBtoUSD();
		}
		else if(choice1 == 52 && choice2 == 2){
			THBtoEUR();
		}
		else if(choice1 == 52 && choice2 == 3){
			THBtoHKD();
		}
		else if(choice1 == 52 && choice2 == 4){
			THBtoBitcoin();
		}
		else if(choice1 == 52 && choice2 == 5){
			THBtoBitcoinCash();
		}
		else if(choice1 == 52 && choice2 == 6){
			THBtoJPY();
		}
		else if(choice1 == 52 && choice2 == 7){
			THBtoCNY();
		}
		else if(choice1 == 52 && choice2 == 8){
			THBtoINR();
		}
		else if(choice1 == 52 && choice2 == 9){
			THBtoDZD();
		}
		else if(choice1 == 52 && choice2 == 10){
			THBtoARS();
		}
		else if(choice1 == 52 && choice2 == 11){
			THBtoAUD();
		}
		else if(choice1 == 52 && choice2 == 12){
			THBtoBRL();
		}
		else if(choice1 == 52 && choice2 == 13){
			THBtoGBP();
		}
		else if(choice1 == 52 && choice2 == 14){
			THBtoBGN();
		}
		else if(choice1 == 52 && choice2 == 15){
			THBtoKHR();
		}
		else if(choice1 == 52 && choice2 == 16){
			THBtoCAD();
		}
		else if(choice1 == 52 && choice2 == 17){
			THBtoCLP();
		}
		else if(choice1 == 52 && choice2 == 18){
			THBtoCOP();
		}
		else if(choice1 == 52 && choice2 == 19){
			THBtoCRC();
		}
		else if(choice1 == 52 && choice2 == 20){
			THBtoHRK();
		}
		else if(choice1 == 52 && choice2 == 21){
			THBtoCZK();
		}
		else if(choice1 == 52 && choice2 == 22){
			THBtoDKK();
		}
		else if(choice1 == 52 && choice2 == 23){
			THBtoEGP();
		}
		else if(choice1 == 52 && choice2 == 24){
			THBtoISK();
		}
		else if(choice1 == 52 && choice2 == 25){
			THBtoIDR();
		}
		else if(choice1 == 52 && choice2 == 26){
			THBtoIQD();
		}
		else if(choice1 == 52 && choice2 == 27){
			THBtoILS();
		}
		else if(choice1 == 52 && choice2 == 28){
			THBtoJOD();
		}
		else if(choice1 == 52 && choice2 == 29){
			THBtoKES();
		}
		else if(choice1 == 52 && choice2 == 30){
			THBtoKWD();
		}
		else if(choice1 == 52 && choice2 == 31){
			THBtoMYR();
		}
		else if(choice1 == 52 && choice2 == 32){
			THBtoMXN();
		}
		else if(choice1 == 52 && choice2 == 33){
			THBtoMAD();
		}
		else if(choice1 == 52 && choice2 == 34){
			THBtoMMK();
		}
		else if(choice1 == 52 && choice2 == 35){
			THBtoTWD();
		}
		else if(choice1 == 52 && choice2 == 36){
			THBtoNZD();
		}
		else if(choice1 == 52 && choice2 == 37){
			THBtoNOK();
		}
		else if(choice1 == 52 && choice2 == 38){
			THBtoPHP();
		}
		else if(choice1 == 52 && choice2 == 39){
			THBtoQAR();
		}
		else if(choice1 == 52 && choice2 == 40){
			THBtoRON();
		}
		else if(choice1 == 52 && choice2 == 41){
			THBtoRUB();
		}
		else if(choice1 == 52 && choice2 == 42){
			THBtoSAR();
		}
		else if(choice1 == 52 && choice2 == 43){
			THBtoRSD();
		}
		else if(choice1 == 52 && choice2 == 44){
			THBtoSGD();
		}
		else if(choice1 == 52 && choice2 == 45){
			THBtoZAR();
		}
		else if(choice1 == 52 && choice2 == 46){
			THBtoKRW();
		}
		else if(choice1 == 52 && choice2 == 47){
			THBtoLKR();
		}
		else if(choice1 == 52 && choice2 == 48){
			THBtoSEK();
		}
		else if(choice1 == 52 && choice2 == 49){
			THBtoCHF();
		}
		else if(choice1 == 52 && choice2 == 50){
			THBtoSYP();
		}
		else if(choice1 == 52 && choice2 == 51){
			THBtoTZS();
		}
		else if(choice1 == 52 && choice2 == 52){
			THBtoTHB();
		}
		else if(choice1 == 52 && choice2 == 53){
			THBtoTRY();
		}
		else if(choice1 == 52 && choice2 == 54){
			THBtoUGX();
		}
		else if(choice1 == 52 && choice2 == 55){
			THBtoUAH();
		}
		else if(choice1 == 52 && choice2 == 56){
			THBtoAED();
		}
		else if(choice1 == 52 && choice2 == 57){
			THBtoVND();
		}
		else if(choice1 == 52 && choice2 == 58){
			THBtoZMW();
		}
		//------------Turkish Lira Conversion Choices----------//
		if(choice1 == 53 && choice2 == 1){
			TRYtoUSD();
		}
		else if(choice1 == 53 && choice2 == 2){
			TRYtoEUR();
		}
		else if(choice1 == 53 && choice2 == 3){
			TRYtoHKD();
		}
		else if(choice1 == 53 && choice2 == 4){
			TRYtoBitcoin();
		}
		else if(choice1 == 53 && choice2 == 5){
			TRYtoBitcoinCash();
		}
		else if(choice1 == 53 && choice2 == 6){
			TRYtoJPY();
		}
		else if(choice1 == 53 && choice2 == 7){
			TRYtoCNY();
		}
		else if(choice1 == 53 && choice2 == 8){
			TRYtoINR();
		}
		else if(choice1 == 53 && choice2 == 9){
			TRYtoDZD();
		}
		else if(choice1 == 53 && choice2 == 10){
			TRYtoARS();
		}
		else if(choice1 == 53 && choice2 == 11){
			TRYtoAUD();
		}
		else if(choice1 == 53 && choice2 == 12){
			TRYtoBRL();
		}
		else if(choice1 == 53 && choice2 == 13){
			TRYtoGBP();
		}
		else if(choice1 == 53 && choice2 == 14){
			TRYtoBGN();
		}
		else if(choice1 == 53 && choice2 == 15){
			TRYtoKHR();
		}
		else if(choice1 == 53 && choice2 == 16){
			TRYtoCAD();
		}
		else if(choice1 == 53 && choice2 == 17){
			TRYtoCLP();
		}
		else if(choice1 == 53 && choice2 == 18){
			TRYtoCOP();
		}
		else if(choice1 == 53 && choice2 == 19){
			TRYtoCRC();
		}
		else if(choice1 == 53 && choice2 == 20){
			TRYtoHRK();
		}
		else if(choice1 == 53 && choice2 == 21){
			TRYtoCZK();
		}
		else if(choice1 == 53 && choice2 == 22){
			TRYtoDKK();
		}
		else if(choice1 == 53 && choice2 == 23){
			TRYtoEGP();
		}
		else if(choice1 == 53 && choice2 == 24){
			TRYtoISK();
		}
		else if(choice1 == 53 && choice2 == 25){
			TRYtoIDR();
		}
		else if(choice1 == 53 && choice2 == 26){
			TRYtoIQD();
		}
		else if(choice1 == 53 && choice2 == 27){
			TRYtoILS();
		}
		else if(choice1 == 53 && choice2 == 28){
			TRYtoJOD();
		}
		else if(choice1 == 53 && choice2 == 29){
			TRYtoKES();
		}
		else if(choice1 == 53 && choice2 == 30){
			TRYtoKWD();
		}
		else if(choice1 == 53 && choice2 == 31){
			TRYtoMYR();
		}
		else if(choice1 == 53 && choice2 == 32){
			TRYtoMXN();
		}
		else if(choice1 == 53 && choice2 == 33){
			TRYtoMAD();
		}
		else if(choice1 == 53 && choice2 == 34){
			TRYtoMMK();
		}
		else if(choice1 == 53 && choice2 == 35){
			TRYtoTWD();
		}
		else if(choice1 == 53 && choice2 == 36){
			TRYtoNZD();
		}
		else if(choice1 == 53 && choice2 == 37){
			TRYtoNOK();
		}
		else if(choice1 == 53 && choice2 == 38){
			TRYtoPHP();
		}
		else if(choice1 == 53 && choice2 == 39){
			TRYtoQAR();
		}
		else if(choice1 == 53 && choice2 == 40){
			TRYtoRON();
		}
		else if(choice1 == 53 && choice2 == 41){
			TRYtoRUB();
		}
		else if(choice1 == 53 && choice2 == 42){
			TRYtoSAR();
		}
		else if(choice1 == 53 && choice2 == 43){
			TRYtoRSD();
		}
		else if(choice1 == 53 && choice2 == 44){
			TRYtoSGD();
		}
		else if(choice1 == 53 && choice2 == 45){
			TRYtoZAR();
		}
		else if(choice1 == 53 && choice2 == 46){
			TRYtoKRW();
		}
		else if(choice1 == 53 && choice2 == 47){
			TRYtoLKR();
		}
		else if(choice1 == 53 && choice2 == 48){
			TRYtoSEK();
		}
		else if(choice1 == 53 && choice2 == 49){
			TRYtoCHF();
		}
		else if(choice1 == 53 && choice2 == 50){
			TRYtoSYP();
		}
		else if(choice1 == 53 && choice2 == 51){
			TRYtoTZS();
		}
		else if(choice1 == 53 && choice2 == 52){
			TRYtoTHB();
		}
		else if(choice1 == 53 && choice2 == 53){
			TRYtoTRY();
		}
		else if(choice1 == 53 && choice2 == 54){
			TRYtoUGX();
		}
		else if(choice1 == 53 && choice2 == 55){
			TRYtoUAH();
		}
		else if(choice1 == 53 && choice2 == 56){
			TRYtoAED();
		}
		else if(choice1 == 53 && choice2 == 57){
			TRYtoVND();
		}
		else if(choice1 == 53 && choice2 == 58){
			TRYtoZMW();
		}
		//--------------------------------------------//

		//------------Ugandan Shilling Conversion Choices----------//
		if(choice1 == 54 && choice2 == 1){
			UGXtoUSD();
		}
		else if(choice1 == 54 && choice2 == 2){
			UGXtoEUR();
		}
		else if(choice1 == 54 && choice2 == 3){
			UGXtoHKD();
		}
		else if(choice1 == 54 && choice2 == 4){
			UGXtoBitcoin();
		}
		else if(choice1 == 54 && choice2 == 5){
			UGXtoBitcoinCash();
		}
		else if(choice1 == 54 && choice2 == 6){
			UGXtoJPY();
		}
		else if(choice1 == 54 && choice2 == 7){
			UGXtoCNY();
		}
		else if(choice1 == 54 && choice2 == 8){
			UGXtoINR();
		}
		else if(choice1 == 54 && choice2 == 9){
			UGXtoDZD();
		}
		else if(choice1 == 54 && choice2 == 10){
			UGXtoARS();
		}
		else if(choice1 == 54 && choice2 == 11){
			UGXtoAUD();
		}
		else if(choice1 == 54 && choice2 == 12){
			UGXtoBRL();
		}
		else if(choice1 == 54 && choice2 == 13){
			UGXtoGBP();
		}
		else if(choice1 == 54 && choice2 == 14){
			UGXtoBGN();
		}
		else if(choice1 == 54 && choice2 == 15){
			UGXtoKHR();
		}
		else if(choice1 == 54 && choice2 == 16){
			UGXtoCAD();
		}
		else if(choice1 == 54 && choice2 == 17){
			UGXtoCLP();
		}
		else if(choice1 == 54 && choice2 == 18){
			UGXtoCOP();
		}
		else if(choice1 == 54 && choice2 == 19){
			UGXtoCRC();
		}
		else if(choice1 == 54 && choice2 == 20){
			UGXtoHRK();
		}
		else if(choice1 == 54 && choice2 == 21){
			UGXtoCZK();
		}
		else if(choice1 == 54 && choice2 == 22){
			UGXtoDKK();
		}
		else if(choice1 == 54 && choice2 == 23){
			UGXtoEGP();
		}
		else if(choice1 == 54 && choice2 == 24){
			UGXtoISK();
		}
		else if(choice1 == 54 && choice2 == 25){
			UGXtoIDR();
		}
		else if(choice1 == 54 && choice2 == 26){
			UGXtoIQD();
		}
		else if(choice1 == 54 && choice2 == 27){
			UGXtoILS();
		}
		else if(choice1 == 54 && choice2 == 28){
			UGXtoJOD();
		}
		else if(choice1 == 54 && choice2 == 29){
			UGXtoKES();
		}
		else if(choice1 == 54 && choice2 == 30){
			UGXtoKWD();
		}
		else if(choice1 == 54 && choice2 == 31){
			UGXtoMYR();
		}
		else if(choice1 == 54 && choice2 == 32){
			UGXtoMXN();
		}
		else if(choice1 == 54 && choice2 == 33){
			UGXtoMAD();
		}
		else if(choice1 == 54 && choice2 == 34){
			UGXtoMMK();
		}
		else if(choice1 == 54 && choice2 == 35){
			UGXtoTWD();
		}
		else if(choice1 == 54 && choice2 == 36){
			UGXtoNZD();
		}
		else if(choice1 == 54 && choice2 == 37){
			UGXtoNOK();
		}
		else if(choice1 == 54 && choice2 == 38){
			UGXtoPHP();
		}
		else if(choice1 == 54 && choice2 == 39){
			UGXtoQAR();
		}
		else if(choice1 == 54 && choice2 == 40){
			UGXtoRON();
		}
		else if(choice1 == 54 && choice2 == 41){
			UGXtoRUB();
		}
		else if(choice1 == 54 && choice2 == 42){
			UGXtoSAR();
		}
		else if(choice1 == 54 && choice2 == 43){
			UGXtoRSD();
		}
		else if(choice1 == 54 && choice2 == 44){
			UGXtoSGD();
		}
		else if(choice1 == 54 && choice2 == 45){
			UGXtoZAR();
		}
		else if(choice1 == 54 && choice2 == 46){
			UGXtoKRW();
		}
		else if(choice1 == 54 && choice2 == 47){
			UGXtoLKR();
		}
		else if(choice1 == 54 && choice2 == 48){
			UGXtoSEK();
		}
		else if(choice1 == 54 && choice2 == 49){
			UGXtoCHF();
		}
		else if(choice1 == 54 && choice2 == 50){
			UGXtoSYP();
		}
		else if(choice1 == 54 && choice2 == 51){
			UGXtoTZS();
		}
		else if(choice1 == 54 && choice2 == 52){
			UGXtoTHB();
		}
		else if(choice1 == 54 && choice2 == 53){
			UGXtoTRY();
		}
		else if(choice1 == 54 && choice2 == 54){
			UGXtoUGX();
		}
		else if(choice1 == 54 && choice2 == 55){
			UGXtoUAH();
		}
		else if(choice1 == 54 && choice2 == 56){
			UGXtoAED();
		}
		else if(choice1 == 54 && choice2 == 57){
			UGXtoVND();
		}
		else if(choice1 == 54 && choice2 == 58){
			UGXtoZMW();
		}
		//------------Ukrainian Hryvnia Conversion Choices----------//
		if(choice1 == 55 && choice2 == 1){
			UAHtoUSD();
		}
		else if(choice1 == 55 && choice2 == 2){
			UAHtoEUR();
		}
		else if(choice1 == 55 && choice2 == 3){
			UAHtoHKD();
		}
		else if(choice1 == 55 && choice2 == 4){
			UAHtoBitcoin();
		}
		else if(choice1 == 55 && choice2 == 5){
			UAHtoBitcoinCash();
		}
		else if(choice1 == 55 && choice2 == 6){
			UAHtoJPY();
		}
		else if(choice1 == 55 && choice2 == 7){
			UAHtoCNY();
		}
		else if(choice1 == 55 && choice2 == 8){
			UAHtoINR();
		}
		else if(choice1 == 55 && choice2 == 9){
			UAHtoDZD();
		}
		else if(choice1 == 55 && choice2 == 10){
			UAHtoARS();
		}
		else if(choice1 == 55 && choice2 == 11){
			UAHtoAUD();
		}
		else if(choice1 == 55 && choice2 == 12){
			UAHtoBRL();
		}
		else if(choice1 == 55 && choice2 == 13){
			UAHtoGBP();
		}
		else if(choice1 == 55 && choice2 == 14){
			UAHtoBGN();
		}
		else if(choice1 == 55 && choice2 == 15){
			UAHtoKHR();
		}
		else if(choice1 == 55 && choice2 == 16){
			UAHtoCAD();
		}
		else if(choice1 == 55 && choice2 == 17){
			UAHtoCLP();
		}
		else if(choice1 == 55 && choice2 == 18){
			UAHtoCOP();
		}
		else if(choice1 == 55 && choice2 == 19){
			UAHtoCRC();
		}
		else if(choice1 == 55 && choice2 == 20){
			UAHtoHRK();
		}
		else if(choice1 == 55 && choice2 == 21){
			UAHtoCZK();
		}
		else if(choice1 == 55 && choice2 == 22){
			UAHtoDKK();
		}
		else if(choice1 == 55 && choice2 == 23){
			UAHtoEGP();
		}
		else if(choice1 == 55 && choice2 == 24){
			UAHtoISK();
		}
		else if(choice1 == 55 && choice2 == 25){
			UAHtoIDR();
		}
		else if(choice1 == 55 && choice2 == 26){
			UAHtoIQD();
		}
		else if(choice1 == 55 && choice2 == 27){
			UAHtoILS();
		}
		else if(choice1 == 55 && choice2 == 28){
			UAHtoJOD();
		}
		else if(choice1 == 55 && choice2 == 29){
			UAHtoKES();
		}
		else if(choice1 == 55 && choice2 == 30){
			UAHtoKWD();
		}
		else if(choice1 == 55 && choice2 == 31){
			UAHtoMYR();
		}
		else if(choice1 == 55 && choice2 == 32){
			UAHtoMXN();
		}
		else if(choice1 == 55 && choice2 == 33){
			UAHtoMAD();
		}
		else if(choice1 == 55 && choice2 == 34){
			UAHtoMMK();
		}
		else if(choice1 == 55 && choice2 == 35){
			UAHtoTWD();
		}
		else if(choice1 == 55 && choice2 == 36){
			UAHtoNZD();
		}
		else if(choice1 == 55 && choice2 == 37){
			UAHtoNOK();
		}
		else if(choice1 == 55 && choice2 == 38){
			UAHtoPHP();
		}
		else if(choice1 == 55 && choice2 == 39){
			UAHtoQAR();
		}
		else if(choice1 == 55 && choice2 == 40){
			UAHtoRON();
		}
		else if(choice1 == 55 && choice2 == 41){
			UAHtoRUB();
		}
		else if(choice1 == 55 && choice2 == 42){
			UAHtoSAR();
		}
		else if(choice1 == 55 && choice2 == 43){
			UAHtoRSD();
		}
		else if(choice1 == 55 && choice2 == 44){
			UAHtoSGD();
		}
		else if(choice1 == 55 && choice2 == 45){
			UAHtoZAR();
		}
		else if(choice1 == 55 && choice2 == 46){
			UAHtoKRW();
		}
		else if(choice1 == 55 && choice2 == 47){
			UAHtoLKR();
		}
		else if(choice1 == 55 && choice2 == 48){
			UAHtoSEK();
		}
		else if(choice1 == 55 && choice2 == 49){
			UAHtoCHF();
		}
		else if(choice1 == 55 && choice2 == 50){
			UAHtoSYP();
		}
		else if(choice1 == 55 && choice2 == 51){
			UAHtoTZS();
		}
		else if(choice1 == 55 && choice2 == 52){
			UAHtoTHB();
		}
		else if(choice1 == 55 && choice2 == 53){
			UAHtoTRY();
		}
		else if(choice1 == 55 && choice2 == 54){
			UAHtoUGX();
		}
		else if(choice1 == 55 && choice2 == 55){
			UAHtoUAH();
		}
		else if(choice1 == 55 && choice2 == 56){
			UAHtoAED();
		}
		else if(choice1 == 55 && choice2 == 57){
			UAHtoVND();
		}
		else if(choice1 == 55 && choice2 == 58){
			UAHtoZMW();
		}
		//---------------------------------------------------------------//

		//------------United Arab Emirates Dirham Conversion Choices----------//
		if(choice1 == 56 && choice2 == 1){
			AEDtoUSD();
		}
		else if(choice1 == 56 && choice2 == 2){
			AEDtoEUR();
		}
		else if(choice1 == 56 && choice2 == 3){
			AEDtoHKD();
		}
		else if(choice1 == 56 && choice2 == 4){
			AEDtoBitcoin();
		}
		else if(choice1 == 56 && choice2 == 5){
			AEDtoBitcoinCash();
		}
		else if(choice1 == 56 && choice2 == 6){
			AEDtoJPY();
		}
		else if(choice1 == 56 && choice2 == 7){
			AEDtoCNY();
		}
		else if(choice1 == 56 && choice2 == 8){
			AEDtoINR();
		}
		else if(choice1 == 56 && choice2 == 9){
			AEDtoDZD();
		}
		else if(choice1 == 56 && choice2 == 10){
			AEDtoARS();
		}
		else if(choice1 == 56 && choice2 == 11){
			AEDtoAUD();
		}
		else if(choice1 == 56 && choice2 == 12){
			AEDtoBRL();
		}
		else if(choice1 == 56 && choice2 == 13){
			AEDtoGBP();
		}
		else if(choice1 == 56 && choice2 == 14){
			AEDtoBGN();
		}
		else if(choice1 == 56 && choice2 == 15){
			AEDtoKHR();
		}
		else if(choice1 == 56 && choice2 == 16){
			AEDtoCAD();
		}
		else if(choice1 == 56 && choice2 == 17){
			AEDtoCLP();
		}
		else if(choice1 == 56 && choice2 == 18){
			AEDtoCOP();
		}
		else if(choice1 == 56 && choice2 == 19){
			AEDtoCRC();
		}
		else if(choice1 == 56 && choice2 == 20){
			AEDtoHRK();
		}
		else if(choice1 == 56 && choice2 == 21){
			AEDtoCZK();
		}
		else if(choice1 == 56 && choice2 == 22){
			AEDtoDKK();
		}
		else if(choice1 == 56 && choice2 == 23){
			AEDtoEGP();
		}
		else if(choice1 == 56 && choice2 == 24){
			AEDtoISK();
		}
		else if(choice1 == 56 && choice2 == 25){
			AEDtoIDR();
		}
		else if(choice1 == 56 && choice2 == 26){
			AEDtoIQD();
		}
		else if(choice1 == 56 && choice2 == 27){
			AEDtoILS();
		}
		else if(choice1 == 56 && choice2 == 28){
			AEDtoJOD();
		}
		else if(choice1 == 56 && choice2 == 29){
			AEDtoKES();
		}
		else if(choice1 == 56 && choice2 == 30){
			AEDtoKWD();
		}
		else if(choice1 == 56 && choice2 == 31){
			AEDtoMYR();
		}
		else if(choice1 == 56 && choice2 == 32){
			AEDtoMXN();
		}
		else if(choice1 == 56 && choice2 == 33){
			AEDtoMAD();
		}
		else if(choice1 == 56 && choice2 == 34){
			AEDtoMMK();
		}
		else if(choice1 == 56 && choice2 == 35){
			AEDtoTWD();
		}
		else if(choice1 == 56 && choice2 == 36){
			AEDtoNZD();
		}
		else if(choice1 == 56 && choice2 == 37){
			AEDtoNOK();
		}
		else if(choice1 == 56 && choice2 == 38){
			AEDtoPHP();
		}
		else if(choice1 == 56 && choice2 == 39){
			AEDtoQAR();
		}
		else if(choice1 == 56 && choice2 == 40){
			AEDtoRON();
		}
		else if(choice1 == 56 && choice2 == 41){
			AEDtoRUB();
		}
		else if(choice1 == 56 && choice2 == 42){
			AEDtoSAR();
		}
		else if(choice1 == 56 && choice2 == 43){
			AEDtoRSD();
		}
		else if(choice1 == 56 && choice2 == 44){
			AEDtoSGD();
		}
		else if(choice1 == 56 && choice2 == 45){
			AEDtoZAR();
		}
		else if(choice1 == 56 && choice2 == 46){
			AEDtoKRW();
		}
		else if(choice1 == 56 && choice2 == 47){
			AEDtoLKR();
		}
		else if(choice1 == 56 && choice2 == 48){
			AEDtoSEK();
		}
		else if(choice1 == 56 && choice2 == 49){
			AEDtoCHF();
		}
		else if(choice1 == 56 && choice2 == 50){
			AEDtoSYP();
		}
		else if(choice1 == 56 && choice2 == 51){
			AEDtoTZS();
		}
		else if(choice1 == 56 && choice2 == 52){
			AEDtoTHB();
		}
		else if(choice1 == 56 && choice2 == 53){
			AEDtoTRY();
		}
		else if(choice1 == 56 && choice2 == 54){
			AEDtoUGX();
		}
		else if(choice1 == 56 && choice2 == 55){
			AEDtoUAH();
		}
		else if(choice1 == 56 && choice2 == 56){
			AEDtoAED();
		}
		else if(choice1 == 56 && choice2 == 57){
			AEDtoVND();
		}
		else if(choice1 == 56 && choice2 == 58){
			AEDtoZMW();
		}
		//------------Vietnamese Dong Conversion Choices----------//
		if(choice1 == 57 && choice2 == 1){
			VNDtoUSD();
		}
		else if(choice1 == 57 && choice2 == 2){
			VNDtoEUR();
		}
		else if(choice1 == 57 && choice2 == 3){
			VNDtoHKD();
		}
		else if(choice1 == 57 && choice2 == 4){
			VNDtoBitcoin();
		}
		else if(choice1 == 57 && choice2 == 5){
			VNDtoBitcoinCash();
		}
		else if(choice1 == 57 && choice2 == 6){
			VNDtoJPY();
		}
		else if(choice1 == 57 && choice2 == 7){
			VNDtoCNY();
		}
		else if(choice1 == 57 && choice2 == 8){
			VNDtoINR();
		}
		else if(choice1 == 57 && choice2 == 9){
			VNDtoDZD();
		}
		else if(choice1 == 57 && choice2 == 10){
			VNDtoARS();
		}
		else if(choice1 == 57 && choice2 == 11){
			VNDtoAUD();
		}
		else if(choice1 == 57 && choice2 == 12){
			VNDtoBRL();
		}
		else if(choice1 == 57 && choice2 == 13){
			VNDtoGBP();
		}
		else if(choice1 == 57 && choice2 == 14){
			VNDtoBGN();
		}
		else if(choice1 == 57 && choice2 == 15){
			VNDtoKHR();
		}
		else if(choice1 == 57 && choice2 == 16){
			VNDtoCAD();
		}
		else if(choice1 == 57 && choice2 == 17){
			VNDtoCLP();
		}
		else if(choice1 == 57 && choice2 == 18){
			VNDtoCOP();
		}
		else if(choice1 == 57 && choice2 == 19){
			VNDtoCRC();
		}
		else if(choice1 == 57 && choice2 == 20){
			VNDtoHRK();
		}
		else if(choice1 == 57 && choice2 == 21){
			VNDtoCZK();
		}
		else if(choice1 == 57 && choice2 == 22){
			VNDtoDKK();
		}
		else if(choice1 == 57 && choice2 == 23){
			VNDtoEGP();
		}
		else if(choice1 == 57 && choice2 == 24){
			VNDtoISK();
		}
		else if(choice1 == 57 && choice2 == 25){
			VNDtoIDR();
		}
		else if(choice1 == 57 && choice2 == 26){
			VNDtoIQD();
		}
		else if(choice1 == 57 && choice2 == 27){
			VNDtoILS();
		}
		else if(choice1 == 57 && choice2 == 28){
			VNDtoJOD();
		}
		else if(choice1 == 57 && choice2 == 29){
			VNDtoKES();
		}
		else if(choice1 == 57 && choice2 == 30){
			VNDtoKWD();
		}
		else if(choice1 == 57 && choice2 == 31){
			VNDtoMYR();
		}
		else if(choice1 == 57 && choice2 == 32){
			VNDtoMXN();
		}
		else if(choice1 == 57 && choice2 == 33){
			VNDtoMAD();
		}
		else if(choice1 == 57 && choice2 == 34){
			VNDtoMMK();
		}
		else if(choice1 == 57 && choice2 == 35){
			VNDtoTWD();
		}
		else if(choice1 == 57 && choice2 == 36){
			VNDtoNZD();
		}
		else if(choice1 == 57 && choice2 == 37){
			VNDtoNOK();
		}
		else if(choice1 == 57 && choice2 == 38){
			VNDtoPHP();
		}
		else if(choice1 == 57 && choice2 == 39){
			VNDtoQAR();
		}
		else if(choice1 == 57 && choice2 == 40){
			VNDtoRON();
		}
		else if(choice1 == 57 && choice2 == 41){
			VNDtoRUB();
		}
		else if(choice1 == 57 && choice2 == 42){
			VNDtoSAR();
		}
		else if(choice1 == 57 && choice2 == 43){
			VNDtoRSD();
		}
		else if(choice1 == 57 && choice2 == 44){
			VNDtoSGD();
		}
		else if(choice1 == 57 && choice2 == 45){
			VNDtoZAR();
		}
		else if(choice1 == 57 && choice2 == 46){
			VNDtoKRW();
		}
		else if(choice1 == 57 && choice2 == 47){
			VNDtoLKR();
		}
		else if(choice1 == 57 && choice2 == 48){
			VNDtoSEK();
		}
		else if(choice1 == 57 && choice2 == 49){
			VNDtoCHF();
		}
		else if(choice1 == 57 && choice2 == 50){
			VNDtoSYP();
		}
		else if(choice1 == 57 && choice2 == 51){
			VNDtoTZS();
		}
		else if(choice1 == 57 && choice2 == 52){
			VNDtoTHB();
		}
		else if(choice1 == 57 && choice2 == 53){
			VNDtoTRY();
		}
		else if(choice1 == 57 && choice2 == 54){
			VNDtoUGX();
		}
		else if(choice1 == 57 && choice2 == 55){
			VNDtoUAH();
		}
		else if(choice1 == 57 && choice2 == 56){
			VNDtoAED();
		}
		else if(choice1 == 57 && choice2 == 57){
			VNDtoVND();
		}
		else if(choice1 == 57 && choice2 == 58){
			VNDtoZMW();
		}
		//------------Zambian Kwacha Conversion Choices----------//
		if(choice1 == 58 && choice2 == 1){
			ZMWtoUSD();
		}
		else if(choice1 == 58 && choice2 == 2){
			ZMWtoEUR();
		}
		else if(choice1 == 58 && choice2 == 3){
			ZMWtoHKD();
		}
		else if(choice1 == 58 && choice2 == 4){
			ZMWtoBitcoin();
		}
		else if(choice1 == 58 && choice2 == 5){
			ZMWtoBitcoinCash();
		}
		else if(choice1 == 58 && choice2 == 6){
			ZMWtoJPY();
		}
		else if(choice1 == 58 && choice2 == 7){
			ZMWtoCNY();
		}
		else if(choice1 == 58 && choice2 == 8){
			ZMWtoINR();
		}
		else if(choice1 == 58 && choice2 == 9){
			ZMWtoDZD();
		}
		else if(choice1 == 58 && choice2 == 10){
			ZMWtoARS();
		}
		else if(choice1 == 58 && choice2 == 11){
			ZMWtoAUD();
		}
		else if(choice1 == 58 && choice2 == 12){
			ZMWtoBRL();
		}
		else if(choice1 == 58 && choice2 == 13){
			ZMWtoGBP();
		}
		else if(choice1 == 58 && choice2 == 14){
			ZMWtoBGN();
		}
		else if(choice1 == 58 && choice2 == 15){
			ZMWtoKHR();
		}
		else if(choice1 == 58 && choice2 == 16){
			ZMWtoCAD();
		}
		else if(choice1 == 58 && choice2 == 17){
			ZMWtoCLP();
		}
		else if(choice1 == 58 && choice2 == 18){
			ZMWtoCOP();
		}
		else if(choice1 == 58 && choice2 == 19){
			ZMWtoCRC();
		}
		else if(choice1 == 58 && choice2 == 20){
			ZMWtoHRK();
		}
		else if(choice1 == 58 && choice2 == 21){
			ZMWtoCZK();
		}
		else if(choice1 == 58 && choice2 == 22){
			ZMWtoDKK();
		}
		else if(choice1 == 58 && choice2 == 23){
			ZMWtoEGP();
		}
		else if(choice1 == 58 && choice2 == 24){
			ZMWtoISK();
		}
		else if(choice1 == 58 && choice2 == 25){
			ZMWtoIDR();
		}
		else if(choice1 == 58 && choice2 == 26){
			ZMWtoIQD();
		}
		else if(choice1 == 58 && choice2 == 27){
			ZMWtoILS();
		}
		else if(choice1 == 58 && choice2 == 28){
			ZMWtoJOD();
		}
		else if(choice1 == 58 && choice2 == 29){
			ZMWtoKES();
		}
		else if(choice1 == 58 && choice2 == 30){
			ZMWtoKWD();
		}
		else if(choice1 == 58 && choice2 == 31){
			ZMWtoMYR();
		}
		else if(choice1 == 58 && choice2 == 32){
			ZMWtoMXN();
		}
		else if(choice1 == 58 && choice2 == 33){
			ZMWtoMAD();
		}
		else if(choice1 == 58 && choice2 == 34){
			ZMWtoMMK();
		}
		else if(choice1 == 58 && choice2 == 35){
			ZMWtoTWD();
		}
		else if(choice1 == 58 && choice2 == 36){
			ZMWtoNZD();
		}
		else if(choice1 == 58 && choice2 == 37){
			ZMWtoNOK();
		}
		else if(choice1 == 58 && choice2 == 38){
			ZMWtoPHP();
		}
		else if(choice1 == 58 && choice2 == 39){
			ZMWtoQAR();
		}
		else if(choice1 == 58 && choice2 == 40){
			ZMWtoRON();
		}
		else if(choice1 == 58 && choice2 == 41){
			ZMWtoRUB();
		}
		else if(choice1 == 58 && choice2 == 42){
			ZMWtoSAR();
		}
		else if(choice1 == 58 && choice2 == 43){
			ZMWtoRSD();
		}
		else if(choice1 == 58 && choice2 == 44){
			ZMWtoSGD();
		}
		else if(choice1 == 58 && choice2 == 45){
			ZMWtoZAR();
		}
		else if(choice1 == 58 && choice2 == 46){
			ZMWtoKRW();
		}
		else if(choice1 == 58 && choice2 == 47){
			ZMWtoLKR();
		}
		else if(choice1 == 58 && choice2 == 48){
			ZMWtoSEK();
		}
		else if(choice1 == 58 && choice2 == 49){
			ZMWtoCHF();
		}
		else if(choice1 == 58 && choice2 == 50){
			ZMWtoSYP();
		}
		else if(choice1 == 58 && choice2 == 51){
			ZMWtoTZS();
		}
		else if(choice1 == 58 && choice2 == 52){
			ZMWtoTHB();
		}
		else if(choice1 == 58 && choice2 == 53){
			ZMWtoTRY();
		}
		else if(choice1 == 58 && choice2 == 54){
			ZMWtoUGX();
		}
		else if(choice1 == 58 && choice2 == 55){
			ZMWtoUAH();
		}
		else if(choice1 == 58 && choice2 == 56){
			ZMWtoAED();
		}
		else if(choice1 == 58 && choice2 == 57){
			ZMWtoVND();
		}
		else if(choice1 == 58 && choice2 == 58){
			ZMWtoZMW();
		}
		outputUnit();
	}

	public static void outputUnit(){
		System.out.println("\n " + unit +" "+units[choice2-1]);
		System.out.println("Press Enter!");
	}
	//---------------USD Conversions-------------------//
	public static void USDtoUSD(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void USDtoEUR(){
		unit= unit.multiply(new BigDecimal("0.87"));
	}
	public static void USDtoHKD(){
		unit= unit.multiply(new BigDecimal("7.84"));
	}
	public static void USDtoBitcoin(){
		unit= unit.multiply(new BigDecimal("0.00015"));
	}
	public static void USDtoBitcoinCash(){
		unit= unit.multiply(new BigDecimal("0.0019"));
	}
	public static void USDtoJPY(){
		unit= unit.multiply(new BigDecimal("112.50"));
	}
	public static void USDtoCNY(){
		unit= unit.multiply(new BigDecimal("6.92"));
	}
	public static void USDtoINR(){
		unit= unit.multiply(new BigDecimal("74.26"));
	}
	public static void USDtoDZD(){
		unit= unit.multiply(new BigDecimal("118.46"));
	}
	public static void USDtoARS(){
		unit= unit.multiply(new BigDecimal("37.18"));
	}
	public static void USDtoAUD(){
		unit= unit.multiply(new BigDecimal("1.41"));
	}
	public static void USDtoBRL(){
		unit= unit.multiply(new BigDecimal("3.76"));
	}
	public static void USDtoGBP(){
		unit= unit.multiply(new BigDecimal("0.76"));
	}
	public static void USDtoBGN(){
		unit= unit.multiply(new BigDecimal("1.70"));
	}
	public static void USDtoKHR(){
		unit= unit.multiply(new BigDecimal("4080.00"));
	}
	public static void USDtoCAD(){
		unit= unit.multiply(new BigDecimal("1.30"));
	}
	public static void USDtoCLP(){
		unit= unit.multiply(new BigDecimal("687.50"));
	}
	public static void USDtoCOP(){
		unit= unit.multiply(new BigDecimal("3095.25"));
	}
	public static void USDtoCRC(){
		unit= unit.multiply(new BigDecimal("590.60"));
	}
	public static void USDtoHRK(){
		unit= unit.multiply(new BigDecimal("6.43"));
	}
	public static void USDtoCZK(){
		unit= unit.multiply(new BigDecimal("22.46"));
	}
	public static void USDtoDKK(){
		unit= unit.multiply(new BigDecimal("6.47"));
	}
	public static void USDtoEGP(){
		unit= unit.multiply(new BigDecimal("17.91"));
	}
	public static void USDtoISK(){
		unit= unit.multiply(new BigDecimal("116.54"));
	}
	public static void USDtoIDR(){
		unit= unit.multiply(new BigDecimal("15232.25"));
	}
	public static void USDtoIQD(){
		unit= unit.multiply(new BigDecimal("1190.00"));
	}
	public static void USDtoILS(){
		unit= unit.multiply(new BigDecimal("3.63"));
	}
	public static void USDtoJOD(){
		unit= unit.multiply(new BigDecimal("0.71"));
	}
	public static void USDtoKES(){
		unit= unit.multiply(new BigDecimal("101.00"));
	}
	public static void USDtoKWD(){
		unit= unit.multiply(new BigDecimal("0.30"));
	}
	public static void USDtoMYR(){
		unit= unit.multiply(new BigDecimal("4.15"));
	}
	public static void USDtoMXN(){
		unit= unit.multiply(new BigDecimal("19.13"));
	}
	public static void USDtoMAD(){
		unit= unit.multiply(new BigDecimal("9.47"));
	}
	public static void USDtoMMK(){
		unit= unit.multiply(new BigDecimal("1589.50"));
	}
	public static void USDtoTWD(){
		unit= unit.multiply(new BigDecimal("31.06"));
	}
	public static void USDtoNZD(){
		unit= unit.multiply(new BigDecimal("1.55"));
	}
	public static void USDtoNOK(){
		unit= unit.multiply(new BigDecimal("8.22"));
	}
	public static void USDtoPHP(){
		unit= unit.multiply(new BigDecimal("54.19"));
	}
	public static void USDtoQAR(){
		unit= unit.multiply(new BigDecimal("3.64"));
	}
	public static void USDtoRON(){
		unit= unit.multiply(new BigDecimal("4.05"));
	}
	public static void USDtoRUB(){
		unit= unit.multiply(new BigDecimal("66.76"));
	}
	public static void USDtoSAR(){
		unit= unit.multiply(new BigDecimal("3.75"));
	}
	public static void USDtoRSD(){
		unit= unit.multiply(new BigDecimal("102.66"));
	}
	public static void USDtoSGD(){
		unit= unit.multiply(new BigDecimal("1.38"));
	}
	public static void USDtoZAR(){
		unit= unit.multiply(new BigDecimal("14.76"));
	}
	public static void USDtoKRW(){
		unit= unit.multiply(new BigDecimal("1140.88"));
	}
	public static void USDtoLKR(){
		unit= unit.multiply(new BigDecimal("171.26"));
	}
	public static void USDtoSEK(){
		unit= unit.multiply(new BigDecimal("9.12"));
	}
	public static void USDtoCHF(){
		unit= unit.multiply(new BigDecimal("0.99"));
	}
	public static void USDtoSYP(){
		unit= unit.multiply(new BigDecimal("515.00"));
	}
	public static void USDtoTZS(){
		unit= unit.multiply(new BigDecimal("2286.80"));
	}
	public static void USDtoTHB(){
		unit= unit.multiply(new BigDecimal("32.98"));
	}
	public static void USDtoTRY(){
		unit= unit.multiply(new BigDecimal("6.07"));
	}
	public static void USDtoUGX(){
		unit= unit.multiply(new BigDecimal("3801.15"));
	}
	public static void USDtoUAH(){
		unit= unit.multiply(new BigDecimal("28.00"));
	}
	public static void USDtoAED(){
		unit= unit.multiply(new BigDecimal("3.67"));
	}
	public static void USDtoVND(){
		unit= unit.multiply(new BigDecimal("23351.00"));
	}
	public static void USDtoZMW(){
		unit= unit.multiply(new BigDecimal("12.26"));
	}
	//``````````````````````````````````````````````````

	//---------------EUR Conversions-------------------//
	public static void EURtoUSD(){
		unit= unit.multiply(new BigDecimal("1.15"));
	}
	public static void EURtoEUR(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void EURtoHKD(){
		EURtoUSD();
		USDtoHKD();
	}
	public static void EURtoBitcoin(){
		EURtoUSD();
		USDtoBitcoin();
	}
	public static void EURtoBitcoinCash(){
		EURtoUSD();
		USDtoBitcoinCash();
	}
	public static void EURtoJPY(){
		EURtoUSD();
		USDtoJPY();
	}
	public static void EURtoCNY(){
		EURtoUSD();
		USDtoCNY();
	}
	public static void EURtoINR(){
		EURtoUSD();
		USDtoINR();
	}
	public static void EURtoDZD(){
		EURtoUSD();
		USDtoDZD();
	}
	public static void EURtoARS(){
		EURtoUSD();
		USDtoARS();
	}
	public static void EURtoAUD(){
		EURtoUSD();
		USDtoAUD();
	}
	public static void EURtoBRL(){
		EURtoUSD();
		USDtoBRL();
	}
	public static void EURtoGBP(){
		EURtoUSD();
		USDtoGBP();
	}
	public static void EURtoBGN(){
		EURtoUSD();
		USDtoBGN();
	}
	public static void EURtoKHR(){
		EURtoUSD();
		USDtoKHR();
	}
	public static void EURtoCAD(){
		EURtoUSD();
		USDtoCAD();
	}
	public static void EURtoCLP(){
		EURtoUSD();
		USDtoCLP();
	}
	public static void EURtoCOP(){
		EURtoUSD();
		USDtoCOP();
	}
	public static void EURtoCRC(){
		EURtoUSD();
		USDtoCRC();
	}
	public static void EURtoHRK(){
		EURtoUSD();
		USDtoHRK();
	}
	public static void EURtoCZK(){
		EURtoUSD();
		USDtoCZK();
	}
	public static void EURtoDKK(){
		EURtoUSD();
		USDtoDKK();
	}
	public static void EURtoEGP(){
		EURtoUSD();
		USDtoEGP();
	}
	public static void EURtoISK(){
		EURtoUSD();
		USDtoISK();
	}
	public static void EURtoIDR(){
		EURtoUSD();
		USDtoIDR();
	}
	public static void EURtoIQD(){
		EURtoUSD();
		USDtoIQD();
	}
	public static void EURtoILS(){
		EURtoUSD();
		USDtoILS();
	}
	public static void EURtoJOD(){
		EURtoUSD();
		USDtoJOD();
	}
	public static void EURtoKES(){
		EURtoUSD();
		USDtoKES();
	}
	public static void EURtoKWD(){
		EURtoUSD();
		USDtoKWD();
	}
	public static void EURtoMYR(){
		EURtoUSD();
		USDtoMYR();
	}
	public static void EURtoMXN(){
		EURtoUSD();
		USDtoMXN();
	}
	public static void EURtoMAD(){
		EURtoUSD();
		USDtoMAD();
	}
	public static void EURtoMMK(){
		EURtoUSD();
		USDtoMMK();
	}
	public static void EURtoTWD(){
		EURtoUSD();
		USDtoTWD();
	}
	public static void EURtoNZD(){
		EURtoUSD();
		USDtoNZD();
	}
	public static void EURtoNOK(){
		EURtoUSD();
		USDtoNOK();
	}
	public static void EURtoPHP(){
		EURtoUSD();
		USDtoPHP();
	}
	public static void EURtoQAR(){
		EURtoUSD();
		USDtoQAR();
	}
	public static void EURtoRON(){
		EURtoUSD();
		USDtoRON();
	}
	public static void EURtoRUB(){
		EURtoUSD();
		USDtoRUB();
	}
	public static void EURtoSAR(){
		EURtoUSD();
		USDtoSAR();
	}
	public static void EURtoRSD(){
		EURtoUSD();
		USDtoRSD();
	}
	public static void EURtoSGD(){
		EURtoUSD();
		USDtoSGD();
	}
	public static void EURtoZAR(){
		EURtoUSD();
		USDtoZAR();
	}
	public static void EURtoKRW(){
		EURtoUSD();
		USDtoKRW();
	}
	public static void EURtoLKR(){
		EURtoUSD();
		USDtoLKR();
	}
	public static void EURtoSEK(){
		EURtoUSD();
		USDtoSEK();
	}
	public static void EURtoCHF(){
		EURtoUSD();
		USDtoCHF();
	}
	public static void EURtoSYP(){
		EURtoUSD();
		USDtoSYP();
	}
	public static void EURtoTZS(){
		EURtoUSD();
		USDtoTZS();
	}
	public static void EURtoTHB(){
		EURtoUSD();
		USDtoTHB();
	}
	public static void EURtoTRY(){
		EURtoUSD();
		USDtoTRY();
	}
	public static void EURtoUGX(){
		EURtoUSD();
		USDtoUGX();
	}
	public static void EURtoUAH(){
		EURtoUSD();
		USDtoUAH();
	}
	public static void EURtoAED(){
		EURtoUSD();
		USDtoAED();
	}
	public static void EURtoVND(){
		EURtoUSD();
		USDtoVND();
	}
	public static void EURtoZMW(){
		EURtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//---------------Hong Kong Dollar Conversions-------------------//
	public static void HKDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.13"));
	}
	public static void HKDtoEUR(){
		HKDtoUSD();
		USDtoEUR();
	}
	public static void HKDtoHKD(){
		HKDtoUSD();
		USDtoHKD();
	}
	public static void HKDtoBitcoin(){
		HKDtoUSD();
		USDtoBitcoin();
	}
	public static void HKDtoBitcoinCash(){
		HKDtoUSD();
		USDtoBitcoinCash();
	}
	public static void HKDtoJPY(){
		HKDtoUSD();
		USDtoJPY();
	}
	public static void HKDtoCNY(){
		HKDtoUSD();
		USDtoCNY();
	}
	public static void HKDtoINR(){
		HKDtoUSD();
		USDtoINR();
	}
	public static void HKDtoDZD(){
		HKDtoUSD();
		USDtoDZD();
	}
	public static void HKDtoARS(){
		HKDtoUSD();
		USDtoARS();
	}
	public static void HKDtoAUD(){
		HKDtoUSD();
		USDtoAUD();
	}
	public static void HKDtoBRL(){
		HKDtoUSD();
		USDtoBRL();
	}
	public static void HKDtoGBP(){
		HKDtoUSD();
		USDtoGBP();
	}
	public static void HKDtoBGN(){
		HKDtoUSD();
		USDtoBGN();
	}
	public static void HKDtoKHR(){
		HKDtoUSD();
		USDtoKHR();
	}
	public static void HKDtoCAD(){
		HKDtoUSD();
		USDtoCAD();
	}
	public static void HKDtoCLP(){
		HKDtoUSD();
		USDtoCLP();
	}
	public static void HKDtoCOP(){
		HKDtoUSD();
		USDtoCOP();
	}
	public static void HKDtoCRC(){
		HKDtoUSD();
		USDtoCRC();
	}
	public static void HKDtoHRK(){
		HKDtoUSD();
		USDtoHRK();
	}
	public static void HKDtoCZK(){
		HKDtoUSD();
		USDtoCZK();
	}
	public static void HKDtoDKK(){
		HKDtoUSD();
		USDtoDKK();
	}
	public static void HKDtoEGP(){
		HKDtoUSD();
		USDtoEGP();
	}
	public static void HKDtoISK(){
		HKDtoUSD();
		USDtoISK();
	}
	public static void HKDtoIDR(){
		HKDtoUSD();
		USDtoIDR();
	}
	public static void HKDtoIQD(){
		HKDtoUSD();
		USDtoIQD();
	}
	public static void HKDtoILS(){
		HKDtoUSD();
		USDtoILS();
	}
	public static void HKDtoJOD(){
		HKDtoUSD();
		USDtoJOD();
	}
	public static void HKDtoKES(){
		HKDtoUSD();
		USDtoKES();
	}
	public static void HKDtoKWD(){
		HKDtoUSD();
		USDtoKWD();
	}
	public static void HKDtoMYR(){
		HKDtoUSD();
		USDtoMYR();
	}
	public static void HKDtoMXN(){
		HKDtoUSD();
		USDtoMXN();
	}
	public static void HKDtoMAD(){
		HKDtoUSD();
		USDtoMAD();
	}
	public static void HKDtoMMK(){
		HKDtoUSD();
		USDtoMMK();
	}
	public static void HKDtoTWD(){
		HKDtoUSD();
		USDtoTWD();
	}
	public static void HKDtoNZD(){
		HKDtoUSD();
		USDtoNZD();
	}
	public static void HKDtoNOK(){
		HKDtoUSD();
		USDtoNOK();
	}
	public static void HKDtoPHP(){
		HKDtoUSD();
		USDtoPHP();
	}
	public static void HKDtoQAR(){
		HKDtoUSD();
		USDtoQAR();
	}
	public static void HKDtoRON(){
		HKDtoUSD();
		USDtoRON();
	}
	public static void HKDtoRUB(){
		HKDtoUSD();
		USDtoRUB();
	}
	public static void HKDtoSAR(){
		HKDtoUSD();
		USDtoSAR();
	}
	public static void HKDtoRSD(){
		HKDtoUSD();
		USDtoRSD();
	}
	public static void HKDtoSGD(){
		HKDtoUSD();
		USDtoSGD();
	}
	public static void HKDtoZAR(){
		HKDtoUSD();
		USDtoZAR();
	}
	public static void HKDtoKRW(){
		HKDtoUSD();
		USDtoKRW();
	}
	public static void HKDtoLKR(){
		HKDtoUSD();
		USDtoLKR();
	}
	public static void HKDtoSEK(){
		HKDtoUSD();
		USDtoSEK();
	}
	public static void HKDtoCHF(){
		HKDtoUSD();
		USDtoCHF();
	}
	public static void HKDtoSYP(){
		HKDtoUSD();
		USDtoSYP();
	}
	public static void HKDtoTZS(){
		HKDtoUSD();
		USDtoTZS();
	}
	public static void HKDtoTHB(){
		HKDtoUSD();
		USDtoTHB();
	}
	public static void HKDtoTRY(){
		HKDtoUSD();
		USDtoTRY();
	}
	public static void HKDtoUGX(){
		HKDtoUSD();
		USDtoUGX();
	}
	public static void HKDtoUAH(){
		HKDtoUSD();
		USDtoUAH();
	}
	public static void HKDtoAED(){
		HKDtoUSD();
		USDtoAED();
	}
	public static void HKDtoVND(){
		HKDtoUSD();
		USDtoVND();
	}
	public static void HKDtoZMW(){
		HKDtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- Bitcoin Conversions -------------------//
	public static void BitcointoUSD(){
		unit= unit.multiply(new BigDecimal("6546.8475718"));
	}
	public static void BitcointoEUR(){
		BitcointoUSD();
		USDtoEUR();
	}
	public static void BitcointoHKD(){
		BitcointoUSD();
		USDtoHKD();
	}
	public static void BitcointoBitcoin(){
		BitcointoUSD();
		USDtoBitcoin();
	}
	public static void BitcointoBitcoinCash(){
		BitcointoUSD();
		USDtoBitcoinCash();
	}
	public static void BitcointoJPY(){
		BitcointoUSD();
		USDtoJPY();
	}
	public static void BitcointoCNY(){
		BitcointoUSD();
		USDtoCNY();
	}
	public static void BitcointoINR(){
		BitcointoUSD();
		USDtoINR();
	}
	public static void BitcointoDZD(){
		BitcointoUSD();
		USDtoDZD();
	}
	public static void BitcointoARS(){
		BitcointoUSD();
		USDtoARS();
	}
	public static void BitcointoAUD(){
		BitcointoUSD();
		USDtoAUD();
	}
	public static void BitcointoBRL(){
		BitcointoUSD();
		USDtoBRL();
	}
	public static void BitcointoGBP(){
		BitcointoUSD();
		USDtoGBP();
	}
	public static void BitcointoBGN(){
		BitcointoUSD();
		USDtoBGN();
	}
	public static void BitcointoKHR(){
		BitcointoUSD();
		USDtoKHR();
	}
	public static void BitcointoCAD(){
		BitcointoUSD();
		USDtoCAD();
	}
	public static void BitcointoCLP(){
		BitcointoUSD();
		USDtoCLP();
	}
	public static void BitcointoCOP(){
		BitcointoUSD();
		USDtoCOP();
	}
	public static void BitcointoCRC(){
		BitcointoUSD();
		USDtoCRC();
	}
	public static void BitcointoHRK(){
		BitcointoUSD();
		USDtoHRK();
	}
	public static void BitcointoCZK(){
		BitcointoUSD();
		USDtoCZK();
	}
	public static void BitcointoDKK(){
		BitcointoUSD();
		USDtoDKK();
	}
	public static void BitcointoEGP(){
		BitcointoUSD();
		USDtoEGP();
	}
	public static void BitcointoISK(){
		BitcointoUSD();
		USDtoISK();
	}
	public static void BitcointoIDR(){
		BitcointoUSD();
		USDtoIDR();
	}
	public static void BitcointoIQD(){
		BitcointoUSD();
		USDtoIQD();
	}
	public static void BitcointoILS(){
		BitcointoUSD();
		USDtoILS();
	}
	public static void BitcointoJOD(){
		BitcointoUSD();
		USDtoJOD();
	}
	public static void BitcointoKES(){
		BitcointoUSD();
		USDtoKES();
	}
	public static void BitcointoKWD(){
		BitcointoUSD();
		USDtoKWD();
	}
	public static void BitcointoMYR(){
		BitcointoUSD();
		USDtoMYR();
	}
	public static void BitcointoMXN(){
		BitcointoUSD();
		USDtoMXN();
	}
	public static void BitcointoMAD(){
		BitcointoUSD();
		USDtoMAD();
	}
	public static void BitcointoMMK(){
		BitcointoUSD();
		USDtoMMK();
	}
	public static void BitcointoTWD(){
		BitcointoUSD();
		USDtoTWD();
	}
	public static void BitcointoNZD(){
		BitcointoUSD();
		USDtoNZD();
	}
	public static void BitcointoNOK(){
		BitcointoUSD();
		USDtoNOK();
	}
	public static void BitcointoPHP(){
		BitcointoUSD();
		USDtoPHP();
	}
	public static void BitcointoQAR(){
		BitcointoUSD();
		USDtoQAR();
	}
	public static void BitcointoRON(){
		BitcointoUSD();
		USDtoRON();
	}
	public static void BitcointoRUB(){
		BitcointoUSD();
		USDtoRUB();
	}
	public static void BitcointoSAR(){
		BitcointoUSD();
		USDtoSAR();
	}
	public static void BitcointoRSD(){
		BitcointoUSD();
		USDtoRSD();
	}
	public static void BitcointoSGD(){
		BitcointoUSD();
		USDtoSGD();
	}
	public static void BitcointoZAR(){
		BitcointoUSD();
		USDtoZAR();
	}
	public static void BitcointoKRW(){
		BitcointoUSD();
		USDtoKRW();
	}
	public static void BitcointoLKR(){
		BitcointoUSD();
		USDtoLKR();
	}
	public static void BitcointoSEK(){
		BitcointoUSD();
		USDtoSEK();
	}
	public static void BitcointoCHF(){
		BitcointoUSD();
		USDtoCHF();
	}
	public static void BitcointoSYP(){
		BitcointoUSD();
		USDtoSYP();
	}
	public static void BitcointoTZS(){
		BitcointoUSD();
		USDtoTZS();
	}
	public static void BitcointoTHB(){
		BitcointoUSD();
		USDtoTHB();
	}
	public static void BitcointoTRY(){
		BitcointoUSD();
		USDtoTRY();
	}
	public static void BitcointoUGX(){
		BitcointoUSD();
		USDtoUGX();
	}
	public static void BitcointoUAH(){
		BitcointoUSD();
		USDtoUAH();
	}
	public static void BitcointoAED(){
		BitcointoUSD();
		USDtoAED();
	}
	public static void BitcointoVND(){
		BitcointoUSD();
		USDtoVND();
	}
	public static void BitcointoZMW(){
		BitcointoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- Bitcoin Cash Conversions -------------------//
	public static void BitcoinCashtoUSD(){
		unit= unit.multiply(new BigDecimal("428.40"));
	}
	public static void BitcoinCashtoEUR(){
		BitcoinCashtoUSD();
		USDtoEUR();
	}
	public static void BitcoinCashtoHKD(){
		BitcoinCashtoUSD();
		USDtoHKD();
	}
	public static void BitcoinCashtoBitcoin(){
		BitcoinCashtoUSD();
		USDtoBitcoinCash();
	}
	public static void BitcoinCashtoBitcoinCash(){
		BitcoinCashtoUSD();
		USDtoBitcoinCash();
	}
	public static void BitcoinCashtoJPY(){
		BitcoinCashtoUSD();
		USDtoJPY();
	}
	public static void BitcoinCashtoCNY(){
		BitcoinCashtoUSD();
		USDtoCNY();
	}
	public static void BitcoinCashtoINR(){
		BitcoinCashtoUSD();
		USDtoINR();
	}
	public static void BitcoinCashtoDZD(){
		BitcoinCashtoUSD();
		USDtoDZD();
	}
	public static void BitcoinCashtoARS(){
		BitcoinCashtoUSD();
		USDtoARS();
	}
	public static void BitcoinCashtoAUD(){
		BitcoinCashtoUSD();
		USDtoAUD();
	}
	public static void BitcoinCashtoBRL(){
		BitcoinCashtoUSD();
		USDtoBRL();
	}
	public static void BitcoinCashtoGBP(){
		BitcoinCashtoUSD();
		USDtoGBP();
	}
	public static void BitcoinCashtoBGN(){
		BitcoinCashtoUSD();
		USDtoBGN();
	}
	public static void BitcoinCashtoKHR(){
		BitcoinCashtoUSD();
		USDtoKHR();
	}
	public static void BitcoinCashtoCAD(){
		BitcoinCashtoUSD();
		USDtoCAD();
	}
	public static void BitcoinCashtoCLP(){
		BitcoinCashtoUSD();
		USDtoCLP();
	}
	public static void BitcoinCashtoCOP(){
		BitcoinCashtoUSD();
		USDtoCOP();
	}
	public static void BitcoinCashtoCRC(){
		BitcoinCashtoUSD();
		USDtoCRC();
	}
	public static void BitcoinCashtoHRK(){
		BitcoinCashtoUSD();
		USDtoHRK();
	}
	public static void BitcoinCashtoCZK(){
		BitcoinCashtoUSD();
		USDtoCZK();
	}
	public static void BitcoinCashtoDKK(){
		BitcoinCashtoUSD();
		USDtoDKK();
	}
	public static void BitcoinCashtoEGP(){
		BitcoinCashtoUSD();
		USDtoEGP();
	}
	public static void BitcoinCashtoISK(){
		BitcoinCashtoUSD();
		USDtoISK();
	}
	public static void BitcoinCashtoIDR(){
		BitcoinCashtoUSD();
		USDtoIDR();
	}
	public static void BitcoinCashtoIQD(){
		BitcoinCashtoUSD();
		USDtoIQD();
	}
	public static void BitcoinCashtoILS(){
		BitcoinCashtoUSD();
		USDtoILS();
	}
	public static void BitcoinCashtoJOD(){
		BitcoinCashtoUSD();
		USDtoJOD();
	}
	public static void BitcoinCashtoKES(){
		BitcoinCashtoUSD();
		USDtoKES();
	}
	public static void BitcoinCashtoKWD(){
		BitcoinCashtoUSD();
		USDtoKWD();
	}
	public static void BitcoinCashtoMYR(){
		BitcoinCashtoUSD();
		USDtoMYR();
	}
	public static void BitcoinCashtoMXN(){
		BitcoinCashtoUSD();
		USDtoMXN();
	}
	public static void BitcoinCashtoMAD(){
		BitcoinCashtoUSD();
		USDtoMAD();
	}
	public static void BitcoinCashtoMMK(){
		BitcoinCashtoUSD();
		USDtoMMK();
	}
	public static void BitcoinCashtoTWD(){
		BitcoinCashtoUSD();
		USDtoTWD();
	}
	public static void BitcoinCashtoNZD(){
		BitcoinCashtoUSD();
		USDtoNZD();
	}
	public static void BitcoinCashtoNOK(){
		BitcoinCashtoUSD();
		USDtoNOK();
	}
	public static void BitcoinCashtoPHP(){
		BitcoinCashtoUSD();
		USDtoPHP();
	}
	public static void BitcoinCashtoQAR(){
		BitcoinCashtoUSD();
		USDtoQAR();
	}
	public static void BitcoinCashtoRON(){
		BitcoinCashtoUSD();
		USDtoRON();
	}
	public static void BitcoinCashtoRUB(){
		BitcoinCashtoUSD();
		USDtoRUB();
	}
	public static void BitcoinCashtoSAR(){
		BitcoinCashtoUSD();
		USDtoSAR();
	}
	public static void BitcoinCashtoRSD(){
		BitcoinCashtoUSD();
		USDtoRSD();
	}
	public static void BitcoinCashtoSGD(){
		BitcoinCashtoUSD();
		USDtoSGD();
	}
	public static void BitcoinCashtoZAR(){
		BitcoinCashtoUSD();
		USDtoZAR();
	}
	public static void BitcoinCashtoKRW(){
		BitcoinCashtoUSD();
		USDtoKRW();
	}
	public static void BitcoinCashtoLKR(){
		BitcoinCashtoUSD();
		USDtoLKR();
	}
	public static void BitcoinCashtoSEK(){
		BitcoinCashtoUSD();
		USDtoSEK();
	}
	public static void BitcoinCashtoCHF(){
		BitcoinCashtoUSD();
		USDtoCHF();
	}
	public static void BitcoinCashtoSYP(){
		BitcoinCashtoUSD();
		USDtoSYP();
	}
	public static void BitcoinCashtoTZS(){
		BitcoinCashtoUSD();
		USDtoTZS();
	}
	public static void BitcoinCashtoTHB(){
		BitcoinCashtoUSD();
		USDtoTHB();
	}
	public static void BitcoinCashtoTRY(){
		BitcoinCashtoUSD();
		USDtoTRY();
	}
	public static void BitcoinCashtoUGX(){
		BitcoinCashtoUSD();
		USDtoUGX();
	}
	public static void BitcoinCashtoUAH(){
		BitcoinCashtoUSD();
		USDtoUAH();
	}
	public static void BitcoinCashtoAED(){
		BitcoinCashtoUSD();
		USDtoAED();
	}
	public static void BitcoinCashtoVND(){
		BitcoinCashtoUSD();
		USDtoVND();
	}
	public static void BitcoinCashtoZMW(){
		BitcoinCashtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- JPY Conversions -------------------//
	public static void JPYtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0089"));
	}
	public static void JPYtoEUR(){
		JPYtoUSD();
		USDtoEUR();
	}
	public static void JPYtoHKD(){
		JPYtoUSD();
		USDtoHKD();
	}
	public static void JPYtoBitcoin(){
		JPYtoUSD();
		USDtoBitcoin();
	}
	public static void JPYtoBitcoinCash(){
		JPYtoUSD();
		USDtoBitcoinCash();
	}
	public static void JPYtoJPY(){
		JPYtoUSD();
		USDtoJPY();
	}
	public static void JPYtoCNY(){
		JPYtoUSD();
		USDtoCNY();
	}
	public static void JPYtoINR(){
		JPYtoUSD();
		USDtoINR();
	}
	public static void JPYtoDZD(){
		JPYtoUSD();
		USDtoDZD();
	}
	public static void JPYtoARS(){
		JPYtoUSD();
		USDtoARS();
	}
	public static void JPYtoAUD(){
		JPYtoUSD();
		USDtoAUD();
	}
	public static void JPYtoBRL(){
		JPYtoUSD();
		USDtoBRL();
	}
	public static void JPYtoGBP(){
		JPYtoUSD();
		USDtoGBP();
	}
	public static void JPYtoBGN(){
		JPYtoUSD();
		USDtoBGN();
	}
	public static void JPYtoKHR(){
		JPYtoUSD();
		USDtoKHR();
	}
	public static void JPYtoCAD(){
		JPYtoUSD();
		USDtoCAD();
	}
	public static void JPYtoCLP(){
		JPYtoUSD();
		USDtoCLP();
	}
	public static void JPYtoCOP(){
		JPYtoUSD();
		USDtoCOP();
	}
	public static void JPYtoCRC(){
		JPYtoUSD();
		USDtoCRC();
	}
	public static void JPYtoHRK(){
		JPYtoUSD();
		USDtoHRK();
	}
	public static void JPYtoCZK(){
		JPYtoUSD();
		USDtoCZK();
	}
	public static void JPYtoDKK(){
		JPYtoUSD();
		USDtoDKK();
	}
	public static void JPYtoEGP(){
		JPYtoUSD();
		USDtoEGP();
	}
	public static void JPYtoISK(){
		JPYtoUSD();
		USDtoISK();
	}
	public static void JPYtoIDR(){
		JPYtoUSD();
		USDtoIDR();
	}
	public static void JPYtoIQD(){
		JPYtoUSD();
		USDtoIQD();
	}
	public static void JPYtoILS(){
		JPYtoUSD();
		USDtoILS();
	}
	public static void JPYtoJOD(){
		JPYtoUSD();
		USDtoJOD();
	}
	public static void JPYtoKES(){
		JPYtoUSD();
		USDtoKES();
	}
	public static void JPYtoKWD(){
		JPYtoUSD();
		USDtoKWD();
	}
	public static void JPYtoMYR(){
		JPYtoUSD();
		USDtoMYR();
	}
	public static void JPYtoMXN(){
		JPYtoUSD();
		USDtoMXN();
	}
	public static void JPYtoMAD(){
		JPYtoUSD();
		USDtoMAD();
	}
	public static void JPYtoMMK(){
		JPYtoUSD();
		USDtoMMK();
	}
	public static void JPYtoTWD(){
		JPYtoUSD();
		USDtoTWD();
	}
	public static void JPYtoNZD(){
		JPYtoUSD();
		USDtoNZD();
	}
	public static void JPYtoNOK(){
		JPYtoUSD();
		USDtoNOK();
	}
	public static void JPYtoPHP(){
		JPYtoUSD();
		USDtoPHP();
	}
	public static void JPYtoQAR(){
		JPYtoUSD();
		USDtoQAR();
	}
	public static void JPYtoRON(){
		JPYtoUSD();
		USDtoRON();
	}
	public static void JPYtoRUB(){
		JPYtoUSD();
		USDtoRUB();
	}
	public static void JPYtoSAR(){
		JPYtoUSD();
		USDtoSAR();
	}
	public static void JPYtoRSD(){
		JPYtoUSD();
		USDtoRSD();
	}
	public static void JPYtoSGD(){
		JPYtoUSD();
		USDtoSGD();
	}
	public static void JPYtoZAR(){
		JPYtoUSD();
		USDtoZAR();
	}
	public static void JPYtoKRW(){
		JPYtoUSD();
		USDtoKRW();
	}
	public static void JPYtoLKR(){
		JPYtoUSD();
		USDtoLKR();
	}
	public static void JPYtoSEK(){
		JPYtoUSD();
		USDtoSEK();
	}
	public static void JPYtoCHF(){
		JPYtoUSD();
		USDtoCHF();
	}
	public static void JPYtoSYP(){
		JPYtoUSD();
		USDtoSYP();
	}
	public static void JPYtoTZS(){
		JPYtoUSD();
		USDtoTZS();
	}
	public static void JPYtoTHB(){
		JPYtoUSD();
		USDtoTHB();
	}
	public static void JPYtoTRY(){
		JPYtoUSD();
		USDtoTRY();
	}
	public static void JPYtoUGX(){
		JPYtoUSD();
		USDtoUGX();
	}
	public static void JPYtoUAH(){
		JPYtoUSD();
		USDtoUAH();
	}
	public static void JPYtoAED(){
		JPYtoUSD();
		USDtoAED();
	}
	public static void JPYtoVND(){
		JPYtoUSD();
		USDtoVND();
	}
	public static void JPYtoZMW(){
		JPYtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- CNY Conversions -------------------//
	public static void CNYtoUSD(){
		unit= unit.multiply(new BigDecimal("0.14"));
	}
	public static void CNYtoEUR(){
		CNYtoUSD();
		USDtoEUR();
	}
	public static void CNYtoHKD(){
		CNYtoUSD();
		USDtoHKD();
	}
	public static void CNYtoBitcoin(){
		CNYtoUSD();
		USDtoBitcoin();
	}
	public static void CNYtoBitcoinCash(){
		CNYtoUSD();
		USDtoBitcoinCash();
	}
	public static void CNYtoJPY(){
		CNYtoUSD();
		USDtoJPY();
	}
	public static void CNYtoCNY(){
		CNYtoUSD();
		USDtoCNY();
	}
	public static void CNYtoINR(){
		CNYtoUSD();
		USDtoINR();
	}
	public static void CNYtoDZD(){
		CNYtoUSD();
		USDtoDZD();
	}
	public static void CNYtoARS(){
		CNYtoUSD();
		USDtoARS();
	}
	public static void CNYtoAUD(){
		CNYtoUSD();
		USDtoAUD();
	}
	public static void CNYtoBRL(){
		CNYtoUSD();
		USDtoBRL();
	}
	public static void CNYtoGBP(){
		CNYtoUSD();
		USDtoGBP();
	}
	public static void CNYtoBGN(){
		CNYtoUSD();
		USDtoBGN();
	}
	public static void CNYtoKHR(){
		CNYtoUSD();
		USDtoKHR();
	}
	public static void CNYtoCAD(){
		CNYtoUSD();
		USDtoCAD();
	}
	public static void CNYtoCLP(){
		CNYtoUSD();
		USDtoCLP();
	}
	public static void CNYtoCOP(){
		CNYtoUSD();
		USDtoCOP();
	}
	public static void CNYtoCRC(){
		CNYtoUSD();
		USDtoCRC();
	}
	public static void CNYtoHRK(){
		CNYtoUSD();
		USDtoHRK();
	}
	public static void CNYtoCZK(){
		CNYtoUSD();
		USDtoCZK();
	}
	public static void CNYtoDKK(){
		CNYtoUSD();
		USDtoDKK();
	}
	public static void CNYtoEGP(){
		CNYtoUSD();
		USDtoEGP();
	}
	public static void CNYtoISK(){
		CNYtoUSD();
		USDtoISK();
	}
	public static void CNYtoIDR(){
		CNYtoUSD();
		USDtoIDR();
	}
	public static void CNYtoIQD(){
		CNYtoUSD();
		USDtoIQD();
	}
	public static void CNYtoILS(){
		CNYtoUSD();
		USDtoILS();
	}
	public static void CNYtoJOD(){
		CNYtoUSD();
		USDtoJOD();
	}
	public static void CNYtoKES(){
		CNYtoUSD();
		USDtoKES();
	}
	public static void CNYtoKWD(){
		CNYtoUSD();
		USDtoKWD();
	}
	public static void CNYtoMYR(){
		CNYtoUSD();
		USDtoMYR();
	}
	public static void CNYtoMXN(){
		CNYtoUSD();
		USDtoMXN();
	}
	public static void CNYtoMAD(){
		CNYtoUSD();
		USDtoMAD();
	}
	public static void CNYtoMMK(){
		CNYtoUSD();
		USDtoMMK();
	}
	public static void CNYtoTWD(){
		CNYtoUSD();
		USDtoTWD();
	}
	public static void CNYtoNZD(){
		CNYtoUSD();
		USDtoNZD();
	}
	public static void CNYtoNOK(){
		CNYtoUSD();
		USDtoNOK();
	}
	public static void CNYtoPHP(){
		CNYtoUSD();
		USDtoPHP();
	}
	public static void CNYtoQAR(){
		CNYtoUSD();
		USDtoQAR();
	}
	public static void CNYtoRON(){
		CNYtoUSD();
		USDtoRON();
	}
	public static void CNYtoRUB(){
		CNYtoUSD();
		USDtoRUB();
	}
	public static void CNYtoSAR(){
		CNYtoUSD();
		USDtoSAR();
	}
	public static void CNYtoRSD(){
		CNYtoUSD();
		USDtoRSD();
	}
	public static void CNYtoSGD(){
		CNYtoUSD();
		USDtoSGD();
	}
	public static void CNYtoZAR(){
		CNYtoUSD();
		USDtoZAR();
	}
	public static void CNYtoKRW(){
		CNYtoUSD();
		USDtoKRW();
	}
	public static void CNYtoLKR(){
		CNYtoUSD();
		USDtoLKR();
	}
	public static void CNYtoSEK(){
		CNYtoUSD();
		USDtoSEK();
	}
	public static void CNYtoCHF(){
		CNYtoUSD();
		USDtoCHF();
	}
	public static void CNYtoSYP(){
		CNYtoUSD();
		USDtoSYP();
	}
	public static void CNYtoTZS(){
		CNYtoUSD();
		USDtoTZS();
	}
	public static void CNYtoTHB(){
		CNYtoUSD();
		USDtoTHB();
	}
	public static void CNYtoTRY(){
		CNYtoUSD();
		USDtoTRY();
	}
	public static void CNYtoUGX(){
		CNYtoUSD();
		USDtoUGX();
	}
	public static void CNYtoUAH(){
		CNYtoUSD();
		USDtoUAH();
	}
	public static void CNYtoAED(){
		CNYtoUSD();
		USDtoAED();
	}
	public static void CNYtoVND(){
		CNYtoUSD();
		USDtoVND();
	}
	public static void CNYtoZMW(){
		CNYtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````
	
	//----------------- INR Conversions -------------------//
	public static void INRtoUSD(){
		unit= unit.multiply(new BigDecimal("0.014"));
	}
	public static void INRtoEUR(){
		INRtoUSD();
		USDtoEUR();
	}
	public static void INRtoHKD(){
		INRtoUSD();
		USDtoHKD();
	}
	public static void INRtoBitcoin(){
		INRtoUSD();
		USDtoBitcoin();
	}
	public static void INRtoBitcoinCash(){
		INRtoUSD();
		USDtoBitcoinCash();
	}
	public static void INRtoJPY(){
		INRtoUSD();
		USDtoJPY();
	}
	public static void INRtoCNY(){
		INRtoUSD();
		USDtoCNY();
	}
	public static void INRtoINR(){
		INRtoUSD();
		USDtoINR();
	}
	public static void INRtoDZD(){
		INRtoUSD();
		USDtoDZD();
	}
	public static void INRtoARS(){
		INRtoUSD();
		USDtoARS();
	}
	public static void INRtoAUD(){
		INRtoUSD();
		USDtoAUD();
	}
	public static void INRtoBRL(){
		INRtoUSD();
		USDtoBRL();
	}
	public static void INRtoGBP(){
		INRtoUSD();
		USDtoGBP();
	}
	public static void INRtoBGN(){
		INRtoUSD();
		USDtoBGN();
	}
	public static void INRtoKHR(){
		INRtoUSD();
		USDtoKHR();
	}
	public static void INRtoCAD(){
		INRtoUSD();
		USDtoCAD();
	}
	public static void INRtoCLP(){
		INRtoUSD();
		USDtoCLP();
	}
	public static void INRtoCOP(){
		INRtoUSD();
		USDtoCOP();
	}
	public static void INRtoCRC(){
		INRtoUSD();
		USDtoCRC();
	}
	public static void INRtoHRK(){
		INRtoUSD();
		USDtoHRK();
	}
	public static void INRtoCZK(){
		INRtoUSD();
		USDtoCZK();
	}
	public static void INRtoDKK(){
		INRtoUSD();
		USDtoDKK();
	}
	public static void INRtoEGP(){
		INRtoUSD();
		USDtoEGP();
	}
	public static void INRtoISK(){
		INRtoUSD();
		USDtoISK();
	}
	public static void INRtoIDR(){
		INRtoUSD();
		USDtoIDR();
	}
	public static void INRtoIQD(){
		INRtoUSD();
		USDtoIQD();
	}
	public static void INRtoILS(){
		INRtoUSD();
		USDtoILS();
	}
	public static void INRtoJOD(){
		INRtoUSD();
		USDtoJOD();
	}
	public static void INRtoKES(){
		INRtoUSD();
		USDtoKES();
	}
	public static void INRtoKWD(){
		INRtoUSD();
		USDtoKWD();
	}
	public static void INRtoMYR(){
		INRtoUSD();
		USDtoMYR();
	}
	public static void INRtoMXN(){
		INRtoUSD();
		USDtoMXN();
	}
	public static void INRtoMAD(){
		INRtoUSD();
		USDtoMAD();
	}
	public static void INRtoMMK(){
		INRtoUSD();
		USDtoMMK();
	}
	public static void INRtoTWD(){
		INRtoUSD();
		USDtoTWD();
	}
	public static void INRtoNZD(){
		INRtoUSD();
		USDtoNZD();
	}
	public static void INRtoNOK(){
		INRtoUSD();
		USDtoNOK();
	}
	public static void INRtoPHP(){
		INRtoUSD();
		USDtoPHP();
	}
	public static void INRtoQAR(){
		INRtoUSD();
		USDtoQAR();
	}
	public static void INRtoRON(){
		INRtoUSD();
		USDtoRON();
	}
	public static void INRtoRUB(){
		INRtoUSD();
		USDtoRUB();
	}
	public static void INRtoSAR(){
		INRtoUSD();
		USDtoSAR();
	}
	public static void INRtoRSD(){
		INRtoUSD();
		USDtoRSD();
	}
	public static void INRtoSGD(){
		INRtoUSD();
		USDtoSGD();
	}
	public static void INRtoZAR(){
		INRtoUSD();
		USDtoZAR();
	}
	public static void INRtoKRW(){
		INRtoUSD();
		USDtoKRW();
	}
	public static void INRtoLKR(){
		INRtoUSD();
		USDtoLKR();
	}
	public static void INRtoSEK(){
		INRtoUSD();
		USDtoSEK();
	}
	public static void INRtoCHF(){
		INRtoUSD();
		USDtoCHF();
	}
	public static void INRtoSYP(){
		INRtoUSD();
		USDtoSYP();
	}
	public static void INRtoTZS(){
		INRtoUSD();
		USDtoTZS();
	}
	public static void INRtoTHB(){
		INRtoUSD();
		USDtoTHB();
	}
	public static void INRtoTRY(){
		INRtoUSD();
		USDtoTRY();
	}
	public static void INRtoUGX(){
		INRtoUSD();
		USDtoUGX();
	}
	public static void INRtoUAH(){
		INRtoUSD();
		USDtoUAH();
	}
	public static void INRtoAED(){
		INRtoUSD();
		USDtoAED();
	}
	public static void INRtoVND(){
		INRtoUSD();
		USDtoVND();
	}
	public static void INRtoZMW(){
		INRtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- DZD Conversions -------------------//
	public static void DZDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0084"));
	}
	public static void DZDtoEUR(){
		DZDtoUSD();
		USDtoEUR();
	}
	public static void DZDtoHKD(){
		DZDtoUSD();
		USDtoHKD();
	}
	public static void DZDtoBitcoin(){
		DZDtoUSD();
		USDtoBitcoin();
	}
	public static void DZDtoBitcoinCash(){
		DZDtoUSD();
		USDtoBitcoinCash();
	}
	public static void DZDtoJPY(){
		DZDtoUSD();
		USDtoJPY();
	}
	public static void DZDtoCNY(){
		DZDtoUSD();
		USDtoDZD();
	}
	public static void DZDtoINR(){
		DZDtoUSD();
		USDtoDZD();
	}
	public static void DZDtoDZD(){
		DZDtoUSD();
		USDtoDZD();
	}
	public static void DZDtoARS(){
		DZDtoUSD();
		USDtoARS();
	}
	public static void DZDtoAUD(){
		DZDtoUSD();
		USDtoAUD();
	}
	public static void DZDtoBRL(){
		DZDtoUSD();
		USDtoBRL();
	}
	public static void DZDtoGBP(){
		DZDtoUSD();
		USDtoGBP();
	}
	public static void DZDtoBGN(){
		DZDtoUSD();
		USDtoBGN();
	}
	public static void DZDtoKHR(){
		DZDtoUSD();
		USDtoKHR();
	}
	public static void DZDtoCAD(){
		DZDtoUSD();
		USDtoCAD();
	}
	public static void DZDtoCLP(){
		DZDtoUSD();
		USDtoCLP();
	}
	public static void DZDtoCOP(){
		DZDtoUSD();
		USDtoCOP();
	}
	public static void DZDtoCRC(){
		DZDtoUSD();
		USDtoCRC();
	}
	public static void DZDtoHRK(){
		DZDtoUSD();
		USDtoHRK();
	}
	public static void DZDtoCZK(){
		DZDtoUSD();
		USDtoCZK();
	}
	public static void DZDtoDKK(){
		DZDtoUSD();
		USDtoDKK();
	}
	public static void DZDtoEGP(){
		DZDtoUSD();
		USDtoEGP();
	}
	public static void DZDtoISK(){
		DZDtoUSD();
		USDtoISK();
	}
	public static void DZDtoIDR(){
		DZDtoUSD();
		USDtoIDR();
	}
	public static void DZDtoIQD(){
		DZDtoUSD();
		USDtoIQD();
	}
	public static void DZDtoILS(){
		DZDtoUSD();
		USDtoILS();
	}
	public static void DZDtoJOD(){
		DZDtoUSD();
		USDtoJOD();
	}
	public static void DZDtoKES(){
		DZDtoUSD();
		USDtoKES();
	}
	public static void DZDtoKWD(){
		DZDtoUSD();
		USDtoKWD();
	}
	public static void DZDtoMYR(){
		DZDtoUSD();
		USDtoMYR();
	}
	public static void DZDtoMXN(){
		DZDtoUSD();
		USDtoMXN();
	}
	public static void DZDtoMAD(){
		DZDtoUSD();
		USDtoMAD();
	}
	public static void DZDtoMMK(){
		DZDtoUSD();
		USDtoMMK();
	}
	public static void DZDtoTWD(){
		DZDtoUSD();
		USDtoTWD();
	}
	public static void DZDtoNZD(){
		DZDtoUSD();
		USDtoNZD();
	}
	public static void DZDtoNOK(){
		DZDtoUSD();
		USDtoNOK();
	}
	public static void DZDtoPHP(){
		DZDtoUSD();
		USDtoPHP();
	}
	public static void DZDtoQAR(){
		DZDtoUSD();
		USDtoQAR();
	}
	public static void DZDtoRON(){
		DZDtoUSD();
		USDtoRON();
	}
	public static void DZDtoRUB(){
		DZDtoUSD();
		USDtoRUB();
	}
	public static void DZDtoSAR(){
		DZDtoUSD();
		USDtoSAR();
	}
	public static void DZDtoRSD(){
		DZDtoUSD();
		USDtoRSD();
	}
	public static void DZDtoSGD(){
		DZDtoUSD();
		USDtoSGD();
	}
	public static void DZDtoZAR(){
		DZDtoUSD();
		USDtoZAR();
	}
	public static void DZDtoKRW(){
		DZDtoUSD();
		USDtoKRW();
	}
	public static void DZDtoLKR(){
		DZDtoUSD();
		USDtoLKR();
	}
	public static void DZDtoSEK(){
		DZDtoUSD();
		USDtoSEK();
	}
	public static void DZDtoCHF(){
		DZDtoUSD();
		USDtoCHF();
	}
	public static void DZDtoSYP(){
		DZDtoUSD();
		USDtoSYP();
	}
	public static void DZDtoTZS(){
		DZDtoUSD();
		USDtoTZS();
	}
	public static void DZDtoTHB(){
		DZDtoUSD();
		USDtoTHB();
	}
	public static void DZDtoTRY(){
		DZDtoUSD();
		USDtoTRY();
	}
	public static void DZDtoUGX(){
		DZDtoUSD();
		USDtoUGX();
	}
	public static void DZDtoUAH(){
		DZDtoUSD();
		USDtoUAH();
	}
	public static void DZDtoAED(){
		DZDtoUSD();
		USDtoAED();
	}
	public static void DZDtoVND(){
		DZDtoUSD();
		USDtoVND();
	}
	public static void DZDtoZMW(){
		DZDtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- ARS Conversions -------------------//
	public static void ARStoUSD(){
		unit= unit.multiply(new BigDecimal("0.027"));
	}
	public static void ARStoEUR(){
		ARStoUSD();
		USDtoEUR();
	}
	public static void ARStoHKD(){
		ARStoUSD();
		USDtoHKD();
	}
	public static void ARStoBitcoin(){
		ARStoUSD();
		USDtoBitcoin();
	}
	public static void ARStoBitcoinCash(){
		ARStoUSD();
		USDtoBitcoinCash();
	}
	public static void ARStoJPY(){
		ARStoUSD();
		USDtoJPY();
	}
	public static void ARStoCNY(){
		ARStoUSD();
		USDtoCNY();
	}
	public static void ARStoINR(){
		ARStoUSD();
		USDtoINR();
	}
	public static void ARStoDZD(){
		ARStoUSD();
		USDtoDZD();
	}
	public static void ARStoARS(){
		ARStoUSD();
		USDtoARS();
	}
	public static void ARStoAUD(){
		ARStoUSD();
		USDtoAUD();
	}
	public static void ARStoBRL(){
		ARStoUSD();
		USDtoBRL();
	}
	public static void ARStoGBP(){
		ARStoUSD();
		USDtoGBP();
	}
	public static void ARStoBGN(){
		ARStoUSD();
		USDtoBGN();
	}
	public static void ARStoKHR(){
		ARStoUSD();
		USDtoKHR();
	}
	public static void ARStoCAD(){
		ARStoUSD();
		USDtoCAD();
	}
	public static void ARStoCLP(){
		ARStoUSD();
		USDtoCLP();
	}
	public static void ARStoCOP(){
		ARStoUSD();
		USDtoCOP();
	}
	public static void ARStoCRC(){
		ARStoUSD();
		USDtoCRC();
	}
	public static void ARStoHRK(){
		ARStoUSD();
		USDtoHRK();
	}
	public static void ARStoCZK(){
		ARStoUSD();
		USDtoCZK();
	}
	public static void ARStoDKK(){
		ARStoUSD();
		USDtoDKK();
	}
	public static void ARStoEGP(){
		ARStoUSD();
		USDtoEGP();
	}
	public static void ARStoISK(){
		ARStoUSD();
		USDtoISK();
	}
	public static void ARStoIDR(){
		ARStoUSD();
		USDtoIDR();
	}
	public static void ARStoIQD(){
		ARStoUSD();
		USDtoIQD();
	}
	public static void ARStoILS(){
		ARStoUSD();
		USDtoILS();
	}
	public static void ARStoJOD(){
		ARStoUSD();
		USDtoJOD();
	}
	public static void ARStoKES(){
		ARStoUSD();
		USDtoKES();
	}
	public static void ARStoKWD(){
		ARStoUSD();
		USDtoKWD();
	}
	public static void ARStoMYR(){
		ARStoUSD();
		USDtoMYR();
	}
	public static void ARStoMXN(){
		ARStoUSD();
		USDtoMXN();
	}
	public static void ARStoMAD(){
		ARStoUSD();
		USDtoMAD();
	}
	public static void ARStoMMK(){
		ARStoUSD();
		USDtoMMK();
	}
	public static void ARStoTWD(){
		ARStoUSD();
		USDtoTWD();
	}
	public static void ARStoNZD(){
		ARStoUSD();
		USDtoNZD();
	}
	public static void ARStoNOK(){
		ARStoUSD();
		USDtoNOK();
	}
	public static void ARStoPHP(){
		ARStoUSD();
		USDtoPHP();
	}
	public static void ARStoQAR(){
		ARStoUSD();
		USDtoQAR();
	}
	public static void ARStoRON(){
		ARStoUSD();
		USDtoRON();
	}
	public static void ARStoRUB(){
		ARStoUSD();
		USDtoRUB();
	}
	public static void ARStoSAR(){
		ARStoUSD();
		USDtoSAR();
	}
	public static void ARStoRSD(){
		ARStoUSD();
		USDtoRSD();
	}
	public static void ARStoSGD(){
		ARStoUSD();
		USDtoSGD();
	}
	public static void ARStoZAR(){
		ARStoUSD();
		USDtoZAR();
	}
	public static void ARStoKRW(){
		ARStoUSD();
		USDtoKRW();
	}
	public static void ARStoLKR(){
		ARStoUSD();
		USDtoLKR();
	}
	public static void ARStoSEK(){
		ARStoUSD();
		USDtoSEK();
	}
	public static void ARStoCHF(){
		ARStoUSD();
		USDtoCHF();
	}
	public static void ARStoSYP(){
		ARStoUSD();
		USDtoSYP();
	}
	public static void ARStoTZS(){
		ARStoUSD();
		USDtoTZS();
	}
	public static void ARStoTHB(){
		ARStoUSD();
		USDtoTHB();
	}
	public static void ARStoTRY(){
		ARStoUSD();
		USDtoTRY();
	}
	public static void ARStoUGX(){
		ARStoUSD();
		USDtoUGX();
	}
	public static void ARStoUAH(){
		ARStoUSD();
		USDtoUAH();
	}
	public static void ARStoAED(){
		ARStoUSD();
		USDtoAED();
	}
	public static void ARStoVND(){
		ARStoUSD();
		USDtoVND();
	}
	public static void ARStoZMW(){
		ARStoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````
	//----------------- AUD Conversions -------------------//
	public static void AUDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.71"));
	}
	public static void AUDtoEUR(){
		AUDtoUSD();
		USDtoEUR();
	}
	public static void AUDtoHKD(){
		AUDtoUSD();
		USDtoHKD();
	}
	public static void AUDtoBitcoin(){
		AUDtoUSD();
		USDtoBitcoin();
	}
	public static void AUDtoBitcoinCash(){
		AUDtoUSD();
		USDtoBitcoinCash();
	}
	public static void AUDtoJPY(){
		AUDtoUSD();
		USDtoJPY();
	}
	public static void AUDtoCNY(){
		AUDtoUSD();
		USDtoCNY();
	}
	public static void AUDtoINR(){
		AUDtoUSD();
		USDtoINR();
	}
	public static void AUDtoDZD(){
		AUDtoUSD();
		USDtoDZD();
	}
	public static void AUDtoARS(){
		AUDtoUSD();
		USDtoARS();
	}
	public static void AUDtoAUD(){
		AUDtoUSD();
		USDtoAUD();
	}
	public static void AUDtoBRL(){
		AUDtoUSD();
		USDtoBRL();
	}
	public static void AUDtoGBP(){
		AUDtoUSD();
		USDtoGBP();
	}
	public static void AUDtoBGN(){
		AUDtoUSD();
		USDtoBGN();
	}
	public static void AUDtoKHR(){
		AUDtoUSD();
		USDtoKHR();
	}
	public static void AUDtoCAD(){
		AUDtoUSD();
		USDtoCAD();
	}
	public static void AUDtoCLP(){
		AUDtoUSD();
		USDtoCLP();
	}
	public static void AUDtoCOP(){
		AUDtoUSD();
		USDtoCOP();
	}
	public static void AUDtoCRC(){
		AUDtoUSD();
		USDtoCRC();
	}
	public static void AUDtoHRK(){
		AUDtoUSD();
		USDtoHRK();
	}
	public static void AUDtoCZK(){
		AUDtoUSD();
		USDtoCZK();
	}
	public static void AUDtoDKK(){
		AUDtoUSD();
		USDtoDKK();
	}
	public static void AUDtoEGP(){
		AUDtoUSD();
		USDtoEGP();
	}
	public static void AUDtoISK(){
		AUDtoUSD();
		USDtoISK();
	}
	public static void AUDtoIDR(){
		AUDtoUSD();
		USDtoIDR();
	}
	public static void AUDtoIQD(){
		AUDtoUSD();
		USDtoIQD();
	}
	public static void AUDtoILS(){
		AUDtoUSD();
		USDtoILS();
	}
	public static void AUDtoJOD(){
		AUDtoUSD();
		USDtoJOD();
	}
	public static void AUDtoKES(){
		AUDtoUSD();
		USDtoKES();
	}
	public static void AUDtoKWD(){
		AUDtoUSD();
		USDtoKWD();
	}
	public static void AUDtoMYR(){
		AUDtoUSD();
		USDtoMYR();
	}
	public static void AUDtoMXN(){
		AUDtoUSD();
		USDtoMXN();
	}
	public static void AUDtoMAD(){
		AUDtoUSD();
		USDtoMAD();
	}
	public static void AUDtoMMK(){
		AUDtoUSD();
		USDtoMMK();
	}
	public static void AUDtoTWD(){
		AUDtoUSD();
		USDtoTWD();
	}
	public static void AUDtoNZD(){
		AUDtoUSD();
		USDtoNZD();
	}
	public static void AUDtoNOK(){
		AUDtoUSD();
		USDtoNOK();
	}
	public static void AUDtoPHP(){
		AUDtoUSD();
		USDtoPHP();
	}
	public static void AUDtoQAR(){
		AUDtoUSD();
		USDtoQAR();
	}
	public static void AUDtoRON(){
		AUDtoUSD();
		USDtoRON();
	}
	public static void AUDtoRUB(){
		AUDtoUSD();
		USDtoRUB();
	}
	public static void AUDtoSAR(){
		AUDtoUSD();
		USDtoSAR();
	}
	public static void AUDtoRSD(){
		AUDtoUSD();
		USDtoRSD();
	}
	public static void AUDtoSGD(){
		AUDtoUSD();
		USDtoSGD();
	}
	public static void AUDtoZAR(){
		AUDtoUSD();
		USDtoZAR();
	}
	public static void AUDtoKRW(){
		AUDtoUSD();
		USDtoKRW();
	}
	public static void AUDtoLKR(){
		AUDtoUSD();
		USDtoLKR();
	}
	public static void AUDtoSEK(){
		AUDtoUSD();
		USDtoSEK();
	}
	public static void AUDtoCHF(){
		AUDtoUSD();
		USDtoCHF();
	}
	public static void AUDtoSYP(){
		AUDtoUSD();
		USDtoSYP();
	}
	public static void AUDtoTZS(){
		AUDtoUSD();
		USDtoTZS();
	}
	public static void AUDtoTHB(){
		AUDtoUSD();
		USDtoTHB();
	}
	public static void AUDtoTRY(){
		AUDtoUSD();
		USDtoTRY();
	}
	public static void AUDtoUGX(){
		AUDtoUSD();
		USDtoUGX();
	}
	public static void AUDtoUAH(){
		AUDtoUSD();
		USDtoUAH();
	}
	public static void AUDtoAED(){
		AUDtoUSD();
		USDtoAED();
	}
	public static void AUDtoVND(){
		AUDtoUSD();
		USDtoVND();
	}
	public static void AUDtoZMW(){
		AUDtoUSD();
		USDtoZMW();
	}
	//```````````````````````````````````````````````````````````````

	//----------------- BRL Conversions -------------------//
	public static void BRLtoUSD(){
		unit= unit.multiply(new BigDecimal("0.27"));
	}
	public static void BRLtoEUR(){
		BRLtoUSD();
		USDtoEUR();
	}
	public static void BRLtoHKD(){
		BRLtoUSD();
		USDtoHKD();
	}
	public static void BRLtoBitcoin(){
		BRLtoUSD();
		USDtoBitcoin();
	}
	public static void BRLtoBitcoinCash(){
		BRLtoUSD();
		USDtoBitcoinCash();
	}
	public static void BRLtoJPY(){
		BRLtoUSD();
		USDtoJPY();
	}
	public static void BRLtoCNY(){
		BRLtoUSD();
		USDtoCNY();
	}
	public static void BRLtoINR(){
		BRLtoUSD();
		USDtoINR();
	}
	public static void BRLtoDZD(){
		BRLtoUSD();
		USDtoDZD();
	}
	public static void BRLtoARS(){
		BRLtoUSD();
		USDtoARS();
	}
	public static void BRLtoAUD(){
		BRLtoUSD();
		USDtoAUD();
	}
	public static void BRLtoBRL(){
		BRLtoUSD();
		USDtoBRL();
	}
	public static void BRLtoGBP(){
		BRLtoUSD();
		USDtoGBP();
	}
	public static void BRLtoBGN(){
		BRLtoUSD();
		USDtoBGN();
	}
	public static void BRLtoKHR(){
		BRLtoUSD();
		USDtoKHR();
	}
	public static void BRLtoCAD(){
		BRLtoUSD();
		USDtoCAD();
	}
	public static void BRLtoCLP(){
		BRLtoUSD();
		USDtoCLP();
	}
	public static void BRLtoCOP(){
		BRLtoUSD();
		USDtoCOP();
	}
	public static void BRLtoCRC(){
		BRLtoUSD();
		USDtoCRC();
	}
	public static void BRLtoHRK(){
		BRLtoUSD();
		USDtoHRK();
	}
	public static void BRLtoCZK(){
		BRLtoUSD();
		USDtoCZK();
	}
	public static void BRLtoDKK(){
		BRLtoUSD();
		USDtoDKK();
	}
	public static void BRLtoEGP(){
		BRLtoUSD();
		USDtoEGP();
	}
	public static void BRLtoISK(){
		BRLtoUSD();
		USDtoISK();
	}
	public static void BRLtoIDR(){
		BRLtoUSD();
		USDtoIDR();
	}
	public static void BRLtoIQD(){
		BRLtoUSD();
		USDtoIQD();
	}
	public static void BRLtoILS(){
		BRLtoUSD();
		USDtoILS();
	}
	public static void BRLtoJOD(){
		BRLtoUSD();
		USDtoJOD();
	}
	public static void BRLtoKES(){
		BRLtoUSD();
		USDtoKES();
	}
	public static void BRLtoKWD(){
		BRLtoUSD();
		USDtoKWD();
	}
	public static void BRLtoMYR(){
		BRLtoUSD();
		USDtoMYR();
	}
	public static void BRLtoMXN(){
		BRLtoUSD();
		USDtoMXN();
	}
	public static void BRLtoMAD(){
		BRLtoUSD();
		USDtoMAD();
	}
	public static void BRLtoMMK(){
		BRLtoUSD();
		USDtoMMK();
	}
	public static void BRLtoTWD(){
		BRLtoUSD();
		USDtoTWD();
	}
	public static void BRLtoNZD(){
		BRLtoUSD();
		USDtoNZD();
	}
	public static void BRLtoNOK(){
		BRLtoUSD();
		USDtoNOK();
	}
	public static void BRLtoPHP(){
		BRLtoUSD();
		USDtoPHP();
	}
	public static void BRLtoQAR(){
		BRLtoUSD();
		USDtoQAR();
	}
	public static void BRLtoRON(){
		BRLtoUSD();
		USDtoRON();
	}
	public static void BRLtoRUB(){
		BRLtoUSD();
		USDtoRUB();
	}
	public static void BRLtoSAR(){
		BRLtoUSD();
		USDtoSAR();
	}
	public static void BRLtoRSD(){
		BRLtoUSD();
		USDtoRSD();
	}
	public static void BRLtoSGD(){
		BRLtoUSD();
		USDtoSGD();
	}
	public static void BRLtoZAR(){
		BRLtoUSD();
		USDtoZAR();
	}
	public static void BRLtoKRW(){
		BRLtoUSD();
		USDtoKRW();
	}
	public static void BRLtoLKR(){
		BRLtoUSD();
		USDtoLKR();
	}
	public static void BRLtoSEK(){
		BRLtoUSD();
		USDtoSEK();
	}
	public static void BRLtoCHF(){
		BRLtoUSD();
		USDtoCHF();
	}
	public static void BRLtoSYP(){
		BRLtoUSD();
		USDtoSYP();
	}
	public static void BRLtoTZS(){
		BRLtoUSD();
		USDtoTZS();
	}
	public static void BRLtoTHB(){
		BRLtoUSD();
		USDtoTHB();
	}
	public static void BRLtoTRY(){
		BRLtoUSD();
		USDtoTRY();
	}
	public static void BRLtoUGX(){
		BRLtoUSD();
		USDtoUGX();
	}
	public static void BRLtoUAH(){
		BRLtoUSD();
		USDtoUAH();
	}
	public static void BRLtoAED(){
		BRLtoUSD();
		USDtoAED();
	}
	public static void BRLtoVND(){
		BRLtoUSD();
		USDtoVND();
	}
	public static void BRLtoZMW(){
		BRLtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	//----------------- GBP Conversions -------------------//
	public static void GBPtoUSD(){
		unit= unit.multiply(new BigDecimal("1.31"));
	}
	public static void GBPtoEUR(){
		GBPtoUSD();
		USDtoEUR();
	}
	public static void GBPtoHKD(){
		GBPtoUSD();
		USDtoHKD();
	}
	public static void GBPtoBitcoin(){
		GBPtoUSD();
		USDtoBitcoin();
	}
	public static void GBPtoBitcoinCash(){
		GBPtoUSD();
		USDtoBitcoinCash();
	}
	public static void GBPtoJPY(){
		GBPtoUSD();
		USDtoJPY();
	}
	public static void GBPtoCNY(){
		GBPtoUSD();
		USDtoCNY();
	}
	public static void GBPtoINR(){
		GBPtoUSD();
		USDtoINR();
	}
	public static void GBPtoDZD(){
		GBPtoUSD();
		USDtoDZD();
	}
	public static void GBPtoARS(){
		GBPtoUSD();
		USDtoARS();
	}
	public static void GBPtoAUD(){
		GBPtoUSD();
		USDtoAUD();
	}
	public static void GBPtoBRL(){
		GBPtoUSD();
		USDtoBRL();
	}
	public static void GBPtoGBP(){
		GBPtoUSD();
		USDtoGBP();
	}
	public static void GBPtoBGN(){
		GBPtoUSD();
		USDtoBGN();
	}
	public static void GBPtoKHR(){
		GBPtoUSD();
		USDtoKHR();
	}
	public static void GBPtoCAD(){
		GBPtoUSD();
		USDtoCAD();
	}
	public static void GBPtoCLP(){
		GBPtoUSD();
		USDtoCLP();
	}
	public static void GBPtoCOP(){
		GBPtoUSD();
		USDtoCOP();
	}
	public static void GBPtoCRC(){
		GBPtoUSD();
		USDtoCRC();
	}
	public static void GBPtoHRK(){
		GBPtoUSD();
		USDtoHRK();
	}
	public static void GBPtoCZK(){
		GBPtoUSD();
		USDtoCZK();
	}
	public static void GBPtoDKK(){
		GBPtoUSD();
		USDtoDKK();
	}
	public static void GBPtoEGP(){
		GBPtoUSD();
		USDtoEGP();
	}
	public static void GBPtoISK(){
		GBPtoUSD();
		USDtoISK();
	}
	public static void GBPtoIDR(){
		GBPtoUSD();
		USDtoIDR();
	}
	public static void GBPtoIQD(){
		GBPtoUSD();
		USDtoIQD();
	}
	public static void GBPtoILS(){
		GBPtoUSD();
		USDtoILS();
	}
	public static void GBPtoJOD(){
		GBPtoUSD();
		USDtoJOD();
	}
	public static void GBPtoKES(){
		GBPtoUSD();
		USDtoKES();
	}
	public static void GBPtoKWD(){
		GBPtoUSD();
		USDtoKWD();
	}
	public static void GBPtoMYR(){
		GBPtoUSD();
		USDtoMYR();
	}
	public static void GBPtoMXN(){
		GBPtoUSD();
		USDtoMXN();
	}
	public static void GBPtoMAD(){
		GBPtoUSD();
		USDtoMAD();
	}
	public static void GBPtoMMK(){
		GBPtoUSD();
		USDtoMMK();
	}
	public static void GBPtoTWD(){
		GBPtoUSD();
		USDtoTWD();
	}
	public static void GBPtoNZD(){
		GBPtoUSD();
		USDtoNZD();
	}
	public static void GBPtoNOK(){
		GBPtoUSD();
		USDtoNOK();
	}
	public static void GBPtoPHP(){
		GBPtoUSD();
		USDtoPHP();
	}
	public static void GBPtoQAR(){
		GBPtoUSD();
		USDtoQAR();
	}
	public static void GBPtoRON(){
		GBPtoUSD();
		USDtoRON();
	}
	public static void GBPtoRUB(){
		GBPtoUSD();
		USDtoRUB();
	}
	public static void GBPtoSAR(){
		GBPtoUSD();
		USDtoSAR();
	}
	public static void GBPtoRSD(){
		GBPtoUSD();
		USDtoRSD();
	}
	public static void GBPtoSGD(){
		GBPtoUSD();
		USDtoSGD();
	}
	public static void GBPtoZAR(){
		GBPtoUSD();
		USDtoZAR();
	}
	public static void GBPtoKRW(){
		GBPtoUSD();
		USDtoKRW();
	}
	public static void GBPtoLKR(){
		GBPtoUSD();
		USDtoLKR();
	}
	public static void GBPtoSEK(){
		GBPtoUSD();
		USDtoSEK();
	}
	public static void GBPtoCHF(){
		GBPtoUSD();
		USDtoCHF();
	}
	public static void GBPtoSYP(){
		GBPtoUSD();
		USDtoSYP();
	}
	public static void GBPtoTZS(){
		GBPtoUSD();
		USDtoTZS();
	}
	public static void GBPtoTHB(){
		GBPtoUSD();
		USDtoTHB();
	}
	public static void GBPtoTRY(){
		GBPtoUSD();
		USDtoTRY();
	}
	public static void GBPtoUGX(){
		GBPtoUSD();
		USDtoUGX();
	}
	public static void GBPtoUAH(){
		GBPtoUSD();
		USDtoUAH();
	}
	public static void GBPtoAED(){
		GBPtoUSD();
		USDtoAED();
	}
	public static void GBPtoVND(){
		GBPtoUSD();
		USDtoVND();
	}
	public static void GBPtoZMW(){
		GBPtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	//----------------- KHR Conversions -------------------//
	public static void KHRtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00025"));
	}
	public static void KHRtoEUR(){
		KHRtoUSD();
		USDtoEUR();
	}
	public static void KHRtoHKD(){
		KHRtoUSD();
		USDtoHKD();
	}
	public static void KHRtoBitcoin(){
		KHRtoUSD();
		USDtoBitcoin();
	}
	public static void KHRtoBitcoinCash(){
		KHRtoUSD();
		USDtoBitcoinCash();
	}
	public static void KHRtoJPY(){
		KHRtoUSD();
		USDtoJPY();
	}
	public static void KHRtoCNY(){
		KHRtoUSD();
		USDtoCNY();
	}
	public static void KHRtoINR(){
		KHRtoUSD();
		USDtoINR();
	}
	public static void KHRtoDZD(){
		KHRtoUSD();
		USDtoDZD();
	}
	public static void KHRtoARS(){
		KHRtoUSD();
		USDtoARS();
	}
	public static void KHRtoAUD(){
		KHRtoUSD();
		USDtoAUD();
	}
	public static void KHRtoBRL(){
		KHRtoUSD();
		USDtoBRL();
	}
	public static void KHRtoGBP(){
		KHRtoUSD();
		USDtoGBP();
	}
	public static void KHRtoBGN(){
		KHRtoUSD();
		USDtoBGN();
	}
	public static void KHRtoKHR(){
		KHRtoUSD();
		USDtoKHR();
	}
	public static void KHRtoCAD(){
		KHRtoUSD();
		USDtoCAD();
	}
	public static void KHRtoCLP(){
		KHRtoUSD();
		USDtoCLP();
	}
	public static void KHRtoCOP(){
		KHRtoUSD();
		USDtoCOP();
	}
	public static void KHRtoCRC(){
		KHRtoUSD();
		USDtoCRC();
	}
	public static void KHRtoHRK(){
		KHRtoUSD();
		USDtoHRK();
	}
	public static void KHRtoCZK(){
		KHRtoUSD();
		USDtoCZK();
	}
	public static void KHRtoDKK(){
		KHRtoUSD();
		USDtoDKK();
	}
	public static void KHRtoEGP(){
		KHRtoUSD();
		USDtoEGP();
	}
	public static void KHRtoISK(){
		KHRtoUSD();
		USDtoISK();
	}
	public static void KHRtoIDR(){
		KHRtoUSD();
		USDtoIDR();
	}
	public static void KHRtoIQD(){
		KHRtoUSD();
		USDtoIQD();
	}
	public static void KHRtoILS(){
		KHRtoUSD();
		USDtoILS();
	}
	public static void KHRtoJOD(){
		KHRtoUSD();
		USDtoJOD();
	}
	public static void KHRtoKES(){
		KHRtoUSD();
		USDtoKES();
	}
	public static void KHRtoKWD(){
		KHRtoUSD();
		USDtoKWD();
	}
	public static void KHRtoMYR(){
		KHRtoUSD();
		USDtoMYR();
	}
	public static void KHRtoMXN(){
		KHRtoUSD();
		USDtoMXN();
	}
	public static void KHRtoMAD(){
		KHRtoUSD();
		USDtoMAD();
	}
	public static void KHRtoMMK(){
		KHRtoUSD();
		USDtoMMK();
	}
	public static void KHRtoTWD(){
		KHRtoUSD();
		USDtoTWD();
	}
	public static void KHRtoNZD(){
		KHRtoUSD();
		USDtoNZD();
	}
	public static void KHRtoNOK(){
		KHRtoUSD();
		USDtoNOK();
	}
	public static void KHRtoPHP(){
		KHRtoUSD();
		USDtoPHP();
	}
	public static void KHRtoQAR(){
		KHRtoUSD();
		USDtoQAR();
	}
	public static void KHRtoRON(){
		KHRtoUSD();
		USDtoRON();
	}
	public static void KHRtoRUB(){
		KHRtoUSD();
		USDtoRUB();
	}
	public static void KHRtoSAR(){
		KHRtoUSD();
		USDtoSAR();
	}
	public static void KHRtoRSD(){
		KHRtoUSD();
		USDtoRSD();
	}
	public static void KHRtoSGD(){
		KHRtoUSD();
		USDtoSGD();
	}
	public static void KHRtoZAR(){
		KHRtoUSD();
		USDtoZAR();
	}
	public static void KHRtoKRW(){
		KHRtoUSD();
		USDtoKRW();
	}
	public static void KHRtoLKR(){
		KHRtoUSD();
		USDtoLKR();
	}
	public static void KHRtoSEK(){
		KHRtoUSD();
		USDtoSEK();
	}
	public static void KHRtoCHF(){
		KHRtoUSD();
		USDtoCHF();
	}
	public static void KHRtoSYP(){
		KHRtoUSD();
		USDtoSYP();
	}
	public static void KHRtoTZS(){
		KHRtoUSD();
		USDtoTZS();
	}
	public static void KHRtoTHB(){
		KHRtoUSD();
		USDtoTHB();
	}
	public static void KHRtoTRY(){
		KHRtoUSD();
		USDtoTRY();
	}
	public static void KHRtoUGX(){
		KHRtoUSD();
		USDtoUGX();
	}
	public static void KHRtoUAH(){
		KHRtoUSD();
		USDtoUAH();
	}
	public static void KHRtoAED(){
		KHRtoUSD();
		USDtoAED();
	}
	public static void KHRtoVND(){
		KHRtoUSD();
		USDtoVND();
	}
	public static void KHRtoZMW(){
		KHRtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	//----------------- CAD Conversions -------------------//
	public static void CADtoUSD(){
		unit= unit.multiply(new BigDecimal("0.76"));
	}
	public static void CADtoEUR(){
		CADtoUSD();
		USDtoEUR();
	}
	public static void CADtoHKD(){
		CADtoUSD();
		USDtoHKD();
	}
	public static void CADtoBitcoin(){
		CADtoUSD();
		USDtoBitcoin();
	}
	public static void CADtoBitcoinCash(){
		CADtoUSD();
		USDtoBitcoinCash();
	}
	public static void CADtoJPY(){
		CADtoUSD();
		USDtoJPY();
	}
	public static void CADtoCNY(){
		CADtoUSD();
		USDtoCNY();
	}
	public static void CADtoINR(){
		CADtoUSD();
		USDtoINR();
	}
	public static void CADtoDZD(){
		CADtoUSD();
		USDtoDZD();
	}
	public static void CADtoARS(){
		CADtoUSD();
		USDtoARS();
	}
	public static void CADtoAUD(){
		CADtoUSD();
		USDtoAUD();
	}
	public static void CADtoBRL(){
		CADtoUSD();
		USDtoBRL();
	}
	public static void CADtoGBP(){
		CADtoUSD();
		USDtoGBP();
	}
	public static void CADtoBGN(){
		CADtoUSD();
		USDtoBGN();
	}
	public static void CADtoKHR(){
		CADtoUSD();
		USDtoKHR();
	}
	public static void CADtoCAD(){
		CADtoUSD();
		USDtoCAD();
	}
	public static void CADtoCLP(){
		CADtoUSD();
		USDtoCLP();
	}
	public static void CADtoCOP(){
		CADtoUSD();
		USDtoCOP();
	}
	public static void CADtoCRC(){
		CADtoUSD();
		USDtoCRC();
	}
	public static void CADtoHRK(){
		CADtoUSD();
		USDtoHRK();
	}
	public static void CADtoCZK(){
		CADtoUSD();
		USDtoCZK();
	}
	public static void CADtoDKK(){
		CADtoUSD();
		USDtoDKK();
	}
	public static void CADtoEGP(){
		CADtoUSD();
		USDtoEGP();
	}
	public static void CADtoISK(){
		CADtoUSD();
		USDtoISK();
	}
	public static void CADtoIDR(){
		CADtoUSD();
		USDtoIDR();
	}
	public static void CADtoIQD(){
		CADtoUSD();
		USDtoIQD();
	}
	public static void CADtoILS(){
		CADtoUSD();
		USDtoILS();
	}
	public static void CADtoJOD(){
		CADtoUSD();
		USDtoJOD();
	}
	public static void CADtoKES(){
		CADtoUSD();
		USDtoKES();
	}
	public static void CADtoKWD(){
		CADtoUSD();
		USDtoKWD();
	}
	public static void CADtoMYR(){
		CADtoUSD();
		USDtoMYR();
	}
	public static void CADtoMXN(){
		CADtoUSD();
		USDtoMXN();
	}
	public static void CADtoMAD(){
		CADtoUSD();
		USDtoMAD();
	}
	public static void CADtoMMK(){
		CADtoUSD();
		USDtoMMK();
	}
	public static void CADtoTWD(){
		CADtoUSD();
		USDtoTWD();
	}
	public static void CADtoNZD(){
		CADtoUSD();
		USDtoNZD();
	}
	public static void CADtoNOK(){
		CADtoUSD();
		USDtoNOK();
	}
	public static void CADtoPHP(){
		CADtoUSD();
		USDtoPHP();
	}
	public static void CADtoQAR(){
		CADtoUSD();
		USDtoQAR();
	}
	public static void CADtoRON(){
		CADtoUSD();
		USDtoRON();
	}
	public static void CADtoRUB(){
		CADtoUSD();
		USDtoRUB();
	}
	public static void CADtoSAR(){
		CADtoUSD();
		USDtoSAR();
	}
	public static void CADtoRSD(){
		CADtoUSD();
		USDtoRSD();
	}
	public static void CADtoSGD(){
		CADtoUSD();
		USDtoSGD();
	}
	public static void CADtoZAR(){
		CADtoUSD();
		USDtoZAR();
	}
	public static void CADtoKRW(){
		CADtoUSD();
		USDtoKRW();
	}
	public static void CADtoLKR(){
		CADtoUSD();
		USDtoLKR();
	}
	public static void CADtoSEK(){
		CADtoUSD();
		USDtoSEK();
	}
	public static void CADtoCHF(){
		CADtoUSD();
		USDtoCHF();
	}
	public static void CADtoSYP(){
		CADtoUSD();
		USDtoSYP();
	}
	public static void CADtoTZS(){
		CADtoUSD();
		USDtoTZS();
	}
	public static void CADtoTHB(){
		CADtoUSD();
		USDtoTHB();
	}
	public static void CADtoTRY(){
		CADtoUSD();
		USDtoTRY();
	}
	public static void CADtoUGX(){
		CADtoUSD();
		USDtoUGX();
	}
	public static void CADtoUAH(){
		CADtoUSD();
		USDtoUAH();
	}
	public static void CADtoAED(){
		CADtoUSD();
		USDtoAED();
	}
	public static void CADtoVND(){
		CADtoUSD();
		USDtoVND();
	}
	public static void CADtoZMW(){
		CADtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	//----------------- BGN Conversions -------------------//
	public static void BGNtoUSD(){
		unit= unit.multiply(new BigDecimal("0.59"));
	}
	public static void BGNtoEUR(){
		BGNtoUSD();
		USDtoEUR();
	}
	public static void BGNtoHKD(){
		BGNtoUSD();
		USDtoHKD();
	}
	public static void BGNtoBitcoin(){
		BGNtoUSD();
		USDtoBitcoin();
	}
	public static void BGNtoBitcoinCash(){
		BGNtoUSD();
		USDtoBitcoinCash();
	}
	public static void BGNtoJPY(){
		BGNtoUSD();
		USDtoJPY();
	}
	public static void BGNtoCNY(){
		BGNtoUSD();
		USDtoCNY();
	}
	public static void BGNtoINR(){
		BGNtoUSD();
		USDtoINR();
	}
	public static void BGNtoDZD(){
		BGNtoUSD();
		USDtoDZD();
	}
	public static void BGNtoARS(){
		BGNtoUSD();
		USDtoARS();
	}
	public static void BGNtoAUD(){
		BGNtoUSD();
		USDtoAUD();
	}
	public static void BGNtoBRL(){
		BGNtoUSD();
		USDtoBRL();
	}
	public static void BGNtoGBP(){
		BGNtoUSD();
		USDtoGBP();
	}
	public static void BGNtoBGN(){
		BGNtoUSD();
		USDtoBGN();
	}
	public static void BGNtoKHR(){
		BGNtoUSD();
		USDtoKHR();
	}
	public static void BGNtoCAD(){
		BGNtoUSD();
		USDtoCAD();
	}
	public static void BGNtoCLP(){
		BGNtoUSD();
		USDtoCLP();
	}
	public static void BGNtoCOP(){
		BGNtoUSD();
		USDtoCOP();
	}
	public static void BGNtoCRC(){
		BGNtoUSD();
		USDtoCRC();
	}
	public static void BGNtoHRK(){
		BGNtoUSD();
		USDtoHRK();
	}
	public static void BGNtoCZK(){
		BGNtoUSD();
		USDtoCZK();
	}
	public static void BGNtoDKK(){
		BGNtoUSD();
		USDtoDKK();
	}
	public static void BGNtoEGP(){
		BGNtoUSD();
		USDtoEGP();
	}
	public static void BGNtoISK(){
		BGNtoUSD();
		USDtoISK();
	}
	public static void BGNtoIDR(){
		BGNtoUSD();
		USDtoIDR();
	}
	public static void BGNtoIQD(){
		BGNtoUSD();
		USDtoIQD();
	}
	public static void BGNtoILS(){
		BGNtoUSD();
		USDtoILS();
	}
	public static void BGNtoJOD(){
		BGNtoUSD();
		USDtoJOD();
	}
	public static void BGNtoKES(){
		BGNtoUSD();
		USDtoKES();
	}
	public static void BGNtoKWD(){
		BGNtoUSD();
		USDtoKWD();
	}
	public static void BGNtoMYR(){
		BGNtoUSD();
		USDtoMYR();
	}
	public static void BGNtoMXN(){
		BGNtoUSD();
		USDtoMXN();
	}
	public static void BGNtoMAD(){
		BGNtoUSD();
		USDtoMAD();
	}
	public static void BGNtoMMK(){
		BGNtoUSD();
		USDtoMMK();
	}
	public static void BGNtoTWD(){
		BGNtoUSD();
		USDtoTWD();
	}
	public static void BGNtoNZD(){
		BGNtoUSD();
		USDtoNZD();
	}
	public static void BGNtoNOK(){
		BGNtoUSD();
		USDtoNOK();
	}
	public static void BGNtoPHP(){
		BGNtoUSD();
		USDtoPHP();
	}
	public static void BGNtoQAR(){
		BGNtoUSD();
		USDtoQAR();
	}
	public static void BGNtoRON(){
		BGNtoUSD();
		USDtoRON();
	}
	public static void BGNtoRUB(){
		BGNtoUSD();
		USDtoRUB();
	}
	public static void BGNtoSAR(){
		BGNtoUSD();
		USDtoSAR();
	}
	public static void BGNtoRSD(){
		BGNtoUSD();
		USDtoRSD();
	}
	public static void BGNtoSGD(){
		BGNtoUSD();
		USDtoSGD();
	}
	public static void BGNtoZAR(){
		BGNtoUSD();
		USDtoZAR();
	}
	public static void BGNtoKRW(){
		BGNtoUSD();
		USDtoKRW();
	}
	public static void BGNtoLKR(){
		BGNtoUSD();
		USDtoLKR();
	}
	public static void BGNtoSEK(){
		BGNtoUSD();
		USDtoSEK();
	}
	public static void BGNtoCHF(){
		BGNtoUSD();
		USDtoCHF();
	}
	public static void BGNtoSYP(){
		BGNtoUSD();
		USDtoSYP();
	}
	public static void BGNtoTZS(){
		BGNtoUSD();
		USDtoTZS();
	}
	public static void BGNtoTHB(){
		BGNtoUSD();
		USDtoTHB();
	}
	public static void BGNtoTRY(){
		BGNtoUSD();
		USDtoTRY();
	}
	public static void BGNtoUGX(){
		BGNtoUSD();
		USDtoUGX();
	}
	public static void BGNtoUAH(){
		BGNtoUSD();
		USDtoUAH();
	}
	public static void BGNtoAED(){
		BGNtoUSD();
		USDtoAED();
	}
	public static void BGNtoVND(){
		BGNtoUSD();
		USDtoVND();
	}
	public static void BGNtoZMW(){
		BGNtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	//----------------- CLP Conversions -------------------//
	public static void CLPtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0015"));
	}
	public static void CLPtoEUR(){
		CLPtoUSD();
		USDtoEUR();
	}
	public static void CLPtoHKD(){
		CLPtoUSD();
		USDtoHKD();
	}
	public static void CLPtoBitcoin(){
		CLPtoUSD();
		USDtoBitcoin();
	}
	public static void CLPtoBitcoinCash(){
		CLPtoUSD();
		USDtoBitcoinCash();
	}
	public static void CLPtoJPY(){
		CLPtoUSD();
		USDtoJPY();
	}
	public static void CLPtoCNY(){
		CLPtoUSD();
		USDtoCNY();
	}
	public static void CLPtoINR(){
		CLPtoUSD();
		USDtoINR();
	}
	public static void CLPtoDZD(){
		CLPtoUSD();
		USDtoDZD();
	}
	public static void CLPtoARS(){
		CLPtoUSD();
		USDtoARS();
	}
	public static void CLPtoAUD(){
		CLPtoUSD();
		USDtoAUD();
	}
	public static void CLPtoBRL(){
		CLPtoUSD();
		USDtoBRL();
	}
	public static void CLPtoGBP(){
		CLPtoUSD();
		USDtoGBP();
	}
	public static void CLPtoBGN(){
		CLPtoUSD();
		USDtoBGN();
	}
	public static void CLPtoKHR(){
		CLPtoUSD();
		USDtoKHR();
	}
	public static void CLPtoCAD(){
		CLPtoUSD();
		USDtoCAD();
	}
	public static void CLPtoCLP(){
		CLPtoUSD();
		USDtoCLP();
	}
	public static void CLPtoCOP(){
		CLPtoUSD();
		USDtoCOP();
	}
	public static void CLPtoCRC(){
		CLPtoUSD();
		USDtoCRC();
	}
	public static void CLPtoHRK(){
		CLPtoUSD();
		USDtoHRK();
	}
	public static void CLPtoCZK(){
		CLPtoUSD();
		USDtoCZK();
	}
	public static void CLPtoDKK(){
		CLPtoUSD();
		USDtoDKK();
	}
	public static void CLPtoEGP(){
		CLPtoUSD();
		USDtoEGP();
	}
	public static void CLPtoISK(){
		CLPtoUSD();
		USDtoISK();
	}
	public static void CLPtoIDR(){
		CLPtoUSD();
		USDtoIDR();
	}
	public static void CLPtoIQD(){
		CLPtoUSD();
		USDtoIQD();
	}
	public static void CLPtoILS(){
		CLPtoUSD();
		USDtoILS();
	}
	public static void CLPtoJOD(){
		CLPtoUSD();
		USDtoJOD();
	}
	public static void CLPtoKES(){
		CLPtoUSD();
		USDtoKES();
	}
	public static void CLPtoKWD(){
		CLPtoUSD();
		USDtoKWD();
	}
	public static void CLPtoMYR(){
		CLPtoUSD();
		USDtoMYR();
	}
	public static void CLPtoMXN(){
		CLPtoUSD();
		USDtoMXN();
	}
	public static void CLPtoMAD(){
		CLPtoUSD();
		USDtoMAD();
	}
	public static void CLPtoMMK(){
		CLPtoUSD();
		USDtoMMK();
	}
	public static void CLPtoTWD(){
		CLPtoUSD();
		USDtoTWD();
	}
	public static void CLPtoNZD(){
		CLPtoUSD();
		USDtoNZD();
	}
	public static void CLPtoNOK(){
		CLPtoUSD();
		USDtoNOK();
	}
	public static void CLPtoPHP(){
		CLPtoUSD();
		USDtoPHP();
	}
	public static void CLPtoQAR(){
		CLPtoUSD();
		USDtoQAR();
	}
	public static void CLPtoRON(){
		CLPtoUSD();
		USDtoRON();
	}
	public static void CLPtoRUB(){
		CLPtoUSD();
		USDtoRUB();
	}
	public static void CLPtoSAR(){
		CLPtoUSD();
		USDtoSAR();
	}
	public static void CLPtoRSD(){
		CLPtoUSD();
		USDtoRSD();
	}
	public static void CLPtoSGD(){
		CLPtoUSD();
		USDtoSGD();
	}
	public static void CLPtoZAR(){
		CLPtoUSD();
		USDtoZAR();
	}
	public static void CLPtoKRW(){
		CLPtoUSD();
		USDtoKRW();
	}
	public static void CLPtoLKR(){
		CLPtoUSD();
		USDtoLKR();
	}
	public static void CLPtoSEK(){
		CLPtoUSD();
		USDtoSEK();
	}
	public static void CLPtoCHF(){
		CLPtoUSD();
		USDtoCHF();
	}
	public static void CLPtoSYP(){
		CLPtoUSD();
		USDtoSYP();
	}
	public static void CLPtoTZS(){
		CLPtoUSD();
		USDtoTZS();
	}
	public static void CLPtoTHB(){
		CLPtoUSD();
		USDtoTHB();
	}
	public static void CLPtoTRY(){
		CLPtoUSD();
		USDtoTRY();
	}
	public static void CLPtoUGX(){
		CLPtoUSD();
		USDtoUGX();
	}
	public static void CLPtoUAH(){
		CLPtoUSD();
		USDtoUAH();
	}
	public static void CLPtoAED(){
		CLPtoUSD();
		USDtoAED();
	}
	public static void CLPtoVND(){
		CLPtoUSD();
		USDtoVND();
	}
	public static void CLPtoZMW(){
		CLPtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- COP Conversions -------------------//
	public static void COPtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00032"));
	}
	public static void COPtoEUR(){
		COPtoUSD();
		USDtoEUR();
	}
	public static void COPtoHKD(){
		COPtoUSD();
		USDtoHKD();
	}
	public static void COPtoBitcoin(){
		COPtoUSD();
		USDtoBitcoin();
	}
	public static void COPtoBitcoinCash(){
		COPtoUSD();
		USDtoBitcoinCash();
	}
	public static void COPtoJPY(){
		COPtoUSD();
		USDtoJPY();
	}
	public static void COPtoCNY(){
		COPtoUSD();
		USDtoCNY();
	}
	public static void COPtoINR(){
		COPtoUSD();
		USDtoINR();
	}
	public static void COPtoDZD(){
		COPtoUSD();
		USDtoDZD();
	}
	public static void COPtoARS(){
		COPtoUSD();
		USDtoARS();
	}
	public static void COPtoAUD(){
		COPtoUSD();
		USDtoAUD();
	}
	public static void COPtoBRL(){
		COPtoUSD();
		USDtoBRL();
	}
	public static void COPtoGBP(){
		COPtoUSD();
		USDtoGBP();
	}
	public static void COPtoBGN(){
		COPtoUSD();
		USDtoBGN();
	}
	public static void COPtoKHR(){
		COPtoUSD();
		USDtoKHR();
	}
	public static void COPtoCAD(){
		COPtoUSD();
		USDtoCAD();
	}
	public static void COPtoCLP(){
		COPtoUSD();
		USDtoCLP();
	}
	public static void COPtoCOP(){
		COPtoUSD();
		USDtoCOP();
	}
	public static void COPtoCRC(){
		COPtoUSD();
		USDtoCRC();
	}
	public static void COPtoHRK(){
		COPtoUSD();
		USDtoHRK();
	}
	public static void COPtoCZK(){
		COPtoUSD();
		USDtoCZK();
	}
	public static void COPtoDKK(){
		COPtoUSD();
		USDtoDKK();
	}
	public static void COPtoEGP(){
		COPtoUSD();
		USDtoEGP();
	}
	public static void COPtoISK(){
		COPtoUSD();
		USDtoISK();
	}
	public static void COPtoIDR(){
		COPtoUSD();
		USDtoIDR();
	}
	public static void COPtoIQD(){
		COPtoUSD();
		USDtoIQD();
	}
	public static void COPtoILS(){
		COPtoUSD();
		USDtoILS();
	}
	public static void COPtoJOD(){
		COPtoUSD();
		USDtoJOD();
	}
	public static void COPtoKES(){
		COPtoUSD();
		USDtoKES();
	}
	public static void COPtoKWD(){
		COPtoUSD();
		USDtoKWD();
	}
	public static void COPtoMYR(){
		COPtoUSD();
		USDtoMYR();
	}
	public static void COPtoMXN(){
		COPtoUSD();
		USDtoMXN();
	}
	public static void COPtoMAD(){
		COPtoUSD();
		USDtoMAD();
	}
	public static void COPtoMMK(){
		COPtoUSD();
		USDtoMMK();
	}
	public static void COPtoTWD(){
		COPtoUSD();
		USDtoTWD();
	}
	public static void COPtoNZD(){
		COPtoUSD();
		USDtoNZD();
	}
	public static void COPtoNOK(){
		COPtoUSD();
		USDtoNOK();
	}
	public static void COPtoPHP(){
		COPtoUSD();
		USDtoPHP();
	}
	public static void COPtoQAR(){
		COPtoUSD();
		USDtoQAR();
	}
	public static void COPtoRON(){
		COPtoUSD();
		USDtoRON();
	}
	public static void COPtoRUB(){
		COPtoUSD();
		USDtoRUB();
	}
	public static void COPtoSAR(){
		COPtoUSD();
		USDtoSAR();
	}
	public static void COPtoRSD(){
		COPtoUSD();
		USDtoRSD();
	}
	public static void COPtoSGD(){
		COPtoUSD();
		USDtoSGD();
	}
	public static void COPtoZAR(){
		COPtoUSD();
		USDtoZAR();
	}
	public static void COPtoKRW(){
		COPtoUSD();
		USDtoKRW();
	}
	public static void COPtoLKR(){
		COPtoUSD();
		USDtoLKR();
	}
	public static void COPtoSEK(){
		COPtoUSD();
		USDtoSEK();
	}
	public static void COPtoCHF(){
		COPtoUSD();
		USDtoCHF();
	}
	public static void COPtoSYP(){
		COPtoUSD();
		USDtoSYP();
	}
	public static void COPtoTZS(){
		COPtoUSD();
		USDtoTZS();
	}
	public static void COPtoTHB(){
		COPtoUSD();
		USDtoTHB();
	}
	public static void COPtoTRY(){
		COPtoUSD();
		USDtoTRY();
	}
	public static void COPtoUGX(){
		COPtoUSD();
		USDtoUGX();
	}
	public static void COPtoUAH(){
		COPtoUSD();
		USDtoUAH();
	}
	public static void COPtoAED(){
		COPtoUSD();
		USDtoAED();
	}
	public static void COPtoVND(){
		COPtoUSD();
		USDtoVND();
	}
	public static void COPtoZMW(){
		COPtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- CRC Conversions -------------------//
	public static void CRCtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0017"));
	}
	public static void CRCtoEUR(){
		CRCtoUSD();
		USDtoEUR();
	}
	public static void CRCtoHKD(){
		CRCtoUSD();
		USDtoHKD();
	}
	public static void CRCtoBitcoin(){
		CRCtoUSD();
		USDtoBitcoin();
	}
	public static void CRCtoBitcoinCash(){
		CRCtoUSD();
		USDtoBitcoinCash();
	}
	public static void CRCtoJPY(){
		CRCtoUSD();
		USDtoJPY();
	}
	public static void CRCtoCNY(){
		CRCtoUSD();
		USDtoCNY();
	}
	public static void CRCtoINR(){
		CRCtoUSD();
		USDtoINR();
	}
	public static void CRCtoDZD(){
		CRCtoUSD();
		USDtoDZD();
	}
	public static void CRCtoARS(){
		CRCtoUSD();
		USDtoARS();
	}
	public static void CRCtoAUD(){
		CRCtoUSD();
		USDtoAUD();
	}
	public static void CRCtoBRL(){
		CRCtoUSD();
		USDtoBRL();
	}
	public static void CRCtoGBP(){
		CRCtoUSD();
		USDtoGBP();
	}
	public static void CRCtoBGN(){
		CRCtoUSD();
		USDtoBGN();
	}
	public static void CRCtoKHR(){
		CRCtoUSD();
		USDtoKHR();
	}
	public static void CRCtoCAD(){
		CRCtoUSD();
		USDtoCAD();
	}
	public static void CRCtoCLP(){
		CRCtoUSD();
		USDtoCLP();
	}
	public static void CRCtoCOP(){
		CRCtoUSD();
		USDtoCOP();
	}
	public static void CRCtoCRC(){
		CRCtoUSD();
		USDtoCRC();
	}
	public static void CRCtoHRK(){
		CRCtoUSD();
		USDtoHRK();
	}
	public static void CRCtoCZK(){
		CRCtoUSD();
		USDtoCZK();
	}
	public static void CRCtoDKK(){
		CRCtoUSD();
		USDtoDKK();
	}
	public static void CRCtoEGP(){
		CRCtoUSD();
		USDtoEGP();
	}
	public static void CRCtoISK(){
		CRCtoUSD();
		USDtoISK();
	}
	public static void CRCtoIDR(){
		CRCtoUSD();
		USDtoIDR();
	}
	public static void CRCtoIQD(){
		CRCtoUSD();
		USDtoIQD();
	}
	public static void CRCtoILS(){
		CRCtoUSD();
		USDtoILS();
	}
	public static void CRCtoJOD(){
		CRCtoUSD();
		USDtoJOD();
	}
	public static void CRCtoKES(){
		CRCtoUSD();
		USDtoKES();
	}
	public static void CRCtoKWD(){
		CRCtoUSD();
		USDtoKWD();
	}
	public static void CRCtoMYR(){
		CRCtoUSD();
		USDtoMYR();
	}
	public static void CRCtoMXN(){
		CRCtoUSD();
		USDtoMXN();
	}
	public static void CRCtoMAD(){
		CRCtoUSD();
		USDtoMAD();
	}
	public static void CRCtoMMK(){
		CRCtoUSD();
		USDtoMMK();
	}
	public static void CRCtoTWD(){
		CRCtoUSD();
		USDtoTWD();
	}
	public static void CRCtoNZD(){
		CRCtoUSD();
		USDtoNZD();
	}
	public static void CRCtoNOK(){
		CRCtoUSD();
		USDtoNOK();
	}
	public static void CRCtoPHP(){
		CRCtoUSD();
		USDtoPHP();
	}
	public static void CRCtoQAR(){
		CRCtoUSD();
		USDtoQAR();
	}
	public static void CRCtoRON(){
		CRCtoUSD();
		USDtoRON();
	}
	public static void CRCtoRUB(){
		CRCtoUSD();
		USDtoRUB();
	}
	public static void CRCtoSAR(){
		CRCtoUSD();
		USDtoSAR();
	}
	public static void CRCtoRSD(){
		CRCtoUSD();
		USDtoRSD();
	}
	public static void CRCtoSGD(){
		CRCtoUSD();
		USDtoSGD();
	}
	public static void CRCtoZAR(){
		CRCtoUSD();
		USDtoZAR();
	}
	public static void CRCtoKRW(){
		CRCtoUSD();
		USDtoKRW();
	}
	public static void CRCtoLKR(){
		CRCtoUSD();
		USDtoLKR();
	}
	public static void CRCtoSEK(){
		CRCtoUSD();
		USDtoSEK();
	}
	public static void CRCtoCHF(){
		CRCtoUSD();
		USDtoCHF();
	}
	public static void CRCtoSYP(){
		CRCtoUSD();
		USDtoSYP();
	}
	public static void CRCtoTZS(){
		CRCtoUSD();
		USDtoTZS();
	}
	public static void CRCtoTHB(){
		CRCtoUSD();
		USDtoTHB();
	}
	public static void CRCtoTRY(){
		CRCtoUSD();
		USDtoTRY();
	}
	public static void CRCtoUGX(){
		CRCtoUSD();
		USDtoUGX();
	}
	public static void CRCtoUAH(){
		CRCtoUSD();
		USDtoUAH();
	}
	public static void CRCtoAED(){
		CRCtoUSD();
		USDtoAED();
	}
	public static void CRCtoVND(){
		CRCtoUSD();
		USDtoVND();
	}
	public static void CRCtoZMW(){
		CRCtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- HRK Conversions -------------------//
	public static void HRKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.16"));
	}
	public static void HRKtoEUR(){
		HRKtoUSD();
		USDtoEUR();
	}
	public static void HRKtoHKD(){
		HRKtoUSD();
		USDtoHKD();
	}
	public static void HRKtoBitcoin(){
		HRKtoUSD();
		USDtoBitcoin();
	}
	public static void HRKtoBitcoinCash(){
		HRKtoUSD();
		USDtoBitcoinCash();
	}
	public static void HRKtoJPY(){
		HRKtoUSD();
		USDtoJPY();
	}
	public static void HRKtoCNY(){
		HRKtoUSD();
		USDtoCNY();
	}
	public static void HRKtoINR(){
		HRKtoUSD();
		USDtoINR();
	}
	public static void HRKtoDZD(){
		HRKtoUSD();
		USDtoDZD();
	}
	public static void HRKtoARS(){
		HRKtoUSD();
		USDtoARS();
	}
	public static void HRKtoAUD(){
		HRKtoUSD();
		USDtoAUD();
	}
	public static void HRKtoBRL(){
		HRKtoUSD();
		USDtoBRL();
	}
	public static void HRKtoGBP(){
		HRKtoUSD();
		USDtoGBP();
	}
	public static void HRKtoBGN(){
		HRKtoUSD();
		USDtoBGN();
	}
	public static void HRKtoKHR(){
		HRKtoUSD();
		USDtoKHR();
	}
	public static void HRKtoCAD(){
		HRKtoUSD();
		USDtoCAD();
	}
	public static void HRKtoCLP(){
		HRKtoUSD();
		USDtoCLP();
	}
	public static void HRKtoCOP(){
		HRKtoUSD();
		USDtoCOP();
	}
	public static void HRKtoCRC(){
		HRKtoUSD();
		USDtoCRC();
	}
	public static void HRKtoHRK(){
		HRKtoUSD();
		USDtoHRK();
	}
	public static void HRKtoCZK(){
		HRKtoUSD();
		USDtoCZK();
	}
	public static void HRKtoDKK(){
		HRKtoUSD();
		USDtoDKK();
	}
	public static void HRKtoEGP(){
		HRKtoUSD();
		USDtoEGP();
	}
	public static void HRKtoISK(){
		HRKtoUSD();
		USDtoISK();
	}
	public static void HRKtoIDR(){
		HRKtoUSD();
		USDtoIDR();
	}
	public static void HRKtoIQD(){
		HRKtoUSD();
		USDtoIQD();
	}
	public static void HRKtoILS(){
		HRKtoUSD();
		USDtoILS();
	}
	public static void HRKtoJOD(){
		HRKtoUSD();
		USDtoJOD();
	}
	public static void HRKtoKES(){
		HRKtoUSD();
		USDtoKES();
	}
	public static void HRKtoKWD(){
		HRKtoUSD();
		USDtoKWD();
	}
	public static void HRKtoMYR(){
		HRKtoUSD();
		USDtoMYR();
	}
	public static void HRKtoMXN(){
		HRKtoUSD();
		USDtoMXN();
	}
	public static void HRKtoMAD(){
		HRKtoUSD();
		USDtoMAD();
	}
	public static void HRKtoMMK(){
		HRKtoUSD();
		USDtoMMK();
	}
	public static void HRKtoTWD(){
		HRKtoUSD();
		USDtoTWD();
	}
	public static void HRKtoNZD(){
		HRKtoUSD();
		USDtoNZD();
	}
	public static void HRKtoNOK(){
		HRKtoUSD();
		USDtoNOK();
	}
	public static void HRKtoPHP(){
		HRKtoUSD();
		USDtoPHP();
	}
	public static void HRKtoQAR(){
		HRKtoUSD();
		USDtoQAR();
	}
	public static void HRKtoRON(){
		HRKtoUSD();
		USDtoRON();
	}
	public static void HRKtoRUB(){
		HRKtoUSD();
		USDtoRUB();
	}
	public static void HRKtoSAR(){
		HRKtoUSD();
		USDtoSAR();
	}
	public static void HRKtoRSD(){
		HRKtoUSD();
		USDtoRSD();
	}
	public static void HRKtoSGD(){
		HRKtoUSD();
		USDtoSGD();
	}
	public static void HRKtoZAR(){
		HRKtoUSD();
		USDtoZAR();
	}
	public static void HRKtoKRW(){
		HRKtoUSD();
		USDtoKRW();
	}
	public static void HRKtoLKR(){
		HRKtoUSD();
		USDtoLKR();
	}
	public static void HRKtoSEK(){
		HRKtoUSD();
		USDtoSEK();
	}
	public static void HRKtoCHF(){
		HRKtoUSD();
		USDtoCHF();
	}
	public static void HRKtoSYP(){
		HRKtoUSD();
		USDtoSYP();
	}
	public static void HRKtoTZS(){
		HRKtoUSD();
		USDtoTZS();
	}
	public static void HRKtoTHB(){
		HRKtoUSD();
		USDtoTHB();
	}
	public static void HRKtoTRY(){
		HRKtoUSD();
		USDtoTRY();
	}
	public static void HRKtoUGX(){
		HRKtoUSD();
		USDtoUGX();
	}
	public static void HRKtoUAH(){
		HRKtoUSD();
		USDtoUAH();
	}
	public static void HRKtoAED(){
		HRKtoUSD();
		USDtoAED();
	}
	public static void HRKtoVND(){
		HRKtoUSD();
		USDtoVND();
	}
	public static void HRKtoZMW(){
		HRKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- CZK Conversions -------------------//
	public static void CZKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.045"));
	}
	public static void CZKtoEUR(){
		CZKtoUSD();
		USDtoEUR();
	}
	public static void CZKtoHKD(){
		CZKtoUSD();
		USDtoHKD();
	}
	public static void CZKtoBitcoin(){
		CZKtoUSD();
		USDtoBitcoin();
	}
	public static void CZKtoBitcoinCash(){
		CZKtoUSD();
		USDtoBitcoinCash();
	}
	public static void CZKtoJPY(){
		CZKtoUSD();
		USDtoJPY();
	}
	public static void CZKtoCNY(){
		CZKtoUSD();
		USDtoCNY();
	}
	public static void CZKtoINR(){
		CZKtoUSD();
		USDtoINR();
	}
	public static void CZKtoDZD(){
		CZKtoUSD();
		USDtoDZD();
	}
	public static void CZKtoARS(){
		CZKtoUSD();
		USDtoARS();
	}
	public static void CZKtoAUD(){
		CZKtoUSD();
		USDtoAUD();
	}
	public static void CZKtoBRL(){
		CZKtoUSD();
		USDtoBRL();
	}
	public static void CZKtoGBP(){
		CZKtoUSD();
		USDtoGBP();
	}
	public static void CZKtoBGN(){
		CZKtoUSD();
		USDtoBGN();
	}
	public static void CZKtoKHR(){
		CZKtoUSD();
		USDtoKHR();
	}
	public static void CZKtoCAD(){
		CZKtoUSD();
		USDtoCAD();
	}
	public static void CZKtoCLP(){
		CZKtoUSD();
		USDtoCLP();
	}
	public static void CZKtoCOP(){
		CZKtoUSD();
		USDtoCOP();
	}
	public static void CZKtoCRC(){
		CZKtoUSD();
		USDtoCRC();
	}
	public static void CZKtoHRK(){
		CZKtoUSD();
		USDtoHRK();
	}
	public static void CZKtoCZK(){
		CZKtoUSD();
		USDtoCZK();
	}
	public static void CZKtoDKK(){
		CZKtoUSD();
		USDtoDKK();
	}
	public static void CZKtoEGP(){
		CZKtoUSD();
		USDtoEGP();
	}
	public static void CZKtoISK(){
		CZKtoUSD();
		USDtoISK();
	}
	public static void CZKtoIDR(){
		CZKtoUSD();
		USDtoIDR();
	}
	public static void CZKtoIQD(){
		CZKtoUSD();
		USDtoIQD();
	}
	public static void CZKtoILS(){
		CZKtoUSD();
		USDtoILS();
	}
	public static void CZKtoJOD(){
		CZKtoUSD();
		USDtoJOD();
	}
	public static void CZKtoKES(){
		CZKtoUSD();
		USDtoKES();
	}
	public static void CZKtoKWD(){
		CZKtoUSD();
		USDtoKWD();
	}
	public static void CZKtoMYR(){
		CZKtoUSD();
		USDtoMYR();
	}
	public static void CZKtoMXN(){
		CZKtoUSD();
		USDtoMXN();
	}
	public static void CZKtoMAD(){
		CZKtoUSD();
		USDtoMAD();
	}
	public static void CZKtoMMK(){
		CZKtoUSD();
		USDtoMMK();
	}
	public static void CZKtoTWD(){
		CZKtoUSD();
		USDtoTWD();
	}
	public static void CZKtoNZD(){
		CZKtoUSD();
		USDtoNZD();
	}
	public static void CZKtoNOK(){
		CZKtoUSD();
		USDtoNOK();
	}
	public static void CZKtoPHP(){
		CZKtoUSD();
		USDtoPHP();
	}
	public static void CZKtoQAR(){
		CZKtoUSD();
		USDtoQAR();
	}
	public static void CZKtoRON(){
		CZKtoUSD();
		USDtoRON();
	}
	public static void CZKtoRUB(){
		CZKtoUSD();
		USDtoRUB();
	}
	public static void CZKtoSAR(){
		CZKtoUSD();
		USDtoSAR();
	}
	public static void CZKtoRSD(){
		CZKtoUSD();
		USDtoRSD();
	}
	public static void CZKtoSGD(){
		CZKtoUSD();
		USDtoSGD();
	}
	public static void CZKtoZAR(){
		CZKtoUSD();
		USDtoZAR();
	}
	public static void CZKtoKRW(){
		CZKtoUSD();
		USDtoKRW();
	}
	public static void CZKtoLKR(){
		CZKtoUSD();
		USDtoLKR();
	}
	public static void CZKtoSEK(){
		CZKtoUSD();
		USDtoSEK();
	}
	public static void CZKtoCHF(){
		CZKtoUSD();
		USDtoCHF();
	}
	public static void CZKtoSYP(){
		CZKtoUSD();
		USDtoSYP();
	}
	public static void CZKtoTZS(){
		CZKtoUSD();
		USDtoTZS();
	}
	public static void CZKtoTHB(){
		CZKtoUSD();
		USDtoTHB();
	}
	public static void CZKtoTRY(){
		CZKtoUSD();
		USDtoTRY();
	}
	public static void CZKtoUGX(){
		CZKtoUSD();
		USDtoUGX();
	}
	public static void CZKtoUAH(){
		CZKtoUSD();
		USDtoUAH();
	}
	public static void CZKtoAED(){
		CZKtoUSD();
		USDtoAED();
	}
	public static void CZKtoVND(){
		CZKtoUSD();
		USDtoVND();
	}
	public static void CZKtoZMW(){
		CZKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- DKK Conversions -------------------//
	public static void DKKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.15"));
	}
	public static void DKKtoEUR(){
		DKKtoUSD();
		USDtoEUR();
	}
	public static void DKKtoHKD(){
		DKKtoUSD();
		USDtoHKD();
	}
	public static void DKKtoBitcoin(){
		DKKtoUSD();
		USDtoBitcoin();
	}
	public static void DKKtoBitcoinCash(){
		DKKtoUSD();
		USDtoBitcoinCash();
	}
	public static void DKKtoJPY(){
		DKKtoUSD();
		USDtoJPY();
	}
	public static void DKKtoCNY(){
		DKKtoUSD();
		USDtoCNY();
	}
	public static void DKKtoINR(){
		DKKtoUSD();
		USDtoINR();
	}
	public static void DKKtoDZD(){
		DKKtoUSD();
		USDtoDZD();
	}
	public static void DKKtoARS(){
		DKKtoUSD();
		USDtoARS();
	}
	public static void DKKtoAUD(){
		DKKtoUSD();
		USDtoAUD();
	}
	public static void DKKtoBRL(){
		DKKtoUSD();
		USDtoBRL();
	}
	public static void DKKtoGBP(){
		DKKtoUSD();
		USDtoGBP();
	}
	public static void DKKtoBGN(){
		DKKtoUSD();
		USDtoBGN();
	}
	public static void DKKtoKHR(){
		DKKtoUSD();
		USDtoKHR();
	}
	public static void DKKtoCAD(){
		DKKtoUSD();
		USDtoCAD();
	}
	public static void DKKtoCLP(){
		DKKtoUSD();
		USDtoCLP();
	}
	public static void DKKtoCOP(){
		DKKtoUSD();
		USDtoCOP();
	}
	public static void DKKtoCRC(){
		DKKtoUSD();
		USDtoCRC();
	}
	public static void DKKtoHRK(){
		DKKtoUSD();
		USDtoHRK();
	}
	public static void DKKtoCZK(){
		DKKtoUSD();
		USDtoCZK();
	}
	public static void DKKtoDKK(){
		DKKtoUSD();
		USDtoDKK();
	}
	public static void DKKtoEGP(){
		DKKtoUSD();
		USDtoEGP();
	}
	public static void DKKtoISK(){
		DKKtoUSD();
		USDtoISK();
	}
	public static void DKKtoIDR(){
		DKKtoUSD();
		USDtoIDR();
	}
	public static void DKKtoIQD(){
		DKKtoUSD();
		USDtoIQD();
	}
	public static void DKKtoILS(){
		DKKtoUSD();
		USDtoILS();
	}
	public static void DKKtoJOD(){
		DKKtoUSD();
		USDtoJOD();
	}
	public static void DKKtoKES(){
		DKKtoUSD();
		USDtoKES();
	}
	public static void DKKtoKWD(){
		DKKtoUSD();
		USDtoKWD();
	}
	public static void DKKtoMYR(){
		DKKtoUSD();
		USDtoMYR();
	}
	public static void DKKtoMXN(){
		DKKtoUSD();
		USDtoMXN();
	}
	public static void DKKtoMAD(){
		DKKtoUSD();
		USDtoMAD();
	}
	public static void DKKtoMMK(){
		DKKtoUSD();
		USDtoMMK();
	}
	public static void DKKtoTWD(){
		DKKtoUSD();
		USDtoTWD();
	}
	public static void DKKtoNZD(){
		DKKtoUSD();
		USDtoNZD();
	}
	public static void DKKtoNOK(){
		DKKtoUSD();
		USDtoNOK();
	}
	public static void DKKtoPHP(){
		DKKtoUSD();
		USDtoPHP();
	}
	public static void DKKtoQAR(){
		DKKtoUSD();
		USDtoQAR();
	}
	public static void DKKtoRON(){
		DKKtoUSD();
		USDtoRON();
	}
	public static void DKKtoRUB(){
		DKKtoUSD();
		USDtoRUB();
	}
	public static void DKKtoSAR(){
		DKKtoUSD();
		USDtoSAR();
	}
	public static void DKKtoRSD(){
		DKKtoUSD();
		USDtoRSD();
	}
	public static void DKKtoSGD(){
		DKKtoUSD();
		USDtoSGD();
	}
	public static void DKKtoZAR(){
		DKKtoUSD();
		USDtoZAR();
	}
	public static void DKKtoKRW(){
		DKKtoUSD();
		USDtoKRW();
	}
	public static void DKKtoLKR(){
		DKKtoUSD();
		USDtoLKR();
	}
	public static void DKKtoSEK(){
		DKKtoUSD();
		USDtoSEK();
	}
	public static void DKKtoCHF(){
		DKKtoUSD();
		USDtoCHF();
	}
	public static void DKKtoSYP(){
		DKKtoUSD();
		USDtoSYP();
	}
	public static void DKKtoTZS(){
		DKKtoUSD();
		USDtoTZS();
	}
	public static void DKKtoTHB(){
		DKKtoUSD();
		USDtoTHB();
	}
	public static void DKKtoTRY(){
		DKKtoUSD();
		USDtoTRY();
	}
	public static void DKKtoUGX(){
		DKKtoUSD();
		USDtoUGX();
	}
	public static void DKKtoUAH(){
		DKKtoUSD();
		USDtoUAH();
	}
	public static void DKKtoAED(){
		DKKtoUSD();
		USDtoAED();
	}
	public static void DKKtoVND(){
		DKKtoUSD();
		USDtoVND();
	}
	public static void DKKtoZMW(){
		DKKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- EGP Conversions -------------------//
	public static void EGPtoUSD(){
		unit= unit.multiply(new BigDecimal("0.056"));
	}
	public static void EGPtoEUR(){
		EGPtoUSD();
		USDtoEUR();
	}
	public static void EGPtoHKD(){
		EGPtoUSD();
		USDtoHKD();
	}
	public static void EGPtoBitcoin(){
		EGPtoUSD();
		USDtoBitcoin();
	}
	public static void EGPtoBitcoinCash(){
		EGPtoUSD();
		USDtoBitcoinCash();
	}
	public static void EGPtoJPY(){
		EGPtoUSD();
		USDtoJPY();
	}
	public static void EGPtoCNY(){
		EGPtoUSD();
		USDtoCNY();
	}
	public static void EGPtoINR(){
		EGPtoUSD();
		USDtoINR();
	}
	public static void EGPtoDZD(){
		EGPtoUSD();
		USDtoDZD();
	}
	public static void EGPtoARS(){
		EGPtoUSD();
		USDtoARS();
	}
	public static void EGPtoAUD(){
		EGPtoUSD();
		USDtoAUD();
	}
	public static void EGPtoBRL(){
		EGPtoUSD();
		USDtoBRL();
	}
	public static void EGPtoGBP(){
		EGPtoUSD();
		USDtoGBP();
	}
	public static void EGPtoBGN(){
		EGPtoUSD();
		USDtoBGN();
	}
	public static void EGPtoKHR(){
		EGPtoUSD();
		USDtoKHR();
	}
	public static void EGPtoCAD(){
		EGPtoUSD();
		USDtoCAD();
	}
	public static void EGPtoCLP(){
		EGPtoUSD();
		USDtoCLP();
	}
	public static void EGPtoCOP(){
		EGPtoUSD();
		USDtoCOP();
	}
	public static void EGPtoCRC(){
		EGPtoUSD();
		USDtoCRC();
	}
	public static void EGPtoHRK(){
		EGPtoUSD();
		USDtoHRK();
	}
	public static void EGPtoCZK(){
		EGPtoUSD();
		USDtoCZK();
	}
	public static void EGPtoDKK(){
		EGPtoUSD();
		USDtoDKK();
	}
	public static void EGPtoEGP(){
		EGPtoUSD();
		USDtoEGP();
	}
	public static void EGPtoISK(){
		EGPtoUSD();
		USDtoISK();
	}
	public static void EGPtoIDR(){
		EGPtoUSD();
		USDtoIDR();
	}
	public static void EGPtoIQD(){
		EGPtoUSD();
		USDtoIQD();
	}
	public static void EGPtoILS(){
		EGPtoUSD();
		USDtoILS();
	}
	public static void EGPtoJOD(){
		EGPtoUSD();
		USDtoJOD();
	}
	public static void EGPtoKES(){
		EGPtoUSD();
		USDtoKES();
	}
	public static void EGPtoKWD(){
		EGPtoUSD();
		USDtoKWD();
	}
	public static void EGPtoMYR(){
		EGPtoUSD();
		USDtoMYR();
	}
	public static void EGPtoMXN(){
		EGPtoUSD();
		USDtoMXN();
	}
	public static void EGPtoMAD(){
		EGPtoUSD();
		USDtoMAD();
	}
	public static void EGPtoMMK(){
		EGPtoUSD();
		USDtoMMK();
	}
	public static void EGPtoTWD(){
		EGPtoUSD();
		USDtoTWD();
	}
	public static void EGPtoNZD(){
		EGPtoUSD();
		USDtoNZD();
	}
	public static void EGPtoNOK(){
		EGPtoUSD();
		USDtoNOK();
	}
	public static void EGPtoPHP(){
		EGPtoUSD();
		USDtoPHP();
	}
	public static void EGPtoQAR(){
		EGPtoUSD();
		USDtoQAR();
	}
	public static void EGPtoRON(){
		EGPtoUSD();
		USDtoRON();
	}
	public static void EGPtoRUB(){
		EGPtoUSD();
		USDtoRUB();
	}
	public static void EGPtoSAR(){
		EGPtoUSD();
		USDtoSAR();
	}
	public static void EGPtoRSD(){
		EGPtoUSD();
		USDtoRSD();
	}
	public static void EGPtoSGD(){
		EGPtoUSD();
		USDtoSGD();
	}
	public static void EGPtoZAR(){
		EGPtoUSD();
		USDtoZAR();
	}
	public static void EGPtoKRW(){
		EGPtoUSD();
		USDtoKRW();
	}
	public static void EGPtoLKR(){
		EGPtoUSD();
		USDtoLKR();
	}
	public static void EGPtoSEK(){
		EGPtoUSD();
		USDtoSEK();
	}
	public static void EGPtoCHF(){
		EGPtoUSD();
		USDtoCHF();
	}
	public static void EGPtoSYP(){
		EGPtoUSD();
		USDtoSYP();
	}
	public static void EGPtoTZS(){
		EGPtoUSD();
		USDtoTZS();
	}
	public static void EGPtoTHB(){
		EGPtoUSD();
		USDtoTHB();
	}
	public static void EGPtoTRY(){
		EGPtoUSD();
		USDtoTRY();
	}
	public static void EGPtoUGX(){
		EGPtoUSD();
		USDtoUGX();
	}
	public static void EGPtoUAH(){
		EGPtoUSD();
		USDtoUAH();
	}
	public static void EGPtoAED(){
		EGPtoUSD();
		USDtoAED();
	}
	public static void EGPtoVND(){
		EGPtoUSD();
		USDtoVND();
	}
	public static void EGPtoZMW(){
		EGPtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- ISK Conversions -------------------//
	public static void ISKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0085"));
	}
	public static void ISKtoEUR(){
		ISKtoUSD();
		USDtoEUR();
	}
	public static void ISKtoHKD(){
		ISKtoUSD();
		USDtoHKD();
	}
	public static void ISKtoBitcoin(){
		ISKtoUSD();
		USDtoBitcoin();
	}
	public static void ISKtoBitcoinCash(){
		ISKtoUSD();
		USDtoBitcoinCash();
	}
	public static void ISKtoJPY(){
		ISKtoUSD();
		USDtoJPY();
	}
	public static void ISKtoCNY(){
		ISKtoUSD();
		USDtoCNY();
	}
	public static void ISKtoINR(){
		ISKtoUSD();
		USDtoINR();
	}
	public static void ISKtoDZD(){
		ISKtoUSD();
		USDtoDZD();
	}
	public static void ISKtoARS(){
		ISKtoUSD();
		USDtoARS();
	}
	public static void ISKtoAUD(){
		ISKtoUSD();
		USDtoAUD();
	}
	public static void ISKtoBRL(){
		ISKtoUSD();
		USDtoBRL();
	}
	public static void ISKtoGBP(){
		ISKtoUSD();
		USDtoGBP();
	}
	public static void ISKtoBGN(){
		ISKtoUSD();
		USDtoBGN();
	}
	public static void ISKtoKHR(){
		ISKtoUSD();
		USDtoKHR();
	}
	public static void ISKtoCAD(){
		ISKtoUSD();
		USDtoCAD();
	}
	public static void ISKtoCLP(){
		ISKtoUSD();
		USDtoCLP();
	}
	public static void ISKtoCOP(){
		ISKtoUSD();
		USDtoCOP();
	}
	public static void ISKtoCRC(){
		ISKtoUSD();
		USDtoCRC();
	}
	public static void ISKtoHRK(){
		ISKtoUSD();
		USDtoHRK();
	}
	public static void ISKtoCZK(){
		ISKtoUSD();
		USDtoCZK();
	}
	public static void ISKtoDKK(){
		ISKtoUSD();
		USDtoDKK();
	}
	public static void ISKtoEGP(){
		ISKtoUSD();
		USDtoEGP();
	}
	public static void ISKtoISK(){
		ISKtoUSD();
		USDtoISK();
	}
	public static void ISKtoIDR(){
		ISKtoUSD();
		USDtoIDR();
	}
	public static void ISKtoIQD(){
		ISKtoUSD();
		USDtoIQD();
	}
	public static void ISKtoILS(){
		ISKtoUSD();
		USDtoILS();
	}
	public static void ISKtoJOD(){
		ISKtoUSD();
		USDtoJOD();
	}
	public static void ISKtoKES(){
		ISKtoUSD();
		USDtoKES();
	}
	public static void ISKtoKWD(){
		ISKtoUSD();
		USDtoKWD();
	}
	public static void ISKtoMYR(){
		ISKtoUSD();
		USDtoMYR();
	}
	public static void ISKtoMXN(){
		ISKtoUSD();
		USDtoMXN();
	}
	public static void ISKtoMAD(){
		ISKtoUSD();
		USDtoMAD();
	}
	public static void ISKtoMMK(){
		ISKtoUSD();
		USDtoMMK();
	}
	public static void ISKtoTWD(){
		ISKtoUSD();
		USDtoTWD();
	}
	public static void ISKtoNZD(){
		ISKtoUSD();
		USDtoNZD();
	}
	public static void ISKtoNOK(){
		ISKtoUSD();
		USDtoNOK();
	}
	public static void ISKtoPHP(){
		ISKtoUSD();
		USDtoPHP();
	}
	public static void ISKtoQAR(){
		ISKtoUSD();
		USDtoQAR();
	}
	public static void ISKtoRON(){
		ISKtoUSD();
		USDtoRON();
	}
	public static void ISKtoRUB(){
		ISKtoUSD();
		USDtoRUB();
	}
	public static void ISKtoSAR(){
		ISKtoUSD();
		USDtoSAR();
	}
	public static void ISKtoRSD(){
		ISKtoUSD();
		USDtoRSD();
	}
	public static void ISKtoSGD(){
		ISKtoUSD();
		USDtoSGD();
	}
	public static void ISKtoZAR(){
		ISKtoUSD();
		USDtoZAR();
	}
	public static void ISKtoKRW(){
		ISKtoUSD();
		USDtoKRW();
	}
	public static void ISKtoLKR(){
		ISKtoUSD();
		USDtoLKR();
	}
	public static void ISKtoSEK(){
		ISKtoUSD();
		USDtoSEK();
	}
	public static void ISKtoCHF(){
		ISKtoUSD();
		USDtoCHF();
	}
	public static void ISKtoSYP(){
		ISKtoUSD();
		USDtoSYP();
	}
	public static void ISKtoTZS(){
		ISKtoUSD();
		USDtoTZS();
	}
	public static void ISKtoTHB(){
		ISKtoUSD();
		USDtoTHB();
	}
	public static void ISKtoTRY(){
		ISKtoUSD();
		USDtoTRY();
	}
	public static void ISKtoUGX(){
		ISKtoUSD();
		USDtoUGX();
	}
	public static void ISKtoUAH(){
		ISKtoUSD();
		USDtoUAH();
	}
	public static void ISKtoAED(){
		ISKtoUSD();
		USDtoAED();
	}
	public static void ISKtoVND(){
		ISKtoUSD();
		USDtoVND();
	}
	public static void ISKtoZMW(){
		ISKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- IDR Conversions -------------------//
	public static void IDRtoUSD(){
		unit= unit.multiply(new BigDecimal("0.000066"));
	}
	public static void IDRtoEUR(){
		IDRtoUSD();
		USDtoEUR();
	}
	public static void IDRtoHKD(){
		IDRtoUSD();
		USDtoHKD();
	}
	public static void IDRtoBitcoin(){
		IDRtoUSD();
		USDtoBitcoin();
	}
	public static void IDRtoBitcoinCash(){
		IDRtoUSD();
		USDtoBitcoinCash();
	}
	public static void IDRtoJPY(){
		IDRtoUSD();
		USDtoJPY();
	}
	public static void IDRtoCNY(){
		IDRtoUSD();
		USDtoCNY();
	}
	public static void IDRtoINR(){
		IDRtoUSD();
		USDtoINR();
	}
	public static void IDRtoDZD(){
		IDRtoUSD();
		USDtoDZD();
	}
	public static void IDRtoARS(){
		IDRtoUSD();
		USDtoARS();
	}
	public static void IDRtoAUD(){
		IDRtoUSD();
		USDtoAUD();
	}
	public static void IDRtoBRL(){
		IDRtoUSD();
		USDtoBRL();
	}
	public static void IDRtoGBP(){
		IDRtoUSD();
		USDtoGBP();
	}
	public static void IDRtoBGN(){
		IDRtoUSD();
		USDtoBGN();
	}
	public static void IDRtoKHR(){
		IDRtoUSD();
		USDtoKHR();
	}
	public static void IDRtoCAD(){
		IDRtoUSD();
		USDtoCAD();
	}
	public static void IDRtoCLP(){
		IDRtoUSD();
		USDtoCLP();
	}
	public static void IDRtoCOP(){
		IDRtoUSD();
		USDtoCOP();
	}
	public static void IDRtoCRC(){
		IDRtoUSD();
		USDtoCRC();
	}
	public static void IDRtoHRK(){
		IDRtoUSD();
		USDtoHRK();
	}
	public static void IDRtoCZK(){
		IDRtoUSD();
		USDtoCZK();
	}
	public static void IDRtoDKK(){
		IDRtoUSD();
		USDtoDKK();
	}
	public static void IDRtoEGP(){
		IDRtoUSD();
		USDtoEGP();
	}
	public static void IDRtoISK(){
		IDRtoUSD();
		USDtoISK();
	}
	public static void IDRtoIDR(){
		IDRtoUSD();
		USDtoIDR();
	}
	public static void IDRtoIQD(){
		IDRtoUSD();
		USDtoIQD();
	}
	public static void IDRtoILS(){
		IDRtoUSD();
		USDtoILS();
	}
	public static void IDRtoJOD(){
		IDRtoUSD();
		USDtoJOD();
	}
	public static void IDRtoKES(){
		IDRtoUSD();
		USDtoKES();
	}
	public static void IDRtoKWD(){
		IDRtoUSD();
		USDtoKWD();
	}
	public static void IDRtoMYR(){
		IDRtoUSD();
		USDtoMYR();
	}
	public static void IDRtoMXN(){
		IDRtoUSD();
		USDtoMXN();
	}
	public static void IDRtoMAD(){
		IDRtoUSD();
		USDtoMAD();
	}
	public static void IDRtoMMK(){
		IDRtoUSD();
		USDtoMMK();
	}
	public static void IDRtoTWD(){
		IDRtoUSD();
		USDtoTWD();
	}
	public static void IDRtoNZD(){
		IDRtoUSD();
		USDtoNZD();
	}
	public static void IDRtoNOK(){
		IDRtoUSD();
		USDtoNOK();
	}
	public static void IDRtoPHP(){
		IDRtoUSD();
		USDtoPHP();
	}
	public static void IDRtoQAR(){
		IDRtoUSD();
		USDtoQAR();
	}
	public static void IDRtoRON(){
		IDRtoUSD();
		USDtoRON();
	}
	public static void IDRtoRUB(){
		IDRtoUSD();
		USDtoRUB();
	}
	public static void IDRtoSAR(){
		IDRtoUSD();
		USDtoSAR();
	}
	public static void IDRtoRSD(){
		IDRtoUSD();
		USDtoRSD();
	}
	public static void IDRtoSGD(){
		IDRtoUSD();
		USDtoSGD();
	}
	public static void IDRtoZAR(){
		IDRtoUSD();
		USDtoZAR();
	}
	public static void IDRtoKRW(){
		IDRtoUSD();
		USDtoKRW();
	}
	public static void IDRtoLKR(){
		IDRtoUSD();
		USDtoLKR();
	}
	public static void IDRtoSEK(){
		IDRtoUSD();
		USDtoSEK();
	}
	public static void IDRtoCHF(){
		IDRtoUSD();
		USDtoCHF();
	}
	public static void IDRtoSYP(){
		IDRtoUSD();
		USDtoSYP();
	}
	public static void IDRtoTZS(){
		IDRtoUSD();
		USDtoTZS();
	}
	public static void IDRtoTHB(){
		IDRtoUSD();
		USDtoTHB();
	}
	public static void IDRtoTRY(){
		IDRtoUSD();
		USDtoTRY();
	}
	public static void IDRtoUGX(){
		IDRtoUSD();
		USDtoUGX();
	}
	public static void IDRtoUAH(){
		IDRtoUSD();
		USDtoUAH();
	}
	public static void IDRtoAED(){
		IDRtoUSD();
		USDtoAED();
	}
	public static void IDRtoVND(){
		IDRtoUSD();
		USDtoVND();
	}
	public static void IDRtoZMW(){
		IDRtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- IQD Conversions -------------------//
	public static void IQDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00084"));
	}
	public static void IQDtoEUR(){
		IQDtoUSD();
		USDtoEUR();
	}
	public static void IQDtoHKD(){
		IQDtoUSD();
		USDtoHKD();
	}
	public static void IQDtoBitcoin(){
		IQDtoUSD();
		USDtoBitcoin();
	}
	public static void IQDtoBitcoinCash(){
		IQDtoUSD();
		USDtoBitcoinCash();
	}
	public static void IQDtoJPY(){
		IQDtoUSD();
		USDtoJPY();
	}
	public static void IQDtoCNY(){
		IQDtoUSD();
		USDtoCNY();
	}
	public static void IQDtoINR(){
		IQDtoUSD();
		USDtoINR();
	}
	public static void IQDtoDZD(){
		IQDtoUSD();
		USDtoDZD();
	}
	public static void IQDtoARS(){
		IQDtoUSD();
		USDtoARS();
	}
	public static void IQDtoAUD(){
		IQDtoUSD();
		USDtoAUD();
	}
	public static void IQDtoBRL(){
		IQDtoUSD();
		USDtoBRL();
	}
	public static void IQDtoGBP(){
		IQDtoUSD();
		USDtoGBP();
	}
	public static void IQDtoBGN(){
		IQDtoUSD();
		USDtoBGN();
	}
	public static void IQDtoKHR(){
		IQDtoUSD();
		USDtoKHR();
	}
	public static void IQDtoCAD(){
		IQDtoUSD();
		USDtoCAD();
	}
	public static void IQDtoCLP(){
		IQDtoUSD();
		USDtoCLP();
	}
	public static void IQDtoCOP(){
		IQDtoUSD();
		USDtoCOP();
	}
	public static void IQDtoCRC(){
		IQDtoUSD();
		USDtoCRC();
	}
	public static void IQDtoHRK(){
		IQDtoUSD();
		USDtoHRK();
	}
	public static void IQDtoCZK(){
		IQDtoUSD();
		USDtoCZK();
	}
	public static void IQDtoDKK(){
		IQDtoUSD();
		USDtoDKK();
	}
	public static void IQDtoEGP(){
		IQDtoUSD();
		USDtoEGP();
	}
	public static void IQDtoISK(){
		IQDtoUSD();
		USDtoISK();
	}
	public static void IQDtoIDR(){
		IQDtoUSD();
		USDtoIDR();
	}
	public static void IQDtoIQD(){
		IQDtoUSD();
		USDtoIQD();
	}
	public static void IQDtoILS(){
		IQDtoUSD();
		USDtoILS();
	}
	public static void IQDtoJOD(){
		IQDtoUSD();
		USDtoJOD();
	}
	public static void IQDtoKES(){
		IQDtoUSD();
		USDtoKES();
	}
	public static void IQDtoKWD(){
		IQDtoUSD();
		USDtoKWD();
	}
	public static void IQDtoMYR(){
		IQDtoUSD();
		USDtoMYR();
	}
	public static void IQDtoMXN(){
		IQDtoUSD();
		USDtoMXN();
	}
	public static void IQDtoMAD(){
		IQDtoUSD();
		USDtoMAD();
	}
	public static void IQDtoMMK(){
		IQDtoUSD();
		USDtoMMK();
	}
	public static void IQDtoTWD(){
		IQDtoUSD();
		USDtoTWD();
	}
	public static void IQDtoNZD(){
		IQDtoUSD();
		USDtoNZD();
	}
	public static void IQDtoNOK(){
		IQDtoUSD();
		USDtoNOK();
	}
	public static void IQDtoPHP(){
		IQDtoUSD();
		USDtoPHP();
	}
	public static void IQDtoQAR(){
		IQDtoUSD();
		USDtoQAR();
	}
	public static void IQDtoRON(){
		IQDtoUSD();
		USDtoRON();
	}
	public static void IQDtoRUB(){
		IQDtoUSD();
		USDtoRUB();
	}
	public static void IQDtoSAR(){
		IQDtoUSD();
		USDtoSAR();
	}
	public static void IQDtoRSD(){
		IQDtoUSD();
		USDtoRSD();
	}
	public static void IQDtoSGD(){
		IQDtoUSD();
		USDtoSGD();
	}
	public static void IQDtoZAR(){
		IQDtoUSD();
		USDtoZAR();
	}
	public static void IQDtoKRW(){
		IQDtoUSD();
		USDtoKRW();
	}
	public static void IQDtoLKR(){
		IQDtoUSD();
		USDtoLKR();
	}
	public static void IQDtoSEK(){
		IQDtoUSD();
		USDtoSEK();
	}
	public static void IQDtoCHF(){
		IQDtoUSD();
		USDtoCHF();
	}
	public static void IQDtoSYP(){
		IQDtoUSD();
		USDtoSYP();
	}
	public static void IQDtoTZS(){
		IQDtoUSD();
		USDtoTZS();
	}
	public static void IQDtoTHB(){
		IQDtoUSD();
		USDtoTHB();
	}
	public static void IQDtoTRY(){
		IQDtoUSD();
		USDtoTRY();
	}
	public static void IQDtoUGX(){
		IQDtoUSD();
		USDtoUGX();
	}
	public static void IQDtoUAH(){
		IQDtoUSD();
		USDtoUAH();
	}
	public static void IQDtoAED(){
		IQDtoUSD();
		USDtoAED();
	}
	public static void IQDtoVND(){
		IQDtoUSD();
		USDtoVND();
	}
	public static void IQDtoZMW(){
		IQDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- ILS Conversions -------------------//
	public static void ILStoUSD(){
		unit= unit.multiply(new BigDecimal("0.27"));
	}
	public static void ILStoEUR(){
		ILStoUSD();
		USDtoEUR();
	}
	public static void ILStoHKD(){
		ILStoUSD();
		USDtoHKD();
	}
	public static void ILStoBitcoin(){
		ILStoUSD();
		USDtoBitcoin();
	}
	public static void ILStoBitcoinCash(){
		ILStoUSD();
		USDtoBitcoinCash();
	}
	public static void ILStoJPY(){
		ILStoUSD();
		USDtoJPY();
	}
	public static void ILStoCNY(){
		ILStoUSD();
		USDtoCNY();
	}
	public static void ILStoINR(){
		ILStoUSD();
		USDtoINR();
	}
	public static void ILStoDZD(){
		ILStoUSD();
		USDtoDZD();
	}
	public static void ILStoARS(){
		ILStoUSD();
		USDtoARS();
	}
	public static void ILStoAUD(){
		ILStoUSD();
		USDtoAUD();
	}
	public static void ILStoBRL(){
		ILStoUSD();
		USDtoBRL();
	}
	public static void ILStoGBP(){
		ILStoUSD();
		USDtoGBP();
	}
	public static void ILStoBGN(){
		ILStoUSD();
		USDtoBGN();
	}
	public static void ILStoKHR(){
		ILStoUSD();
		USDtoKHR();
	}
	public static void ILStoCAD(){
		ILStoUSD();
		USDtoCAD();
	}
	public static void ILStoCLP(){
		ILStoUSD();
		USDtoCLP();
	}
	public static void ILStoCOP(){
		ILStoUSD();
		USDtoCOP();
	}
	public static void ILStoCRC(){
		ILStoUSD();
		USDtoCRC();
	}
	public static void ILStoHRK(){
		ILStoUSD();
		USDtoHRK();
	}
	public static void ILStoCZK(){
		ILStoUSD();
		USDtoCZK();
	}
	public static void ILStoDKK(){
		ILStoUSD();
		USDtoDKK();
	}
	public static void ILStoEGP(){
		ILStoUSD();
		USDtoEGP();
	}
	public static void ILStoISK(){
		ILStoUSD();
		USDtoISK();
	}
	public static void ILStoIDR(){
		ILStoUSD();
		USDtoIDR();
	}
	public static void ILStoIQD(){
		ILStoUSD();
		USDtoIQD();
	}
	public static void ILStoILS(){
		ILStoUSD();
		USDtoILS();
	}
	public static void ILStoJOD(){
		ILStoUSD();
		USDtoJOD();
	}
	public static void ILStoKES(){
		ILStoUSD();
		USDtoKES();
	}
	public static void ILStoKWD(){
		ILStoUSD();
		USDtoKWD();
	}
	public static void ILStoMYR(){
		ILStoUSD();
		USDtoMYR();
	}
	public static void ILStoMXN(){
		ILStoUSD();
		USDtoMXN();
	}
	public static void ILStoMAD(){
		ILStoUSD();
		USDtoMAD();
	}
	public static void ILStoMMK(){
		ILStoUSD();
		USDtoMMK();
	}
	public static void ILStoTWD(){
		ILStoUSD();
		USDtoTWD();
	}
	public static void ILStoNZD(){
		ILStoUSD();
		USDtoNZD();
	}
	public static void ILStoNOK(){
		ILStoUSD();
		USDtoNOK();
	}
	public static void ILStoPHP(){
		ILStoUSD();
		USDtoPHP();
	}
	public static void ILStoQAR(){
		ILStoUSD();
		USDtoQAR();
	}
	public static void ILStoRON(){
		ILStoUSD();
		USDtoRON();
	}
	public static void ILStoRUB(){
		ILStoUSD();
		USDtoRUB();
	}
	public static void ILStoSAR(){
		ILStoUSD();
		USDtoSAR();
	}
	public static void ILStoRSD(){
		ILStoUSD();
		USDtoRSD();
	}
	public static void ILStoSGD(){
		ILStoUSD();
		USDtoSGD();
	}
	public static void ILStoZAR(){
		ILStoUSD();
		USDtoZAR();
	}
	public static void ILStoKRW(){
		ILStoUSD();
		USDtoKRW();
	}
	public static void ILStoLKR(){
		ILStoUSD();
		USDtoLKR();
	}
	public static void ILStoSEK(){
		ILStoUSD();
		USDtoSEK();
	}
	public static void ILStoCHF(){
		ILStoUSD();
		USDtoCHF();
	}
	public static void ILStoSYP(){
		ILStoUSD();
		USDtoSYP();
	}
	public static void ILStoTZS(){
		ILStoUSD();
		USDtoTZS();
	}
	public static void ILStoTHB(){
		ILStoUSD();
		USDtoTHB();
	}
	public static void ILStoTRY(){
		ILStoUSD();
		USDtoTRY();
	}
	public static void ILStoUGX(){
		ILStoUSD();
		USDtoUGX();
	}
	public static void ILStoUAH(){
		ILStoUSD();
		USDtoUAH();
	}
	public static void ILStoAED(){
		ILStoUSD();
		USDtoAED();
	}
	public static void ILStoVND(){
		ILStoUSD();
		USDtoVND();
	}
	public static void ILStoZMW(){
		ILStoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- JOD Conversions -------------------//
	public static void JODtoUSD(){
		unit= unit.multiply(new BigDecimal("1.41"));
	}
	public static void JODtoEUR(){
		JODtoUSD();
		USDtoEUR();
	}
	public static void JODtoHKD(){
		JODtoUSD();
		USDtoHKD();
	}
	public static void JODtoBitcoin(){
		JODtoUSD();
		USDtoBitcoin();
	}
	public static void JODtoBitcoinCash(){
		JODtoUSD();
		USDtoBitcoinCash();
	}
	public static void JODtoJPY(){
		JODtoUSD();
		USDtoJPY();
	}
	public static void JODtoCNY(){
		JODtoUSD();
		USDtoCNY();
	}
	public static void JODtoINR(){
		JODtoUSD();
		USDtoINR();
	}
	public static void JODtoDZD(){
		JODtoUSD();
		USDtoDZD();
	}
	public static void JODtoARS(){
		JODtoUSD();
		USDtoARS();
	}
	public static void JODtoAUD(){
		JODtoUSD();
		USDtoAUD();
	}
	public static void JODtoBRL(){
		JODtoUSD();
		USDtoBRL();
	}
	public static void JODtoGBP(){
		JODtoUSD();
		USDtoGBP();
	}
	public static void JODtoBGN(){
		JODtoUSD();
		USDtoBGN();
	}
	public static void JODtoKHR(){
		JODtoUSD();
		USDtoKHR();
	}
	public static void JODtoCAD(){
		JODtoUSD();
		USDtoCAD();
	}
	public static void JODtoCLP(){
		JODtoUSD();
		USDtoCLP();
	}
	public static void JODtoCOP(){
		JODtoUSD();
		USDtoCOP();
	}
	public static void JODtoCRC(){
		JODtoUSD();
		USDtoCRC();
	}
	public static void JODtoHRK(){
		JODtoUSD();
		USDtoHRK();
	}
	public static void JODtoCZK(){
		JODtoUSD();
		USDtoCZK();
	}
	public static void JODtoDKK(){
		JODtoUSD();
		USDtoDKK();
	}
	public static void JODtoEGP(){
		JODtoUSD();
		USDtoEGP();
	}
	public static void JODtoISK(){
		JODtoUSD();
		USDtoISK();
	}
	public static void JODtoIDR(){
		JODtoUSD();
		USDtoIDR();
	}
	public static void JODtoIQD(){
		JODtoUSD();
		USDtoIQD();
	}
	public static void JODtoILS(){
		JODtoUSD();
		USDtoILS();
	}
	public static void JODtoJOD(){
		JODtoUSD();
		USDtoJOD();
	}
	public static void JODtoKES(){
		JODtoUSD();
		USDtoKES();
	}
	public static void JODtoKWD(){
		JODtoUSD();
		USDtoKWD();
	}
	public static void JODtoMYR(){
		JODtoUSD();
		USDtoMYR();
	}
	public static void JODtoMXN(){
		JODtoUSD();
		USDtoMXN();
	}
	public static void JODtoMAD(){
		JODtoUSD();
		USDtoMAD();
	}
	public static void JODtoMMK(){
		JODtoUSD();
		USDtoMMK();
	}
	public static void JODtoTWD(){
		JODtoUSD();
		USDtoTWD();
	}
	public static void JODtoNZD(){
		JODtoUSD();
		USDtoNZD();
	}
	public static void JODtoNOK(){
		JODtoUSD();
		USDtoNOK();
	}
	public static void JODtoPHP(){
		JODtoUSD();
		USDtoPHP();
	}
	public static void JODtoQAR(){
		JODtoUSD();
		USDtoQAR();
	}
	public static void JODtoRON(){
		JODtoUSD();
		USDtoRON();
	}
	public static void JODtoRUB(){
		JODtoUSD();
		USDtoRUB();
	}
	public static void JODtoSAR(){
		JODtoUSD();
		USDtoSAR();
	}
	public static void JODtoRSD(){
		JODtoUSD();
		USDtoRSD();
	}
	public static void JODtoSGD(){
		JODtoUSD();
		USDtoSGD();
	}
	public static void JODtoZAR(){
		JODtoUSD();
		USDtoZAR();
	}
	public static void JODtoKRW(){
		JODtoUSD();
		USDtoKRW();
	}
	public static void JODtoLKR(){
		JODtoUSD();
		USDtoLKR();
	}
	public static void JODtoSEK(){
		JODtoUSD();
		USDtoSEK();
	}
	public static void JODtoCHF(){
		JODtoUSD();
		USDtoCHF();
	}
	public static void JODtoSYP(){
		JODtoUSD();
		USDtoSYP();
	}
	public static void JODtoTZS(){
		JODtoUSD();
		USDtoTZS();
	}
	public static void JODtoTHB(){
		JODtoUSD();
		USDtoTHB();
	}
	public static void JODtoTRY(){
		JODtoUSD();
		USDtoTRY();
	}
	public static void JODtoUGX(){
		JODtoUSD();
		USDtoUGX();
	}
	public static void JODtoUAH(){
		JODtoUSD();
		USDtoUAH();
	}
	public static void JODtoAED(){
		JODtoUSD();
		USDtoAED();
	}
	public static void JODtoVND(){
		JODtoUSD();
		USDtoVND();
	}
	public static void JODtoZMW(){
		JODtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- KES Conversions -------------------//
	public static void KEStoUSD(){
		unit= unit.multiply(new BigDecimal("0.0099"));
	}
	public static void KEStoEUR(){
		KEStoUSD();
		USDtoEUR();
	}
	public static void KEStoHKD(){
		KEStoUSD();
		USDtoHKD();
	}
	public static void KEStoBitcoin(){
		KEStoUSD();
		USDtoBitcoin();
	}
	public static void KEStoBitcoinCash(){
		KEStoUSD();
		USDtoBitcoinCash();
	}
	public static void KEStoJPY(){
		KEStoUSD();
		USDtoJPY();
	}
	public static void KEStoCNY(){
		KEStoUSD();
		USDtoCNY();
	}
	public static void KEStoINR(){
		KEStoUSD();
		USDtoINR();
	}
	public static void KEStoDZD(){
		KEStoUSD();
		USDtoDZD();
	}
	public static void KEStoARS(){
		KEStoUSD();
		USDtoARS();
	}
	public static void KEStoAUD(){
		KEStoUSD();
		USDtoAUD();
	}
	public static void KEStoBRL(){
		KEStoUSD();
		USDtoBRL();
	}
	public static void KEStoGBP(){
		KEStoUSD();
		USDtoGBP();
	}
	public static void KEStoBGN(){
		KEStoUSD();
		USDtoBGN();
	}
	public static void KEStoKHR(){
		KEStoUSD();
		USDtoKHR();
	}
	public static void KEStoCAD(){
		KEStoUSD();
		USDtoCAD();
	}
	public static void KEStoCLP(){
		KEStoUSD();
		USDtoCLP();
	}
	public static void KEStoCOP(){
		KEStoUSD();
		USDtoCOP();
	}
	public static void KEStoCRC(){
		KEStoUSD();
		USDtoCRC();
	}
	public static void KEStoHRK(){
		KEStoUSD();
		USDtoHRK();
	}
	public static void KEStoCZK(){
		KEStoUSD();
		USDtoCZK();
	}
	public static void KEStoDKK(){
		KEStoUSD();
		USDtoDKK();
	}
	public static void KEStoEGP(){
		KEStoUSD();
		USDtoEGP();
	}
	public static void KEStoISK(){
		KEStoUSD();
		USDtoISK();
	}
	public static void KEStoIDR(){
		KEStoUSD();
		USDtoIDR();
	}
	public static void KEStoIQD(){
		KEStoUSD();
		USDtoIQD();
	}
	public static void KEStoILS(){
		KEStoUSD();
		USDtoILS();
	}
	public static void KEStoJOD(){
		KEStoUSD();
		USDtoJOD();
	}
	public static void KEStoKES(){
		KEStoUSD();
		USDtoKES();
	}
	public static void KEStoKWD(){
		KEStoUSD();
		USDtoKWD();
	}
	public static void KEStoMYR(){
		KEStoUSD();
		USDtoMYR();
	}
	public static void KEStoMXN(){
		KEStoUSD();
		USDtoMXN();
	}
	public static void KEStoMAD(){
		KEStoUSD();
		USDtoMAD();
	}
	public static void KEStoMMK(){
		KEStoUSD();
		USDtoMMK();
	}
	public static void KEStoTWD(){
		KEStoUSD();
		USDtoTWD();
	}
	public static void KEStoNZD(){
		KEStoUSD();
		USDtoNZD();
	}
	public static void KEStoNOK(){
		KEStoUSD();
		USDtoNOK();
	}
	public static void KEStoPHP(){
		KEStoUSD();
		USDtoPHP();
	}
	public static void KEStoQAR(){
		KEStoUSD();
		USDtoQAR();
	}
	public static void KEStoRON(){
		KEStoUSD();
		USDtoRON();
	}
	public static void KEStoRUB(){
		KEStoUSD();
		USDtoRUB();
	}
	public static void KEStoSAR(){
		KEStoUSD();
		USDtoSAR();
	}
	public static void KEStoRSD(){
		KEStoUSD();
		USDtoRSD();
	}
	public static void KEStoSGD(){
		KEStoUSD();
		USDtoSGD();
	}
	public static void KEStoZAR(){
		KEStoUSD();
		USDtoZAR();
	}
	public static void KEStoKRW(){
		KEStoUSD();
		USDtoKRW();
	}
	public static void KEStoLKR(){
		KEStoUSD();
		USDtoLKR();
	}
	public static void KEStoSEK(){
		KEStoUSD();
		USDtoSEK();
	}
	public static void KEStoCHF(){
		KEStoUSD();
		USDtoCHF();
	}
	public static void KEStoSYP(){
		KEStoUSD();
		USDtoSYP();
	}
	public static void KEStoTZS(){
		KEStoUSD();
		USDtoTZS();
	}
	public static void KEStoTHB(){
		KEStoUSD();
		USDtoTHB();
	}
	public static void KEStoTRY(){
		KEStoUSD();
		USDtoTRY();
	}
	public static void KEStoUGX(){
		KEStoUSD();
		USDtoUGX();
	}
	public static void KEStoUAH(){
		KEStoUSD();
		USDtoUAH();
	}
	public static void KEStoAED(){
		KEStoUSD();
		USDtoAED();
	}
	public static void KEStoVND(){
		KEStoUSD();
		USDtoVND();
	}
	public static void KEStoZMW(){
		KEStoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- KWD Conversions -------------------//
	public static void KWDtoUSD(){
		unit= unit.multiply(new BigDecimal("3.30"));
	}
	public static void KWDtoEUR(){
		KWDtoUSD();
		USDtoEUR();
	}
	public static void KWDtoHKD(){
		KWDtoUSD();
		USDtoHKD();
	}
	public static void KWDtoBitcoin(){
		KWDtoUSD();
		USDtoBitcoin();
	}
	public static void KWDtoBitcoinCash(){
		KWDtoUSD();
		USDtoBitcoinCash();
	}
	public static void KWDtoJPY(){
		KWDtoUSD();
		USDtoJPY();
	}
	public static void KWDtoCNY(){
		KWDtoUSD();
		USDtoCNY();
	}
	public static void KWDtoINR(){
		KWDtoUSD();
		USDtoINR();
	}
	public static void KWDtoDZD(){
		KWDtoUSD();
		USDtoDZD();
	}
	public static void KWDtoARS(){
		KWDtoUSD();
		USDtoARS();
	}
	public static void KWDtoAUD(){
		KWDtoUSD();
		USDtoAUD();
	}
	public static void KWDtoBRL(){
		KWDtoUSD();
		USDtoBRL();
	}
	public static void KWDtoGBP(){
		KWDtoUSD();
		USDtoGBP();
	}
	public static void KWDtoBGN(){
		KWDtoUSD();
		USDtoBGN();
	}
	public static void KWDtoKHR(){
		KWDtoUSD();
		USDtoKHR();
	}
	public static void KWDtoCAD(){
		KWDtoUSD();
		USDtoCAD();
	}
	public static void KWDtoCLP(){
		KWDtoUSD();
		USDtoCLP();
	}
	public static void KWDtoCOP(){
		KWDtoUSD();
		USDtoCOP();
	}
	public static void KWDtoCRC(){
		KWDtoUSD();
		USDtoCRC();
	}
	public static void KWDtoHRK(){
		KWDtoUSD();
		USDtoHRK();
	}
	public static void KWDtoCZK(){
		KWDtoUSD();
		USDtoCZK();
	}
	public static void KWDtoDKK(){
		KWDtoUSD();
		USDtoDKK();
	}
	public static void KWDtoEGP(){
		KWDtoUSD();
		USDtoEGP();
	}
	public static void KWDtoISK(){
		KWDtoUSD();
		USDtoISK();
	}
	public static void KWDtoIDR(){
		KWDtoUSD();
		USDtoIDR();
	}
	public static void KWDtoIQD(){
		KWDtoUSD();
		USDtoIQD();
	}
	public static void KWDtoILS(){
		KWDtoUSD();
		USDtoILS();
	}
	public static void KWDtoJOD(){
		KWDtoUSD();
		USDtoJOD();
	}
	public static void KWDtoKES(){
		KWDtoUSD();
		USDtoKES();
	}
	public static void KWDtoKWD(){
		KWDtoUSD();
		USDtoKWD();
	}
	public static void KWDtoMYR(){
		KWDtoUSD();
		USDtoMYR();
	}
	public static void KWDtoMXN(){
		KWDtoUSD();
		USDtoMXN();
	}
	public static void KWDtoMAD(){
		KWDtoUSD();
		USDtoMAD();
	}
	public static void KWDtoMMK(){
		KWDtoUSD();
		USDtoMMK();
	}
	public static void KWDtoTWD(){
		KWDtoUSD();
		USDtoTWD();
	}
	public static void KWDtoNZD(){
		KWDtoUSD();
		USDtoNZD();
	}
	public static void KWDtoNOK(){
		KWDtoUSD();
		USDtoNOK();
	}
	public static void KWDtoPHP(){
		KWDtoUSD();
		USDtoPHP();
	}
	public static void KWDtoQAR(){
		KWDtoUSD();
		USDtoQAR();
	}
	public static void KWDtoRON(){
		KWDtoUSD();
		USDtoRON();
	}
	public static void KWDtoRUB(){
		KWDtoUSD();
		USDtoRUB();
	}
	public static void KWDtoSAR(){
		KWDtoUSD();
		USDtoSAR();
	}
	public static void KWDtoRSD(){
		KWDtoUSD();
		USDtoRSD();
	}
	public static void KWDtoSGD(){
		KWDtoUSD();
		USDtoSGD();
	}
	public static void KWDtoZAR(){
		KWDtoUSD();
		USDtoZAR();
	}
	public static void KWDtoKRW(){
		KWDtoUSD();
		USDtoKRW();
	}
	public static void KWDtoLKR(){
		KWDtoUSD();
		USDtoLKR();
	}
	public static void KWDtoSEK(){
		KWDtoUSD();
		USDtoSEK();
	}
	public static void KWDtoCHF(){
		KWDtoUSD();
		USDtoCHF();
	}
	public static void KWDtoSYP(){
		KWDtoUSD();
		USDtoSYP();
	}
	public static void KWDtoTZS(){
		KWDtoUSD();
		USDtoTZS();
	}
	public static void KWDtoTHB(){
		KWDtoUSD();
		USDtoTHB();
	}
	public static void KWDtoTRY(){
		KWDtoUSD();
		USDtoTRY();
	}
	public static void KWDtoUGX(){
		KWDtoUSD();
		USDtoUGX();
	}
	public static void KWDtoUAH(){
		KWDtoUSD();
		USDtoUAH();
	}
	public static void KWDtoAED(){
		KWDtoUSD();
		USDtoAED();
	}
	public static void KWDtoVND(){
		KWDtoUSD();
		USDtoVND();
	}
	public static void KWDtoZMW(){
		KWDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- MYR Conversions -------------------//
	public static void MYRtoUSD(){
		unit= unit.multiply(new BigDecimal("0.24"));
	}
	public static void MYRtoEUR(){
		MYRtoUSD();
		USDtoEUR();
	}
	public static void MYRtoHKD(){
		MYRtoUSD();
		USDtoHKD();
	}
	public static void MYRtoBitcoin(){
		MYRtoUSD();
		USDtoBitcoin();
	}
	public static void MYRtoBitcoinCash(){
		MYRtoUSD();
		USDtoBitcoinCash();
	}
	public static void MYRtoJPY(){
		MYRtoUSD();
		USDtoJPY();
	}
	public static void MYRtoCNY(){
		MYRtoUSD();
		USDtoCNY();
	}
	public static void MYRtoINR(){
		MYRtoUSD();
		USDtoINR();
	}
	public static void MYRtoDZD(){
		MYRtoUSD();
		USDtoDZD();
	}
	public static void MYRtoARS(){
		MYRtoUSD();
		USDtoARS();
	}
	public static void MYRtoAUD(){
		MYRtoUSD();
		USDtoAUD();
	}
	public static void MYRtoBRL(){
		MYRtoUSD();
		USDtoBRL();
	}
	public static void MYRtoGBP(){
		MYRtoUSD();
		USDtoGBP();
	}
	public static void MYRtoBGN(){
		MYRtoUSD();
		USDtoBGN();
	}
	public static void MYRtoKHR(){
		MYRtoUSD();
		USDtoKHR();
	}
	public static void MYRtoCAD(){
		MYRtoUSD();
		USDtoCAD();
	}
	public static void MYRtoCLP(){
		MYRtoUSD();
		USDtoCLP();
	}
	public static void MYRtoCOP(){
		MYRtoUSD();
		USDtoCOP();
	}
	public static void MYRtoCRC(){
		MYRtoUSD();
		USDtoCRC();
	}
	public static void MYRtoHRK(){
		MYRtoUSD();
		USDtoHRK();
	}
	public static void MYRtoCZK(){
		MYRtoUSD();
		USDtoCZK();
	}
	public static void MYRtoDKK(){
		MYRtoUSD();
		USDtoDKK();
	}
	public static void MYRtoEGP(){
		MYRtoUSD();
		USDtoEGP();
	}
	public static void MYRtoISK(){
		MYRtoUSD();
		USDtoISK();
	}
	public static void MYRtoIDR(){
		MYRtoUSD();
		USDtoIDR();
	}
	public static void MYRtoIQD(){
		MYRtoUSD();
		USDtoIQD();
	}
	public static void MYRtoILS(){
		MYRtoUSD();
		USDtoILS();
	}
	public static void MYRtoJOD(){
		MYRtoUSD();
		USDtoJOD();
	}
	public static void MYRtoKES(){
		MYRtoUSD();
		USDtoKES();
	}
	public static void MYRtoKWD(){
		MYRtoUSD();
		USDtoKWD();
	}
	public static void MYRtoMYR(){
		MYRtoUSD();
		USDtoMYR();
	}
	public static void MYRtoMXN(){
		MYRtoUSD();
		USDtoMXN();
	}
	public static void MYRtoMAD(){
		MYRtoUSD();
		USDtoMAD();
	}
	public static void MYRtoMMK(){
		MYRtoUSD();
		USDtoMMK();
	}
	public static void MYRtoTWD(){
		MYRtoUSD();
		USDtoTWD();
	}
	public static void MYRtoNZD(){
		MYRtoUSD();
		USDtoNZD();
	}
	public static void MYRtoNOK(){
		MYRtoUSD();
		USDtoNOK();
	}
	public static void MYRtoPHP(){
		MYRtoUSD();
		USDtoPHP();
	}
	public static void MYRtoQAR(){
		MYRtoUSD();
		USDtoQAR();
	}
	public static void MYRtoRON(){
		MYRtoUSD();
		USDtoRON();
	}
	public static void MYRtoRUB(){
		MYRtoUSD();
		USDtoRUB();
	}
	public static void MYRtoSAR(){
		MYRtoUSD();
		USDtoSAR();
	}
	public static void MYRtoRSD(){
		MYRtoUSD();
		USDtoRSD();
	}
	public static void MYRtoSGD(){
		MYRtoUSD();
		USDtoSGD();
	}
	public static void MYRtoZAR(){
		MYRtoUSD();
		USDtoZAR();
	}
	public static void MYRtoKRW(){
		MYRtoUSD();
		USDtoKRW();
	}
	public static void MYRtoLKR(){
		MYRtoUSD();
		USDtoLKR();
	}
	public static void MYRtoSEK(){
		MYRtoUSD();
		USDtoSEK();
	}
	public static void MYRtoCHF(){
		MYRtoUSD();
		USDtoCHF();
	}
	public static void MYRtoSYP(){
		MYRtoUSD();
		USDtoSYP();
	}
	public static void MYRtoTZS(){
		MYRtoUSD();
		USDtoTZS();
	}
	public static void MYRtoTHB(){
		MYRtoUSD();
		USDtoTHB();
	}
	public static void MYRtoTRY(){
		MYRtoUSD();
		USDtoTRY();
	}
	public static void MYRtoUGX(){
		MYRtoUSD();
		USDtoUGX();
	}
	public static void MYRtoUAH(){
		MYRtoUSD();
		USDtoUAH();
	}
	public static void MYRtoAED(){
		MYRtoUSD();
		USDtoAED();
	}
	public static void MYRtoVND(){
		MYRtoUSD();
		USDtoVND();
	}
	public static void MYRtoZMW(){
		MYRtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- MXN Conversions -------------------//
	public static void MXNtoUSD(){
		unit= unit.multiply(new BigDecimal("0.052"));
	}
	public static void MXNtoEUR(){
		MXNtoUSD();
		USDtoEUR();
	}
	public static void MXNtoHKD(){
		MXNtoUSD();
		USDtoHKD();
	}
	public static void MXNtoBitcoin(){
		MXNtoUSD();
		USDtoBitcoin();
	}
	public static void MXNtoBitcoinCash(){
		MXNtoUSD();
		USDtoBitcoinCash();
	}
	public static void MXNtoJPY(){
		MXNtoUSD();
		USDtoJPY();
	}
	public static void MXNtoCNY(){
		MXNtoUSD();
		USDtoCNY();
	}
	public static void MXNtoINR(){
		MXNtoUSD();
		USDtoINR();
	}
	public static void MXNtoDZD(){
		MXNtoUSD();
		USDtoDZD();
	}
	public static void MXNtoARS(){
		MXNtoUSD();
		USDtoARS();
	}
	public static void MXNtoAUD(){
		MXNtoUSD();
		USDtoAUD();
	}
	public static void MXNtoBRL(){
		MXNtoUSD();
		USDtoBRL();
	}
	public static void MXNtoGBP(){
		MXNtoUSD();
		USDtoGBP();
	}
	public static void MXNtoBGN(){
		MXNtoUSD();
		USDtoBGN();
	}
	public static void MXNtoKHR(){
		MXNtoUSD();
		USDtoKHR();
	}
	public static void MXNtoCAD(){
		MXNtoUSD();
		USDtoCAD();
	}
	public static void MXNtoCLP(){
		MXNtoUSD();
		USDtoCLP();
	}
	public static void MXNtoCOP(){
		MXNtoUSD();
		USDtoCOP();
	}
	public static void MXNtoCRC(){
		MXNtoUSD();
		USDtoCRC();
	}
	public static void MXNtoHRK(){
		MXNtoUSD();
		USDtoHRK();
	}
	public static void MXNtoCZK(){
		MXNtoUSD();
		USDtoCZK();
	}
	public static void MXNtoDKK(){
		MXNtoUSD();
		USDtoDKK();
	}
	public static void MXNtoEGP(){
		MXNtoUSD();
		USDtoEGP();
	}
	public static void MXNtoISK(){
		MXNtoUSD();
		USDtoISK();
	}
	public static void MXNtoIDR(){
		MXNtoUSD();
		USDtoIDR();
	}
	public static void MXNtoIQD(){
		MXNtoUSD();
		USDtoIQD();
	}
	public static void MXNtoILS(){
		MXNtoUSD();
		USDtoILS();
	}
	public static void MXNtoJOD(){
		MXNtoUSD();
		USDtoJOD();
	}
	public static void MXNtoKES(){
		MXNtoUSD();
		USDtoKES();
	}
	public static void MXNtoKWD(){
		MXNtoUSD();
		USDtoKWD();
	}
	public static void MXNtoMYR(){
		MXNtoUSD();
		USDtoMYR();
	}
	public static void MXNtoMXN(){
		MXNtoUSD();
		USDtoMXN();
	}
	public static void MXNtoMAD(){
		MXNtoUSD();
		USDtoMAD();
	}
	public static void MXNtoMMK(){
		MXNtoUSD();
		USDtoMMK();
	}
	public static void MXNtoTWD(){
		MXNtoUSD();
		USDtoTWD();
	}
	public static void MXNtoNZD(){
		MXNtoUSD();
		USDtoNZD();
	}
	public static void MXNtoNOK(){
		MXNtoUSD();
		USDtoNOK();
	}
	public static void MXNtoPHP(){
		MXNtoUSD();
		USDtoPHP();
	}
	public static void MXNtoQAR(){
		MXNtoUSD();
		USDtoQAR();
	}
	public static void MXNtoRON(){
		MXNtoUSD();
		USDtoRON();
	}
	public static void MXNtoRUB(){
		MXNtoUSD();
		USDtoRUB();
	}
	public static void MXNtoSAR(){
		MXNtoUSD();
		USDtoSAR();
	}
	public static void MXNtoRSD(){
		MXNtoUSD();
		USDtoRSD();
	}
	public static void MXNtoSGD(){
		MXNtoUSD();
		USDtoSGD();
	}
	public static void MXNtoZAR(){
		MXNtoUSD();
		USDtoZAR();
	}
	public static void MXNtoKRW(){
		MXNtoUSD();
		USDtoKRW();
	}
	public static void MXNtoLKR(){
		MXNtoUSD();
		USDtoLKR();
	}
	public static void MXNtoSEK(){
		MXNtoUSD();
		USDtoSEK();
	}
	public static void MXNtoCHF(){
		MXNtoUSD();
		USDtoCHF();
	}
	public static void MXNtoSYP(){
		MXNtoUSD();
		USDtoSYP();
	}
	public static void MXNtoTZS(){
		MXNtoUSD();
		USDtoTZS();
	}
	public static void MXNtoTHB(){
		MXNtoUSD();
		USDtoTHB();
	}
	public static void MXNtoTRY(){
		MXNtoUSD();
		USDtoTRY();
	}
	public static void MXNtoUGX(){
		MXNtoUSD();
		USDtoUGX();
	}
	public static void MXNtoUAH(){
		MXNtoUSD();
		USDtoUAH();
	}
	public static void MXNtoAED(){
		MXNtoUSD();
		USDtoAED();
	}
	public static void MXNtoVND(){
		MXNtoUSD();
		USDtoVND();
	}
	public static void MXNtoZMW(){
		MXNtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- MAD Conversions -------------------//
	public static void MADtoUSD(){
		unit= unit.multiply(new BigDecimal("0.11"));
	}
	public static void MADtoEUR(){
		MADtoUSD();
		USDtoEUR();
	}
	public static void MADtoHKD(){
		MADtoUSD();
		USDtoHKD();
	}
	public static void MADtoBitcoin(){
		MADtoUSD();
		USDtoBitcoin();
	}
	public static void MADtoBitcoinCash(){
		MADtoUSD();
		USDtoBitcoinCash();
	}
	public static void MADtoJPY(){
		MADtoUSD();
		USDtoJPY();
	}
	public static void MADtoCNY(){
		MADtoUSD();
		USDtoCNY();
	}
	public static void MADtoINR(){
		MADtoUSD();
		USDtoINR();
	}
	public static void MADtoDZD(){
		MADtoUSD();
		USDtoDZD();
	}
	public static void MADtoARS(){
		MADtoUSD();
		USDtoARS();
	}
	public static void MADtoAUD(){
		MADtoUSD();
		USDtoAUD();
	}
	public static void MADtoBRL(){
		MADtoUSD();
		USDtoBRL();
	}
	public static void MADtoGBP(){
		MADtoUSD();
		USDtoGBP();
	}
	public static void MADtoBGN(){
		MADtoUSD();
		USDtoBGN();
	}
	public static void MADtoKHR(){
		MADtoUSD();
		USDtoKHR();
	}
	public static void MADtoCAD(){
		MADtoUSD();
		USDtoCAD();
	}
	public static void MADtoCLP(){
		MADtoUSD();
		USDtoCLP();
	}
	public static void MADtoCOP(){
		MADtoUSD();
		USDtoCOP();
	}
	public static void MADtoCRC(){
		MADtoUSD();
		USDtoCRC();
	}
	public static void MADtoHRK(){
		MADtoUSD();
		USDtoHRK();
	}
	public static void MADtoCZK(){
		MADtoUSD();
		USDtoCZK();
	}
	public static void MADtoDKK(){
		MADtoUSD();
		USDtoDKK();
	}
	public static void MADtoEGP(){
		MADtoUSD();
		USDtoEGP();
	}
	public static void MADtoISK(){
		MADtoUSD();
		USDtoISK();
	}
	public static void MADtoIDR(){
		MADtoUSD();
		USDtoIDR();
	}
	public static void MADtoIQD(){
		MADtoUSD();
		USDtoIQD();
	}
	public static void MADtoILS(){
		MADtoUSD();
		USDtoILS();
	}
	public static void MADtoJOD(){
		MADtoUSD();
		USDtoJOD();
	}
	public static void MADtoKES(){
		MADtoUSD();
		USDtoKES();
	}
	public static void MADtoKWD(){
		MADtoUSD();
		USDtoKWD();
	}
	public static void MADtoMYR(){
		MADtoUSD();
		USDtoMYR();
	}
	public static void MADtoMXN(){
		MADtoUSD();
		USDtoMXN();
	}
	public static void MADtoMAD(){
		MADtoUSD();
		USDtoMAD();
	}
	public static void MADtoMMK(){
		MADtoUSD();
		USDtoMMK();
	}
	public static void MADtoTWD(){
		MADtoUSD();
		USDtoTWD();
	}
	public static void MADtoNZD(){
		MADtoUSD();
		USDtoNZD();
	}
	public static void MADtoNOK(){
		MADtoUSD();
		USDtoNOK();
	}
	public static void MADtoPHP(){
		MADtoUSD();
		USDtoPHP();
	}
	public static void MADtoQAR(){
		MADtoUSD();
		USDtoQAR();
	}
	public static void MADtoRON(){
		MADtoUSD();
		USDtoRON();
	}
	public static void MADtoRUB(){
		MADtoUSD();
		USDtoRUB();
	}
	public static void MADtoSAR(){
		MADtoUSD();
		USDtoSAR();
	}
	public static void MADtoRSD(){
		MADtoUSD();
		USDtoRSD();
	}
	public static void MADtoSGD(){
		MADtoUSD();
		USDtoSGD();
	}
	public static void MADtoZAR(){
		MADtoUSD();
		USDtoZAR();
	}
	public static void MADtoKRW(){
		MADtoUSD();
		USDtoKRW();
	}
	public static void MADtoLKR(){
		MADtoUSD();
		USDtoLKR();
	}
	public static void MADtoSEK(){
		MADtoUSD();
		USDtoSEK();
	}
	public static void MADtoCHF(){
		MADtoUSD();
		USDtoCHF();
	}
	public static void MADtoSYP(){
		MADtoUSD();
		USDtoSYP();
	}
	public static void MADtoTZS(){
		MADtoUSD();
		USDtoTZS();
	}
	public static void MADtoTHB(){
		MADtoUSD();
		USDtoTHB();
	}
	public static void MADtoTRY(){
		MADtoUSD();
		USDtoTRY();
	}
	public static void MADtoUGX(){
		MADtoUSD();
		USDtoUGX();
	}
	public static void MADtoUAH(){
		MADtoUSD();
		USDtoUAH();
	}
	public static void MADtoAED(){
		MADtoUSD();
		USDtoAED();
	}
	public static void MADtoVND(){
		MADtoUSD();
		USDtoVND();
	}
	public static void MADtoZMW(){
		MADtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- MMK Conversions -------------------//
	public static void MMKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00063"));
	}
	public static void MMKtoEUR(){
		MMKtoUSD();
		USDtoEUR();
	}
	public static void MMKtoHKD(){
		MMKtoUSD();
		USDtoHKD();
	}
	public static void MMKtoBitcoin(){
		MMKtoUSD();
		USDtoBitcoin();
	}
	public static void MMKtoBitcoinCash(){
		MMKtoUSD();
		USDtoBitcoinCash();
	}
	public static void MMKtoJPY(){
		MMKtoUSD();
		USDtoJPY();
	}
	public static void MMKtoCNY(){
		MMKtoUSD();
		USDtoCNY();
	}
	public static void MMKtoINR(){
		MMKtoUSD();
		USDtoINR();
	}
	public static void MMKtoDZD(){
		MMKtoUSD();
		USDtoDZD();
	}
	public static void MMKtoARS(){
		MMKtoUSD();
		USDtoARS();
	}
	public static void MMKtoAUD(){
		MMKtoUSD();
		USDtoAUD();
	}
	public static void MMKtoBRL(){
		MMKtoUSD();
		USDtoBRL();
	}
	public static void MMKtoGBP(){
		MMKtoUSD();
		USDtoGBP();
	}
	public static void MMKtoBGN(){
		MMKtoUSD();
		USDtoBGN();
	}
	public static void MMKtoKHR(){
		MMKtoUSD();
		USDtoKHR();
	}
	public static void MMKtoCAD(){
		MMKtoUSD();
		USDtoCAD();
	}
	public static void MMKtoCLP(){
		MMKtoUSD();
		USDtoCLP();
	}
	public static void MMKtoCOP(){
		MMKtoUSD();
		USDtoCOP();
	}
	public static void MMKtoCRC(){
		MMKtoUSD();
		USDtoCRC();
	}
	public static void MMKtoHRK(){
		MMKtoUSD();
		USDtoHRK();
	}
	public static void MMKtoCZK(){
		MMKtoUSD();
		USDtoCZK();
	}
	public static void MMKtoDKK(){
		MMKtoUSD();
		USDtoDKK();
	}
	public static void MMKtoEGP(){
		MMKtoUSD();
		USDtoEGP();
	}
	public static void MMKtoISK(){
		MMKtoUSD();
		USDtoISK();
	}
	public static void MMKtoIDR(){
		MMKtoUSD();
		USDtoIDR();
	}
	public static void MMKtoIQD(){
		MMKtoUSD();
		USDtoIQD();
	}
	public static void MMKtoILS(){
		MMKtoUSD();
		USDtoILS();
	}
	public static void MMKtoJOD(){
		MMKtoUSD();
		USDtoJOD();
	}
	public static void MMKtoKES(){
		MMKtoUSD();
		USDtoKES();
	}
	public static void MMKtoKWD(){
		MMKtoUSD();
		USDtoKWD();
	}
	public static void MMKtoMYR(){
		MMKtoUSD();
		USDtoMYR();
	}
	public static void MMKtoMXN(){
		MMKtoUSD();
		USDtoMXN();
	}
	public static void MMKtoMAD(){
		MMKtoUSD();
		USDtoMAD();
	}
	public static void MMKtoMMK(){
		MMKtoUSD();
		USDtoMMK();
	}
	public static void MMKtoTWD(){
		MMKtoUSD();
		USDtoTWD();
	}
	public static void MMKtoNZD(){
		MMKtoUSD();
		USDtoNZD();
	}
	public static void MMKtoNOK(){
		MMKtoUSD();
		USDtoNOK();
	}
	public static void MMKtoPHP(){
		MMKtoUSD();
		USDtoPHP();
	}
	public static void MMKtoQAR(){
		MMKtoUSD();
		USDtoQAR();
	}
	public static void MMKtoRON(){
		MMKtoUSD();
		USDtoRON();
	}
	public static void MMKtoRUB(){
		MMKtoUSD();
		USDtoRUB();
	}
	public static void MMKtoSAR(){
		MMKtoUSD();
		USDtoSAR();
	}
	public static void MMKtoRSD(){
		MMKtoUSD();
		USDtoRSD();
	}
	public static void MMKtoSGD(){
		MMKtoUSD();
		USDtoSGD();
	}
	public static void MMKtoZAR(){
		MMKtoUSD();
		USDtoZAR();
	}
	public static void MMKtoKRW(){
		MMKtoUSD();
		USDtoKRW();
	}
	public static void MMKtoLKR(){
		MMKtoUSD();
		USDtoLKR();
	}
	public static void MMKtoSEK(){
		MMKtoUSD();
		USDtoSEK();
	}
	public static void MMKtoCHF(){
		MMKtoUSD();
		USDtoCHF();
	}
	public static void MMKtoSYP(){
		MMKtoUSD();
		USDtoSYP();
	}
	public static void MMKtoTZS(){
		MMKtoUSD();
		USDtoTZS();
	}
	public static void MMKtoTHB(){
		MMKtoUSD();
		USDtoTHB();
	}
	public static void MMKtoTRY(){
		MMKtoUSD();
		USDtoTRY();
	}
	public static void MMKtoUGX(){
		MMKtoUSD();
		USDtoUGX();
	}
	public static void MMKtoUAH(){
		MMKtoUSD();
		USDtoUAH();
	}
	public static void MMKtoAED(){
		MMKtoUSD();
		USDtoAED();
	}
	public static void MMKtoVND(){
		MMKtoUSD();
		USDtoVND();
	}
	public static void MMKtoZMW(){
		MMKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- TWD Conversions -------------------//
	public static void TWDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.032"));
	}
	public static void TWDtoEUR(){
		TWDtoUSD();
		USDtoEUR();
	}
	public static void TWDtoHKD(){
		TWDtoUSD();
		USDtoHKD();
	}
	public static void TWDtoBitcoin(){
		TWDtoUSD();
		USDtoBitcoin();
	}
	public static void TWDtoBitcoinCash(){
		TWDtoUSD();
		USDtoBitcoinCash();
	}
	public static void TWDtoJPY(){
		TWDtoUSD();
		USDtoJPY();
	}
	public static void TWDtoCNY(){
		TWDtoUSD();
		USDtoCNY();
	}
	public static void TWDtoINR(){
		TWDtoUSD();
		USDtoINR();
	}
	public static void TWDtoDZD(){
		TWDtoUSD();
		USDtoDZD();
	}
	public static void TWDtoARS(){
		TWDtoUSD();
		USDtoARS();
	}
	public static void TWDtoAUD(){
		TWDtoUSD();
		USDtoAUD();
	}
	public static void TWDtoBRL(){
		TWDtoUSD();
		USDtoBRL();
	}
	public static void TWDtoGBP(){
		TWDtoUSD();
		USDtoGBP();
	}
	public static void TWDtoBGN(){
		TWDtoUSD();
		USDtoBGN();
	}
	public static void TWDtoKHR(){
		TWDtoUSD();
		USDtoKHR();
	}
	public static void TWDtoCAD(){
		TWDtoUSD();
		USDtoCAD();
	}
	public static void TWDtoCLP(){
		TWDtoUSD();
		USDtoCLP();
	}
	public static void TWDtoCOP(){
		TWDtoUSD();
		USDtoCOP();
	}
	public static void TWDtoCRC(){
		TWDtoUSD();
		USDtoCRC();
	}
	public static void TWDtoHRK(){
		TWDtoUSD();
		USDtoHRK();
	}
	public static void TWDtoCZK(){
		TWDtoUSD();
		USDtoCZK();
	}
	public static void TWDtoDKK(){
		TWDtoUSD();
		USDtoDKK();
	}
	public static void TWDtoEGP(){
		TWDtoUSD();
		USDtoEGP();
	}
	public static void TWDtoISK(){
		TWDtoUSD();
		USDtoISK();
	}
	public static void TWDtoIDR(){
		TWDtoUSD();
		USDtoIDR();
	}
	public static void TWDtoIQD(){
		TWDtoUSD();
		USDtoIQD();
	}
	public static void TWDtoILS(){
		TWDtoUSD();
		USDtoILS();
	}
	public static void TWDtoJOD(){
		TWDtoUSD();
		USDtoJOD();
	}
	public static void TWDtoKES(){
		TWDtoUSD();
		USDtoKES();
	}
	public static void TWDtoKWD(){
		TWDtoUSD();
		USDtoKWD();
	}
	public static void TWDtoMYR(){
		TWDtoUSD();
		USDtoMYR();
	}
	public static void TWDtoMXN(){
		TWDtoUSD();
		USDtoMXN();
	}
	public static void TWDtoMAD(){
		TWDtoUSD();
		USDtoMAD();
	}
	public static void TWDtoMMK(){
		TWDtoUSD();
		USDtoMMK();
	}
	public static void TWDtoTWD(){
		TWDtoUSD();
		USDtoTWD();
	}
	public static void TWDtoNZD(){
		TWDtoUSD();
		USDtoNZD();
	}
	public static void TWDtoNOK(){
		TWDtoUSD();
		USDtoNOK();
	}
	public static void TWDtoPHP(){
		TWDtoUSD();
		USDtoPHP();
	}
	public static void TWDtoQAR(){
		TWDtoUSD();
		USDtoQAR();
	}
	public static void TWDtoRON(){
		TWDtoUSD();
		USDtoRON();
	}
	public static void TWDtoRUB(){
		TWDtoUSD();
		USDtoRUB();
	}
	public static void TWDtoSAR(){
		TWDtoUSD();
		USDtoSAR();
	}
	public static void TWDtoRSD(){
		TWDtoUSD();
		USDtoRSD();
	}
	public static void TWDtoSGD(){
		TWDtoUSD();
		USDtoSGD();
	}
	public static void TWDtoZAR(){
		TWDtoUSD();
		USDtoZAR();
	}
	public static void TWDtoKRW(){
		TWDtoUSD();
		USDtoKRW();
	}
	public static void TWDtoLKR(){
		TWDtoUSD();
		USDtoLKR();
	}
	public static void TWDtoSEK(){
		TWDtoUSD();
		USDtoSEK();
	}
	public static void TWDtoCHF(){
		TWDtoUSD();
		USDtoCHF();
	}
	public static void TWDtoSYP(){
		TWDtoUSD();
		USDtoSYP();
	}
	public static void TWDtoTZS(){
		TWDtoUSD();
		USDtoTZS();
	}
	public static void TWDtoTHB(){
		TWDtoUSD();
		USDtoTHB();
	}
	public static void TWDtoTRY(){
		TWDtoUSD();
		USDtoTRY();
	}
	public static void TWDtoUGX(){
		TWDtoUSD();
		USDtoUGX();
	}
	public static void TWDtoUAH(){
		TWDtoUSD();
		USDtoUAH();
	}
	public static void TWDtoAED(){
		TWDtoUSD();
		USDtoAED();
	}
	public static void TWDtoVND(){
		TWDtoUSD();
		USDtoVND();
	}
	public static void TWDtoZMW(){
		TWDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- NZD Conversions -------------------//
	public static void NZDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.66"));
	}
	public static void NZDtoEUR(){
		NZDtoUSD();
		USDtoEUR();
	}
	public static void NZDtoHKD(){
		NZDtoUSD();
		USDtoHKD();
	}
	public static void NZDtoBitcoin(){
		NZDtoUSD();
		USDtoBitcoin();
	}
	public static void NZDtoBitcoinCash(){
		NZDtoUSD();
		USDtoBitcoinCash();
	}
	public static void NZDtoJPY(){
		NZDtoUSD();
		USDtoJPY();
	}
	public static void NZDtoCNY(){
		NZDtoUSD();
		USDtoCNY();
	}
	public static void NZDtoINR(){
		NZDtoUSD();
		USDtoINR();
	}
	public static void NZDtoDZD(){
		NZDtoUSD();
		USDtoDZD();
	}
	public static void NZDtoARS(){
		NZDtoUSD();
		USDtoARS();
	}
	public static void NZDtoAUD(){
		NZDtoUSD();
		USDtoAUD();
	}
	public static void NZDtoBRL(){
		NZDtoUSD();
		USDtoBRL();
	}
	public static void NZDtoGBP(){
		NZDtoUSD();
		USDtoGBP();
	}
	public static void NZDtoBGN(){
		NZDtoUSD();
		USDtoBGN();
	}
	public static void NZDtoKHR(){
		NZDtoUSD();
		USDtoKHR();
	}
	public static void NZDtoCAD(){
		NZDtoUSD();
		USDtoCAD();
	}
	public static void NZDtoCLP(){
		NZDtoUSD();
		USDtoCLP();
	}
	public static void NZDtoCOP(){
		NZDtoUSD();
		USDtoCOP();
	}
	public static void NZDtoCRC(){
		NZDtoUSD();
		USDtoCRC();
	}
	public static void NZDtoHRK(){
		NZDtoUSD();
		USDtoHRK();
	}
	public static void NZDtoCZK(){
		NZDtoUSD();
		USDtoCZK();
	}
	public static void NZDtoDKK(){
		NZDtoUSD();
		USDtoDKK();
	}
	public static void NZDtoEGP(){
		NZDtoUSD();
		USDtoEGP();
	}
	public static void NZDtoISK(){
		NZDtoUSD();
		USDtoISK();
	}
	public static void NZDtoIDR(){
		NZDtoUSD();
		USDtoIDR();
	}
	public static void NZDtoIQD(){
		NZDtoUSD();
		USDtoIQD();
	}
	public static void NZDtoILS(){
		NZDtoUSD();
		USDtoILS();
	}
	public static void NZDtoJOD(){
		NZDtoUSD();
		USDtoJOD();
	}
	public static void NZDtoKES(){
		NZDtoUSD();
		USDtoKES();
	}
	public static void NZDtoKWD(){
		NZDtoUSD();
		USDtoKWD();
	}
	public static void NZDtoMYR(){
		NZDtoUSD();
		USDtoMYR();
	}
	public static void NZDtoMXN(){
		NZDtoUSD();
		USDtoMXN();
	}
	public static void NZDtoMAD(){
		NZDtoUSD();
		USDtoMAD();
	}
	public static void NZDtoMMK(){
		NZDtoUSD();
		USDtoMMK();
	}
	public static void NZDtoTWD(){
		NZDtoUSD();
		USDtoTWD();
	}
	public static void NZDtoNZD(){
		NZDtoUSD();
		USDtoNZD();
	}
	public static void NZDtoNOK(){
		NZDtoUSD();
		USDtoNOK();
	}
	public static void NZDtoPHP(){
		NZDtoUSD();
		USDtoPHP();
	}
	public static void NZDtoQAR(){
		NZDtoUSD();
		USDtoQAR();
	}
	public static void NZDtoRON(){
		NZDtoUSD();
		USDtoRON();
	}
	public static void NZDtoRUB(){
		NZDtoUSD();
		USDtoRUB();
	}
	public static void NZDtoSAR(){
		NZDtoUSD();
		USDtoSAR();
	}
	public static void NZDtoRSD(){
		NZDtoUSD();
		USDtoRSD();
	}
	public static void NZDtoSGD(){
		NZDtoUSD();
		USDtoSGD();
	}
	public static void NZDtoZAR(){
		NZDtoUSD();
		USDtoZAR();
	}
	public static void NZDtoKRW(){
		NZDtoUSD();
		USDtoKRW();
	}
	public static void NZDtoLKR(){
		NZDtoUSD();
		USDtoLKR();
	}
	public static void NZDtoSEK(){
		NZDtoUSD();
		USDtoSEK();
	}
	public static void NZDtoCHF(){
		NZDtoUSD();
		USDtoCHF();
	}
	public static void NZDtoSYP(){
		NZDtoUSD();
		USDtoSYP();
	}
	public static void NZDtoTZS(){
		NZDtoUSD();
		USDtoTZS();
	}
	public static void NZDtoTHB(){
		NZDtoUSD();
		USDtoTHB();
	}
	public static void NZDtoTRY(){
		NZDtoUSD();
		USDtoTRY();
	}
	public static void NZDtoUGX(){
		NZDtoUSD();
		USDtoUGX();
	}
	public static void NZDtoUAH(){
		NZDtoUSD();
		USDtoUAH();
	}
	public static void NZDtoAED(){
		NZDtoUSD();
		USDtoAED();
	}
	public static void NZDtoVND(){
		NZDtoUSD();
		USDtoVND();
	}
	public static void NZDtoZMW(){
		NZDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````


	//----------------- NOK Conversions -------------------//
	public static void NOKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.12"));
	}
	public static void NOKtoEUR(){
		NOKtoUSD();
		USDtoEUR();
	}
	public static void NOKtoHKD(){
		NOKtoUSD();
		USDtoHKD();
	}
	public static void NOKtoBitcoin(){
		NOKtoUSD();
		USDtoBitcoin();
	}
	public static void NOKtoBitcoinCash(){
		NOKtoUSD();
		USDtoBitcoinCash();
	}
	public static void NOKtoJPY(){
		NOKtoUSD();
		USDtoJPY();
	}
	public static void NOKtoCNY(){
		NOKtoUSD();
		USDtoCNY();
	}
	public static void NOKtoINR(){
		NOKtoUSD();
		USDtoINR();
	}
	public static void NOKtoDZD(){
		NOKtoUSD();
		USDtoDZD();
	}
	public static void NOKtoARS(){
		NOKtoUSD();
		USDtoARS();
	}
	public static void NOKtoAUD(){
		NOKtoUSD();
		USDtoAUD();
	}
	public static void NOKtoBRL(){
		NOKtoUSD();
		USDtoBRL();
	}
	public static void NOKtoGBP(){
		NOKtoUSD();
		USDtoGBP();
	}
	public static void NOKtoBGN(){
		NOKtoUSD();
		USDtoBGN();
	}
	public static void NOKtoKHR(){
		NOKtoUSD();
		USDtoKHR();
	}
	public static void NOKtoCAD(){
		NOKtoUSD();
		USDtoCAD();
	}
	public static void NOKtoCLP(){
		NOKtoUSD();
		USDtoCLP();
	}
	public static void NOKtoCOP(){
		NOKtoUSD();
		USDtoCOP();
	}
	public static void NOKtoCRC(){
		NOKtoUSD();
		USDtoCRC();
	}
	public static void NOKtoHRK(){
		NOKtoUSD();
		USDtoHRK();
	}
	public static void NOKtoCZK(){
		NOKtoUSD();
		USDtoCZK();
	}
	public static void NOKtoDKK(){
		NOKtoUSD();
		USDtoDKK();
	}
	public static void NOKtoEGP(){
		NOKtoUSD();
		USDtoEGP();
	}
	public static void NOKtoISK(){
		NOKtoUSD();
		USDtoISK();
	}
	public static void NOKtoIDR(){
		NOKtoUSD();
		USDtoIDR();
	}
	public static void NOKtoIQD(){
		NOKtoUSD();
		USDtoIQD();
	}
	public static void NOKtoILS(){
		NOKtoUSD();
		USDtoILS();
	}
	public static void NOKtoJOD(){
		NOKtoUSD();
		USDtoJOD();
	}
	public static void NOKtoKES(){
		NOKtoUSD();
		USDtoKES();
	}
	public static void NOKtoKWD(){
		NOKtoUSD();
		USDtoKWD();
	}
	public static void NOKtoMYR(){
		NOKtoUSD();
		USDtoMYR();
	}
	public static void NOKtoMXN(){
		NOKtoUSD();
		USDtoMXN();
	}
	public static void NOKtoMAD(){
		NOKtoUSD();
		USDtoMAD();
	}
	public static void NOKtoMMK(){
		NOKtoUSD();
		USDtoMMK();
	}
	public static void NOKtoTWD(){
		NOKtoUSD();
		USDtoTWD();
	}
	public static void NOKtoNZD(){
		NOKtoUSD();
		USDtoNZD();
	}
	public static void NOKtoNOK(){
		NOKtoUSD();
		USDtoNOK();
	}
	public static void NOKtoPHP(){
		NOKtoUSD();
		USDtoPHP();
	}
	public static void NOKtoQAR(){
		NOKtoUSD();
		USDtoQAR();
	}
	public static void NOKtoRON(){
		NOKtoUSD();
		USDtoRON();
	}
	public static void NOKtoRUB(){
		NOKtoUSD();
		USDtoRUB();
	}
	public static void NOKtoSAR(){
		NOKtoUSD();
		USDtoSAR();
	}
	public static void NOKtoRSD(){
		NOKtoUSD();
		USDtoRSD();
	}
	public static void NOKtoSGD(){
		NOKtoUSD();
		USDtoSGD();
	}
	public static void NOKtoZAR(){
		NOKtoUSD();
		USDtoZAR();
	}
	public static void NOKtoKRW(){
		NOKtoUSD();
		USDtoKRW();
	}
	public static void NOKtoLKR(){
		NOKtoUSD();
		USDtoLKR();
	}
	public static void NOKtoSEK(){
		NOKtoUSD();
		USDtoSEK();
	}
	public static void NOKtoCHF(){
		NOKtoUSD();
		USDtoCHF();
	}
	public static void NOKtoSYP(){
		NOKtoUSD();
		USDtoSYP();
	}
	public static void NOKtoTZS(){
		NOKtoUSD();
		USDtoTZS();
	}
	public static void NOKtoTHB(){
		NOKtoUSD();
		USDtoTHB();
	}
	public static void NOKtoTRY(){
		NOKtoUSD();
		USDtoTRY();
	}
	public static void NOKtoUGX(){
		NOKtoUSD();
		USDtoUGX();
	}
	public static void NOKtoUAH(){
		NOKtoUSD();
		USDtoUAH();
	}
	public static void NOKtoAED(){
		NOKtoUSD();
		USDtoAED();
	}
	public static void NOKtoVND(){
		NOKtoUSD();
		USDtoVND();
	}
	public static void NOKtoZMW(){
		NOKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	//----------------- PHP Conversions -------------------//
	public static void PHPtoUSD(){
		unit= unit.multiply(new BigDecimal("0.59"));
	}
	public static void PHPtoEUR(){
		PHPtoUSD();
		USDtoEUR();
	}
	public static void PHPtoHKD(){
		PHPtoUSD();
		USDtoHKD();
	}
	public static void PHPtoBitcoin(){
		PHPtoUSD();
		USDtoBitcoin();
	}
	public static void PHPtoBitcoinCash(){
		PHPtoUSD();
		USDtoBitcoinCash();
	}
	public static void PHPtoJPY(){
		PHPtoUSD();
		USDtoJPY();
	}
	public static void PHPtoCNY(){
		PHPtoUSD();
		USDtoCNY();
	}
	public static void PHPtoINR(){
		PHPtoUSD();
		USDtoINR();
	}
	public static void PHPtoDZD(){
		PHPtoUSD();
		USDtoDZD();
	}
	public static void PHPtoARS(){
		PHPtoUSD();
		USDtoARS();
	}
	public static void PHPtoAUD(){
		PHPtoUSD();
		USDtoAUD();
	}
	public static void PHPtoBRL(){
		PHPtoUSD();
		USDtoBRL();
	}
	public static void PHPtoGBP(){
		PHPtoUSD();
		USDtoGBP();
	}
	public static void PHPtoBGN(){
		PHPtoUSD();
		USDtoBGN();
	}
	public static void PHPtoKHR(){
		PHPtoUSD();
		USDtoKHR();
	}
	public static void PHPtoCAD(){
		PHPtoUSD();
		USDtoCAD();
	}
	public static void PHPtoCLP(){
		PHPtoUSD();
		USDtoCLP();
	}
	public static void PHPtoCOP(){
		PHPtoUSD();
		USDtoCOP();
	}
	public static void PHPtoCRC(){
		PHPtoUSD();
		USDtoCRC();
	}
	public static void PHPtoHRK(){
		PHPtoUSD();
		USDtoHRK();
	}
	public static void PHPtoCZK(){
		PHPtoUSD();
		USDtoCZK();
	}
	public static void PHPtoDKK(){
		PHPtoUSD();
		USDtoDKK();
	}
	public static void PHPtoEGP(){
		PHPtoUSD();
		USDtoEGP();
	}
	public static void PHPtoISK(){
		PHPtoUSD();
		USDtoISK();
	}
	public static void PHPtoIDR(){
		PHPtoUSD();
		USDtoIDR();
	}
	public static void PHPtoIQD(){
		PHPtoUSD();
		USDtoIQD();
	}
	public static void PHPtoILS(){
		PHPtoUSD();
		USDtoILS();
	}
	public static void PHPtoJOD(){
		PHPtoUSD();
		USDtoJOD();
	}
	public static void PHPtoKES(){
		PHPtoUSD();
		USDtoKES();
	}
	public static void PHPtoKWD(){
		PHPtoUSD();
		USDtoKWD();
	}
	public static void PHPtoMYR(){
		PHPtoUSD();
		USDtoMYR();
	}
	public static void PHPtoMXN(){
		PHPtoUSD();
		USDtoMXN();
	}
	public static void PHPtoMAD(){
		PHPtoUSD();
		USDtoMAD();
	}
	public static void PHPtoMMK(){
		PHPtoUSD();
		USDtoMMK();
	}
	public static void PHPtoTWD(){
		PHPtoUSD();
		USDtoTWD();
	}
	public static void PHPtoNZD(){
		PHPtoUSD();
		USDtoNZD();
	}
	public static void PHPtoNOK(){
		PHPtoUSD();
		USDtoNOK();
	}
	public static void PHPtoPHP(){
		PHPtoUSD();
		USDtoPHP();
	}
	public static void PHPtoQAR(){
		PHPtoUSD();
		USDtoQAR();
	}
	public static void PHPtoRON(){
		PHPtoUSD();
		USDtoRON();
	}
	public static void PHPtoRUB(){
		PHPtoUSD();
		USDtoRUB();
	}
	public static void PHPtoSAR(){
		PHPtoUSD();
		USDtoSAR();
	}
	public static void PHPtoRSD(){
		PHPtoUSD();
		USDtoRSD();
	}
	public static void PHPtoSGD(){
		PHPtoUSD();
		USDtoSGD();
	}
	public static void PHPtoZAR(){
		PHPtoUSD();
		USDtoZAR();
	}
	public static void PHPtoKRW(){
		PHPtoUSD();
		USDtoKRW();
	}
	public static void PHPtoLKR(){
		PHPtoUSD();
		USDtoLKR();
	}
	public static void PHPtoSEK(){
		PHPtoUSD();
		USDtoSEK();
	}
	public static void PHPtoCHF(){
		PHPtoUSD();
		USDtoCHF();
	}
	public static void PHPtoSYP(){
		PHPtoUSD();
		USDtoSYP();
	}
	public static void PHPtoTZS(){
		PHPtoUSD();
		USDtoTZS();
	}
	public static void PHPtoTHB(){
		PHPtoUSD();
		USDtoTHB();
	}
	public static void PHPtoTRY(){
		PHPtoUSD();
		USDtoTRY();
	}
	public static void PHPtoUGX(){
		PHPtoUSD();
		USDtoUGX();
	}
	public static void PHPtoUAH(){
		PHPtoUSD();
		USDtoUAH();
	}
	public static void PHPtoAED(){
		PHPtoUSD();
		USDtoAED();
	}
	public static void PHPtoVND(){
		PHPtoUSD();
		USDtoVND();
	}
	public static void PHPtoZMW(){
		PHPtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- QAR Conversions -------------------//
	public static void QARtoUSD(){
		unit= unit.multiply(new BigDecimal("0.27"));
	}
	public static void QARtoEUR(){
		QARtoUSD();
		USDtoEUR();
	}
	public static void QARtoHKD(){
		QARtoUSD();
		USDtoHKD();
	}
	public static void QARtoBitcoin(){
		QARtoUSD();
		USDtoBitcoin();
	}
	public static void QARtoBitcoinCash(){
		QARtoUSD();
		USDtoBitcoinCash();
	}
	public static void QARtoJPY(){
		QARtoUSD();
		USDtoJPY();
	}
	public static void QARtoCNY(){
		QARtoUSD();
		USDtoCNY();
	}
	public static void QARtoINR(){
		QARtoUSD();
		USDtoINR();
	}
	public static void QARtoDZD(){
		QARtoUSD();
		USDtoDZD();
	}
	public static void QARtoARS(){
		QARtoUSD();
		USDtoARS();
	}
	public static void QARtoAUD(){
		QARtoUSD();
		USDtoAUD();
	}
	public static void QARtoBRL(){
		QARtoUSD();
		USDtoBRL();
	}
	public static void QARtoGBP(){
		QARtoUSD();
		USDtoGBP();
	}
	public static void QARtoBGN(){
		QARtoUSD();
		USDtoBGN();
	}
	public static void QARtoKHR(){
		QARtoUSD();
		USDtoKHR();
	}
	public static void QARtoCAD(){
		QARtoUSD();
		USDtoCAD();
	}
	public static void QARtoCLP(){
		QARtoUSD();
		USDtoCLP();
	}
	public static void QARtoCOP(){
		QARtoUSD();
		USDtoCOP();
	}
	public static void QARtoCRC(){
		QARtoUSD();
		USDtoCRC();
	}
	public static void QARtoHRK(){
		QARtoUSD();
		USDtoHRK();
	}
	public static void QARtoCZK(){
		QARtoUSD();
		USDtoCZK();
	}
	public static void QARtoDKK(){
		QARtoUSD();
		USDtoDKK();
	}
	public static void QARtoEGP(){
		QARtoUSD();
		USDtoEGP();
	}
	public static void QARtoISK(){
		QARtoUSD();
		USDtoISK();
	}
	public static void QARtoIDR(){
		QARtoUSD();
		USDtoIDR();
	}
	public static void QARtoIQD(){
		QARtoUSD();
		USDtoIQD();
	}
	public static void QARtoILS(){
		QARtoUSD();
		USDtoILS();
	}
	public static void QARtoJOD(){
		QARtoUSD();
		USDtoJOD();
	}
	public static void QARtoKES(){
		QARtoUSD();
		USDtoKES();
	}
	public static void QARtoKWD(){
		QARtoUSD();
		USDtoKWD();
	}
	public static void QARtoMYR(){
		QARtoUSD();
		USDtoMYR();
	}
	public static void QARtoMXN(){
		QARtoUSD();
		USDtoMXN();
	}
	public static void QARtoMAD(){
		QARtoUSD();
		USDtoMAD();
	}
	public static void QARtoMMK(){
		QARtoUSD();
		USDtoMMK();
	}
	public static void QARtoTWD(){
		QARtoUSD();
		USDtoTWD();
	}
	public static void QARtoNZD(){
		QARtoUSD();
		USDtoNZD();
	}
	public static void QARtoNOK(){
		QARtoUSD();
		USDtoNOK();
	}
	public static void QARtoPHP(){
		QARtoUSD();
		USDtoPHP();
	}
	public static void QARtoQAR(){
		QARtoUSD();
		USDtoQAR();
	}
	public static void QARtoRON(){
		QARtoUSD();
		USDtoRON();
	}
	public static void QARtoRUB(){
		QARtoUSD();
		USDtoRUB();
	}
	public static void QARtoSAR(){
		QARtoUSD();
		USDtoSAR();
	}
	public static void QARtoRSD(){
		QARtoUSD();
		USDtoRSD();
	}
	public static void QARtoSGD(){
		QARtoUSD();
		USDtoSGD();
	}
	public static void QARtoZAR(){
		QARtoUSD();
		USDtoZAR();
	}
	public static void QARtoKRW(){
		QARtoUSD();
		USDtoKRW();
	}
	public static void QARtoLKR(){
		QARtoUSD();
		USDtoLKR();
	}
	public static void QARtoSEK(){
		QARtoUSD();
		USDtoSEK();
	}
	public static void QARtoCHF(){
		QARtoUSD();
		USDtoCHF();
	}
	public static void QARtoSYP(){
		QARtoUSD();
		USDtoSYP();
	}
	public static void QARtoTZS(){
		QARtoUSD();
		USDtoTZS();
	}
	public static void QARtoTHB(){
		QARtoUSD();
		USDtoTHB();
	}
	public static void QARtoTRY(){
		QARtoUSD();
		USDtoTRY();
	}
	public static void QARtoUGX(){
		QARtoUSD();
		USDtoUGX();
	}
	public static void QARtoUAH(){
		QARtoUSD();
		USDtoUAH();
	}
	public static void QARtoAED(){
		QARtoUSD();
		USDtoAED();
	}
	public static void QARtoVND(){
		QARtoUSD();
		USDtoVND();
	}
	public static void QARtoZMW(){
		QARtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- RON Conversions -------------------//
	public static void RONtoUSD(){
		unit= unit.multiply(new BigDecimal("0.25"));
	}
	public static void RONtoEUR(){
		RONtoUSD();
		USDtoEUR();
	}
	public static void RONtoHKD(){
		RONtoUSD();
		USDtoHKD();
	}
	public static void RONtoBitcoin(){
		RONtoUSD();
		USDtoBitcoin();
	}
	public static void RONtoBitcoinCash(){
		RONtoUSD();
		USDtoBitcoinCash();
	}
	public static void RONtoJPY(){
		RONtoUSD();
		USDtoJPY();
	}
	public static void RONtoCNY(){
		RONtoUSD();
		USDtoCNY();
	}
	public static void RONtoINR(){
		RONtoUSD();
		USDtoINR();
	}
	public static void RONtoDZD(){
		RONtoUSD();
		USDtoDZD();
	}
	public static void RONtoARS(){
		RONtoUSD();
		USDtoARS();
	}
	public static void RONtoAUD(){
		RONtoUSD();
		USDtoAUD();
	}
	public static void RONtoBRL(){
		RONtoUSD();
		USDtoBRL();
	}
	public static void RONtoGBP(){
		RONtoUSD();
		USDtoGBP();
	}
	public static void RONtoBGN(){
		RONtoUSD();
		USDtoBGN();
	}
	public static void RONtoKHR(){
		RONtoUSD();
		USDtoKHR();
	}
	public static void RONtoCAD(){
		RONtoUSD();
		USDtoCAD();
	}
	public static void RONtoCLP(){
		RONtoUSD();
		USDtoCLP();
	}
	public static void RONtoCOP(){
		RONtoUSD();
		USDtoCOP();
	}
	public static void RONtoCRC(){
		RONtoUSD();
		USDtoCRC();
	}
	public static void RONtoHRK(){
		RONtoUSD();
		USDtoHRK();
	}
	public static void RONtoCZK(){
		RONtoUSD();
		USDtoCZK();
	}
	public static void RONtoDKK(){
		RONtoUSD();
		USDtoDKK();
	}
	public static void RONtoEGP(){
		RONtoUSD();
		USDtoEGP();
	}
	public static void RONtoISK(){
		RONtoUSD();
		USDtoISK();
	}
	public static void RONtoIDR(){
		RONtoUSD();
		USDtoIDR();
	}
	public static void RONtoIQD(){
		RONtoUSD();
		USDtoIQD();
	}
	public static void RONtoILS(){
		RONtoUSD();
		USDtoILS();
	}
	public static void RONtoJOD(){
		RONtoUSD();
		USDtoJOD();
	}
	public static void RONtoKES(){
		RONtoUSD();
		USDtoKES();
	}
	public static void RONtoKWD(){
		RONtoUSD();
		USDtoKWD();
	}
	public static void RONtoMYR(){
		RONtoUSD();
		USDtoMYR();
	}
	public static void RONtoMXN(){
		RONtoUSD();
		USDtoMXN();
	}
	public static void RONtoMAD(){
		RONtoUSD();
		USDtoMAD();
	}
	public static void RONtoMMK(){
		RONtoUSD();
		USDtoMMK();
	}
	public static void RONtoTWD(){
		RONtoUSD();
		USDtoTWD();
	}
	public static void RONtoNZD(){
		RONtoUSD();
		USDtoNZD();
	}
	public static void RONtoNOK(){
		RONtoUSD();
		USDtoNOK();
	}
	public static void RONtoPHP(){
		RONtoUSD();
		USDtoPHP();
	}
	public static void RONtoQAR(){
		RONtoUSD();
		USDtoQAR();
	}
	public static void RONtoRON(){
		RONtoUSD();
		USDtoRON();
	}
	public static void RONtoRUB(){
		RONtoUSD();
		USDtoRUB();
	}
	public static void RONtoSAR(){
		RONtoUSD();
		USDtoSAR();
	}
	public static void RONtoRSD(){
		RONtoUSD();
		USDtoRSD();
	}
	public static void RONtoSGD(){
		RONtoUSD();
		USDtoSGD();
	}
	public static void RONtoZAR(){
		RONtoUSD();
		USDtoZAR();
	}
	public static void RONtoKRW(){
		RONtoUSD();
		USDtoKRW();
	}
	public static void RONtoLKR(){
		RONtoUSD();
		USDtoLKR();
	}
	public static void RONtoSEK(){
		RONtoUSD();
		USDtoSEK();
	}
	public static void RONtoCHF(){
		RONtoUSD();
		USDtoCHF();
	}
	public static void RONtoSYP(){
		RONtoUSD();
		USDtoSYP();
	}
	public static void RONtoTZS(){
		RONtoUSD();
		USDtoTZS();
	}
	public static void RONtoTHB(){
		RONtoUSD();
		USDtoTHB();
	}
	public static void RONtoTRY(){
		RONtoUSD();
		USDtoTRY();
	}
	public static void RONtoUGX(){
		RONtoUSD();
		USDtoUGX();
	}
	public static void RONtoUAH(){
		RONtoUSD();
		USDtoUAH();
	}
	public static void RONtoAED(){
		RONtoUSD();
		USDtoAED();
	}
	public static void RONtoVND(){
		RONtoUSD();
		USDtoVND();
	}
	public static void RONtoZMW(){
		RONtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- RUB Conversions -------------------//
	public static void RUBtoUSD(){
		unit= unit.multiply(new BigDecimal("0.015"));
	}
	public static void RUBtoEUR(){
		RUBtoUSD();
		USDtoEUR();
	}
	public static void RUBtoHKD(){
		RUBtoUSD();
		USDtoHKD();
	}
	public static void RUBtoBitcoin(){
		RUBtoUSD();
		USDtoBitcoin();
	}
	public static void RUBtoBitcoinCash(){
		RUBtoUSD();
		USDtoBitcoinCash();
	}
	public static void RUBtoJPY(){
		RUBtoUSD();
		USDtoJPY();
	}
	public static void RUBtoCNY(){
		RUBtoUSD();
		USDtoCNY();
	}
	public static void RUBtoINR(){
		RUBtoUSD();
		USDtoINR();
	}
	public static void RUBtoDZD(){
		RUBtoUSD();
		USDtoDZD();
	}
	public static void RUBtoARS(){
		RUBtoUSD();
		USDtoARS();
	}
	public static void RUBtoAUD(){
		RUBtoUSD();
		USDtoAUD();
	}
	public static void RUBtoBRL(){
		RUBtoUSD();
		USDtoBRL();
	}
	public static void RUBtoGBP(){
		RUBtoUSD();
		USDtoGBP();
	}
	public static void RUBtoBGN(){
		RUBtoUSD();
		USDtoBGN();
	}
	public static void RUBtoKHR(){
		RUBtoUSD();
		USDtoKHR();
	}
	public static void RUBtoCAD(){
		RUBtoUSD();
		USDtoCAD();
	}
	public static void RUBtoCLP(){
		RUBtoUSD();
		USDtoCLP();
	}
	public static void RUBtoCOP(){
		RUBtoUSD();
		USDtoCOP();
	}
	public static void RUBtoCRC(){
		RUBtoUSD();
		USDtoCRC();
	}
	public static void RUBtoHRK(){
		RUBtoUSD();
		USDtoHRK();
	}
	public static void RUBtoCZK(){
		RUBtoUSD();
		USDtoCZK();
	}
	public static void RUBtoDKK(){
		RUBtoUSD();
		USDtoDKK();
	}
	public static void RUBtoEGP(){
		RUBtoUSD();
		USDtoEGP();
	}
	public static void RUBtoISK(){
		RUBtoUSD();
		USDtoISK();
	}
	public static void RUBtoIDR(){
		RUBtoUSD();
		USDtoIDR();
	}
	public static void RUBtoIQD(){
		RUBtoUSD();
		USDtoIQD();
	}
	public static void RUBtoILS(){
		RUBtoUSD();
		USDtoILS();
	}
	public static void RUBtoJOD(){
		RUBtoUSD();
		USDtoJOD();
	}
	public static void RUBtoKES(){
		RUBtoUSD();
		USDtoKES();
	}
	public static void RUBtoKWD(){
		RUBtoUSD();
		USDtoKWD();
	}
	public static void RUBtoMYR(){
		RUBtoUSD();
		USDtoMYR();
	}
	public static void RUBtoMXN(){
		RUBtoUSD();
		USDtoMXN();
	}
	public static void RUBtoMAD(){
		RUBtoUSD();
		USDtoMAD();
	}
	public static void RUBtoMMK(){
		RUBtoUSD();
		USDtoMMK();
	}
	public static void RUBtoTWD(){
		RUBtoUSD();
		USDtoTWD();
	}
	public static void RUBtoNZD(){
		RUBtoUSD();
		USDtoNZD();
	}
	public static void RUBtoNOK(){
		RUBtoUSD();
		USDtoNOK();
	}
	public static void RUBtoPHP(){
		RUBtoUSD();
		USDtoPHP();
	}
	public static void RUBtoQAR(){
		RUBtoUSD();
		USDtoQAR();
	}
	public static void RUBtoRON(){
		RUBtoUSD();
		USDtoRON();
	}
	public static void RUBtoRUB(){
		RUBtoUSD();
		USDtoRUB();
	}
	public static void RUBtoSAR(){
		RUBtoUSD();
		USDtoSAR();
	}
	public static void RUBtoRSD(){
		RUBtoUSD();
		USDtoRSD();
	}
	public static void RUBtoSGD(){
		RUBtoUSD();
		USDtoSGD();
	}
	public static void RUBtoZAR(){
		RUBtoUSD();
		USDtoZAR();
	}
	public static void RUBtoKRW(){
		RUBtoUSD();
		USDtoKRW();
	}
	public static void RUBtoLKR(){
		RUBtoUSD();
		USDtoLKR();
	}
	public static void RUBtoSEK(){
		RUBtoUSD();
		USDtoSEK();
	}
	public static void RUBtoCHF(){
		RUBtoUSD();
		USDtoCHF();
	}
	public static void RUBtoSYP(){
		RUBtoUSD();
		USDtoSYP();
	}
	public static void RUBtoTZS(){
		RUBtoUSD();
		USDtoTZS();
	}
	public static void RUBtoTHB(){
		RUBtoUSD();
		USDtoTHB();
	}
	public static void RUBtoTRY(){
		RUBtoUSD();
		USDtoTRY();
	}
	public static void RUBtoUGX(){
		RUBtoUSD();
		USDtoUGX();
	}
	public static void RUBtoUAH(){
		RUBtoUSD();
		USDtoUAH();
	}
	public static void RUBtoAED(){
		RUBtoUSD();
		USDtoAED();
	}
	public static void RUBtoVND(){
		RUBtoUSD();
		USDtoVND();
	}
	public static void RUBtoZMW(){
		RUBtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- SAR Conversions -------------------//
	public static void SARtoUSD(){
		unit= unit.multiply(new BigDecimal("0.27"));
	}
	public static void SARtoEUR(){
		SARtoUSD();
		USDtoEUR();
	}
	public static void SARtoHKD(){
		SARtoUSD();
		USDtoHKD();
	}
	public static void SARtoBitcoin(){
		SARtoUSD();
		USDtoBitcoin();
	}
	public static void SARtoBitcoinCash(){
		SARtoUSD();
		USDtoBitcoinCash();
	}
	public static void SARtoJPY(){
		SARtoUSD();
		USDtoJPY();
	}
	public static void SARtoCNY(){
		SARtoUSD();
		USDtoCNY();
	}
	public static void SARtoINR(){
		SARtoUSD();
		USDtoINR();
	}
	public static void SARtoDZD(){
		SARtoUSD();
		USDtoDZD();
	}
	public static void SARtoARS(){
		SARtoUSD();
		USDtoARS();
	}
	public static void SARtoAUD(){
		SARtoUSD();
		USDtoAUD();
	}
	public static void SARtoBRL(){
		SARtoUSD();
		USDtoBRL();
	}
	public static void SARtoGBP(){
		SARtoUSD();
		USDtoGBP();
	}
	public static void SARtoBGN(){
		SARtoUSD();
		USDtoBGN();
	}
	public static void SARtoKHR(){
		SARtoUSD();
		USDtoKHR();
	}
	public static void SARtoCAD(){
		SARtoUSD();
		USDtoCAD();
	}
	public static void SARtoCLP(){
		SARtoUSD();
		USDtoCLP();
	}
	public static void SARtoCOP(){
		SARtoUSD();
		USDtoCOP();
	}
	public static void SARtoCRC(){
		SARtoUSD();
		USDtoCRC();
	}
	public static void SARtoHRK(){
		SARtoUSD();
		USDtoHRK();
	}
	public static void SARtoCZK(){
		SARtoUSD();
		USDtoCZK();
	}
	public static void SARtoDKK(){
		SARtoUSD();
		USDtoDKK();
	}
	public static void SARtoEGP(){
		SARtoUSD();
		USDtoEGP();
	}
	public static void SARtoISK(){
		SARtoUSD();
		USDtoISK();
	}
	public static void SARtoIDR(){
		SARtoUSD();
		USDtoIDR();
	}
	public static void SARtoIQD(){
		SARtoUSD();
		USDtoIQD();
	}
	public static void SARtoILS(){
		SARtoUSD();
		USDtoILS();
	}
	public static void SARtoJOD(){
		SARtoUSD();
		USDtoJOD();
	}
	public static void SARtoKES(){
		SARtoUSD();
		USDtoKES();
	}
	public static void SARtoKWD(){
		SARtoUSD();
		USDtoKWD();
	}
	public static void SARtoMYR(){
		SARtoUSD();
		USDtoMYR();
	}
	public static void SARtoMXN(){
		SARtoUSD();
		USDtoMXN();
	}
	public static void SARtoMAD(){
		SARtoUSD();
		USDtoMAD();
	}
	public static void SARtoMMK(){
		SARtoUSD();
		USDtoMMK();
	}
	public static void SARtoTWD(){
		SARtoUSD();
		USDtoTWD();
	}
	public static void SARtoNZD(){
		SARtoUSD();
		USDtoNZD();
	}
	public static void SARtoNOK(){
		SARtoUSD();
		USDtoNOK();
	}
	public static void SARtoPHP(){
		SARtoUSD();
		USDtoPHP();
	}
	public static void SARtoQAR(){
		SARtoUSD();
		USDtoQAR();
	}
	public static void SARtoRON(){
		SARtoUSD();
		USDtoRON();
	}
	public static void SARtoRUB(){
		SARtoUSD();
		USDtoRUB();
	}
	public static void SARtoSAR(){
		SARtoUSD();
		USDtoSAR();
	}
	public static void SARtoRSD(){
		SARtoUSD();
		USDtoRSD();
	}
	public static void SARtoSGD(){
		SARtoUSD();
		USDtoSGD();
	}
	public static void SARtoZAR(){
		SARtoUSD();
		USDtoZAR();
	}
	public static void SARtoKRW(){
		SARtoUSD();
		USDtoKRW();
	}
	public static void SARtoLKR(){
		SARtoUSD();
		USDtoLKR();
	}
	public static void SARtoSEK(){
		SARtoUSD();
		USDtoSEK();
	}
	public static void SARtoCHF(){
		SARtoUSD();
		USDtoCHF();
	}
	public static void SARtoSYP(){
		SARtoUSD();
		USDtoSYP();
	}
	public static void SARtoTZS(){
		SARtoUSD();
		USDtoTZS();
	}
	public static void SARtoTHB(){
		SARtoUSD();
		USDtoTHB();
	}
	public static void SARtoTRY(){
		SARtoUSD();
		USDtoTRY();
	}
	public static void SARtoUGX(){
		SARtoUSD();
		USDtoUGX();
	}
	public static void SARtoUAH(){
		SARtoUSD();
		USDtoUAH();
	}
	public static void SARtoAED(){
		SARtoUSD();
		USDtoAED();
	}
	public static void SARtoVND(){
		SARtoUSD();
		USDtoVND();
	}
	public static void SARtoZMW(){
		SARtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- RSD Conversions -------------------//
	public static void RSDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0097"));
	}
	public static void RSDtoEUR(){
		RSDtoUSD();
		USDtoEUR();
	}
	public static void RSDtoHKD(){
		RSDtoUSD();
		USDtoHKD();
	}
	public static void RSDtoBitcoin(){
		RSDtoUSD();
		USDtoBitcoin();
	}
	public static void RSDtoBitcoinCash(){
		RSDtoUSD();
		USDtoBitcoinCash();
	}
	public static void RSDtoJPY(){
		RSDtoUSD();
		USDtoJPY();
	}
	public static void RSDtoCNY(){
		RSDtoUSD();
		USDtoCNY();
	}
	public static void RSDtoINR(){
		RSDtoUSD();
		USDtoINR();
	}
	public static void RSDtoDZD(){
		RSDtoUSD();
		USDtoDZD();
	}
	public static void RSDtoARS(){
		RSDtoUSD();
		USDtoARS();
	}
	public static void RSDtoAUD(){
		RSDtoUSD();
		USDtoAUD();
	}
	public static void RSDtoBRL(){
		RSDtoUSD();
		USDtoBRL();
	}
	public static void RSDtoGBP(){
		RSDtoUSD();
		USDtoGBP();
	}
	public static void RSDtoBGN(){
		RSDtoUSD();
		USDtoBGN();
	}
	public static void RSDtoKHR(){
		RSDtoUSD();
		USDtoKHR();
	}
	public static void RSDtoCAD(){
		RSDtoUSD();
		USDtoCAD();
	}
	public static void RSDtoCLP(){
		RSDtoUSD();
		USDtoCLP();
	}
	public static void RSDtoCOP(){
		RSDtoUSD();
		USDtoCOP();
	}
	public static void RSDtoCRC(){
		RSDtoUSD();
		USDtoCRC();
	}
	public static void RSDtoHRK(){
		RSDtoUSD();
		USDtoHRK();
	}
	public static void RSDtoCZK(){
		RSDtoUSD();
		USDtoCZK();
	}
	public static void RSDtoDKK(){
		RSDtoUSD();
		USDtoDKK();
	}
	public static void RSDtoEGP(){
		RSDtoUSD();
		USDtoEGP();
	}
	public static void RSDtoISK(){
		RSDtoUSD();
		USDtoISK();
	}
	public static void RSDtoIDR(){
		RSDtoUSD();
		USDtoIDR();
	}
	public static void RSDtoIQD(){
		RSDtoUSD();
		USDtoIQD();
	}
	public static void RSDtoILS(){
		RSDtoUSD();
		USDtoILS();
	}
	public static void RSDtoJOD(){
		RSDtoUSD();
		USDtoJOD();
	}
	public static void RSDtoKES(){
		RSDtoUSD();
		USDtoKES();
	}
	public static void RSDtoKWD(){
		RSDtoUSD();
		USDtoKWD();
	}
	public static void RSDtoMYR(){
		RSDtoUSD();
		USDtoMYR();
	}
	public static void RSDtoMXN(){
		RSDtoUSD();
		USDtoMXN();
	}
	public static void RSDtoMAD(){
		RSDtoUSD();
		USDtoMAD();
	}
	public static void RSDtoMMK(){
		RSDtoUSD();
		USDtoMMK();
	}
	public static void RSDtoTWD(){
		RSDtoUSD();
		USDtoTWD();
	}
	public static void RSDtoNZD(){
		RSDtoUSD();
		USDtoNZD();
	}
	public static void RSDtoNOK(){
		RSDtoUSD();
		USDtoNOK();
	}
	public static void RSDtoPHP(){
		RSDtoUSD();
		USDtoPHP();
	}
	public static void RSDtoQAR(){
		RSDtoUSD();
		USDtoQAR();
	}
	public static void RSDtoRON(){
		RSDtoUSD();
		USDtoRON();
	}
	public static void RSDtoRUB(){
		RSDtoUSD();
		USDtoRUB();
	}
	public static void RSDtoSAR(){
		RSDtoUSD();
		USDtoSAR();
	}
	public static void RSDtoRSD(){
		RSDtoUSD();
		USDtoRSD();
	}
	public static void RSDtoSGD(){
		RSDtoUSD();
		USDtoSGD();
	}
	public static void RSDtoZAR(){
		RSDtoUSD();
		USDtoZAR();
	}
	public static void RSDtoKRW(){
		RSDtoUSD();
		USDtoKRW();
	}
	public static void RSDtoLKR(){
		RSDtoUSD();
		USDtoLKR();
	}
	public static void RSDtoSEK(){
		RSDtoUSD();
		USDtoSEK();
	}
	public static void RSDtoCHF(){
		RSDtoUSD();
		USDtoCHF();
	}
	public static void RSDtoSYP(){
		RSDtoUSD();
		USDtoSYP();
	}
	public static void RSDtoTZS(){
		RSDtoUSD();
		USDtoTZS();
	}
	public static void RSDtoTHB(){
		RSDtoUSD();
		USDtoTHB();
	}
	public static void RSDtoTRY(){
		RSDtoUSD();
		USDtoTRY();
	}
	public static void RSDtoUGX(){
		RSDtoUSD();
		USDtoUGX();
	}
	public static void RSDtoUAH(){
		RSDtoUSD();
		USDtoUAH();
	}
	public static void RSDtoAED(){
		RSDtoUSD();
		USDtoAED();
	}
	public static void RSDtoVND(){
		RSDtoUSD();
		USDtoVND();
	}
	public static void RSDtoZMW(){
		RSDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- SGD Conversions -------------------//
	public static void SGDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.73"));
	}
	public static void SGDtoEUR(){
		SGDtoUSD();
		USDtoEUR();
	}
	public static void SGDtoHKD(){
		SGDtoUSD();
		USDtoHKD();
	}
	public static void SGDtoBitcoin(){
		SGDtoUSD();
		USDtoBitcoin();
	}
	public static void SGDtoBitcoinCash(){
		SGDtoUSD();
		USDtoBitcoinCash();
	}
	public static void SGDtoJPY(){
		SGDtoUSD();
		USDtoJPY();
	}
	public static void SGDtoCNY(){
		SGDtoUSD();
		USDtoCNY();
	}
	public static void SGDtoINR(){
		SGDtoUSD();
		USDtoINR();
	}
	public static void SGDtoDZD(){
		SGDtoUSD();
		USDtoDZD();
	}
	public static void SGDtoARS(){
		SGDtoUSD();
		USDtoARS();
	}
	public static void SGDtoAUD(){
		SGDtoUSD();
		USDtoAUD();
	}
	public static void SGDtoBRL(){
		SGDtoUSD();
		USDtoBRL();
	}
	public static void SGDtoGBP(){
		SGDtoUSD();
		USDtoGBP();
	}
	public static void SGDtoBGN(){
		SGDtoUSD();
		USDtoBGN();
	}
	public static void SGDtoKHR(){
		SGDtoUSD();
		USDtoKHR();
	}
	public static void SGDtoCAD(){
		SGDtoUSD();
		USDtoCAD();
	}
	public static void SGDtoCLP(){
		SGDtoUSD();
		USDtoCLP();
	}
	public static void SGDtoCOP(){
		SGDtoUSD();
		USDtoCOP();
	}
	public static void SGDtoCRC(){
		SGDtoUSD();
		USDtoCRC();
	}
	public static void SGDtoHRK(){
		SGDtoUSD();
		USDtoHRK();
	}
	public static void SGDtoCZK(){
		SGDtoUSD();
		USDtoCZK();
	}
	public static void SGDtoDKK(){
		SGDtoUSD();
		USDtoDKK();
	}
	public static void SGDtoEGP(){
		SGDtoUSD();
		USDtoEGP();
	}
	public static void SGDtoISK(){
		SGDtoUSD();
		USDtoISK();
	}
	public static void SGDtoIDR(){
		SGDtoUSD();
		USDtoIDR();
	}
	public static void SGDtoIQD(){
		SGDtoUSD();
		USDtoIQD();
	}
	public static void SGDtoILS(){
		SGDtoUSD();
		USDtoILS();
	}
	public static void SGDtoJOD(){
		SGDtoUSD();
		USDtoJOD();
	}
	public static void SGDtoKES(){
		SGDtoUSD();
		USDtoKES();
	}
	public static void SGDtoKWD(){
		SGDtoUSD();
		USDtoKWD();
	}
	public static void SGDtoMYR(){
		SGDtoUSD();
		USDtoMYR();
	}
	public static void SGDtoMXN(){
		SGDtoUSD();
		USDtoMXN();
	}
	public static void SGDtoMAD(){
		SGDtoUSD();
		USDtoMAD();
	}
	public static void SGDtoMMK(){
		SGDtoUSD();
		USDtoMMK();
	}
	public static void SGDtoTWD(){
		SGDtoUSD();
		USDtoTWD();
	}
	public static void SGDtoNZD(){
		SGDtoUSD();
		USDtoNZD();
	}
	public static void SGDtoNOK(){
		SGDtoUSD();
		USDtoNOK();
	}
	public static void SGDtoPHP(){
		SGDtoUSD();
		USDtoPHP();
	}
	public static void SGDtoQAR(){
		SGDtoUSD();
		USDtoQAR();
	}
	public static void SGDtoRON(){
		SGDtoUSD();
		USDtoRON();
	}
	public static void SGDtoRUB(){
		SGDtoUSD();
		USDtoRUB();
	}
	public static void SGDtoSAR(){
		SGDtoUSD();
		USDtoSAR();
	}
	public static void SGDtoRSD(){
		SGDtoUSD();
		USDtoRSD();
	}
	public static void SGDtoSGD(){
		SGDtoUSD();
		USDtoSGD();
	}
	public static void SGDtoZAR(){
		SGDtoUSD();
		USDtoZAR();
	}
	public static void SGDtoKRW(){
		SGDtoUSD();
		USDtoKRW();
	}
	public static void SGDtoLKR(){
		SGDtoUSD();
		USDtoLKR();
	}
	public static void SGDtoSEK(){
		SGDtoUSD();
		USDtoSEK();
	}
	public static void SGDtoCHF(){
		SGDtoUSD();
		USDtoCHF();
	}
	public static void SGDtoSYP(){
		SGDtoUSD();
		USDtoSYP();
	}
	public static void SGDtoTZS(){
		SGDtoUSD();
		USDtoTZS();
	}
	public static void SGDtoTHB(){
		SGDtoUSD();
		USDtoTHB();
	}
	public static void SGDtoTRY(){
		SGDtoUSD();
		USDtoTRY();
	}
	public static void SGDtoUGX(){
		SGDtoUSD();
		USDtoUGX();
	}
	public static void SGDtoUAH(){
		SGDtoUSD();
		USDtoUAH();
	}
	public static void SGDtoAED(){
		SGDtoUSD();
		USDtoAED();
	}
	public static void SGDtoVND(){
		SGDtoUSD();
		USDtoVND();
	}
	public static void SGDtoZMW(){
		SGDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- ZAR Conversions -------------------//
	public static void ZARtoUSD(){
		unit= unit.multiply(new BigDecimal("0.069"));
	}
	public static void ZARtoEUR(){
		ZARtoUSD();
		USDtoEUR();
	}
	public static void ZARtoHKD(){
		ZARtoUSD();
		USDtoHKD();
	}
	public static void ZARtoBitcoin(){
		ZARtoUSD();
		USDtoBitcoin();
	}
	public static void ZARtoBitcoinCash(){
		ZARtoUSD();
		USDtoBitcoinCash();
	}
	public static void ZARtoJPY(){
		ZARtoUSD();
		USDtoJPY();
	}
	public static void ZARtoCNY(){
		ZARtoUSD();
		USDtoCNY();
	}
	public static void ZARtoINR(){
		ZARtoUSD();
		USDtoINR();
	}
	public static void ZARtoDZD(){
		ZARtoUSD();
		USDtoDZD();
	}
	public static void ZARtoARS(){
		ZARtoUSD();
		USDtoARS();
	}
	public static void ZARtoAUD(){
		ZARtoUSD();
		USDtoAUD();
	}
	public static void ZARtoBRL(){
		ZARtoUSD();
		USDtoBRL();
	}
	public static void ZARtoGBP(){
		ZARtoUSD();
		USDtoGBP();
	}
	public static void ZARtoBGN(){
		ZARtoUSD();
		USDtoBGN();
	}
	public static void ZARtoKHR(){
		ZARtoUSD();
		USDtoKHR();
	}
	public static void ZARtoCAD(){
		ZARtoUSD();
		USDtoCAD();
	}
	public static void ZARtoCLP(){
		ZARtoUSD();
		USDtoCLP();
	}
	public static void ZARtoCOP(){
		ZARtoUSD();
		USDtoCOP();
	}
	public static void ZARtoCRC(){
		ZARtoUSD();
		USDtoCRC();
	}
	public static void ZARtoHRK(){
		ZARtoUSD();
		USDtoHRK();
	}
	public static void ZARtoCZK(){
		ZARtoUSD();
		USDtoCZK();
	}
	public static void ZARtoDKK(){
		ZARtoUSD();
		USDtoDKK();
	}
	public static void ZARtoEGP(){
		ZARtoUSD();
		USDtoEGP();
	}
	public static void ZARtoISK(){
		ZARtoUSD();
		USDtoISK();
	}
	public static void ZARtoIDR(){
		ZARtoUSD();
		USDtoIDR();
	}
	public static void ZARtoIQD(){
		ZARtoUSD();
		USDtoIQD();
	}
	public static void ZARtoILS(){
		ZARtoUSD();
		USDtoILS();
	}
	public static void ZARtoJOD(){
		ZARtoUSD();
		USDtoJOD();
	}
	public static void ZARtoKES(){
		ZARtoUSD();
		USDtoKES();
	}
	public static void ZARtoKWD(){
		ZARtoUSD();
		USDtoKWD();
	}
	public static void ZARtoMYR(){
		ZARtoUSD();
		USDtoMYR();
	}
	public static void ZARtoMXN(){
		ZARtoUSD();
		USDtoMXN();
	}
	public static void ZARtoMAD(){
		ZARtoUSD();
		USDtoMAD();
	}
	public static void ZARtoMMK(){
		ZARtoUSD();
		USDtoMMK();
	}
	public static void ZARtoTWD(){
		ZARtoUSD();
		USDtoTWD();
	}
	public static void ZARtoNZD(){
		ZARtoUSD();
		USDtoNZD();
	}
	public static void ZARtoNOK(){
		ZARtoUSD();
		USDtoNOK();
	}
	public static void ZARtoPHP(){
		ZARtoUSD();
		USDtoPHP();
	}
	public static void ZARtoQAR(){
		ZARtoUSD();
		USDtoQAR();
	}
	public static void ZARtoRON(){
		ZARtoUSD();
		USDtoRON();
	}
	public static void ZARtoRUB(){
		ZARtoUSD();
		USDtoRUB();
	}
	public static void ZARtoSAR(){
		ZARtoUSD();
		USDtoSAR();
	}
	public static void ZARtoRSD(){
		ZARtoUSD();
		USDtoRSD();
	}
	public static void ZARtoSGD(){
		ZARtoUSD();
		USDtoSGD();
	}
	public static void ZARtoZAR(){
		ZARtoUSD();
		USDtoZAR();
	}
	public static void ZARtoKRW(){
		ZARtoUSD();
		USDtoKRW();
	}
	public static void ZARtoLKR(){
		ZARtoUSD();
		USDtoLKR();
	}
	public static void ZARtoSEK(){
		ZARtoUSD();
		USDtoSEK();
	}
	public static void ZARtoCHF(){
		ZARtoUSD();
		USDtoCHF();
	}
	public static void ZARtoSYP(){
		ZARtoUSD();
		USDtoSYP();
	}
	public static void ZARtoTZS(){
		ZARtoUSD();
		USDtoTZS();
	}
	public static void ZARtoTHB(){
		ZARtoUSD();
		USDtoTHB();
	}
	public static void ZARtoTRY(){
		ZARtoUSD();
		USDtoTRY();
	}
	public static void ZARtoUGX(){
		ZARtoUSD();
		USDtoUGX();
	}
	public static void ZARtoUAH(){
		ZARtoUSD();
		USDtoUAH();
	}
	public static void ZARtoAED(){
		ZARtoUSD();
		USDtoAED();
	}
	public static void ZARtoVND(){
		ZARtoUSD();
		USDtoVND();
	}
	public static void ZARtoZMW(){
		ZARtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- KRW Conversions -------------------//
	public static void KRWtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00088"));
	}
	public static void KRWtoEUR(){
		KRWtoUSD();
		USDtoEUR();
	}
	public static void KRWtoHKD(){
		KRWtoUSD();
		USDtoHKD();
	}
	public static void KRWtoBitcoin(){
		KRWtoUSD();
		USDtoBitcoin();
	}
	public static void KRWtoBitcoinCash(){
		KRWtoUSD();
		USDtoBitcoinCash();
	}
	public static void KRWtoJPY(){
		KRWtoUSD();
		USDtoJPY();
	}
	public static void KRWtoCNY(){
		KRWtoUSD();
		USDtoCNY();
	}
	public static void KRWtoINR(){
		KRWtoUSD();
		USDtoINR();
	}
	public static void KRWtoDZD(){
		KRWtoUSD();
		USDtoDZD();
	}
	public static void KRWtoARS(){
		KRWtoUSD();
		USDtoARS();
	}
	public static void KRWtoAUD(){
		KRWtoUSD();
		USDtoAUD();
	}
	public static void KRWtoBRL(){
		KRWtoUSD();
		USDtoBRL();
	}
	public static void KRWtoGBP(){
		KRWtoUSD();
		USDtoGBP();
	}
	public static void KRWtoBGN(){
		KRWtoUSD();
		USDtoBGN();
	}
	public static void KRWtoKHR(){
		KRWtoUSD();
		USDtoKHR();
	}
	public static void KRWtoCAD(){
		KRWtoUSD();
		USDtoCAD();
	}
	public static void KRWtoCLP(){
		KRWtoUSD();
		USDtoCLP();
	}
	public static void KRWtoCOP(){
		KRWtoUSD();
		USDtoCOP();
	}
	public static void KRWtoCRC(){
		KRWtoUSD();
		USDtoCRC();
	}
	public static void KRWtoHRK(){
		KRWtoUSD();
		USDtoHRK();
	}
	public static void KRWtoCZK(){
		KRWtoUSD();
		USDtoCZK();
	}
	public static void KRWtoDKK(){
		KRWtoUSD();
		USDtoDKK();
	}
	public static void KRWtoEGP(){
		KRWtoUSD();
		USDtoEGP();
	}
	public static void KRWtoISK(){
		KRWtoUSD();
		USDtoISK();
	}
	public static void KRWtoIDR(){
		KRWtoUSD();
		USDtoIDR();
	}
	public static void KRWtoIQD(){
		KRWtoUSD();
		USDtoIQD();
	}
	public static void KRWtoILS(){
		KRWtoUSD();
		USDtoILS();
	}
	public static void KRWtoJOD(){
		KRWtoUSD();
		USDtoJOD();
	}
	public static void KRWtoKES(){
		KRWtoUSD();
		USDtoKES();
	}
	public static void KRWtoKWD(){
		KRWtoUSD();
		USDtoKWD();
	}
	public static void KRWtoMYR(){
		KRWtoUSD();
		USDtoMYR();
	}
	public static void KRWtoMXN(){
		KRWtoUSD();
		USDtoMXN();
	}
	public static void KRWtoMAD(){
		KRWtoUSD();
		USDtoMAD();
	}
	public static void KRWtoMMK(){
		KRWtoUSD();
		USDtoMMK();
	}
	public static void KRWtoTWD(){
		KRWtoUSD();
		USDtoTWD();
	}
	public static void KRWtoNZD(){
		KRWtoUSD();
		USDtoNZD();
	}
	public static void KRWtoNOK(){
		KRWtoUSD();
		USDtoNOK();
	}
	public static void KRWtoPHP(){
		KRWtoUSD();
		USDtoPHP();
	}
	public static void KRWtoQAR(){
		KRWtoUSD();
		USDtoQAR();
	}
	public static void KRWtoRON(){
		KRWtoUSD();
		USDtoRON();
	}
	public static void KRWtoRUB(){
		KRWtoUSD();
		USDtoRUB();
	}
	public static void KRWtoSAR(){
		KRWtoUSD();
		USDtoSAR();
	}
	public static void KRWtoRSD(){
		KRWtoUSD();
		USDtoRSD();
	}
	public static void KRWtoSGD(){
		KRWtoUSD();
		USDtoSGD();
	}
	public static void KRWtoZAR(){
		KRWtoUSD();
		USDtoZAR();
	}
	public static void KRWtoKRW(){
		KRWtoUSD();
		USDtoKRW();
	}
	public static void KRWtoLKR(){
		KRWtoUSD();
		USDtoLKR();
	}
	public static void KRWtoSEK(){
		KRWtoUSD();
		USDtoSEK();
	}
	public static void KRWtoCHF(){
		KRWtoUSD();
		USDtoCHF();
	}
	public static void KRWtoSYP(){
		KRWtoUSD();
		USDtoSYP();
	}
	public static void KRWtoTZS(){
		KRWtoUSD();
		USDtoTZS();
	}
	public static void KRWtoTHB(){
		KRWtoUSD();
		USDtoTHB();
	}
	public static void KRWtoTRY(){
		KRWtoUSD();
		USDtoTRY();
	}
	public static void KRWtoUGX(){
		KRWtoUSD();
		USDtoUGX();
	}
	public static void KRWtoUAH(){
		KRWtoUSD();
		USDtoUAH();
	}
	public static void KRWtoAED(){
		KRWtoUSD();
		USDtoAED();
	}
	public static void KRWtoVND(){
		KRWtoUSD();
		USDtoVND();
	}
	public static void KRWtoZMW(){
		KRWtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- LKR Conversions -------------------//
	public static void LKRtoUSD(){
		unit= unit.multiply(new BigDecimal("0.0058"));
	}
	public static void LKRtoEUR(){
		LKRtoUSD();
		USDtoEUR();
	}
	public static void LKRtoHKD(){
		LKRtoUSD();
		USDtoHKD();
	}
	public static void LKRtoBitcoin(){
		LKRtoUSD();
		USDtoBitcoin();
	}
	public static void LKRtoBitcoinCash(){
		LKRtoUSD();
		USDtoBitcoinCash();
	}
	public static void LKRtoJPY(){
		LKRtoUSD();
		USDtoJPY();
	}
	public static void LKRtoCNY(){
		LKRtoUSD();
		USDtoCNY();
	}
	public static void LKRtoINR(){
		LKRtoUSD();
		USDtoINR();
	}
	public static void LKRtoDZD(){
		LKRtoUSD();
		USDtoDZD();
	}
	public static void LKRtoARS(){
		LKRtoUSD();
		USDtoARS();
	}
	public static void LKRtoAUD(){
		LKRtoUSD();
		USDtoAUD();
	}
	public static void LKRtoBRL(){
		LKRtoUSD();
		USDtoBRL();
	}
	public static void LKRtoGBP(){
		LKRtoUSD();
		USDtoGBP();
	}
	public static void LKRtoBGN(){
		LKRtoUSD();
		USDtoBGN();
	}
	public static void LKRtoKHR(){
		LKRtoUSD();
		USDtoKHR();
	}
	public static void LKRtoCAD(){
		LKRtoUSD();
		USDtoCAD();
	}
	public static void LKRtoCLP(){
		LKRtoUSD();
		USDtoCLP();
	}
	public static void LKRtoCOP(){
		LKRtoUSD();
		USDtoCOP();
	}
	public static void LKRtoCRC(){
		LKRtoUSD();
		USDtoCRC();
	}
	public static void LKRtoHRK(){
		LKRtoUSD();
		USDtoHRK();
	}
	public static void LKRtoCZK(){
		LKRtoUSD();
		USDtoCZK();
	}
	public static void LKRtoDKK(){
		LKRtoUSD();
		USDtoDKK();
	}
	public static void LKRtoEGP(){
		LKRtoUSD();
		USDtoEGP();
	}
	public static void LKRtoISK(){
		LKRtoUSD();
		USDtoISK();
	}
	public static void LKRtoIDR(){
		LKRtoUSD();
		USDtoIDR();
	}
	public static void LKRtoIQD(){
		LKRtoUSD();
		USDtoIQD();
	}
	public static void LKRtoILS(){
		LKRtoUSD();
		USDtoILS();
	}
	public static void LKRtoJOD(){
		LKRtoUSD();
		USDtoJOD();
	}
	public static void LKRtoKES(){
		LKRtoUSD();
		USDtoKES();
	}
	public static void LKRtoKWD(){
		LKRtoUSD();
		USDtoKWD();
	}
	public static void LKRtoMYR(){
		LKRtoUSD();
		USDtoMYR();
	}
	public static void LKRtoMXN(){
		LKRtoUSD();
		USDtoMXN();
	}
	public static void LKRtoMAD(){
		LKRtoUSD();
		USDtoMAD();
	}
	public static void LKRtoMMK(){
		LKRtoUSD();
		USDtoMMK();
	}
	public static void LKRtoTWD(){
		LKRtoUSD();
		USDtoTWD();
	}
	public static void LKRtoNZD(){
		LKRtoUSD();
		USDtoNZD();
	}
	public static void LKRtoNOK(){
		LKRtoUSD();
		USDtoNOK();
	}
	public static void LKRtoPHP(){
		LKRtoUSD();
		USDtoPHP();
	}
	public static void LKRtoQAR(){
		LKRtoUSD();
		USDtoQAR();
	}
	public static void LKRtoRON(){
		LKRtoUSD();
		USDtoRON();
	}
	public static void LKRtoRUB(){
		LKRtoUSD();
		USDtoRUB();
	}
	public static void LKRtoSAR(){
		LKRtoUSD();
		USDtoSAR();
	}
	public static void LKRtoRSD(){
		LKRtoUSD();
		USDtoRSD();
	}
	public static void LKRtoSGD(){
		LKRtoUSD();
		USDtoSGD();
	}
	public static void LKRtoZAR(){
		LKRtoUSD();
		USDtoZAR();
	}
	public static void LKRtoKRW(){
		LKRtoUSD();
		USDtoKRW();
	}
	public static void LKRtoLKR(){
		LKRtoUSD();
		USDtoLKR();
	}
	public static void LKRtoSEK(){
		LKRtoUSD();
		USDtoSEK();
	}
	public static void LKRtoCHF(){
		LKRtoUSD();
		USDtoCHF();
	}
	public static void LKRtoSYP(){
		LKRtoUSD();
		USDtoSYP();
	}
	public static void LKRtoTZS(){
		LKRtoUSD();
		USDtoTZS();
	}
	public static void LKRtoTHB(){
		LKRtoUSD();
		USDtoTHB();
	}
	public static void LKRtoTRY(){
		LKRtoUSD();
		USDtoTRY();
	}
	public static void LKRtoUGX(){
		LKRtoUSD();
		USDtoUGX();
	}
	public static void LKRtoUAH(){
		LKRtoUSD();
		USDtoUAH();
	}
	public static void LKRtoAED(){
		LKRtoUSD();
		USDtoAED();
	}
	public static void LKRtoVND(){
		LKRtoUSD();
		USDtoVND();
	}
	public static void LKRtoZMW(){
		LKRtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- SEK Conversions -------------------//
	public static void SEKtoUSD(){
		unit= unit.multiply(new BigDecimal("0.11"));
	}
	public static void SEKtoEUR(){
		SEKtoUSD();
		USDtoEUR();
	}
	public static void SEKtoHKD(){
		SEKtoUSD();
		USDtoHKD();
	}
	public static void SEKtoBitcoin(){
		SEKtoUSD();
		USDtoBitcoin();
	}
	public static void SEKtoBitcoinCash(){
		SEKtoUSD();
		USDtoBitcoinCash();
	}
	public static void SEKtoJPY(){
		SEKtoUSD();
		USDtoJPY();
	}
	public static void SEKtoCNY(){
		SEKtoUSD();
		USDtoCNY();
	}
	public static void SEKtoINR(){
		SEKtoUSD();
		USDtoINR();
	}
	public static void SEKtoDZD(){
		SEKtoUSD();
		USDtoDZD();
	}
	public static void SEKtoARS(){
		SEKtoUSD();
		USDtoARS();
	}
	public static void SEKtoAUD(){
		SEKtoUSD();
		USDtoAUD();
	}
	public static void SEKtoBRL(){
		SEKtoUSD();
		USDtoBRL();
	}
	public static void SEKtoGBP(){
		SEKtoUSD();
		USDtoGBP();
	}
	public static void SEKtoBGN(){
		SEKtoUSD();
		USDtoBGN();
	}
	public static void SEKtoKHR(){
		SEKtoUSD();
		USDtoKHR();
	}
	public static void SEKtoCAD(){
		SEKtoUSD();
		USDtoCAD();
	}
	public static void SEKtoCLP(){
		SEKtoUSD();
		USDtoCLP();
	}
	public static void SEKtoCOP(){
		SEKtoUSD();
		USDtoCOP();
	}
	public static void SEKtoCRC(){
		SEKtoUSD();
		USDtoCRC();
	}
	public static void SEKtoHRK(){
		SEKtoUSD();
		USDtoHRK();
	}
	public static void SEKtoCZK(){
		SEKtoUSD();
		USDtoCZK();
	}
	public static void SEKtoDKK(){
		SEKtoUSD();
		USDtoDKK();
	}
	public static void SEKtoEGP(){
		SEKtoUSD();
		USDtoEGP();
	}
	public static void SEKtoISK(){
		SEKtoUSD();
		USDtoISK();
	}
	public static void SEKtoIDR(){
		SEKtoUSD();
		USDtoIDR();
	}
	public static void SEKtoIQD(){
		SEKtoUSD();
		USDtoIQD();
	}
	public static void SEKtoILS(){
		SEKtoUSD();
		USDtoILS();
	}
	public static void SEKtoJOD(){
		SEKtoUSD();
		USDtoJOD();
	}
	public static void SEKtoKES(){
		SEKtoUSD();
		USDtoKES();
	}
	public static void SEKtoKWD(){
		SEKtoUSD();
		USDtoKWD();
	}
	public static void SEKtoMYR(){
		SEKtoUSD();
		USDtoMYR();
	}
	public static void SEKtoMXN(){
		SEKtoUSD();
		USDtoMXN();
	}
	public static void SEKtoMAD(){
		SEKtoUSD();
		USDtoMAD();
	}
	public static void SEKtoMMK(){
		SEKtoUSD();
		USDtoMMK();
	}
	public static void SEKtoTWD(){
		SEKtoUSD();
		USDtoTWD();
	}
	public static void SEKtoNZD(){
		SEKtoUSD();
		USDtoNZD();
	}
	public static void SEKtoNOK(){
		SEKtoUSD();
		USDtoNOK();
	}
	public static void SEKtoPHP(){
		SEKtoUSD();
		USDtoPHP();
	}
	public static void SEKtoQAR(){
		SEKtoUSD();
		USDtoQAR();
	}
	public static void SEKtoRON(){
		SEKtoUSD();
		USDtoRON();
	}
	public static void SEKtoRUB(){
		SEKtoUSD();
		USDtoRUB();
	}
	public static void SEKtoSAR(){
		SEKtoUSD();
		USDtoSAR();
	}
	public static void SEKtoRSD(){
		SEKtoUSD();
		USDtoRSD();
	}
	public static void SEKtoSGD(){
		SEKtoUSD();
		USDtoSGD();
	}
	public static void SEKtoZAR(){
		SEKtoUSD();
		USDtoZAR();
	}
	public static void SEKtoKRW(){
		SEKtoUSD();
		USDtoKRW();
	}
	public static void SEKtoLKR(){
		SEKtoUSD();
		USDtoLKR();
	}
	public static void SEKtoSEK(){
		SEKtoUSD();
		USDtoSEK();
	}
	public static void SEKtoCHF(){
		SEKtoUSD();
		USDtoCHF();
	}
	public static void SEKtoSYP(){
		SEKtoUSD();
		USDtoSYP();
	}
	public static void SEKtoTZS(){
		SEKtoUSD();
		USDtoTZS();
	}
	public static void SEKtoTHB(){
		SEKtoUSD();
		USDtoTHB();
	}
	public static void SEKtoTRY(){
		SEKtoUSD();
		USDtoTRY();
	}
	public static void SEKtoUGX(){
		SEKtoUSD();
		USDtoUGX();
	}
	public static void SEKtoUAH(){
		SEKtoUSD();
		USDtoUAH();
	}
	public static void SEKtoAED(){
		SEKtoUSD();
		USDtoAED();
	}
	public static void SEKtoVND(){
		SEKtoUSD();
		USDtoVND();
	}
	public static void SEKtoZMW(){
		SEKtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- CHF Conversions -------------------//
	public static void CHFtoUSD(){
		unit= unit.multiply(new BigDecimal("1"));
	}
	public static void CHFtoEUR(){
		CHFtoUSD();
		USDtoEUR();
	}
	public static void CHFtoHKD(){
		CHFtoUSD();
		USDtoHKD();
	}
	public static void CHFtoBitcoin(){
		CHFtoUSD();
		USDtoBitcoin();
	}
	public static void CHFtoBitcoinCash(){
		CHFtoUSD();
		USDtoBitcoinCash();
	}
	public static void CHFtoJPY(){
		CHFtoUSD();
		USDtoJPY();
	}
	public static void CHFtoCNY(){
		CHFtoUSD();
		USDtoCNY();
	}
	public static void CHFtoINR(){
		CHFtoUSD();
		USDtoINR();
	}
	public static void CHFtoDZD(){
		CHFtoUSD();
		USDtoDZD();
	}
	public static void CHFtoARS(){
		CHFtoUSD();
		USDtoARS();
	}
	public static void CHFtoAUD(){
		CHFtoUSD();
		USDtoAUD();
	}
	public static void CHFtoBRL(){
		CHFtoUSD();
		USDtoBRL();
	}
	public static void CHFtoGBP(){
		CHFtoUSD();
		USDtoGBP();
	}
	public static void CHFtoBGN(){
		CHFtoUSD();
		USDtoBGN();
	}
	public static void CHFtoKHR(){
		CHFtoUSD();
		USDtoKHR();
	}
	public static void CHFtoCAD(){
		CHFtoUSD();
		USDtoCAD();
	}
	public static void CHFtoCLP(){
		CHFtoUSD();
		USDtoCLP();
	}
	public static void CHFtoCOP(){
		CHFtoUSD();
		USDtoCOP();
	}
	public static void CHFtoCRC(){
		CHFtoUSD();
		USDtoCRC();
	}
	public static void CHFtoHRK(){
		CHFtoUSD();
		USDtoHRK();
	}
	public static void CHFtoCZK(){
		CHFtoUSD();
		USDtoCZK();
	}
	public static void CHFtoDKK(){
		CHFtoUSD();
		USDtoDKK();
	}
	public static void CHFtoEGP(){
		CHFtoUSD();
		USDtoEGP();
	}
	public static void CHFtoISK(){
		CHFtoUSD();
		USDtoISK();
	}
	public static void CHFtoIDR(){
		CHFtoUSD();
		USDtoIDR();
	}
	public static void CHFtoIQD(){
		CHFtoUSD();
		USDtoIQD();
	}
	public static void CHFtoILS(){
		CHFtoUSD();
		USDtoILS();
	}
	public static void CHFtoJOD(){
		CHFtoUSD();
		USDtoJOD();
	}
	public static void CHFtoKES(){
		CHFtoUSD();
		USDtoKES();
	}
	public static void CHFtoKWD(){
		CHFtoUSD();
		USDtoKWD();
	}
	public static void CHFtoMYR(){
		CHFtoUSD();
		USDtoMYR();
	}
	public static void CHFtoMXN(){
		CHFtoUSD();
		USDtoMXN();
	}
	public static void CHFtoMAD(){
		CHFtoUSD();
		USDtoMAD();
	}
	public static void CHFtoMMK(){
		CHFtoUSD();
		USDtoMMK();
	}
	public static void CHFtoTWD(){
		CHFtoUSD();
		USDtoTWD();
	}
	public static void CHFtoNZD(){
		CHFtoUSD();
		USDtoNZD();
	}
	public static void CHFtoNOK(){
		CHFtoUSD();
		USDtoNOK();
	}
	public static void CHFtoPHP(){
		CHFtoUSD();
		USDtoPHP();
	}
	public static void CHFtoQAR(){
		CHFtoUSD();
		USDtoQAR();
	}
	public static void CHFtoRON(){
		CHFtoUSD();
		USDtoRON();
	}
	public static void CHFtoRUB(){
		CHFtoUSD();
		USDtoRUB();
	}
	public static void CHFtoSAR(){
		CHFtoUSD();
		USDtoSAR();
	}
	public static void CHFtoRSD(){
		CHFtoUSD();
		USDtoRSD();
	}
	public static void CHFtoSGD(){
		CHFtoUSD();
		USDtoSGD();
	}
	public static void CHFtoZAR(){
		CHFtoUSD();
		USDtoZAR();
	}
	public static void CHFtoKRW(){
		CHFtoUSD();
		USDtoKRW();
	}
	public static void CHFtoLKR(){
		CHFtoUSD();
		USDtoLKR();
	}
	public static void CHFtoSEK(){
		CHFtoUSD();
		USDtoSEK();
	}
	public static void CHFtoCHF(){
		CHFtoUSD();
		USDtoCHF();
	}
	public static void CHFtoSYP(){
		CHFtoUSD();
		USDtoSYP();
	}
	public static void CHFtoTZS(){
		CHFtoUSD();
		USDtoTZS();
	}
	public static void CHFtoTHB(){
		CHFtoUSD();
		USDtoTHB();
	}
	public static void CHFtoTRY(){
		CHFtoUSD();
		USDtoTRY();
	}
	public static void CHFtoUGX(){
		CHFtoUSD();
		USDtoUGX();
	}
	public static void CHFtoUAH(){
		CHFtoUSD();
		USDtoUAH();
	}
	public static void CHFtoAED(){
		CHFtoUSD();
		USDtoAED();
	}
	public static void CHFtoVND(){
		CHFtoUSD();
		USDtoVND();
	}
	public static void CHFtoZMW(){
		CHFtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- SYP Conversions -------------------//
	public static void SYPtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00194"));
	}
	public static void SYPtoEUR(){
		SYPtoUSD();
		USDtoEUR();
	}
	public static void SYPtoHKD(){
		SYPtoUSD();
		USDtoHKD();
	}
	public static void SYPtoBitcoin(){
		SYPtoUSD();
		USDtoBitcoin();
	}
	public static void SYPtoBitcoinCash(){
		SYPtoUSD();
		USDtoBitcoinCash();
	}
	public static void SYPtoJPY(){
		SYPtoUSD();
		USDtoJPY();
	}
	public static void SYPtoCNY(){
		SYPtoUSD();
		USDtoCNY();
	}
	public static void SYPtoINR(){
		SYPtoUSD();
		USDtoINR();
	}
	public static void SYPtoDZD(){
		SYPtoUSD();
		USDtoDZD();
	}
	public static void SYPtoARS(){
		SYPtoUSD();
		USDtoARS();
	}
	public static void SYPtoAUD(){
		SYPtoUSD();
		USDtoAUD();
	}
	public static void SYPtoBRL(){
		SYPtoUSD();
		USDtoBRL();
	}
	public static void SYPtoGBP(){
		SYPtoUSD();
		USDtoGBP();
	}
	public static void SYPtoBGN(){
		SYPtoUSD();
		USDtoBGN();
	}
	public static void SYPtoKHR(){
		SYPtoUSD();
		USDtoKHR();
	}
	public static void SYPtoCAD(){
		SYPtoUSD();
		USDtoCAD();
	}
	public static void SYPtoCLP(){
		SYPtoUSD();
		USDtoCLP();
	}
	public static void SYPtoCOP(){
		SYPtoUSD();
		USDtoCOP();
	}
	public static void SYPtoCRC(){
		SYPtoUSD();
		USDtoCRC();
	}
	public static void SYPtoHRK(){
		SYPtoUSD();
		USDtoHRK();
	}
	public static void SYPtoCZK(){
		SYPtoUSD();
		USDtoCZK();
	}
	public static void SYPtoDKK(){
		SYPtoUSD();
		USDtoDKK();
	}
	public static void SYPtoEGP(){
		SYPtoUSD();
		USDtoEGP();
	}
	public static void SYPtoISK(){
		SYPtoUSD();
		USDtoISK();
	}
	public static void SYPtoIDR(){
		SYPtoUSD();
		USDtoIDR();
	}
	public static void SYPtoIQD(){
		SYPtoUSD();
		USDtoIQD();
	}
	public static void SYPtoILS(){
		SYPtoUSD();
		USDtoILS();
	}
	public static void SYPtoJOD(){
		SYPtoUSD();
		USDtoJOD();
	}
	public static void SYPtoKES(){
		SYPtoUSD();
		USDtoKES();
	}
	public static void SYPtoKWD(){
		SYPtoUSD();
		USDtoKWD();
	}
	public static void SYPtoMYR(){
		SYPtoUSD();
		USDtoMYR();
	}
	public static void SYPtoMXN(){
		SYPtoUSD();
		USDtoMXN();
	}
	public static void SYPtoMAD(){
		SYPtoUSD();
		USDtoMAD();
	}
	public static void SYPtoMMK(){
		SYPtoUSD();
		USDtoMMK();
	}
	public static void SYPtoTWD(){
		SYPtoUSD();
		USDtoTWD();
	}
	public static void SYPtoNZD(){
		SYPtoUSD();
		USDtoNZD();
	}
	public static void SYPtoNOK(){
		SYPtoUSD();
		USDtoNOK();
	}
	public static void SYPtoPHP(){
		SYPtoUSD();
		USDtoPHP();
	}
	public static void SYPtoQAR(){
		SYPtoUSD();
		USDtoQAR();
	}
	public static void SYPtoRON(){
		SYPtoUSD();
		USDtoRON();
	}
	public static void SYPtoRUB(){
		SYPtoUSD();
		USDtoRUB();
	}
	public static void SYPtoSAR(){
		SYPtoUSD();
		USDtoSAR();
	}
	public static void SYPtoRSD(){
		SYPtoUSD();
		USDtoRSD();
	}
	public static void SYPtoSGD(){
		SYPtoUSD();
		USDtoSGD();
	}
	public static void SYPtoZAR(){
		SYPtoUSD();
		USDtoZAR();
	}
	public static void SYPtoKRW(){
		SYPtoUSD();
		USDtoKRW();
	}
	public static void SYPtoLKR(){
		SYPtoUSD();
		USDtoLKR();
	}
	public static void SYPtoSEK(){
		SYPtoUSD();
		USDtoSEK();
	}
	public static void SYPtoCHF(){
		SYPtoUSD();
		USDtoCHF();
	}
	public static void SYPtoSYP(){
		SYPtoUSD();
		USDtoSYP();
	}
	public static void SYPtoTZS(){
		SYPtoUSD();
		USDtoTZS();
	}
	public static void SYPtoTHB(){
		SYPtoUSD();
		USDtoTHB();
	}
	public static void SYPtoTRY(){
		SYPtoUSD();
		USDtoTRY();
	}
	public static void SYPtoUGX(){
		SYPtoUSD();
		USDtoUGX();
	}
	public static void SYPtoUAH(){
		SYPtoUSD();
		USDtoUAH();
	}
	public static void SYPtoAED(){
		SYPtoUSD();
		USDtoAED();
	}
	public static void SYPtoVND(){
		SYPtoUSD();
		USDtoVND();
	}
	public static void SYPtoZMW(){
		SYPtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- TZS Conversions -------------------//
	public static void TZStoUSD(){
		unit= unit.multiply(new BigDecimal("0.00044"));
	}
	public static void TZStoEUR(){
		TZStoUSD();
		USDtoEUR();
	}
	public static void TZStoHKD(){
		TZStoUSD();
		USDtoHKD();
	}
	public static void TZStoBitcoin(){
		TZStoUSD();
		USDtoBitcoin();
	}
	public static void TZStoBitcoinCash(){
		TZStoUSD();
		USDtoBitcoinCash();
	}
	public static void TZStoJPY(){
		TZStoUSD();
		USDtoJPY();
	}
	public static void TZStoCNY(){
		TZStoUSD();
		USDtoCNY();
	}
	public static void TZStoINR(){
		TZStoUSD();
		USDtoINR();
	}
	public static void TZStoDZD(){
		TZStoUSD();
		USDtoDZD();
	}
	public static void TZStoARS(){
		TZStoUSD();
		USDtoARS();
	}
	public static void TZStoAUD(){
		TZStoUSD();
		USDtoAUD();
	}
	public static void TZStoBRL(){
		TZStoUSD();
		USDtoBRL();
	}
	public static void TZStoGBP(){
		TZStoUSD();
		USDtoGBP();
	}
	public static void TZStoBGN(){
		TZStoUSD();
		USDtoBGN();
	}
	public static void TZStoKHR(){
		TZStoUSD();
		USDtoKHR();
	}
	public static void TZStoCAD(){
		TZStoUSD();
		USDtoCAD();
	}
	public static void TZStoCLP(){
		TZStoUSD();
		USDtoCLP();
	}
	public static void TZStoCOP(){
		TZStoUSD();
		USDtoCOP();
	}
	public static void TZStoCRC(){
		TZStoUSD();
		USDtoCRC();
	}
	public static void TZStoHRK(){
		TZStoUSD();
		USDtoHRK();
	}
	public static void TZStoCZK(){
		TZStoUSD();
		USDtoCZK();
	}
	public static void TZStoDKK(){
		TZStoUSD();
		USDtoDKK();
	}
	public static void TZStoEGP(){
		TZStoUSD();
		USDtoEGP();
	}
	public static void TZStoISK(){
		TZStoUSD();
		USDtoISK();
	}
	public static void TZStoIDR(){
		TZStoUSD();
		USDtoIDR();
	}
	public static void TZStoIQD(){
		TZStoUSD();
		USDtoIQD();
	}
	public static void TZStoILS(){
		TZStoUSD();
		USDtoILS();
	}
	public static void TZStoJOD(){
		TZStoUSD();
		USDtoJOD();
	}
	public static void TZStoKES(){
		TZStoUSD();
		USDtoKES();
	}
	public static void TZStoKWD(){
		TZStoUSD();
		USDtoKWD();
	}
	public static void TZStoMYR(){
		TZStoUSD();
		USDtoMYR();
	}
	public static void TZStoMXN(){
		TZStoUSD();
		USDtoMXN();
	}
	public static void TZStoMAD(){
		TZStoUSD();
		USDtoMAD();
	}
	public static void TZStoMMK(){
		TZStoUSD();
		USDtoMMK();
	}
	public static void TZStoTWD(){
		TZStoUSD();
		USDtoTWD();
	}
	public static void TZStoNZD(){
		TZStoUSD();
		USDtoNZD();
	}
	public static void TZStoNOK(){
		TZStoUSD();
		USDtoNOK();
	}
	public static void TZStoPHP(){
		TZStoUSD();
		USDtoPHP();
	}
	public static void TZStoQAR(){
		TZStoUSD();
		USDtoQAR();
	}
	public static void TZStoRON(){
		TZStoUSD();
		USDtoRON();
	}
	public static void TZStoRUB(){
		TZStoUSD();
		USDtoRUB();
	}
	public static void TZStoSAR(){
		TZStoUSD();
		USDtoSAR();
	}
	public static void TZStoRSD(){
		TZStoUSD();
		USDtoRSD();
	}
	public static void TZStoSGD(){
		TZStoUSD();
		USDtoSGD();
	}
	public static void TZStoZAR(){
		TZStoUSD();
		USDtoZAR();
	}
	public static void TZStoKRW(){
		TZStoUSD();
		USDtoKRW();
	}
	public static void TZStoLKR(){
		TZStoUSD();
		USDtoLKR();
	}
	public static void TZStoSEK(){
		TZStoUSD();
		USDtoSEK();
	}
	public static void TZStoCHF(){
		TZStoUSD();
		USDtoCHF();
	}
	public static void TZStoSYP(){
		TZStoUSD();
		USDtoSYP();
	}
	public static void TZStoTZS(){
		TZStoUSD();
		USDtoTZS();
	}
	public static void TZStoTHB(){
		TZStoUSD();
		USDtoTHB();
	}
	public static void TZStoTRY(){
		TZStoUSD();
		USDtoTRY();
	}
	public static void TZStoUGX(){
		TZStoUSD();
		USDtoUGX();
	}
	public static void TZStoUAH(){
		TZStoUSD();
		USDtoUAH();
	}
	public static void TZStoAED(){
		TZStoUSD();
		USDtoAED();
	}
	public static void TZStoVND(){
		TZStoUSD();
		USDtoVND();
	}
	public static void TZStoZMW(){
		TZStoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- THB Conversions -------------------//
	public static void THBtoUSD(){
		unit= unit.multiply(new BigDecimal("0.031"));
	}
	public static void THBtoEUR(){
		THBtoUSD();
		USDtoEUR();
	}
	public static void THBtoHKD(){
		THBtoUSD();
		USDtoHKD();
	}
	public static void THBtoBitcoin(){
		THBtoUSD();
		USDtoBitcoin();
	}
	public static void THBtoBitcoinCash(){
		THBtoUSD();
		USDtoBitcoinCash();
	}
	public static void THBtoJPY(){
		THBtoUSD();
		USDtoJPY();
	}
	public static void THBtoCNY(){
		THBtoUSD();
		USDtoCNY();
	}
	public static void THBtoINR(){
		THBtoUSD();
		USDtoINR();
	}
	public static void THBtoDZD(){
		THBtoUSD();
		USDtoDZD();
	}
	public static void THBtoARS(){
		THBtoUSD();
		USDtoARS();
	}
	public static void THBtoAUD(){
		THBtoUSD();
		USDtoAUD();
	}
	public static void THBtoBRL(){
		THBtoUSD();
		USDtoBRL();
	}
	public static void THBtoGBP(){
		THBtoUSD();
		USDtoGBP();
	}
	public static void THBtoBGN(){
		THBtoUSD();
		USDtoBGN();
	}
	public static void THBtoKHR(){
		THBtoUSD();
		USDtoKHR();
	}
	public static void THBtoCAD(){
		THBtoUSD();
		USDtoCAD();
	}
	public static void THBtoCLP(){
		THBtoUSD();
		USDtoCLP();
	}
	public static void THBtoCOP(){
		THBtoUSD();
		USDtoCOP();
	}
	public static void THBtoCRC(){
		THBtoUSD();
		USDtoCRC();
	}
	public static void THBtoHRK(){
		THBtoUSD();
		USDtoHRK();
	}
	public static void THBtoCZK(){
		THBtoUSD();
		USDtoCZK();
	}
	public static void THBtoDKK(){
		THBtoUSD();
		USDtoDKK();
	}
	public static void THBtoEGP(){
		THBtoUSD();
		USDtoEGP();
	}
	public static void THBtoISK(){
		THBtoUSD();
		USDtoISK();
	}
	public static void THBtoIDR(){
		THBtoUSD();
		USDtoIDR();
	}
	public static void THBtoIQD(){
		THBtoUSD();
		USDtoIQD();
	}
	public static void THBtoILS(){
		THBtoUSD();
		USDtoILS();
	}
	public static void THBtoJOD(){
		THBtoUSD();
		USDtoJOD();
	}
	public static void THBtoKES(){
		THBtoUSD();
		USDtoKES();
	}
	public static void THBtoKWD(){
		THBtoUSD();
		USDtoKWD();
	}
	public static void THBtoMYR(){
		THBtoUSD();
		USDtoMYR();
	}
	public static void THBtoMXN(){
		THBtoUSD();
		USDtoMXN();
	}
	public static void THBtoMAD(){
		THBtoUSD();
		USDtoMAD();
	}
	public static void THBtoMMK(){
		THBtoUSD();
		USDtoMMK();
	}
	public static void THBtoTWD(){
		THBtoUSD();
		USDtoTWD();
	}
	public static void THBtoNZD(){
		THBtoUSD();
		USDtoNZD();
	}
	public static void THBtoNOK(){
		THBtoUSD();
		USDtoNOK();
	}
	public static void THBtoPHP(){
		THBtoUSD();
		USDtoPHP();
	}
	public static void THBtoQAR(){
		THBtoUSD();
		USDtoQAR();
	}
	public static void THBtoRON(){
		THBtoUSD();
		USDtoRON();
	}
	public static void THBtoRUB(){
		THBtoUSD();
		USDtoRUB();
	}
	public static void THBtoSAR(){
		THBtoUSD();
		USDtoSAR();
	}
	public static void THBtoRSD(){
		THBtoUSD();
		USDtoRSD();
	}
	public static void THBtoSGD(){
		THBtoUSD();
		USDtoSGD();
	}
	public static void THBtoZAR(){
		THBtoUSD();
		USDtoZAR();
	}
	public static void THBtoKRW(){
		THBtoUSD();
		USDtoKRW();
	}
	public static void THBtoLKR(){
		THBtoUSD();
		USDtoLKR();
	}
	public static void THBtoSEK(){
		THBtoUSD();
		USDtoSEK();
	}
	public static void THBtoCHF(){
		THBtoUSD();
		USDtoCHF();
	}
	public static void THBtoSYP(){
		THBtoUSD();
		USDtoSYP();
	}
	public static void THBtoTZS(){
		THBtoUSD();
		USDtoTZS();
	}
	public static void THBtoTHB(){
		THBtoUSD();
		USDtoTHB();
	}
	public static void THBtoTRY(){
		THBtoUSD();
		USDtoTRY();
	}
	public static void THBtoUGX(){
		THBtoUSD();
		USDtoUGX();
	}
	public static void THBtoUAH(){
		THBtoUSD();
		USDtoUAH();
	}
	public static void THBtoAED(){
		THBtoUSD();
		USDtoAED();
	}
	public static void THBtoVND(){
		THBtoUSD();
		USDtoVND();
	}
	public static void THBtoZMW(){
		THBtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- TRY Conversions -------------------//
	public static void TRYtoUSD(){
		unit= unit.multiply(new BigDecimal("0.18"));
	}
	public static void TRYtoEUR(){
		TRYtoUSD();
		USDtoEUR();
	}
	public static void TRYtoHKD(){
		TRYtoUSD();
		USDtoHKD();
	}
	public static void TRYtoBitcoin(){
		TRYtoUSD();
		USDtoBitcoin();
	}
	public static void TRYtoBitcoinCash(){
		TRYtoUSD();
		USDtoBitcoinCash();
	}
	public static void TRYtoJPY(){
		TRYtoUSD();
		USDtoJPY();
	}
	public static void TRYtoCNY(){
		TRYtoUSD();
		USDtoCNY();
	}
	public static void TRYtoINR(){
		TRYtoUSD();
		USDtoINR();
	}
	public static void TRYtoDZD(){
		TRYtoUSD();
		USDtoDZD();
	}
	public static void TRYtoARS(){
		TRYtoUSD();
		USDtoARS();
	}
	public static void TRYtoAUD(){
		TRYtoUSD();
		USDtoAUD();
	}
	public static void TRYtoBRL(){
		TRYtoUSD();
		USDtoBRL();
	}
	public static void TRYtoGBP(){
		TRYtoUSD();
		USDtoGBP();
	}
	public static void TRYtoBGN(){
		TRYtoUSD();
		USDtoBGN();
	}
	public static void TRYtoKHR(){
		TRYtoUSD();
		USDtoKHR();
	}
	public static void TRYtoCAD(){
		TRYtoUSD();
		USDtoCAD();
	}
	public static void TRYtoCLP(){
		TRYtoUSD();
		USDtoCLP();
	}
	public static void TRYtoCOP(){
		TRYtoUSD();
		USDtoCOP();
	}
	public static void TRYtoCRC(){
		TRYtoUSD();
		USDtoCRC();
	}
	public static void TRYtoHRK(){
		TRYtoUSD();
		USDtoHRK();
	}
	public static void TRYtoCZK(){
		TRYtoUSD();
		USDtoCZK();
	}
	public static void TRYtoDKK(){
		TRYtoUSD();
		USDtoDKK();
	}
	public static void TRYtoEGP(){
		TRYtoUSD();
		USDtoEGP();
	}
	public static void TRYtoISK(){
		TRYtoUSD();
		USDtoISK();
	}
	public static void TRYtoIDR(){
		TRYtoUSD();
		USDtoIDR();
	}
	public static void TRYtoIQD(){
		TRYtoUSD();
		USDtoIQD();
	}
	public static void TRYtoILS(){
		TRYtoUSD();
		USDtoILS();
	}
	public static void TRYtoJOD(){
		TRYtoUSD();
		USDtoJOD();
	}
	public static void TRYtoKES(){
		TRYtoUSD();
		USDtoKES();
	}
	public static void TRYtoKWD(){
		TRYtoUSD();
		USDtoKWD();
	}
	public static void TRYtoMYR(){
		TRYtoUSD();
		USDtoMYR();
	}
	public static void TRYtoMXN(){
		TRYtoUSD();
		USDtoMXN();
	}
	public static void TRYtoMAD(){
		TRYtoUSD();
		USDtoMAD();
	}
	public static void TRYtoMMK(){
		TRYtoUSD();
		USDtoMMK();
	}
	public static void TRYtoTWD(){
		TRYtoUSD();
		USDtoTWD();
	}
	public static void TRYtoNZD(){
		TRYtoUSD();
		USDtoNZD();
	}
	public static void TRYtoNOK(){
		TRYtoUSD();
		USDtoNOK();
	}
	public static void TRYtoPHP(){
		TRYtoUSD();
		USDtoPHP();
	}
	public static void TRYtoQAR(){
		TRYtoUSD();
		USDtoQAR();
	}
	public static void TRYtoRON(){
		TRYtoUSD();
		USDtoRON();
	}
	public static void TRYtoRUB(){
		TRYtoUSD();
		USDtoRUB();
	}
	public static void TRYtoSAR(){
		TRYtoUSD();
		USDtoSAR();
	}
	public static void TRYtoRSD(){
		TRYtoUSD();
		USDtoRSD();
	}
	public static void TRYtoSGD(){
		TRYtoUSD();
		USDtoSGD();
	}
	public static void TRYtoZAR(){
		TRYtoUSD();
		USDtoZAR();
	}
	public static void TRYtoKRW(){
		TRYtoUSD();
		USDtoKRW();
	}
	public static void TRYtoLKR(){
		TRYtoUSD();
		USDtoLKR();
	}
	public static void TRYtoSEK(){
		TRYtoUSD();
		USDtoSEK();
	}
	public static void TRYtoCHF(){
		TRYtoUSD();
		USDtoCHF();
	}
	public static void TRYtoSYP(){
		TRYtoUSD();
		USDtoSYP();
	}
	public static void TRYtoTZS(){
		TRYtoUSD();
		USDtoTZS();
	}
	public static void TRYtoTHB(){
		TRYtoUSD();
		USDtoTHB();
	}
	public static void TRYtoTRY(){
		TRYtoUSD();
		USDtoTRY();
	}
	public static void TRYtoUGX(){
		TRYtoUSD();
		USDtoUGX();
	}
	public static void TRYtoUAH(){
		TRYtoUSD();
		USDtoUAH();
	}
	public static void TRYtoAED(){
		TRYtoUSD();
		USDtoAED();
	}
	public static void TRYtoVND(){
		TRYtoUSD();
		USDtoVND();
	}
	public static void TRYtoZMW(){
		TRYtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- UGX Conversions -------------------//
	public static void UGXtoUSD(){
		unit= unit.multiply(new BigDecimal("0.00027"));
	}
	public static void UGXtoEUR(){
		UGXtoUSD();
		USDtoEUR();
	}
	public static void UGXtoHKD(){
		UGXtoUSD();
		USDtoHKD();
	}
	public static void UGXtoBitcoin(){
		UGXtoUSD();
		USDtoBitcoin();
	}
	public static void UGXtoBitcoinCash(){
		UGXtoUSD();
		USDtoBitcoinCash();
	}
	public static void UGXtoJPY(){
		UGXtoUSD();
		USDtoJPY();
	}
	public static void UGXtoCNY(){
		UGXtoUSD();
		USDtoCNY();
	}
	public static void UGXtoINR(){
		UGXtoUSD();
		USDtoINR();
	}
	public static void UGXtoDZD(){
		UGXtoUSD();
		USDtoDZD();
	}
	public static void UGXtoARS(){
		UGXtoUSD();
		USDtoARS();
	}
	public static void UGXtoAUD(){
		UGXtoUSD();
		USDtoAUD();
	}
	public static void UGXtoBRL(){
		UGXtoUSD();
		USDtoBRL();
	}
	public static void UGXtoGBP(){
		UGXtoUSD();
		USDtoGBP();
	}
	public static void UGXtoBGN(){
		UGXtoUSD();
		USDtoBGN();
	}
	public static void UGXtoKHR(){
		UGXtoUSD();
		USDtoKHR();
	}
	public static void UGXtoCAD(){
		UGXtoUSD();
		USDtoCAD();
	}
	public static void UGXtoCLP(){
		UGXtoUSD();
		USDtoCLP();
	}
	public static void UGXtoCOP(){
		UGXtoUSD();
		USDtoCOP();
	}
	public static void UGXtoCRC(){
		UGXtoUSD();
		USDtoCRC();
	}
	public static void UGXtoHRK(){
		UGXtoUSD();
		USDtoHRK();
	}
	public static void UGXtoCZK(){
		UGXtoUSD();
		USDtoCZK();
	}
	public static void UGXtoDKK(){
		UGXtoUSD();
		USDtoDKK();
	}
	public static void UGXtoEGP(){
		UGXtoUSD();
		USDtoEGP();
	}
	public static void UGXtoISK(){
		UGXtoUSD();
		USDtoISK();
	}
	public static void UGXtoIDR(){
		UGXtoUSD();
		USDtoIDR();
	}
	public static void UGXtoIQD(){
		UGXtoUSD();
		USDtoIQD();
	}
	public static void UGXtoILS(){
		UGXtoUSD();
		USDtoILS();
	}
	public static void UGXtoJOD(){
		UGXtoUSD();
		USDtoJOD();
	}
	public static void UGXtoKES(){
		UGXtoUSD();
		USDtoKES();
	}
	public static void UGXtoKWD(){
		UGXtoUSD();
		USDtoKWD();
	}
	public static void UGXtoMYR(){
		UGXtoUSD();
		USDtoMYR();
	}
	public static void UGXtoMXN(){
		UGXtoUSD();
		USDtoMXN();
	}
	public static void UGXtoMAD(){
		UGXtoUSD();
		USDtoMAD();
	}
	public static void UGXtoMMK(){
		UGXtoUSD();
		USDtoMMK();
	}
	public static void UGXtoTWD(){
		UGXtoUSD();
		USDtoTWD();
	}
	public static void UGXtoNZD(){
		UGXtoUSD();
		USDtoNZD();
	}
	public static void UGXtoNOK(){
		UGXtoUSD();
		USDtoNOK();
	}
	public static void UGXtoPHP(){
		UGXtoUSD();
		USDtoPHP();
	}
	public static void UGXtoQAR(){
		UGXtoUSD();
		USDtoQAR();
	}
	public static void UGXtoRON(){
		UGXtoUSD();
		USDtoRON();
	}
	public static void UGXtoRUB(){
		UGXtoUSD();
		USDtoRUB();
	}
	public static void UGXtoSAR(){
		UGXtoUSD();
		USDtoSAR();
	}
	public static void UGXtoRSD(){
		UGXtoUSD();
		USDtoRSD();
	}
	public static void UGXtoSGD(){
		UGXtoUSD();
		USDtoSGD();
	}
	public static void UGXtoZAR(){
		UGXtoUSD();
		USDtoZAR();
	}
	public static void UGXtoKRW(){
		UGXtoUSD();
		USDtoKRW();
	}
	public static void UGXtoLKR(){
		UGXtoUSD();
		USDtoLKR();
	}
	public static void UGXtoSEK(){
		UGXtoUSD();
		USDtoSEK();
	}
	public static void UGXtoCHF(){
		UGXtoUSD();
		USDtoCHF();
	}
	public static void UGXtoSYP(){
		UGXtoUSD();
		USDtoSYP();
	}
	public static void UGXtoTZS(){
		UGXtoUSD();
		USDtoTZS();
	}
	public static void UGXtoTHB(){
		UGXtoUSD();
		USDtoTHB();
	}
	public static void UGXtoTRY(){
		UGXtoUSD();
		USDtoTRY();
	}
	public static void UGXtoUGX(){
		UGXtoUSD();
		USDtoUGX();
	}
	public static void UGXtoUAH(){
		UGXtoUSD();
		USDtoUAH();
	}
	public static void UGXtoAED(){
		UGXtoUSD();
		USDtoAED();
	}
	public static void UGXtoVND(){
		UGXtoUSD();
		USDtoVND();
	}
	public static void UGXtoZMW(){
		UGXtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- UAH Conversions -------------------//
	public static void UAHtoUSD(){
		unit= unit.multiply(new BigDecimal("0.035"));
	}
	public static void UAHtoEUR(){
		UAHtoUSD();
		USDtoEUR();
	}
	public static void UAHtoHKD(){
		UAHtoUSD();
		USDtoHKD();
	}
	public static void UAHtoBitcoin(){
		UAHtoUSD();
		USDtoBitcoin();
	}
	public static void UAHtoBitcoinCash(){
		UAHtoUSD();
		USDtoBitcoinCash();
	}
	public static void UAHtoJPY(){
		UAHtoUSD();
		USDtoJPY();
	}
	public static void UAHtoCNY(){
		UAHtoUSD();
		USDtoCNY();
	}
	public static void UAHtoINR(){
		UAHtoUSD();
		USDtoINR();
	}
	public static void UAHtoDZD(){
		UAHtoUSD();
		USDtoDZD();
	}
	public static void UAHtoARS(){
		UAHtoUSD();
		USDtoARS();
	}
	public static void UAHtoAUD(){
		UAHtoUSD();
		USDtoAUD();
	}
	public static void UAHtoBRL(){
		UAHtoUSD();
		USDtoBRL();
	}
	public static void UAHtoGBP(){
		UAHtoUSD();
		USDtoGBP();
	}
	public static void UAHtoBGN(){
		UAHtoUSD();
		USDtoBGN();
	}
	public static void UAHtoKHR(){
		UAHtoUSD();
		USDtoKHR();
	}
	public static void UAHtoCAD(){
		UAHtoUSD();
		USDtoCAD();
	}
	public static void UAHtoCLP(){
		UAHtoUSD();
		USDtoCLP();
	}
	public static void UAHtoCOP(){
		UAHtoUSD();
		USDtoCOP();
	}
	public static void UAHtoCRC(){
		UAHtoUSD();
		USDtoCRC();
	}
	public static void UAHtoHRK(){
		UAHtoUSD();
		USDtoHRK();
	}
	public static void UAHtoCZK(){
		UAHtoUSD();
		USDtoCZK();
	}
	public static void UAHtoDKK(){
		UAHtoUSD();
		USDtoDKK();
	}
	public static void UAHtoEGP(){
		UAHtoUSD();
		USDtoEGP();
	}
	public static void UAHtoISK(){
		UAHtoUSD();
		USDtoISK();
	}
	public static void UAHtoIDR(){
		UAHtoUSD();
		USDtoIDR();
	}
	public static void UAHtoIQD(){
		UAHtoUSD();
		USDtoIQD();
	}
	public static void UAHtoILS(){
		UAHtoUSD();
		USDtoILS();
	}
	public static void UAHtoJOD(){
		UAHtoUSD();
		USDtoJOD();
	}
	public static void UAHtoKES(){
		UAHtoUSD();
		USDtoKES();
	}
	public static void UAHtoKWD(){
		UAHtoUSD();
		USDtoKWD();
	}
	public static void UAHtoMYR(){
		UAHtoUSD();
		USDtoMYR();
	}
	public static void UAHtoMXN(){
		UAHtoUSD();
		USDtoMXN();
	}
	public static void UAHtoMAD(){
		UAHtoUSD();
		USDtoMAD();
	}
	public static void UAHtoMMK(){
		UAHtoUSD();
		USDtoMMK();
	}
	public static void UAHtoTWD(){
		UAHtoUSD();
		USDtoTWD();
	}
	public static void UAHtoNZD(){
		UAHtoUSD();
		USDtoNZD();
	}
	public static void UAHtoNOK(){
		UAHtoUSD();
		USDtoNOK();
	}
	public static void UAHtoPHP(){
		UAHtoUSD();
		USDtoPHP();
	}
	public static void UAHtoQAR(){
		UAHtoUSD();
		USDtoQAR();
	}
	public static void UAHtoRON(){
		UAHtoUSD();
		USDtoRON();
	}
	public static void UAHtoRUB(){
		UAHtoUSD();
		USDtoRUB();
	}
	public static void UAHtoSAR(){
		UAHtoUSD();
		USDtoSAR();
	}
	public static void UAHtoRSD(){
		UAHtoUSD();
		USDtoRSD();
	}
	public static void UAHtoSGD(){
		UAHtoUSD();
		USDtoSGD();
	}
	public static void UAHtoZAR(){
		UAHtoUSD();
		USDtoZAR();
	}
	public static void UAHtoKRW(){
		UAHtoUSD();
		USDtoKRW();
	}
	public static void UAHtoLKR(){
		UAHtoUSD();
		USDtoLKR();
	}
	public static void UAHtoSEK(){
		UAHtoUSD();
		USDtoSEK();
	}
	public static void UAHtoCHF(){
		UAHtoUSD();
		USDtoCHF();
	}
	public static void UAHtoSYP(){
		UAHtoUSD();
		USDtoSYP();
	}
	public static void UAHtoTZS(){
		UAHtoUSD();
		USDtoTZS();
	}
	public static void UAHtoTHB(){
		UAHtoUSD();
		USDtoTHB();
	}
	public static void UAHtoTRY(){
		UAHtoUSD();
		USDtoTRY();
	}
	public static void UAHtoUGX(){
		UAHtoUSD();
		USDtoUGX();
	}
	public static void UAHtoUAH(){
		UAHtoUSD();
		USDtoUAH();
	}
	public static void UAHtoAED(){
		UAHtoUSD();
		USDtoAED();
	}
	public static void UAHtoVND(){
		UAHtoUSD();
		USDtoVND();
	}
	public static void UAHtoZMW(){
		UAHtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- AED Conversions -------------------//
	public static void AEDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.27"));
	}
	public static void AEDtoEUR(){
		AEDtoUSD();
		USDtoEUR();
	}
	public static void AEDtoHKD(){
		AEDtoUSD();
		USDtoHKD();
	}
	public static void AEDtoBitcoin(){
		AEDtoUSD();
		USDtoBitcoin();
	}
	public static void AEDtoBitcoinCash(){
		AEDtoUSD();
		USDtoBitcoinCash();
	}
	public static void AEDtoJPY(){
		AEDtoUSD();
		USDtoJPY();
	}
	public static void AEDtoCNY(){
		AEDtoUSD();
		USDtoCNY();
	}
	public static void AEDtoINR(){
		AEDtoUSD();
		USDtoINR();
	}
	public static void AEDtoDZD(){
		AEDtoUSD();
		USDtoDZD();
	}
	public static void AEDtoARS(){
		AEDtoUSD();
		USDtoARS();
	}
	public static void AEDtoAUD(){
		AEDtoUSD();
		USDtoAUD();
	}
	public static void AEDtoBRL(){
		AEDtoUSD();
		USDtoBRL();
	}
	public static void AEDtoGBP(){
		AEDtoUSD();
		USDtoGBP();
	}
	public static void AEDtoBGN(){
		AEDtoUSD();
		USDtoBGN();
	}
	public static void AEDtoKHR(){
		AEDtoUSD();
		USDtoKHR();
	}
	public static void AEDtoCAD(){
		AEDtoUSD();
		USDtoCAD();
	}
	public static void AEDtoCLP(){
		AEDtoUSD();
		USDtoCLP();
	}
	public static void AEDtoCOP(){
		AEDtoUSD();
		USDtoCOP();
	}
	public static void AEDtoCRC(){
		AEDtoUSD();
		USDtoCRC();
	}
	public static void AEDtoHRK(){
		AEDtoUSD();
		USDtoHRK();
	}
	public static void AEDtoCZK(){
		AEDtoUSD();
		USDtoCZK();
	}
	public static void AEDtoDKK(){
		AEDtoUSD();
		USDtoDKK();
	}
	public static void AEDtoEGP(){
		AEDtoUSD();
		USDtoEGP();
	}
	public static void AEDtoISK(){
		AEDtoUSD();
		USDtoISK();
	}
	public static void AEDtoIDR(){
		AEDtoUSD();
		USDtoIDR();
	}
	public static void AEDtoIQD(){
		AEDtoUSD();
		USDtoIQD();
	}
	public static void AEDtoILS(){
		AEDtoUSD();
		USDtoILS();
	}
	public static void AEDtoJOD(){
		AEDtoUSD();
		USDtoJOD();
	}
	public static void AEDtoKES(){
		AEDtoUSD();
		USDtoKES();
	}
	public static void AEDtoKWD(){
		AEDtoUSD();
		USDtoKWD();
	}
	public static void AEDtoMYR(){
		AEDtoUSD();
		USDtoMYR();
	}
	public static void AEDtoMXN(){
		AEDtoUSD();
		USDtoMXN();
	}
	public static void AEDtoMAD(){
		AEDtoUSD();
		USDtoMAD();
	}
	public static void AEDtoMMK(){
		AEDtoUSD();
		USDtoMMK();
	}
	public static void AEDtoTWD(){
		AEDtoUSD();
		USDtoTWD();
	}
	public static void AEDtoNZD(){
		AEDtoUSD();
		USDtoNZD();
	}
	public static void AEDtoNOK(){
		AEDtoUSD();
		USDtoNOK();
	}
	public static void AEDtoPHP(){
		AEDtoUSD();
		USDtoPHP();
	}
	public static void AEDtoQAR(){
		AEDtoUSD();
		USDtoQAR();
	}
	public static void AEDtoRON(){
		AEDtoUSD();
		USDtoRON();
	}
	public static void AEDtoRUB(){
		AEDtoUSD();
		USDtoRUB();
	}
	public static void AEDtoSAR(){
		AEDtoUSD();
		USDtoSAR();
	}
	public static void AEDtoRSD(){
		AEDtoUSD();
		USDtoRSD();
	}
	public static void AEDtoSGD(){
		AEDtoUSD();
		USDtoSGD();
	}
	public static void AEDtoZAR(){
		AEDtoUSD();
		USDtoZAR();
	}
	public static void AEDtoKRW(){
		AEDtoUSD();
		USDtoKRW();
	}
	public static void AEDtoLKR(){
		AEDtoUSD();
		USDtoLKR();
	}
	public static void AEDtoSEK(){
		AEDtoUSD();
		USDtoSEK();
	}
	public static void AEDtoCHF(){
		AEDtoUSD();
		USDtoCHF();
	}
	public static void AEDtoSYP(){
		AEDtoUSD();
		USDtoSYP();
	}
	public static void AEDtoTZS(){
		AEDtoUSD();
		USDtoTZS();
	}
	public static void AEDtoTHB(){
		AEDtoUSD();
		USDtoTHB();
	}
	public static void AEDtoTRY(){
		AEDtoUSD();
		USDtoTRY();
	}
	public static void AEDtoUGX(){
		AEDtoUSD();
		USDtoUGX();
	}
	public static void AEDtoUAH(){
		AEDtoUSD();
		USDtoUAH();
	}
	public static void AEDtoAED(){
		AEDtoUSD();
		USDtoAED();
	}
	public static void AEDtoVND(){
		AEDtoUSD();
		USDtoVND();
	}
	public static void AEDtoZMW(){
		AEDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- VND Conversions -------------------//
	public static void VNDtoUSD(){
		unit= unit.multiply(new BigDecimal("0.000043"));
	}
	public static void VNDtoEUR(){
		VNDtoUSD();
		USDtoEUR();
	}
	public static void VNDtoHKD(){
		VNDtoUSD();
		USDtoHKD();
	}
	public static void VNDtoBitcoin(){
		VNDtoUSD();
		USDtoBitcoin();
	}
	public static void VNDtoBitcoinCash(){
		VNDtoUSD();
		USDtoBitcoinCash();
	}
	public static void VNDtoJPY(){
		VNDtoUSD();
		USDtoJPY();
	}
	public static void VNDtoCNY(){
		VNDtoUSD();
		USDtoCNY();
	}
	public static void VNDtoINR(){
		VNDtoUSD();
		USDtoINR();
	}
	public static void VNDtoDZD(){
		VNDtoUSD();
		USDtoDZD();
	}
	public static void VNDtoARS(){
		VNDtoUSD();
		USDtoARS();
	}
	public static void VNDtoAUD(){
		VNDtoUSD();
		USDtoAUD();
	}
	public static void VNDtoBRL(){
		VNDtoUSD();
		USDtoBRL();
	}
	public static void VNDtoGBP(){
		VNDtoUSD();
		USDtoGBP();
	}
	public static void VNDtoBGN(){
		VNDtoUSD();
		USDtoBGN();
	}
	public static void VNDtoKHR(){
		VNDtoUSD();
		USDtoKHR();
	}
	public static void VNDtoCAD(){
		VNDtoUSD();
		USDtoCAD();
	}
	public static void VNDtoCLP(){
		VNDtoUSD();
		USDtoCLP();
	}
	public static void VNDtoCOP(){
		VNDtoUSD();
		USDtoCOP();
	}
	public static void VNDtoCRC(){
		VNDtoUSD();
		USDtoCRC();
	}
	public static void VNDtoHRK(){
		VNDtoUSD();
		USDtoHRK();
	}
	public static void VNDtoCZK(){
		VNDtoUSD();
		USDtoCZK();
	}
	public static void VNDtoDKK(){
		VNDtoUSD();
		USDtoDKK();
	}
	public static void VNDtoEGP(){
		VNDtoUSD();
		USDtoEGP();
	}
	public static void VNDtoISK(){
		VNDtoUSD();
		USDtoISK();
	}
	public static void VNDtoIDR(){
		VNDtoUSD();
		USDtoIDR();
	}
	public static void VNDtoIQD(){
		VNDtoUSD();
		USDtoIQD();
	}
	public static void VNDtoILS(){
		VNDtoUSD();
		USDtoILS();
	}
	public static void VNDtoJOD(){
		VNDtoUSD();
		USDtoJOD();
	}
	public static void VNDtoKES(){
		VNDtoUSD();
		USDtoKES();
	}
	public static void VNDtoKWD(){
		VNDtoUSD();
		USDtoKWD();
	}
	public static void VNDtoMYR(){
		VNDtoUSD();
		USDtoMYR();
	}
	public static void VNDtoMXN(){
		VNDtoUSD();
		USDtoMXN();
	}
	public static void VNDtoMAD(){
		VNDtoUSD();
		USDtoMAD();
	}
	public static void VNDtoMMK(){
		VNDtoUSD();
		USDtoMMK();
	}
	public static void VNDtoTWD(){
		VNDtoUSD();
		USDtoTWD();
	}
	public static void VNDtoNZD(){
		VNDtoUSD();
		USDtoNZD();
	}
	public static void VNDtoNOK(){
		VNDtoUSD();
		USDtoNOK();
	}
	public static void VNDtoPHP(){
		VNDtoUSD();
		USDtoPHP();
	}
	public static void VNDtoQAR(){
		VNDtoUSD();
		USDtoQAR();
	}
	public static void VNDtoRON(){
		VNDtoUSD();
		USDtoRON();
	}
	public static void VNDtoRUB(){
		VNDtoUSD();
		USDtoRUB();
	}
	public static void VNDtoSAR(){
		VNDtoUSD();
		USDtoSAR();
	}
	public static void VNDtoRSD(){
		VNDtoUSD();
		USDtoRSD();
	}
	public static void VNDtoSGD(){
		VNDtoUSD();
		USDtoSGD();
	}
	public static void VNDtoZAR(){
		VNDtoUSD();
		USDtoZAR();
	}
	public static void VNDtoKRW(){
		VNDtoUSD();
		USDtoKRW();
	}
	public static void VNDtoLKR(){
		VNDtoUSD();
		USDtoLKR();
	}
	public static void VNDtoSEK(){
		VNDtoUSD();
		USDtoSEK();
	}
	public static void VNDtoCHF(){
		VNDtoUSD();
		USDtoCHF();
	}
	public static void VNDtoSYP(){
		VNDtoUSD();
		USDtoSYP();
	}
	public static void VNDtoTZS(){
		VNDtoUSD();
		USDtoTZS();
	}
	public static void VNDtoTHB(){
		VNDtoUSD();
		USDtoTHB();
	}
	public static void VNDtoTRY(){
		VNDtoUSD();
		USDtoTRY();
	}
	public static void VNDtoUGX(){
		VNDtoUSD();
		USDtoUGX();
	}
	public static void VNDtoUAH(){
		VNDtoUSD();
		USDtoUAH();
	}
	public static void VNDtoAED(){
		VNDtoUSD();
		USDtoAED();
	}
	public static void VNDtoVND(){
		VNDtoUSD();
		USDtoVND();
	}
	public static void VNDtoZMW(){
		VNDtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````
	//----------------- ZMW Conversions -------------------//
	public static void ZMWtoUSD(){
		unit= unit.multiply(new BigDecimal("0.085"));
	}
	public static void ZMWtoEUR(){
		ZMWtoUSD();
		USDtoEUR();
	}
	public static void ZMWtoHKD(){
		ZMWtoUSD();
		USDtoHKD();
	}
	public static void ZMWtoBitcoin(){
		ZMWtoUSD();
		USDtoBitcoin();
	}
	public static void ZMWtoBitcoinCash(){
		ZMWtoUSD();
		USDtoBitcoinCash();
	}
	public static void ZMWtoJPY(){
		ZMWtoUSD();
		USDtoJPY();
	}
	public static void ZMWtoCNY(){
		ZMWtoUSD();
		USDtoCNY();
	}
	public static void ZMWtoINR(){
		ZMWtoUSD();
		USDtoINR();
	}
	public static void ZMWtoDZD(){
		ZMWtoUSD();
		USDtoDZD();
	}
	public static void ZMWtoARS(){
		ZMWtoUSD();
		USDtoARS();
	}
	public static void ZMWtoAUD(){
		ZMWtoUSD();
		USDtoAUD();
	}
	public static void ZMWtoBRL(){
		ZMWtoUSD();
		USDtoBRL();
	}
	public static void ZMWtoGBP(){
		ZMWtoUSD();
		USDtoGBP();
	}
	public static void ZMWtoBGN(){
		ZMWtoUSD();
		USDtoBGN();
	}
	public static void ZMWtoKHR(){
		ZMWtoUSD();
		USDtoKHR();
	}
	public static void ZMWtoCAD(){
		ZMWtoUSD();
		USDtoCAD();
	}
	public static void ZMWtoCLP(){
		ZMWtoUSD();
		USDtoCLP();
	}
	public static void ZMWtoCOP(){
		ZMWtoUSD();
		USDtoCOP();
	}
	public static void ZMWtoCRC(){
		ZMWtoUSD();
		USDtoCRC();
	}
	public static void ZMWtoHRK(){
		ZMWtoUSD();
		USDtoHRK();
	}
	public static void ZMWtoCZK(){
		ZMWtoUSD();
		USDtoCZK();
	}
	public static void ZMWtoDKK(){
		ZMWtoUSD();
		USDtoDKK();
	}
	public static void ZMWtoEGP(){
		ZMWtoUSD();
		USDtoEGP();
	}
	public static void ZMWtoISK(){
		ZMWtoUSD();
		USDtoISK();
	}
	public static void ZMWtoIDR(){
		ZMWtoUSD();
		USDtoIDR();
	}
	public static void ZMWtoIQD(){
		ZMWtoUSD();
		USDtoIQD();
	}
	public static void ZMWtoILS(){
		ZMWtoUSD();
		USDtoILS();
	}
	public static void ZMWtoJOD(){
		ZMWtoUSD();
		USDtoJOD();
	}
	public static void ZMWtoKES(){
		ZMWtoUSD();
		USDtoKES();
	}
	public static void ZMWtoKWD(){
		ZMWtoUSD();
		USDtoKWD();
	}
	public static void ZMWtoMYR(){
		ZMWtoUSD();
		USDtoMYR();
	}
	public static void ZMWtoMXN(){
		ZMWtoUSD();
		USDtoMXN();
	}
	public static void ZMWtoMAD(){
		ZMWtoUSD();
		USDtoMAD();
	}
	public static void ZMWtoMMK(){
		ZMWtoUSD();
		USDtoMMK();
	}
	public static void ZMWtoTWD(){
		ZMWtoUSD();
		USDtoTWD();
	}
	public static void ZMWtoNZD(){
		ZMWtoUSD();
		USDtoNZD();
	}
	public static void ZMWtoNOK(){
		ZMWtoUSD();
		USDtoNOK();
	}
	public static void ZMWtoPHP(){
		ZMWtoUSD();
		USDtoPHP();
	}
	public static void ZMWtoQAR(){
		ZMWtoUSD();
		USDtoQAR();
	}
	public static void ZMWtoRON(){
		ZMWtoUSD();
		USDtoRON();
	}
	public static void ZMWtoRUB(){
		ZMWtoUSD();
		USDtoRUB();
	}
	public static void ZMWtoSAR(){
		ZMWtoUSD();
		USDtoSAR();
	}
	public static void ZMWtoRSD(){
		ZMWtoUSD();
		USDtoRSD();
	}
	public static void ZMWtoSGD(){
		ZMWtoUSD();
		USDtoSGD();
	}
	public static void ZMWtoZAR(){
		ZMWtoUSD();
		USDtoZAR();
	}
	public static void ZMWtoKRW(){
		ZMWtoUSD();
		USDtoKRW();
	}
	public static void ZMWtoLKR(){
		ZMWtoUSD();
		USDtoLKR();
	}
	public static void ZMWtoSEK(){
		ZMWtoUSD();
		USDtoSEK();
	}
	public static void ZMWtoCHF(){
		ZMWtoUSD();
		USDtoCHF();
	}
	public static void ZMWtoSYP(){
		ZMWtoUSD();
		USDtoSYP();
	}
	public static void ZMWtoTZS(){
		ZMWtoUSD();
		USDtoTZS();
	}
	public static void ZMWtoTHB(){
		ZMWtoUSD();
		USDtoTHB();
	}
	public static void ZMWtoTRY(){
		ZMWtoUSD();
		USDtoTRY();
	}
	public static void ZMWtoUGX(){
		ZMWtoUSD();
		USDtoUGX();
	}
	public static void ZMWtoUAH(){
		ZMWtoUSD();
		USDtoUAH();
	}
	public static void ZMWtoAED(){
		ZMWtoUSD();
		USDtoAED();
	}
	public static void ZMWtoVND(){
		ZMWtoUSD();
		USDtoVND();
	}
	public static void ZMWtoZMW(){
		ZMWtoUSD();
		USDtoZMW();
	}
	//`````````````````````````````````````````````````````````````

	public static void main(String arg[]){
		while(true){
			options();
			choiceFilling();
		}
	}
}