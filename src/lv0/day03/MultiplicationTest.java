package lv0.day03;

/**
 * packageName : lv0
 * className : MultiplicationTest
 * user : jwlee
 * date : 2022/11/14
 */
public class MultiplicationTest {

    public static void main(String[] args) {

    }

    public static class Solution {

        public static int solution(int num1, int num2) {
            boolean isValidation = (0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100);
            int answer = 0;

            if(isValidation) {
                return (num1 * num2);
            }
            return answer;
        }
    }

}
