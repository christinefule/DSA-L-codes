//CHRISTINE FULE
//CS 2-1
//OE 1
//1/21/22
import java.util.Scanner;
import java.util.Arrays;

    public class OE1_fule {
        
        public static void createArray(int[] our_array){
            Scanner in= new Scanner(System.in);
            int size;
    
            //Initial Create an Array
            System.out.println("\nCreate an Array List");      
             //Input for size
            System.out.print("Enter the size of the Array: ");
            size=in.nextInt();
            int my_array[]=new int[size];
    
            //Input for Elements
            for(int a=0;a<size;a++){
                System.out.print("Enter array element for "+a+" index : ");
                my_array[a]=in.nextInt();
            }
    
            System.out.println("My Array List : "+ Arrays.toString(my_array)+" ");
        }
        public static void main(String[] args){
            
            Scanner in=new Scanner(System.in);
            int ch,size,j=1;
    
            // Create an Array
            System.out.println("\nLet's first create a Array List");   

             //size Input
            System.out.print("Enter the size of the Array: ");
            size=in.nextInt();
            int my_array[]=new int[size];
    
            //Elements Input
            for(int a=0;a<size;a++){
                System.out.print("Enter array element for "+a+" index : ");
                my_array[a]=in.nextInt();
            }
    
            System.out.println("My Array List : "+ Arrays.toString(my_array));
           
            
            //While loop
            while(j!=0){
                System.out.println("\nChoose a operation you want to do: ");
                System.out.println("[1] Create an Array list");
                System.out.println("[2] Insert in Array");
                System.out.println("[3] Search in Array");
                System.out.println("[4] Delete in Array");
                System.out.println("[0] Exit");
                System.out.print("Operation: ");
                ch=in.nextInt();
        
                switch(ch){
                    case 0:{
                        System.out.println("Thank you User for using this code. I hope you have fun.");
                        j--;
                        break;
                    }
                    case 1:{
                        createArray(my_array);
                        break;
                    }
                    case 2:{
                        System.out.println("\nInsert new element in Array");
                        int new_array[]=new int[size+1];
        
                        //Copy the array to expanded array
                        for(int a=0; a<size; a++){
                            new_array[a]= my_array[a];
                        }
        
                        System.out.print("Enter a new element in the Array : ");
                        new_array[size] =in.nextInt();
                        System.out.println("This is the Array with newly inserted element : "+ Arrays.toString(new_array)+"\n");
                        break;
                    }
                    case 3:{
                        System.out.print("What number would you like for me to search in the array? ");
                        int search;
                        search = in.nextInt();
                        boolean searched =false;
        
                        //for loop to search for the input
                        for(int a =0; a<size; a++){
                            if(search == my_array[a]){
                                System.out.println("Your number " + search + " is found at index "+a+" of the array.\n");
                                searched=true;
                            }
                        }
                            if(searched==false)
                                System.out.println("Your number "+ search + "is not found at index on the array.\n");
        
                        break;
                    }
                    case 4:{
                        System.out.print("What number would you like for me to delete in the array "+Arrays.toString(my_array)+"?");
        
                        int delete_index,delete=in.nextInt();
                        int delete_array[]=new int[size-1];
                        boolean deleted=false;
        
                        for(int a=0;a<size;a++){
                            if(delete==my_array[a]){
                                delete_index=a;
                                deleted=true;
                                for(int b=0; b < delete_index; b++){
                                    delete_array[b] = my_array[b];
                                }
                                for(int b=delete_index; b<size-1; b++){
                                    delete_array[b]=my_array[b+1];
                                }
                            }
                        }
                        if(deleted==false)
                            System.out.println("Your number has not been found on the current array.\n");
                        else
                            System.out.println("Your new array with deleted element is now.  "+ Arrays.toString(delete_array) + "\n");
                        break;
                       
                }//case 4 end
            }// switch end
        }//public static end
        }//end of code
    }