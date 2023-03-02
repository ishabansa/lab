//Q.1 Program too create library book Management system to store and display book details in library  where you can create two 
//classes one is main another one is library, where you can create two methods as addBook,dispanseBook and bookId,bookName,bookAuthor
//as instance variables.
package Lab;

public class Library { //create library class
		//create instance variables
		private int bookId; //instance variable
		private String bookName,bookAuthor; //instance variable
		void addBook() {  //method1
			System.out.println("Add new book here :"+bookName);
		}
		void Java_For_Dummies() {  //method1
			System.out.println("Java For Dummies");
		}
		// use getters setters method
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}}
	