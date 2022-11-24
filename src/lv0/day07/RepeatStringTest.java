package lv0.day07;

/**
 * packageName : lv0.day07
 * className : RepeatStringTest
 * user : jwlee
 * date : 2022/11/23
 */
public class RepeatStringTest {

    public static void main(String[] args) {}

    /**
     * 같은 문자 반복하기
     *
     */
    public static class Solution {
        public String solution(String my_string, int n) {
            boolean isValid = (2 <= my_string.length() && my_string.length() <= 5) && (2 <= n && n <= 10);
            String answer = "";
            if(isValid){
                for (int i=0; i<my_string.length(); i++) {
                    String txt =  String.valueOf(my_string.charAt(i));
                    for (int k =0; k <n; k++) {
                        answer += txt;
                    }
                }
            }
            return answer;
        }
    }
}
