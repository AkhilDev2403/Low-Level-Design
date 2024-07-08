package AdderSubtracterLock;

import AdderSubtractor.Value;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value v;
    private Lock lock;

    Adder(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i=1; i <= 10000; i++) {
            lock.lock();
            System.out.println("Adder" + i);
            this.v.value += i;
            lock.unlock();
        }

        return null;
    }
}
