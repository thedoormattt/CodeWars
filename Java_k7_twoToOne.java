// Code for: https://www.codewars.com/kata/5656b6906de340bd1b0000ac

import java.util.TreeSet;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String completeInput = s1+s2;
        TreeSet<String> ts = new TreeSet<String>();
        
        for (int i = 0; i<completeInput.length(); i++) {
          ts.add(Character.toString(completeInput.charAt(i)));
        }
        
        String setString = ts.toString();
        String firstFormat = setString.replaceAll(", ", "");
        String output = firstFormat.replace("[", "").replace("]", "");
        
        return output;
    }
}
