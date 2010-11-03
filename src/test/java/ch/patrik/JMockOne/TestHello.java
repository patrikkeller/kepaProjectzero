package ch.patrik.JMockOne;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class TestHello {
    //create the context for the mock object
    Mockery context = new JUnit4Mockery();
	
 @Test
 public void testSayHello(){
	 // aus dem MockObjekt Formen wir jetzt ein IGreetingTime Objekt
	 final IGreetingTime gt= context.mock(IGreetingTime.class);
	 
	 Hello o = new Hello();
	 o.setGreetingTime(gt); // und übergeben der Hello Klasse ein leeres
	 // Greeting Time Objekt
	 
	 // context, unser Mock Objekt welches jetzt von IGreetingTime abgeleitet ist
	 // kann nun die gewünschten Eigenschaften annehmen, ohne
	 // dass wir die Klasse konkret haben!
	 context.checking(new Expectations(){{
		 one(gt).getGreeting();
		 will(returnValue("Good afternoon"));
	 }});
	 String out = o.sayHello("Peter");
	 assertEquals("Good afternoon, Peter", out);
	 //	 
	 context.checking(new Expectations(){{
		 one(gt).getGreeting();
		 will(returnValue("Good morning"));
	 }});
	 out= o.sayHello("Paul");
	 assertEquals("Good morning, Paul", out);
	 
	 
 }
}
