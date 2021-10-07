package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFourthPage {

    public static final Target INPUT_PASSWORD = Target.the("where do we write the user").
            located(By.xpath("//input[@id='password']"));

    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("where do we write the password").
            located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the password").
            located(By.xpath("//input[@id='email']"));

    public static final Target CHECK_TERMS_USE = Target.the("where do we write the password").
            located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));

    public static final Target CHECK_PRIVATE_SECURITY = Target.the("where do we write the password").
            located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));

    public static final Target COMPLETE_PAGE_BUTTON = Target.the("where do we write the password").
            located(By.xpath("//a[@class='btn btn-blue']"));


}
