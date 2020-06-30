package TestNG_Practice;

import org.testng.annotations.Test;

public class TestNGDemo_P1 {

@Test	(priority =2)
void Login ()

{
	System.out.println("Hello World");
}
	
@Test (priority =1)
void logout()

{
	System.out.println("What's up?");
}

@Test (priority =3)
void openURL()	

{
	System.out.println("Assalamualikum people!");
}



	}


