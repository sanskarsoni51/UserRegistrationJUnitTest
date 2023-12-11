package com.bridgelabz;

public class UserRegistration {
    //    @Desc:- it is a class which checks fist name and validate it
//    @Param:- takes first name as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateFirstName(String FirstName){
        boolean isValid = FirstName.matches("[A-Z][a-z]{3,15}");
        if(!isValid){
            System.out.println("first name is not valid");
        }

        return isValid;
    }
    //    @Desc:- it is a class which checks last name and validate it
//    @Param:- takes last name as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateLastName(String LastName){
        boolean isValid = LastName.matches("[A-Z][a-z]{3,15}");
        if(!isValid){
            System.out.println("last name is not valid");
        }

        return isValid;
    }

    //    @Desc:- it is a class which checks email and validate it
//    @Param:- takes email as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateEmailId(String Email) {
        boolean isValidEmail = Email.matches("^[A-Za-z][A-Za-z0-9.-_%+-]+@[A-Za-z0-9-_%+-]+(\\.[A-Za-z]{2,}){1,2}$");
        if (!isValidEmail) {
            System.out.println("Email id is not valid ");
        }
        return isValidEmail;
    }

    //    @Desc:- it is a class which checks mobile number and validate it
//    @Param:- takes number as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidateMobileNumber(String Number) {
        boolean isValidMobileNumber = Number.matches("^\\+\\d{2}?\\d{10}$");
        if (!isValidMobileNumber)
        {
            System.out.println("mobile number is not valid ");
        }
        return isValidMobileNumber;
    }

    //    @Desc:- it is a class which checks Password and validate it
//    @Param:- takes password as the input to check
//    @Return:- return true/false on the basis of input
    public boolean ValidatePassword(String password) {
//        we are applying different conditions to check different things in password like
//        ( for AT LEAST ONE UPPERCASE WE USED (?=.*[A-Z]))
//        (FOR MINIMUM LENGTH 8 WE USED {8,})
//        (FOR ATLEAST ONE NUMERIC DIGIT (?=.*\d))

        boolean isValidPassword = password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[.@$!%*?&])[A-Za-z0-9.@$!%*?&]{8,}$");
        if (!isValidPassword) {
            System.out.println("Password invalid");
        }
        return isValidPassword;
    }
}
