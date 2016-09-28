package com.TrevorAYork.Magic.model.CardTypes.Creatures;

import com.TrevorAYork.Magic.model.CardTypes.Lands.Land;
import com.TrevorAYork.Magic.model.Mana.ManaCost;
import com.TrevorAYork.Magic.model.Player.Player;

public abstract class AbstractCreatureLand extends AbstractCreature implements Land {

    public AbstractCreatureLand(String name, ManaCost manaCost, int power, int toughness, Player owner, Player controller) {
        super(name, manaCost, power, toughness, owner, controller);
    }
}
