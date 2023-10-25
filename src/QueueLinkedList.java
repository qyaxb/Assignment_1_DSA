import java.util.Queue;

public class QueueLinkedList {
    public static void queueAdd(Queue<String> queue){
        //addItem into queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println(queue);
    }
    public static void queueOffer(Queue<Integer> queue){
        for(int i = 0; i <= 10;i++)
        {
            queue.offer(i);

        }
        System.out.println(queue);
    }

    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("Queue Peeked: "+ accessElement);
        System.out.println(queue);
    }

    public static void queuePoll(Queue<Integer> queue){
       System.out.println("Queue: " + queue);
       int count = queue.size();
       if(count > 0)
       {
           int poll = queue.poll();
           System.out.println("Queue poll: "+ poll);
           System.out.println(queue);
       }
       else
       {
           System.out.println("Queue is empty");
       }


    }
    public static void queueSearch(Queue<Integer> queue, int Element){
        queue.contains(Element);

    }

    public static void queueRemoveElement(Queue<Integer> queue,int Element){
        queue.remove(Element);
        System.out.println(Element + " Deleted");
        System.out.println(queue);
    }


}
