package codility_binary_gap;

import java.util.ArrayList;

public class Solution {
    public int solution(int N) {
        if(N == 0) {
            return 0;
        }
        //Number into String binary representation
        String binaryString = Integer.toBinaryString(N);

        //Binary String representation into char array
        char[] binaryArr = binaryString.toCharArray();
        
        int binaryGap = 0;
        
        ArrayList<Integer> binaryGaps = new ArrayList<>();
        
        for(int i = 1; i < binaryArr.length; i++) {
            if(binaryArr[i] == '0') {
                binaryGap += 1;
            } else if(binaryArr[i] == '1' && binaryGap != 0) {
                binaryGaps.add(binaryGap);
                binaryGap = 0;
            }
        }
        int bigestBG = 0;
        if(binaryGaps.size() > 0) {

            for(int i = 0; i < binaryGaps.size(); i++) {
                if(binaryGaps.get(i).intValue() > bigestBG) {
                    bigestBG = binaryGaps.get(i).intValue();
                }
            }
        }

        return bigestBG;    
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(9));
        System.out.println(solution.solution(1222244));
        System.out.println(solution.solution(32345543));
        System.out.println(solution.solution(0));
    }
}
