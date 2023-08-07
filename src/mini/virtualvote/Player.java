package mini.virtualvote;

public class Player {
    private String name;
    private int numOfVote = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfVote() {
        return numOfVote;
    }

    public void setNumOfVote(int numOfVote) {
        this.numOfVote = numOfVote;
    }

    public void vote() {
        this.numOfVote++;
    }
}
