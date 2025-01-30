package designPuzzle;

import designPuzzle.interfaces.WeaponBehavior;

public class Character {
    private WeaponBehavior weapon;

    public Character(){
    }

    public void fight(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }

}
