package practices.studentUsers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    public static List<Student> studentsData = new ArrayList<>();
    private static final String FILE_PATH_STUDENT = "student.txt";
    private Course course3;
    private String id;
    private String name;
    private String surname;
    private String className;
    private String course1;
    // Course course2;
    private String course2;
    private double avarage;
    private boolean isPass;
 /*
    public Student(String id, String name, String surname, String classes, Course course1, Course course2) {
        this.id =id;
        this.name = name;
        this.surname = surname;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;

    } */

    public Student(String id, String name, String surname, String className, String course1, String course2, Course course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.className = className;
        this.course1 = course1;
        this.course2 = course2;

    }

    public Student() {
        this("", "", "", "", "", "",new Course("",""));
    }

    @Override
    public String toString() {
        return "id:'" + id + ", name:'" + name + ", surname:'" + surname + ", classes:'" + className + ", course1:" + course1 + ", course2" + course2;
    }


    public String setStudent() throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yeni öğrenci kaydı için aşağıdaki bilgileri doldurunuz!");
        System.out.print("Öğrenci Numarası (Bir harf üç rakam) :");
        id = input.nextLine();
        System.out.print("Öğrencinin Adı :");
        name = input.nextLine();
        System.out.print("Öğrencinin Soyadı :");
        surname = input.nextLine();
        System.out.println("Öğrencinin sınıfı ya da bölümü :");
        className = input.nextLine();
        System.out.println("1. dersin ismi ve ders kodu :");
        course1 = input.nextLine();
        System.out.println("2. dersin ismi ve ders kodu  :");
        course2 = input.nextLine();
        String courseName = input.nextLine();
        String courseCode = input.nextLine();
        Course course =  new Course(courseName,courseCode);
        studentsData.add( new Student(id,name,surname, className,course1,course2,course));
        new Course(courseName,courseCode);

        writeStudentInfo();

        loadStudentInformationToFile();
        return "Yeni öğrenci oluşturuldu!";
    }

    //static List<String> students = new ArrayList<>();
    public void studentInfo(String ID) {
        for (Student student : studentsData) {
            if (student.getId().contains(ID)) {
                student.toString();
                System.out.println("Hoşgeldin " + student.getName() + " " + student.getSurname() + "." + "\n" + "Sınıfınız :" + student.getClassName() + "\n" + "Bu dönem aldığınız dersler :" + student.getCourse1() + ", " + student.getCourse2());

                break;
            }
        }

    }

    public void writeStudentInfo() throws IOException {
        File file = new File(FILE_PATH_STUDENT);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.newLine();
        bWriter.write(getId() + "," + getName() + "," + getSurname() + "," + getClassName() + "," + getCourse1() + "," + getCourse2() + "," + course3);
        //loadStudentInformationToFile();
        System.out.println("Yeni öğrenci bilgileri oluşturuldu!");
        bWriter.close();
    }

    public void loadStudentInformationToFile() {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH_STUDENT))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    Student student = new Student(data[0], data[1], data[2], data[3], data[4], data[5], course3);
                    studentsData.add(student);
                    //System.out.println("Öğrenciler taska eklendi");
                }
            }
        } catch (IOException e) {
            System.out.println("Kullanıcı verileri yüklenirken bir hata oluştu: " + e.getMessage());
        }
    }


    public void addNotes(Course course, int midTerm, int finalTerm) {
        course.setMidTerm(midTerm);
        course.setFinalTerm(finalTerm);
        course.printInfo();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }
}
