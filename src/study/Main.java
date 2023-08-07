package study;

class Test {
    static String subject = "Korean";
    int score;
    String studentName;
    {
        score = 100;
    }
    Test(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Test{" +
                "score=" + score +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Test test = new Test("choi", 0);



    }
}
