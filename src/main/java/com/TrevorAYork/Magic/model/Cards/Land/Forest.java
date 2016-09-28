package com.TrevorAYork.Magic.model.Cards.Land;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddGreen;
import com.TrevorAYork.Magic.model.CardTypes.Lands.AbstractForest;
import com.TrevorAYork.Magic.model.Player.Player;

public class Forest extends AbstractForest {

    public Forest(Player owner) {
        super("Forest", null, owner, owner);
        this.addAbility(new TapToAddGreen(this));
    }
}
