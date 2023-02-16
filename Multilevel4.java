// Class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. 
//(Which type Of Inheritance explain with an example)
package Lab;
class A{ //parent class
	void a() { //parent class user defined method
		System.out.println("show the salary");
	}
}
class B extends A{
void b() {  //child class user defined method
		System.out.println("display the name");
	}
}
class C extends B{  //child class
	void c() {  //child class user defined method
		System.out.println("print the output");
	}
}
public class Multilevel4{
//main class
	public static void main(String[] args) {
		C c = new C();  //create a object of child class
		c.b();
		c.a();
		c.c();
		}
}