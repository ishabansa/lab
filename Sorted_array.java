//QW=2 Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
package Lab;

public class Sorted_array { //class1
public static void main(String[] args) {//main method
//array declaration and initialization
		int arr1[] ={9,2};
		int arr2[] ={3,9,2,10,6};
		int arr3[] ={9,2,4};
		int x = 0, y = 0, z = 0;
		System.out.print("Common elements are: ");
		while (x < arr1.length && y < arr2.length && z < arr3.length){
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]){
				System.out.print(arr1[x]+" ");
				x++;
				y++;
				z++;
			}
			else if (arr1[x] < arr2[y])
				x++;
			else if (arr2[y] < arr3[z])
				y++;
			else
				z++;
		}
	}
}


