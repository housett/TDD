package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
    
    static Map<String,String> liste = new HashMap<String,String> ();
    
    static {
        liste.put("0", "zéro");
        liste.put("1", "un");
        liste.put("2", "deux");
        liste.put("3", "trois");
        liste.put("4", "quatre");
        liste.put("5", "cinq");
        liste.put("6", "six");
        liste.put("7", "sept");
        liste.put("8", "huit");
        liste.put("9", "neuf");
        liste.put("10", "dix");
        liste.put("11", "onze");
        liste.put("12", "douze");
        liste.put("13", "treize");
        liste.put("14", "quatorze");
        liste.put("15", "quinze");
        liste.put("16", "seize");
        liste.put("20", "vingt");
        liste.put("30", "trente");
        liste.put("40", "quarante");
        liste.put("50", "cinquante");
        liste.put("60", "soixante");
        liste.put("70", "soixante dix");
        liste.put("80", "quatre vingt");
        liste.put("90", "quatre vingt dix");
        liste.put("100", "cent");
        liste.put("200", "deux cents");
        liste.put("300", "trois cents");
        liste.put("400", "quatre cents");
        liste.put("500", "cinq cents");
        liste.put("600", "six cents");
        liste.put("700", "sept cents");
        liste.put("800", "huit cents");
        liste.put("900", "neuf cents");
        
    }
    
    public static String num2text(String input) {
    	String ret="";
    	String temp=input;
        if (liste.get(input) != null) {
            return liste.get(input);
        }
        if(temp.length()==3){
            	ret+=temp.charAt(0)+" cent ";
            	temp=temp.substring(1);
        }
        if(temp.length()==2){
        	if(temp.substring(0,1).equals("0")){
        		return ret + liste.get(temp.substring(1,2));
        	}
        	if (temp.substring(1,2).equals("1")) {
            	ret+=liste.get(temp.substring(0,1)+"0") +" et un";
            	return  ret;
            } else {
            	ret += liste.get(temp.substring(0,1)+"0") + " " + liste.get(input.substring(1,2));
            	return  ret;
            }
        }
        return null;
    	}
    
    public static String text2num(String input) {
        return null;
    }
}