//CHRISTINE ANGELINE FULE
//BSCS 2-1
//PT2
import java.util.Scanner;

public class my_recursion {


                //[1] infinite times
                static void my_recursion1(){
                    System.out.println("Hello");
                    my_recursion1();//call the function by itself
                }

                //[2] finite recursion - base case criteria
                static int ctr = 0;
                static void my_recursion2(String word){
                    ctr++;
                    if(ctr <= 3){
                        System.out.print(" " + word);
                        my_recursion2(word);
                    }
                }

                //[3] factorial of a number
                static int myFactorial(int num){
                    System.out.print(num + "x ");
                    if(num ==1){
                    return 1;
                    }
                    else{
                        return(num * myFactorial(num-1));
                    }
                }

                //[4] fibonacci sequence
                static int f1=0, f2=1,fn=0;
                static void fibonacci(int num){
                    if(num > 0){
                        fn = f1 + f2;
                        f1= f2;
                        f2 = fn;
                        System.out.print(" " + fn);
                        fibonacci(num-1); 
                    }
                }

                //[5] reverse a NUMBER
                static int res =0, rem;
                static void myReverse(int num){
                    if(num != 0){
                        rem=num%10;
                        res=(res*10)+rem;
                        num=num/10;
                        myReverse(num);
                    }
                    else{
                        System.out.println("The reverse word is: " + res);
                    }
                }

                //[6] reverse a WORD
                static String reverse(String s){
                    String rev="";
                    for(int a=s.length(); a > 0; --a){
                        rev=rev+(s.charAt(a-1)); 
                    }
                        return rev;
                        }

                //[7] Tower of Hanoi
                static void towerOfHanoi(int n, char from_rod,
                                    char to_rod, char aux_rod)
                {
                    if (n == 0)
                    {
                        return;
                    }
                    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
                    System.out.println("Move disk "+ n + " from rod " +
                                    from_rod +" to rod " + to_rod );
                    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
                }

                //[8] Calling X and Y
                public static boolean isOdd(int n) {
                    if (n<0) throw new IllegalArgumentException("Can't accept negative arguments!");
                    return (n == 0) ? false : isEven(n-1);
                }
                
                public static boolean isEven(int n) {
                    if (n<0) throw new IllegalArgumentException("Can't accept negative arguments!");
                    return (n == 0) ? true : isOdd(n-1);
                }


// printing output and switch/while loop
    public static void main(String[] args){
        
        int ans,ch;
        Scanner in = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        my_recursion rev=new my_recursion();
        

        System.out.println("\nCHRISTINE ANGELINE R. FULE\t BSCS 2-1\nDSA/L");
do{
    System.out.println("----------------------------Main Menu-----------------------");
    System.out.println("SELECT YOUR BET OPERATION: \n");
    System.out.println("[1] Fibonacci Series Number");
    System.out.println("[2] Factorial of a Number");
    System.out.println("[3] Reverse of a Number");
    System.out.println("[4] Reverse of a Word");
    System.out.println("[5] Tower of Hanoi");
    System.out.println("[6] Calling X and Y");
    System.out.println("[0] System Exit\n");
    System.out.println("I will pick... ");
    ans = in.nextInt();

switch(ans){
                case 1:{
                    int num;
                    System.out.println("----Fibonacci Series Number----");
                    System.out.print("Enter a number: ");
                    num = in.nextInt();
                    fibonacci(num);
                    break;
                }
                case 2:{
                    int num2;
                    System.out.println("----Factorial of a Number----");
                    System.out.print("Enter a number: ");
                    num2 = in.nextInt();
                   myFactorial(num2);
                    break;
                }
                case 3:{
                    int num3;
                    System.out.println("----Reverse of a Number----");
                    System.out.print("Enter a number: ");
                    num3 = in.nextInt();
                   myReverse(num3);
                    break;
                }
                case 4:{
                    System.out.println("----Reverse of a WORD----");
                    System.out.print("Enter a word / phrase: ");
                    String st=sc.nextLine();	
                    System.out.println("The reverse word is: "+ rev.reverse(st));
                    break;
                }
                case 5:{
                    int num5;
                    System.out.println("----Tower of Hanoi----");
                    System.out.print("Enter a number of disk: ");
                    num5 = in.nextInt(); // Number of disks
                    towerOfHanoi(num5, 'X', 'Y', 'Z'); 
                    break;
                }
                case 6:{
                    System.out.println("Enter a number: ");
                    int num = in.nextInt();
                    if (isEven(num)) System.out.println(num + " is even");
                    else System.out.println(num + " is odd");
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid input. Please try again.");
            }
            System.out.println("\nWant to try again?\t  Press 9 if YES and 0 if NO.");
            ch = in.nextInt();
            System.out.println("Thank you for using this data. See you on my next implementation.");
        }
            
while(ch != 0);
    /*[8]
    Calling X function is calling Y function and function Y is a callee of function X
    /*[7]
     Tower of Hanoi
    /*[6]
    myReverse WORD6
    /*[5]
    myReverse NUMBER;
     /*[4] 
     myFactorial;
    /*[3]
    myFibonacci;
    /*[2]
     my_recursion2("HELLO");*/
    /* [1]
    //print hello word
        for(int x = 0; x <3; x++){
            System.out.println("Hello");
        }*/
    }
    
}
