package lv0;

/**
 * packageName : lv0
 * className : Subtraction
 * user : jwlee
 * date : 2022/11/14
 */
public class Subtraction {

    public static void main(String[] args) {

    }

    public static class Solution {
        public int solution(int num1, int num2) {
            boolean isValidation = (num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000);
            int answer = 0;
            if(isValidation) {
                answer = num1 - num2;
            }
            return answer;
        }
    }
}
