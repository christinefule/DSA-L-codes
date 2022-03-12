//CHRISTINE FULE
//BSCS 2-1
//OE5
import java.util.*;

public class  random_qsort{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size;
		int[] num;
		
		System.out.print("CHRISTINE ANGELINE FULE \t BSCS 2-1\n");
		System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.print("PLEASE ENTER VALUE LESS THAN 100.\n\n ");
		System.out.print("Enter number of array/s you want?: ");
		size = in.nextInt();
		
		num = new int[size];
		
		
		for(int a = 0; a < size; a++) {
			
			System.out.print("Array " + a + " ==> " + (size-1) + ": ");
			num[a] = in.nextInt();
		}
		
		
		quickSort(num, 0, num.length-1);
		
		
		System.out.println("You input arrays are: ");
		for(int number : num){
			System.out.print(number + " ");
		}
		
		System.out.println("\nMin number: " + num[0]);
        System.out.println("Max number: " + num[num.length-1]);
		
		in.close();
		
	}

	private static void quickSort(int[] num, int top, int end) {

		if(end <= top) return;
		int pivot = random(num, top, end);
		int b = top;
		int a = top-1;
		int temp;
		
		for(; b <= end; b++) {
			if(num[b] <= pivot) {
				a++;
				temp = num[b];
				num[b] = num[a];
				num[a] = temp;
			}
		}
		
		quickSort(num, top, (a-1));
		quickSort(num, (a+1), end);
	}
	
	private static int random(int[] num, int top, int end) {
		
		Random random = new Random();
		int pivot = random.nextInt(top, end+1);
		
		//random pivot to the end
		int temp = num[pivot];
		num[pivot] = num[end];
		num[end] = temp;
		
		System.out.println("\nRandom Pivots:  " + num[end]);
		
		return num[end];
	}

}