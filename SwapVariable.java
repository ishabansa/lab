//swapping two variables refers to mutually exchanging the values of the cvariables.Generally,this is done with the data in memory.
//the simplest method to swap 2 variables is to use a 3 temporary variable:

package Lab;

public class SwapVariable {
	public static void main(String[] args) {
		int a=5,b=6,temp;   //declare the local variable
		System.out.println("Before swapping value of a is :"+a);
		System.out.println("Before swapping value of b is :"+b);
		//logic of swapping using temp variable
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping value of a is :"+a);
		System.out.println("After swapping value of b is :"+b);
	}

}
