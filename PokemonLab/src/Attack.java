
public class Attack {
	private String attackName;
	private String attackDescription;
	private String type; 
	private int powerPoints;
	private int baseDamage;
	
	public Attack(String attackName, String attackDescription, int powerPoints, String type, int baseDamage) {
		this.setAttackName(attackName);
		this.setAttackDescription(attackDescription);
		this.setPowerPoints(powerPoints);
		this.setType(type);
		this.setBaseDamage(baseDamage);
	}

	public String getAttackDescription() {
		return attackDescription;
	}

	public void setAttackDescription(String attackDescription) {
		this.attackDescription = attackDescription;
	}

	public int getPowerPoints() {
		return powerPoints;
	}

	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}
	
}