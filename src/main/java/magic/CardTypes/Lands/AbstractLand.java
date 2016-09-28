package magic.CardTypes.Lands;

import magic.CardTypes.AbstractPermanent;
import magic.Mana.ManaCost;
import magic.Player.Player;

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
