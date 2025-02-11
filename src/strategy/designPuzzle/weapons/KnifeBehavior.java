package strategy.designPuzzle.weapons;

import strategy.designPuzzle.interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("cutting with a knife");
    }
}
