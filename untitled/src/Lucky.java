import java.util.concurrent.atomic.AtomicInteger;

public class Lucky {
    static AtomicInteger luckyX = new AtomicInteger(0);
    static AtomicInteger count = new AtomicInteger(0);
    static class LuckyThread extends Thread {
        @Override
        public void run() {
                while (luckyX.get() < 999999) {
                    final int x = luckyX.incrementAndGet();
                    if ((x % 10) + (x / 10) % 10 + (x / 100) % 10 == (x / 1000)
                            % 10 + (x / 10000) % 10 + (x / 100000) % 10) {
                        System.out.println(x);
                        count.incrementAndGet();
                    }
                }
        }
    }
}