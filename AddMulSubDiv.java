//writw a java program to print the sum,mul,sub,divide and remainder of 2 no
package Avgjava;
import java.util.Scanner;
public class AddMulSubDiv {
	public static void main(String[] args) {
		Scanner sum=new Scanner(System.in);
		System.out.print("Enter first number :"); Integer A=sum.nextInt();
		System.out.print("Enter second number :"); Integer B=sum.nextInt();
		System.out.println(A + "+" + B + " = " + (A+B)); 
		System.out.println(A + "-" + B + " = " + (A-B)); 
		System.out.println(A + "*" + B + " = " + (A*B)); 
		System.out.println(A + "/" + B + " = " + (A/B)); 
		System.out.println(A + "%" + B + " = " + (A%B)); 	}

}
