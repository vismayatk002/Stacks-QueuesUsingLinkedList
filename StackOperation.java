interface StackOperation<T>{

    void push(T data);
    T pop();
    T peek();
    boolean isFull();
    boolean isEmpty();
}