// Code for: https://www.codewars.com/kata/52fba66badcd10859f00097e

public class Troll {
    public static String disemvowel(String str) {
        String output = str.replaceAll("[aeiouAEIOU]", "");
        return output;
    }
}
