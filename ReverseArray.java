package Assign_4;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array ={1,2,3,4,5,6};  
		System.out.println("array length is : "+array.length);
		System.out.print("printing original array : "); 
		for (int i=0;i<array.length;i++){ 
		System.out.print(array[i]);
		}
		System.out.println("");
		System.out.print("printing reversed array : ");
		for (int i = array.length - 1;i>=0;i--){ 
			System.out.print(array[i]); 
		} 
	}
}
