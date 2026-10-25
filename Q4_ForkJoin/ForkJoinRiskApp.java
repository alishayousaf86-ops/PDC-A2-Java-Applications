import java.util.concurrent.ForkJoinPool;

public class ForkJoinRiskApp {
    public static void main(String[] args) {
        double[] risks = new double[10000];

        for (int i = 0; i < risks.length; i++) {
            risks[i] = i * 0.5;
        }

        ForkJoinPool pool = new ForkJoinPool();

        RiskCalculator task = new RiskCalculator(risks, 0, risks.length);

        double result = pool.invoke(task);

        System.out.println("Total Risk: " + result);
        System.out.println("ForkJoin calculation completed.");

        pool.shutdown();
    }
}