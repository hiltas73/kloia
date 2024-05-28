package com.kloia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    public void loginWithValidCredentials(String email, String password){
        this.emailBox.sendKeys(email);
        this.passwordBox.sendKeys(password);
        this.loginButton.click();
    }

}