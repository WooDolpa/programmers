package lv0.day10;

/**
 * packageName : lv0.day10
 * className : PositionTest
 * user : jwlee
 * date : 2022/11/27
 */
public class PositionTest {

    public static void main(String[] args) {
    }

    /**
     * 자릿수 더하기
     *
     */
    public static class Solution {
        public int solution(int n) {
            boolean isValid = (0 <= n && n <= 1000000);
            int answer = 0;
            if(isValid) {
                String nStr = String.valueOf(n);
                for (int i=0; i < nStr.length(); i++) {
                    answer += Integer.parseInt(nStr.substring(i, i+1));
                }
            }
            return answer;
        }
    }

//    class Solution {
//        public int solution(int n) {
//            int answer = 0;
//
//            while(n>0){
//                answer+=n%10;
//                n/=10;
//            }
//
//            return answer;
//        }
//    }
}
