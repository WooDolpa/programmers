package lv0.day04;

/**
 * packageName : lv0
 * className : ProtractorTest
 * user : jwlee
 * date : 2022/11/17
 */
public class ProtractorTest {

    public static void main(String[] args) {

    }

    /**
     * 각도기 문제
     *
     */
    public static class Solution {

        public int solution(int angle) {
            boolean isValidated = (0 < angle && angle <= 180);
            int answer = 0;
            if(isValidated) {
                return getAngleType(angle);
            }
            return answer;
        }

        private int getAngleType (int angle) {
            if(0 < angle && angle < 90) {
                return 1;
            }else if(angle == 90) {
                return 2;
            }else if (90 < angle && angle < 180) {
                return 3;
            }
            return 4;
        }
    }
}
