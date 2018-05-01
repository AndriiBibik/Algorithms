// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package codility_test_equilibrium;

import java.lang.Math;
class Solution {
    public int solution(int[] A) {
        long sum = 0;
        if(A.length == 2)
            return A[1] - A[0];
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        long first = A[0];
        long lowest = Math.abs(sum - 2*first);
        long diff = lowest;
        for(int i = 1; i < A.length; i++) {
            first += A[i];
            diff = Math.abs(sum - 2*first);
            if(diff < lowest)
                lowest = diff;
        }
        return (int) lowest;
    }
}
