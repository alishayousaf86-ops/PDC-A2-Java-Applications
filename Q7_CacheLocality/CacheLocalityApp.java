public class CacheLocalityApp {
    public static void main(String[] args) {
        int[][] a = new int[2000][2000];
        for (int i = 0; i < 2000; i++)
            for (int j = 0; j < 2000; j++)
                a[i][j] = i + j;
        long sum = 0, start, rowTime, colTime;
        start = System.nanoTime();
        for (int i = 0; i < 2000; i++)
            for (int j = 0; j < 2000; j++)
                sum += a[i][j];
        rowTime = System.nanoTime() - start;
        sum = 0;
        start = System.nanoTime();
        for (int j = 0; j < 2000; j++)
            for (int i = 0; i < 2000; i++)
                sum += a[i][j];
        colTime = System.nanoTime() - start;
        System.out.println("Row-major: " + rowTime + " ns");
        System.out.println("Column-major: " + colTime + " ns");
    }
}
