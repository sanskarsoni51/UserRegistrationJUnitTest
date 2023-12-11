package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    Assert Assertions = null;

    /*ValidFirstName method is testing a First name*/
    @Test
    public void ValidFirstName(){
        boolean a = userRegistration.ValidateFirstName("Sanskar");
        boolean b = userRegistration.ValidateFirstName("sanskar");
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);
    }

    /*ValidLastName method is testing a last name*/
    @Test
    public void ValidLastName()
    {
        boolean a =userRegistration.ValidateLastName("Soni");
        boolean b=userRegistration.ValidateLastName("soni");
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);
    }
    /*ValidEmailId method is testing an email id*/
    @Test
    public void ValidEmailId()
    {
        boolean a=userRegistration.ValidateEmailId("Sanskarsoni89@gmail.com");
        boolean b=userRegistration.ValidateEmailId("sanskar.gmail.com");
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);
    }

    /*ValidMobileNo method is testing a mobile number*/
    @Test
    public void ValidMobileNo()
    {
        boolean a=userRegistration.ValidateMobileNumber("+919887279510");
        boolean b=userRegistration.ValidateMobileNumber("755879757");
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);
    }

    /*ValidPassword method is testing a password */
    @Test
    public void ValidPassword()
    {
        boolean a=userRegistration.ValidatePassword("Sanskar@123");
        boolean b=userRegistration.ValidatePassword("sanskar");
        Assertions.assertTrue(a);
        Assertions.assertFalse(b);
    }
}
