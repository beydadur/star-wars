package starWar;

public class Sith extends ForceWielder implements Healable {
	
	protected final String sithColor;
	protected int totalCreditSith;

	public Sith(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount, int totalCreditSith) {
		super(nameForceWielder, battlesCount, wielderHealth, damageAmount);
		this.totalCreditSith = totalCreditSith;
		this.sithColor = "red";
	}

	public int getTotalCreditSith() {
		return totalCreditSith;
	}

	public void setTotalCreditSith(int totalCreditSith) {
		this.totalCreditSith = totalCreditSith;
	}
	
	public String toString() {
		return super.toString();
	}

	public String getSithColor() {
		return sithColor;
	}

	@Override
	void totalCredits() {
		totalCreditSith = 310 + battlesCount*15;
	}
	
	public void saberFight(Jedi j) {
		battlesCount += 1;
		
		if (j.getWielderHealth() > 0) {
			System.out.printf("The Sith " + nameForceWielder + " produced a damage worth of " 
		+ damageAmount + " against the Jedi " + j.getNameForceWielder()+ "\n"); 
			j.wielderHealth -= damageAmount;
			damageAmount += 10;
			j.damageAmount -= 10;
			
		}
		
		else if (wielderHealth <= 0) {
			System.out.println("The Sith " + nameForceWielder + " has been defeated by the Jedi " + j.getNameForceWielder()+ "\n");

		}
		
		else {
			System.out.println("The Sith " + nameForceWielder + " defeated the Jedi " + j.getNameForceWielder()+ "\n");
		
		}
		
	}

	@Override
	public void heal() {
		this.wielderHealth += 100;
	}
	
}
