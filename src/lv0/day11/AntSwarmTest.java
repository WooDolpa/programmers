package lv0.day11;

/**
 * packageName : lv0.day11
 * className : AntSwarmTest
 * user : jwlee
 * date : 2022/11/29
 */
public class AntSwarmTest {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(23));
        System.out.println(solution.solution(24));
        System.out.println(solution.solution(999));
    }

    /**
     * 개미 군단
     *
     * hp - 적의 체력
     * 장군개미 - 데미지 5
     * 병정개미 - 데미지 3
     * 일개미 - 데미지 1
     */
    public static class Solution {
        public int solution(int hp) {
            boolean isValid = (0 <= hp && hp <= 1000);
            int answer = 0;
            if(isValid) {
                answer = (hp/5);
                hp = (hp % 5);
                if(hp > 0) {
                    answer += (hp/3);
                    hp = (hp % 3);
                    if (hp > 0) {
                        answer += hp;
                    }
                }
            }
            return answer;
        }
    }
}
