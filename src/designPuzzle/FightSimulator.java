package designPuzzle;

import designPuzzle.characters.King;
import designPuzzle.characters.Queen;
import designPuzzle.weapons.AxeBehavior;
import designPuzzle.weapons.BowAndArrowBehavior;
import designPuzzle.weapons.KnifeBehavior;
import designPuzzle.weapons.SwordBehavior;

public class FightSimulator {
    public static void main(String[] args){
        Queen queen = new Queen();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();

        King king = new King();
        king.setWeapon(new AxeBehavior());
        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();
    }
}
