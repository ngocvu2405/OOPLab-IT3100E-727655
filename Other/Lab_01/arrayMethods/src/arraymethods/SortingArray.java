package arraymethods;

public class SortingArray {

	//Sorting
	public void heapSort(int arr[]) {
		
		int LENGTH = arr.length;
		
		//build heap
		for (int node = LENGTH/2 - 1; node>=0; node--) {
			heapifyArray(arr, LENGTH, node);
		}
		
		//Do this until heap have only 1 element
		for (int node = arr.length -1; node >1; node--) {
			//move current node
			int temp = arr[0];
			arr[0] = arr[node];
			arr[node] = temp;
			
			heapifyArray(arr, node, 0);
		}
		int swap = arr[0];
		arr[0] = arr[1];
		arr[1] = swap;
	}
	
	//build Heap
	
	//heapify
	void heapifyArray(int arr[], int LENGTH, int node) {
		int largest = node;
		int left = 2 * node +1;
		int right = 2 * node +2;
		 
        // when left child is larger than root
        if (left < LENGTH && arr[left] > arr[largest]) {
            largest = left;
        }
 
        // when right child is larger than largest
        if (right < LENGTH && arr[right] > arr[largest]) {
            largest = right;
        }
 
        // When largest isn't root
        if (largest != node) {
            int swap = arr[node];
            arr[node] = arr[largest];
            arr[largest] = swap;
            //Recursive heapify to max heap
            heapifyArray(arr, LENGTH, largest);
        }
	}
	
	//Print the result
    public static void printArray(int arr[]){
        int LENGTH = arr.length;
        for (int i = 0; i < LENGTH; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
	
}
