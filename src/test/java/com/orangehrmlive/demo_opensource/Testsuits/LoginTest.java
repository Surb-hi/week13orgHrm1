package com.orangehrmlive.demo_opensource.Testsuits;

import com.orangehrmlive.demo_opensource.pages.LogIn;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    LogIn logIn=new LogIn();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        logIn.username("Admin");
        logIn.password("admin123");
        logIn.login();
        String expectedMsg="Welcome";
        String actualMsg=logIn.welcome().substring(0,7);
        Assert.assertEquals(actualMsg,expectedMsg,"");


    }
}
