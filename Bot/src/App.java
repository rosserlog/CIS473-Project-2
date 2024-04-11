import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\logan\\Repos\\CIS473-Project-2\\Bot\\src\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\logan\\Repos\\CIS473-Project-2\\Bot\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kitchen-inky.vercel.app/#/");

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/header/div/button[2]/span[3]"));
        element.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter Your Email']")));
        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Enter Your Password']"));
        
        // Enter username and password
        usernameField.sendKeys("rosserl@mail.gvsu.edu");
        passwordField.sendKeys("fortnite");

        // Find and click the confirm button
        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/button[3]/span[3]"));
        confirmButton.click();
        
        
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    
    } 
}