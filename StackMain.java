public class StackMain{

    public static void main(String[] args){
        
        //creating object with datatype integer
        Stack<Integer> stack = new Stack<>(3);
        
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}