//Q.1 A Java program to find all pairs of elements in an array whose sum is equal to a specified number

package Lab;

public class Find_All_Pairs { //main class
	 public static void  main(String[] args){ //main method
		 int a[]= {1,2,3,4,5};
	      int b=5;
	      for(int i=0;i<=4;i++) {
	    	  for(int j=0;j<=4;j++) {
	    		  
	    	  if(b==a[i]+a[j]) {
	    		 System.out.print(a[i]+" "+a[j]); 
	    	  }
	    	  }
	    	  System.out.println(" ");
	      }}}
		