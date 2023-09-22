import java.util.Stack;

public class Stack_Test {
    Stack<String> stack_car = new Stack<>();

    public void operator_in_Stack(){
        stack_car.push("Gol");//insert element in stack
        stack_car.push("Civic");// this element is above 
        stack_car.push("Fokus");// this element is in top of stack
        String collect = String.join("-", stack_car); //make a colection the elements of stack
        System.out.println(collect);
        stack_car.pop();//remove the element of top
        collect = String.join("-", stack_car);
        System.out.println(collect);
    }

}
