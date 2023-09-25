package Level1;

public class A4FactorialWithRecursion {

    public static void main(String args[]) {
        A4FactorialWithRecursion a4FactorialWithRecursion = new A4FactorialWithRecursion();
        System.out.println(a4FactorialWithRecursion.fact(5));
    }

    public int fact(int x) {
        if (x != 0)
            return x * fact(x - 1);
        //3*fact(2)
        //3*2*fact(1)
        //3*2*1*fact(0)
        //3*2*1*1=6
        else
            return 1;
    }
}
