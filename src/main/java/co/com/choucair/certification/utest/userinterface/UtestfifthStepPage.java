package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestfifthStepPage {
    public static final Target COMPLETE_PAGE_REGISTRATION = Target.the("where do we write the password").
            located(By.xpath("//div[@class='image-box-header']//h1"));
}
