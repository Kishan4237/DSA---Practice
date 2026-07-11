import java.util.LinkedList;

public class linkedList {
    public static void main(String arg[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(13);
        list.add(14);
        list.add(105);
        list.add(103);
        System.out.println(list);
        list.remove(3);
        list.remove(3);
        System.out.println(list);

        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        System.out.println(li);
        li.addFirst(1);
        System.out.println(li);
        li.addLast(20);
        System.out.println(li);
        li.removeFirst();
        System.out.println(li.getFirst());
        System.out.println(li.peek());
        System.out.println(li);
        System.out.println(li.poll());
        System.out.println(li);
        li.offer(30);
        System.out.println(li);
        
    }
}