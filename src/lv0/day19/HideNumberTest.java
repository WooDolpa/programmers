package lv0.day19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName : lv0.day19
 * className : HideNumberTest
 * user : jwlee
 * date : 2022/12/11
 */
public class HideNumberTest {

    public static void main(String[] args) {
        String text = "aAb1B2cC34oOp";
        String text2 = "1a2b3c4d123Z";
        Solution solution = new Solution();
//        solution.solution(text2);
        System.out.println(solution.solution(text));
        System.out.println(solution.solution(text2));
    }

    /**
     * 숨어있는 숫자의 덧셈(2)
     *
     */
    public static class Solution {
        public int solution(String my_string) {

            int answer = 0;
            String[] num_strings = my_string.replaceAll("[^0-9]", " ").split(" ");
            for (String num : num_strings) {
                if(!"".equals(num)) {
                    answer += Integer.parseInt(num);
                }
            }
            return answer;
        }
    }

}
