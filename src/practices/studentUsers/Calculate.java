package practices.studentUsers;

public class Calculate {
    private int midTerm;
    private int finalTerm;
    private double calAvarage;


    public Calculate(int midTerm, int finalTerm) {
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
    }
    double avarage(){
        calAvarage = (getMidTerm()*0.4)+(getFinalTerm()*0.6);
        return calAvarage;
    }

    public int getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(int midTerm) {
        this.midTerm = midTerm;
    }

    public int getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(int finalTerm) {
        this.finalTerm = finalTerm;
    }
}
