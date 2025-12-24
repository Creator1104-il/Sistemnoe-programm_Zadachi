import java.util.concurrent.atomic.AtomicInteger;

/**
 * Класс для инкрементирования общей переменной
 */

public class InterferenceThread extends Thread {
    private final InterferenceExample checker;
    private static AtomicInteger i = new AtomicInteger(0);
    InterferenceThread(InterferenceExample checker) {
        this.checker = checker;
    }

    private void increment() {
        i.incrementAndGet();
    }

    synchronized int getI() {
        return i.get();
    }

    public void run() {
        while (!checker.stop()) {
            increment();
        }
    }
}
