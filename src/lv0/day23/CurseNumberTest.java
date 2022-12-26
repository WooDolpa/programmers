package lv0.day23;

/**
 * packageName : lv0.day23
 * className : CurseNumberTest
 * user : jwlee
 * date : 2022/12/23
 */
public class CurseNumberTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(15));
        System.out.println(solution.solution(40));
    }

    /**
     * 저주의 숫자3
     *
     */
    public static class Solution{
        public int solution(int n) {
            int answer = 0;
            boolean isValid = 1 <= n && n <= 100;
            if(isValid){
                answer = process3Number(n);
            }
            return answer;
        }

        private int process3Number(int n) {

            int result = 0;
            for (int i=1; i<= n; i++) {

                result++;
                // case 1) 숫자 3인경우
                if(isExist3Number(result)) {
                    result = find3Number(result, 1);
                    if(result % 3 == 0) {
                        result++;
                    }
                }

                if(result % 3 == 0) {
                    result++;
                    if(isExist3Number(result)){
                        result = find3Number(result, 1);
                    }
                }
            }

            return result;
        }

        private boolean isExist3Number(int n) {
            boolean result = false;
            while (true) {
                int division = n / 10;
                int remainder = n % 10;
                if(remainder == 3) {
                    result = true;
                    break;
                }

                if(division == 0) break;
                n /= 10;
            }
            return result;
        }

        private int find3Number(int n, int position) {
            if(n/10 == 0) {
                int a = n % 10;
                if(a == 3) a++;
                if(a >= 10) {
                    return a * (int)Math.pow(10, (position-1)) + find3Number(a/10, position+1);
                }
                return a * (int)Math.pow(10, (position-1));
            }

            int division = n / 10;
            int remainder = n % 10;
            if(remainder == 3) {
                remainder++;
                if(remainder == 10) {
                    division++;
                    remainder = 0;
                }
            }
            return remainder * (int)Math.pow(10, (position-1)) + find3Number(division, position+1);
        }
    }
}
