package strategy.designPuzzle;

import strategy.designPuzzle.characters.King;
import strategy.designPuzzle.characters.Queen;
import strategy.designPuzzle.weapons.AxeBehavior;
import strategy.designPuzzle.weapons.BowAndArrowBehavior;
import strategy.designPuzzle.weapons.KnifeBehavior;
import strategy.designPuzzle.weapons.SwordBehavior;

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
