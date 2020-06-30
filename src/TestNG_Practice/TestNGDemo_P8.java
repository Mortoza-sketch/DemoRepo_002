package TestNG_Practice;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGDemo_P8 {
	
@Test (priority =1)	
void openurl()

{
  System.out.println("Open URL");	
  Assert.assertTrue(true);
}

@Test (priority =2, dependsOnMethods= {"openurl"})	
void login ()

{
	System.out.println("Log in to the System");
	Assert.assertTrue(true);
}
	
@Test (priority=3, dependsOnMethods = {"login"})	
void search()
{
	System.out.println("Search an item");
	Assert.assertFalse(false);
}


@Test (priority =4, dependsOnMethods = {"search"})
void advsearch()
{
	System.out.println("Advanced Search an item");
}
}