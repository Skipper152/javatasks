package third.myCollections;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

    private class Node<E> {
        private E element;
        private Node<E> prevNode = null;
        private Node<E> nextNode = null;

        Node(E element, Node<E> prevNode, Node<E> nextNode) {
            this.element = element;
            this.prevNode = prevNode;
            this.nextNode = nextNode;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> curr = first;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public E next() {
                E element = curr.element;
                curr = curr.nextNode;
                return element;
            }
        };
    }

    private Node<E> first = null;
    private Node<E> last = null;
    private int size = 0;

    @Override
    public void addToBegin(E element) {
        Node<E> node = new Node<>(element, null, first);
        if (first == null) {
            last = node;
        } else {
            first.prevNode = node;
        }
        first = node;
        size++;
    }

    @Override
    public void addToEnd(E element) {
        Node<E> node = new Node<>(element, last, null);
        if (last == null) {
            first = node;
        } else {
            last.nextNode = node;
        }
        last = node;
        size++;
    }

    private Node<E> indexNode(int index) {
        Node<E> node = first;
        for (int i = 0; i < index; ++i) {
            node = node.nextNode;
        }
        return node;
    }

    private Node<E> indexNodeLast(int index) {
        Node<E> node = last;
        for (int i = size; i < index; --i) {
            node = node.prevNode;
        }
        return node;
    }

    @Override
    public void add(int index, E element) {
        if (index >= size) {
            addToEnd(element);
        } else if (index > 0) {
            Node<E> node = indexNode(index);
            Node<E> tr = new Node<>(element, node.prevNode, node);
            node.prevNode.nextNode = tr;
            node.prevNode = tr;
            size++;
        } else {
            addToBegin(element);
        }
    }

    @Override
    public void clear() {
        for (Node<E> node = first; node != null;) {
            Node<E> tr = node.nextNode;
            node.nextNode = null;
            node.prevNode = null;
            node.element = null;
            node = tr;
        }
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (size > index && index >= 0) {
            if (index > size / 2) {
                return indexNodeLast(index).element;
            } else {
                return indexNode(index).element;
            }
        } else return null;
    }

    @Override
    public int indexOf(E element) {
        int i = 0;
        Node<E> node = first;
        while (node != null && node.element != element) {
            node = node.nextNode;
            i++;
        }
        if (node != null)
            return i;
        return -1;
    }

    @Override
    public E remove(int index) {
        if (size > index && index >= 0) {
            Node<E> deleteNode;
            if (index == 0) {
                deleteNode = first;
                first = first.nextNode;
            } else if (index == size - 1) {
                deleteNode = last;
                last = last.prevNode;
                last.nextNode = null;
            } else {
                deleteNode = indexNode(index);
                deleteNode.prevNode.nextNode = deleteNode.nextNode;
                deleteNode.nextNode.prevNode = deleteNode.prevNode;
            }
            E element = deleteNode.element;
            deleteNode.element = null;
            deleteNode.nextNode = null;
            size--;
            return element;
        } else return null;
    }

    @Override
    public E set(int index, E newElement) {
        if (size > index) {
            Node<E> node = indexNode(index);
            E oldElement = node.element;
            node.element = newElement;
            return oldElement;
        } else return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length < size)
            a = (E[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = (Node<E>) first; x != null; x = x.nextNode) {
            result[i++] = x.element;
        }

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (E i : this) {
            str.append(i);
            str.append(" ");
        }
        return str.toString();
    }
}
