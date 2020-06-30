package TestNG_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNGDemo_P3 {

@BeforeMethod	
void Login ()

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
	System.out.println("General Search");
}

@Test (priority = 1)
void AdvancedSeacrch()

{
	System.out.println("Advanced Search");
}

@Test (priority = 2)
void SearchToys()

{
	System.out.println("Search Toys");
}
	
}
