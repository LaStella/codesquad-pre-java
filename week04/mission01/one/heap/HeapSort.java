package week04.mission01.one.heap;

import java.util.*;

public class HeapSort<E> {
    private int size;
    private Object[] elementData;

    private final Comparator<? super E> comparator;
    private static final int DEFAULT_CAPACITY = 10;

    public HeapSort() {
        this(DEFAULT_CAPACITY, null);
    }
    
    public HeapSort(Comparator<? super E> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public HeapSort(int initialCapacity,
                         Comparator<? super E> comparator) {
        if (initialCapacity < 1)
            throw new IllegalArgumentException();
        this.elementData = new Object[initialCapacity];
        this.comparator = comparator;
    }

    public void insertHeap(E e) {
        if (size + 1 == elementData.length) {
            grow();
        }

        siftUp(size + 1, e);
        size++;
    }

    private void siftUp(int k, E x) {
        if (comparator != null)
            siftUpUsingComparator(k, x, elementData, comparator);
        else
            siftUpComparable(k, x, elementData);
    }

    private void siftUpComparable(int index, E element, Object[] ed) {
        Comparable<? super E> cmp = (Comparable<? super E>) element;

        // root노드까지 탐색합니다.
        while (index > 1) {
            int parent = getParent(index);
            Object parentElement = ed[parent];

            // 삽입하려는 원소가 부모보다 크면 중단합니다.
            if (cmp.compareTo((E) parentElement) >= 0)
                break;
            /*
            삽입하려는 원소가 부모노드보다 작으므로
            부모노드와 삽입하려는 노드의 위치를 서로 뒤바꿔줍니다.
             */
            ed[index] = parentElement;
            index = parent;
        }
        ed[index] = cmp;
    }

    private void siftUpUsingComparator(
            int index, E element, Object[] ed, Comparator<? super E> cmp) {
        while (index > 1) {
            int parent = getParent(index);
            Object parentElement = ed[parent];

            // 삽입하려는 원소와 값을 비교하여 삽입을 위치를 찾습니다.
            if (cmp.compare(element, (E) parentElement) >= 0)
                break;
            ed[index] = parentElement;
            index = parent;
        }
        ed[index] = element;
    }

    //트리의 크기를 정해진 크기로 늘리는 메소드입니다.
    private Object[] grow(int newCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0) {
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, newCapacity)];
        }
    }

    // 트리의 크기를 2배 늘리는 메소드입니다.
    private Object[] grow() {
        return grow(size * 2);
    }

    private int getParent(int index){
        return index / 2;
    }

    private int getLeftChild(int index){
        return index * 2;
    }

    private int getRightChild(int index){
        return index * 2 + 1;
    }

    public E peek() {
        return (E) elementData[1];
    }

    public void printHeap() {
        for (int i = 1 ; i <= size ; i++) {
            System.out.print("[" + elementData[i] + "] ");
        }
    }

    public int getHeapSize() {
        return size;
    }

    public E deleteHeap() {
        if (elementData[1] == null) {
            throw new NoSuchElementException();
        }

        E result = (E) elementData[1];
        siftDown(1, (E) elementData[size]);



        return result;
    }

    private void siftDown(int k, E x) {
        elementData[size] = null;
        size--;

        if (comparator != null)
            siftDownUsingComparator(k, x, elementData, comparator);
        else
            siftDownComparable(k, x, elementData);
    }

    private void siftDownComparable(int index, E element, Object[] ed) {
        Comparable<? super E> cmp = (Comparable<? super E>) element;

        int child;

        // 왼쪽 자식이 존재하는 동안 반복합니다.
        while ((child = getLeftChild(index)) <= size) {
            int right = getRightChild(index);
            Object childElement = ed[child];

            /*
            오른쪽 자식이 존재하며 왼쪽 자식이 오른쪽 자식보다 큰 경우
            자식을 왼쪽 자식에서 오른쪽 자식으로 변경합니다.
             */
            if (right <= size && ((Comparable<? super E>)childElement).compareTo((E) ed[right]) > 0) {
                child = right;
                childElement = ed[right];
            }

            // 삽입하려는 원소가 자식보다 작으면 중단합니다.
            if (cmp.compareTo((E) childElement) < 0)
                break;
            /*
            삽입하려는 원소가 자식노드보다 크므로
            자식노드와 삽입하려는 노드의 위치를 서로 뒤바꿔줍니다.
             */
            ed[index] = childElement;
            index = child;
        }

        ed[index] = cmp;
    }

    private void siftDownUsingComparator(
            int index, E element, Object[] ed, Comparator<? super E> cmp) {
        int child;

        // 왼쪽 자식이 존재하는 동안 반복합니다.
        while ((child = getLeftChild(index)) <= size) {
            int right = getRightChild(index);
            Object childElement = ed[child];

            /*
            오른쪽 자식이 존재하며 왼쪽 자식이 오른쪽 자식보다 큰 경우(비교 기준 Comparator)
            자식을 왼쪽 자식에서 오른쪽 자식으로 변경합니다.
             */
            if (right <= size && cmp.compare((E) childElement, (E) ed[right]) > 0) {
                child = right;
                childElement = ed[right];
            }

            // 삽입하려는 원소가 자식보다 작으면 중단합니다.
            if (cmp.compare(element, (E) childElement) < 0)
                break;
            /*
            삽입하려는 원소가 자식노드보다 크므로
            자식노드와 삽입하려는 노드의 위치를 서로 뒤바꿔줍니다.
             */
            ed[index] = childElement;
            index = child;
        }

        ed[index] = element;
    }
}
