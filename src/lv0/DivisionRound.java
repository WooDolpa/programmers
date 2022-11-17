package lv0;

/**
 * packageName : lv0
 * className : DivisionRound
 * user : jwlee
 * date : 2022/11/15
 */
public class DivisionRound {
    public static void main(String[] args) {
        System.out.println((3/(float)2));
    }

    public static class Solution {
        public int solution(int num1, int num2) {
            boolean isValidated = (0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100);
            int answer = 0;
            if(isValidated) {
                float remainder = (num1/(float) num2) * 1000;
                return (int) remainder;
            }
            return answer;
        }
    }
}
