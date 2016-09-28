package magic.CardTypes.Lands;

import magic.Mana.ManaCost;
import magic.Player.Player;

public class AbstractPlains extends AbstractLand implements Plains {
    public AbstractPlains(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
