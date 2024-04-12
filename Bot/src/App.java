import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws Exception {
        //Set up web driver
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kylew\\OneDrive\\Documents\\W24\\CIS457\\Project2\\CIS473-Project-2\\Bot\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Go to website
        driver.get("https://kitchen-inky.vercel.app/#/");
        Thread.sleep(1000);

        //Go to login screen
        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/header/div/button[2]/span[3]"));
        element.click();
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //Enter username and password
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter Your Email']")));
        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Enter Your Password']"));
        usernameField.sendKeys("rosserl@mail.gvsu.edu");
        passwordField.sendKeys("fortnite");
        Thread.sleep(1000);

        // Find and click the confirm button
        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/button[3]"));
        confirmButton.click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        // click lasagna
        WebElement lasagna = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div[2]/div/div[1]/div/div/button/span[3]/div/div[1]/div/img"));
        lasagna.click();
        Thread.sleep(1000);

        //Click Comment
        WebElement comment = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/p[3]/button/span[3]"));
        comment.click();
        Thread.sleep(1000);

        //Write Review
        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"input-32\"]"));
        textBox.sendKeys("This lasagna tastes like wet bread -The bot");
        Thread.sleep(1000);

        //Submit Review
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div/p[3]/button[2]/span[3]"));
        submit.click();
        Thread.sleep(3000);

        //Exit
        driver.quit();
    
    } 
}