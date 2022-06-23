package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Calculator {
	
	int a,b,result;
	
	@Given("User reads {int} and {int} values")
	public void user_reads_a_and_b_values(int num1, int num2) {
	  a = num1;
	  b = num2;
	}
	
	@When("User calculates sum of a,b")
	public void user_calculates_sum_of_a_b() {
	 result = a+b;   
	}
	
	@When("User calculates mul of a,b")
	public void user_calculates_mul_of_a_b() {
	 result = a*b;   
	}
	
	@Then("Display the Results")
	public void display_the_results() {
	 System.out.println("The Result is : " + result);
	}
	
	@And("Validate the Results {int}")
	public void Validate_the_Results(int expResult) {
	  Assert.assertEquals(result, expResult);
	}


}
