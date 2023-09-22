import java.util.LinkedList;
import java.util.List;

public class LinkedList_Test {
    //create a linkedlist of elements type fruit
    LinkedList<String> lkl_fruit = new LinkedList<>(List.of("aple", "banana", "orange", "lemon", "pineaple"));

    public void operate_in_LinkedList(){
        lkl_fruit.push("cashew");//insert a elemente in begin of likedlist
        System.out.println(lkl_fruit);
        lkl_fruit.poll();//remove first element "cashew"of likedlist
        System.out.println(lkl_fruit);
        lkl_fruit.addFirst("mango");//add element "mango" in begin 
        lkl_fruit.addLast("cherry");//add element "cherry" in end
        System.out.println(lkl_fruit);
    }
}
