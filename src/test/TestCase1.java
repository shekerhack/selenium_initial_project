package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();
       if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact Us url validation is PASSED");
       else System.out.println("Contact Us url validation is FAILED");

        WebElement logo = driver.findElement(By.cssSelector("img[id='n-48560']"));
        if(logo.isDisplayed()) System.out.println("ComfyElite logo validation is PASSED");
        else System.out.println("ComfyElite logo validation is FAILED!!!");

        WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));
        if(heading2.isDisplayed() && heading2.getText().equals("High quality comfy pillows and accessories for travel,office and home.")) System.out.println("ComfyElite Heading2 validation is PASSED");
        else System.out.println("ComfyElite Heading2 validation is FAILED!!!");

        Driver.quitDriver();
    }
}
