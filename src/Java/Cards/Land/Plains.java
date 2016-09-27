package Java.Cards.Land;

import Java.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddWhite;
import Java.CardTypes.Lands.AbstractPlains;
import Java.Player.Player;

public class Plains extends AbstractPlains {
    public Plains(Player owner) {
        super("Plains", null, owner, owner);
        this.addAbility(new TapToAddWhite(this));
    }
}
