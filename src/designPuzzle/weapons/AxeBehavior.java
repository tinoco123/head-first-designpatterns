package designPuzzle.weapons;

import designPuzzle.interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("chopping with an axe");
    }
}
