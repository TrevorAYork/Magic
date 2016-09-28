package magic.CardTypes.Lands;

import magic.Mana.ManaCost;
import magic.Player.Player;

public class AbstractIsland extends AbstractLand implements Island {
    public AbstractIsland(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
