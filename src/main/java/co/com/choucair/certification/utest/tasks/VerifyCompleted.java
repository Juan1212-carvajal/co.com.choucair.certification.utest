package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyCompleted implements Question <Boolean> {
    private String question;

    public VerifyCompleted(String question) {
        this.question = question;
    }

    public static VerifyCompleted toThe(String question) {
        return new VerifyCompleted(question);
    }

    public static final Target COMPLETE_PAGE_REGISTRATION= Target.the("where do we write the password").
            located(By.xpath("//div[@class='image-box-header']//h1"));
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textSuccessful = Text.of(COMPLETE_PAGE_REGISTRATION).viewedBy(actor).asString();
        if (question.equals(textSuccessful)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
