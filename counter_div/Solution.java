package counter_div;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        int numEl = 0;
        int first = A;
        while(numEl == 0 && first <= B) {
            if(first%K == 0) {
                numEl += 1;
            } else
               first += 1;
        }
        numEl += (B - first)/K;
        return numEl;
    }
}
