package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Login
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.kupibilet.ru");
        driver.findElement(By.xpath("//div[contains(text(), 'Войти')]")).click();
        driver.findElement(By.cssSelector("css=*[data-test=\"email-input\"]")).click();
        driver.findElement(By.cssSelector("css=*[data-test=\"email-input\"]")).sendKeys("gereve8018@ztymm.com");
        driver.findElement(By.cssSelector("css=*[data-test=\"password-input\"]")).click();
        driver.findElement(By.cssSelector("css=*[data-test=\"password-input\"]")).sendKeys("Qwerty123");
        driver.findElement(By.xpath("//button[@data-test=\"sign-in-button\"]")).click();
        driver.quit();
    }

}
