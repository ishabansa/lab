//write a java program that takes 5 no as input to calculate and print the average of the no
package Avgjava;

import java.util.Scanner;

public class Averagejava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number :");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number :");
		int num3 = sc.nextInt();
		System.out.print("Enter the forth number :");
		int num4 = sc.nextInt();
		System.out.print("Enter the fifth number :");
		int num5 = sc.nextInt();
		System.out.println("Average of given 5 number is :"+"\t"+(num1+num2+num3+num4+num5)/5);
	}

}
