//CHRISTINE FULE
//BSCS 2-1
//OE6

class Node{
    int key;
    Node leftST, rightST;

    public Node (int data){
        key = data;
        leftST = rightST = null;

    }
}
    public class bstree {
        Node root;

            //Inorder: left, root, right
            public void inordertraverseT(Node node){
                if(node != null){
                
                //recur on the left of node
                    inordertraverseT(node.leftST);
                //then, deal with the code
                    System.out.print(" " + node.key);
                //recur on the right of node
                    inordertraverseT(node.rightST);
                }
            }
            
            //Preorder: root, left, right
            public void preOrderTraverse(Node node){
                if (node != null){
     
            //first print data of node */
                System.out.print(node.key + " ");
            //then, recur on left subtree */
                 preOrderTraverse(node.leftST);
     
            //now recur on right subtree */
                 preOrderTraverse(node.rightST);
               }
            }

            //Postorder: left, right, root
            public void postOrderTraversal(Node node){
                if (node != null){
     
            //first recur on left subtree
                 postOrderTraversal(node.leftST);
            //then, recur on right subtree
                 postOrderTraversal(node.rightST);
            //now deal with the node
                 System.out.print(" " + node.key);
                } 
            }
    
 public static void main(String[] args){
            //instance of the tree
            bstree myTree = new bstree();


            //create nodes
            myTree.root = new Node(10);
            myTree.root.leftST = new Node(20);
            myTree.root.rightST = new Node(30);
            myTree.root.leftST.leftST = new Node(40);
            myTree.root.rightST.rightST = new Node(50);
            myTree.root.leftST.rightST = new Node(100);

            //printout binary tree
            System.out.print("\nChristine Fule\t3/25/22\n");
            System.out.print("\nIn-Order-Transerve Tree: ");
            myTree.inordertraverseT(myTree.root);

            System.out.print("\nPre-Order-Traverse Tree: ");
            myTree.preOrderTraverse(myTree.root);

            System.out.print("\nPost-Order-Traverse Tree: ");
            myTree.postOrderTraversal(myTree.root);
    }
}


