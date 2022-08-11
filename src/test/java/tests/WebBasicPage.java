package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebBasicPage {

    public static void main(String[] args){

        testWebBasicPage();
    }
    public static void testWebBasicPage(){
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        WebElement text1 = driver.findElement(By.cssSelector("#para1"));
        System.out.println(text1.getText());

        WebElement text2 = driver.findElement(By.cssSelector("#para2"));
        System.out.println(text2.getText());

        driver.quit();
    }
}

