package practices.labPratic;

import java.io.File;
import java.util.*;

public class LabPratic {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    List<String> characterSet = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    int lenghtOfPassword;
    int lowerLetter;
    int upperLetter;
    int includeNumber;
    int includeCharacter;

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

    public void creatreCharacterSet() {
        final String[] CHARACTERS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        final String[] NUMARIC_CHARACTERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        final String[] SYMBOL_CHARACTERS = {"-", "*", "%", "&", "?", "!", "_", "-", "|", "(", ")", "[", "]", "#", "<", ">"};

        if (lowerLetter == 1) {
            for (String character : CHARACTERS) {
                characterSet.add(character.toLowerCase());
            }
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

    }

    public String createRandomPassword() {
        creatreCharacterSet();

        for (int i = 0; i < lenghtOfPassword; i++) {
            int index = random.nextInt(characterSet.size());
            String randomChar = characterSet.get(index);
            stringBuilder.append(randomChar);
        }

        String randomPassword = stringBuilder.toString();
        System.out.println("Yeni şifreniz : " + randomPassword);

        return randomPassword;
    }

}
