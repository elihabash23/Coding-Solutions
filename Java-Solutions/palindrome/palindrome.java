/*
 * Given a string, write a function to check if it is a permutation of a
 * palindrome. A palindrome is a word or phrase that is the same forwards and
 * backwards. A permutation is a rearrangment of letters. The palindrome does
 * not need to be limited to just dictionary words.
 */

 public class palindrome {

    public static boolean checkIfPalindrome(String str) {

        if (!str.equals(null) && str.length() > 0) {
        
            for (int i = 0; i < str.length() / 2; i++) {
                if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - 1 - i))) 
                    return false;
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String [] tests = {"Elias", "Ball", "Radar", "radar", "baloon", "Rats live on no evil star", "hhhhh", "h", "hi", "hhhh", ""};
        for (String test: tests) {
            System.out.println( test + " is " + checkIfPalindrome(test));
        }
    }
 }