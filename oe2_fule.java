//CHRISTINE FULE
//CS 2-1
//Implementation of Bubble and Insertion Sort Integer Array with Java

import java.util.Scanner;
import java.util.Arrays;
public class oe2_fule {
    
    public static void bubbleSort(int[] array1){
        int ctr = array1.length;
        int temp=0;

        for(int x=0; x < ctr; x++){
            for(int y=1; y < (ctr-x); y++){
                if(array1[y-1]>array1[y]){
                    //swapping code
                    temp=array1[y-1];
                    array1[y-1]=array1[y];
                    array1[y]=temp;
                }
            }
        }//end of main for loop
    }
    public static void printArray(int[] array1){
        for(int x=0; x< array1.length; x++){
            System.out.print( array1[x]+ "  ");
        }
        System.out.println("]");
    }
    public static void insertionSort(int array2[]){
        int ctr=array2.length;
        for(int x=1; x<ctr; x++){
            int toInsert = array2[x];//to insert
            int y=x-1;//hole position

            while(y>-1 && array2[y] > toInsert){
                array2[y+1] = array2[y];
                y--;
            }
            array2[y+1]=toInsert;
        }
    }
    public static void main(String[] args) {
    //Code for user input
        Scanner in= new Scanner(System.in);
        int num;
        System.out.print("   Hello User Welcome to the Implementation of BUBBLE and INSERTION SORT.\n\n ");
        System.out.print("STEP 1: How many array/s do you want to encode?  ");
        
    // ARRAY size
                num= in.nextInt();
                 int[] my_array = new int[num];

         for(int x=0; x < num; x++){
            System.out.print("["+ x +"]"+" index : ");
            my_array[x]=in.nextInt();
        }
        System.out.println("My Array List : "+ Arrays.toString(my_array)+"\n\n");
   
    //Sort Command
        boolean wrong=false;
        do{
            System.out.print("STEP 2:\n");
            System.out.print("Pick sorting process you like to do?\n");
            System.out.print("[1] Insertion\n");
            System.out.print("[2] Bubble Sort\n");
            System.out.print("[3] I want to end.\n\n");
            System.out.print("Select Operation : ");
            int op=in.nextInt();
        
        switch(op){
            case 1:{
                System.out.print("Original Array input: [ ");
                printArray(my_array);
        
                bubbleSort(my_array);
        
                System.out.print("Sorted Arrays : [ ");
                printArray(my_array);
                wrong=false;
                break;
            }
            case 2:{
                System.out.print("Original Array input: [ ");
                printArray(my_array);

                insertionSort(my_array);

                System.out.print("Inserted Array : [ ");
                printArray(my_array);
                wrong=false;
                break;
            }
            case 3:{
                System.out.print("Thanks for using my Array Sorting Code!");
                wrong=false;
                break;
            }
            default:{
                System.out.println("\nYou did not follow the instruction. Goodbye!\n");
            }
         }
        }while(wrong); 
    }//end of main line
}//end of code
