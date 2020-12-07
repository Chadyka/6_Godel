package ArrayLinked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        long arrayAddTime = System.nanoTime();
        System.out.println("ArrayList added 4 elements in:  " + (arrayAddTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        long linkAddTime = System.nanoTime();
        System.out.println("LinkedList added 4 elements in: " + (linkAddTime - startTime) + " nanoseconds");
        System.out.println();
        startTime = System.nanoTime();


        String aArray = arrayList.get(0);
        String bArray = arrayList.get(1);
        String cArray = arrayList.get(2);
        String dArray = arrayList.get(3);

        long arrayQueryTime = System.nanoTime();
        System.out.println("ArrayList queried 4 elements in:  " + (arrayQueryTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();

        String aLinked = linkedList.get(0);
        String bLinked = linkedList.get(1);
        String cLinked = linkedList.get(2);
        String dLinked = linkedList.get(3);

        long linkQueryTime = System.nanoTime();
        System.out.println("LinkedList queried 4 elements in: " + (linkQueryTime - startTime) + " nanoseconds");
        System.out.println();
        startTime = System.nanoTime();

        Collections.sort(arrayList);

        long arraySortTime = System.nanoTime();
        System.out.println("ArrayList sorted 4 elements in:  " + (arraySortTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();

        Collections.sort(linkedList);

        long linkSortTime = System.nanoTime();
        System.out.println("LinkedList sorted 4 elements in: " + (linkSortTime - startTime) + " nanoseconds");
        System.out.println();
        startTime = System.nanoTime();

        arrayList.forEach(System.out::print);

        long arrayPrintTime = System.nanoTime();
        System.out.println("\n ArrayList printed 4 elements in: " + (arrayPrintTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();

        linkedList.forEach(System.out::print);

        long linkPrintTime = System.nanoTime();
        System.out.println("\n LinkedList printed 4 elements in: " + (linkPrintTime - startTime) + " nanoseconds");
        System.out.println();
        startTime = System.nanoTime();

        arrayList.remove("A");
        arrayList.remove("B");
        arrayList.remove("C");
        arrayList.remove("D");

        long arrayRemoveTime = System.nanoTime();
        System.out.println("ArrayList removed 4 elements in:  " + (arrayRemoveTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();

        linkedList.remove("A");
        linkedList.remove("B");
        linkedList.remove("C");
        linkedList.remove("D");

        long linkRemoveTime = System.nanoTime();
        System.out.println("LinkedList removed 4 elements in: " + (linkRemoveTime - startTime) + " nanoseconds");
        System.out.println();
        startTime = System.nanoTime();


    }
}
