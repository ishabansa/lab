package Lab;
class Teacher{  //base class
	String designation;       //data members
	String collegeProperties;
	void work() {  //method
		
	}
}
class ITteacher extends Teacher{  //sub class for Teacher & base class for Mathteacher and Softskill
	String collegeName;
	
}
class Mathteacher extends ITteacher{  //sub class
	void show() {  //method
		System.out.println(designation="Btech");
	}
}
class Softskill extends ITteacher{  //sub class
	void display() {  //method
		System.out.println(collegeName="MIT");
	}
}
public class Question {  //main class

	public static void main(String[] args) {  // main method
	Softskill soft=new Softskill(); //object
	soft.display();
	Mathteacher math=new Mathteacher(); //object
	math.show();
	}

}
