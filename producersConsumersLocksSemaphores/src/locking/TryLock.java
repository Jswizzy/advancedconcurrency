package locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        if (lock.tryLock()) {
            try {
                //guard block of code
            } finally {
                lock.unlock();
            }
        } else { //... }
        }
    }
}
