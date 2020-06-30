package TestNG_Practice;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGDemo_P11 {
	
@Test (priority =1)

void openurl()
{
  	
	System.out.println("Open URL");
	Assert.assertTrue(true);
}

@Test (priority =2, dependsOnMethods = {"openurl"})

void login()

{
	System.out.println("Log in to the System");
	Assert.assertFalse(false);
}
	
@Test (priority =3, enabled = false)
void AdvSearch()

{
	System.out.println("Advanced Search is in progress");
}



@Test (priority =4, enabled = false)
void PriorSearch()

{
	System.out.println("Priority Search is in progress");
}

@Test (priority =5)
void logout()

{
	System.out.println("Log out from the System");
	Assert.assertTrue(true);
}

}
