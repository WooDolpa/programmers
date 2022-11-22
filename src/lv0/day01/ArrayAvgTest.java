package lv0.day01;

import java.util.Arrays;

/**
 * packageName : lv0
 * className : ArrayAvgTest
 * user : jwlee
 * date : 2022/11/18
 */
public class ArrayAvgTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.stream(numbers).average().orElse(0));
    }

    /**
     * 배열의 평균값
     *
     */
    public static class Solution {
        public double solution(int[] numbers) {

            int arrayLen = numbers.length;
            boolean isValidLen = (1 <= arrayLen && arrayLen <= 100);
            double answer = 0;

            if(isValidLen) {

                int[] newNumbers = Arrays.stream(numbers)
                        .filter(i -> {
                            boolean isValid = (0 <= i && i <= 1000);
                            return isValid;
                        }).toArray();

                answer = (newNumbers[0] + newNumbers[newNumbers.length-1]) / (double)2;
                return answer;
                /** 아래처럼 한줄로 가능하다... */
//                return Arrays.stream(numbers).average().orElse(0);
            }

            return answer;
        }
    }
}
