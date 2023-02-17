import java.util.Stack;  
public class MyClass {
    public static void main(String args[]) {
        Stack<Integer> stk= new Stack<>();  
        boolean result = stk.empty(); //check is the stack is empty 
        System.out.println("stack empty? " + result);  
        stk.push(10);  // adding an element
        stk.push(20); 
        stk.push(30);
        stk.push(40);
        //stk.pop(); // dalete an element
        System.out.println("Elements in Stack: " + stk);  
        result = stk.empty();
        System.out.println("stack empty? " + result);  
        int fruits = stk.peek();  // Access element from the top of the stack  
        System.out.println("Element at top: " + fruits);  
        int location = stk.search();  
        System.out.println("Location of Dell: " + location); 
        int x=stk.size();  
        System.out.println("The stack size is: "+x);  

    }
}