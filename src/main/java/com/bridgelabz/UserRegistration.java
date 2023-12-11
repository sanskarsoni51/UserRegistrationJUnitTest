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
}
