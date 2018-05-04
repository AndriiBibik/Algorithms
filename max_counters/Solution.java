package max_counters;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] A) {
        int[] solution = new int[N];
        int maxCounter = 0;
        int maxCountersSum = 0;
        for(int a: A) {
            if(a >= 1 && a <= N) {
                if(solution[a - 1] < maxCountersSum)
                    solution[a - 1] = maxCountersSum;
                solution[a - 1]++;
                if(solution[a - 1] > maxCounter)
                    maxCounter = solution[a - 1];
            }
            if(a == N + 1) {
                maxCountersSum = maxCounter;
            }
        }
        for(int i = 0; i < N; i++) {
            if(solution[i] < maxCountersSum)
                solution[i] = maxCountersSum;
        }
        
        return solution;
    }
    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4,3,1,2,6,1,2,3,4,2,6,1,2,3,1,6};
        int N = 5;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(N, A)));
    }
}
