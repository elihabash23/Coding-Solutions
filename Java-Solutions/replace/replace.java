// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
// in the end to hold the additional characters, and that you are given the "true" length of the string. Use a 
// character array if implementing in java to perform the operation in place. 

public class replace {

    public static void urlify(char[] str, int trueLength) {
        
        int spaceCount = 0;
        int index;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }

        index = trueLength + spaceCount * 2;
        System.out.println(index);

        if (trueLength < str.length)
            str[trueLength] = '\0';

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

    }
    public static void main(String[] args) {

        String name = "Mr John Smith    ";
        char[] str = name.toCharArray();
        urlify(str, 13);
        System.out.println(str);
        System.out.println(str.length);
    }

}