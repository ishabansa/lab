//Q.3 write a java program to print sum of odd numbers upto N?
package Lab;
import java.util.Scanner;
public class Sum_Of_Odd_No { //Main Class
	public static void main(String[] args) {  //main method
		// create a scanner class
		Scanner sc=new Scanner(System.in);  //for taking value from user
		System.out.println("Enter any Number : ");  //entering the no
		int sum=0; //use instance variable
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) { //use for loop
			if(i%2!=0){
			sum=sum+i;
			}} 
		//now print the output
			System.out.println("The Sum of odd Number is :"+sum);  
	}}   
	

