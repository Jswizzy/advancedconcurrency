package locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMain {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            //lock.lockInterruptibly();

            //do something
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }
}
