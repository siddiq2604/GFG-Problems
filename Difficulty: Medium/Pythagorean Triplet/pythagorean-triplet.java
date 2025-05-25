class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
       int MAX = 1000;
        boolean[] freq = new boolean[MAX + 1];

        // Mark frequency of numbers in array
        for (int num : arr) {
            freq[num] = true;
        }

        // Try all pairs (a, b)
        for (int a = 1; a <= MAX; a++) {
            if (!freq[a]) continue;
            for (int b = a; b <= MAX; b++) {
                if (!freq[b]) continue;

                int csq = a * a + b * b;
                int c = (int)Math.sqrt(csq);

                if (c <= MAX && c * c == csq && freq[c]) {
                    // Ensure a, b, and c are from different indices
                    if ((a != b && b != c && a != c) ||
                        countInArray(arr, a) > 1 ||
                        countInArray(arr, b) > 1 ||
                        countInArray(arr, c) > 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // Utility to count occurrences
    int countInArray(int[] arr, int x) {
        int count = 0;
        for (int val : arr) {
            if (val == x) count++;
        }
        return count;
    }
}