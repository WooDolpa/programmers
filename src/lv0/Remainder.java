package lv0;

/**
 * packageName : lv0
 * className : Remainder
 * user : jwlee
 * date : 2022/11/15
 */
public class Remainder {

    public static void main(String[] args) {
    }

    public static class Solution {
        public int solution(int num1, int num2) {
            boolean isValidation = (0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100);
            int answer = -1;
            if(isValidation) {
                return num1 % num2;
            }
            return answer;
        }
    }

}
