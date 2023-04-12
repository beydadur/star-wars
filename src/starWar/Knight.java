package starWar;

public class Knight extends Jedi {
	
	private Padawan padawan;
	protected final String forceAbilityName;
	
	public Knight(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount,
			String jediColor, int totalCreditJedi, Padawan padawan) {
		super(nameForceWielder, battlesCount, wielderHealth, damageAmount, jediColor, totalCreditJedi);
		this.forceAbilityName = "Force Heal";
		this.padawan = padawan;

	}

	public Padawan getPadawan() {
		return padawan;
	}

	public void setPadawan(Padawan padawan) {
		this.padawan = padawan;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}
	
	public String toString() {
		return "Knight " + super.toString();
	}
	
	public void healPadawan() {
		if (padawan.getWielderHealth() != 0) {
			padawan.wielderHealth += forceHealAmount;
		}
	}
	
	public void boostHealth() {
		super.boostHealth();
	}
}
