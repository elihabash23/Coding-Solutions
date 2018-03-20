// Implement an algorithm to determine if  a string as all unique characters

public class unique_chars{
  public static boolean checkIfUnique(String s) {
    if (s.length() > 128)
      return false;

      boolean[] set = new boolean[128];
      for(int i=0; i<s.length(); i++) {
        int value = s.charAt(i);
        if(set[value]) {
          return false;
        } else {
          set[value] = true;
        }
      }
      return true;
  }

  public static void main (String[] args) {
    String[] words = {"hello", "world", "basketball"};
    for (int i=0; i<words.length; i++) {
      if (checkIfUnique(words[i]))
        System.out.println(words[i] + " is unique");
      else
        System.out.println(words[i] + " is NOT unique");
    }
  }


}
