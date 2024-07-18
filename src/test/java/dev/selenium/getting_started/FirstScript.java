package dev.selenium.getting_started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.service.DriverFinder;

import java.io.File;
import java.time.Duration;

public class FirstScript {
    public static void main(String[] args) {
        //WebDriver driver = new ChromeDriver();
        
        //ChromeDriverService service = new ChromeDriverService.Builder().build();
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("/usr/bin/chromedriver")).build();
        WebDriver driver = new ChromeDriver(service);
        
        //ChromeOptions options = new ChromeOptions();
        //options.setBrowserVersion("stable");
        //DriverFinder finder = new DriverFinder(ChromeDriverService.createDefaultService(), options);
        //driverPath = new File(finder.getDriverPath());
        //browserPath = new File(finder.getBrowserPath());
        
        //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        //System.out.println(finder.getDriverPath());
        //System.out.println(finder.getBrowserPath());

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();
    }
}
