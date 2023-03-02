package Lab;

public class Main { //main class
		public static void main(String[] args) {  //main method
		Library obj = new Library(); //create object
		obj.setBookId(4563);  //setting value in bookId
		obj.setBookName("Head First Java"); //setting value in BookName
		obj.setBookAuthor("Kathy Sierra"); ////setting value in AuthorName
		//print the line
		System.out.println("The Book Name is :"+obj.getBookName()); //getting the value of BookName
		System.out.println("The Book Id is :"+obj.getBookId()); //getting the value of BookId
		System.out.println("The Book Author Name is :"+obj.getBookAuthor()); //getting the value of AuthorName
		 obj.addBook();
		    obj.Java_For_Dummies();
	}}
 
   