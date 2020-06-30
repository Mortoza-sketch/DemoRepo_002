package TestNG_Practice;
import org.testng.annotations.Test;
public class TestNGDemo_P2 {
	
	
@Test (priority = 2)	
void Convo() 

{
   System.out.println("What's up?");
   
}

@Test (priority = 1)
void Greetings()

{
	System.out.println("Assalamualaikum beautiful people!");
}
	
@Test (priority = 3)
void Cont()

{
	System.out.println("How are you?");
}



}
