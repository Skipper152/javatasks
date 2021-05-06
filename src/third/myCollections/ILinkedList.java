package third.myCollections;

public interface ILinkedList<E> extends Iterable<E> {
    void addToBegin(E element);
    void addToEnd(E element);
    void add(int index, E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    E set(int index, E element);
    int size();

    @SuppressWarnings("unchecked")
    <E2> E2[] toArray(E2[] a);

    String toString();
}
