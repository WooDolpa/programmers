package lv0.day14;

/**
 * packageName : lv0.day14
 * className : ChangeIndexTest
 * user : jwlee
 * date : 2022/12/03
 */
public class ChangeIndexTest {

    public static void main(String[] args) {
    }

    /**
     * 인덱스 바꾸기
     *
     */
    public static class Solution {
        public String solution(String my_string, int num1, int num2) {
            boolean isLen = (1 < my_string.length() && my_string.length() < 100);
            boolean isNumLen = (0 <= num1 && 0 <= num2) && (num1 < my_string.length() && num2 < my_string.length());
            String answer = "";
            if(isLen && isNumLen){
                StringBuilder sb = new StringBuilder(my_string);
                char temp = my_string.charAt(num1);
                sb.setCharAt(num1, my_string.charAt(num2));
                sb.setCharAt(num2, temp);
                answer = sb.toString();
            }
            return answer;
        }
    }

}
