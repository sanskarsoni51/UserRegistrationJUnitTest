package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationEmailTest {
    UserRegistration user = new UserRegistration();
    @ParameterizedTest
    @CsvSource({
            "abc-100@yahoo.com",
            "abc.100@yahoo.com,true",
            "abc111@abc.com,true",
            "abc-100@abc.net,true",
            "abc.100@abc.com.au,true",
            "abc@1.com,true" ,
            "abc@gmail.com.com,true",
            "abc+100@gmail.com,true"})

        //testEmailValidation will validate the email for the valid emails.
    void testEmailValidation(String emailAdd) {
        boolean isValid = user.ValidateEmailId(emailAdd);
        Assertions.assertTrue(isValid);
    }

    @ParameterizedTest
    @CsvSource({"abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
//            "abc..2002@gmail.com",
//            "abc..2002@gmail.com",
//            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.aa"})

//testInvalidEmail will validate the email for the invalid emails.
    void testInvalidEmail(String email){
        boolean isInvalid=user.ValidateEmailId(email);
        Assertions.assertFalse(isInvalid);
    }
}
