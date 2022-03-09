import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","\"C:\\Users\\melih\\Selenium\\ChromeDriver\\chromedriver.exe\"");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/?hl=tr");

        driver.manage().window().maximize();
    }
}
