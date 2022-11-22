package lv0.day05;

/**
 * packageName : lv0
 * className : OddEvenTest
 * user : jwlee
 * date : 2022/11/21
 */
public class OddEvenTest {
    public static void main(String[] args) {

    }

    public static class Solution{
        public int[] solution(int[] num_list) {
            boolean isValid = (1 <= num_list.length && num_list.length <= 100);
            int[] answer = {};
            if(isValid){
                answer = new int[2];
                int odd = 0;
                int even = 0;

                for (int num : num_list) {
                    if(num % 2 == 0){
                        even++;
                    }else{
                        odd++;
                    }
                }

                answer[0] = even;
                answer[1] = odd;
            }
            return answer;
        }
    }
}
