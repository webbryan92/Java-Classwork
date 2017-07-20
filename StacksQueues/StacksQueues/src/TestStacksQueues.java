public class TestStacksQueues{
    public static void main(String[] args){
        MyStack mstk = new MyStack();
        LinkedListStack llstk = new LinkedListStack();
        MyQueue mq = new MyQueue();

        System.out.println("---MyStack---");
        mstk.push("this");
        mstk.push("is");
        mstk.push("it");
        System.out.println("Peeking -->" + mstk.peek());
        System.out.println("Removing elements from mystack");
        while(!mstk.isEmpty()){
            System.out.print(mstk.pop()+" ");
        }

        System.out.println("\n---LinkedListStack---");
        llstk.push("this");
        llstk.push("is");
        llstk.push("it");
        System.out.println("Peeking -->" + llstk.peek());
        System.out.println("Removing elements from mystack");
        while(!llstk.isEmpty()){
            System.out.print(llstk.pop()+" ");
        }

        System.out.println("\n---MyQueue---");
        mq.enqueu("this");
        mq.enqueu("is");
        mq.enqueu("it");
        System.out.println("Peeking -->" + mq.peek());
        System.out.println("Removing elements from mystack");
        while(!mq.isEmpty()){
            System.out.print(mq.dequeue()+" ");
        }
    }
}