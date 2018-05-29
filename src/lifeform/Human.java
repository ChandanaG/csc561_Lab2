package lifeform;

public class Human extends LifeForm{
	int armorPoints;
	
	public Human(String name, int life, int armor) {
		
		super(name, life);
		armor = armorPoints;
		
	}
	
	public int getArmorPoints() {
		/**
		* @return the name of the life form.
		*/
		return armorPoints;
	}
	
	public void setArmorPoints(int points) {
		/**
		* @return the amount of current life points the life form has.
		*/
		if(points < 0 ) 
			armorPoints = 0;
		armorPoints = points;
		
	}

}
