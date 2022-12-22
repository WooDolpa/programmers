package lv0.day23;

import java.util.Arrays;

/**
 * packageName : lv0.day23
 * className : GradeTest
 * user : jwlee
 * date : 2022/12/22
 */
public class GradeTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] grades = solution.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});
        int[] grades = solution.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}});
        for (int grade : grades) {
            System.out.print(grade + " | ");
        }
    }

    /**
     * 등수 매기기
     *
     */
    public static class Solution{
        public int[] solution(int[][] score) {
            int[] answer = {};
            boolean isLen = 1 <= score.length && score.length <= 100;
            if(isLen) {

                float[] avgArray = new float[score.length];
                answer = new int[score.length];

                for (int i=0; i<avgArray.length; i++) {
                    avgArray[i] = (score[i][0] + score[i][1]) / 2.0f;
                }

                for (int i=0; i<avgArray.length; i++) {

                    int rank = 1;
                    for (int k=0; k < avgArray.length; k++) {
                        if(avgArray[i] < avgArray[k]) {
                            rank++;
                        }
                    }
                    answer[i] = rank;
                }
            }
            return answer;
        }
    }
}
