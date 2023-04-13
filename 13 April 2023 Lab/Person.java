//Problem Statement 2:
//Create a Person class and create an array list to add 10 person objects and print them using a for each loop
package Lab;
import java.util.*;
public class Person {
		public static void main(String[] args) {
			ArrayList<String> al=new ArrayList<String>();
			//add element in arraylist
			al.add("Isha");
			al.add("Yashi");
			al.add("Dhruv");
			al.add("Priyanshu");
			al.add("Avni");
			al.add("Keshav");
			al.add("Vidhan");
			al.add("Stuti");
			al.add("Milky");
			al.add("Shreya");
			// using for each loop
			System.out.println("The Name of Persons are: ");
			for(String s:al) {
				System.out.println(s);
			}
		}
	}

