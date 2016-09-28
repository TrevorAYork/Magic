package com.TrevorAYork.Magic.model.Cards.Land;

import com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities.TapToAddGreen;
import com.TrevorAYork.Magic.model.CardTypes.Creatures.AbstractCreatureLand;
import com.TrevorAYork.Magic.model.Player.Player;

public class DryadArbor extends AbstractCreatureLand implements com.TrevorAYork.Magic.model.CardTypes.Lands.Forest {

    public DryadArbor(Player owner){
        super("Dryad Arbor", null, 1, 1, owner, owner);
        this.addAbility(new TapToAddGreen(this));
    }
}
