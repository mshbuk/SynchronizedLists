package fop.w12synch;

public class RW {
    public synchronized void startRead() throws InterruptedException {
        throw new RuntimeException("Not implemented");
    }

    public synchronized void endRead() {
        throw new RuntimeException("Not implemented");
    }

    public synchronized void startWrite() throws InterruptedException {
        throw new RuntimeException("Not implemented");
    }

    public synchronized void endWrite() {
        throw new RuntimeException("Not implemented");
    }
}
