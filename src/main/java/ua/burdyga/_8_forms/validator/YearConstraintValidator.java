package ua.burdyga._8_forms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;
import java.util.Date;

public class YearConstraintValidator implements ConstraintValidator<Year, Date> {

    private int annotationYear;

    @Override
    public void initialize(Year year) {
        this.annotationYear = year.value();
    }

    @Override
    public boolean isValid(Date target, ConstraintValidatorContext ctx) {
        if (target == null)
            return true;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(target);
        int fieldYear = calendar.get(Calendar.YEAR);
        return fieldYear == annotationYear;
    }
}
