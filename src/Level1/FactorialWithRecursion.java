package Level1;

public class FactorialWithRecursion {

    public static void main(String args[]) {
        FactorialWithRecursion factorialWithRecursion = new FactorialWithRecursion();
        System.out.println(factorialWithRecursion.fact(5));
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
