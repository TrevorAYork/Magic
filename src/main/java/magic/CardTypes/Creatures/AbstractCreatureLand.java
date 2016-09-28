package magic.CardTypes.Creatures;

import magic.CardTypes.Lands.Land;
import magic.Mana.ManaCost;
import magic.Player.Player;

public abstract class AbstractCreatureLand extends AbstractCreature implements Land {

    public AbstractCreatureLand(String name, ManaCost manaCost, int power, int toughness, Player owner, Player controller) {
        super(name, manaCost, power, toughness, owner, controller);
    }
}
