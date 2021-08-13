public class QueueMain{

    public static void main(String[] args){
        
        //creating object with datatype integer
        Queue<Integer> queue = new Queue<>(3);
        
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
    }
}