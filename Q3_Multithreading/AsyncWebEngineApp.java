public class AsyncWebEngineApp {
    public static void main(String[] args) {
        Thread log = new Thread(new LogProcessorTask());
        TelemetryThread telemetry = new TelemetryThread();
        log.setName("LogThread");
        telemetry.setName("TelemetryThread");
        log.start();
        telemetry.start();
    }
}
