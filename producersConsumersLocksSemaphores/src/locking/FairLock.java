package locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLock {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock(true); //fair
        try {
            lock.lock();
            // guard block of code
        } finally {
            lock.unlock();
        }
    }
}
