package com.TrevorAYork.Magic.model.CardTypes.Lands;

import com.TrevorAYork.Magic.model.Mana.ManaCost;
import com.TrevorAYork.Magic.model.Player.Player;

public class AbstractPlains extends AbstractLand implements Plains {
    public AbstractPlains(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
