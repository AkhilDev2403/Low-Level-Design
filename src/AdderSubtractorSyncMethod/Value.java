package AdderSubtractorSyncMethod;

public class Value {
    public int value;

    synchronized void incrementBy(int i){
        this.value+=i;
    }

    synchronized void decrementBy(int i){
        this.value-=i;
    }
}
