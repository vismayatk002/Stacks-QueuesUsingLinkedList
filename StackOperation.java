interface StackOperation<T>{

    void push(T data);
    boolean isFull();
}