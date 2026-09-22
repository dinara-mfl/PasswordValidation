import org.junit.jupiter.api.Test;
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


    @Test
    void containsDigit() {
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