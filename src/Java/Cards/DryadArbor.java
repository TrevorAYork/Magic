package Java.Cards;

import Java.Ablilitys.TapToAddGreen;
import Java.CardTypes.Creatures.AbstractCreatureLand;
import Java.CardTypes.Lands.Forest;
import Java.Mana.GreenMana;
import Java.Player.Player;

public class DryadArbor extends AbstractCreatureLand implements Forest {

    public DryadArbor(Player owner){
        super("Dryad Arbor", null, 1, 1, owner, owner);
        this.addAbility(new TapToAddGreen(this));
    }
}
