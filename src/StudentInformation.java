
public class StudentInformation {
    String name;
    String surname;
    int midtermNote;
    int finalNote;

    public StudentInformation(String name, String surname, int midtermNote, int finalNote) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        this.midtermNote = midtermNote;
        this.finalNote = finalNote;
    }

    void printInfo() {
        double midtermNotePercentage = getMidtermNote() * 0.40;
        double finalNotePercentage = getFinalNote() * 0.60;
        double gno = midtermNotePercentage + finalNotePercentage;

        if (gno >= 90) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "AA");
        } else if (gno < 90 && gno >= 80) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "BA");

        } else if (gno < 80 && gno >= 70) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "BB");
        } else if (gno < 70 && gno >= 60) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "CB");
        } else if (gno < 60 && gno >= 50) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "CC");
        } else if (gno < 50 && gno >= 40) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "DC");
        } else if (gno < 40 && gno >= 30) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "DD");
        } else if (gno < 30 && gno >= 0) {
            System.out.println(this.name + " " + this.surname + " " + gno + " - " + "FF");
        }


    }

    public int getMidtermNote() {
        return midtermNote;
    }


    public void setMidtermNote(int midtermNote) {

        this.midtermNote = midtermNote;
    }


    public int getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(int finalNote) {
        this.finalNote = finalNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
