package lv0.day08;

/**
 * packageName : lv0.day08
 * className : IceAmericanoTest
 * user : jwlee
 * date : 2022/11/27
 */
public class IceAmericanoTest {

    public static void main(String[] args) {

    }

    /**
     * 아이스 아메리카노
     *
     */
    public static class Solution {
        public int[] solution(int money) {
            boolean isValid = (0 < money && money <= 1000000);
            int[] answer = {};
            if(isValid) {
                int coffeePrice = 5500;
                answer = new int[2];
                answer[0] = (money / coffeePrice);
                answer[1] = (money % coffeePrice);
            }
            return answer;
        }
    }
}
