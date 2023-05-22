/**
 *This class is used to create an object that can return the total of a Fibonacci Sequence based on the nth term used in the method "Fibonacci"
 * 
 * @author Adamb
 * @version 1.2
 * @since 05-21-2023
*/

public class FibonacciRecursive {

        /**This method is used to get the total of the Fibonacci sequence based on the parameter of the nth term.
	 * 
         * @param int Takes in the nth term in the Fibonacci sequence. 
	 * @return This returns a int, the total of all numbers added together at the nth term in the sequence.
	 */
        public int Fibonacci(int n) {

            if (n==0)
            {
                return 0;
            }
            else if (n == 1)
            {
                return 1;
            }
            else
            {
                return Fibonacci(n-1) + Fibonacci(n-2);
            }
        }
    }



