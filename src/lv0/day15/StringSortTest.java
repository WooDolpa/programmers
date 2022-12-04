package lv0.day15;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * packageName : lv0.day15
 * className : StringSortTest
 * user : jwlee
 * date : 2022/12/03
 */
public class StringSortTest {

    public static void main(String[] args) {

    }

    /**
     * 문자열 정렬하기
     *
     * 다른 사람 풀이
     *   char[] c = my_string.toLowerCase().toCharArray();
     *   Arrays.sort(c);
     *   return new String(c);
     *
     */
    public static class Solution {
        public String solution(String my_string) {
            boolean isLen = 0 < my_string.length() && my_string.length() < 100;
            String answer = "";
            if(isLen) {
                String[] strArray = my_string.toLowerCase().split("");
                answer = Arrays.stream(strArray).sorted().collect(Collectors.joining());
            }
            return answer;
        }
    }
}
