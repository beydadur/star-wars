package starWar;

public abstract class ForceWielder {
	
	protected String nameForceWielder;
	protected int battlesCount;
	protected double wielderHealth;
	protected double damageAmount;
	
	public ForceWielder(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount) {
		this.nameForceWielder = nameForceWielder;
		this.battlesCount = battlesCount;
		this.wielderHealth = wielderHealth;
		this.damageAmount = damageAmount;
	}

	public String getNameForceWielder() {
		return nameForceWielder;
	}

	public void setNameForceWielder(String nameForceWielder) {
		this.nameForceWielder = nameForceWielder;
	}

	public int getBattlesCount() {
		return battlesCount;
	}

	public void setBattlesCount(int battlesCount) {
		this.battlesCount = battlesCount;
	}

	public double getWielderHealth() {
		return wielderHealth;
	}

	public void setWielderHealth(double wielderHealth) {
		this.wielderHealth = wielderHealth;
	}

	public double getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(double damageAmount) {
		this.damageAmount = damageAmount;
	}
	
	abstract void totalCredits();
	
	public String toString() {
		return "Name: " + nameForceWielder + "\n   Number of battles engaged: " + battlesCount 
				+ "\n   Health: " + wielderHealth + "\n   Damage of Lightsaber: " + damageAmount + "\n";
	}

}
