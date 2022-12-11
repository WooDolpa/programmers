package lv0.day18;

/**
 * packageName : lv0.day18
 * className : OrderTest
 * user : jwlee
 * date : 2022/12/10
 */
public class OrderTest {

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[]{3, 76, 24}));
    }

    /**
     * 진료 순서 정하기
     *
     */
    public static class Solution {
        public int[] solution(int[] emergency) {

            int[] answer = new int[emergency.length];

            for (int i=0; i<emergency.length; i++) {
                int rank = emergency.length;
                for (int k=0; k < emergency.length; k++) {
                    if(emergency[i] > emergency[k]) rank--;
                }
                answer[i] = rank;
            }

            return answer;
        }
    }
}
