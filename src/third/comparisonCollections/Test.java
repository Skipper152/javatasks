package third.comparisonCollections;


public class Test {
    public static void main(String[] args) {

        // task a)
        CompCollections compCollections1 = new CompCollections();
        // add - methods
        compCollections1.testAddForLinkedList();
        compCollections1.testAddForArrayList();
        // get - methods
        compCollections1.testGetForLinkedList();
        compCollections1.testGetForArrayList();
        // remove - methods
        compCollections1.testRemoveForLinkedList();
        compCollections1.testRemoveForArrayList();


        // task b)
        CompCollections compCollections2 = new CompCollections();
        // add - methods
        compCollections2.testAddForHashSet();
        compCollections2.testAddForLinkedHashSet();
        compCollections2.testAddForTreeSet();
        // contains - methods
        compCollections2.testContainsForHashSet();
        compCollections2.testContainsForLinkedHashSet();
        compCollections2.testContainsForTreeSet();
        // remove - methods
        compCollections2.testRemoveForHashSet();
        compCollections2.testRemoveForLinkedHashSet();
        compCollections2.testRemoveForTreeSet();


        // task c)
        CompCollections compCollections3 = new CompCollections();
        // add - methods
        compCollections3.testAddForHashMap();
        compCollections3.testAddForLinkedHashMap();
        compCollections3.testAddForTreeMap();
        // get - methods
        compCollections3.testGetForHashMap();
        compCollections3.testGetForLinkedHashMap();
        compCollections3.testGetForTreeMap();
        // remove - methods
        compCollections3.testRemoveForHashMap();
        compCollections3.testRemoveForLinkedHashMap();
        compCollections3.testRemoveForTreeMap();

    }
}
