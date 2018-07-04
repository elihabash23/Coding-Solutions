// Implement an algorithm to check if two strings are permutations of each other.

public class permutations {
  public static boolean permutation(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;

    int[] letters = new int[128]; // ASCII key
    for (int i = 0; i < s1.length(); i++) {
      letters[s1.charAt(i)]++;
    }

    for (int i = 0; i < s2.length(); i++) {
      letters[s2.charAt(i)]--;

      if (letters[s2.charAt(i)] < 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String[] pairs = { "smith", "htims" };
    System.out.println(pairs[0] + " and " + pairs[1] + " are " + permutation(pairs[0], pairs[1]));

    String[] pairs2 = { "football", "basketball" };
    System.out.println(pairs2[0] + " and " + pairs2[1] + " are " + permutation(pairs2[0], pairs2[1]));

    String[] pairs3 = { "elias", "chris" };
    System.out.println(pairs3[0] + " and " + pairs3[1] + " are " + permutation(pairs3[0], pairs3[1]));
  }
}
