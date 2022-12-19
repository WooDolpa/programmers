package lv0.day21;

/**
 * packageName : lv0.day21
 * className : TriangleTwoTest
 * user : jwlee
 * date : 2022/12/19
 */
public class TriangleTwoTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2}));
        System.out.println(solution.solution(new int[]{3,6}));
        System.out.println(solution.solution(new int[]{11,7}));
    }

    /**
     * 삼각형 완성조건(2)
     *
     */
    public static class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            answer = case1MaxLen(sides);
            answer += case2MaxLen(sides);
            return answer;
        }

        private int case1MaxLen(int[] sides) {
            // 가장 긴 변이 둘중에 하나인 경우
            int count = 0;
            int maxLen = sides[0] < sides[1] ? sides[1] : sides[0];
            int len = sides[0] < sides[1] ? sides[0] : sides[1];

            for (int i=1; i <= maxLen; i++) {
                if((len+i) > maxLen) count ++;
            }

            return count;
        }

        private int case2MaxLen(int[] sides) {
            // 나머지 한 변의 길이가 가장 긴 변인 경우
            int a = sides[0] < sides[1] ? sides[1] : sides[0];
            return (sides[0] + sides[1]) - (a+1) ;
        }
    }


}
