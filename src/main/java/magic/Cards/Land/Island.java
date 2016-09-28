package magic.Cards.Land;

import magic.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddBlue;
import magic.CardTypes.Lands.AbstractIsland;
import magic.Player.Player;

public class Island extends AbstractIsland {
    public Island(Player owner) {
        super("Island", null, owner, owner);
        this.addAbility(new TapToAddBlue(this));
    }
}
