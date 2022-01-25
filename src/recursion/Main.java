package recursion;


public class Main {
	public int[] arr = {2, 5, 6, 7, 9, 11, 15, 27};
	
	public void printNum(int n, int max) {
		System.out.println(n);
		if(n < max) {
			printNum(n+1, max);
		}
		System.out.println();
		System.out.println(n);
	}
	
	/*
	 * Binary search - find a number in an order list
	 */
	public int binarySearch(int num, int startIndex, int endIndex) {
		if(startIndex > endIndex) {
			return -1;
		}
		int middle = (endIndex + startIndex)/2;
		if(num < arr[middle]) {
			return binarySearch(num, startIndex, middle - 1);
		}
		else if(num > arr[middle]) {
			return binarySearch(num, middle + 1, endIndex);
		}
		else {
			return middle;
		}
	}	
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	
	
	public static void main(String[] args) {
		Main x = new Main();
		//x.printNum(0, 3);
		
		System.out.println(x.binarySearch(9, 0, x.arr.length-1));
		System.out.println(x.binarySearch(10, 0, x.arr.length-1));
		System.out.println(x.factorial(3));
	}

}
