package magic.Cards.Land;

import magic.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddGreen;
import magic.CardTypes.Lands.AbstractForest;
import magic.Player.Player;

public class Forest extends AbstractForest {

    public Forest(Player owner) {
        super("Forest", null, owner, owner);
        this.addAbility(new TapToAddGreen(this));
    }
}
