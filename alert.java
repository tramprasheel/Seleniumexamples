package automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
        public static void main(String[] args) {
            // Set up WebDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            // Navigate to a test page with an alert
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // Locate and click the button that triggers the alert
            WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
            alertButton.click();

            // Switch to alert and handle it
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert Text: " + alert.getText()); // Print alert message
            alert.accept(); // Click OK

            // Close the browser
            driver.quit();
        }
    }
