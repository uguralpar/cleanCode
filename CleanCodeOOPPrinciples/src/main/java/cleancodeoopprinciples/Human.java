package cleancodeoopprinciples;

public abstract class Human {

    public String humanName;
    public Weapon weapon;

    public Human(String humanName, Weapon weapon) {
        this.humanName = humanName;
        this.weapon = weapon;
    }

    public String getHumanName() {
        return humanName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
