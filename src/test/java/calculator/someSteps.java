package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class someSteps {

    Calculator calculator = new Calculator();



    @Then("print {int}")
    public void print(Integer int1) throws Exception {
        assertEquals((int)int1,calculator.print());
    }


    @Given("the input is {int}")
    public void the_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }


    @Given("the first input is {int}")
    public void the_first_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }
    @Given("the second input is {int}")
    public void the_second_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }


    @Given("the third input is {int}")
    public void the_third_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }
    @Given("the fourth input is {int}")
    public void the_fourth_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }
    @Given("the fifth input is {int}")
    public void the_fifth_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }
    @Given("the sixth input is {int}")
    public void the_sixth_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }
    @Given("the seventh input is {int}")
    public void the_seventh_input_is(Integer int1) {
        calculator.input(String.valueOf(int1));
    }

    @Given("the input is {string}")
    public void the_input_is(String string) {
        calculator.input(string);
    }

    @Then("throw an error")
    public void throw_an_error() throws Exception {
        assertThrows(Exception.class, () -> calculator.print());
    }



}
