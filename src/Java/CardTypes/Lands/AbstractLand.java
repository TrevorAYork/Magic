package Java.CardTypes.Lands;

import Java.CardTypes.AbstractPermanent;
import Java.CardTypes.Permanent;
import Java.Mana.Mana;
import Java.Mana.ManaCost;
import Java.Player.Player;

public abstract class AbstractLand extends AbstractPermanent implements Land {

    protected ManaCost manaCost;

    public AbstractLand(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }

    public void setManaCost(ManaCost convertedManaCost) {
        this.manaCost = convertedManaCost;
    }

    public ManaCost getManaCost() {
        return manaCost;
    }
}
