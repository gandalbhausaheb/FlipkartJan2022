package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.One;

public class Login 
{
	@Given("^User open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_open_browser_with_exe(String bname, String exe) throws Throwable 
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		One.browserLaunch(input);
	}

	@Given("^User open url as \"([^\"]*)\"$")
	public void user_open_url_as(String url) throws Throwable 
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		One.OpenApplication(input1);
	}

	@When("^User click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable 
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String, Object> output2=One.clickonElement(input2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^User click on cancel button$", output2.get("MESSAGE").toString());
	}

	@When("^User move on Login DropDown$")
	public void user_move_on_Login_DropDown() throws Throwable 
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String, Object> output3=One.moveonElement(input3);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^User move on Login DropDown$", output3.get("MESSAGE").toString());
	}

	@When("^User click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable 
	{
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String, Object> output4=One.clickonElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^User click on My Profile$", output4.get("MESSAGE").toString());
		Thread.sleep(5000);
	   
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String uname) throws Throwable 
	{
		Object[] input5=new Object[2];
		input5[0]="(//*[@autocomplete='off'])[2]";
		input5[1]=uname;
		Hashtable<String, Object> output5=One.LoginId(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^User enter \"([^\"]*)\" as Username$", output5.get("MESSAGE").toString());
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pass) throws Throwable 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=pass;
		Hashtable<String, Object> output6=One.LoginId(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^User enter \"([^\"]*)\" as Password$", output6.get("MESSAGE").toString());
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object[] input7=new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String, Object> output7=One.clickonElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^User click on Login button$", output7.get("MESSAGE").toString());
		Thread.sleep(2000);
	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable 
	{
		Object[] input8=new Object[2];
		input8[0]="//*[@class='_14mvAI']";
		input8[1]="Hello";
		Hashtable<String, Object> output8=One.gettext(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$", output8.get("MESSAGE").toString());
	}

}
