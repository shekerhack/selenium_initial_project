package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {

    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUsButton.click();
        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact Us url validation is PASSED");
        else System.out.println("Contact Us url validation is FAILED");

        WebElement heading2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']"));
        System.out.println(heading2.isDisplayed() && heading2.getText().equals("Contact Us") ? "Heading2 validation is PASSED" : "Heading2 validation is FAILED");

        WebElement heading4 = driver.findElement(By.cssSelector("h4[data-aid='CONTACT_FORM_TITLE_REND']"));
        System.out.println(heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE") ? "Heading4 validation is PASSED" : "Heading4 validation is FAILED");

        Driver.quitDriver();
}
}
