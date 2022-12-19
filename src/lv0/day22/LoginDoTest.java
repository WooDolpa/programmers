package lv0.day22;

/**
 * packageName : lv0.day22
 * className : LoginDoTest
 * user : jwlee
 * date : 2022/12/19
 */
public class LoginDoTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

//        String[] id_pw = {"meosseugi", "1234"};
//        String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};

//        String[] id_pw = {"programmer01", "15789"};
//        String[][] db = {{"programmer02", "111111"},{"programmer02", "111111"},{"programmer01", "1145"}};

        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"},{"krong0313", "29440"},{"rabbit00", "111333"}};

        System.out.println(solution.solution(id_pw, db));

    }


    /**
     * 로그인 성공?
     *
     */
    public static class Solution {
        public String solution(String[] id_pw, String[][] db) {

            String[] results = {"login", "wrong pw", "fail"};
            int resultIdx = 2;
            boolean isIdPwLen = id_pw.length == 2 ;

            if(isIdPwLen) {

                String id = id_pw[0];
                String pw = id_pw[1];
                boolean isIdLen = 1 <= id.length() && id.length() <= 15;
                boolean isPwLen = 1 <= pw.length() && pw.length() <= 15;
                boolean isDbLen = 1 <= db.length && db.length <= 10;

                if(isIdLen && isPwLen && isDbLen) {

                    boolean idMatched = false;
                    int index = 0;

                    for (int i=0; i < db.length; i++) {
                        if(db[i].length == 2) {
                            if(id.equals(db[i][0])) {
                                index = i;
                                idMatched = true;
                                break;
                            }
                        }
                    }

                    if(idMatched) {
                        resultIdx = 1;
                        if(pw.equals(db[index][1])) {
                            resultIdx = 0;
                        }
                    }
                }
            }
            return results[resultIdx];
        }
    }
}
