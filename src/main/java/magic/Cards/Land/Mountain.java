package magic.Cards.Land;

import magic.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddRed;
import magic.CardTypes.Lands.AbstractMountain;
import magic.Player.Player;

public class Mountain extends AbstractMountain {
    public Mountain(Player owner) {
        super("Mountain", null, owner, owner);
        this.addAbility(new TapToAddRed(this));
    }
}
