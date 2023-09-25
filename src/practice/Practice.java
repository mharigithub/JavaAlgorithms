package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.function("abcd");
    }
    public void function(String str) {
        char[] a = str.toCharArray();
        System.out.println(a);
        char temp;
        for(int i =0;i<str.length()/2;i++){
            for(int j=str.length()-1;j>=str.length()/2;j--){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.println(a);
    }
}