package mvnSimpleProj;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {  

	@Test             
	public void testAddition() {
		assertEquals(5, Calculator.addition(2, 3), 1);
	}     
	
	@Test
	public void testSubtraction() {
		assertEquals(2, Calculator.subtraction(5, 3), 1);
	} 
	
	@Test
	public void testMultiplication() {
		assertEquals(15, Calculator.multiplication(5, 3), 1);
	} 
	
	@Test
	public void testDivision() {
		assertEquals(1, Calculator.division(5, 5), 1);
	}
}
