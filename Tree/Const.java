import java.util.*;

public class Const{
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> ts1 = new TreeSet<>();
        

        ts.add(3);
        ts.add(13);
        ts.add(53);
        ts.add(23);
        ts.add(13);
        ts.add(43);
        // Here ts.add will add the data in ascending order...
        System.out.println(ts);
        System.out.println(ts.ceiling(14));
        // Ceiling - - - It returns the equal or closest greatest element of the specified element from the set, or null there is no such element. 
        System.out.println(ts.comparator());
        // descendingSet() - - - It return the element in reverse order.
        System.out.println(ts.descendingSet());
        // floor - - - returns equal or closest least element
        System.out.println(ts.floor(5));
        // headSet gives group of elements less than that
        System.out.println(ts.headSet(23));
        //  It is same as above includes that element too...
        System.out.println(ts.headSet(23, true));
        // higher returns closest higher value or null if not exist
        System.out.println(ts.higher(23));

        System.out.println(ts.lower(23));

        System.out.println(ts.pollFirst());

        System.out.println(ts.pollLast());

        System.out.println(ts);

        ts.add(3);
        ts.add(53);

        System.out.println(ts.spliterator());

        Iterator<Integer> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // subSet incluides the lower number.
        System.out.println(ts.subSet(13, 43));

        System.out.println(ts.subSet(13, true, 43, true));

        System.out.println(ts.tailSet(23));

        System.out.println(ts.tailSet(23, false));

        System.out.println(ts.contains(23));

        System.out.println(ts.isEmpty());

        ts.remove(23);

        // ts.clear();
            // It removes all the elements
        System.out.println(ts);

        System.out.println(ts.size());
        System.out.println(ts.first());
        System.out.println(ts.last());

        ts1 = (TreeSet<Integer>)ts.clone();

        System.out.println(ts1);
    }
}