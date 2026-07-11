package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class A {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);
    ArrayList<Integer> list2 = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.addAll(list2);
    System.out.println(list);
    list.removeAll(list2);
    System.out.println(list);



    Iterator<Integer> iterator = list.iterator();
    while(iterator.hasNext()){
      System.out.println("Element:" + iterator.next());


  
    }
        List<Integer> list3 = new ArrayList<>();
      list3.add(11);
      list3.add(12);
      list3.add(13);
      list3.add(14);
      System.out.println(list3);


      list3.set(0,100);
      System.out.println(list3);


      //toArray

      Object[] arr = list3.toArray();
      for(Object obj: arr){
        System.out.println(obj);
      }


      //Contains

      
      System.out.println(list3.contains(100));


      //sort
      Collections.sort((list));
      System.out.println(list);


      ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
      System.out.println(newList);
      ArrayList<Integer> marks = new ArrayList<>();
      marks.ensureCapacity(100);
      System.out.println(marks.isEmpty());
  }
}