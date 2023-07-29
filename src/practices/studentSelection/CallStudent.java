package practices.studentSelection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CallStudent {
    private String[] studentList;
    private final String fileName = Util.FILE_NAME.getPath();
    private Scanner input = new Scanner(System.in);
    private int value;
    private int counterForMenu = 0;

    private static String getX(String student) {
        return student.substring(0, student.length() - 2) + " " + (student.substring(student.length() - 1).equals(Gender.ERKEK.getAbbreviation()) ? Gender.ERKEK.getExpression() : Gender.KADIN.getExpression());
    }

    public void loadStudent() {
        try {
            Scanner input = new Scanner(new File(fileName));
            int num = 0;
            while (input.hasNextLine()) {
                input.nextLine();
                num++;
            }
            studentList = new String[num];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int index = 0;
        while (input.hasNextLine()) {
            studentList[index] = input.nextLine();
            index++;
        }
        /*
        for (String student : studentList){
            System.out.println(student);
        }*/
    }

    public void randomStudent(int value) {
        Random random = new Random();
        String[] studentSelection = new String[value];
        int randomIndex = 0;
        for (int i = 0; i < value; i++) {
            randomIndex = random.nextInt(studentList.length);
            studentSelection[i] = studentList[randomIndex];
            studentList = removeElement(studentList, randomIndex);
        }
        for (String student : studentSelection) {
            System.out.println(getX(student));
        }
    }

    public String[] removeElement(String[] array, int index) {
        String[] secondArray = {};
        if (index >= 0 && index < array.length) {
            secondArray = new String[array.length - 1];
            int j = 0;
            for (int i = 0; i < secondArray.length; i++) {
                if (j == index) {
                    ++j;
                }
                secondArray[i] = array[j++];
            }
            return secondArray;
        }
        return secondArray;
    }

    public void menu(int args) {
        value = args;
        ++counterForMenu;
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç öğrenci getirmek istiyorsunuz?");
        value = scan.nextInt();
        ++counterForMenu;
    }

    public void printInfo() {
        System.out.println("-----");
        System.out.println(counterForMenu + ". seçiminize ait " + value + " kişi : ");
        randomStudent(value);
    }
}


