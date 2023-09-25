package practice;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Practice2 practice2 = new Practice2();
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        practice2.function("Java is is is a",c);
    }

    public void function(String input, char c) {
        char[] chars = input.toCharArray();  //Split the word from String
        int count = 1;              //Variable for getting Repeated word count
        for (int i = 0; i < chars.length; i++)    //Outer loop for Comparison
        {
            for (int j = i + 1; j < chars.length; j++)  //Inner loop for Comparison
            {
                if (chars[i] == chars[j])  //Checking if both strings are equal
                {
                    count = count + 1;        //if equal increment the count
                    chars[j] = '0';      //Replace repeated words by zero
                }
            }
            if (chars[i] != '0' && count > 1 && chars[i]==c)
                System.out.println(chars[i] + "--" + count);  //Printing the word along with count
            count = 1;
        }
    }
}