package enums;

public enum WeaponType {
    KNIFE("knife"),
    SWORD ("sword"),
    RIFFLE("riffle"),
    BOMB ("bomb");
	
	private WeaponType(String description) {
		this.description = description;
	}

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
