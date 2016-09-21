import java.util.*;
import java.util.Random;
public class ArrayTotalMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
			int sizeNo;
		System.out.print("Please enter a numbers: ");
		sizeNo = input.nextInt();
		int [] size = new int[sizeNo];
	for(int i = 0; i < sizeNo; i++) {
		System.out.print("Number[" + i + "]: ");
		size[i] = input.nextInt();
		input.nextLine();
	}
	
	int total = 0;
	for (int i = 0; i < size.length; i++) {
		total = total + size[i];
	}
	double average = total / size.length;
	System.out.println("");
	System.out.println("Total Numbers= " + total);
	System.out.println("Average Numbers= " + average);
	

	int max = size[0];
	for (int i=0; i < size.length; i++)
		if (size[i] > max)
			max = size[i];
	System.out.println("Max Number= " + max);
}
}