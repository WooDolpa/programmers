package lv0.day08;

/**
 * packageName : lv0.day08
 * className : StringDeleteTest
 * user : jwlee
 * date : 2022/11/27
 */
public class StringDeleteTest {

    public static void main(String[] args) {
        System.out.println("e".replace("E", "!"));
    }

    /**
     * 특정 문자 제거하기
     *
     */
    public static class Solution {
        public String solution(String my_string, String letter) {
            boolean isValidLen = (1 <= my_string.length() && my_string.length() <= 100) && (letter.length() == 1);
            String answer = "";
            if(isValidLen) {
                return my_string.replace(letter, "");
            }
            return answer;
        }
    }
}
