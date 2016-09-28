package magic.Cards.Land;

import magic.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddGreen;
import magic.CardTypes.Creatures.AbstractCreatureLand;
import magic.Player.Player;

public class DryadArbor extends AbstractCreatureLand implements magic.CardTypes.Lands.Forest {

    public DryadArbor(Player owner){
        super("Dryad Arbor", null, 1, 1, owner, owner);
        this.addAbility(new TapToAddGreen(this));
    }
}
