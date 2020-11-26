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
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            main = PageFactory.initElements(driver, Main.class);
        }

        @After
        public void close() {
            driver.quit();
        }
}
