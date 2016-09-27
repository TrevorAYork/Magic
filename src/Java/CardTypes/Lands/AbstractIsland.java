package Java.CardTypes.Lands;

import Java.Mana.ManaCost;
import Java.Player.Player;

public class AbstractIsland extends AbstractLand implements Island {
    public AbstractIsland(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
