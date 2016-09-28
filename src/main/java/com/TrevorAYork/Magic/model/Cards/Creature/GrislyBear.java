package com.TrevorAYork.Magic.model.Cards.Creature;

import com.TrevorAYork.Magic.model.CardTypes.Creatures.AbstractCreature;
import com.TrevorAYork.Magic.model.Mana.ManaCostBuilder;
import com.TrevorAYork.Magic.model.Player.Player;

public class GrislyBear extends AbstractCreature {

    public GrislyBear(Player owner) {
        super("Grisly Bear", ManaCostBuilder.build("1G"), 2, 2, owner, owner);
    }
}
