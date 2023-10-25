import java.util.Stack;
public class StackADT {
    public static void stackPush(Stack<Integer> stack){
        for(int i = 0; i <= 10; i++)
        {
            stack.push(i);
        }
    }
    public static void stackPeek(Stack<Integer> stack){
        int value = stack.peek();
        System.out.println(value);
    }
    public static void stackPop(Stack<Integer> stack){

        System.out.println(stack.pop());
    }
    public static void stackSearch(Stack<Integer> stack, int Element){
        int findElement = stack.search(Element);
        if(findElement == -1){
            System.out.println(Element + " Isn't exist in stack");
        }
        else{
            System.out.println(Element + " is found at position: " + findElement);
        }
    }
    public static void checkEmpptyStack(Stack<Integer> stack){
        if(stack.empty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        };
    }
}
