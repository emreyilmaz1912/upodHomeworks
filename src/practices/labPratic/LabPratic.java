package practices.labPratic;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class LabPratic {
    static final String[] CHARACTERS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static final String[] NUMARIC_CHARACTERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static final String[] SYMBOL_CHARACTERS = {"-", "*", "%", "&", "?", "!", "_", "-", "|", "(", ")", "[", "]", "#", "<", ">"};
    static final String[] CHARACTERS_LOWER = new String[CHARACTERS.length];

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    List<String> characterSet = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    int lenghtOfPassword;
    int lowerLetter;
    int upperLetter;
    int includeNumber;
    int includeCharacter;
    String randomPassword;
    String[] password = {};

    public  void writeFile(String passWord) throws IOException {
        Date dateIsNow = new Date();

        File file = new File("password.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.newLine();
        bWriter.write("Tarih : "+ dateIsNow +" | "+"Şifre : "+ passWord);
        bWriter.close();
    }
    public  void readFile()  {

        try {
            File file = new File("password.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Bir hata oluştu.");
            e.printStackTrace();
        }
    }


    public void clearFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("password.txt"));
            writer.write("");
            writer.close();
            System.out.println("Dosyanın içeriği temizlendi : " + "password.txt");
        } catch (IOException e) {
            System.out.println("Dosya temizlenirken bir hata oluştu: " + e.getMessage());
        }
    }

    public void menu() {
        System.out.print("Şifrenin uzunluğu ne kadar olmalı? :");
        lenghtOfPassword = input.nextInt();

        System.out.print("Şifrede küçük harf olsun mu?\n1 - Evet : \n2 - Hayır : \nSeçiminiz : ");
        lowerLetter = input.nextInt();

        System.out.print("Şifrede büyük harf olsun mu?\n1 - Evet : \n2 - Hayır : Seçiminiz : ");
        upperLetter = input.nextInt();

        System.out.print("Şifrede sayı olsun mu?\n1 - Evet : \n2 - Hayır : Seçiminiz : ");
        includeNumber = input.nextInt();

        System.out.print("Şifrede karakter olsun mu?\n1 - Evet : \n2 - Hayır : Seçiminiz : ");
        includeCharacter = input.nextInt();
    }

    public void createCharacterSet() {
        for (int i = 0; i < CHARACTERS.length; i++) {
            CHARACTERS_LOWER[i] = CHARACTERS[i].toLowerCase();

        }
        if (lowerLetter == 1) {
            Collections.addAll(characterSet, CHARACTERS_LOWER);
        }
        if (upperLetter == 1) {
            Collections.addAll(characterSet, CHARACTERS);
        }
        if (includeNumber == 1) {
            Collections.addAll(characterSet, NUMARIC_CHARACTERS);
        }
        if (includeCharacter == 1) {
            Collections.addAll(characterSet, SYMBOL_CHARACTERS);
        }
        Collections.shuffle(characterSet);

    }


    public String createRandomPassword() {
        createCharacterSet();
        for (int i = 0; i < lenghtOfPassword; i++) {
            int index = random.nextInt(characterSet.size());
            String randomChar = characterSet.get(index);
            stringBuilder.append(randomChar);
        }

        String randomPassword = stringBuilder.toString();
        try {
            writeFile(randomPassword);
            System.out.println("Şifreniz password.txt dosyasına eklendi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //IsControl control = new IsControl(randomPassword, CHARACTERS, NUMARIC_CHARACTERS, SYMBOL_CHARACTERS, CHARACTERS_LOWER);
      //  control.runControl();
        System.out.println("Yeni şifreniz : " + randomPassword);
        return randomPassword;
    }

}
