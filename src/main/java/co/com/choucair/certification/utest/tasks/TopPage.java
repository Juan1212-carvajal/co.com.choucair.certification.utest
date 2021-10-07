package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestFirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TopPage implements Task {

    public static TopPage ThePage() {
        return Tasks.instrumented(TopPage.class);
    }

    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to register as a user\n").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_TODAY_BUTTON));
    }
}