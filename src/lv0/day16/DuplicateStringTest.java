package lv0.day16;

/**
 * packageName : lv0.day16
 * className : DuplicateStringTest
 * user : jwlee
 * date : 2022/12/06
 */
public class DuplicateStringTest {
    public static void main(String[] args) {

        String text  = "people";
        char[] textChars = text.toCharArray();
        String answer = "";
        for (int i=0; i< textChars.length; i++) {
            if(text.indexOf(textChars[i]) == i) answer += textChars[i];
        }
        System.out.println(answer);
    }

    /**
     * 중복된 문자 제거
     *
     */
    public static class Solution {
        public String solution(String my_string) {
            boolean isLen = (1 <= my_string.length() && my_string.length() <= 110);
            String answer = "";
            if(isLen) {
                char[] charArray = my_string.toCharArray();
                for (int i=0; i< charArray.length; i++) {
                    if(my_string.indexOf(charArray[i]) == i) answer += charArray[i];
                }
            }
            return answer;
        }
    }
}
