package lv0.day14;

/**
 * packageName : lv0.day14
 * className : PizzaTwoTest
 * user : jwlee
 * date : 2022/12/03
 */
public class PizzaTwoTest {
    public static void main(String[] args) {

    }

    /**
     * 피자 나눠 먹기(2)
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isValid = (1 <= n && n <= 100);
            int answer = 0;
            if(isValid) {
                int pizzaCnt = 6;
                answer = 1;
                while ((pizzaCnt*answer) % n != 0) {
                    answer++;
                }
            }
            return answer;
        }
    }
}
