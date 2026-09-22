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

    // containsUpper()
    @ParameterizedTest
    @ValueSource(strings = {
            "Password",
            "paSswOrd",
            "PASSWORD",
            "passworD"
    })
    void containsUpper_ShouldReturnTrue_WennPasswordHasUpper(String password) {
        assertTrue(PasswordValidator.containsUpper(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "password",
            "12345678",
    })
    void containsUpper_ShouldReturnFalse_WennPasswordHasNoUpper(String password) {
        assertFalse(PasswordValidator.containsUpper(password));
    }

    @Test
    void containsUpper_ShouldReturnFalse_WennPasswordIsNull() {
        assertFalse(PasswordValidator.containsUpper(null));
    }

    @Test
    void containsUpper_ShouldReturnFalse_WennPasswordsIsEmpty() {
        assertFalse(PasswordValidator.containsUpper(""));
    }

    @Test
    void containsLower() {
    }

    @Test
    void isCommonPassword() {
    }

    @Test
    void containsSpecialChar() {
    }

    @Test
    void isValid() {
    }
}