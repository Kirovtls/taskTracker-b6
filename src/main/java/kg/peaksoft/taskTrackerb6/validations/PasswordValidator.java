package kg.peaksoft.taskTrackerb6.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordValid, String> {
    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        if (password.length() > 6) {
            return true;
        } else {
            return false;
        }
    }
}
