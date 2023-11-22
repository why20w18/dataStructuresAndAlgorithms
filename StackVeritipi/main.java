

public class main {
    
    public static void main(String[] args) {
        StackYigin stack = new StackYigin(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("pop() :"+stack.pop());
        System.out.println("pop() :"+stack.pop());
        System.out.println("pop() :"+stack.pop());
        System.out.println("pop() :"+stack.pop());
        System.out.println("pop() :"+stack.pop());
    }
    
}

