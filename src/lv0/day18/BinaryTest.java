package lv0.day18;

/**
 * packageName : lv0.day18
 * className : BinaryTest
 * user : jwlee
 * date : 2022/12/11
 */
public class BinaryTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("10", "11"));
    }

    /**
     * 이진수 더하기
     *
     */
    public static class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";
            int bint1 = Integer.parseInt(bin1, 2);
            int bint2 = Integer.parseInt(bin2, 2);
            answer = Integer.toBinaryString(bint1+bint2);
            return answer;
        }
    }
}
