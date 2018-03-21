// Implement an algorithm to check if two strings are permutations of each other

public class permutations {
  public static boolean checkIfPermutation(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;

    for (int i=0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) {
        return false;
      }
    }

    return true;
  }

  public static void main (String[] args) {
    String[] pairs = {"football", "basketball"};
    if (checkIfPermutation(pairs[0], pairs[1])) {
      System.out.println(pairs[0] + " and " + pairs[1] + " are permutations of each other");
    } else {
      System.out.println(pairs[0] + " and " + pairs[1] + " are not permutations of each other");
    }

    String[] pairs2 = {"smith", "htims"};
    if (checkIfPermutation(pairs2[0], pairs2[1])) {
      System.out.println(pairs2[0] + " and " + pairs2[1] + " are permutations of each other");
    } else {
      System.out.println(pairs2[0] + " and " + pairs2[1] + " are not permutations of each other");
    }
  }
}
