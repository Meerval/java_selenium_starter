package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.Main;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
        public ChromeDriver driver;
        public Main main;

        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();    // 1. Open the browser
            driver.manage().window().maximize();    // 1. Maximize the window
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            main = PageFactory.initElements(driver, Main.class);
        }

        @After
        public void close() {
            driver.quit();
        }
}
