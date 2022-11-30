package lv0.day11;

/**
 * packageName : lv0.day11
 * className : HideNumberAddTest
 * user : jwlee
 * date : 2022/11/28
 */
public class HideNumberAddTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aAb1B2cC34oOp"));
    }

    /**
     * 숨어있는 숫자의 덧셈(1)
     *
     */
    public static class Solution {
        public int solution(String my_string) {
            boolean isValidLen = (1 <= my_string.length() && my_string.length() <= 1000);
            int answer = 0;
            if(isValidLen) {
                String number = my_string.replaceAll("[^0-9]","");
                for(int i=0; i<number.length(); i++) {
                    answer += Integer.parseInt(number.substring(i, i+1));
                }
            }
            return answer;
        }
    }
}
