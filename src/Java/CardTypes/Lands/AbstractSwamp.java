package Java.CardTypes.Lands;

import Java.Mana.ManaCost;
import Java.Player.Player;

public class AbstractSwamp extends AbstractLand implements Swamp {
    public AbstractSwamp(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
