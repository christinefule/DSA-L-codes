//CHRISTINE FULE
//BSCS 2-1
//OE4 QUICKSORT with max and min
import java.util.Scanner;

public class OE4qsort {

	private static void my_quicksort (int[] num, int start, int end) {

		if(end <= start) return;
		
		int pivot = num[end];
		int a = start;
		int b = start-1;
		int temp;
		
		for(; a <= end; a++) {
			if(num[a] <= pivot) {
				b++;
				temp = num[a];
				num[a] = num[b];
				num[b] = temp;
			}
		}
		
		my_quicksort(num, start, (b-1));
		my_quicksort(num, (b + 1), (end));
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size;
		int[] num;
		
		System.out.print("WELCOME TO QUICKSORT IMPLEMENTATION!\n\n ");
		System.out.print("Type how many arrays you want? : ");
		size = in.nextInt();
		
		num = new int[size];
		
		//input arrays
		for(int c = 0; c < size; c++) {
			
			System.out.print("[" + c + "] ==> " );
			num[c] = in.nextInt();
			
		}
		
		// quicksort
		my_quicksort(num, 0, num.length-1);
		
		System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// print input array 
		System.out.print("Your SORTED numbers are: ");
		for(int number : num){
			System.out.print(number + " ");
		}
		
			System.out.println("\nMinimum value: " + num[0]);
			System.out.println("Maximum value: "+ num[num.length-1]);

			in.close();
		
	}

}