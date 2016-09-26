package Java.CardTypes.Creatures;

import Java.CardTypes.Lands.Land;
import Java.Mana.ManaCost;
import Java.Player.Player;

public abstract class AbstractCreatureLand extends AbstractCreature implements Land {

    public AbstractCreatureLand(String name, ManaCost manaCost, int power, int toughness, Player owner, Player controller) {
        super(name, manaCost, power, toughness, owner, controller);
    }
}
