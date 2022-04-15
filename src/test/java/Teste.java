import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Teste {


    @Test
    public void teste(){
        String chromeDriverPath = "C:/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.google.com.br");
        driver.findElement(By.name("q")).sendKeys("Teste Alan");

        Assert.assertEquals("teste", "teste");
        // Logout
        driver.quit();
    }
}
