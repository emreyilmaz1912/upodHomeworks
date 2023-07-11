package practices.labPratic;

import java.io.*;
import java.util.*;

public class LabPratic {
    static final String[] CHARACTERS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static final String[] NUMARIC_CHARACTERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static final String[] SYMBOL_CHARACTERS = {"-", "*", "%", "&", "?", "!", "_", "-", "|", "(", ")", "[", "]", "#", "<", ">"};
    static final String[] CHARACTERS_LOWER = new String[CHARACTERS.length];
    static List<String> characterSet = new ArrayList<>();
    static List<String[]> list = new ArrayList<>();
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    private int lenghtOfPassword;
    private int lowerLetter;
    private int upperLetter;
    private int includeNumber;
    private int includeCharacter;

    public LabPratic(int lenghtOfPassword) {
        this.lenghtOfPassword = lenghtOfPassword;
    }

    public LabPratic() {

    }

    public int getLenghtOfPassword() {
        return lenghtOfPassword;
    }

    public void setLenghtOfPassword(int lenghtOfPassword) {
        this.lenghtOfPassword = lenghtOfPassword;
    }

    public void writeFile(String passWord) throws IOException {
        Date dateIsNow = new Date();

        File file = new File("password.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.newLine();
        bWriter.write("Tarih : " + dateIsNow + " | " + "Şifre : " + passWord);
        bWriter.close();
    }

    public void readFile() {

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


    public void clearFile() {
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
            list.add(CHARACTERS_LOWER);
        }
        if (upperLetter == 1) {
            Collections.addAll(characterSet, CHARACTERS);
            list.add(CHARACTERS);
        }
        if (includeNumber == 1) {
            Collections.addAll(characterSet, NUMARIC_CHARACTERS);
            list.add(NUMARIC_CHARACTERS);
        }
        if (includeCharacter == 1) {
            Collections.addAll(characterSet, SYMBOL_CHARACTERS);
            list.add(SYMBOL_CHARACTERS);
        }
        Collections.shuffle(characterSet);
    }

    public String createRandomPassword() {

        for (int i = 0; i < LabPraticTest.value; i++) {

            int index = random.nextInt(characterSet.size());
            String randomChar = characterSet.get(index);
            stringBuilder.append(randomChar);
        }
        String randomPassword = stringBuilder.toString();
        IsControl control = new IsControl(randomPassword, list);
        if (list.size() <= LabPraticTest.value) {
            control.runControl();
        } else {
            System.out.println("Yeni şifreniz : " + randomPassword);
            try {
                writeFile(randomPassword);
                System.out.println("Şifreniz password.txt dosyasına eklendi!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return randomPassword;
    }

    public int getLowerLetter() {
        return lowerLetter;
    }

    public void setLowerLetter(int lowerLetter) {
        this.lowerLetter = lowerLetter;
    }

    public int getUpperLetter() {
        return upperLetter;
    }

    public void setUpperLetter(int upperLetter) {
        this.upperLetter = upperLetter;
    }

    public int getIncludeNumber() {
        return includeNumber;
    }

    public void setIncludeNumber(int includeNumber) {
        this.includeNumber = includeNumber;
    }

    public int getIncludeCharacter() {
        return includeCharacter;
    }

    public void setIncludeCharacter(int includeCharacter) {
        this.includeCharacter = includeCharacter;
    }
}
