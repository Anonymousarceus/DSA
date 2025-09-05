// class Solution {
//     public int makeTheIntegerZero(int n1, int n2) {
//         // Try different numbers of operations (1 to 60)
//         for (int op = 1; op <= 60; op++) {
            
//             // Calculate what's left after subtracting n2 'op' times
//             long rem = 1L * n1 - 1L * op * n2;
            
//             // If remainder is negative or too small, skip
//             if (rem < op) continue;
            
//             // Count how many 1s in binary representation
//             // This tells us minimum operations needed to make rem zero using powers of 2
//             int pop = Long.bitCount(rem);
            
//             // Check if it's possible:
//             // - We need at least 'pop' operations (minimum)
//             // - We need at most 'rem' operations (maximum - using all 1s)
//             // - We have exactly 'op' operations available
//             if (pop <= op && op <= rem) {
//                 return op;
//             }
//         }
//         return -1; // Impossible
//     }
// }

class Solution {

    public int makeTheIntegerZero(int num1, int num2) {
        int k = 1;
        while (true) {
            long x = num1 - (long) num2 * k;
            if (x < k) {
                return -1;
            }
            if (k >= Long.bitCount(x)) {
                return k;
            }
            k++;
        }
    }
}