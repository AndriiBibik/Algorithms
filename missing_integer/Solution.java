package missing_integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        ArrayList<Integer> positive = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if(A[i] > 0)
                positive.add(A[i]);
        }
        if(positive.isEmpty()) return 1;
        if(positive.get(0) > 1) return 1;

        for(int i = 0; i < positive.size() - 1; i++) {
            if(positive.get(i + 1) - positive.get(i) > 1)
                return positive.get(i) + 1;
        }

        return positive.get(positive.size() - 1) + 1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {-5,1,2,3,4,6,7,8,9,5};
        System.out.println(solution.solution(A)); 
    }
}
