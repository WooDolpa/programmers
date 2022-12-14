package lv0.day20;

/**
 * packageName : lv0.day20
 * className : CutPaperTest
 * user : jwlee
 * date : 2022/12/14
 */
public class CutPaperTest {
    public static void main(String[] args) {

    }

    /**
     * 종이자르기
     *
     */
    public static class Solution {
        public int solution(int M, int N) {
            int answer = 0;
            boolean isLen = 0 < M && M < 100 && 0 < N && N < 100;
            if(isLen) {
                answer = (M*N)-1;
            }
            return answer;
        }
    }
}
