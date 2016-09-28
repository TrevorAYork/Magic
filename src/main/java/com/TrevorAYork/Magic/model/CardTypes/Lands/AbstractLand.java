package com.TrevorAYork.Magic.model.CardTypes.Lands;

import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.Mana.ManaCost;
import com.TrevorAYork.Magic.model.Player.Player;

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
