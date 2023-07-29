package practices.studentUsers;

public class Course {
    private String name;
    private String code;
    private int midTerm;
    private int finalTerm;
    private double courseAvarage;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public void printInfo(){
        Calculate x = new Calculate(getMidTerm(),getFinalTerm());
        courseAvarage = x.avarage();
        System.out.println("Dersin ismi " + getName() + " dersin not ortalamasÄ± : " + courseAvarage);
    }
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
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
