package TestNG_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo_P4 {
	
@BeforeMethod	
void Login()

{
	System.out.println("Log in to the System");
}
	
@AfterMethod
void Logout ()

{
 	System.out.println("Log out from the System");
}

@Test (priority = 3)
void Search()

{
	System.out.println("Search for something");
}

@Test  (priority =2)
void AdvSearch()

{
	System.out.println("Advanced Search for something");
}

@Test (priority = 1)
void SerachSpecific()

{
	System.out.println("Search Specific item");
}







}
