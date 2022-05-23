package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();
        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact Us url validation is PASSED");
        else System.out.println("Contact Us url validation is FAILED");

        WebElement inputCheckBox = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));
        WebElement checkBox = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        checkBox.click();
        Thread.sleep(2000);
        boolean selectedCheckBox = false;
        if (inputCheckBox.isSelected()) selectedCheckBox = true;

        checkBox.click();
        Thread.sleep(2000);
        boolean deSelected = false;
        if (!inputCheckBox.isSelected()) deSelected = true;

        System.out.println(checkBox.isDisplayed() && selectedCheckBox && deSelected ? "Selected and Deselected Check box validation is PASSED" : "Selected and Deselected Check box validation is FAILED" );

        Driver.quitDriver();

    }
}
