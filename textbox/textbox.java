import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class textbox {
    String URL = "https://shibameomeo.github.io/textbox/index.html";
    @Test
    public void testCase2(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.className("form-heading"));
        assertEquals("center",B.getCssValue("text-align"));
        driver.quit();
    }

    @Test
    void testcase4() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("form-login"));
        assertEquals("rgba(33, 37, 41, 1)",B.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase1() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("form-login"));
        assertEquals("rgba(0, 0, 0, 0.8)",B.getCssValue("background-color"));
        driver.quit();

    }
    @Test
    void testcase3() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B2 = driver.findElement(By.id("form-login"));
        assertEquals("16px",B2.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase7() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("text1"));
        assertEquals("rgba(245, 245, 245, 1)",B.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase5() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("text1"));
        assertEquals("16px",B.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase6() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("text2"));
        assertEquals("16px",B.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase8() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("text2"));
        assertEquals("rgba(245, 245, 245, 1)",B.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase9() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("icon1"));
        assertEquals("rgba(255, 255, 255, 1)",B.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase10() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("icon2"));
        assertEquals("rgba(255, 255, 255, 1)",B.getCssValue("color"));
        driver.quit();

    }
    @Test
    public void testCase11(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.className("form-submit"));
        assertEquals("center",B.getCssValue("text-align"));
        driver.quit();
    }
    @Test
    void testcase14() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("submit1"));
        assertEquals("rgba(255, 255, 255, 1)",B.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase15() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("submit1"));
        assertEquals("16px",B.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase16() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("eye1"));
        assertEquals("14px",B.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase17() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/textbox/index.html");

        WebElement B = driver.findElement(By.id("submit1"));
        assertEquals("rgba(255, 255, 255, 1)",B.getCssValue("color"));
        driver.quit();

    }


}
