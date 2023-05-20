public class Main {
    public static void main(String[] args)
    {
        FibonacciRecursive Fibon = new FibonacciRecursive();
        int NumberOfFibon = 10;
        String ProperEnd = "th";

        System.out.println("The " + NumberOfFibon + ProperEnd + " term of the Fibonacci sequence is "
                + Fibon.Fibonacci(10) + ".");
    }
}