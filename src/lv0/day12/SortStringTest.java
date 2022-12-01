package lv0.day12;

import java.util.Arrays;

/**
 * packageName : lv0.day12
 * className : SortStringTest
 * user : jwlee
 * date : 2022/11/30
 */
public class SortStringTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("hi12392"));
    }

    /**
     * 문자열 정렬하기(1)
     * Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
     */
    public static class Solution {
        public int[] solution(String my_string){
            boolean isValid = (1 <= my_string.length() && my_string.length() <= 100);
            int[] answer = {};
            if(isValid) {
                String number_string = my_string.replaceAll("[^0-9]","");
                answer = new int[number_string.length()];
                for (int i=0; i < number_string.length(); i++) {
                    answer[i] = Integer.parseInt(number_string.substring(i, i+1));
                }
                return Arrays.stream(answer).sorted().toArray();
            }
            return answer;
        }
    }
}
