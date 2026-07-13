import java.util.*;

public class stack {
    public static void main(String arg[]) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(11);
        list.push(12);
        list.push(13);
        System.out.println(list);
        list.pop();
        System.out.println(list);
       list.empty();
       System.out.println(list);
    }
}
