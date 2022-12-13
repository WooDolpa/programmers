package lv0.day19;

/**
 * packageName : lv0.day19
 * className : HateEnglishTest
 * user : jwlee
 * date : 2022/12/13
 */
public class HateEnglishTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("onetwothreefourfivesixseveneightnine"));
    }

    /**
     * 영어가 싫어요
     * i + "" --> String.valueOf(i) 로 변경 성능 차이가 매우 심함
     */
    public static class Solution {
        public long solution(String numbers){
            long answer = 0;
            String[] number_names = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String numberString = numbers;
            for (int i=0; i < number_names.length; i++) {
                numberString = numberString.replaceAll(number_names[i], String.valueOf(i));
            }
            answer = Long.valueOf(numberString);
            return answer;
        }
    }
}
