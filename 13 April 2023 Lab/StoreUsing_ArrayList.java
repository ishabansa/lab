//Problem Statement 1:
//1.     Develop a java class with a method storeOddNumbers(int N) using ArrayList to store Odd numbers from 2 to N, 
//where N is a integer which is passed as a parameter to the method storeOddNumbers(). 
// The method should return the ArrayList (A1) created.
//2.     In the same class create a method printOddNumbers()which iterates through the arrayList A1 in step 1,  
//and It should multiply each number with 5 and display it in format 5,15,25….5*N. and add these numbers in a new ArrayList (A2). 
//The new ArrayList (A2) created needs to be returned.
//3.     Create a method retrieveOddNumber(int N)  parameter is a number N. This method should search the arrayList
//(A1) for the existence of the number ‘N’ passed.  If exists it should return the Number else return zero.
//Hint:  Use instance variable for storing the ArrayList A1 and A2.
//NOTE: You can test the methods using a main method.
package Lab;
import java.util.*;

public class StoreUsing_ArrayList {
		ArrayList<Integer> A1= new ArrayList<Integer>();//create object of arraylist
		//create a method
		public ArrayList<Integer> storeOddNumbers(int N) {
			A1= new ArrayList<Integer>();
			for (int i=2;i<=N;i++) {
				if (i%2!=0) { 
					A1.add(i);
				}
				}
			return A1;
			}
		//create a method
		public ArrayList<Integer> printOddNumbers() {
			ArrayList<Integer> A2 = new ArrayList<Integer>();
			System.out.println("The Odd Numbers are: ");
			for (int num:A1) {
				System.out.print(num+" ");
				A2.add(num*5);
				}
			System.out.println();
			System.out.println("After multiply by 5: ");
			for(int num1:A2) {
				System.out.print(num1+" ");
			}
			System.out.println();
			return A2;
			}
		//retrieving method
		public int retrieveOddNumber(int N) {
			if(A1.contains(N)) {
				return N;
			}
			return 0;
		}
		public static void main(String[] args) {//main method
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			int a=sc.nextInt();
			StoreUsing_ArrayList sea = new StoreUsing_ArrayList();//creating object 
			sea.storeOddNumbers(a);//call the method
			sea.printOddNumbers(); //call the method
			System.out.println("Retrieve Number is: "+sea.retrieveOddNumber(7));//retrieve the number
			}
		}

