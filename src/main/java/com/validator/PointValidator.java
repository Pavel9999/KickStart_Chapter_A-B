package com.validator;


import com.exception.PointValidatorException;

import java.util.List;
import java.util.regex.Pattern;

public class PointValidator implements Validator <List<String>> {

    public final static String DECIMAL_PATTERN = "-?\\d+(\\.\\d+)?";
    @Override
    public void fullValidation(List<String> object) {

        for (String str:
        object) {
            if(!Pattern.matches(DECIMAL_PATTERN, str)){
                throw new PointValidatorException("value is not correct "+str);
            }
        }
    }


}
