package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class googlecareers {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Google Careers page
        driver.get("https://careers.google.com/");

        // Wait for elements to load (use WebDriverWait for better handling)
        try {
            Thread.sleep(5000); // Wait for page to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate multiple elements - Example: Find all links (anchor tags) on the homepage
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print tag names of first 5 links
        System.out.println("First 5 Links on Google Careers:");
        for (int i = 0; i < Math.min(allLinks.size(), 5); i++) {
            WebElement link = allLinks.get(i);
            System.out.println("Tag Name: " + link.getTagName() + " | Text: " + link.getText());
        }

        // Locate a specific element (e.g., "Jobs" search button)
        WebElement jobsSearchButton = driver.findElement(By.cssSelector("button[class*='search']"));

        // Check if the button is displayed
        boolean isButtonVisible = jobsSearchButton.isDisplayed();
        System.out.println("Is 'Jobs' Search Button Displayed? " + isButtonVisible);

        // Print the tag name of the button
        System.out.println("Search Button Tag Name: " + jobsSearchButton.getTagName());

        // Close the browser
        driver.quit();
    }
}
