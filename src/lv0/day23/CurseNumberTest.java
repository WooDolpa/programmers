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
//        System.out.println(solution.solution(10));
        System.out.println(solution.solution(15));
//        System.out.println(solution.solution(40));
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
                for (int i=1; i <= n; i++) {
                    answer ++;
                    if(answer % 3 == 0 ){
                        answer++;
                    }
                    if(answer / 10 > 0) {
                        answer = convert3Number(answer, 0);
                    }
                }
            }
            return answer;
        }

        public int convert3Number(int n, int cnt) {

            int division = n / 10 ;
            int remainder = n % 10;

            if(remainder % 3 == 0) {
                remainder++;
                if(remainder == 10) {
                    division++;
                }
            }

            if(division == 0) {
                return (10*cnt) * remainder;
            }

            return (10*cnt)+ remainder  + convert3Number(n/10, cnt+1);
        }
    }
}
