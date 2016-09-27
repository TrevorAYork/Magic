package Java.Cards.Land;

import Java.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddBlack;
import Java.CardTypes.Lands.AbstractSwamp;
import Java.Player.Player;

public class Swamp extends AbstractSwamp {
    public Swamp(Player owner) {
        super("Swamp", null, owner, owner);
        this.addAbility(new TapToAddBlack(this));
    }
}
