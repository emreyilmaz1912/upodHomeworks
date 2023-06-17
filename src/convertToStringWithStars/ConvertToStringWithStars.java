package convertToStringWithStars;

public class ConvertToStringWithStars {


    public static String convertToStringWithStars(String text){
        if (text.length() <= 1){
            return text;
        }else {
            char validChar = text.charAt(0);
            char nextChar = text.charAt(1);
            String remainingText = text.substring(1); //ilk karakteri çıkararak geri kalanını tekrar atar,

            String result = validChar + (isStarAllowed(validChar, nextChar) ? "*" : "") + convertToStringWithStars(remainingText);
            return result;
        }

    }
   public static boolean isStarAllowed(char validChar, char nextChar) {

        // "*" koyulup koyulmayacağını sorguluyor.
        if (validChar == ' ' || validChar == '.' || validChar == ',') {
            return false;
        }
        if (nextChar == ' ' || nextChar == '.' || nextChar == ',') {
            return false;
        }
        return true;
    }


}
