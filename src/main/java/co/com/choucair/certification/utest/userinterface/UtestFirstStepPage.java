package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFirstStepPage extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the user").
            located(By.xpath("//input[@id='firstName']"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the password").
            located(By.xpath("//input[@id='lastName']"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the password").
            located(By.xpath("//input[@id='email']"));

    public static final Target OPTION_MONTH_BIRTH = Target.the("where do we write the password").
            located(By.xpath("//option[@label='April']"));

    public static final Target OPTION_DAY_BIRTH = Target.the("where do we write the password").
            located(By.xpath("//option[@label='21']"));

    public static final Target OPTION_YEAR_BIRTH = Target.the("where do we write the password").
            located(By.xpath("//option[@label='1999']"));

    public static final Target NEXT_PAGE_BUTTON = Target.the("where do we write the password").
            located(By.xpath("//a[@class='btn btn-blue']"));

}
