import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchBox {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait                wait;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 4 API 29");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("app", "C:\\Users\\aleks\\Desktop\\com_joom_3_87_0.apk");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void basicTest() {
        //Ожидание загрузки
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Закрываем первую всплывающую рекламу
        driver.findElement(new By.ByXPath("//android.widget.ImageView[@content-desc=\"Close\"]")).click();
        //Закрываем вторую возможную рекламу (?)
        //driver.findElement(new By.ByXPath("//android.widget.ImageView[@content-desc=\"Close\"]")).click();
        //Закрываем предложение на стартовом экране
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup")).click();
        //клик на поиск
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
        //повторный клик на поиск
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
        //ввод текста
        MobileElement searchBox = (MobileElement) driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"));
        searchBox.sendKeys("Платья");
        //выбор раздела "платья"
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]")).click();
        //клик на сортировку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")).click();
        //выбор по возрастающей цене
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")).click();




    }

}