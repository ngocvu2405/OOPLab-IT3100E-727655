package arraymethods;
import java.util.Scanner;

public class ArrayWithSpecialMethods {
	
	//Main
	public static void main(String[] args) {
		
		//Scan the data from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//LENGTH he/she want of array
		System.out.println("The number of integer you want in array:");
		int LENGTH = keyboard.nextInt();
		int [] arr = new int[LENGTH];
		
		//Input elements of array
		System.out.println("Please, enter the elements of array!");
		for (int i = 0; i < LENGTH; i++) {
			arr[i] = keyboard.nextInt();
		}
	    

		//Choosing option
		System.out.println("Choose option which you want to do with the array? \n"
				+ "1. Sort the array \n"
				+ "2. Calculate the average of this array");
		int choose = keyboard.nextInt();
		if (choose == 1) {
			SortingArray sort = new SortingArray();
			sort.heapSort(arr);
			System.out.println("The array after sorting is: ");
			sort.printArray(arr);
		}
		else if (choose == 2) {
			AverageArray arr2 = new AverageArray();
			int res = arr2.averageArray(arr);
			System.out.println("Average of this array is: " + res);
		}
		else {
			System.out.println("Your chosen is wrong, good bye!");
		}
		
		keyboard.close();
	}

}
