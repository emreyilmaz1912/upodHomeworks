package practices.labPratic;

import java.io.IOException;
import java.util.List;

public class IsControl {
    String randomPassword;
    LabPratic labPratic = new LabPratic();
    List<String[]> list;


    public IsControl(String randomPassword, List<String[]> list) {
        this.randomPassword = randomPassword;
        this.list = list;
    }

    public boolean runControl() {
        boolean control = isValidControl();

        if (control) {
            System.out.println("Yeni şifreniz : " + randomPassword);
            try {
                labPratic.writeFile(randomPassword);
                System.out.println("Şifreniz password.txt dosyasına eklendi!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (!control) {
            labPratic.createRandomPassword();
        }
        return control;
    }
    

    private boolean isValidControl() {
        boolean isValid = false;
        boolean isValidLast = true;
        for (String[] charArray : list) {
            isValid = false;
            for (String character : charArray) {
                isValid |= randomPassword.contains(character);
            }
            if (isValid) {
            } else {
                isValidLast = false;
            }
        }
        return isValidLast;
    }
}