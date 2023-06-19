package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser
{
    public static void main(String[] args) throws InterruptedException
    {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";

        // 1. Setup Chrome browser
        WebDriver driver=new ChromeDriver();

        // 2. Open URL
        driver.get(baseUrl);

        //Maximize the browser
        driver.manage().window().maximize();

        //Implicit time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("--------------------------------------");
        System.out.println("3. Page title is : " +driver.getTitle());

        // 4. Print the current url
        System.out.println("4. Current URL is : "+driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("5. Page source is : "+driver.getPageSource());

        // 6. Enter the email to email field
        //6.1 Find the email element
        WebElement emailField= driver.findElement(By.id("user[email]"));

        //6.2 Action is to type email
        emailField.sendKeys("hj@gmail.com");

        // 7. Enter the password to password field
        //7.1 Find the password element
        WebElement passwordField= driver.findElement(By.id("user[password]"));

        //7.2 Action is to type password
        passwordField.sendKeys("sd584s");

        //Hold the browser screen
        Thread.sleep(2000);

        // 8. Close the browser
        driver.close();
    }
}
