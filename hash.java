//CHRISTINE FULE
//OE8
//BSCS 2-1

import java.util.Scanner;
import java.util.Hashtable;

public class hash {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Hashtable<String, String> ht = new Hashtable<>();
        
        
        //For asking user how many values
        System.out.print("\n\nHello User how many values would you like to add in the hashtable: ");
        int size = in.nextInt();
        
		//print hash table
		String top, movie_name; 
        for(int a=0; a < size; a++){
            System.out.print("TOP #: ");
            top = in.next();
            System.out.print("Movie title/series: ");
            movie_name = in.next();
            ht.put(top,movie_name);
			System.out.println();
        }
        System.out.println(ht);

        //main while loop
        boolean repeat=true;
        int selection;
        
		System.out.print("\nWELCOME TO HASH TABLE FOR TOP YOUR MOVIES / SERIES. \n");
		System.out.println();
		System.out.println(ht);
		while(repeat){	
			
			System.out.println("\n=========================MAIN MENU====================");
			System.out.println("Press 1 = Insert");
			System.out.println("Press 2 = Search");
			System.out.println("Press 3 = Delete");
			System.out.println("Press 4 = Print Updated Table");
			System.out.println("Press 5 = End");
			System.out.println();
			System.out.print("Select from 1-5:  ");
                selection = in.nextInt();
                String searching;
				switch (selection){
						case 1:
							System.out.print("\nTOP #: ");  top = in.next();
							System.out.print("Movie title/series: "); movie_name = in.next();
							ht.put(top ,movie_name);
							break;
						
						case 2:
							System.out.print("Search Movie title/series: ");
										searching = in.next();
										if(ht.containsValue(searching)){
											System.out.println("\nGREAT, the Movie/Series is in the hashtable");
										}
										else{
											System.out.println("\nSORRY, the Movie/Series is NOT in the hashtable");
										}
										break;
								
						case 3:
							System.out.print("Number to Delete: ");
							String del = in.next();
							ht.remove(del);
							System.out.println("\nUpdated table: " + ht);
							break;
						
						case 4:
						//PRINT
							System.out.println(ht);
							break;
						case 5:
							repeat = false;
							System.out.print("Thank you for using this code. ;)");
							break;
                default:
                     System.out.println("Please FOLLOW the Instruction. ");
                }
			}
		}
	}