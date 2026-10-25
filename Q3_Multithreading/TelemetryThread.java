public class TelemetryThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Telemetry: " + i);

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Telemetry task finished.");
    }
}