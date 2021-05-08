package third.comparisonCollections;

import java.util.*;

public class CompCollections {
    private final int size = 100_000;

    // task a
    private LinkedList<Integer> linkedList;
    private ArrayList<Integer> arrayList;

    // task b)
    private HashSet<Integer> hashSet;
    private LinkedHashSet<Integer> linkedHashSet;
    private TreeSet<Integer> treeSet;

    // task c)
    private HashMap<Integer, Integer> hashMap;
    private LinkedHashMap<Integer, Integer> linkedHashMap;
    private TreeMap<Integer, Integer> treeMap;

    // task a)
    // add - methods
    // for LinkedList
    public void testAddForLinkedList() {
        long startTime;
        long estimatedTime;
        linkedList = new LinkedList<>();

        System.out.println("\nInsert in begin.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.addFirst(19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addFirst-method: " + estimatedTime);

        System.out.println("Insert in end.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.addLast(19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for addLast-method: " + estimatedTime);

        System.out.println("Insert in middle.");
        startTime = System.nanoTime();
        for (int i = size; i < 2*size; ++i) {
            linkedList.add(i, 19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for add-method: " + estimatedTime);
    }
    // for ArrayList
    public void testAddForArrayList() {
        long startTime;
        long estimatedTime;
        arrayList = new ArrayList<>();

        System.out.println("\nInsert in begin.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.add(0,19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for addFirst-method: " + estimatedTime);

        System.out.println("Insert in end.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.add(arrayList.size()-1,19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for addLast-method: " + estimatedTime);

        System.out.println("Insert in middle.");
        startTime = System.nanoTime();
        for (int i = size; i < 2*size; ++i) {
            arrayList.add(i, 19);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for add-method: " + estimatedTime);
    }
    // get - methods
    // for LinkedList
    public void testGetForLinkedList() {
        long startTime;
        long estimatedTime;
        if (linkedList == null) {
            testAddForLinkedList();
        }

        System.out.println("\nGet.");
        startTime = System.nanoTime();
        for (int i = 0; i < 3*size; ++i) {
            linkedList.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for get-method: " + estimatedTime);
    }
    // for LinkedList
    public void testGetForArrayList() {
        long startTime;
        long estimatedTime;
        if (arrayList == null) {
            testAddForArrayList();
        }

        System.out.println("\nGet.");
        startTime = System.nanoTime();
        for (int i = 0; i < 3*size; ++i) {
            arrayList.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for get-method: " + estimatedTime);
    }
    // remove - methods
    // for LinkedList
    public void testRemoveForLinkedList() {
        long startTime;
        long estimatedTime;
        if (linkedList == null) {
            testAddForLinkedList();
        }

        System.out.println("\nRemoving from the middle.");
        startTime = System.nanoTime();
        for (int i = size; i < 2*size; ++i) {
            linkedList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for remove-method: " + estimatedTime);

        System.out.println("Removing from the begin.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.removeFirst();
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for remove-method: " + estimatedTime);

        System.out.println("Removing from the end.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.removeLast();
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList. Time for remove-method: " + estimatedTime);
    }
    // for ArrayList
    public void testRemoveForArrayList() {
        long startTime;
        long estimatedTime;
        if (arrayList == null) {
            testAddForArrayList();
        }

        System.out.println("\nRemoving from the middle.");
        startTime = System.nanoTime();
        for (int i = size; i < 2*size; ++i) {
            arrayList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for remove-method: " + estimatedTime);

        System.out.println("Removing from the begin.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for remove-method: " + estimatedTime);

        System.out.println("Removing from the end.");
        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            arrayList.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList. Time for remove-method: " + estimatedTime);
    }

    // task b)
    // add - methods
    // for HashSet
    public void testAddForHashSet() {
        long startTime;
        long estimatedTime;
        hashSet = new HashSet<>();

        System.out.println("\nInsert.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashSet.add(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet. Time for add-method: " + estimatedTime);
    }
    // for LinkedHashSet
    public void testAddForLinkedHashSet() {
        long startTime;
        long estimatedTime;
        linkedHashSet = new LinkedHashSet<>();

        System.out.println("\nInsert.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashSet.add(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet. Time for add-method: " + estimatedTime);
    }
    // for TreeSet
    public void testAddForTreeSet() {
        long startTime;
        long estimatedTime;
        treeSet = new TreeSet<>();

        System.out.println("\nInsert.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeSet.add(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet. Time for add-method: " + estimatedTime);
    }
    // contains - methods
    // for HashSet
    public void testContainsForHashSet() {
        long startTime;
        long estimatedTime;
        if (hashSet.size() == 0) {
            testAddForHashSet();
        }

        System.out.println("\nChecking to begin with 0-element.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashSet.contains(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet. Time for contains-method: " + estimatedTime);
    }
    // for LinkedHashSet
    public void testContainsForLinkedHashSet() {
        long startTime;
        long estimatedTime;
        if (linkedHashSet.size() == 0) {
            testAddForLinkedHashSet();
        }

        System.out.println("\nChecking to begin with 0-element.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashSet.contains(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet. Time for contains-method: " + estimatedTime);
    }
    // for TreeSet
    public void testContainsForTreeSet() {
        long startTime;
        long estimatedTime;
        if (treeSet.size() == 0) {
            testAddForTreeSet();
        }

        System.out.println("\nChecking to begin with 0-element.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeSet.contains(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet. Time for contains-method: " + estimatedTime);
    }
    // contains - methods
    // for HashSet
    public void testRemoveForHashSet() {
        long startTime;
        long estimatedTime;
        if (hashSet.size() == 0) {
            testAddForHashSet();
        }

        System.out.println("\nRemove.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashSet.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet. Time for remove-method: " + estimatedTime);
    }
    // for LinkedHashSet
    public void testRemoveForLinkedHashSet() {
        long startTime;
        long estimatedTime;
        if (linkedHashSet.size() == 0) {
            testAddForHashSet();
        }

        System.out.println("\nRemove.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashSet.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet. Time for remove-method: " + estimatedTime);
    }
    // for TreeSet
    public void testRemoveForTreeSet() {
        long startTime;
        long estimatedTime;
        if (treeSet.size() == 0) {
            testAddForHashSet();
        }

        System.out.println("\nRemove.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeSet.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet. Time for remove-method: " + estimatedTime);
    }

    // task c)
    // add - methods
    // for HashMap
    public void testAddForHashMap() {
        long startTime;
        long estimatedTime;
        hashMap = new HashMap<>();

        System.out.println("\nInsert.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashMap.put(i,i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap. Time for add-method: " + estimatedTime);
    }
    // for LinkedHashMap
    public void testAddForLinkedHashMap() {
        long startTime;
        long estimatedTime;
        linkedHashMap = new LinkedHashMap<>();

        System.out.println("\nInsert.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashMap.put(i,i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap. Time for add-method: " + estimatedTime);
    }
    // for TreeMap
    public void testAddForTreeMap() {
        long startTime;
        long estimatedTime;
        treeMap = new TreeMap<>();

        System.out.println("\nInsert.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeMap.put(i,i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap. Time for add-method: " + estimatedTime);
    }
    // get - methods
    // for HashMap
    public void testGetForHashMap() {
        long startTime;
        long estimatedTime;
        if (hashMap.isEmpty()) {
            testAddForHashMap();
        }

        System.out.println("\nGet.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashMap.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap. Time for get-method: " + estimatedTime);
    }
    // for LinkedHashMap
    public void testGetForLinkedHashMap() {
        long startTime;
        long estimatedTime;
        if (linkedHashMap.isEmpty()) {
            testAddForLinkedHashMap();
        }

        System.out.println("\nGet.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashMap.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap. Time for get-method: " + estimatedTime);
    }
    // for TreeMap
    public void testGetForTreeMap() {
        long startTime;
        long estimatedTime;
        if (treeMap.isEmpty()) {
            testAddForTreeMap();
        }

        System.out.println("\nGet.");
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeMap.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap. Time for get-method: " + estimatedTime);
    }
    // remove - methods
    // for HashMap
    public void testRemoveForHashMap() {
        long startTime;
        long estimatedTime;
        if (hashMap.isEmpty()) {
            testAddForHashMap();
        }

        System.out.println("\nRemove.");
        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            hashMap.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap. Time for remove-method: " + estimatedTime);
    }
    // for LinkedHashMap
    public void testRemoveForLinkedHashMap() {
        long startTime;
        long estimatedTime;
        if (linkedHashMap.isEmpty()) {
            testAddForLinkedHashMap();
        }

        System.out.println("\nRemove.");
        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            linkedHashMap.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap. Time for remove-method: " + estimatedTime);
    }
    // for TreeMap
    public void testRemoveForTreeMap() {
        long startTime;
        long estimatedTime;
        if (treeMap.isEmpty()) {
            testAddForTreeMap();
        }

        System.out.println("\nRemove.");
        startTime = System.nanoTime();
        for (int i = size-1; i >= 0; --i) {
            treeMap.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap. Time for remove-method: " + estimatedTime);
    }
}
