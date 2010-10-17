import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class JprogFuerJunitTest  {
//	@Test public void simpleAdd() {
//	    Money m12CHF= new Money(12, "CHF"); 
//	    Money m14CHF= new Money(14, "CHF"); 
//	    Money expected= new Money(26, "CHF"); 
//	    Money result= m12CHF.add(m14CHF); 
//	    assertTrue(expected.equals(result));
//	}
	
	String result;
	@Before
    public void setUp() throws Exception  { 
		ProgFuerJunitTest target = new ProgFuerJunitTest();
	}

	
	@Test 
	public void capitalize(){
		String input="abc";
		String expected ="ABC";
		
		result =  new ProgFuerJunitTest().capitalize(input);
		
		assertTrue(expected.equals(result));
		//assertEquals(result,expected);
	}

	@Test
	public void isEmpty(){
		String input="";
		assertTrue(new ProgFuerJunitTest().isEmpty(input));
		input=null;
		assertTrue(new ProgFuerJunitTest().isEmpty(input));
		assertEquals("True, wenn String leer", true, new ProgFuerJunitTest().isEmpty(""));
	}
	
	@Test
	public void join(){
		// hängt alle Strings des Arrays zusammen
		String[] input= {"Hans", " ", "Max", " ", "Peter"};
		assertTrue("Hans Max Peter".equals(new ProgFuerJunitTest().join(input)));
	}
	
	@Test
	public void reverse() {
		// dreht einen Sring um + NullPointerException
		assertTrue("Rückwärts".equals(new ProgFuerJunitTest().reverse("sträwkcüR")));
	}
	
	@Test (expected = NullPointerException.class)
    public void testExceptionReverse() {

		ProgFuerJunitTest w = new ProgFuerJunitTest();

	    w.reverse(null);

	 }
}
