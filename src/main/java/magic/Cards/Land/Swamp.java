package magic.Cards.Land;

import magic.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddBlack;
import magic.CardTypes.Lands.AbstractSwamp;
import magic.Player.Player;

public class Swamp extends AbstractSwamp {
    public Swamp(Player owner) {
        super("Swamp", null, owner, owner);
        this.addAbility(new TapToAddBlack(this));
    }
}
