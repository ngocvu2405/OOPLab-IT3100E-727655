package arraymethods;

public class AverageArray {
	public int averageArray(int arr[]) {
		int sum = 0, LENGTH;
		LENGTH = arr.length;
		for (int i = 0; i< LENGTH; i++) {
			sum += arr[i];
		}
		return sum/LENGTH;
	}
}
