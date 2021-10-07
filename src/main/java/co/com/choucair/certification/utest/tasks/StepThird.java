package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThird implements Task {

    public static StepThird OnThePage() {
        return Tasks.instrumented(StepThird.class);
    }

    public static final Target NEXT_BUTTON = Target.the("button that shows us the form to register as a user").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                actor.attemptsTo(Click.on(NEXT_BUTTON));
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
