interface QueueOperation<T>{

    void enqueue(T data);
    T dequeue();
    T peek();
    boolean isFull();
    boolean isEmpty();
}