public abstract class SensorSearch extends Thread {
    int[] data;
    int start, end;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    SensorSearch(int[] d, int s, int e) {
        data = d;
        start = s;
        end = e;
    }
    public void run() {
        for (int i = start; i < end; i++) {
            if (data[i] < min) min = data[i];
            if (data[i] > max) max = data[i];
        }
    }
}
