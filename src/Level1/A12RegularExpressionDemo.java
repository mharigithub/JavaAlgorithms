package Level1;

public class A12RegularExpressionDemo {
    public static void main(String[] args) {
        String s = "%$#ab^$c%";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
