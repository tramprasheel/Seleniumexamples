package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo{
    public static void main(String[] args) throws InterruptedException {
        // To open the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);

        // To delete cookies
        driver.manage().deleteAllCookies();

        // ✅ To set the size of the window
        Dimension d = new Dimension(500, 500);  // Import org.openqa.selenium.Dimension
        driver.manage().window().setSize(d);
        Thread.sleep(2000);

        // ✅ To set the position of the window
        Point p = new Point(250, 250);  // Import org.openqa.selenium.Point
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);

        // To maximize the window
        driver.manage().window().maximize();
    }
}
