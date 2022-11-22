package lv0.day03;

/**
 * packageName : lv0
 * className : NumberMatch
 * user : jwlee
 * date : 2022/11/15
 */
public class NumberMatch {

    public static void main(String[] args) {

    }

    public static int solution(int num1, int num2) {
        boolean isValidated = (0 <= num1 && num1 <= 10000) && (0 <= num2 && num2 <= 10000);
        int answer = 0;
        if(isValidated) {
            if(num1 != num2) {
                return -1;
            }
            return 1;
        }
        return answer;
    }
}
