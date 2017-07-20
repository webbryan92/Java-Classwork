public class MyStack <E>{
    private Node<E> top;

    public MyStack(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(E e){
        top = new Node(e, top);
    }

    public E pop() {
        if (!isEmpty()){
            Node<E> temp = top;
            top = top.next;
            return temp.element;
        }
        else
            return null;
    }

    public E peek() {
        if (!isEmpty()){
            return top.element;
        }
        else
            return null;
    }

}

