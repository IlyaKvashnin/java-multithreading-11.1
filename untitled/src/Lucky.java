public class Lucky {
    static int x = 0;
    static int count = 0;

    static class LuckyThread extends Thread {
        @Override
        public void run() {
            synchronized (Lucky.class) {
                while (x < 999999) {
                    x++;
                    if ((x % 10) + (x / 10) % 10 + (x / 100) % 10 == (x / 1000)
                            % 10 + (x / 10000) % 10 + (x / 100000) % 10) {
                        System.out.println(x);
                        count++;
                    }
                }
            }
        }
    }
}