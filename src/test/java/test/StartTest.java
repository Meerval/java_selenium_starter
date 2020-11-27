package test;

import org.junit.Test;
import java.io.IOException;

public class StartTest extends WebDriverSettings {

    @Test
    public void firstTest() throws IOException {
        // The first 1. step in the WebDriverSettings.java
        main.goTo(); // 2. Go to the page yandex.ru
        main.choseButton("Маркет"); // 3. Chose and click Yandex Market
        main.search("ноутбук xiaomi redmibook");  // 4,5. Search
        main.putTick("Сначала предложения в моём регионе"); // 6. Put the tick
        main.getScreen();   // 7. Make and save screenshot of the page
    }
}
