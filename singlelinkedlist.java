//OE 3
//Christine Fule
//implementation of singly linked list
//2/18/22
public class singlelinkedlist {

    class Node {
        int data;
        Node next;

        //constructor / method
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    //represent the head & tail
    public Node head = null;
    public Node tail = null;

    //method to add node in the linked list
    public void addNode(int data){
            //ability to create node using instance Node
        Node newNode = new Node (data);

            //cheacker if the linked list is empty
            if(head == null){
                head = newNode;
                tail = newNode;
                
                }else{
                 //new node will be the tail
                tail.next =  newNode;
                tail = newNode;
                tail.next = head;
              }   
    }
 //Deletes node from the beginning of the list  
 public void deleteStart() {  
    
    //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether contain only one element 
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
            }  
            //If the list contains only one element
            //then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }   
//Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("Now the list is Empty. :(");  
        }  
        else {  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  

  public static void main(String[] args) {  
        singlelinkedlist mylist = new singlelinkedlist();  
        //Adds data to the list  
        mylist.addNode(1); 
        mylist.addNode(2);  
        mylist.addNode(3);  
        mylist.addNode(4);  
        mylist.addNode(5);
        mylist.addNode(6);
        mylist.addNode(7);
        mylist.addNode(8);
        mylist.addNode(9);
        mylist.addNode(10);
        
        //Printing original list  
        System.out.println("Original List: ");  
        mylist.display();  
        while(mylist.head != null) {  
            mylist.deleteStart();  
           
        //Printing updated list  
            System.out.println("The List is Decreasing... ");  
            mylist.display();  
        }  
         System.out.println("\nCHRISTINE ANGELINE FULE \t BSCS 2-1");    
    }  
}  