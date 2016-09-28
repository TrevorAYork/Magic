package com.TrevorAYork.Magic.model.Cards.Land;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddRed;
import com.TrevorAYork.Magic.model.CardTypes.Lands.AbstractMountain;
import com.TrevorAYork.Magic.model.Player.Player;

public class Mountain extends AbstractMountain {
    public Mountain(Player owner) {
        super("Mountain", null, owner, owner);
        this.addAbility(new TapToAddRed(this));
    }
}
