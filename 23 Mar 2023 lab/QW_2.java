//Q.2 Take two numbers x and y. Throw the exception if the two numbers are negative else print the
//Product of x and y.
//Input Format
//The only line of input consists of two integers, x and y.
//Constraints   -----      -20<= x, y <=20
//Output Format
//Print the product if both are positive else print the output as below:
//java.lang.Exception: x and y should not be zero.
package Lab;
import java.util.Scanner;
public class QW_2 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the value of a");
		        int a = sc.nextInt();
		        System.out.println("enter the value of b");
		        int b = sc.nextInt();

		        try {
		            if ( a < 0 || b < 0) {
		                throw new Exception("x and y should not be negative");
		            } else if (a == 0 || b == 0) {
		                throw new Exception("x and y should not be zero");
		            } else {
		                System.out.println(a * b);
		            }
		        } catch (Exception e) {
		            System.out.println(e);
		        }
		    }
		}
