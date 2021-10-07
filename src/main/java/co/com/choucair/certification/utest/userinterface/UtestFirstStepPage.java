package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFirstStepPage extends PageObject {

    public static final Target JOIN_TODAY_BUTTON = Target.the("Button that is not registered as a user").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target INPUT_FIRST_NAME = Target.the("Name field").
            located(By.xpath("//input[@id='firstName']"));

    public static final Target INPUT_LAST_NAME = Target.the("field password").
            located(By.xpath("//input[@id='lastName']"));

    public static final Target INPUT_EMAIL = Target.the("field password").
            located(By.xpath("//input[@id='email']"));

    public static final Target OPTION_MONTH_BIRTH = Target.the("Date Month").
            located(By.xpath("//option[@label='April']"));

    public static final Target OPTION_DAY_BIRTH = Target.the("Date Day").
            located(By.xpath("//option[@label='21']"));

    public static final Target OPTION_YEAR_BIRTH = Target.the("Date year").
            located(By.xpath("//option[@label='1999']"));

    public static final Target NEXT_PAGE_BUTTON = Target.the("Next Button").
            located(By.xpath("//a[@class='btn btn-blue']"));

}
