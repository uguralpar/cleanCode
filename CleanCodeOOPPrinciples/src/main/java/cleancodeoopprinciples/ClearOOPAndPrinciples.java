package cleancodeoopprinciples;

import enums.WeaponType;

public class ClearOOPAndPrinciples {

    public static void main(String[] args) {

        CraftsmanHuman craftsmanHuman = new CraftsmanHuman("Craftsman");
        Weapon weapon = craftsmanHuman.craftWeapon(WeaponType.RIFFLE);
        WarriorHuman warriorHuman = new WarriorHuman("Warrior", weapon);

        warriorHuman.useWeapon();
    }
}
