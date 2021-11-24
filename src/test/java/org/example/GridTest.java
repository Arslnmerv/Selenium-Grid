package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    public static void main(String[] args) throws MalformedURLException {

        //1) Create  Desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();

        //We can desribe into the Desired Capabilities 3 things
        //**browser
        cap.setBrowserName("chrome");

        //**i(OS) sletim sistemi
        cap.setPlatform(Platform.ANY);

        //**browser version
        cap.setVersion("96.0.4664.45 ");

        ChromeOptions options = new ChromeOptions();
        String hubUrl = " http://192.168.0.16:4444/wd/hub ";

        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());


    }

}
