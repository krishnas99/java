import java.io.*;
import java.util.LinkedList;
public class RemoveElementLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String>list=new LinkedList<String>();
        list.add("Good");
        list.add("morning");
        list.add("have");
        list.add("a");
        list.add("nice day");
        list.add("2");
        list.add("day");
        System.out.println("Original Linkeedlist:"+list);
        list.clear();
        System.out.println("List after clearing all 3elements:"+list);
        list.add("looks");
        list.add("good");
        System.out.println("After adding element to empty list:"+list);

    }
}