# Q6 - Concurrent Collections

## Purpose
This application compares a synchronized HashMap with ConcurrentHashMap.

## Working
- Four threads insert data into each map.
- Each thread inserts 10,000 items.
- The program measures execution time using System.nanoTime().
- The final map sizes are printed to verify the results.

## Expected Result
Both maps should contain 40,000 items.
Execution times can vary between runs.
