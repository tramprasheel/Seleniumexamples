package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumexample {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Instagram login page
        driver.get("https://www.instagram.com/accounts/login/");

        // Wait for elements to load (basic sleep, can be replaced with WebDriverWait)
        try {
            Thread.sleep(5000); // Wait for page to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate username field
        WebElement usernameField = driver.findElement(By.name("username"));
        // Locate password field
        WebElement passwordField = driver.findElement(By.name("password"));

        // Get attribute values
        String usernamePlaceholder = usernameField.getAttribute("aria-label");
        String passwordPlaceholder = passwordField.getAttribute("aria-label");

        // Print placeholder values
        System.out.println("Username Field Placeholder: " + usernamePlaceholder);
        System.out.println("Password Field Placeholder: " + passwordPlaceholder);

        // Get element positions
        Point usernameLocation = usernameField.getLocation();
        Point passwordLocation = passwordField.getLocation();

        System.out.println("Username Field Location - X: " + usernameLocation.getX() + ", Y: " + usernameLocation.getY());
        System.out.println("Password Field Location - X: " + passwordLocation.getX() + ", Y: " + passwordLocation.getY());

        // Close the browser
        driver.quit();
    }
}


