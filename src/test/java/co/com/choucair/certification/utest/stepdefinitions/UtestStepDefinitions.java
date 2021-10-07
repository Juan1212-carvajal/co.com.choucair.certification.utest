package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.tasks.*;
import co.com.choucair.certification.utest.tasks.VerifyCompleted;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^click register$")
    public void JuanSeeksToRegisterOnTheUtestWebSite() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (TopPage.ThePage()));
    }

    @When("^record of each steps$")
    public void HeCompletesEachStepOfTheUserRegistration(List<UtestData> utestData) {
        OnStage.theActorCalled("Juan").wasAbleTo(StepFirts.OnThePage(utestData.get(0).getStrFirstName(), utestData.get(0).getStrLastName(),utestData.get(0).getStrEmail()));
        OnStage.theActorCalled("Juan").wasAbleTo((StepSecond.OnThePage()));
        OnStage.theActorCalled("Juan").wasAbleTo((StepThird.OnThePage()));
        OnStage.theActorCalled("Juan").wasAbleTo((StepFourth.OnThePage(utestData.get(0).getStrPassword(),utestData.get(0).getStrPasswordConfirmed())));
    }

    @Then("^verify that the user registration is correct$")
    public void VerifyThatThRegistrationHasBeenCorrectly(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCompleted.toThe((question))));
    }
}
