package practices.labPratic;

public class IsControl {
    String randomPassword;
    String[][] characters;
    LabPratic labPratic = new LabPratic();

    public IsControl(String randomPassword, String[]... characters) {
        this.randomPassword = randomPassword;
        this.characters = characters;
    }


    public void runControl() {
        boolean control = isControl();

        if (control) {
            System.out.println("Yeni şifreniz : " + randomPassword);
        } else if (!control) {
            labPratic.createRandomPassword();
        }
    }

    public boolean isControl() {
        for (String[] charArray : characters) {
            for (String character : charArray) {
                if (randomPassword.contains(character)) {
                    return true;
                }
            }
        }
        return false;
    }

}
