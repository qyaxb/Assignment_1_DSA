import java.util.LinkedList;

public class LinkedListADT {
    public static void AddElement(LinkedList<String> linkedList){
        linkedList.add("Mouse");
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("LinkeedList : " + linkedList);
    }
    public static void AddElementWithIndex(LinkedList<String> linkedList,int index){
        linkedList.add(index,"Tiger");
        System.out.println("LinkedList : " + linkedList);
    }
    public static void GetElementByIndex(LinkedList<String> linkedList,int index){
        System.out.println(linkedList.get(index));

    }
    public static void setElement(LinkedList<String> linkedList, int index,String object){
        linkedList.set(index, object);
        System.out.println("LinkedList change : " + linkedList.get(index));
        System.out.println("LinkedList : " +linkedList);

    }
    public static void clearElement(LinkedList<String> linkedList)
    {
        linkedList.clear();
        System.out.println("LinkedList : " + linkedList);
    }
    public static void removeElement(LinkedList<String> linkedList, int index)
    {
        linkedList.remove(index);
        System.out.println("LinkedList : " + linkedList);
    }
    public static void indexOfObject(LinkedList<String> linkedList, String Object){
        System.out.println(linkedList.indexOf(Object));
    }
    public static void lastIndexOfObject(LinkedList<String> linkedList, String Object)
    {
        linkedList.lastIndexOf(Object);
    }
    public static void scanElementLinkedList(LinkedList<String> linkedList)
    {
        for(String i : linkedList)
        {
            System.out.println("Element Value : " + i);
        }
    }
}
