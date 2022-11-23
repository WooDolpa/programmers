package lv0.day06;

/**
 * packageName : lv0.day06
 * className : DoubleArrayTest
 * user : jwlee
 * date : 2022/11/22
 */
public class DoubleArrayTest {

    public static void main(String[] args) {

    }

    /**
     * 배열 두배 만들기
     *
     */
    public static class Solution {
        public int[] solution(int[] numbers) {
            boolean validLen = (1 <= numbers.length && numbers.length <= 1000);
            int[] answer = {};
            if(validLen) {
                answer = new int[numbers.length];
                for (int i=0; i< numbers.length; i++) {
                    int number = numbers[i];
                    if(!(-10000 <= number && number <= 10000)) {
                        return new int[]{};
                    }
                    answer[i] = number*2;
                }
            }
            return answer;
        }
    }
}
