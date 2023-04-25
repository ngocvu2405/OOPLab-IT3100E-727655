package labOOP_01;
import java.util.Scanner;
import java.text.Format;
public class TriangleWithHeight {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which height???");
		int number = keyboard.nextInt();
		
		int i;
		
		for (i = 0; i < number; i++) {
			System.out.println(" ".repeat(number-i) + "*".repeat(i*2+1));
		}
		keyboard.close();
	}

}
