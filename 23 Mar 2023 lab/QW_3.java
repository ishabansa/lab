//Q.3  Write a method called addTwoPositive that takes two int
//parameters, and if either value is not positive, throw an
//ArithmeticException, passing the string "Non-positive
//integer sent". to the constructor of the exception.if the
//values are both positive, then return the sum of them.
//Under what curcumstances will the finally code block be
//executed in a try/catch/finally segments.
package Lab;
import java.util.Scanner;
public class QW_3 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the value of a ");
		        int a = sc.nextInt();
		        System.out.println("enter the value of b");
		        int b = sc.nextInt();

		        try {
		            int add = addTwoPositive(a, b);
		            System.out.println("The sum of " + a + " and " + b + " is " + add);
		        } catch (ArithmeticException e) {
		            System.out.println(e);
		        }
		    }

		    public static int addTwoPositive(int a, int b) {
		        if (a <= 0 || b <= 0) {
		            throw new ArithmeticException("Non-positive integer sent");
		        }
		        return a + b;
		    }
		}
