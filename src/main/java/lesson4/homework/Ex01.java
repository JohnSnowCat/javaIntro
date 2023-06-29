package lesson4.homework;

import java.util.*;

public class Ex01 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rn = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rn.nextInt(-10, 10));
        }
        System.out.println("Original list is: " + list);

        //Options 1
        LinkedList<Integer> resList = new LinkedList<>();
        Iterator x = list.descendingIterator();
        while (x.hasNext())
            resList.add((Integer) x.next());
        System.out.println("Modified list is: " + resList);

        //Options 2
        LinkedList<Integer> resList1 = new LinkedList<>();
        LinkedList<Integer> temp = (LinkedList<Integer>) list.clone();
        int sizeOfList = list.size();
        for (int i = 0; i < sizeOfList; i++) {
            resList1.add(temp.removeLast());
        }
        System.out.println("Modified list is: " + resList1);

        //Option 3
        LinkedList<Integer> resList2;
        temp = (LinkedList<Integer>) list.clone();
        Collections.reverse(temp);
        resList2 = (LinkedList) temp.clone();
        System.out.println("Modified list is: " + resList2);

        //Option 4
        Deque<Integer> resList3 = new LinkedList<>();

        int size = list.size();
        for (int i = 0; i < size; i++) {
            resList3.addFirst(temp.removeLast());
        }
        System.out.println("Modified list is: " + resList3);

        //Option 5
        Deque<Integer> resList4 = new LinkedList<>();
        for (Integer i : list) {
            resList4.addFirst(i.intValue());
        }
        System.out.println("Modified list is: " + resList4);

        //Option 6
        LinkedList<Integer> resList5 = new LinkedList<>();
        for (int i = list.size(); i > 0; i--) {
            resList5.addFirst(list.pollLast());
        }
        System.out.println("Modified list is: " + resList5);
    }
}
