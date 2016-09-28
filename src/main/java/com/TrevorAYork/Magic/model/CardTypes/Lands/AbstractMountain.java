package com.TrevorAYork.Magic.model.CardTypes.Lands;

import com.TrevorAYork.Magic.model.Mana.ManaCost;
import com.TrevorAYork.Magic.model.Player.Player;

public class AbstractMountain extends AbstractLand implements Mountain {
    public AbstractMountain(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
