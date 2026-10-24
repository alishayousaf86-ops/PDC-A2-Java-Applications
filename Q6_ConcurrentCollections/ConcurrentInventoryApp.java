import java.util.*;
import java.util.concurrent.*;
public class ConcurrentInventoryApp {
    static long test(Map<Integer, Integer> map) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        long start = System.nanoTime();
        for (int t = 0; t < 4; t++) {
            final int id = t;
            pool.submit(() -> {
                for (int i = 0; i < 10000; i++)
                    map.put(id * 10000 + i, i);
            });
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return System.nanoTime() - start;
    }
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> safeMap =
            Collections.synchronizedMap(new HashMap<>());
        Map<Integer, Integer> fastMap = new ConcurrentHashMap<>();
        System.out.println("Synchronized Map: " + test(safeMap) + " ns");
        System.out.println("Concurrent Map: " + test(fastMap) + " ns");
        System.out.println("Items: " + safeMap.size() + ", " + fastMap.size());
    }
}
