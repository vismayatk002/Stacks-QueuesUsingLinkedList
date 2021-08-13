interface QueueOperation<T>{

    void enqueue(T data);
    boolean isFull();
}