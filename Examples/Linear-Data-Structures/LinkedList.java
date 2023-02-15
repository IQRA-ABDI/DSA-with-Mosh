import java.util.Arrays;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        //careating arraylist
        LinkedList list= new LinkedList();
        // adding a value at last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        //adding a value at first
        list.addFirst(5);
        //removing first values
        list.removeFirst();
        //removing at specific number
        list.remove(0);
        //removing last numbers
        list.removeLast();
        //contain method will return true or false
        System.out.println(list.contains(30));
        // this will return the index of this value
        System.out.println(list.indexOf(10));
        // it will tell the size of the list
        System.out.println(list.size());
        // you can change arraylist into array using this method
        var Array = list.toArray();
        System.out.println(Arrays.toString(Array));

    }
}