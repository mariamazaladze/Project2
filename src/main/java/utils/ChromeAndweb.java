package utils;

import com.codeborne.selenide.Configuration;
//import com.sun.deploy.cache.BaseLocalApplicationProperties;

import static com.codeborne.selenide.Selenide.open;


public class ChromeAndweb {

    public void openChromeWithLink() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mazaladze\\Desktop\\chromedriver\\91\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.baseUrl = "http://tutorialsninja.com";
        open("/demo/");

    }
}
