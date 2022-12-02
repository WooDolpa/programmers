package lv0.day13;

/**
 * packageName : lv0.day13
 * className : DiceCountTest
 * user : jwlee
 * date : 2022/11/30
 */
public class DiceCountTest {

    public static void main(String[] args) {

    }

    /**
     * 주사위의 개수
     *
     */
    public static class Solution {
        public int solution(int[] box, int n) {
            int answer = (box[0]/n)*(box[1]/n)*(box[2]/n);
            return answer;
        }
    }
}
