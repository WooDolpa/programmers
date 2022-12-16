package lv0.day21;

/**
 * packageName : lv0.day21
 * className : CharacterTest
 * user : jwlee
 * date : 2022/12/16
 */
public class CharacterTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] positions = solution.solution(new String[]{"left", "right", "up", "right", "right"},new int[]{11,11});
        int[] positions = solution.solution(new String[]{"down", "down", "down", "down", "down"},new int[]{7,9});
        for (int ps : positions) {
            System.out.println(ps);
        }
    }

    /**
     * 캐릭터의 좌표
     *
     */
    public static class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = new int[2];
            int maxX = board[0]/2;
            int maxY = board[1]/2;
            int x = 0;
            int y = 0;

            for (String ki : keyinput) {
                switch (ki) {
                    case "left" :
                        x--;
                        if(Math.abs(x) > maxX){
                            x++;
                        }
                        break;
                    case "right" :
                        x++;
                        if(Math.abs(x) > maxX) {
                            x--;
                        }
                        break;
                    case "up":
                        y++;
                        if(Math.abs(y) > maxY) {
                            y--;
                        }
                        break;
                    case "down":
                        y--;
                        if(Math.abs(y) > maxY) {
                            y++;
                        }
                        break;
                    default:
                        break;
                }
            }

            answer[0] = x;
            answer[1] = y;

            return answer;
        }
    }
}
