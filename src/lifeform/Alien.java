package lifeform;

import recovery.RecoveryBehavior;

public class Alien extends LifeForm {
	RecoveryBehavior rb;
	int maxLifePoints;
    MockLifeForm mocklifeform;
	public Alien(String name, int life) {
		
		super(name, life);	
		mocklifeform = new MockLifeForm("bob", 50);
	}
	
	public Alien(String name, int life, RecoveryBehavior rb) {
		
		super(name, life);	
		
		
		
	}
	public void recover(int value) {
		 
		value += mocklifeform.getCurrentLifePoints() ;
		
		
		
		
	}
	
	public void setCurrentLifePoints(int life) {
		
		maxLifePoints = life;
		
	}

}
