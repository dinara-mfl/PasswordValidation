public class PasswordValidator {

    public static boolean hasMinLength(String password, int min) {
        return password != null
                && min >= 0
                && password.length() >= min;
    }

    public static boolean containsDigit(String password) {
        if (password == null) return false;

        char[] characters = password.toCharArray();

        for (char character: characters) {
            if (character >= '0' && character <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperCase(String password) {
        if (password == null) return false;

        char[] characters = password.toCharArray();

        for(char character: characters){
            if (Character.isUpperCase(character)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsLowerCase(String password) {
        if (password == null) return false;

        char[] characters = password.toCharArray();

        for(char character: characters){
            if (Character.isLowerCase(character)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password) {
        return false;
    } // kleine interne Liste

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed) {
        return false;
    }

    // Optionale Gesamtsicht:
    public static boolean isValid(String password) {
        return false;
    } // nutzt die obenstehenden Checks
}
