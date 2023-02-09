//write a java method to find the smallest number among three numbers.
package Lab;
import java.util.*;
public class SmallestThreeNo {
	public static void main(String[] args) {
		//three no taking input from scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");  //first no
		int a=sc.nextInt();
		System.out.println("Enter Second Number");  //second no
		int b=sc.nextInt();
		System.out.println("Enter Third Number");   //third no
		int c=sc.nextInt();
		//find the smallest no osing ifelse ladder
		if(a<b && a<c) {
			System.out.println("A is smaller than B & C : "+a);
		}
		else if(b<a && b<c) {
			System.out.println("B is smaller than A & C : "+b);
		}
		else {
			System.out.println("C is smaller than A & B : "+c);
		}
	}
}