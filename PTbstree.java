//Christine Angeline Fule
//BSCS 2-1
//PT3
import java.util.*;

class Node{
	
	Integer data;
	Node leftnode;
	Node rightnode;
	
	Node(){
		this.data = null;
		leftnode = null;
		rightnode = null;
	}
	Node(int data){
		this.data = data;
		leftnode = null;
		rightnode = null;
	}
}

class Tree{
	
	private Node root = null;
	
	public Node GetRoot() {
		return root;
	}
	
	//insert traversal
	public void Insert(Node node){
		
		if(this.root == null)
			this.root = node;
		else if(this.root.data == null)
			this.root.data = node.data;
		else {
			
			Node current = this.root;
			boolean value = true;
			
			while(value) {
				
				value = false;
				
				if(node.data > current.data) {
					
					if(current.rightnode == null)
						current.rightnode = node;
					else if(current.rightnode.data == null)
						current.rightnode.data = node.data;
					else {
						
						current = current.rightnode;
						value = true;
					}
				}else {
					
					if(current.leftnode == null)
						current.leftnode = node;
					else if(current.leftnode.data == null)
						current.leftnode.data = node.data;
					else {
						
						current = current.leftnode;
						value = false;
					}
				}
			}
		}
		
		System.out.println();
	}
	
	//in-order traversal
	public void InOrder(Node current) {
		
		if(current != null) {
			
			if(current.data == null)
				return;
			
			if(current.leftnode != null)
				InOrder(current.leftnode);
					
			System.out.print(current.data + " ");
			
			if(current.rightnode != null)
				InOrder(current.rightnode);
			
		}
		else
			System.out.print("Root is null.");
	}
	
	//pre-order traversal
	public void PreOrder(Node current){
		
		if(current != null) {
			
			if(current.data == null)
				return;
			
			System.out.print(current.data + " ");
			
			if(current.leftnode != null)
				PreOrder(current.leftnode);
			
			if(current.rightnode != null)
				PreOrder(current.rightnode);
		}
		else
			System.out.print("Root is null.");
	}
	//post-order traversal
	public void PostOrder(Node current) {
		
		if(current != null) {
			
			if(current.data == null)
				return;
			
			if(current.leftnode != null)
				PostOrder(current.leftnode);
			
			if(current.rightnode != null)
				PostOrder(current.rightnode);
			
			System.out.print(current.data + " ");
		}
		else
			System.out.print("Root is null.");
	}
	
	//search travers/node
	public boolean Search(int target, Node recent) {
		
		if(recent != null) {
			
			if(target == recent.data)
				return true;
			else if(target > this.root.data)
				if(recent.rightnode != null)
					return Search(target, recent.rightnode);
				else
					return false;
			else
				if(recent.leftnode != null)
					return Search(target, recent.leftnode);
				else
					return false;
		}
		else
			return false;
	}
	
	//delete travers/node
	public boolean Delete(int target, Node recent) {
		
		if(recent != null) {
			
			if(target == recent.data) {
				
				if(recent.rightnode != null) {
					
					recent.data = recent.rightnode.data;
					if(recent.rightnode.rightnode != null)
						return Delete(recent.rightnode.data,recent.rightnode);
					else if(recent.rightnode.leftnode != null)
						return Delete(recent.rightnode.data, recent.leftnode);
					else
						recent.rightnode = new Node();
				}
				else if(recent.leftnode != null) {
					
					recent.data = recent.leftnode.data;
					if(recent.leftnode.rightnode != null)
						return Delete(recent.leftnode.data, recent.rightnode);
					else if(recent.leftnode.leftnode != null)
						return Delete(recent.leftnode.data, recent.leftnode);
					else
						recent.leftnode = new Node();
				}
				else
					recent.data = null;
				
				return true;
			}
			else if(target > recent.data)
				return Delete(target, recent.rightnode);
			else
				return Delete(target, recent.leftnode);
		}
		else
			return false;
	}
}

public class PTbstree {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Tree tree = new Tree();
		
		boolean press = true;
		int choice;
		int dataInput;
		
		System.out.print("\nWELCOME TO CHRISTINE FULE PROGRAM! I HOPE YOU WILL ENJOY IT.\nToday is April 1, 2022\n\n");
		
		
		while(press) {
			//Selecting an option
			System.out.print("\n===============MAIN MENU======================");
			System.out.print("\nPress 1 - Add a new number for node");
			System.out.print("\nPress 2 - PRE ORDER Tree Traversal");
			System.out.print("\nPress 3 - IN ORDER Tree Traversal");
			System.out.print("\nPress 4 - POST Binary Tree Traversal");
			System.out.print("\nPress 5 - Search node");
			System.out.print("\nPress 6 - Delete node");
			System.out.print("\nPress 7 - End the Program\n");
			System.out.print("\nSelect a number from 1-7 ONLY: ");
			
			choice = in.nextInt();
			
			switch(choice) {
			
				case 1: 
					
					System.out.print("Input Data: ");
					dataInput = in.nextInt();
					tree.Insert(new Node(dataInput));
					break;

				case 2: 
					System.out.print("Pre-Order: ");
					tree.PreOrder(tree.GetRoot());
					System.out.println();
					break;

				case 3: 
					System.out.print("In-Order: ");
					tree.InOrder(tree.GetRoot());
					System.out.println();
					break;

				case 4: 
					System.out.print("Post-Order: ");
					tree.PostOrder(tree.GetRoot());
					System.out.println();
					break;
				case 5: 
					
					System.out.print("Input target to find: ");
					dataInput = in.nextInt();
					System.out.println("\nIs your number in the Binary Tree?: " + tree.Search(dataInput, tree.GetRoot()));
					System.out.println();
					break;

				case 6: 
					System.out.print("\nWhat node you want to delete?  ");
					dataInput = in.nextInt();
					System.out.println("\nWill I accept your command?   " + tree.Delete(dataInput, tree.GetRoot()));
					System.out.println();
					break;

				case 7: press = false; 
				break;
				default: System.out.println("\nPLEASE FOLLOW THE INSTRUCTION");
			}
		}
		
		System.out.println("THANK YOU FOR USING MY PROGRAM. ;)");
		in.close();
	}

}

