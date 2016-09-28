package com.TrevorAYork.Magic.model.Cards.Land;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddBlue;
import com.TrevorAYork.Magic.model.CardTypes.Lands.AbstractIsland;
import com.TrevorAYork.Magic.model.Player.Player;

public class Island extends AbstractIsland {
    public Island(Player owner) {
        super("Island", null, owner, owner);
        this.addAbility(new TapToAddBlue(this));
    }
}
