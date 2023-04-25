package sum2matrices;
import java.util.Scanner;

public class SumOf2Matrices {
	
	//Input matrix method
	public static int[][] inputMatrices(int width, int height) {
		int matrix[][] = new int[width][height];
		Scanner keyboard = new Scanner(System.in);
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				matrix[i][j] = keyboard.nextInt();
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//scan width
		System.out.println("Enter the width of matrices");
		int width = sc.nextInt();
		
		//scan height
		System.out.println("Enter the height of matrices");
		int height = sc.nextInt();
		
		//scan matrix A
		System.out.println("Enter the matrix A following its row");
		int matrixA[][] = inputMatrices(width, height);
		
		//scan matrix B
		System.out.println("Enter the matrix B following its row");
		int matrixB[][] = inputMatrices(width, height);
		
		int res[][] = new int[width][height];
		//sum of 2 matrices
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				res[i][j] =matrixA[i][j] + matrixB[i][j];
			}
		}
		
		//print the result
		System.out.println("Sum of 2 matrix is: ");
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
