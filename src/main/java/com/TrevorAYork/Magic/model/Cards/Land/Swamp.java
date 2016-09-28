package com.TrevorAYork.Magic.model.Cards.Land;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddBlack;
import com.TrevorAYork.Magic.model.CardTypes.Lands.AbstractSwamp;
import com.TrevorAYork.Magic.model.Player.Player;

public class Swamp extends AbstractSwamp {
    public Swamp(Player owner) {
        super("Swamp", null, owner, owner);
        this.addAbility(new TapToAddBlack(this));
    }
}
