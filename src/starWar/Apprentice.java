package starWar;

public class Apprentice extends Sith {
	
	private Master master;
	protected final String forceAbilityName;
	
	public Apprentice(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount,
			int totalCreditSith, Master master) {
		super(nameForceWielder, battlesCount, wielderHealth, damageAmount, totalCreditSith);
		this.forceAbilityName = "Force Choke";
		this.master = master;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}
	
	public String toString() {
		return "Apprentice " + super.toString();
	}
	
	public void chokeJedi (Jedi j) {
		if (j.getWielderHealth() != 0) {
			j.wielderHealth *= 0.5;
			j.wielderHealth -= damageAmount;
		}
	}
	
	public void betrayMaster() {
		if (master.getWielderHealth() < master.getFirstHealth()*0.1) {
			master.setWielderHealth(0);
			wielderHealth = 100;
		}
	}
}
