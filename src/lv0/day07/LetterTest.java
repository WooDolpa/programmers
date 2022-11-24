package lv0.day07;

/**
 * packageName : lv0.day07
 * className : LetterTest
 * user : jwlee
 * date : 2022/11/22
 */
public class LetterTest {

    public static void main(String[] args) {
    }

    /**
     * 편지
     *
     */
    public static class Solution {
        public int solution(String message) {
            boolean isValidLen = (1 <= message.length() && message.length() <= 50);
            int answer = 0;
            if(isValidLen) {
                return (message.length() * 2);
            }
            return answer;
        }
    }
}
