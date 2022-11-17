package lv0;

/**
 * packageName : lv0
 * className : IFTest
 * user : jwlee
 * date : 2022/11/16
 */
public class IFTest {

    public static void main(String[] args) {}

    /**
     * 풀이 작성
     * A   C    A x D + B x C
     * - + - = ---------------
     * B   D        B x D
     *
     * 분수를 덧셈한 최종 결과물에서 분자와 분모의 최대 공약수를 구한뒤 각 분모와 분자를 나누면 된다.
     * 유클리드 호제법을 이용하여 최대 공약수를 구할 수 있다.
     *
     */
    public static class Solution {

        public int[] solution(int denum1, int num1, int denum2, int num2) {

            boolean isValidated = numValid(denum1) && numValid(num1) && numValid(denum2) && numValid(num2);
            int[] answer = {};

            if(isValidated) {

                int number  = num1 * num2;
                int denumber = (denum1 * num2) + (denum2 * num1);
                int mod = gcd(denumber, number);

                number /= mod;
                denumber /= mod;

                return new int[]{denumber, number};
            }

            return answer;
        }

        private boolean numValid(int number) {
            return (0 <= number && number <= 1000);
        }

        private int gcd(int a, int b) {

            if(a <= b) {
                int temp = a;
                a = b;
                b = temp;
            }

            if (b == 0) {
                return a;
            }

            return gcd(b, a % b);
        }
    }

}
