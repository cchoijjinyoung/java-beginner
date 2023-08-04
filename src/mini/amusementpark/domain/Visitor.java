package mini.amusementpark.domain;

public class Visitor {
    private int age;
    private int visitTime;
    private boolean isExistNationalMerit;
    private boolean isExistWelfareCard;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(int visitTime) {
        this.visitTime = visitTime;
    }

    public boolean isExistNationalMerit() {
        return isExistNationalMerit;
    }

    public void setExistNationalMerit(boolean existNationalMerit) {
        isExistNationalMerit = existNationalMerit;
    }

    public boolean isExistWelfareCard() {
        return isExistWelfareCard;
    }

    public void setExistWelfareCard(boolean existWelfareCard) {
        isExistWelfareCard = existWelfareCard;
    }
}
