package starWar;

public class Padawan extends Jedi {
	
	private Knight knight;
	protected final String forceAbilityName;

	public Padawan(String nameForceWielder, int battlesCount, double wielderHealth, double damageAmount,
			String jediColor, int totalCreditJedi, Knight knight) {
		super(nameForceWielder, battlesCount, wielderHealth, damageAmount, jediColor, totalCreditJedi);
		this.forceAbilityName = "Jedi Mind Trick";
		this.knight = knight;

	}

	public Knight getKnight() {
		return knight;
	}

	public void setKnight(Knight knight) {
		this.knight = knight;
	}
	
	public String toString() {
		return "Padawan " + super.toString();
	}
	
	public void confuseSith(Sith s) {
		if (s.getWielderHealth() != 0) {
			s.damageAmount *=0.8;
		}
	}
	
	public void healKnight() {
		if (knight.getWielderHealth() != 0) {
			wielderHealth += forceHealAmount;
		}
		System.out.println(wielderHealth);
	}
	
	public void boostHealth() {
		super.boostHealth();
	}

}
