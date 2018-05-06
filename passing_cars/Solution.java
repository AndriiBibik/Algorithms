package passing_cars;

import java.util.Arrays;


public class Solution {
    public static int solution(int[] A) {
        int N = A.length;
        int counter = 0;
        int passingCars = 0;
        for(int i = N - 1; i >= 0; i--) {
            if(A[i] == 0)
                passingCars += counter;
            else
                counter += 1;
        }
        return passingCars;
    }
    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        System.out.println(solution(A));
    }
}
