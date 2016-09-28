package com.TrevorAYork.Magic.model.Cards.Land;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddWhite;
import com.TrevorAYork.Magic.model.CardTypes.Lands.AbstractPlains;
import com.TrevorAYork.Magic.model.Player.Player;

public class Plains extends AbstractPlains {
    public Plains(Player owner) {
        super("Plains", null, owner, owner);
        this.addAbility(new TapToAddWhite(this));
    }
}
