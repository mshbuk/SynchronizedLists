package fop.w12synch;

import java.util.LinkedList;
import java.util.List;

public class SynchronizedList<T> {
    private List<T> innerList = new LinkedList<>();
    private RW rw;
    public void add(int index, T e) throws InterruptedException {
        rw.startWrite();
        innerList.add(index, e);
        rw.endWrite();
    }

    public T remove(int index) throws InterruptedException {
        return innerList.remove(index);
    }

    public T get(int index) throws InterruptedException {
        return innerList.get(index);
    }

    public boolean contains(T e) throws InterruptedException {
        return innerList.contains(e);
    }
}
