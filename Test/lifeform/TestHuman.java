package lifeform;

import static org.junit.Assert.*;


import org.junit.Test;
/**
 * Tests for Human class
 * @author chandana gogineni
 *
 */
public class TestHuman {

	@Test
	public void testInitialization() {
		LifeForm entity;
		Human human; 
		human = new Human("Bob", 40, -1);
		assertEquals("Bob", human.getName());
		assertEquals(40, human.getCurrentLifePoints());
		assertEquals(0, human.getArmorPoints());
		
	}


}
