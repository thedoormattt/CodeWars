// Code for: https://www.codewars.com/kata/55685cd7ad70877c23000102

public class Kata {

  public static int makeNegative(final int x) {
    int xConv = x*2;
    int output = x;
    
    if ( x > 0 ) {
    output = x-xConv;
    }      
    return output;
  }
  
}
