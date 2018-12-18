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
