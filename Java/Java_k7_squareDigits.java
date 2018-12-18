// Code for: https://www.codewars.com/kata/546e2562b03326a88e000020

public class SquareDigit {

  public int squareDigits(int n) {
    String inputString = Integer.toString(n);
		char[] digitArray = inputString.toCharArray();
		
		String output = "";
		
		for (char digit : digitArray) {
			int val = Character.getNumericValue(digit);
			val = val*val;
			output += Integer.toString(val);
		}
    int intOutput = Integer.parseInt(output);
    
    return intOutput;
  }

}
