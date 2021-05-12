package co.com.choucair.retotecnicoauto.stepdefinitions;

import co.com.choucair.retotecnicoauto.model.RegistrationModel;
import co.com.choucair.retotecnicoauto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoAutoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than Nany wants to register in uTest")
    public void ThanNanyWantsToRegisterInUTest() {

        OnStage.theActor("Nany").wasAbleTo(OpenUp.thePage());
    }

    @When("^she search for the Join Today button on the uTest page and fill in all the requested fields")
    public void sheSearchForTheJoinTodayButtonOnTheUTestPageAndFillInAllTheRequestedFields() {
        OnStage.theActor("Nany").attemptsTo(ClickJoinToday.theButton());


    }

    @Then("she manager to register")
    public void sheManagerToRegister(List<RegistrationModel> registrationModelList) throws Exception {
        OnStage.theActor("Nany").wasAbleTo(FillOutForm.theForm(registrationModelList.get(0)));
    }

    @Then("she manager to register two step")
    public void sheManagerToRegisterTwoStep (List<RegistrationModel> registrationModelsList) throws Exception {
        OnStage.theActor("Nany").attemptsTo(StepTwoAddYourAddress.theFormTwo(registrationModelsList.get(0)));
        OnStage.theActor("Nany").attemptsTo(StepThreeTellUsAboutYourDevices.theFormThree());
        OnStage.theActor("Nany").attemptsTo(StepFourTheLastStep.theFormFour());
    }

}
