package strategy.designPuzzle.weapons;

import strategy.designPuzzle.interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }
}
