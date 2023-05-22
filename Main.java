
	/**
     *  This is the main class of the program. This class holds void main method to run the program.
     *
	 * @author Adamb
	 * @version 1.2
	 * @since 05-21-2023
	 */
public class Main {
    
    /**
     * This is the main method method that creates the object and displays the descriptive text.
     *
	 * @param args An array of command arguments for the method.
	 * @return void This method does not return anything.
	 */
    public static void main(String[] args)
    {
        FibonacciRecursive Fibon = new FibonacciRecursive();
        int NumberOfFibon = 10;
        String ProperEnd = "th";

        System.out.println("The " + NumberOfFibon + ProperEnd + " term of the Fibonacci sequence is "
                + Fibon.Fibonacci(10) + ".");
    }
}
