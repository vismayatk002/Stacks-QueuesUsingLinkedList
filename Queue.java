public class Queue<T> implements QueueOperation<T>{

    int maxSize;
    int size = 0;
    Node<T> head, tail;
    Queue(int maxSize){
        this.maxSize = maxSize;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(T data){

        if(isFull()){
            System.out.println("Queue is full!");
        }
        if(head == null){
            head = tail = new Node<>(data);
        }
        else{
            tail.next = new Node<>(data);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T dequeue(){

        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        else{
            Node<T> temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }

    @Override
    public T peek(){

        return tail.data;
    }

    @Override
    public boolean isFull(){

       return size == maxSize;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    private class Node<T>{

        T data;
        Node<T> next;
        //initialising node using constructor
        Node(T data){
            this.data = data;
            //points to the next node default that keep it as null
            this.next = null;
        }
    }
}