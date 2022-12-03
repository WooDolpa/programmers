package lv0.day14;

/**
 * packageName : lv0.day14
 * className : ArrayRotateTest
 * user : jwlee
 * date : 2022/12/02
 */
public class ArrayRotateTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1,2,3}, "right");
        for (int num : result) {
            System.out.print(num);
        }
    }

    /**
     * 배열 회전시키기
     *
     */
    public static class Solution {
        public int[] solution(int[] numbers, String direction) {

            boolean isValidLen = (3 <= numbers.length && numbers.length <= 20);
            boolean isDirection = ("left".equals(direction) || "right".equals(direction));
            int[] answer = {};

            if(isValidLen && isDirection) {

                answer = new int[numbers.length];
                int temp = 0;

                switch (direction) {
                    case "left" :
                        temp = numbers[0];
                        for (int i=0; i<(numbers.length-1); i++) {
                            numbers[i] = numbers[i+1];
                        }
                        numbers[numbers.length-1] = temp;
                        break;
                    case "right" :
                        temp = numbers[numbers.length-1];
                        for (int i= numbers.length-1; i > 0; i--) {
                            numbers[i] = numbers[i-1];
                        }
                        numbers[0] = temp;
                        break;
                    default:
                        return new int[]{};
                }

                answer = numbers;
            }

            return answer;
        }
    }
}
