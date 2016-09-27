package Java.CardTypes.Lands;

import Java.Mana.ManaCost;
import Java.Player.Player;

public abstract class AbstractForest extends AbstractLand implements Forest {

    public AbstractForest(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
