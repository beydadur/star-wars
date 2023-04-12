package starWar;

public class Master extends Sith implements HealthBoostable{
	
	private Apprentice apprentice;
	protected final String forceAbilityName;
	private final double firstHealth;
	
	public Master(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount,
			int totalCreditSith, Apprentice apprentice) {
		super(nameForceWielder, battlesCount, wielderHealth, damageAmount, totalCreditSith);
		this.forceAbilityName = "Force Lightning";
		this.firstHealth = wielderHealth;
		this.apprentice = apprentice;
	}

	public Apprentice getApprentice() {
		return apprentice;
	}

	public double getFirstHealth() {
		return firstHealth;
	}

	public void setApprentice(Apprentice apprentice) {
		this.apprentice = apprentice;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}
	
	public String toString() {
		return "Master " + super.toString();
	}
	
	public void shockJedi(Jedi j) {
		if (j.getWielderHealth() != 0) {
			j.wielderHealth *= 0.8;
			j.wielderHealth -= damageAmount*0.5;
		}
	}

	@Override
	public void boostHealth() {
		this.setWielderHealth(this.getWielderHealth()*2);
	}
}
