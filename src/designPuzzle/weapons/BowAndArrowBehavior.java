package designPuzzle.weapons;

import designPuzzle.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow");
    }
}
