package com.seleniumjavatest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaTest {
        static WebDriver driver;

        @Test
        public void chromeTest() {
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle() + " desde Chrome");

            driver.close();

        }
        @Test
        public void firefoxTest() {
            driver = new FirefoxDriver();
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle() + " desde Firefox");

            driver.close();

        }
        @Test
        public void edgeTest() {
            driver = new EdgeDriver();
            driver.get("https://www.google.com");
            System.out.println(driver.getTitle() + " desde Edge");

            driver.close();

        }
}
