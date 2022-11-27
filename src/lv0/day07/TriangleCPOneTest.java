package lv0.day07;

import java.util.Arrays;

/**
 * packageName : lv0.day07
 * className : TriangleCPOneTest
 * user : jwlee
 * date : 2022/11/24
 */
public class TriangleCPOneTest {

    public static void main(String[] args) {

    }

    /**
     * 삼각형 완성조건 (1)
     *
     */
    public static class Solution {
        public int solution(int[] sides) {
            boolean isValidLen = (sides.length == 3);
            int answer = 0;
            if(isValidLen){
                int[] newSides = Arrays.stream(sides).filter(i -> (1 <= i && i <= 1000)).sorted().toArray();
                if((newSides[0] + newSides[1]) > newSides[2]) {
                    return 1;
                }
                return 2;
            }
            return answer;
        }
    }
}
