package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.nio.channels.WritableByteChannel;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();
        if(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("Contact Us url validation is PASSED");
        else System.out.println("Contact Us url validation is FAILED");

        WebElement firstNameInputBox = driver.findElement(By.cssSelector("input[data-aid='First Name']"));
        WebElement firstNameInputBoxLabel = driver.findElement(By.xpath("//*[text()='First Name*']"));
        String firstName = "Sheker";
        firstNameInputBox.sendKeys(firstName);
        System.out.println(firstNameInputBox.isDisplayed() && firstNameInputBoxLabel.getText().equals("First Name*") && firstNameInputBox.getAttribute("value").equals(firstName)
                ? "First Name input box validation is PASSED" : "First Name input box validation is FAILED" );

        WebElement lastNameInputBox = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement lastNameInputBoxLabel = driver.findElement(By.xpath("//*[text()='Last Name*']"));
        String lastName = "Hakberdiyeva";
        lastNameInputBox.sendKeys(lastName);
        System.out.println(lastNameInputBox.isDisplayed() && lastNameInputBoxLabel.getText().equals("Last Name*") && lastNameInputBox.getAttribute("value").equals(lastName)
             ? "Last Name input box validation is PASSED" : "Last Name input box validation is FAILED");

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL']"));
        WebElement emailInputBoxLabel = driver.findElement(By.xpath("//*[text()='Email*']"));
        String email = "luckysheker.92@gmail.com";
        emailInputBox.sendKeys(email);
        System.out.println(emailInputBox.isDisplayed() && emailInputBoxLabel.getText().equals("Email*") && emailInputBox.getAttribute("value").equals(email)
                ? "Email input box validation is PASSED" : "Email input box validation is FAILED");

        WebElement messageInputBox = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));
        WebElement messageLabel = driver.findElement(By.xpath("//textarea[@aria-label='Message*']"));
        String message = "Waiting for new release";
        messageInputBox.sendKeys(message);
        System.out.println(messageInputBox.isDisplayed() && messageLabel.getText().equals("Massage*") && messageInputBox.getAttribute("placeholder").equals(message)
                ? "Massage input box validation is PASSED" : "Massage input box validation is FAILED");

        Driver.quitDriver();
    }
}
