package lv0.day01;

/**
 * packageName : lv0
 * className : AgeTest
 * user : jwlee
 * date : 2022/11/17
 */
public class AgeTest {

    public static void main(String[] args) {

    }

    /**
     * 나이 출력
     *
     */
    public static class Solution {
        public int solution(int age) {
            boolean isValidated =  (0 < age && age <= 120);
            int fixYear = 2022;
            int answer = 0;
            if(isValidated) {
                return (fixYear - age) + 1;
            }
            return answer;
        }
    }
}
