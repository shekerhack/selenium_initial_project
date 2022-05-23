package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();
        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact Us url validation is PASSED");
        else System.out.println("Contact Us url validation is FAILED");

        WebElement sendButton = driver.findElement(By.cssSelector("button[data-ux='ButtonPrimary']"));
        sendButton.click();
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() && sendButton.getText().equals("SEND") ? " Send Button validation is PASSED" : "Send Button validation is FAILED");

        Driver.quitDriver();
    }
}
