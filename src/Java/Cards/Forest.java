package Java.Cards;

import Java.Ablilitys.TapToAddGreen;
import Java.CardTypes.Lands.AbstractForest;
import Java.Player.Player;

public class Forest extends AbstractForest {

    public Forest(Player owner) {
        super("Forest", null, owner, owner);
        this.addAbility(new TapToAddGreen(this));
    }
}
