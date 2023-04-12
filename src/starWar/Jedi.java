package starWar;

public class Jedi extends ForceWielder implements Healable, HealthBoostable{

	private String jediColor;
	protected int totalCreditJedi;
	protected double forceHealAmount = 2*damageAmount;
	
	public Jedi(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount,
			String jediColor, int totalCreditJedi) {
		super(nameForceWielder, battlesCount, wielderHealth, damageAmount);
		this.jediColor = jediColor;
		this.totalCreditJedi = totalCreditJedi;
	}

	public String getJediColor() {
		return jediColor;
	}

	public void setJediColor(String jediColor) {
		this.jediColor = jediColor;
	}

	public int getTotalCreditJedi() {
		return totalCreditJedi;
	}

	public void setTotalCreditJedi(int totalCreditJedi) {
		this.totalCreditJedi = totalCreditJedi;
	}

	public double getForceHealAmount() {
		return forceHealAmount;
	}

	public void setForceHealAmount(double forceHealAmount) {
		this.forceHealAmount = forceHealAmount;
	}
	
	public String toString() {
		return "Jedi " + super.toString();
	}

	@Override
	void totalCredits() {
		totalCreditJedi = 310 + battlesCount*15;
	}
	
	public void saberFight(Sith s) {
		battlesCount += 1;
		
		if (s.getWielderHealth() > 0) {
			System.out.println("The Jedi " + nameForceWielder + " produced a damage worth of " 
		+ damageAmount + " against the Sith " + s.getNameForceWielder() + "\n"); 
			s.wielderHealth -= damageAmount;
			damageAmount += 10;
			s.damageAmount -= 10;
		}
		
		else if (this.wielderHealth <= 0) {
			System.out.println("The Jedi " + nameForceWielder + " has been defeated by the Sith " + s.getNameForceWielder()+ "\n");
		}
		
		else {			
			System.out.println("The Jedi " + nameForceWielder + " defeated the Sith " + s.getNameForceWielder()+ "\n");
		}
		
	}
	
	public void revealLightsaber() {
		
		if (jediColor == "blue") {
			System.out.println("Color generated from the lightsaber is blue.");
		}
		
		else if (jediColor == "green") {
			System.out.println("Color generated from the lightsaber is green.");
		}
		
		else if (jediColor == "purple") {
			System.out.println("Color generated from the lightsaber is purple.");
		}
		
		else {
			System.out.println("An Unknown color has been generated from the lightsaber.");
		}
		
	}

	@Override
	public void heal() {
		wielderHealth += 150;
	}
	
	@Override
	public void boostHealth() {
		this.setWielderHealth(this.getWielderHealth()*5);
	}

}
