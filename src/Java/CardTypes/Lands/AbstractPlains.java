package Java.CardTypes.Lands;

import Java.Mana.ManaCost;
import Java.Player.Player;

public class AbstractPlains extends AbstractLand implements Plains {
    public AbstractPlains(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
