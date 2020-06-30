package TestNG_Practice;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGDemo_P6 {

@Test (priority =1)	
void OpenURL ()

{
	System.out.println("Open the URL of the selective one");
    Assert.assertTrue(true); 
}

@Test (priority =2)
void Login()
{
	System.out.println("Log in to the System");
	Assert.assertFalse(false);
}

@Test (priority =3)
void Search()
{
	System.out.println("Search");
	Assert.assertTrue(true);
}

@Test (priority = 4)
void AdvSearch()
{
	System.out.println("Advanced Search");
	Assert.assertTrue(true);
}

@Test (priority =5)
void Logout()

{
	System.out.println("Log out from the System");
	Assert.assertFalse(false);
}

	
}
