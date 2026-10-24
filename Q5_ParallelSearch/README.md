# Q5 - Parallel Min Max Search

## Purpose
This application finds the minimum and maximum values using multiple threads.

## Working
- An array stores 50,000 values.
- Four threads process separate sections of the array.
- Each thread finds its local minimum and maximum.
- join() waits for each thread to finish.
- The final minimum and maximum are displayed.

## Expected Output
Minimum: 0
Maximum: 999
