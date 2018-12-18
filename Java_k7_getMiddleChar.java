//Code for: https://www.codewars.com/kata/56747fd5cb988479af000028

class Kata {
  public static String getMiddle(String word) {
    int wordLength = word.length();
    String output = "";
    
    if(wordLength%2 == 0) {
      output = Character.toString(word.charAt((wordLength/2)-1));
      output = 
        output.concat(Character.toString(word.charAt(wordLength/2)));
   }
   if(wordLength%2 != 0) {
      output = Character.toString(word.charAt((wordLength-1)/2));
   }
   
   return output;
  }
}
