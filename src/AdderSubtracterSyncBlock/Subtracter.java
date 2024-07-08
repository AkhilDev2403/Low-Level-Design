package AdderSubtracterSyncBlock;

import java.util.concurrent.Callable;

public class Subtracter implements Callable<Void> {

    private Value v;

    public Subtracter(Value v) {
        this.v = v;
    }


    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 10000; i++) {

            // synchronized block
            synchronized (this.v) {
                this.v.value -= i;
            }

        }
        return null;
    }
}
