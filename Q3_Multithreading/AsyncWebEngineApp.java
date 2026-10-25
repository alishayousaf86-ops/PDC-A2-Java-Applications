public class AsyncWebEngineApp {
    public static void main(String[] args) throws InterruptedException {
        Thread telemetry = new TelemetryThread();

        Thread log = new Thread(new LogProcessorTask());

        telemetry.start();
        log.start();

        telemetry.join();
        log.join();

        System.out.println("All tasks completed.");
    }
}