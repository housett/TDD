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
	return null;
	}
	public static String text2num(String input) {
		return null;
	}
}