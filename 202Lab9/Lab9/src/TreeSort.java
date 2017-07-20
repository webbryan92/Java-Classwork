
import java.io.*;
import java.util.Scanner;
import java.lang.Character;

public class TreeSort {

    public static Scanner inputStream = new Scanner(System.in);
    //instantiate your BinarySearchTree, you need only one tree
    static BinarySearchTree tree = new BinarySearchTree();
    //add no-arg constructor

    public TreeSort() {
    }

    //add the sort method.
    public void sort() {
        tree.inorderFileWriter();
    }

    public static void fileRead() {
        System.out.println("Enter the file name to be read");
        String fileName = inputStream.next();
        try {
            FileInputStream inf = new FileInputStream(new File("random_dictionary.txt"));
            char let;
            String str = "";
            int n = 0;
            while ((n = inf.read()) != -1) {
                let = (char) n;
                if (Character.isLetter(let)) {
                    str += Character.toLowerCase(let);
                }
                if ((Character.isWhitespace(let) || let == '-') && !str.isEmpty()) {
                    // Write code to insert str in to your tree here
                    tree.insert(str);
                    str = "";
                }
            }
            inf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        TreeSort ts = new TreeSort();
        ts.fileRead();
        ts.sort();
    }
}
