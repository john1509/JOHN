public class FindMaxInt {
	
	public static void main(String[] args) {
		int[] myList = {12, 9, 20, 5, 28, 27};
		
		
	
		for (int i=0; i < myList.length; i++) {
			System.out.println("Array[" + i + "]: " + myList[i]);
		}
		
	
		int total = 0;
		for (int i = 0; i < myList.length; i++) {
			total = total + myList[i];
		}
		double average = total / myList.length;
		System.out.println("");
		System.out.println("Total Array= " + total);
		System.out.println("Average Array= " + average);
		

		int max = myList[0];
		for (int i=0; i < myList.length; i++)
			if (myList[i] > max)
				max = myList[i];
		System.out.println("Max Array= " + max);
		
	}
}