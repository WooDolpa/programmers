package lv0.day06;

/**
 * packageName : lv0.day06
 * className : MaxValTest
 * user : jwlee
 * date : 2022/11/22
 */
public class MaxValTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4,5}));
        System.out.println(solution.solution(new int[]{0,31,24,10,1,9}));
    }

    /**
     * 최댓값 구하기
     * Arrays.sort(numbers) --> 오름차순으로 정렬된거 같음
     */
    public static class Solution {
        public int solution(int[] numbers) {
            boolean isValid = validation(numbers);
            int answer = 0;
            if(isValid) {
                for (int i=0; i<numbers.length; i++) {
                    for (int k = i+1; k <numbers.length; k++) {
                        if(numbers[k] > numbers[i]) {
                            int temp = numbers[i];
                            numbers[i] = numbers[k];
                            numbers[k] = temp;
                        }
                    }
                }
                return (numbers[0] * numbers[1]);
            }
            return answer;
        }

        private boolean validation(int[] numbers) {
            boolean isValid = (2 <= numbers.length && numbers.length <= 100);
            if(isValid) {
                for (int number : numbers) {
                    if(!(0 <= number && number <= 10000))
                        return false;
                }
            }
            return isValid;
        }
    }
}
