//Q.1  Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors.
//The catch block contains the code that says what to do if exception occurs.
//This problem will test your knowledge on try-catch block.
//You will be given two integers x and y as input; you have to compute x/y. If x and y are not 32bit signed integers
//or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what
//to report in case of exceptions.
package Lab;
import java.util.InputMismatchException;
import java.util.Scanner;
public class QW_1 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        try {
		        	System.out.println("enter the value of x");
		            int a = sc.nextInt();
		            System.out.println("enter the value of x");
		            int b = sc.nextInt();
		            int div = a / b;
		            System.out.println(div);
		        }  catch (ArithmeticException e) {
		            System.out.println("java.lang.ArithmeticException: " );
		        } 
		        catch (InputMismatchException e) {
		            System.out.println("java.util.InputMismatchException");
		        }
		    }
		}
