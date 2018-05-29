package lifeform;
import static org.junit.Assert.*;


import org.junit.Test;

/**
* Author: Chandana Gogineni 
* Tests the functionality provided by the LifeForm class
*
*/

public class TestLifeForm {
	/**
	* When a LifeForm is created, it should know its name and how
	* many life points it has.
	*/
	
	@Test
	public void testInitialization() {
		LifeForm entity;
		entity = new MockLifeForm("Bob", 40);
		assertEquals("Bob", entity.getName());
		assertEquals(40, entity.getCurrentLifePoints());	
		
	}

	public static void main(String[] argc)
	{
		TestLifeForm tlf = new TestLifeForm();
		tlf.testInitialization();
	}
}
