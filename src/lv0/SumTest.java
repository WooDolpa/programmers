package lv0;

/**
 * packageName : lv0
 * className : SumTest
 * user : jwlee
 * date : 2022/11/14
 */
public class SumTest {

    public static void main(String[] args) {

    }

    public static class Solution {

        public int solution(int num1, int num2) {

            boolean validation = (num1 <= 50000 && num1 >= -50000) && (num2 <= 50000 && num2 >= -50000);

            int answer = -1;
            if(validation) {
                answer = num1 + num2;
            }
            return answer;
        }
    }
}
