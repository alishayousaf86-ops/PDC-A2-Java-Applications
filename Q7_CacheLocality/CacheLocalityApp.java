public class CacheLocalityApp {
    public static void main(String[] args) {
        int[][] a = new int[2000][2000];

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                a[i][j] = i + j;
            }
        }

        long sum1 = 0, sum2 = 0;
        long start, rowTime, colTime;

        start = System.nanoTime();
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                sum1 += a[i][j];
            }
        }
        rowTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int j = 0; j < 2000; j++) {
            for (int i = 0; i < 2000; i++) {
                sum2 += a[i][j];
            }
        }
        colTime = System.nanoTime() - start;

        System.out.println("Row-major: " + rowTime + " ns");
        System.out.println("Column-major: " + colTime + " ns");
        System.out.println("Sums equal: " + (sum1 == sum2));

        if (rowTime < colTime) {
            System.out.println("Row-major was faster.");
        } else if (colTime < rowTime) {
            System.out.println("Column-major was faster.");
        } else {
            System.out.println("Both took the same time.");
        }
    }
}