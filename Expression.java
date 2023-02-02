//write a java program to compute the specified expressions and print the output : (25.5*3.5-3.5*3.5)/(40.5-4.5)
package Lab;

public class Expression {
	public static void main(String[] args) {
		double a=25.5,b=3.5,c=40.5,d=4.5,exp;
		exp=(a*b-b*b)/(c-d);
		System.out.println("The expression is :"+exp);
		
	}

}

