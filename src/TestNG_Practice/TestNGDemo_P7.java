package TestNG_Practice;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGDemo_P7 {

	
@Test (priority=1)	
void OpenURL()
{
	System.out.println("Open the URL from the browser");
	Assert.assertFalse(false);
}
	
@Test (priority =2)
void Login()
{
	System.out.println("Log in to the System");
	Assert.assertFalse(true);
}

@Test (priority =3)
void Search()
{
	System.out.println("Search inside the System");
	Assert.assertTrue(true);
}

@Test (priority =4)
void AdvSearch() 
{
	System.out.println("Advanced Search inside the System");
	Assert.assertTrue(false);
	
}
	
@Test (priority =5)
void Logout ()

{
	System.out.println("Log out from the System");
	Assert.assertTrue(true);
}

	
	
	
	
	
}
