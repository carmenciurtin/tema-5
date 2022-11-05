package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class WebLocators {
    public static void main(String[] args) throws MalformedURLException {
        testWebLocators();
    }
    public static void testWebLocators() throws MalformedURLException {
        RemoteWebDriver driver = WebDriverConfig.getRemoteChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");

        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        WebElement text1 = driver.findElement(By.cssSelector("p#p1.normal"));
        System.out.println(text1.getText());

        WebElement text26 = driver.findElement(By.cssSelector("p#p26.normal"));
        System.out.println(text26.getText());

        WebElement jump0 = driver.findElement(By.cssSelector(" a[href=\"#pName0\"]"));
        System.out.println(jump0.getText());
        jump0.click();


        driver.quit();
    }
}
