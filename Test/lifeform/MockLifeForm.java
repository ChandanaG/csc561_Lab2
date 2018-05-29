package lifeform;
/**
 * Mock class for implementing methods of Life Form class
 * @author chandana
 *
 */
public class MockLifeForm extends LifeForm{
	int temp;
	int currentLifePoints;
	public void takeHit(int damage) {
		temp = damage;
		
	}
	public MockLifeForm(String name, int points) {
		super(name, points);
		
		points = currentLifePoints - temp;
	}

	
}
