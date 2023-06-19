package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser
{
    static String baseURl="https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException
    {
        System.out.print("Enter the browser name: ");
        String browser=sc.nextLine();

        //1. Setup Multi Browser
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver=new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver=new FirefoxDriver();
        }
        else
        {
            System.out.println("Enter only Chrome, Edge or Firefox Browser for testing");
        }

        // 2. Open URL
        driver.get(baseURl);

        //Maximize the browser screen
        driver.manage().window().maximize();

        //Implicit the wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("---------------------------------------");
        System.out.println("3. Page title is : "+ driver.getTitle());

        // 4. Print the current url
        System.out.println("4. Current URL is : " +driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("5. Page source is : "+driver.getPageSource());

        // 6. Enter the email to email field
        //6.1 Find the email element
        WebElement emailField= driver.findElement(By.name("user[email]"));

        //6.2
        emailField.sendKeys("bb@yahoo.com");

        // 7. Enter the password to password field
        //7.1 Find the password element
        WebElement passwordField =driver.findElement(By.name("user[password]"));

        //7.2 Action is to type password
        passwordField.sendKeys("hujh655");

        //Holding the Browser screen for sometime
        Thread.sleep(2000);

        // 8. Close the browser
        driver.close();
    }
}
