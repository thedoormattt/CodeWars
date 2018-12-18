// Code for: https://www.codewars.com/kata/56541980fa08ab47a0000040

public class Printer {
    
    public static String printerError(String s) {
        int den = s.length();
        
        int num = 0;
        for (int i=0;i<den;i++) {
          char c = s.charAt(i);
          if (!Character.toString(c).matches("[a-m]")) {
            num++;
          }
        }
        
        String output = num+"/"+den;        
        return output;
    }
}
