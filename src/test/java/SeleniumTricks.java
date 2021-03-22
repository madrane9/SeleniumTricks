import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SeleniumTricks {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        // wenn man mehrere Borwser testen möchte, benutzt man WebDriverManager
        //Edge
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Websitex, Dynamic drop Down
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[14]/a")).click();
        driver.findElement(By.xpath("//a[@value='JAI']")).click();

        ///Web Element wie Checkbox and Radiobutton
        WebElement Option1 =  driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
        Option1.click();
       // IsSelected
        System.out.println(Option1.isSelected());

        //Mouse Interactions (Handlinf Ajax/Mouse)==>Action
        //wie wollen nur den Maus rüberbewegen kein Klick.

        //WebElement electronis = driver.findElement(By.linkText("Electronics"));
       // Action action = (Action) new Actions(driver);


    }
}
