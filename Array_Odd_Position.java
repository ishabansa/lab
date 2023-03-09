//Q.3   we need to print the elements of the array which are present in odd positions. This can be accomplished by looping through the
//array and printing the elements of an array by incrementing i by 2 till the end of the array is reached.
package Lab;

public class Array_Odd_Position {  //main class
           public static void main(String[] args) { //main method
	int arr[]= {1,2,3,4,5};
	for(int i=0;i<arr.length;i+=2) { //loop for the array incrementing value of i by 2
		System.out.print(arr[i]+" "); //print the odd position number
	}}}
