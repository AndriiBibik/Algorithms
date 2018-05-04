package frog_river_one;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int X, int[] A) {
        boolean[] stepProvided = new boolean[X + 1];
        int numSteps = 0;
        for(int i = 0; i < A.length; i++) {
            if(!stepProvided[A[i]]) {
                stepProvided[A[i]] = true;
                numSteps++;
            }
            if(numSteps == X) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[] = {4,1,1,1,1,1,1,2,3,2,1,2,3,4,4,3,2,2};
        System.out.println(solution.solution(4, A));
    }
}
