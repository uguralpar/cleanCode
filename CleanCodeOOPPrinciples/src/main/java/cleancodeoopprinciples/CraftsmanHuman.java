package cleancodeoopprinciples;

import enums.WeaponType;
import interfaces.CraftInt;

public class CraftsmanHuman extends Human implements CraftInt{

    public CraftsmanHuman(String humanName) {
		super(humanName, null);
	}

	@Override
    public Weapon craftWeapon(WeaponType type) {
		// Weapon sadece bu noktada oluşturuluyor
		Weapon weapon = new Weapon(type.getDescription(), type);
        System.out.println(type.getDescription() + " is created by " +  getHumanName());
        
        return weapon;
    }

}
