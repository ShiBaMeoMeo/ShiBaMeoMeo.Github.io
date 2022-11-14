import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    String URL = "https://shibameomeo.github.io/mouseclick/index.html";
    @Test //button 1
    void testcase1() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B1 = driver.findElement(By.id("khung1"));
        B1.click();
        driver.quit();

    }
    @Test
    void testcase2() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B1 = driver.findElement(By.id("khung1"));
        assertEquals("Mlearning!",B1.getText());
        driver.quit();

    }
    @Test
    void testcase3() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B1 = driver.findElement(By.id("khung1"));
        assertEquals("rgba(0, 0, 0, 1)",B1.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase4() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B1 = driver.findElement(By.id("khung1"));
        assertEquals("40px",B1.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase5() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B1 = driver.findElement(By.id("khung1"));
        assertEquals("rgba(224, 220, 220, 1)",B1.getCssValue("background-color"));
        driver.quit();

    }

    @Test // so sánh link
    public void testCase6(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");
        String testlink="https://mlearning.hoasen.edu.vn/";
        WebElement B2 = driver.findElement(By.id("khung1"));
        B2.click();
        assertEquals(testlink,driver.getCurrentUrl());
        driver.quit();
    }
    @Test //button 2
    void testcase7() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B2 = driver.findElement(By.id("khung2"));
        B2.click();
        driver.quit();

    }
    @Test
    void testcase8() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B2 = driver.findElement(By.id("khung2"));
        assertEquals("YouTuBe!",B2.getText());
        driver.quit();

    }
    @Test
    void testcase9() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B2 = driver.findElement(By.id("khung2"));
        assertEquals("rgba(255, 255, 255, 1)",B2.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase10() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B2 = driver.findElement(By.id("khung2"));
        assertEquals("40px",B2.getCssValue("font-size"));
        driver.quit();

    }
    @Test
    void testcase11() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B2 = driver.findElement(By.id("khung2"));
        assertEquals("rgba(224, 220, 220, 1)",B2.getCssValue("background-color"));
        driver.quit();

    }
    @Test // so sánh link
    public void testCase12(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");
        String testlink="https://www.youtube.com/";
        WebElement B2 = driver.findElement(By.id("khung2"));
        B2.click();
        assertEquals(testlink,driver.getCurrentUrl());
        driver.quit();
    }
    @Test //button 1
    void testcase13() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B3 = driver.findElement(By.id("khung1"));
        B3.click();
        driver.quit();

    }
    @Test
    void testcase14() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B3 = driver.findElement(By.id("khung1"));
        assertEquals("Mlearning!",B3.getText());
        driver.quit();

    }
    @Test
    void testcase15() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B3 = driver.findElement(By.id("khung1"));
        assertEquals("rgba(0, 0, 0, 1)",B3.getCssValue("color"));
        driver.quit();

    }
    @Test
    void testcase16() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B3 = driver.findElement(By.id("khung3"));
        assertEquals("40px", B3.getCssValue("font-size"));
        driver.quit();
    }
    @Test
    void testcase17() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");

        WebElement B3 = driver.findElement(By.id("khung3"));
        assertEquals("rgba(255, 255, 255, 1)",B3.getCssValue("background-color"));
        driver.quit();

    }
    @Test // so sánh link
    public void testCase18(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://shibameomeo.github.io/mouseclick/index.html");
        String testlink="https://baomoi.com/";
        WebElement B3 = driver.findElement(By.id("khung3"));
        B3.click();
        assertEquals(testlink,driver.getCurrentUrl());
        driver.quit();
    }

}
