import java.util.concurrent.RecursiveTask;
public class RiskCalculator extends RecursiveTask<Double> {
    double[] values;
    int start, end;
    RiskCalculator(double[] v, int s, int e) {
        values = v;
        start = s;
        end = e;
    }
    protected Double compute() {
        if (end - start <= 1000) {
            double sum = 0;
            for (int i = start; i < end; i++)
                sum += values[i];
            return sum;
        }
        int mid = (start + end) / 2;
        RiskCalculator a = new RiskCalculator(values, start, mid);
        RiskCalculator b = new RiskCalculator(values, mid, end);
        a.fork();
        double result = b.compute() + a.join();
        return result;
    }
}
