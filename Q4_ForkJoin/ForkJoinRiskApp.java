import java.util.concurrent.ForkJoinPool;
public class ForkJoinRiskApp {
    public static void main(String[] args) {
        double[] values = new double[10000];
        for (int i = 0; i < values.length; i++)
            values[i] = i * 0.5;
        long start = System.nanoTime();
        double risk = new ForkJoinPool().invoke(
            new RiskCalculator(values, 0, values.length));
        double normalSum = 0;
for (int i = 0; i < values.length; i++) {
    normalSum += values[i];
}

System.out.println("ForkJoin Risk: " + risk);
System.out.println("Normal Risk: " + normalSum);
System.out.println("Results Match: " + (risk == normalSum));        System.out.println("Time: " + (System.nanoTime() - start) + " ns");
    }
}
