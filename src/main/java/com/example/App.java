package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main( String[] args ) throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1024,768", "--no-sandbox", "--display=:99"); // https://github.com/SeleniumHQ/selenium/issues/4961
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(3000);
        driver.quit();
    }
}
