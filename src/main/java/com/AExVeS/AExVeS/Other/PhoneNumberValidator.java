package com.AExVeS.AExVeS.Other;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements 
  ConstraintValidator<PhoneNumber, String> {

    @Override
    public void initialize(PhoneNumber contactNumber) {
    	
    }

    @Override
    public boolean isValid(String contactField,
      ConstraintValidatorContext cxt) {
        return contactField != null && contactField.matches("(\\+34|0)[0-9]{9}")
          && (contactField.length() > 8) && (contactField.length() < 14);
    }

}