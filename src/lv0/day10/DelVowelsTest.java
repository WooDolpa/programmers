package lv0.day10;

/**
 * packageName : lv0.day10
 * className : DelVowelsTest
 * user : jwlee
 * date : 2022/11/28
 */
public class DelVowelsTest {

    public static void main(String[] args) {
        System.out.println("nice to meet you".replaceAll("[aeiou][AEIOU]*", ""));
    }

    /**
     * 모음 제거
     *
     *  한줄 풀이
     *  my_string.replaceAll("[aeiou][AEIOU]*", "");
     */
    public static class Solution {
        public String solution(String my_string) {
            boolean isValidLen = (1 <= my_string.length() && my_string.length() <= 1000);
            String answer = "";
            if(isValidLen) {
                answer = my_string.replace("a", "");
                answer = answer.replace("e", "");
                answer = answer.replace("i", "");
                answer = answer.replace("o", "");
                answer = answer.replace("u", "");
                answer = answer.replace("A", "");
                answer = answer.replace("E", "");
                answer = answer.replace("I", "");
                answer = answer.replace("O", "");
                answer = answer.replace("U", "");

            }
            return answer;
        }
    }
}
