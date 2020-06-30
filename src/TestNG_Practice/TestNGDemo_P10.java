package TestNG_Practice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo_P10 {

	
@Test (priority =1)	
void openurl()

{
   System.out.println("Open URL");	
   Assert.assertTrue(true);
}

@Test (priority =2, dependsOnMethods = {"openurl"})	
void login()

{
   System.out.println("Login in to the System");	
   Assert.assertTrue(true);
}
	
@Test (priority =3, enabled = false)	
void advSearch()

{
   System.out.println("Advanced Search in progress");	
   
}
	
@Test (priority =4, enabled = false)	
void priorsearch()

{
   System.out.println("Prior Search in progress");	
   
}

@Test (priority=5)	
void logout()

{
   System.out.println("Log out from the System");	
   Assert.assertFalse(false);
}

	
	
}
