package fop.w12synch;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SynchronizedList<T> {
   // private ReadWriteLock relock = new ReentrantReadWriteLock();

    private List<T> innerList = new LinkedList<>();

    private RW rw;

    public void add(int index, T e) throws InterruptedException {
        rw.startWrite();
        innerList.add(index, e);
        rw.endWrite();
    }

    public T remove(int index) throws InterruptedException {
        rw.startWrite();
        T result = innerList.remove(index);
        rw.endWrite();
        return result;
    }

    public T get(int index) throws InterruptedException {
        rw.startRead();
        T result = innerList.get(index);
        rw.endRead();
        return result;
    }

    public boolean contains(T e) throws InterruptedException {
        rw.startRead();
        boolean result =  innerList.contains(e);
        rw.endRead();
        return result;
    }
}
