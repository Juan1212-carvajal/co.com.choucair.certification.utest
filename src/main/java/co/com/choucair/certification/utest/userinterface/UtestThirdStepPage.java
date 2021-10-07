package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestThirdStepPage {

    public static final Target NEXT_BUTTON = Target.the("button that shows us the form to register as a user").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
