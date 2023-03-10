package com.juaracoding.ProjectSiloam.pages;

import com.juaracoding.ProjectSiloam.drivers.DriverSingleton;
import com.juaracoding.ProjectSiloam.drivers.strategies.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginSalesPage {
    private WebDriver driver;

    public LoginSalesPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath = "//input[@placeholder='Username']")
   WebElement username;

   @FindBy(xpath = "//input[@placeholder='Password']")
   WebElement password;
 //button[@type='submit']
   @FindBy(xpath = "//button[@type='submit']")
   WebElement btnLogin;
    
   @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtWrongUsernamePassword;
   
   @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtDashboard;
 //h1[@class='page-header']
    public void usernameA(String username){
        this.username.sendKeys(username);
    }
    public void passwordA(String password){
        this.password.sendKeys(password);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
    public String getTxtPleaseFill(){
        return "please fill out this field";
    } public String getTxtWrongUserPass(){
        return "Wrong username or password!";
    }
    public String getTxtDashbaordS(){
        return txtDashboard.getText();
    }
}
