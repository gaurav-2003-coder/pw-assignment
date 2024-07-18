package Strings_.AssignmentQuestion1;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char ch = 'o';

        String newStr = removeCharacter(str, ch);

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + newStr);
    }

    public static String removeCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }
}
