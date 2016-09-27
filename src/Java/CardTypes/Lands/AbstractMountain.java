package Java.CardTypes.Lands;

import Java.Mana.ManaCost;
import Java.Player.Player;

public class AbstractMountain extends AbstractLand implements Mountain {
    public AbstractMountain(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
