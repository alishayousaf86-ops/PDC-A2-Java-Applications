# Q3 Testing Notes

## Test Cases
1. Compile using javac *.java.
2. Run AsyncWebEngineApp.
3. Verify that log messages appear.
4. Verify that telemetry messages appear.
5. Observe that messages from both threads can interleave.

## Expected Result
Both threads print five messages. The order may vary between runs because they execute concurrently.
