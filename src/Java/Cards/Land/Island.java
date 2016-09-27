package Java.Cards.Land;

import Java.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddBlue;
import Java.CardTypes.Lands.AbstractIsland;
import Java.Player.Player;

public class Island extends AbstractIsland {
    public Island(Player owner) {
        super("Island", null, owner, owner);
        this.addAbility(new TapToAddBlue(this));
    }
}
