package lv0.day06;

/**
 * packageName : lv0
 * className : ReverseStringTest
 * user : jwlee
 * date : 2022/11/21
 */
public class ReverseStringTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("jaron"));
    }

    /**
     * 문자열 바꾸기
     *
     */
    public static class Solution {
        public String solution(String my_string) {
            boolean isValid = (1 <= my_string.length() && my_string.length() <= 1000);
            String answer = "";
            if(isValid) {
                StringBuilder sb = new StringBuilder(my_string);
                answer = sb.reverse().toString();
            }
            return answer;
        }
    }
}
