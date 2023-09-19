package Level1;

import java.util.Scanner;

public class AcceptInputFromKeyboardUsingScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter input");
        String s1 = s.nextLine();
        System.out.println("output: " + s1);
    }
}
