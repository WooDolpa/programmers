package lv0.day20;

/**
 * packageName : lv0.day20
 * className : BeadTest
 * user : jwlee
 * date : 2022/12/14
 */
public class BeadTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 2));
        System.out.println(solution.solution(5, 3));
    }

    /**
     * 구슬을 나누는 경우의 수
     * 해당 풀이 다시 봐야함
     * https://copro505.tistory.com/entry/%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
     */
    public static class Solution {
        public int solution(int balls, int share) {
            int answer = 0;
            boolean isLen = 0 <= balls && balls <= 30;
            boolean isLen2 = 0 <= share && share <= 30;
            boolean isValid = share <= balls;
            if(isValid && isLen && isLen2) {
                answer = combination(balls, share);
            }
            return answer;
        }

        private int combination(int n, int r) {
            if( r == 0 || n == r) {
                return 1;
            }else {
                return combination(n-1, r-1) + combination(n-1, r);
            }
        }

    }

//    public long solution(int balls, int share) {
//        share = Math.min(balls - share, share);
//
//        if (share == 0)
//            return 1;
//
//        long result = solution(balls - 1, share - 1);
//        result *= balls;
//        result /= share;
//
//        return result;
//    }
}
