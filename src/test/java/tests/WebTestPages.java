package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTestPages {

    public static void main(String[] args){

        testWebTestPages();
    }
    public static void testWebTestPages(){
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/elements");

        WebElement title = driver.findElement(By.cssSelector(".main-header"));
        System.out.println(title.getText());

        //WebElement text = driver.findElement(By.tagName("h2"));
        //System.out.println(text.getText());
        //text.click();

        //driver.quit();
    }
}
