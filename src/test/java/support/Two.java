package support;

public class Two 
{
	public static void main(String[]args) throws Throwable
	{
		//BrowserLaunch
		Object[] input=new Object[2];
		input[0]="Chrome";
		input[1]="E:\\Automation support\\chromedriver.exe";
		One.browserLaunch(input);
		
		//openapplication
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		One.OpenApplication(input1);
		
		//Click on Cancel	
				Object[] input2=new Object[1];
				input2[0]="//*[@class='_2KpZ6l _2doB4z']";
				One.clickonElement(input2);
				
				//move on element
				Object[] input3=new Object[1];
				input3[0]="//*[@class='_1_3w1N']";
				One.moveonElement(input3);
				
				//click on profile
				Object[] input4=new Object[1];
				input4[0]="(//*[@class='_3vhnxf'])[1]";
				One.clickonElement(input4);
				Thread.sleep(5000);
				
				//login id
				Object[] input5=new Object[2];
				input5[0]="(//*[@autocomplete='off'])[2]";
				input5[1]="9673129116";
				One.LoginId(input5);			//""
				
				//enter pass
				Object[] input6=new Object[2];
				input6[0]="//*[@type='password']";
				input6[1]="8208504089";
				One.LoginId(input6);
				
				//click on login button
				Object[] input7=new Object[1];
				input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
				One.clickonElement(input7);
				Thread.sleep(2000);
				
				//
				
				Object[] input8=new Object[2];
				input8[0]="//*[@class='_14mvAI']";
				input8[1]="Hello";
				One.gettext(input8);
				
	}

}