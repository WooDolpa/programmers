package lv0.day09;

/**
 * packageName : lv0.day09
 * className : StrInStrTest
 * user : jwlee
 * date : 2022/11/27
 */
public class StrInStrTest {

    public static void main(String[] args) {

    }

    /**
     * 문자열안에 문자열
     *
     */
    public static class Solution {
        public int solution(String str1, String str2) {
            boolean isValidLen = validateLength(str1) && validateLength(str2);
            int answer = 0;
            if(isValidLen) {
                if(str1.contains(str2)) {
                    return 1;
                }

                return 2;
            }
            return answer;
        }


        private boolean validateLength (String str) {
            return (1 <= str.length() && str.length() <= 100);
        }
    }
}
