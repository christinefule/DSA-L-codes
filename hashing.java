//CHRISTINE FULE
//OE7
//BSCS 2-1

import java.util.Scanner;
import java.util.Hashtable;

public class hashing {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Hashtable<String, String> ht = new Hashtable<>();
        
        
        //For asking user how many values
        System.out.print("\n\nHello User how many values would you like to add in the hashtable: ");
        int size = in.nextInt();
        
		//print hash table
		String balota_no, candidate_name; 
        for(int a=0; a < size; a++){
            System.out.print("Balota no.: ");
            balota_no = in.next();
            System.out.print("Candidate Name: ");
            candidate_name = in.next();
            ht.put(balota_no,candidate_name);
			System.out.println();
        }
        System.out.println(ht);

        //main while loop
        boolean repeat=true;
        int selection;
        
		System.out.print("\nWELCOME TO HASH TABLE FOR GOVENMENT CANDIDATES FOR YR. 2022\nVOTE WISELY FOR THIS UP COMING ELECTION\n");
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
							System.out.print("\nNumero sa Balota: ");  balota_no = in.next();
							System.out.print("Candidate Name: "); candidate_name = in.next();
							ht.put(balota_no ,candidate_name);
							break;
						
						case 2:
							System.out.print("Search Candidate's Name: ");
										searching = in.next();
										if(ht.containsValue(searching)){
											System.out.println("\nGREAT, the Candidate Name is in the hashtable");
										}
										else{
											System.out.println("\nSORRY, the Candidate Name is NOT in the hashtable");
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