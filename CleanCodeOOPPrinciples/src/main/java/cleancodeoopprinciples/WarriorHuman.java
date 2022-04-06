package cleancodeoopprinciples;

import interfaces.WarriorInt;

public class WarriorHuman extends Human implements WarriorInt{

    public WarriorHuman(String humanName, Weapon weapon) {
        super(humanName, weapon);
    }

    @Override
    public void useWeapon() {
    	/* weapontype belli oldugu için tekrar kontrole gerek yok 
    	 * ve tüm iflerde aynı implementasyon var bu yüzden kaldırıldı */
//        WeaponType type = getWeapon().getType();
//        if (type == WeaponType.KNIFE) {
            System.out.println(getWeapon().getWeaponName() + " is used by " + humanName);
//        } else if (type == WeaponType.RIFFLE) {
//            System.out.println(getWeapon().getWeaponName() + " is used by " + humanName);
//        } else if (type == WeaponType.SWORD) {
//            System.out.println(getWeapon().getWeaponName() + "is used by " + humanName);
//        } else {
//            System.out.println("Unknown weapon!");
//        }
    }
}
