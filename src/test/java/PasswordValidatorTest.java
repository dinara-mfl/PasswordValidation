import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidatorTest {

    // hasMinLength()
    @Test
    void hasMinLength_ShouldreturnTrue_WennLengthIs8() {
        assertTrue(PasswordValidator.hasMinLength("Abc1defg", 8));
    }

    @Test
    void hasMinLength_ShouldreturnFalse_WennLengthIs7() {
        assertFalse(PasswordValidator.hasMinLength("Abc1def", 8));
    }

    @Test
    void hasMinLength_ShouldreturnTrue_WennLengthIs9() {
        assertTrue(PasswordValidator.hasMinLength("Abc1defgh", 8));
    }

    @Test
    void hasMinLength_ShouldreturnFalse_WennLengthIsNull() {
        assertFalse(PasswordValidator.hasMinLength(null, 8));
    }

    @Test
    void hasMinLength_ShouldreturnFalse_WennLengthIsNegativ() {
        assertFalse(PasswordValidator.hasMinLength(null, 8));
    }

    @Test
    void hasMinLength_ShouldreturnFalse_WennLengthIsEmpty() {
        assertFalse(PasswordValidator.hasMinLength("Abc1defg", -1));
    }

    // containsDigit()
    @ParameterizedTest
    @ValueSource(strings = {
            "Password1",
            "1Password",
            "Pass123word",
            "12345678"
    })
    void containsDigit_ShouldReturnTrue_WennPasswordHasDigit(String password) {
        assertTrue(PasswordValidator.containsDigit(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Password",
            "asdfhgjd",
            "PASSWORD",
            "Password "
    })
    void containsDigit_ShouldReturnFalse_WennPasswordHasNoDigit(String password) {
        assertFalse(PasswordValidator.containsDigit(password));
    }

    @Test
    void containsDigit_ShouldReturnFalse_WennPasswordIsNull() {
        assertFalse(PasswordValidator.containsDigit(null));
    }

    @Test
    void containsDigit_ShouldReturnFalse_WennPasswordIsEmpty() {
        assertFalse(PasswordValidator.containsDigit(""));
    }

    // containsUpperCase()
    @ParameterizedTest
    @ValueSource(strings = {
            "Password",
            "paSswOrd",
            "PASSWORD",
            "passworD"
    })
    void containsUpperCase_ShouldReturnTrue_WennPasswordHasUpper(String password) {
        assertTrue(PasswordValidator.containsUpperCase(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "password",
            "12345678",
    })
    void containsUpperCase_ShouldReturnFalse_WennPasswordHasNoUpper(String password) {
        assertFalse(PasswordValidator.containsUpperCase(password));
    }

    @Test
    void containsUpperCase_ShouldReturnFalse_WennPasswordIsNull() {
        assertFalse(PasswordValidator.containsUpperCase(null));
    }

    @Test
    void containsUpperCase_ShouldReturnFalse_WennPasswordIsEmpty() {
        assertFalse(PasswordValidator.containsUpperCase(""));
    }

    // containsLowerCase()
    @ParameterizedTest
    @ValueSource(strings = {
            "password",
            "PAsSWoRD",
            "pASSWORD",
            "PASSWORd"
    })
    void containsLowerCase_ShouldReturnTrue_WennPasswordHasLower(String password) {
        assertTrue(PasswordValidator.containsLowerCase(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "PASSWORD",
            "12345678",
    })
    void containsLowerCase_ShouldReturnFalse_WennPasswordHasNoLower(String password) {
        assertFalse(PasswordValidator.containsLowerCase(password));
    }

    @Test
    void containsLowerCase_ShouldReturnFalse_WennPasswordIsNull() {
        assertFalse(PasswordValidator.containsLowerCase(null));
    }

    @Test
    void containsLowerCase_ShouldReturnFalse_WennPasswordIsEmpty() {
        assertFalse(PasswordValidator.containsLowerCase(""));
    }

    // isCommonPassword()
    @ParameterizedTest
    @ValueSource(strings = {
            "password",
            "PASSWORD",
            " password ",
            "Password1",
            "12345678",
            "Aa345678"
    })
    void isCommonPassword_ShouldReturnTrue_WennPasswordIsCommon(String password) {
        assertTrue(PasswordValidator.isCommonPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "SecurePassword",
            "fjksoi74hf",
            "DifferentPassword",
            "74892657"
    })
    void isCommonPassword_ShouldReturnFalse_WennPasswordIsNotCommon(String password) {
        assertFalse(PasswordValidator.isCommonPassword(password));
    }

    @Test
    void isCommonPassword_ShouldReturnFalse_WennPasswordIsNull() {
        assertFalse(PasswordValidator.isCommonPassword(null));
    }

    @Test
    void isCommonPassword_ShouldReturnFalse_WennPasswordIsEmpty() {
        assertFalse(PasswordValidator.isCommonPassword(""));
    }

    @Test
    void containsSpecialChar() {
    }

    @Test
    void isValid() {
    }
}