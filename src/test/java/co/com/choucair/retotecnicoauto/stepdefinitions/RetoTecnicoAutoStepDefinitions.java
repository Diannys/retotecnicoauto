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

        OnStage.theActor("Nany").wasAbleTo(OpenUpPage.thePage());
    }

    @When("^she search for the Join Today button on the uTest page and fill in all the requested fields")
    public void sheSearchForTheJoinTodayButtonOnTheUTestPageAndFillInAllTheRequestedFields() {
        OnStage.theActor("Nany").attemptsTo(ClickJoinTodayButton.theButton());


    }

    @Then("she manager to register")
    public void sheManagerToRegister(List<RegistrationModel> registrationModelList) throws Exception {
        RegistrationModel registrationModel = registrationModelList.get(0);
        
        OnStage.theActor("Nany").wasAbleTo(StepOneTellUsAboutYouself.theForm(registrationModel));
        OnStage.theActor("Nany").attemptsTo(StepTwoAddYourAddress.theFormTwo(registrationModel));
        OnStage.theActor("Nany").attemptsTo(StepThreeTellUsAboutYourDevices.theFormThree(registrationModel));
        OnStage.theActor("Nany").attemptsTo(StepFourTheLastStep.theFormFour(registrationModel));
    }

}
