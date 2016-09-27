package Java.Cards.Land;

import Java.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddRed;
import Java.CardTypes.Lands.AbstractMountain;
import Java.Player.Player;

public class Mountain extends AbstractMountain {
    public Mountain(Player owner) {
        super("Mountain", null, owner, owner);
        this.addAbility(new TapToAddRed(this));
    }
}
