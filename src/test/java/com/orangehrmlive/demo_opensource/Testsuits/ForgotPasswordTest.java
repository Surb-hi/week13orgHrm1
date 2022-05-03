package com.orangehrmlive.demo_opensource.Testsuits;

import com.orangehrmlive.demo_opensource.pages.LogIn;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    LogIn logIn=new LogIn();
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        logIn.username("Admin");
        logIn.password("admin12");
        logIn.clickOnFoorgetpassword();
        String expectedMsg="Forgot Your Password?";
        String actualMsg=logIn.forgetPassword();
        Assert.assertEquals(actualMsg,expectedMsg,"");


    }

}
