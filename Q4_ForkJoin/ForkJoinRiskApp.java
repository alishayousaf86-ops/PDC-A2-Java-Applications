import java.util.concurrent.ForkJoinPool;
public class ForkJoinRiskApp {
    public static void main(String[] args) {
        double[] values = new double[10000];
        for (int i = 0; i < values.length; i++)
            values[i] = i * 0.5;
        long start = System.nanoTime();
        double risk = new ForkJoinPool().invoke(
            new RiskCalculator(values, 0, values.length));
        System.out.println("Total Risk: " + risk);
        System.out.println("Time: " + (System.nanoTime() - start) + " ns");
    }
}
