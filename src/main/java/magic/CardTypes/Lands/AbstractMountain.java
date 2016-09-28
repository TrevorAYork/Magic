package magic.CardTypes.Lands;

import magic.Mana.ManaCost;
import magic.Player.Player;

public class AbstractMountain extends AbstractLand implements Mountain {
    public AbstractMountain(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
