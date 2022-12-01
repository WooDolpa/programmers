package lv0.day12;

/**
 * packageName : lv0.day12
 * className : RspTest
 * user : jwlee
 * date : 2022/11/30
 */
public class RspTest {
    public static void main(String[] args) {
    }

    /**
     * 가위 바위 보
     *
     */
    public static class Solution {
        public String solution (String rsp) {
            boolean isValid = (0 < rsp.length() && rsp.length() <= 100);
            String answer = "";
            if(isValid) {
                for (int i=0; i<rsp.length(); i++) {
                    String rsp_idx = rsp.substring(i, i+1);
                    switch (rsp_idx) {
                        case "0" :
                            answer += "5";
                            break;
                        case "2" :
                            answer += "0";
                            break;
                        case "5" :
                            answer += "2";
                            break;
                        default:
                            break;
                    }
                }
            }
            return answer;
        }
    }
}
