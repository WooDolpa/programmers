package lv0.day06;

/**
 * packageName : lv0.day06
 * className : DotTest
 * user : jwlee
 * date : 2022/11/22
 */
public class DotTest {
    public static void main(String[] args) {

    }

    /**
     * 점의 위치 구하기
     *
     */
    public static class Solution {
        public int solution(int[] dot) {
            boolean isValid = validation(dot);
            int answer = 0;
            if(isValid) {
                int x = dot[0];
                int y = dot[1];
                if(x > 0 && y > 0) {
                    return 1;
                }else if(x < 0 && y > 0) {
                    return 2;
                }else if(x < 0 && y < 0) {
                    return 3;
                }else if(x > 0 && y < 0) {
                    return 4;
                }
            }
            return answer;
        }

        private boolean validation (int[] dot) {
            boolean isValid = (dot.length == 2);
            if(isValid) {
                for (int num : dot) {
                    isValid = num != 0 && -500 <= num && num <= 500;
                    if(!isValid)
                        return false;
                }
            }
            return isValid;
        }
    }
}
