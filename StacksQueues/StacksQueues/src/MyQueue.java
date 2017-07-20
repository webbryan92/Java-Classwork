public class MyQueue <E>{
    private Node<E> front, back;

    public MyQueue(){
        front = back = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueu(E e){
        if (isEmpty()){
            front = back = new Node(e, back);
        }
        else{
            Node<E> newnode = new Node(e, null);
            back.next = newnode;
            back = newnode;
        }
    }

    public E dequeue(){ //same as poll in API Queue interface
        if (!isEmpty()){
            Node<E> temp = front;
            front = front.next;
            if (front == null)
                back = null;
            return temp.element;
        }
        else
            return null;
    }

    public E peek(){  //same as peek in API Queue interface
        if (!isEmpty()){
            return front.element;
        }
        else
            return null;
    }

}

