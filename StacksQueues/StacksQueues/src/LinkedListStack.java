import java.util.*;
public class LinkedListStack <E>{
    LinkedList<E> stack;

    public LinkedListStack(){
        stack = new LinkedList<E>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(E e){
        stack.addFirst(e);
    }

    public E pop(){
        if (!isEmpty()){
            return stack.removeFirst();
        }
        else
            return null;
    }

    public E peek(){
        if (!isEmpty()){
            return stack.getFirst();
        }
        else
            return null;
    }

}