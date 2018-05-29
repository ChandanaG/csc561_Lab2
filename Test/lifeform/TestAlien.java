package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import recovery.RecoveryLinear;
/**
 * Tests for Alien class
 * @author chandana gogineni
 *
 */
public class TestAlien {

	@Test
	public void testInitialization() {
		Alien alien;
		alien = new Alien("Bob", 40);
		assertEquals("Bob", alien.getName());
		assertEquals(40, alien.getCurrentLifePoints());	
		
	}
	

}
