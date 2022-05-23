package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();
        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact Us url validation is PASSED");
        else System.out.println("Contact Us url validation is FAILED");

        WebElement heading1 = driver.findElement(By.xpath("//h1[@role='heading']"));
        if(heading1.isDisplayed() && heading1.getText().equals("Connect With Us")) System.out.println("Heading 1 validation is Passed");
        else System.out.println("Heading 1 validation is Failed");

        WebElement facebookIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        System.out.println(facebookIcon.isDisplayed() && facebookIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "Facebook icon and hyperlink validation is PASSED" : "Facebook icon and hyperlink validation is FAILED");

        WebElement instagramIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
        System.out.println(instagramIcon.isDisplayed() && instagramIcon.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "Instagram icon and hyperlink validation is PASSED" : "Instagram icon and hyperlink validation is FAILED");

        Driver.quitDriver();
    }

}
