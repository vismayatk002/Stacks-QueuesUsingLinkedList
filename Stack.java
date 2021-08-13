public class Stack<T> implements StackOperation<T>{

    int maxSize;
    int size = 0;
    Node<T> head;
    Stack(int maxSize){
        this.maxSize = maxSize;
        this.head = null;
    }

    @Override
    public void push(T data){

        if(isFull()){
            System.out.println("Stack is full!");
        }
        if(head == null){
            head = new Node<>(data);
        }
        else{
            Node<T> temp = new Node<>(data);
            temp.next = head;
            head = temp;
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