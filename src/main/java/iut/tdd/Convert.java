package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		if (input.equals("0")){return "zéro";}
		if (input.equals("1")){return "un";}
		if (input.equals("2")){return "deux";}
		if (input.equals("3")){return "trois";}
		if (input.equals("4")){return "quatre";}
		if (input.equals("5")){return "cinq";}
		if (input.equals("6")){return "six";}
		if (input.equals("7")){return "sept";}
		if (input.equals("8")){return "huit";}
		if (input.equals("9")){return "neuf";}
		if (input.equals("10")){return "dix";}
		if (input.equals("11")){return "onze";}
		if (input.equals("12")){return "douze";}
		if (input.equals("13")){return "treize";}
		if (input.equals("14")){return "quatorze";}
		if (input.equals("15")){return "quinze";}
		if (input.equals("16")){return "seize";}
		if (input.equals("20")){return "vingt";}
		if (input.equals("30")){return "trente";}
		if (input.equals("40")){return "quarante";}
		if (input.equals("50")){return "cinquante";}
		if (input.equals("60")){return "soixante";}
		if (input.equals("70")){return "soixante dix";}
		if (input.equals("80")){return "quantre vingt";}
		if (input.equals("90")){return "quatre vingt dix";}
		if(input.substring(0,1).equalsIgnoreCase("1")){return "dix"+num2textBis(input.substring(1,2));}
		if(input.substring(0,1).equalsIgnoreCase("2")){return "vingt"+num2textBis(input.substring(1,2));}
		if(input.substring(0,1).equalsIgnoreCase("3")){return "trente"+num2textBis(input.substring(1,2));}
		if(input.substring(0,1).equalsIgnoreCase("4")){return "quarante"+num2textBis(input.substring(1,2));}
		if(input.substring(0,1).equalsIgnoreCase("5")){return "cinquante"+num2textBis(input.substring(1,2));}
		if(input.substring(0,1).equalsIgnoreCase("6")){return "soixante"+num2textBis(input.substring(1,2));}
		return "";
	}
	public static String text2num(String input) {
		return null;
	}
	
	/*
	 * pour les 2èmes chiffres des nombres à deux chiffres
	 */
	public static String num2textBis(String input){
		if (input.equals("1")){return " et un";}
		if (input.equals("2")){return "-deux";}
		if (input.equals("3")){return "-trois";}
		if (input.equals("4")){return "-quatre";}
		if (input.equals("5")){return "-cinq";}
		if (input.equals("6")){return "-six";}
		if (input.equals("7")){return "-sept";}
		if (input.equals("8")){return "-huit";}
		if (input.equals("9")){return "-neuf";}
		return "";
	}
}