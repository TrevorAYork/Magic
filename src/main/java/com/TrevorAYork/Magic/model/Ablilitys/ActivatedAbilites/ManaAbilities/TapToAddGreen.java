package com.TrevorAYork.Magic.model.Ablilitys.ActivatedAbilites.ManaAbilities;

import com.TrevorAYork.Magic.model.CardTypes.AbstractPermanent;
import com.TrevorAYork.Magic.model.Mana.GreenMana;
import com.TrevorAYork.Magic.model.Mana.Mana;

import java.util.ArrayList;

public class TapToAddGreen extends TapToAddMana {

    public TapToAddGreen(AbstractPermanent permanent) {
        super(permanent);
        ArrayList<Mana> mana = new ArrayList<>();
        mana.add(new GreenMana());
        this.setManaToAdd(mana);
    }
}
