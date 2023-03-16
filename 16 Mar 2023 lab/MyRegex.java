package String;
import java.util.regex.*;
import java.util.Scanner;
public class MyRegex { //main class
	String pattern;
	public MyRegex() {
		pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	}
	 public static void main(String[] args) { //main method
		 MyRegex regex = new MyRegex();
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the ip Address:-");
		    while(sc.hasNext()) {
		    	String ip = sc.next();
		    	System.out.println(ip.matches(regex.pattern));
		    }
		    }
		    }
		  