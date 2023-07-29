package practices.studentSelection;

public enum Gender {
    KADIN("K","Hanım"), ERKEK("E","Bey");
    private String abbreviation;
    private String expression;
    Gender(String abbreviation, String expression) {
        this.abbreviation = abbreviation;
        this.expression = expression;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public String getExpression() {
        return expression;
    }
}
