# Q3 - Multithreading Application

## Purpose
This application demonstrates concurrent execution in Java.

## Working
- LogProcessorTask implements Runnable.
- TelemetryThread extends Thread.
- Two threads execute independently.
- Thread.sleep() adds a delay between messages.
- The output shows messages from both threads.

## Result
Both log and telemetry messages are displayed.
Their order may vary because threads run concurrently.
