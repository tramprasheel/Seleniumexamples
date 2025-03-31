package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class drivermethods {
    public static void main(String[] args) {
        // Set up WebDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // 📌 1️⃣ Open Google
        driver.get("https://www.google.com/");
        System.out.println("Main Page Title: " + driver.getTitle());

        // 📌 2️⃣ Get Window Handle of Google
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindow);

        // 📌 3️⃣ Open Wikipedia in a new tab using JavaScript
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open('https://www.wikipedia.org/', '_blank');");

        // 📌 4️⃣ Get All Window Handles
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total Windows Open: " + allWindows.size());

        // 📌 5️⃣ Switch to Wikipedia Tab
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to New Window: " + driver.getTitle());
                break;
            }
        }

        // 📌 6️⃣ Perform an action in the new tab (Search for "Selenium WebDriver" in Wikipedia)
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        // 📌 7️⃣ Switch Back to Google
        driver.switchTo().window(mainWindow);
        System.out.println("Switched Back to Main Window: " + driver.getTitle());

        // 📌 8️⃣ Manage Window (Maximize)
        driver.manage().window().maximize();
        System.out.println("Window Maximized");

        // 📌 9️⃣ Quit all browser windows
        driver.quit();
        System.out.println("All Windows Closed");
    }
}
