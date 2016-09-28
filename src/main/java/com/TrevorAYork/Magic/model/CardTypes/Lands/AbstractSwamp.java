package com.TrevorAYork.Magic.model.CardTypes.Lands;

import com.TrevorAYork.Magic.model.Mana.ManaCost;
import com.TrevorAYork.Magic.model.Player.Player;

public class AbstractSwamp extends AbstractLand implements Swamp {
    public AbstractSwamp(String name, ManaCost manaCost, Player owner, Player controller) {
        super(name, manaCost, owner, controller);
    }
}
