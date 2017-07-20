import java.util.*;
import java.io.*;


public class TestBinarySearchTree {

  public static void main(String[] args) {

    // Create an empty BinaryTree
    BinarySearchTree<String> tree = new BinarySearchTree<String>();
    
    // insert few elements
    tree.insert("Michael");
    tree.insert("Tom");
    tree.insert("Adam");
    tree.insert("Jones");
    tree.insert("Peter");
    tree.insert("George");
    tree.insert("Daniel");



    // Traverse tree
    System.out.print("Inorder (sorted): ");
    tree.inorder();
    System.out.print("\nPostorder: ");
    tree.postorder();
    System.out.print("\nPreorder: ");
    tree.preorder();
    System.out.print("\nThe number of nodes in tree " + tree.getSize());

    // Search for an element
    System.out.print("\nIs Peter in the tree? " + tree.search("Peter"));

    // Get a path from the root to Peter
    System.out.print("\nA path from the root to Peter is: ");
    java.util.ArrayList path = tree.path("Peter");
    for (int i = 0; path != null && i < path.size(); i++)
      System.out.print(((BinarySearchTree.TreeNode)(path.get(i))).element + " ");
      
    //TestBinaryTree. TestLab10(); // uncomment this for lab 10
          
  }
  
  /* Rest of the code is for lab 10 */
  public static void TestLab10(){
  	BinarySearchTree<String> labtree = new BinarySearchTree<String>();
  	readFile(labtree);
  	sort(labtree);
  }
  
  
  public static void readFile(BinarySearchTree<String> tree){
  
  	Scanner inputStream = new Scanner(System.in);
     System.out.println("\n Enter the file name to be read :");
	String fileName = inputStream.next();

	try {

		FileInputStream inf = new FileInputStream(new File(fileName));
		char let;
                String str = "";
		int n = 0;
		while ((n = inf.read()) != -1){
			let = (char)n;

			if (Character.isLetter(let))
				str += Character.toLowerCase(let);
			if ((Character.isWhitespace(let) || let =='-') && !str.isEmpty()){
			   	tree.insert(str); // insert String in to BinarySearch Tree
				str="";
			}

       	}
		inf.close();

	}
    	catch (IOException e){
	      e.printStackTrace();
	}

  }
  
  public static void sort(BinarySearchTree<String> tree){
        tree.inorderFileWriter(); // see BinarySearchTree class for this method
  }

  
}
