package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LogIn extends Utility {
    By usernameLink = By.name("txtUsername");
    By passwordLink = By.xpath("//input[@id='txtPassword']");
    By logInLink = By.xpath("//input[@id='btnLogin']");
    By welcomeText = By.xpath("//a[@id='welcome']");
    By clickonforgetpassword=By.xpath("//a[contains(text(),'Forgot your password?')]");
    By forgetPasswordLink=By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void username(String textUsername) {
        sendTextToElement(usernameLink, textUsername);
    }

    public void password(String textPassword) {
        sendTextToElement(passwordLink, textPassword);
    }

    public void login() {
        clickOnElement(logInLink);
    }

    public String welcome() {
        return getTextFromElement(welcomeText);
    }
    public void clickOnFoorgetpassword(){
        clickOnElement(clickonforgetpassword);
    }
    public String forgetPassword(){
        return getTextFromElement(forgetPasswordLink);
    }
}
