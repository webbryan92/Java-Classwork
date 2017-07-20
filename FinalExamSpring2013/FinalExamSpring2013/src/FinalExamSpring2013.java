//Final Exam Spring 2013 
//Name:
//Print the code and the output when done.

/*
 * Implement the RmoveRange and toList methods
 * in MyLinkedList class. Do not change any other methods. 
 * See Line 234 and line 243. Read the description give.
 */
/**
 *
 * @author suhettia
 */
public class FinalExamSpring2013 {

    // DO NOT CHANGE THE MAIN METHOD 
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
        list1.addFirst(new Integer(4));
        list1.addFirst(new Integer(3));
        list1.addFirst(new Integer(7));
        list1.addFirst(new Integer(5));
        list1.addFirst(new Integer(9));
        list1.addFirst(new Integer(3));
        list1.addFirst(new Integer(2));
        list1.addFirst(new Integer(1));
        list1.addFirst(new Integer(5));
        list1.addFirst(new Integer(0));
        list1.addFirst(new Integer(7));
        System.out.println("List 1, Before RemoveRange: \n" + list1);
        MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
        Node<Integer> n = list1.removeRange(2, 5);
        list2.toList(n);
        System.out.println("List 1, After RemoveRange:: \n" + list1);
        System.out.println("List 2, Range that was Removed: \n" + list2);
    }  
    /* Sample Output
       List 1, Before RemoveRange: 
       [7, 0, 5, 1, 2, 3, 9, 5, 7, 3, 4]
       List 1, After RemoveRange:: 
       [7, 0, 9, 5, 7, 3, 4]
       List 2, Range that was Removed: 
       [5, 1, 2, 3]
     */
    
}


/* DO NOT CHANGE MyLinkedList class*/
final class MyLinkedList<E> {

    private Node<E> head, tail;
    private int size;

    /** Create a default list */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /** returns the list size */
    public int getSize() {
        return size;
    }

    /** returns the element at given index, 
    returns null if index out of bounds.
    0-based indexing **/
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.element;
        }
    }

    /** Return the head element in the list */
    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    /** Return the last element in the list */
    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // the new node is the only node in list
        {
            tail = head;
        }

    }

    /** Add an element to the end of the list */
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new for element e
        if (tail == null) {
            head = tail = newNode; // The new node is the only node in list
        } else {
            tail.next = newNode; // Link the new with the last node
            tail = tail.next; // tail now points to the last node
        }
        size++; // Increase size
    }

    /** Add a new element at the specified index in this list
     * The index of the head element is 0 */
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }

    }

    /** Remove the head node and
     *  return the object that is contained in the removed node. */
    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    /** Remove the last node and
     * return the object that is contained in the removed node. */
    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    /** Remove the element at the specified position in this list.
     *  Return the element that was removed from the list. */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    /** Override toString() to return elements in the list */
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }
        return result.toString();
    }

    /** Clear the list */
    public void clear() {
        head = tail = null;
    }

    /** return true if the list is empty **/
    public boolean isEmpty() {
        return size == 0;
    }
    
    /* Remove the given range from fromIndex to toIndex of the LinkedList
     * The method returns null if the indexes are out of bounds, otherwise 
     * the method returns a reference to the first Node of the range removed.
     * Example: given the list [7, 0, 5, 1, 2, 3, 9, 5, 7, 3, 4] 
     * and indexes (2, 5), returns a reference to list containing [5, 1, 2, 3]
     * and the original list be [7, 0, 9, 5, 7, 3, 4] 
     */
    public Node<E> removeRange(int fromIndex, int toIndex){
       Node<E> current;
       Node<E> preIndex = head;
       for(int i = 1; i< fromIndex; i++){
           preIndex = preIndex.next;
       }
       current = preIndex.next;
       Node<E> remove = current;
       for(int i = fromIndex; i< toIndex; i++){
           current = current.next;
       }
       Node<E> postIndex = current.next;
       current.next = null;
       preIndex.next = postIndex;
       size = size-((toIndex-fromIndex)+1);
       return remove;  
    }
    
    /* Given a reference to a Node, the method sets up the client's linkedlist.
     * The size of this list is the number of Nodes starting from the
     * first node (given FirstNodeReference).
     * method returns nothing.
     */
    public void toList(Node<E> FirstNodeReference){
            head = FirstNodeReference;
            size = 1;
            Node<E> current = FirstNodeReference;
            System.out.println(current.element);
            while(current.next != null){
                current = current.next;
                size++;
        }
           /* while(FirstNodeReference.next != null){
                size++;
            }*/
    }
    
}

class Node<E> {

    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }
}
