package study.prgrmrs.test.Test_03_1;

public class Test_03_1_4 {
    public static void main(String[] args) {
        String s = "001001000100";
        String answer = "";
        int lt = s.indexOf("1");
        int rt = s.lastIndexOf("1");

        if (lt == -1 || rt == -1) {
            answer = "NO";
        }

        System.out.println(s.substring(lt + 3, rt - 2));
        if (rt - lt > 5) {
            System.out.println(s.substring(lt + 3, rt - 2).indexOf("1"));
            if (s.substring(lt + 3, rt - 2).indexOf("1") >= 0) {
                answer = "NO";
            }
        } else {
            answer = "YES";
        }
        System.out.println(answer);
    }
}

