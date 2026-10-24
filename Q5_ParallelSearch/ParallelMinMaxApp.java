public class ParallelMinMaxApp {
    public static void main(String[] args) throws Exception {
long startTime = System.nanoTime();
        int[] data = new int[50000];
        for (int i = 0; i < data.length; i++)
            data[i] = i % 1000;
        SensorSearch[] t = new SensorSearch[4];
        for (int i = 0; i < 4; i++) {
            final int start = i * 12500;
            final int end = start + 12500;
            t[i] = new SensorSearch(data, start, end) {};
            t[i].start();
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (SensorSearch s : t) {
            s.join();
            min = Math.min(min, s.min);
            max = Math.max(max, s.max);
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
System.out.println("Execution Time: " + (System.nanoTime() - startTime) + " ns");
    }
}
