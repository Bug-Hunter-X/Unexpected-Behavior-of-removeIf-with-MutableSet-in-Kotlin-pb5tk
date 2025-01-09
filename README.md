# Unexpected Behavior of removeIf with MutableSet in Kotlin

This repository demonstrates an unexpected behavior of the `removeIf` function when used with `MutableSet` in Kotlin.  The `removeIf` function works as expected with `MutableList`, removing all elements that satisfy the given predicate. However, with `MutableSet`, it behaves differently, potentially removing only a subset of the elements that should be removed. This behavior can lead to unexpected results and subtle bugs in your code.

The example code clearly shows the difference in behavior between `MutableList` and `MutableSet`. The solution provides an alternative method using `removeAll` which works correctly with both data structures.

## How to Reproduce
1. Clone this repository
2. Open the `bug.kt` file
3. Run the code
4. Observe the unexpected output from the `MutableSet`.
5. Compare it to the expected output from the `MutableList`.

## Solution
The `bugSolution.kt` file provides a solution demonstrating the use of `removeAll` for consistent behavior across `MutableList` and `MutableSet`.