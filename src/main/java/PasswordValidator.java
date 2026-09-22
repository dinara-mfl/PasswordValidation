import java.util.Locale;
import java.util.Set;

public class PasswordValidator {

    private static final int MIN_LENGTH = 8;
    public static final String ALLOWED_SPECIALS = "!@#$%&*?_-.";
    private static final Set<String> COMMON_PASSWORDS = Set.of(
            "password",
            "passwort",
            "passwort1",
            "password1",
            "12345678",
            "aa345678",
            "admin123",
            "11111111",
            "qwerty123"
    );

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
        if (password == null) return false;
        return COMMON_PASSWORDS.contains(password.trim().toLowerCase(Locale.ROOT));
    }

    public static boolean containsSpecialChar(String password, String allowed) {
        if (password == null || allowed == null || allowed.isEmpty()) {
            return false;
        }

        char[] characters = password.toCharArray();

        for (char character : characters) {
            if (allowed.indexOf(character) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static ValidationResult validate(String password, String allowed) {
        ValidationResult result = new ValidationResult();

        if (!hasMinLength(password, MIN_LENGTH))
            result.addError("Min length: " + MIN_LENGTH);
        if (!containsDigit(password))
            result.addError("Digit is required");
        if (!containsUpperCase(password))
            result.addError("Upper case is required");
        if (!containsLowerCase(password))
            result.addError("Lower case is required");
        if (!containsSpecialChar(password, allowed))
            result.addError("Need a special character from: " + allowed);
        if (isCommonPassword(password))
            result.addError("The password is too common");

        return result;
    }

    public static boolean isValid(String password, String allowed) {
        return validate(password, allowed).isValid();
    }

    public static boolean isValid(String password) {
        return isValid(password, ALLOWED_SPECIALS);
    }
}
