//2. Write a Java program to read contents from a file into byte array.
package Lab;
import java.io.*;
public class IO_QW_2 { //main class
	public static void main(String[] args)  { //main method
		byte arr[]= {45,67,23,65,77,67,98,46,79,90};  //byte array--only
		//byte array is used to read the number
		ByteArrayInputStream bin=new ByteArrayInputStream(arr);
		int i;
		while((i=bin.read())!=-1) {   //to print the whole value
			char ch=(char)i;  //converting into character
			System.out.println("ASCII character "+i+"value is"+ch);
		}
	}
}
