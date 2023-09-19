package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        String s = "indiaindiaaa";
        char[] c = s.toCharArray();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j]) {
                    count = count + 1;
                }
            }
            if(count>1){
                System.out.println(c[i]+" "+count);
            }
            count=1;
        }
    }
}