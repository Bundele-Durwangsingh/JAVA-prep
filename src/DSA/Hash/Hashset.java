package DSA.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        setOperation();

    }

    static void setOperation() {
        HashSet<Integer> set = new HashSet<>();
        // Adding element in set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        // Printing set
        System.out.println(set);
        // Printing size of set
        System.out.println(set.size());
        // Delete element from set
        set.remove(4);
        System.out.println(set);

        // search in set
        if (set.contains(1)) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
        // iterator in set
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "-");
        }
        System.out.println();
        // isEmpty
        if (!set.isEmpty()) {
            System.out.println("Set contain data");
        }
    }

}
