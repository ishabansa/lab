//create a student class to take different types constructor to set different properties(values)
package Lab;

public class Student{
	Student(){  //default constructor
		//this will display default constructor value
		System.out.println("default");
	}
	int sum;
	Student(int a,int b){  //parameterized constructor
		sum=a+b;
	}
	void show() {
		System.out.println("sum: "+sum);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		Student obj1=new Student(40,50);  //here we are taking values of a and b
		obj1.show();  //this will display parameterised constructor value
	}
	}
