import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class Main {
    public static void main(String[] args) {

        //LinkedList<String> animals = new LinkedList<>();
        //LinkedListADT.AddElement(animals);
        //LinkedListADT.AddElementWithIndex(animals,1);
        //LinkedListADT.GetElementByIndex(animals,3);
        //LinkedListADT.setElement(animals,2,"Bruh");
        //LinkedListADT.scanElementLinkedList(animals);




        //============================================================




        //Stack<Integer> numbers = new Stack<>();
        //StackADT.stackPush(numbers);
        //System.out.println(numbers);
        //StackADT.stackPop(numbers);
        //StackADT.stackSearch(numbers,3);
        //StackADT.checkEmpptyStack(numbers);

        //Queue<String> fruits = new LinkedList<>();
        //QueueLinkedList.queueAdd(fruits);
        Queue<Integer> number = new LinkedList<>();
        QueueLinkedList.queueOffer(number);
        QueueLinkedList.queuePoll(number);


        Stack<Integer> stack = new Stack<>();
        stack.pop();
        int value = 0;
        stack.push(value);
        stack.peek();
        stack.isEmpty();



        int[] random_number = {3 , 2, 1, 5, 10, 4, 9};
        InsertionSortALU.insertionSort(random_number);
        InsertionSortALU.printResult(random_number);
        System.out.println("\nRuntime: "+System.currentTimeMillis());
        //BubbleSortALU.BubbleSortALU(random_number);
        //SelectionSortALU.seletionSort(random_number);
        //SelectionSortALU.printResult(random_number);
        //MergeSortALU.sort(random_number,0,random_number.length - 1);
        //MergeSortALU.printResult(random_number);
    }
}