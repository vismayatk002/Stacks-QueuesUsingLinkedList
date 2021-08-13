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
    public boolean isFull(){

       return size == maxSize;
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