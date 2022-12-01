package lv0.day12;

/**
 * packageName : lv0.day12
 * className : StrUpperTest
 * user : jwlee
 * date : 2022/11/30
 */
public class StrUpperTest {
    public static void main(String[] args) {
//        System.out.println("ccccCCCCC".toLowerCase());
        Solution solution = new Solution();
        System.out.println(solution.solution("ccccCCCCC"));
    }

    /**
     * 대문자와 소문자
     *
     */
    public static class Solution {
        public String solution(String my_string) {
            boolean isValid = (1 <= my_string.length() && my_string.length() <= 1000);
            String answer = "";
            if(isValid) {
                for (int i=0; i < my_string.length(); i++) {
                    if(Character.isUpperCase(my_string.charAt(i))) {
                        answer += Character.toString(my_string.charAt(i)).toLowerCase();
                    }else {
                        answer += Character.toString(my_string.charAt(i)).toUpperCase();
                    }
                }
            }
            return answer;
        }
    }
}
