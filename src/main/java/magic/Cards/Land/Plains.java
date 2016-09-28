package magic.Cards.Land;

import magic.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddWhite;
import magic.CardTypes.Lands.AbstractPlains;
import magic.Player.Player;

public class Plains extends AbstractPlains {
    public Plains(Player owner) {
        super("Plains", null, owner, owner);
        this.addAbility(new TapToAddWhite(this));
    }
}
