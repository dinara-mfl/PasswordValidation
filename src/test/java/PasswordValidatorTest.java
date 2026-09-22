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
    void containsDigit_ShouldReturnTrue_WennPassworsHaveDigit(String password) {
        assertTrue(PasswordValidator.containsDigit(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Password",
            "asdfhgjd",
            "PASSWORD",
            "Password "
    })
    void containsDigit_ShouldReturnFalse_WennPassworsHaveNoDigit(String password) {
        assertFalse(PasswordValidator.containsDigit(password));
    }

    @Test
    void containsDigit_ShouldReturnFalse_WennPassworIsNull() {
        assertFalse(PasswordValidator.containsDigit(null));
    }

    @Test
    void containsDigit_ShouldReturnFalse_WennPassworIsEmpty() {
        assertFalse(PasswordValidator.containsDigit(""));
    }

    @Test
    void containsUpper() {
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